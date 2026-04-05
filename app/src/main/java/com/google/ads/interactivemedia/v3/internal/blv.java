package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bmb f21376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bmb f21377b;

    static {
        bmb bmbVar;
        try {
            bmbVar = (bmb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            bmbVar = null;
        }
        f21376a = bmbVar;
        f21377b = new bmb();
    }

    public static bmb a() {
        return f21376a;
    }

    public static bmb b() {
        return f21377b;
    }
}
