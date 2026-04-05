package com.google.ads.interactivemedia.v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class ft implements Runnable {
    private ft() {
    }

    public /* synthetic */ ft(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            fu.f21813c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            fu.f21812b.countDown();
            throw th;
        }
        fu.f21812b.countDown();
    }
}
