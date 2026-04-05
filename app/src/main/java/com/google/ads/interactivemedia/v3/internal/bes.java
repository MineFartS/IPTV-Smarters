package com.google.ads.interactivemedia.v3.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class bes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f21018a = new ber();

    public static /* synthetic */ SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] b(int i2) {
        byte[] bArr = new byte[i2];
        f21018a.get().nextBytes(bArr);
        return bArr;
    }
}
