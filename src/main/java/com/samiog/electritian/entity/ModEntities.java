package com.samiog.electritian.entity;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ElectritianMod.MODID);

    //Register Entities

    public static void register(IEventBus eventBus){
        ENTITIES.register(eventBus);
    }
}
