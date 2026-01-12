package org.nightknight.advancedcoloniescore.datagen;

import net.minecraft.data.PackOutput;

public class ModLanguageProvider extends BaseLanguageProvider
{
    public ModLanguageProvider(final PackOutput output, final ModLocales locale)
    {
        super(output, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup.advancedcoloniescore", locale -> "Advanced Colonies Core");

        add("com.minecolonies.research.effects.blockhutbuilder.description", locale -> switch (locale)
        {
            case ENGLISH -> "Upgrade the Town maximum level!";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.unlock.builder.name", locale -> switch (locale)
        {
            case ENGLISH -> "Age 1";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.unlock.builder.subtitle", locale -> switch (locale)
        {
            case ENGLISH -> "Reach Age 1 by starting a colony!";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel2.name", locale -> switch (locale)
        {
            case ENGLISH -> "Age 2";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel2.subtitle", locale -> switch (locale)
        {
            case ENGLISH -> "Reach Age 2 by completing basic Tinkering!";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel3.name", locale -> switch (locale)
        {
            case ENGLISH -> "Age 3";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel3.subtitle", locale -> switch (locale)
        {
            case ENGLISH -> "Reach Age 3 by piercing the secret of magics!";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel4.name", locale -> switch (locale)
        {
            case ENGLISH -> "Age 4";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel4.subtitle", locale -> switch (locale)
        {
            case ENGLISH -> "Reach Age 4 by !";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel5.name", locale -> switch (locale)
        {
            case ENGLISH -> "Age 5";
            case FRENCH -> "baguette";
        });
        add("com.advancedcoloniescore.research.civilian.townlevel5.subtitle", locale -> switch (locale)
        {
            case ENGLISH -> "Reach Age 5 by starting a colony!";
            case FRENCH -> "baguette";
        });
    }
}
