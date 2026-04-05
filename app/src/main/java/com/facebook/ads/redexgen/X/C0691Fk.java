package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0691Fk {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public C0691Fk() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public C0691Fk(int i2, int[] iArr, Uri[] uriArr, long[] jArr) {
        IM.A03(iArr.length == uriArr.length);
        this.A00 = i2;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i2) {
        int i3 = i2 + 1;
        while (true) {
            int[] iArr = this.A01;
            if (i3 >= iArr.length || iArr[i3] == 0 || iArr[i3] == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
