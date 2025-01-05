package de.rafaelo83.zva.item.adv;

import de.rafaelo83.zva.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class BigHammerItem extends Item {
    public BigHammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos hitPos = new BlockPos(context.getBlockPos());
        BlockState hitState = context.getWorld().getBlockState(hitPos);
        Block hitBlock = hitState.getBlock();

        if(hitBlock == Blocks.ANVIL
                && context.getPlayer().getOffHandStack().isOf(ModItems.BIG_HAMMER)
                && context.getPlayer().getMainHandStack().isOf(Items.IRON_INGOT)) {

                context.getPlayer().getMainHandStack().decrement(1);
                context.getPlayer().getInventory().insertStack(new ItemStack(ModItems.SPARE_BLADE));

                context.getWorld().playSound(hitPos.getX(), hitPos.getY(), hitPos.getZ(), SoundEvents.BLOCK_ANVIL_USE, SoundCategory.BLOCKS, 3f, 1f, true);

                return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addVelocity(attacker.getRotationVec(0));

        return super.postHit(stack, target, attacker);
    }
}
