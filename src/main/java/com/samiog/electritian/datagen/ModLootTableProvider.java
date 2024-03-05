package com.samiog.electritian.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.stream.Stream;

import com.samiog.electritian.block.ModBlocks;
import com.samiog.electritian.entity.ModEntities;


public class ModLootTableProvider {
    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK), new LootTableProvider.SubProviderEntry(ModEntityLootTables::new, LootContextParamSets.ENTITY)));
    }

    public static class ModBlockLootTables extends BlockLootSubProvider {

        public ModBlockLootTables() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            
        }

        protected LootTable.Builder createCustomOreDrops(RegistryObject<Block> block, RegistryObject<Item> item, float minExp, float maxExp) {
            return createSilkTouchDispatchTable(block.get(), this.applyExplosionDecay(block.get(), LootItem.lootTableItem(item.get())
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minExp, maxExp)))
                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
        }
    }

    public static class ModEntityLootTables extends EntityLootSubProvider {

        public ModEntityLootTables() {
            super(FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        public void generate() {
            
        }

        @Override
        protected Stream<EntityType<?>> getKnownEntityTypes() {
            return ModEntities.ENTITIES.getEntries().stream().map(RegistryObject::get);
        }
    }
}
