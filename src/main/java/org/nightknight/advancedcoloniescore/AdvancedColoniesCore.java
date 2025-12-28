package org.nightknight.advancedcoloniescore;

import com.minecolonies.api.IMinecoloniesAPI;
import com.minecolonies.api.eventbus.events.colony.ColonyCreatedModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(Constants.MOD_ID)
public class AdvancedColoniesCore {

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

    public AdvancedColoniesCore(final FMLJavaModLoadingContext context) {
        context.getModEventBus().addListener(this::preInit);
    }


}
