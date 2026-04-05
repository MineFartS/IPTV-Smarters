package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f21242a = new byte[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21244c;

    public bjn(byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.f21242a[i2] = (byte) i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.f21242a;
            byte b2 = bArr2[i4];
            i3 = (i3 + b2 + bArr[i4 % bArr.length]) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b2;
        }
        this.f21243b = 0;
        this.f21244c = 0;
    }

    public final void a(byte[] bArr) {
        int i2 = this.f21243b;
        int i3 = this.f21244c;
        for (int i4 = 0; i4 < 256; i4++) {
            i2 = (i2 + 1) & 255;
            byte[] bArr2 = this.f21242a;
            byte b2 = bArr2[i2];
            i3 = (i3 + b2) & 255;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b2;
            bArr[i4] = (byte) (bArr2[(bArr2[i2] + b2) & 255] ^ bArr[i4]);
        }
        this.f21243b = i2;
        this.f21244c = i3;
    }
}
