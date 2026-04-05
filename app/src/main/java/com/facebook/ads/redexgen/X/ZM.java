package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZM implements DL {
    public static byte[] A0E;
    public static String[] A0F;
    public long A00;
    public long A01;
    public CR A02;
    public DQ A03;
    public String A04;
    public boolean A05;
    public final DU A0B;
    public final boolean[] A0D = new boolean[3];
    public final DR A0A = new DR(32, 128);
    public final DR A08 = new DR(33, 128);
    public final DR A06 = new DR(34, 128);
    public final DR A07 = new DR(39, 128);
    public final DR A09 = new DR(40, 128);
    public final C0768Il A0C = new C0768Il();

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-65, -87, -83, -84, -55, -36, -40, -37, -36, -23, -20, 5, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, -4, -6, 11, -4, -5, -73, -8, 10, 7, -4, -6, 11, -10, 9, -8, 11, 0, 6, -10, 0, -5, -6, -73, DateTimeFieldType.HALFDAY_OF_DAY, -8, 3, 12, -4, -47, -73, 49, 36, 31, 32, 42, -22, 35, 32, 49, 30};
    }

    public static void A03() {
        A0F = new String[]{"a", "PSzfdfjRZC0XN6VxjsgcztfFaZhzgWb7", "1Gl4YGiW2C7ithS", "fAa", "AJgx", "lYVk", "kBtUfz7weItcbZk1MBk54uJpUuqD7Dj9", "de5NTYCoeu4fZv0TXl8jvZIWd"};
    }

    public ZM(DU du) {
        this.A0B = du;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.Format A00(java.lang.String r17, com.facebook.ads.redexgen.X.DR r18, com.facebook.ads.redexgen.X.DR r19, com.facebook.ads.redexgen.X.DR r20) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZM.A00(java.lang.String, com.facebook.ads.redexgen.X.DR, com.facebook.ads.redexgen.X.DR, com.facebook.ads.redexgen.X.DR):com.facebook.ads.internal.exoplayer2.Format");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(long r6, int r8, int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZM.A04(long, int, int, long):void");
    }

    private void A05(long j2, int i2, int i3, long j3) {
        if (this.A05) {
            this.A03.A04(j2, i2, i3, j3);
        } else {
            this.A0A.A02(i3);
            this.A08.A02(i3);
            this.A06.A02(i3);
        }
        this.A07.A02(i3);
        this.A09.A02(i3);
    }

    public static void A06(C0769Im c0769Im) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                if (!c0769Im.A0B()) {
                    c0769Im.A05();
                } else {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        c0769Im.A04();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        c0769Im.A04();
                    }
                }
                int i5 = 3;
                if (i2 != 3) {
                    i5 = 1;
                }
                i3 += i5;
            }
        }
    }

    public static void A07(C0769Im c0769Im) {
        int iA05 = c0769Im.A05();
        boolean zA0B = false;
        int stRpsIdx = 0;
        for (int numNegativePics = 0; numNegativePics < iA05; numNegativePics++) {
            if (numNegativePics != 0) {
                zA0B = c0769Im.A0B();
            }
            if (zA0B) {
                c0769Im.A07();
                c0769Im.A05();
                for (int i2 = 0; i2 <= stRpsIdx; i2++) {
                    if (c0769Im.A0B()) {
                        c0769Im.A07();
                    }
                }
            } else {
                int numPositivePics = c0769Im.A05();
                int iA052 = c0769Im.A05();
                stRpsIdx = numPositivePics + iA052;
                for (int i3 = 0; i3 < numPositivePics; i3++) {
                    c0769Im.A05();
                    c0769Im.A07();
                }
                for (int i4 = 0; i4 < iA052; i4++) {
                    c0769Im.A05();
                    if (A0F[2].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    strArr[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    c0769Im.A07();
                }
            }
        }
    }

    private void A08(byte[] bArr, int i2, int i3) {
        if (this.A05) {
            this.A03.A05(bArr, i2, i3);
        } else {
            this.A0A.A03(bArr, i2, i3);
            this.A08.A03(bArr, i2, i3);
            this.A06.A03(bArr, i2, i3);
        }
        this.A07.A03(bArr, i2, i3);
        this.A09.A03(bArr, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) {
        while (c0768Il.A05() > 0) {
            int iA07 = c0768Il.A07();
            int iA08 = c0768Il.A08();
            byte[] bArr = c0768Il.A00;
            this.A01 += (long) c0768Il.A05();
            this.A02.ACh(c0768Il, c0768Il.A05());
            while (iA07 < iA08) {
                int iA04 = C0764Ih.A04(bArr, iA07, iA08, this.A0D);
                if (iA04 == iA08) {
                    A08(bArr, iA07, iA08);
                    return;
                }
                int iA00 = C0764Ih.A00(bArr, iA04);
                int nalUnitType = iA04 - iA07;
                if (nalUnitType > 0) {
                    A08(bArr, iA07, iA04);
                }
                int lengthToNalUnit = iA08 - iA04;
                long j2 = this.A01 - ((long) lengthToNalUnit);
                A04(j2, lengthToNalUnit, nalUnitType < 0 ? -nalUnitType : 0, this.A00);
                long absolutePosition = this.A00;
                A05(j2, lengthToNalUnit, iA00, absolutePosition);
                iA07 = iA04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A04 = dz.A05();
        this.A02 = ch.ADb(dz.A04(), 2);
        this.A03 = new DQ(this.A02);
        this.A0B.A03(ch, dz);
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        C0764Ih.A0C(this.A0D);
        this.A0A.A01();
        this.A08.A01();
        this.A06.A01();
        this.A07.A01();
        this.A09.A01();
        this.A03.A02();
        this.A01 = 0L;
    }
}
