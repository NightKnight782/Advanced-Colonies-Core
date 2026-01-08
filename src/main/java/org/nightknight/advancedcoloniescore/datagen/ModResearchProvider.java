package org.nightknight.advancedcoloniescore.datagen;

import com.minecolonies.api.blocks.ModBlocks;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.research.AbstractResearchProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.nightknight.advancedcoloniescore.Constants;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModResearchProvider extends AbstractResearchProvider
{
    private static String Minecolonies_MOD_ID = com.minecolonies.api.util.constant.Constants.MOD_ID;

    private static final ResourceLocation CIVIL  = ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, "civilian");
    private static final ResourceLocation COMBAT = ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, "combat");
    private static final ResourceLocation TECH   = ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, "technology");
    private static final ResourceLocation UNLOCK = ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, "unlockable");

    public ModResearchProvider(@NotNull final PackOutput packOutput)
    {
        super(packOutput);
    }

    @Override
    protected Collection<ResearchBranch> getResearchBranchCollection() {
        return List.of();
    }

    @Override
    public Collection<ResearchEffect> getResearchEffectCollection()
    {
        final List<ResearchEffect> effects = new ArrayList<>();

        effects.add(new ResearchEffect(ModBuildings.builder.get().getBuildingBlock()).setTranslatedName("Unlock Town level").setLevels(new double[] {1.0, 2.0, 3.0, 4.0, 5.0}));

        return effects;
    }

    @Override
    protected Collection<Research> getResearchCollection() {

        final List<Research> researches = new ArrayList<>();

        final Research builder = new Research(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "unlock/builder"), UNLOCK)
                .setTranslatedName("Age 1")
                .setIcon(ModBlocks.blockHutBuilder.asItem(), 100)
                .addEffect(ModBuildings.builder.get().getBuildingBlock(), 1)
                .setAutostart()
                .setInstant()
                .addToList(researches);

        final Research townLevel2 = new Research(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "civilian/townlevel2"), CIVIL)
                .setSortOrder(0)
                .setTranslatedName("Age 2")
                .setIcon(ModBlocks.blockHutBuilder.asItem(), 100)
                .addEffect(ModBuildings.builder.get().getBuildingBlock(), 2)
                .addSingleBuildingRequirement(ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, ModBuildings.TOWNHALL_ID), 1)
                .addItemCost(Items.IRON_INGOT, 16)
                .addToList(researches);

        final Research townLevel3 = new Research(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "civilian/townlevel3"), CIVIL)
                .setParentResearch(townLevel2)
                .setTranslatedName("Age 3")
                .setIcon(ModBlocks.blockHutBuilder.asItem(), 100)
                .addEffect(ModBuildings.builder.get().getBuildingBlock(), 3)
                .addSingleBuildingRequirement(ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, ModBuildings.TOWNHALL_ID), 2)
                .addItemCost(Items.GOLD_INGOT, 16)
                .addToList(researches);

        final Research townLevel4 = new Research(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "civilian/townlevel4"), CIVIL)
                .setParentResearch(townLevel3)
                .setTranslatedName("Age 4")
                .setIcon(ModBlocks.blockHutBuilder.asItem(), 100)
                .addEffect(ModBuildings.builder.get().getBuildingBlock(), 4)
                .addSingleBuildingRequirement(ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, ModBuildings.TOWNHALL_ID), 3)
                .addItemCost(Items.DIAMOND, 16)
                .addToList(researches);

        final Research townLevel5 = new Research(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "civilian/townlevel5"), CIVIL)
                .setParentResearch(townLevel4)
                .setTranslatedName("Age 5")
                .setIcon(ModBlocks.blockHutBuilder.asItem(), 100)
                .addEffect(ModBuildings.builder.get().getBuildingBlock(), 5)
                .addSingleBuildingRequirement(ResourceLocation.fromNamespaceAndPath(Minecolonies_MOD_ID, ModBuildings.TOWNHALL_ID), 4)
                .addItemCost(Items.NETHERITE_INGOT, 16)
                .addToList(researches);

        return researches;
    }

}
