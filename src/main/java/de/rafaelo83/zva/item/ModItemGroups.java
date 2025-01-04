package de.rafaelo83.zva.item;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ASSASSINS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ZuVielArbeitsspeicher.MOD_ID, "zva_1"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.HIDDEN_KNIFE))
                    .displayName(Text.translatable("itemgroup.zva.creativetab_1"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.HIDDEN_KNIFE);
                    })
                    .build());
    public static final ItemGroup BRAINROT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ZuVielArbeitsspeicher.MOD_ID, "zva_2"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.SKIBIDI_BLOCK))
                    .displayName(Text.translatable("itemgroup.zva.creativetab_2"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SKIBIDI_BLOCK);
                    })
                    .build());



    public static void registerItemGroups(){
        ZuVielArbeitsspeicher.LOGGER.info("Registering Item Groups for " + ZuVielArbeitsspeicher.MOD_ID);
    }
}
