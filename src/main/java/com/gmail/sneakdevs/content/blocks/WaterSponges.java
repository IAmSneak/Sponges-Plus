package com.gmail.sneakdevs.content.blocks;

import com.gmail.sneakdevs.content.types.*;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;


public class WaterSponges {

    public static final StrongSpongeBase STRONG_SPONGE = new StrongSpongeBase("strong_sponge", 0.9f, 0.9f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);
    public static final WetSpongeBase STRONG_WET_SPONGE = new WetSpongeBase("strong_wet_sponge", 0.9f, 0.9f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);

    public static final AdvancedSpongeBase ADVANCED_LAVA_SPONGE = new AdvancedSpongeBase("advanced_sponge", 1.2f, 1.2f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);
    public static final WetSpongeBase ADVANCED_WET_SPONGE = new WetSpongeBase("advanced_wet_sponge", 1.2f, 1.2f, Material.SPONGE, BlockSoundGroup.WART_BLOCK, ItemGroup.DECORATIONS, FabricToolTags.HOES);

}