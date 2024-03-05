package com.samiog.electritian.tag;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        //Register Block Tags

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(ElectritianMod.MODID, name));
        }
    }


    public static class Items {
        //Register Item Tags

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(ElectritianMod.MODID, name));
        }
    }
}
