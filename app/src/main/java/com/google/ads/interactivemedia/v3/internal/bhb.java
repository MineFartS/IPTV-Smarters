package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public abstract class bhb {
    public static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            String name = cls.getName();
            throw new UnsupportedOperationException(name.length() != 0 ? "Interface can't be instantiated! Interface name: ".concat(name) : new String("Interface can't be instantiated! Interface name: "));
        }
        if (Modifier.isAbstract(modifiers)) {
            String name2 = cls.getName();
            throw new UnsupportedOperationException(name2.length() != 0 ? "Abstract class can't be instantiated! Class name: ".concat(name2) : new String("Abstract class can't be instantiated! Class name: "));
        }
    }

    public abstract <T> T a(Class<T> cls);
}
