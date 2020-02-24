package org.myPlugin;

import com.intellij.lang.Language;

public class VLanguage extends Language {
    public static final VLanguage INSTANCE = new VLanguage();

    private VLanguage() {
        super("V");
    }
}
