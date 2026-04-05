package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class adl extends add {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f19288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f19289b;

    public adl(ajh ajhVar, ajl ajlVar, ke keVar, int i2, byte[] bArr) {
        super(ajhVar, ajlVar, 3, keVar, i2, -9223372036854775807L, -9223372036854775807L);
        this.f19288a = bArr == null ? amn.f20140f : bArr;
    }

    public abstract void a(byte[] bArr, int i2);

    public final byte[] b() {
        return this.f19288a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
        this.f19289b = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() {
        try {
            this.f19262k.a(this.f19255d);
            int iB = 0;
            int i2 = 0;
            while (iB != -1 && !this.f19289b) {
                byte[] bArr = this.f19288a;
                int length = bArr.length;
                if (length < i2 + 16384) {
                    this.f19288a = Arrays.copyOf(bArr, length + 16384);
                }
                iB = this.f19262k.b(this.f19288a, i2, 16384);
                if (iB != -1) {
                    i2 += iB;
                }
            }
            if (!this.f19289b) {
                a(this.f19288a, i2);
            }
        } finally {
            amn.K(this.f19262k);
        }
    }
}
