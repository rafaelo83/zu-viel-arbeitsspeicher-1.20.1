package de.rafaelo83.zva.item;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.item.adv.BigHammerItem;
import de.rafaelo83.zva.item.adv.HiddenKnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HIDDEN_KNIFE = registerItem("hidden_knife", new HiddenKnifeItem(new FabricItemSettings()));

    public static final Item SPARE_BLADE = registerItem("spare_blade", new Item(new FabricItemSettings().maxCount(4)));

    public static final Item BIG_HAMMER = registerItem("big_hammer", new BigHammerItem(new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZuVielArbeitsspeicher.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZuVielArbeitsspeicher.LOGGER.info("Registering Items for " + ZuVielArbeitsspeicher.MOD_ID);
    }
}
