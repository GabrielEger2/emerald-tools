package net.scheidt.emerald_tools.datagen;

import net.scheidt.emerald_tools.EmeraldTools;
import net.scheidt.emerald_tools.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EmeraldTools.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.EMERALD_PICkAXE);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EmeraldTools.MOD_ID,"item/" + item.getId().getPath()));
    }
}