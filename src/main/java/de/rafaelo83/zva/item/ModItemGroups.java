package de.rafaelo83.zva.item;



import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ZVA_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ZuVielArbeitsspeicher.MOD_ID, "zva"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(Items.END_CRYSTAL ))
                    .displayName(Text.translatable("itemgroup.zva.creativetab_1"))
                    .entries((displayContext, entries) -> {

                    })

                    .build());


    public static void registerItemGroups(){
        ZuVielArbeitsspeicher.LOGGER.info("Registering Item Groups for " + ZuVielArbeitsspeicher.MOD_ID);
    }
}
