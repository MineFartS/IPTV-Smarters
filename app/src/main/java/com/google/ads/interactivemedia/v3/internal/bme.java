package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bmx f21400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bmx f21401b;

    static {
        bmx bmxVar;
        try {
            bmxVar = (bmx) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            bmxVar = null;
        }
        f21400a = bmxVar;
        f21401b = new bmx();
    }

    public static bmx a() {
        return f21400a;
    }

    public static bmx b() {
        return f21401b;
    }
}
