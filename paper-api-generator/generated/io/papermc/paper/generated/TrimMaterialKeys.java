package io.papermc.paper.generated;

import static net.kyori.adventure.key.Key.key;

import io.papermc.paper.registry.TypedKey;
import net.kyori.adventure.key.Key;
import org.bukkit.MinecraftExperimental;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for {@link TrimMaterial}.
 */
@SuppressWarnings({
        "unused",
        "SpellCheckingInspection"
})
@GeneratedFrom("1.19.4")
@ApiStatus.Experimental
@MinecraftExperimental
public final class TrimMaterialKeys {
    /**
     * {@code minecraft:amethyst}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> AMETHYST = create(key("amethyst"));

    /**
     * {@code minecraft:copper}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> COPPER = create(key("copper"));

    /**
     * {@code minecraft:diamond}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> DIAMOND = create(key("diamond"));

    /**
     * {@code minecraft:emerald}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> EMERALD = create(key("emerald"));

    /**
     * {@code minecraft:gold}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> GOLD = create(key("gold"));

    /**
     * {@code minecraft:iron}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> IRON = create(key("iron"));

    /**
     * {@code minecraft:lapis}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> LAPIS = create(key("lapis"));

    /**
     * {@code minecraft:netherite}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> NETHERITE = create(key("netherite"));

    /**
     * {@code minecraft:quartz}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> QUARTZ = create(key("quartz"));

    /**
     * {@code minecraft:redstone}
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static final TypedKey<TrimMaterial> REDSTONE = create(key("redstone"));

    private TrimMaterialKeys() {
    }

    /**
     * Creates a typed key for {@link TrimMaterial}.
     *
     * @param key the key for the object
     * @returns a new typed key
     */
    @ApiStatus.Experimental
    @MinecraftExperimental
    public static @NotNull TypedKey<TrimMaterial> create(final @NotNull Key key) {
        return TypedKey.create(key/*, <insert registry key here from reg mod API> */);
    }
}
