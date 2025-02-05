package net.roadkill.redev;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;

public class ReDevSounds {

  public static DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ReDev.MOD_ID, Registries.SOUND_EVENT);

  public static final SoundType PETRIFIED_PLANKS = new SoundType(1.0F, 0.9F, SoundEvents.DECORATED_POT_FALL, SoundEvents.DECORATED_POT_STEP, SoundEvents.DECORATED_POT_FALL, SoundEvents.DECORATED_POT_HIT, SoundEvents.DECORATED_POT_PLACE);
  public static final SoundType PETRIFIED_LOG = new SoundType(1.0F, 0.65f, SoundEvents.GILDED_BLACKSTONE_BREAK, SoundEvents.DECORATED_POT_STEP, SoundEvents.GILDED_BLACKSTONE_PLACE, SoundEvents.DECORATED_POT_HIT, SoundEvents.DECORATED_POT_PLACE);

  public static final RegistrySupplier<SoundEvent> PETRIFIED_DOOR_OPEN = sound("block.petrified_door.open", SoundEvent.createVariableRangeEvent(
      redevResource("block.petrified_door.open")));
  public static final RegistrySupplier<SoundEvent> PETRIFIED_DOOR_CLOSE = sound("block.petrified_door.close", SoundEvent.createVariableRangeEvent(redevResource("block.petrified_door.close")));

  public static final RegistrySupplier<SoundEvent> LITHICAN_AMBIENT = sound("entity.lithican.ambient", SoundEvent.createVariableRangeEvent(redevResource("entity.lithican.ambient")));
  public static final RegistrySupplier<SoundEvent> LITHICAN_HURT = sound("entity.lithican.hurt", SoundEvent.createVariableRangeEvent(redevResource("entity.lithican.hurt")));
  public static final RegistrySupplier<SoundEvent> LITHICAN_DEATH = sound("entity.lithican.death", SoundEvent.createVariableRangeEvent(redevResource("entity.lithican.death")));
  public static final RegistrySupplier<SoundEvent> LITHICAN_AWAKEN = sound("entity.lithican.awaken", SoundEvent.createVariableRangeEvent(redevResource("entity.lithican.awaken")));

  public static RegistrySupplier<SoundEvent> sound(String name, SoundEvent soundEvent) {
    return SOUNDS.register(name, () -> soundEvent);
  }

}