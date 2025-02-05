package net.roadkill.redev.entity;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.roadkill.redev.entity.goal.FlamethrowerGoal;
import net.roadkill.redev.entity.goal.RamTargetGoal;
import net.roadkill.redev.entity.goal.ShieldGoal;
import net.roadkill.redev.util.RDMath;

public class HoveringInfernoEntity extends Blaze
{
    private static final EntityDataAccessor<Float> SHIELD_ROTATION_SPEED = SynchedEntityData.defineId(HoveringInfernoEntity.class, EntityDataSerializers.FLOAT);
    private static final EntityDataAccessor<Integer> ATTACK_PHASE = SynchedEntityData.defineId(HoveringInfernoEntity.class, EntityDataSerializers.INT);

    // Used clientside for shield rotation animations
    public float shieldYRot = 0f;
    public float shieldRotationSpeed = 0f;
    public boolean hurtAnimation = false;

    private int attackCooldown = 0;
    private int nextHeightOffsetChangeTick;
    private float allowedHeightOffset = 1f;

    public HoveringInfernoEntity(EntityType<? extends Blaze> type, Level level)
    {   super(type, level);
        this.setShieldRotationSpeed(1f);
    }

    public static AttributeSupplier.Builder createAttributes()
    {   return Blaze.createAttributes().add(Attributes.ATTACK_DAMAGE, 8.0D).add(Attributes.MAX_HEALTH, 40.0D).add(Attributes.ARMOR, 6d);
    }

    @Override
    protected void registerGoals() {
        // TODO fix this
        super.registerGoals();
        this.goalSelector.addGoal(6, new ShieldGoal(this));
        this.goalSelector.addGoal(6, new FlamethrowerGoal(this));
        this.goalSelector.addGoal(6, new RamTargetGoal(this));
        //this.goalSelector.removeAllGoals(goal -> goal instanceof BlazeAttackGoal);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder)
    {
        super.defineSynchedData(builder);
        builder.define(SHIELD_ROTATION_SPEED, 0f);
        builder.define(ATTACK_PHASE, 0);
    }

    @Override
    public void tick()
    {
        // TODO fix this
        super.tick();
        this.attackCooldown = Math.max(0, this.attackCooldown - 1);
        // move to a random location when hovering
        if (!this.onGround() && this.getRandom().nextInt(20) == 0 && this.getTarget() != null)
        {
            //Vec3 movement = new Vec3(RDMath.randomDouble(this.getRandom(), -1, 1),
            //                         0,
            //                         RDMath.randomDouble(this.getRandom(), -1, 1)).normalize().scale(0.35f);

            // if the entity is more than 15 blocks away, adjust the movement vector to move towards the target
            if (this.distanceTo(this.getTarget()) > 15)
            {   Vec3 targetDirection = this.getTarget().position().subtract(this.position()).normalize();
                //while (Math.abs(movement.normalize().dot(targetDirection)) < 0.707)
                //{   movement = movement.add(targetDirection.scale(0.1f));
                //}
            }

            //this.setDeltaMovement(this.getDeltaMovement().add(movement));
        }

        if (this.getTarget() != null)
        {   this.lookAt(this.getTarget(), 360, 360);
            this.yBodyRot = this.yHeadRot;
        }
    }

    @Override
    protected void customServerAiStep(ServerLevel level)
    {
        --this.nextHeightOffsetChangeTick;
        if (this.nextHeightOffsetChangeTick <= 0)
        {   this.nextHeightOffsetChangeTick = 40;
            this.allowedHeightOffset = (float) this.random.triangle(1D, 8D);
        }

        LivingEntity livingentity = this.getTarget();
        if (livingentity != null && this.getEyeY() < livingentity.getEyeY() + this.allowedHeightOffset
        && this.canAttack(livingentity))
        {
            Vec3 vec3 = this.getDeltaMovement();
            this.setDeltaMovement(this.getDeltaMovement().add(0.0D, (0.3 - vec3.y) * 0.5, 0.0D));
            this.hasImpulse = true;
        }
    }

    @Override
    public boolean hurtServer(ServerLevel level, DamageSource source, float amount)
    {
        if (this.isDamageBlocked(source)) {
            // TODO fix this
            this.playSound(SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, 1.0F, RDMath.randomFloat(this.getRandom(), 0.7f, 1f));
            return false;
        }
        return super.hurtServer(level, source, amount);
    }

    @Override
    public void handleDamageEvent(DamageSource source)
    {   this.shieldRotationSpeed = 10f;
        this.hurtAnimation = true;
        super.handleDamageEvent(source);
    }

    public boolean isDamageBlocked(DamageSource source)
    {   return this.getAttackPhase() == AttackPhase.BLOCKING && !source.is(DamageTypeTags.BYPASSES_SHIELD) && !source.isCreativePlayer();
    }

    @Override
    public boolean isInvulnerableTo(ServerLevel level, DamageSource source)
    {   return this.isDamageBlocked(source) || source.is(DamageTypeTags.IS_FIRE) || super.isInvulnerableTo(level, source);
    }

    @Override
    public double getEyeY()
    {   return this.getY() + 2.49f;
    }

    @Override
    public boolean isOnFire()
    {   return super.isOnFire() || this.getAttackPhase() == AttackPhase.FLAMETHROWER;
    }

    @Override
    public int getMaxHeadYRot()
    {   return 0;
    }

    public int getAttackCooldown()
    {   return this.attackCooldown;
    }

    public void setAttackCooldown(int cooldown)
    {   this.attackCooldown = cooldown;
    }

    public void setRandomAttackCooldown()
    {   this.attackCooldown = this.getRandom().nextIntBetweenInclusive(5, 40);
    }

    public void setRandomAttackCooldown(int min, int max)
    {   this.attackCooldown = this.getRandom().nextIntBetweenInclusive(min, max);
    }

    public float getShieldRotationSpeed()
    {   return this.entityData.get(SHIELD_ROTATION_SPEED);
    }

    public void setShieldRotationSpeed(float speed)
    {   this.entityData.set(SHIELD_ROTATION_SPEED, speed);
    }

    public AttackPhase getAttackPhase()
    {   return AttackPhase.values()[this.entityData.get(ATTACK_PHASE)];
    }

    public void setAttackPhase(AttackPhase phase)
    {
        this.entityData.set(ATTACK_PHASE, phase.ordinal());
        switch (phase)
        {
            case BLOCKING -> this.setShieldRotationSpeed(0.5f);
            case FLAMETHROWER -> this.setShieldRotationSpeed(8f);
            case SHOOTING -> this.setShieldRotationSpeed(0.5f);
            case NONE -> this.setShieldRotationSpeed(1f);
        }
    }

    public enum AttackPhase
    {
        NONE,
        BLOCKING,
        FLAMETHROWER,
        SHOOTING
    }
}
