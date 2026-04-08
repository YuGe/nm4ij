package me.yuge.nonmem;

import com.intellij.lang.Language;

public class NonmemLanguage extends Language {
    public static final NonmemLanguage INSTANCE = new NonmemLanguage();

    private NonmemLanguage() {
        super("Nonmem");
    }
}
