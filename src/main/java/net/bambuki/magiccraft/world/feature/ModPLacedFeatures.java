package net.bambuki.magiccraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


public class ModPLacedFeatures {
    public static final RegistryEntry<PlacedFeature> BLUE_SAPPHIRES_ORE_PLACED = PlacedFeatures.register("blue_sapphires_ore_placed",
            ModConfiguredFeatures.BLUE_SAPPHIRES_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> GREEN_EMERALDS_ORE_PLACED = PlacedFeatures.register("green_emeralds_ore_placed",
            ModConfiguredFeatures.GREEN_EMERALDS_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> SCARLET_RUBIES_ORE_PLACED = PlacedFeatures.register("scarlet_rubies_ore_placed",
            ModConfiguredFeatures.SCARLET_RUBIES_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> YELLOW_DIAMONDS_ORE_PLACED = PlacedFeatures.register("yellow_diamonds_ore_placed",
            ModConfiguredFeatures.YELLOW_DIAMONDS_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
