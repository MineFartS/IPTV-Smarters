package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aaw implements ajh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajh f19018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aav f19020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f19021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19022e;

    public aaw(ajh ajhVar, int i2, aav aavVar) {
        ajr.d(i2 > 0);
        this.f19018a = ajhVar;
        this.f19019b = i2;
        this.f19020c = aavVar;
        this.f19021d = new byte[1];
        this.f19022e = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final long a(ajl ajlVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) {
        int i4 = this.f19022e;
        if (i4 == 0) {
            int i5 = 0;
            if (this.f19018a.b(this.f19021d, 0, 1) != -1) {
                int i6 = (this.f19021d[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr2 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int iB = this.f19018a.b(bArr2, i5, i7);
                        if (iB != -1) {
                            i5 += iB;
                            i7 -= iB;
                        }
                    }
                    while (i6 > 0) {
                        int i8 = i6 - 1;
                        if (bArr2[i8] != 0) {
                            break;
                        }
                        i6 = i8;
                    }
                    if (i6 > 0) {
                        this.f19020c.a(new alx(bArr2, i6));
                    }
                }
                i4 = this.f19019b;
                this.f19022e = i4;
            }
            return -1;
        }
        int iB2 = this.f19018a.b(bArr, i2, Math.min(i4, i3));
        if (iB2 != -1) {
            this.f19022e -= iB2;
        }
        return iB2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f19018a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Map<String, List<String>> d() {
        return this.f19018a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void e(akq akqVar) {
        ajr.b(akqVar);
        this.f19018a.e(akqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        throw new UnsupportedOperationException();
    }
}
