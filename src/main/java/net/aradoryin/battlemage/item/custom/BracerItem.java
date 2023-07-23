package net.aradoryin.battlemage.item.custom;

import net.aradoryin.battlemage.particles.ModParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import org.apache.logging.log4j.core.jmx.Server;

public class BracerItem extends Item {
    public BracerItem(Properties properties) {
        super(properties);
    }

    /*
    TODO: Implement functionality for Right Click, Left Click, and Left+Right Click
    Right Click Functionality: Shield Spell
    Left Click Functionality: Any Target Spell
    Left+Right Click Functionality: Any AoE Spell
    I wonder if custom methods would work for the above or how best to implement them using standard methods.
    TODO: Add in Spell functionalities
    The above includes particles and spell entities.
     */

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(!context.getLevel().isClientSide()) {
            BlockPos positionClicked = context.getClickedPos();
            Player player = context.getPlayer();

            /*
            TODO: Implement the Shield Particles to not rely on block positions
             */
            spawnFoundParticles(context, positionClicked); // For Shield Particles
        }

        return InteractionResult.CONSUME;
    }

    private void spawnFoundParticles(UseOnContext context, BlockPos positionClicked) {
        for(int i = 0; i < 20; i++) {
            ServerLevel level = (ServerLevel) context.getLevel();

            level.sendParticles(ModParticles.SHIELD_PARTICLES.get(),
                    positionClicked.getX() + 0.5d, positionClicked.getY() + 1, positionClicked.getZ() + 0.5d, 1,
                    Math.cos(i * 18) * 0.15d, 0.15d, Math.sin(i * 18) * 0.15d, 0.1);
        }
    }
}
