package com.samiog.electritian.jei;

import com.samiog.electritian.ElectritianMod;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

@JeiPlugin
public class ModJeiPlugin implements IModPlugin {
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        
    }

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ElectritianMod.MODID, "jei_plugin");
    } 
}
