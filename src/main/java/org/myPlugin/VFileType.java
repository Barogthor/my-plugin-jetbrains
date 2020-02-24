package org.myPlugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class VFileType extends LanguageFileType {
    public static final VFileType INSTANCE = new VFileType();

    private VFileType() {
        super(VLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "V file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "V language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "v";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VIcons.FILE;
    }
}
