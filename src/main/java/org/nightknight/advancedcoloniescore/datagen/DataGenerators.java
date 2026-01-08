package org.nightknight.advancedcoloniescore.datagen;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.nightknight.advancedcoloniescore.Constants;

import java.util.Arrays;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        event.getGenerator().addProvider(event.includeServer(), new ModRecipeProvider(event.getGenerator().getPackOutput()));
        event.getGenerator().addProvider(event.includeServer(), new ModResearchProvider(event.getGenerator().getPackOutput()));

        Arrays.stream(BaseLanguageProvider.ModLocales.values())
            .forEach(locale -> event.getGenerator().addProvider(event.includeClient(), new ModLanguageProvider(event.getGenerator().getPackOutput(), locale)));
    }
}
