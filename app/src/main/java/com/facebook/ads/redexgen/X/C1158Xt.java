package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1158Xt implements AE {
    public static byte[] A0A;
    public static String[] A0B;
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C1289bE A07;
    public final C0772Ip A08;
    public final boolean A09;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{104, -85, -87, -74, -74, -73, -68, 104, -86, -83, 104, -76, -83, -69, -69, 104, -68, -80, -87, -74, 104, -81, -88, -69, -84, -84, -85, -72, -116, -75, -72, -106, -78, -89, -65, -88, -89, -87, -79, -121, -84, -70, -85, -72, -104, -85, -88, -69, -84, -84, -85, -72, -109, -71, -54, -35, -50, -50, -51, -38, -82, -41, -38, -72, -44, -55, -31, -54, -55, -53, -45, -75, -37, -17, -29, -6, -60, -9, -24, -24, -25, -12, -49, -11, -23, -27, -22, -66, -15, -30, -30, -31, -18, -55, -17};
    }

    public static void A03() {
        A0B = new String[]{"ilntiKeCpn72Dx7EE3Rw9hkq75JbKAcA", "wPL2yleQwYX6RVVdEOaHMWHZq50QYzDc", "zjYhmAwspMfnQIz92oeL2kf6IR", "AEUyDf5SOKQlymFmwa942o3bdmA", "6YNynFjnDYQOqc0QM1ycbBp5CCdF169p", "D8", "MEXbIoh", "5uze5Gp41PLyaey5Hs3T"};
    }

    public C1158Xt() {
        this(new C1289bE(true, 65536));
    }

    @Deprecated
    public C1158Xt(C1289bE c1289bE) {
        this(c1289bE, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public C1158Xt(C1289bE c1289bE, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(c1289bE, i2, i3, i4, i5, i6, z, null);
    }

    @Deprecated
    public C1158Xt(C1289bE c1289bE, int i2, int i3, int i4, int i5, int i6, boolean z, C0772Ip c0772Ip) {
        String strA01 = A01(21, 1, 103);
        String strA012 = A01(54, 19, 80);
        A04(i4, 0, strA012, strA01);
        String strA013 = A01(22, 32, 46);
        A04(i5, 0, strA013, strA01);
        String strA014 = A01(84, 11, 100);
        A04(i2, i4, strA014, strA012);
        A04(i2, i5, strA014, strA013);
        A04(i3, i2, A01(73, 11, 106), strA014);
        this.A07 = c1289bE;
        this.A06 = ((long) i2) * 1000;
        this.A05 = ((long) i3) * 1000;
        this.A04 = ((long) i4) * 1000;
        this.A03 = ((long) i5) * 1000;
        this.A02 = i6;
        this.A09 = z;
        this.A08 = c0772Ip;
    }

    private final int A00(Y0[] y0Arr, HU hu) {
        int iA01 = 0;
        for (int i2 = 0; i2 < y0Arr.length; i2++) {
            if (hu.A01(i2) != null) {
                iA01 += J1.A01(y0Arr[i2].A7F());
            }
        }
        return iA01;
    }

    public static void A04(int i2, int i3, String str, String str2) {
        IM.A05(i2 >= i3, str + A01(0, 21, 48) + str2);
    }

    private void A05(boolean z) {
        this.A00 = 0;
        C0772Ip c0772Ip = this.A08;
        if (c0772Ip != null && this.A01) {
            c0772Ip.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A04();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final HZ A5N() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final long A5S() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void AAl() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void AB4() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void ABA(Y0[] y0Arr, TrackGroupArray trackGroupArray, HU hu) {
        int iA00 = this.A02;
        if (iA00 == -1) {
            iA00 = A00(y0Arr, hu);
        }
        this.A00 = iA00;
        this.A07.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean ACf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    @Override // com.facebook.ads.redexgen.X.AE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ADB(long r9, float r11) {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.bE r0 = r8.A07
            int r1 = r0.A03()
            int r0 = r8.A00
            r6 = 1
            r5 = 0
            if (r1 < r0) goto L90
            r7 = 1
        Ld:
            boolean r4 = r8.A01
            long r0 = r8.A06
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L21
            long r2 = com.facebook.ads.redexgen.X.J1.A0C(r0, r11)
            long r0 = r8.A05
            long r0 = java.lang.Math.min(r2, r0)
        L21:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L85
            boolean r3 = r8.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1158Xt.A0B
            r0 = 1
            r1 = r1[r0]
            r0 = 1
            char r1 = r1.charAt(r0)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L93
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1158Xt.A0B
            java.lang.String r1 = "Ppn0DE"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "Ppn0DE"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L45
            if (r7 != 0) goto L83
        L45:
            r8.A01 = r6
        L47:
            com.facebook.ads.redexgen.X.Ip r6 = r8.A08
            if (r6 == 0) goto L6d
            boolean r3 = r8.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1158Xt.A0B
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1158Xt.A0B
            java.lang.String r1 = "7hiTZk3TS6kdJpPH1OWD5iH5Lha"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "uWsgjDiVcVLtDVCTZxMR"
            r0 = 7
            r2[r0] = r1
            if (r3 == r4) goto L6d
        L68:
            if (r3 == 0) goto L70
            r6.A00(r5)
        L6d:
            boolean r0 = r8.A01
            return r0
        L70:
            r6.A03(r5)
            goto L6d
        L74:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1158Xt.A0B
            java.lang.String r1 = "I9dScF5ijEM2hd"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "I9dScF5ijEM2hd"
            r0 = 6
            r2[r0] = r1
            if (r3 == r4) goto L6d
            goto L68
        L83:
            r6 = 0
            goto L45
        L85:
            long r1 = r8.A05
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L8d
            if (r7 == 0) goto L47
        L8d:
            r8.A01 = r5
            goto L47
        L90:
            r7 = 0
            goto Ld
        L93:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1158Xt.ADB(long, float):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final boolean ADE(long j2, float f2, boolean z) {
        long jA0D = J1.A0D(j2, f2);
        long j3 = z ? this.A03 : this.A04;
        if (A0B[6].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[6] = "eSzKm";
        strArr[6] = "eSzKm";
        return j3 <= 0 || jA0D >= j3 || (!this.A09 && this.A07.A03() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public final void onPrepared() {
        A05(false);
    }
}
