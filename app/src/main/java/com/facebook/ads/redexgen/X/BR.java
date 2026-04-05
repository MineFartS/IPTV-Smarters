package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class BR implements InterfaceC1228aF, InterfaceC1227aE {
    public static String[] A06;
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC1227aE A03;
    public C1216a2[] A04 = new C1216a2[0];
    public final InterfaceC1228aF A05;

    static {
        A01();
    }

    public static void A01() {
        A06 = new String[]{"xZ98n6jXZ", "w0wM6S1AW5kwd8mBaLXb8IJFUPLi1ZSY", BuildConfig.FLAVOR, "5GeP1Ey0MjdLLaKEOlMigJbDmIHcG3Ps", "Q5WYazqpabUa99ZYxsI", "Gm0HQrfOciURdkrLDtJ", "cUS8ttxVNiquYZeS", "9hpvQN9G3pxye3p4YcQpNMMd2GK"};
    }

    public BR(InterfaceC1228aF interfaceC1228aF, boolean z, long j2, long j3) {
        this.A05 = interfaceC1228aF;
        this.A02 = z ? j2 : -9223372036854775807L;
        this.A01 = j2;
        this.A00 = j3;
    }

    private C0570Aa A00(long j2, C0570Aa c0570Aa) {
        long jA0F = J1.A0F(c0570Aa.A01, 0L, j2 - this.A01);
        long j3 = c0570Aa.A00;
        long j4 = this.A00;
        long jA0F2 = J1.A0F(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        if (jA0F == c0570Aa.A01 && jA0F2 == c0570Aa.A00) {
            return c0570Aa;
        }
        return new C0570Aa(jA0F, jA0F2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.FZ
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A9J(InterfaceC1228aF interfaceC1228aF) {
        this.A03.A9J(this);
    }

    public static boolean A03(long j2, HT[] htArr) {
        if (j2 != 0) {
            for (HT ht : htArr) {
                if (ht != null && !C0761Ie.A0C(ht.A6y().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A04() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final boolean A4A(long j2) {
        return this.A05.A4A(j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void A4n(long j2, boolean z) {
        this.A05.A4n(j2, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long A5K(long j2, C0570Aa c0570Aa) {
        long j3 = this.A01;
        if (j2 == j3) {
            return j3;
        }
        return this.A05.A5K(j2, A00(j2, c0570Aa));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long A5Z() {
        long jA5Z = this.A05.A5Z();
        if (jA5Z != Long.MIN_VALUE) {
            long j2 = this.A00;
            if (j2 == Long.MIN_VALUE || jA5Z < j2) {
                return jA5Z;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long A6c() {
        long jA6c = this.A05.A6c();
        if (jA6c != Long.MIN_VALUE) {
            long j2 = this.A00;
            if (j2 == Long.MIN_VALUE || jA6c < j2) {
                return jA6c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final TrackGroupArray A7E() {
        return this.A05.A7E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void A8Z() throws IOException {
        this.A05.A8Z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1227aE
    public final void AAd(InterfaceC1228aF interfaceC1228aF) {
        this.A03.AAd(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void ABl(InterfaceC1227aE interfaceC1227aE, long j2) {
        this.A03 = interfaceC1227aE;
        this.A05.ABl(this, j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final long AC4() {
        if (A04()) {
            long j2 = this.A02;
            this.A02 = -9223372036854775807L;
            long jAC4 = AC4();
            return jAC4 != -9223372036854775807L ? jAC4 : j2;
        }
        long jAC42 = this.A05.AC4();
        String[] strArr = A06;
        if (strArr[7].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "JN4lYhgdVtJugUzGLO1";
        strArr2[4] = "V7PIoeFvQi5pkabjQnk";
        if (jAC42 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        IM.A04(jAC42 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && jAC42 > discontinuityUs) {
            z = false;
        }
        IM.A04(z);
        return jAC42;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    public final void ACC(long j2) {
        this.A05.ACC(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ACq(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A02 = r0
            com.facebook.ads.redexgen.X.a2[] r3 = r8.A04
            int r2 = r3.length
            r7 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L18
            r0 = r3[r1]
            if (r0 == 0) goto L15
            r0.A01()
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            com.facebook.ads.redexgen.X.aF r0 = r8.A05
            long r5 = r0.ACq(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L34
            long r1 = r8.A01
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L34
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L35
        L34:
            r7 = 1
        L35:
            com.facebook.ads.redexgen.X.IM.A04(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BR.ACq(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1228aF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ACr(com.facebook.ads.redexgen.X.HT[] r16, boolean[] r17, com.facebook.ads.redexgen.X.FY[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r4 = r18
            int r0 = r4.length
            com.facebook.ads.redexgen.X.a2[] r0 = new com.facebook.ads.redexgen.X.C1216a2[r0]
            r15.A04 = r0
            int r0 = r4.length
            com.facebook.ads.redexgen.X.FY[] r11 = new com.facebook.ads.redexgen.X.FY[r0]
            r2 = 0
        Lb:
            int r0 = r4.length
            r3 = 0
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.a2[] r1 = r15.A04
            r0 = r4[r2]
            com.facebook.ads.redexgen.X.a2 r0 = (com.facebook.ads.redexgen.X.C1216a2) r0
            r1[r2] = r0
            r0 = r1[r2]
            if (r0 == 0) goto L1f
            r0 = r1[r2]
            com.facebook.ads.redexgen.X.FY r3 = r0.A01
        L1f:
            r11[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L24:
            com.facebook.ads.redexgen.X.aF r8 = r15.A05
            r10 = r17
            r9 = r16
            r13 = r20
            r12 = r19
            long r7 = r8.ACr(r9, r10, r11, r12, r13)
            boolean r0 = r15.A04()
            if (r0 == 0) goto L92
            long r0 = r15.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L92
            boolean r0 = A03(r0, r9)
            if (r0 == 0) goto L92
            r0 = r7
        L45:
            r15.A02 = r0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r1 = r15.A01
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L90
            long r1 = r15.A00
            r5 = -9223372036854775808
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L5d
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L90
        L5d:
            r0 = 1
        L5e:
            com.facebook.ads.redexgen.X.IM.A04(r0)
            r5 = 0
        L62:
            int r0 = r4.length
            if (r5 >= r0) goto L98
            r0 = r11[r5]
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.a2[] r0 = r15.A04
            r0[r5] = r3
        L6d:
            com.facebook.ads.redexgen.X.a2[] r0 = r15.A04
            r0 = r0[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L62
        L76:
            r0 = r4[r5]
            if (r0 == 0) goto L84
            com.facebook.ads.redexgen.X.a2[] r0 = r15.A04
            r0 = r0[r5]
            com.facebook.ads.redexgen.X.FY r1 = r0.A01
            r0 = r11[r5]
            if (r1 == r0) goto L6d
        L84:
            com.facebook.ads.redexgen.X.a2[] r2 = r15.A04
            com.facebook.ads.redexgen.X.a2 r1 = new com.facebook.ads.redexgen.X.a2
            r0 = r11[r5]
            r1.<init>(r15, r0)
            r2[r5] = r1
            goto L6d
        L90:
            r0 = 0
            goto L5e
        L92:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L45
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BR.ACr(com.facebook.ads.redexgen.X.HT[], boolean[], com.facebook.ads.redexgen.X.FY[], boolean[], long):long");
    }
}
