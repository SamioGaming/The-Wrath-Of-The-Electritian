package com.samiog.electritian.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModTagsProvider {
    public static class ModBlockTagsProvider extends BlockTagsProvider {

        public ModBlockTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, ElectritianMod.MODID, existingFileHelper);
        }

        @Override
        protected void addTags(Provider pProvider) {
            this.tag(Tags.Blocks.NEEDS_WOOD_TOOL);
            this.tag(BlockTags.NEEDS_STONE_TOOL);
            this.tag(BlockTags.NEEDS_IRON_TOOL);
            this.tag(Tags.Blocks.NEEDS_GOLD_TOOL);
            this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
            this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

            this.tag(BlockTags.MINEABLE_WITH_PICKAXE);
            this.tag(BlockTags.MINEABLE_WITH_AXE);
            this.tag(BlockTags.MINEABLE_WITH_SHOVEL);
            this.tag(BlockTags.MINEABLE_WITH_HOE);
        } 
    }

    public static class ModItemTagsProvider extends ItemTagsProvider {

        public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
            super(pOutput, pLookupProvider, pBlockTags, ElectritianMod.MODID, existingFileHelper);
        }

        @Override
        protected void addTags(Provider pProvider) {
            
        }
    }
}
