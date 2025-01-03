package de.rafaelo83.zva.item;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //public static final Item BLADE = registerItem("blade", new HiddenBladeItem(new FabricItemSettings()));


    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZuVielArbeitsspeicher.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ZuVielArbeitsspeicher.LOGGER.info("Registering ModItems for " + ZuVielArbeitsspeicher.MOD_ID);
    }
}
