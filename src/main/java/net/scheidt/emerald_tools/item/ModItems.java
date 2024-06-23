package net.scheidt.emerald_tools.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scheidt.emerald_tools.EmeraldTools;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldTools.MOD_ID);

    public static final RegistryObject<Item> EMERALD_PICkAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem( ModToolTiers.EMERALD, 1, 2, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
