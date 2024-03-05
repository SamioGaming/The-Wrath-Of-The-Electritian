package com.samiog.electritian.datagen;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ElectritianMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
      
    }

    private void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
}
