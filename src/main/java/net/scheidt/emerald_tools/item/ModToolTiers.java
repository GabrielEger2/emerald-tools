package net.scheidt.emerald_tools.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraft.world.item.Tiers;

import java.util.List;
import java.util.function.Supplier;

public class ModToolTiers {
    public static final Tier EMERALD;

    static {
        TagKey<Block> effectiveBlocksTag = BlockTags.create(new ResourceLocation("forge", "needs_emerald_tool"));
        Supplier<Ingredient> repairMaterial = () -> Ingredient.of(net.minecraft.world.item.Items.EMERALD);

        EMERALD = TierSortingRegistry.registerTier(
                new ForgeTier(
                        4,
                        1400,
                        9.0f,
                        4f,
                        22,
                        effectiveBlocksTag,
                        repairMaterial
                ),
                new ResourceLocation("emerald_tools", "emerald"),
                List.of(Tiers.DIAMOND),
                List.of()
        );
    }
}