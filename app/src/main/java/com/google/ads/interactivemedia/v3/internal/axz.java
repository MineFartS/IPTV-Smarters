package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class axz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final bdm f20710c;

    static {
        new aye();
        f20708a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new ayn();
        f20709b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new ayq();
        new ayk();
        new ayw();
        new aza();
        new ayt();
        new azd();
        f20710c = bdm.c();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        axx.k(new ayb());
        bah.a();
        axx.n(new aye());
        axx.n(new ayn());
        axx.n(new ayk());
        ayq.k();
        axx.n(new ayt());
        axx.n(new ayw());
        axx.n(new aza());
        axx.n(new azd());
    }
}
