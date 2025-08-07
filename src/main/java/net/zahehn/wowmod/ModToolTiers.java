package net.zahehn.wowmod;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier VOIDGLASS = new ForgeTier(
            2000,
            1.0f,
            100000f,
            15, // Encantabilidade alta
            BlockTags.SWORD_EFFICIENT,
            () -> Ingredient.of(Items.DIAMOND),
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL
    );
}
