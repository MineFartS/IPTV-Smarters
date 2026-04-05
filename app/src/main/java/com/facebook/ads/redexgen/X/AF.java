package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AF {
    public static byte[] A0F;
    public static String[] A0G;
    public long A00;
    public AF A01;
    public AG A02;
    public TrackGroupArray A03;
    public HX A04;
    public boolean A05;
    public boolean A06;
    public HX A07;
    public final InterfaceC1228aF A08;
    public final Object A09;
    public final FY[] A0A;
    public final boolean[] A0B;
    public final FD A0C;
    public final HW A0D;
    public final AX[] A0E;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{42, 66, 65, 70, 62, 45, 66, 79, 70, 76, 65, 37, 76, 73, 65, 66, 79, 50, 71, 84, 75, 81, 70, 2, 84, 71, 78, 71, 67, 85, 71, 2, 72, 67, 75, 78, 71, 70, DateTimeFieldType.CLOCKHOUR_OF_DAY};
    }

    public static void A02() {
        A0G = new String[]{"veEP335vIU", "oLB3f1kinZ5WOxb9JrKF9bI12rnC7Hj4", "JTOn230cVZ0r3ImY4sjYKOAnliXJWsYG", "qI3jAuZXuqqi9ieUnmB3HYz1RRsZ6ptY", "FV6PRsoISyO05pqLoteca44", "2aqdzlIyDZTOMtMqQXI", "yc78GsDKEqwKVvSYIw58zbgjS6oh7wuT", "vKvp49qN2fZ5TwJRBPfaEcKl4xZFQEWJ"};
    }

    public AF(AX[] axArr, long j2, HW hw, HZ hz, FD fd, Object obj, AG ag) {
        this.A0E = axArr;
        this.A00 = j2 - ag.A03;
        this.A0D = hw;
        this.A0C = fd;
        this.A09 = IM.A01(obj);
        this.A02 = ag;
        this.A0A = new FY[axArr.length];
        this.A0B = new boolean[axArr.length];
        InterfaceC1228aF interfaceC1228aFA4Q = fd.A4Q(ag.A04, hz);
        this.A08 = ag.A02 != Long.MIN_VALUE ? new BR(interfaceC1228aFA4Q, true, 0L, ag.A02) : interfaceC1228aFA4Q;
    }

    private void A03(HX hx) {
        int i2 = 0;
        while (true) {
            int i3 = hx.A00;
            String[] strArr = A0G;
            if (strArr[1].charAt(21) != strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[2] = "zTmDI2eB0pskJnfpVdGiT2gSjaG941UO";
            strArr2[3] = "GwIuNKKr0Vh704cWvV3fzSTRpdmwONBr";
            if (i2 < i3) {
                boolean zA00 = hx.A00(i2);
                HT htA01 = hx.A01.A01(i2);
                if (zA00 && htA01 != null) {
                    htA01.A4t();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void A04(HX hx) {
        HX hx2 = this.A07;
        this.A07 = hx;
        HX hx3 = this.A07;
        if (hx3 != null) {
            A03(hx3);
        }
    }

    private void A05(FY[] fyArr) {
        int i2 = 0;
        while (true) {
            AX[] axArr = this.A0E;
            if (i2 < axArr.length) {
                if (axArr[i2].A7F() == 5 && this.A04.A00(i2)) {
                    fyArr[i2] = new C1222a9();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void A06(FY[] fyArr) {
        int i2 = 0;
        while (true) {
            AX[] axArr = this.A0E;
            if (i2 < axArr.length) {
                if (axArr[i2].A7F() == 5) {
                    fyArr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final long A07() {
        if (this.A06) {
            return this.A08.A6c();
        }
        return 0L;
    }

    public final long A08() {
        return this.A00;
    }

    public final long A09(long j2) {
        return j2 - A08();
    }

    public final long A0A(long j2) {
        return A08() + j2;
    }

    public final long A0B(long j2, boolean z) {
        return A0C(j2, z, new boolean[this.A0E.length]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A0C(long r13, boolean r15, boolean[] r16) {
        /*
            r12 = this;
            r4 = 0
        L1:
            com.facebook.ads.redexgen.X.HX r0 = r12.A04
            int r0 = r0.A00
            r2 = 0
            r3 = 1
            if (r4 >= r0) goto L1d
            boolean[] r3 = r12.A0B
            if (r15 != 0) goto L18
            com.facebook.ads.redexgen.X.HX r1 = r12.A04
            com.facebook.ads.redexgen.X.HX r0 = r12.A07
            boolean r0 = r1.A02(r0, r4)
            if (r0 == 0) goto L18
            r2 = 1
        L18:
            r3[r4] = r2
            int r4 = r4 + 1
            goto L1
        L1d:
            com.facebook.ads.redexgen.X.FY[] r0 = r12.A0A
            r12.A06(r0)
            com.facebook.ads.redexgen.X.HX r0 = r12.A04
            r12.A04(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AF.A0G
            r0 = 7
            r1 = r1[r0]
            r0 = 5
            char r1 = r1.charAt(r0)
            r0 = 57
            if (r1 == r0) goto L3b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3b:
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.AF.A0G
            java.lang.String r1 = "QjaNyuHuRXZwiIdLefV3JnB"
            r0 = 4
            r4[r0] = r1
            java.lang.String r1 = "qMpMOgpNZnnJVrHuPMC"
            r0 = 5
            r4[r0] = r1
            com.facebook.ads.redexgen.X.HX r0 = r12.A04
            com.facebook.ads.redexgen.X.HU r4 = r0.A01
            com.facebook.ads.redexgen.X.aF r5 = r12.A08
            com.facebook.ads.redexgen.X.HT[] r6 = r4.A02()
            boolean[] r7 = r12.A0B
            com.facebook.ads.redexgen.X.FY[] r8 = r12.A0A
            r10 = r13
            r9 = r16
            long r7 = r5.ACr(r6, r7, r8, r9, r10)
            com.facebook.ads.redexgen.X.FY[] r0 = r12.A0A
            r12.A05(r0)
            r12.A05 = r2
            r5 = 0
        L64:
            com.facebook.ads.redexgen.X.FY[] r1 = r12.A0A
            int r0 = r1.length
            if (r5 >= r0) goto Lbc
            r6 = r1[r5]
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AF.A0G
            r0 = 7
            r1 = r1[r0]
            r0 = 5
            char r1 = r1.charAt(r0)
            r0 = 57
            if (r1 == r0) goto La0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AF.A0G
            java.lang.String r1 = "ECZNN42Owql1H3dvmIySnd1"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "Y1ZBsUrBheVlA6CxnB4"
            r0 = 5
            r2[r0] = r1
            if (r6 == 0) goto Laf
        L87:
            com.facebook.ads.redexgen.X.HX r0 = r12.A04
            boolean r0 = r0.A00(r5)
            com.facebook.ads.redexgen.X.IM.A04(r0)
            com.facebook.ads.redexgen.X.AX[] r0 = r12.A0E
            r0 = r0[r5]
            int r1 = r0.A7F()
            r0 = 5
            if (r1 == r0) goto L9d
            r12.A05 = r3
        L9d:
            int r5 = r5 + 1
            goto L64
        La0:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AF.A0G
            java.lang.String r1 = "F5cg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "F5cg"
            r0 = 0
            r2[r0] = r1
            if (r6 == 0) goto Laf
            goto L87
        Laf:
            com.facebook.ads.redexgen.X.HT r0 = r4.A01(r5)
            if (r0 != 0) goto Lba
            r0 = 1
        Lb6:
            com.facebook.ads.redexgen.X.IM.A04(r0)
            goto L9d
        Lba:
            r0 = 0
            goto Lb6
        Lbc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AF.A0C(long, boolean, boolean[]):long");
    }

    public final long A0D(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long jA5Z = this.A08.A5Z();
        if (jA5Z != Long.MIN_VALUE || !z) {
            return jA5Z;
        }
        AG ag = this.A02;
        String[] strArr = A0G;
        if (strArr[1].charAt(21) != strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[0] = "Yxep602BeUF0L8l";
        strArr2[0] = "Yxep602BeUF0L8l";
        return ag.A01;
    }

    public final void A0E() {
        A04(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.ACL(((BR) this.A08).A05);
            } else {
                this.A0C.ACL(this.A08);
            }
        } catch (RuntimeException e2) {
            Log.e(A00(0, 17, 116), A00(17, 22, 121), e2);
        }
    }

    public final void A0F(float f2) throws C05699z {
        this.A06 = true;
        this.A03 = this.A08.A7E();
        A0J(f2);
        long jA0B = A0B(this.A02.A03, false);
        this.A00 += this.A02.A03 - jA0B;
        this.A02 = this.A02.A01(jA0B);
    }

    public final void A0G(long j2) {
        this.A08.A4A(A09(j2));
    }

    public final void A0H(long j2) {
        if (this.A06) {
            this.A08.ACC(A09(j2));
        }
    }

    public final boolean A0I() {
        return this.A06 && (!this.A05 || this.A08.A5Z() == Long.MIN_VALUE);
    }

    public final boolean A0J(float f2) throws C05699z {
        HX hxA0V = this.A0D.A0V(this.A0E, this.A03);
        if (hxA0V.A01(this.A07)) {
            return false;
        }
        this.A04 = hxA0V;
        for (HT trackSelection : this.A04.A01.A02()) {
            if (trackSelection != null) {
                trackSelection.AAW(f2);
            }
        }
        return true;
    }
}
