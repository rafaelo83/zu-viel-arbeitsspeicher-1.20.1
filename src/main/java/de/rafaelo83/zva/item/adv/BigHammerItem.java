package de.rafaelo83.zva.item.adv;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

public class BigHammerItem extends Item {
    public BigHammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addVelocity(attacker.getRotationVec(0));

        return super.postHit(stack, target, attacker);
    }
}
