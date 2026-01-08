package org.nightknight.advancedcoloniescore;

import com.minecolonies.api.IMinecoloniesAPI;
import com.minecolonies.api.eventbus.events.colony.ColonyCreatedModEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.nightknight.advancedcoloniescore.datagen.DataGenerators;

import static org.nightknight.advancedcoloniescore.Constants.MOD_ID;

@Mod(MOD_ID)
public class AdvancedColoniesCore {

    public AdvancedColoniesCore(final FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::preInit);
        modEventBus.addListener(DataGenerators::gatherData);
    }

    /**
     * Event handler for forge pre init event.
     *
     * @param event the forge pre init event.
     */
    public void preInit(@NotNull final FMLCommonSetupEvent event)
    {

        event.enqueueWork(() -> {
            IMinecoloniesAPI.getInstance().getEventBus().subscribe(ColonyCreatedModEvent.class, (ev) -> {
                ev.getColony().getResearchManager().checkAutoStartResearch();
            });
        });
    }
}
