package net.bambuki.magiccraft.world.feature;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> BLUE_SAPPHIRES_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLUE_SAPPHIRES_ORE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> GREEN_EMERALDS_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GREEN_EMERALDS_ORE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> SCARLET_RUBIES_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SCARLET_RUBIES_ORE.getDefaultState())
    );
    public static final List<OreFeatureConfig.Target> YELLOW_DIAMONDS_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YELLOW_DIAMONDS_ORE.getDefaultState())
    );
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ? >> BLUE_SAPPHIRES_ORE =
            ConfiguredFeatures.register("blue_sapphires_ore", Feature.ORE, new OreFeatureConfig(BLUE_SAPPHIRES_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ? >> GREEN_EMERALDS_ORE =
            ConfiguredFeatures.register("green_emeralds_ore", Feature.ORE, new OreFeatureConfig(GREEN_EMERALDS_ORES, 12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ? >> SCARLET_RUBIES_ORE =
            ConfiguredFeatures.register("scarlet_rubies_ore", Feature.ORE, new OreFeatureConfig(SCARLET_RUBIES_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ? >> YELLOW_DIAMONDS_ORE =
            ConfiguredFeatures.register("yellow_diamonds_ore", Feature.ORE, new OreFeatureConfig(YELLOW_DIAMONDS_ORES, 12));
    public static void registerConfiguredFeatures(){
        MagicCraft.LOGGER.debug("Registering the ModConfiguredFeatures for" + MagicCraft.MOD_ID);
    }
}
