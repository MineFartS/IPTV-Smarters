package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05449a {
    public final int A00;
    public final C9X A01;

    public C05449a(int i2, C9X c9x) {
        this.A00 = i2;
        this.A01 = c9x;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C9O A02(int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        return this.A01.A06(i2, bArr, i3, iArr, i4);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}
