package de.rafaelo83.zva.util;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicates {
    public static void registerModelPredicates() {

        ModelPredicateProviderRegistry.register(ModItems.HIDDEN_KNIFE, Identifier.of(ZuVielArbeitsspeicher.MOD_ID, "hidden_knife_extended"),
                (stack, world, entity, seed) ->
                        (entity != null ?
                                (entity.isSneaking()
                                        && (entity.getMainHandStack().isOf(ModItems.HIDDEN_KNIFE)
                                        || entity.getOffHandStack().isOf(ModItems.HIDDEN_KNIFE)) ? 1f : 0f) : 1f));

    }
}
