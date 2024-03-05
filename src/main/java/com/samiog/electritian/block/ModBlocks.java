package com.samiog.electritian.block;

import com.samiog.electritian.ElectritianMod;
import com.samiog.electritian.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ElectritianMod.MODID);

    //Register Blocks

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> sup){
        RegistryObject<T> block = BLOCKS.register(name, sup);
        registerBlockItem(name, block);
        return block;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
