package com.samiog.electritian.datagen;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLangProvider extends LanguageProvider {

    public ModLangProvider(PackOutput output, String locale) {
        super(output, ElectritianMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        
    }
}
