package org.nightknight.advancedcoloniescore.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;
import org.nightknight.advancedcoloniescore.Constants;

import java.util.function.Function;

public abstract class BaseLanguageProvider extends LanguageProvider
{
    private final ModLocales locale;

    public BaseLanguageProvider(final PackOutput output, final ModLocales locale)
    {
        super(output, Constants.MOD_ID, locale.locale);
        this.locale = locale;
    }

    @Override
    public final void add(final @NotNull String key, final @NotNull String value)
    {
        throw new UnsupportedOperationException();
    }

    public final void add(final @NotNull String key, final @NotNull Function<ModLocales, String> getter)
    {
        super.add(key, getter.apply(locale));
    }

    public enum ModLocales
    {
        ENGLISH("en_us"),
        FRENCH("fr_fr");

        private final String locale;

        ModLocales(final String locale)
        {
            this.locale = locale;
        }
    }
}
