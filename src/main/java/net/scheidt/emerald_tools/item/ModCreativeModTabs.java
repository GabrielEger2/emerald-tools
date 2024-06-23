package net.scheidt.emerald_tools.item;

import net.scheidt.emerald_tools.EmeraldTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmeraldTools.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("emerald_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EMERALD_PICkAXE.get()))
                    .title(Component.translatable("creativetab.emerald_tools_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.EMERALD_SWORD.get());
                        output.accept(ModItems.EMERALD_PICkAXE.get());
                        output.accept(ModItems.EMERALD_SHOVEL.get());
                        output.accept(ModItems.EMERALD_AXE.get());
                        output.accept(ModItems.EMERALD_HOE.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}