package de.rafaelo83.zva.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicates {
    public static void registerModelPredicates() {
        /*
        ModelPredicateProviderRegistry.register(ModItems.BLADE, Identifier.of(HiddenBlade.MOD_ID, "active"),
                (stack, world, entity, seed) ->
                        (entity != null && entity.getOffHandStack().isOf(ModItems.BLADE)) ? (entity.isSneaking() ? 1f : 0f) : 0f);

         */
    }
}
