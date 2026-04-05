package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final blt f21296a = new blt(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final blt f21297b;

    static {
        blt bltVar = null;
        try {
            bltVar = (blt) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f21297b = bltVar;
    }

    public static blt a() {
        blt bltVar = f21297b;
        if (bltVar != null) {
            return bltVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static blt b() {
        return f21296a;
    }
}
