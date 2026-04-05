package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0744Hl {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;

    @Nullable
    public final String A05;

    @Nullable
    public final byte[] A06;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-110, -122, 122, -105, -86, -105, -119, -90, -101, -103, -111, -60};
    }

    public C0744Hl(Uri uri, int i2) {
        this(uri, 0L, -1L, null, i2);
    }

    public C0744Hl(Uri uri, long j2, long j3, long j4, @Nullable String str, int i2) {
        this(uri, null, j2, j3, j4, str, i2);
    }

    public C0744Hl(Uri uri, long j2, long j3, @Nullable String str) {
        this(uri, j2, j2, j3, str, 0);
    }

    public C0744Hl(Uri uri, long j2, long j3, @Nullable String str, int i2) {
        this(uri, j2, j2, j3, str, i2);
    }

    public C0744Hl(Uri uri, @Nullable byte[] bArr, long j2, long j3, long j4, @Nullable String str, int i2) {
        boolean z = true;
        IM.A03(j2 >= 0);
        IM.A03(j3 >= 0);
        if (j4 <= 0 && j4 != -1) {
            z = false;
        }
        IM.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j2;
        this.A03 = j3;
        this.A02 = j4;
        this.A05 = str;
        this.A00 = i2;
    }

    private final C0744Hl A00(long j2, long j3) {
        if (j2 == 0 && this.A02 == j3) {
            return this;
        }
        return new C0744Hl(this.A04, this.A06, this.A01 + j2, this.A03 + j2, j3, this.A05, this.A00);
    }

    public final C0744Hl A03(long j2) {
        long j3 = this.A02;
        return A00(j2, j3 != -1 ? j3 - j2 : -1L);
    }

    public final boolean A04(int i2) {
        return (this.A00 & i2) == i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A01(2, 9, 26));
        sb.append(this.A04);
        String strA01 = A01(0, 2, 74);
        sb.append(strA01);
        sb.append(Arrays.toString(this.A06));
        sb.append(strA01);
        sb.append(this.A01);
        sb.append(strA01);
        sb.append(this.A03);
        sb.append(strA01);
        sb.append(this.A02);
        sb.append(strA01);
        sb.append(this.A05);
        sb.append(strA01);
        sb.append(this.A00);
        sb.append(A01(11, 1, 75));
        return sb.toString();
    }
}
