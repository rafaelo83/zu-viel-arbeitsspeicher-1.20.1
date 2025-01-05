package de.rafaelo83.zva.item.adv;

import de.rafaelo83.zva.item.ModItems;
import de.rafaelo83.zva.util.ModDamageTypes;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HiddenKnifeItem extends Item {
    public HiddenKnifeItem(Settings settings) {
        super(settings.maxCount(1).rarity(Rarity.UNCOMMON));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.zva.hidden_knife"));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        World world = user.getWorld();

        if ((user.getMainHandStack().isOf(ModItems.HIDDEN_KNIFE) || user.getOffHandStack().isOf(ModItems.HIDDEN_KNIFE)) && !user.getItemCooldownManager().isCoolingDown(ModItems.HIDDEN_KNIFE)) {
            if (user.getMainHandStack().isOf(ModItems.HIDDEN_KNIFE) && user.getOffHandStack().isOf(ModItems.HIDDEN_KNIFE)) {
                entity.damage(ModDamageTypes.of(world, ModDamageTypes.ASSASSINATION_DAMAGE_TYPE), 20);
                user.getItemCooldownManager().set(this, 600);
                return ActionResult.PASS;
            } else if (user.getMainHandStack().isOf(ModItems.HIDDEN_KNIFE) || user.getOffHandStack().isOf(ModItems.HIDDEN_KNIFE)) {
                entity.damage(ModDamageTypes.of(world, ModDamageTypes.ASSASSINATION_DAMAGE_TYPE), 10);
                user.getItemCooldownManager().set(this, 600);
                return ActionResult.SUCCESS;
            } else {
                return ActionResult.FAIL;
            }
        } else {
            return ActionResult.FAIL;
        }


    }
}
