package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21005a;

    private bel(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f21005a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static bel a(byte[] bArr) {
        return new bel(bArr, bArr.length);
    }

    public final byte[] b() {
        byte[] bArr = this.f21005a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
