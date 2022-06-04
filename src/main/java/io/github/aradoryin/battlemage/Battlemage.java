package io.github.aradoryin.battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Battlemage.MOD_ID)
public class Battlemage 
{
	
	/*
	 * Description: Destruction is the Spell's Intensity. For Shield, that means how much "HP" your Shield has. 
	 * In Targeted spells, it means direct damage. Etc. It could be renamed "Intensity" so it's easier to understand.
	 * 
	 * Description: This determines how well you control the "Shape" of your Spell. So this means the general 
	 * characteristics of Targeted Spells, Shield, Barrier and AOE. Things like area, speed of projectile, and things 
	 * of that nature fall in here.
	 * 
	 * Description: This determines how well you've mastered a particular school of magic. With fire, that means 
	 * damage over time. With ice, that means freezing or slowing down enemies. (I think this affects Critical chance, 
	 * which give you the status effects when you charge an attack.)
	 * 
	 * What's a Spell and what's a Sigil? Well, a Spell is an active effect, while a Sigil is a passive effect. Shield 
	 * is an example of a Sigil, while Firestorm might be an example of Spell.
	 * 
	 * Here's where this game's ingenuity shines more than anywhere else. When you defeat a monster, or destroy one of 
	 * those orange egg/nest/swarm things, you'll be rewarded with an item. You can also be rewarded for finding 
	 * scrolls, checking out those weird-looking rifts (the long purple and black things, that cause you to see purple 
	 * holograms and wonder "is this real life?"), or going to those pinkish-red areas with bones or the remains of 
	 * less-fortunate characters (or NPCs).
	 * 
	 * When you're going to Synthesize an item, you have three main types of Shapes (plus the Shield shape), and 
	 * three main types of Augments.
	 * 
	 * Shapes - Targeted, AOE, Barrier, Shield (Barrier is NOT the same as shield)
	 * Augments - Control, Mastery and Destruction
	 * 
	 * Items also come in several rarity levels. You've got Common (white), uncommon (green), rare (blue), epic (purple), 
	 * and legendary (color unknown to me so far). These indicate how valuable or powerful an item is.
	 * 
	 * 3x Common (white) => 1x Uncommon (green)
	 * 3x Uncommon (green) => 1x Rare (blue)
	 * 3x Rare (blue) => 1x Epic (purple)
	 * 3x Epic (purple) => 1x Legendary (orange)
	 * 
	 * (Three Legendary items, as I've found out the hard way, don't make anything better. They just give you a concussion 
	 * once you realize what you've done, and they have about an 80% chance to dent your desk or flatten your keyboard. 
	 * Why is it 80% chance? Because if it takes you 3 out of 4 times to realize your mistake, you'll end up slamming your 
	 * face against the desk a fourth time because you didn't realize just how stupid what you were doing really was.)
	 * 
	 * When synthesizing, try to synthesize three items of the same rarity type, and of the same sub-type. Example: If you 
	 * synthesize 3x Control Augment (common rarity), you can get either an Uncommon Shape (random) or an Uncommon Control 
	 * Augment.
	 * 
	 * However, you can also synthesize three different Augments of the same rarity, in which case you'll get either a 
	 * random Augment or a random Shape of one rarity level above. Example: If you Synthesize 2x Uncommon Targeted Shape 
	 * and 1x Uncommon Barrier Shape, you can get either a Rare Shape or a Rare Augment.
	 * 
	 * You can also synthesize a Spell (that's been crafted), an Augment and a Shape - but you'll get a random item.
	 * 
	 * You can also get a Legendary Item, and synthesize it with two Epic of the same type, to get a new Legendary Item. 
	 * That could be helpful if, for example, you wanted a different Shape than the one you have. (Note: I haven't done 
	 * this myself, only seen the previews.)
	 * 
	 * Overall, save up your items, and synthesize items so you can get the items you want. Saving Destruction Augments and 
	 * Targeted Shapes can be one of the more awesome things you do, especially if you can get a really nice Homing Targeted 
	 * Shape (which allows you to be less precise when aiming, and can help you even if you enemy moves out of the way from 
	 * where the spell was going). This is especially nice when trying to use crowd control to slow down or freeze that 
	 * ranged enemy, and then get up close and personal to finish (and ditch the mob of close-quarter enemies that are 
	 * probably surrounding you right about now).
	 * 
	 * And for the holy gourd's sake, save your Shield Patterns. You'll want to use them, trust me. And ditch the 
	 * "Quick" shields, because they may be quick, but they break easily. You're better off with more HP in your Shield, 
	 * since sometimes you can't avoid getting hit when there are too many enemies. If you've got a Quick Shield pattern, 
	 * try to use it later to Synthesize another Shield of a better rarity, but don't feel afraid to toss it in with two 
	 * other Shapes to get a more useful Shape of another kind - and yes, it's that bad.
	 * 
	 * NOTE: Thanks to joshuawhere and his amazing guide (check the bottom section), he mentioned that some items will have 
	 * more slots. Never mix items of more slots with those of fewer slots, because you'll end up with the lowest number of 
	 * slots of any item Synthesized. More slots = More good.
	 */
	
	public static final String MOD_ID = "battlemage";

	public static final CreativeModeTab BATTLEMAGE_TAB = new CreativeModeTab(MOD_ID)
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon()
		{
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public Battlemage()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
