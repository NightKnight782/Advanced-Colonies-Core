package org.nightknight.advancedcoloniescore.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.nightknight.advancedcoloniescore.Constants;

public class ModLanguageProvider extends LanguageProvider
{
    public ModLanguageProvider(PackOutput output)
    {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup.advancedcoloniescore", "Advanced Colonies Core");

        add("com.minecolonies.research.effects.blockhutbuilder.description", "Upgrade the Town maximum level!");
        add("com.advancedcoloniescore.research.setup.builder_unlock_1.name", "Age 1");
        add("com.advancedcoloniescore.research.setup.builder_unlock_1.subtitle", "Reach Age 1 by starting a colony!");
        add("com.advancedcoloniescore.research.setup.builder_unlock_2.name", "Age 2");
        add("com.advancedcoloniescore.research.setup.builder_unlock_2.subtitle", "Reach Age 2 by completing basic Tinkering!");
        add("com.advancedcoloniescore.research.setup.builder_unlock_3.name", "Age 3");
        add("com.advancedcoloniescore.research.setup.builder_unlock_3.subtitle", "Reach Age 3 by piercing the secret of magics!");
        add("com.advancedcoloniescore.research.setup.builder_unlock_4.name", "Age 4");
        add("com.advancedcoloniescore.research.setup.builder_unlock_4.subtitle", "Reach Age 4 by !");
        add("com.advancedcoloniescore.research.setup.builder_unlock_5.name", "Age 5");
        add("com.advancedcoloniescore.research.setup.builder_unlock_5.subtitle", "Reach Age 5 by starting a colony!");
    }
}
