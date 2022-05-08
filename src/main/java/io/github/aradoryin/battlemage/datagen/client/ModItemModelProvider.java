package io.github.aradoryin.battlemage.datagen.client;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{

	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper)
	{
		super(generator, Battlemage.MOD_ID, helper);
	}
	
	protected void simpleBlockItem(Item item)
	{
		getBuilder(item.getRegistryName().toString()).parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
	}
	
	protected void oneLayerItem(Item item, ResourceLocation texture)
	{
		ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
		if(existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures"))
		{
			getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", itemTexture);
		} else {
			System.out.println("Texture for " + item.getRegistryName().toString() + " not present at " + itemTexture.toString());
		}
	}
	
	protected void oneLayerItem(Item item)
	{
		oneLayerItem(item, item.getRegistryName());
	}

	@Override
	protected void registerModels()
	{
		//Block Items
		//EXAMPLE BLOCKS
		simpleBlockItem(BlockInit.EXAMPLE_BLOCK.get().asItem());
		simpleBlockItem(BlockInit.EXAMPLE_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem());
		
		//BLOCK
		simpleBlockItem(BlockInit.ONYX_BLOCK.get().asItem());
		simpleBlockItem(BlockInit.RUBY_BLOCK.get().asItem());
		simpleBlockItem(BlockInit.SAPPHIRE_BLOCK.get().asItem());
		simpleBlockItem(BlockInit.TIGERS_EYE_BLOCK.get().asItem());
		
		//ORE
		simpleBlockItem(BlockInit.ONYX_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_ONYX_ORE.get().asItem());
		simpleBlockItem(BlockInit.RUBY_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem());
		simpleBlockItem(BlockInit.SAPPHIRE_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().asItem());
		simpleBlockItem(BlockInit.TIGERS_EYE_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get().asItem());
		
		
		//Simple Items
		//EXAMPLE ITEMS
		oneLayerItem(ItemInit.EXAMPLE_ITEM.get());
		
		//ITEM GEM
		oneLayerItem(ItemInit.RUBY.get());
		oneLayerItem(ItemInit.ONYX.get());
		oneLayerItem(ItemInit.SAPPHIRE.get());
		oneLayerItem(ItemInit.TIGERS_EYE.get());
		
		//ITEM ELEMENTAL CORE
		oneLayerItem(ItemInit.FIRE_CORE.get());
		oneLayerItem(ItemInit.ICE_CORE.get());
		oneLayerItem(ItemInit.PHASE_CORE.get());
		oneLayerItem(ItemInit.EARTH_CORE.get());
		oneLayerItem(ItemInit.KINESIS_CORE.get());
		oneLayerItem(ItemInit.DELIRIUM_CORE.get());
		oneLayerItem(ItemInit.LIGHTNING_CORE.get());
		oneLayerItem(ItemInit.CORRUPTION_CORE.get());
		oneLayerItem(ItemInit.NECROMANCY_CORE.get());
		
		//ITEM ELEMENTAL CORE ENGRAVED GEM
		oneLayerItem(ItemInit.FIRE_ENGRAVED_RUBY.get());
		oneLayerItem(ItemInit.FIRE_ENGRAVED_EMERALD.get());
		oneLayerItem(ItemInit.FIRE_ENGRAVED_SAPPHIRE.get());
		
		//ITEM ENGRAVING
		oneLayerItem(ItemInit.IRON_POWDER.get());
		oneLayerItem(ItemInit.ICE_POWDER.get());
		oneLayerItem(ItemInit.GOLD_POWDER.get());
		oneLayerItem(ItemInit.NETHERITE_POWDER.get());
		
		//ITEM
		oneLayerItem(ItemInit.STONE_TABLET.get());
		oneLayerItem(ItemInit.AETHER_INFUSED_TABLET.get());
	}

	
	
}
