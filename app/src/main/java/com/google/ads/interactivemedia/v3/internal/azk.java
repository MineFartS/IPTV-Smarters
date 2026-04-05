package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class azk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20740a;

    static {
        new azj();
        f20740a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        int i2 = bdm.f20949a;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        axx.k(new azm());
        axx.n(new azj());
    }
}
