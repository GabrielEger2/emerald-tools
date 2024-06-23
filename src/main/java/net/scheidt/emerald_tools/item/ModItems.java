package net.scheidt.emerald_tools.item;

import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem( ModToolTiers.EMERALD, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem( ModToolTiers.EMERALD, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem( ModToolTiers.EMERALD, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem( ModToolTiers.EMERALD, 1, 2, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
