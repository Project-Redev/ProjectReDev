package net.roadkill.redev.platform;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import java.util.function.BiConsumer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class PlatformRegistry<R extends Registry<T>, K extends ResourceKey<R>, T> {

  /**
   * The vanilla Registry.
   */
  public abstract R getRegistry();

  /**
   * The vanilla ResourceKey.
   */
  public abstract K getResourceKey();

  protected final Map<ResourceLocation, T> queue = new HashMap<>();

  /**
   * Creates a new entry in this registry.
   *
   * @param name The name of the entry, this will be an ResourceLocation.path.
   * @param entry The entry being added.
   * @param <E> The type of the entry.
   * @return The entry created.
   */
  public <E extends T> E create(String name, E entry) {
    ResourceLocation resourceLocation = redevResource(name);
    return this.create(resourceLocation, entry);
  }

  /**
   * Creates a new entry in this registry. Introduced for sidemod usage
   *
   * @param resourceLocation The name of the entry, this will be an ResourceLocation.path.
   * @param entry The entry being added.
   * @param <E> The type of the entry.
   * @return The entry created.
   */
  public <E extends T> E create(ResourceLocation resourceLocation, E entry) {
    this.queue.put(resourceLocation, entry);
    return entry;
  }

  /**
   * Handles the registration of this registry into the platform specific one.
   *
   * @param consumer The consumer that will handle the logic for registering every entry in this registry into the platform specific one.
   */
  public void register(BiConsumer<ResourceLocation, T> consumer) {
    this.queue.forEach(consumer);
  }

  /**
   * Returns a collection of every entry in this registry.
   *
   * @return The entries of this registry.
   */
  public Collection<T> all() {
    return this.queue.values();
  }
}