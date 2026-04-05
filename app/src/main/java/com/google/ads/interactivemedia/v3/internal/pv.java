package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class pv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f22785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f22786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f22787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pu f22788e;

    public pv() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f22787d = cryptoInfo;
        this.f22788e = amn.f20135a >= 24 ? new pu(cryptoInfo) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f22787d;
    }

    public final void b(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f22785b == null) {
            int[] iArr = new int[1];
            this.f22785b = iArr;
            this.f22787d.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f22785b;
        iArr2[0] = iArr2[0] + i2;
    }

    public final void c(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3, int i4, int i5) {
        this.f22785b = iArr;
        this.f22786c = iArr2;
        this.f22784a = bArr2;
        MediaCodec.CryptoInfo cryptoInfo = this.f22787d;
        cryptoInfo.numSubSamples = i2;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i3;
        if (amn.f20135a >= 24) {
            pu puVar = this.f22788e;
            ajr.b(puVar);
            pu.a(puVar, i4, i5);
        }
    }
}
