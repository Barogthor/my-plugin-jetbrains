package com.myPlugin;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class VLanguage extends Language {
    public static final VLanguage INSTANCE = new VLanguage();

    private VLanguage() {
        super("V");
    }
}
