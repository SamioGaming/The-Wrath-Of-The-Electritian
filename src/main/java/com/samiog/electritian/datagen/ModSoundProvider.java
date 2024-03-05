package com.samiog.electritian.datagen;

import com.samiog.electritian.ElectritianMod;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class ModSoundProvider extends SoundDefinitionsProvider {

    public ModSoundProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, ElectritianMod.MODID, helper);
    }

    @Override
    public void registerSounds() {
        /*
         * this.add(EXAMPLE_SOUND_EVENT, definition()
            .subtitle("sound.examplemod.example_sound") // Set translation key
            .with(
                sound(new ResourceLocation(MODID, "example_sound_1")) // Set first sound
                    .weight(4) // Has a 4 / 5 = 80% chance of playing
                    .volume(0.5), // Scales all volumes called on this sound by half
                sound(new ResourceLocation(MODID, "example_sound_2")) // Set second sound
                .stream() // Streams the sound
            )
        );
         */
    }
}
