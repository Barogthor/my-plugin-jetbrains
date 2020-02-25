package org.myPlugin.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.myPlugin.VLanguage;

public class VTokenType extends IElementType {
    public VTokenType(@NotNull String debugName) {
        super(debugName, VLanguage.INSTANCE);
    }
}
