package org.nightknight.advancedcoloniescore.datagen;

import net.minecraft.data.PackOutput;
import org.nightknight.advancedcoloniescore.Constants;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {

    public LanguageProvider(PackOutput output, String locale) {
        super(output, Constants.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.advancedcoloniescore", "Advanced Colonies Core");
    }
}