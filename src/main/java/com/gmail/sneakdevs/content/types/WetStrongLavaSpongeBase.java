package com.gmail.sneakdevs.content.types;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WetStrongLavaSpongeBase extends WetStrongLavaSpongeBlock {

    public WetStrongLavaSpongeBase(String name, float hardness, float resistance, Material material, BlockSoundGroup sound, ItemGroup itemgroup, Tag<Item> tag) {

        super(FabricBlockSettings.of(material).sounds(sound).strength(hardness, resistance).breakByTool(tag));
        Registry.register(Registry.BLOCK, new Identifier("spongesplus", name), this);
        Registry.register(Registry.ITEM,new Identifier("spongesplus", name), new BlockItem(this, new Item.Settings().fireproof().maxCount(64).group(itemgroup)));

    }
}