package io.github.aradoryin.battlemage.datagen.client;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
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
	
	private ItemModelBuilder simpleItem(Item item)
	{
		return withExistingParent(item.getRegistryName().getPath(), 
				new ResourceLocation("item/generated")).texture("layer0", 
						new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getRegistryName().getPath()));
	}
	
	private ItemModelBuilder handheldItem(Item item)
	{
		return withExistingParent(item.getRegistryName().getPath(), 
				new ResourceLocation("item/handheld")).texture("layer0", 
						new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getRegistryName().getPath()));
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
		
		//STONE
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_BRICKS.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_BUTTON.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_GATE.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_SLAB.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_STAIRS.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_STONE_WALL.get().asItem());
		
		//WOOD
//		simpleBlockItem(BlockInit.AETHER_INFUSED_LEAVES.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_SAPLING.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_DOOR.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_FENCE.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_LOG.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_PLANK.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_SLAB.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get().asItem());
//		simpleBlockItem(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get().asItem());
		
		
		//EXAMPLE ITEMS
		simpleItem(ItemInit.EXAMPLE_ITEM.get());
		
		//ITEM GEM
		simpleItem(ItemInit.ONYX.get());
		simpleItem(ItemInit.RUBY.get());
		simpleItem(ItemInit.SAPPHIRE.get());
		simpleItem(ItemInit.TIGERS_EYE.get());
		
		//ITEM ELEMENTAL CORE
		simpleItem(ItemInit.CORRUPTION_CORE.get());
		simpleItem(ItemInit.DELIRIUM_CORE.get());
		simpleItem(ItemInit.EARTH_CORE.get());
		simpleItem(ItemInit.FIRE_CORE.get());
		simpleItem(ItemInit.ICE_CORE.get());
		simpleItem(ItemInit.KINESIS_CORE.get());
		simpleItem(ItemInit.LIGHTNING_CORE.get());
		simpleItem(ItemInit.NECROMANCY_CORE.get());
		simpleItem(ItemInit.PHASE_CORE.get());
		
		//ITEM ELEMENTAL CORE ENGRAVED GEM
		simpleItem(ItemInit.FIRE_ENGRAVED_RUBY.get());
		simpleItem(ItemInit.FIRE_ENGRAVED_EMERALD.get());
		simpleItem(ItemInit.FIRE_ENGRAVED_SAPPHIRE.get());
		
		//ITEM ENGRAVING
//		simpleItem(ItemInit.AETHER_INFUSED_STONE_POWDER.get());
		simpleItem(ItemInit.AETHER_INFUSED_TABLET.get());
//		simpleItem(ItemInit.AOE_RUNE_TABLET.get());
		simpleItem(ItemInit.BRACER.get());
//		simpleItem(ItemInit.COPPER_POWDER.get());
//		simpleItem(ItemInit.DASH_RUNE_TABLET.get());
		simpleItem(ItemInit.GOLD_POWDER.get());
		simpleItem(ItemInit.ICE_POWDER.get());
		simpleItem(ItemInit.IRON_POWDER.get());
//		simpleItem(ItemInit.LOBBED_RUNE_TABLET.get());
		simpleItem(ItemInit.NETHERITE_POWDER.get());
//		simpleItem(ItemInit.POOL_RUNE_TABLET.get());
//		simpleItem(ItemInit.RAY_RUNE_TABLET.get());
		simpleItem(ItemInit.RUNE_TABLET.get());
//		simpleItem(ItemInit.RUNIC_AETHER_INFUSED_TABLET.get());
//		simpleItem(ItemInit.RUNIC_STONE_TABLET.get());
//		simpleItem(ItemInit.SHIELD_RUNE_TABLET.get());
//		simpleItem(ItemInit.STONE_POWDER.get());
		simpleItem(ItemInit.STONE_TABLET.get());
//		simpleItem(ItemInit.TARGETED_RUNE_TABLET.get());
//		simpleItem(ItemInit.TRAP_RUNE_TABLET.get());
//		simpleItem(ItemInit.WITHER_BONE_POWDER.get());
		
		//ITEM
//		simpleItem(ItemInit.AETHER_FRUIT.get());
//		simpleItem(ItemInit.WITHER_BONE.get());
	}
	
}
