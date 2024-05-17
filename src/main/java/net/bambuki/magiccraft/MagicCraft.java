package net.bambuki.magiccraft;

import net.bambuki.magiccraft.block.ModBlocks;
import net.bambuki.magiccraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicCraft implements ModInitializer {

	public static final String MOD_ID = "magiccraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override

	public void onInitialize() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANDRAGORA_CROP, RenderLayer.getCutout());
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}