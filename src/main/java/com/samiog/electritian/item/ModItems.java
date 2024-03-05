package com.samiog.electritian.item;

import java.util.function.Supplier;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectritianMod.MODID);

    //Register Items

    private static RegistryObject<Item> registerItem(String name, Supplier<Item> sup) {
        return ITEMS.register(name, sup);
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
