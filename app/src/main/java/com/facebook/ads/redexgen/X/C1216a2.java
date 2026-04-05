package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1216a2 implements FY {
    public static String[] A03;
    public boolean A00;
    public final FY A01;
    public final /* synthetic */ BR A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"Y0RqBQKF49030hyQzszDurtmlsUicf4U", "tAeRat44Mts19", "EPGGJhXl7bdoeZDT1hnWH0ijeyZXJvPV", "NBArrZMeyPwcwZbguPm4zDdVfStRBHKE", "9Syc9rzKlnhB1gjxfWOFcJRGeL88RA9A", "zPpMUsK8OtHy3XCHJzxzsSjo5boBV7qo", "d", "R"};
    }

    public C1216a2(BR br, FY fy) {
        this.A02 = br;
        this.A01 = fy;
    }

    public final void A01() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final boolean A7m() {
        return !this.A02.A04() && this.A01.A7m();
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final void A8Y() throws IOException {
        this.A01.A8Y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r7 == Long.MIN_VALUE) goto L34;
     */
    @Override // com.facebook.ads.redexgen.X.FY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AC3(com.facebook.ads.redexgen.X.AC r12, com.facebook.ads.redexgen.X.YH r13, boolean r14) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.BR r0 = r11.A02
            boolean r0 = r0.A04()
            r8 = -3
            if (r0 == 0) goto La
            return r8
        La:
            boolean r0 = r11.A00
            r5 = 4
            r4 = -4
            if (r0 == 0) goto L14
            r13.A02(r5)
            return r4
        L14:
            com.facebook.ads.redexgen.X.FY r0 = r11.A01
            int r6 = r0.AC3(r12, r13, r14)
            r7 = -5
            r9 = -9223372036854775808
            if (r6 != r7) goto L4a
            com.facebook.ads.internal.exoplayer2.Format r8 = r12.A00
            int r0 = r8.A06
            if (r0 != 0) goto L29
            int r0 = r8.A07
            if (r0 == 0) goto L43
        L29:
            com.facebook.ads.redexgen.X.BR r0 = r11.A02
            long r1 = r0.A01
            r5 = 0
            r4 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L47
            r3 = 0
        L35:
            com.facebook.ads.redexgen.X.BR r0 = r11.A02
            long r1 = r0.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L44
        L3d:
            com.facebook.ads.internal.exoplayer2.Format r0 = r8.A0L(r3, r4)
            r12.A00 = r0
        L43:
            return r7
        L44:
            int r4 = r8.A07
            goto L3d
        L47:
            int r3 = r8.A06
            goto L35
        L4a:
            com.facebook.ads.redexgen.X.BR r0 = r11.A02
            long r0 = r0.A00
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L95
            if (r6 != r4) goto L5e
            long r2 = r13.A00
            com.facebook.ads.redexgen.X.BR r0 = r11.A02
            long r0 = r0.A00
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L85
        L5e:
            if (r6 != r8) goto L95
            com.facebook.ads.redexgen.X.BR r0 = r11.A02
            long r7 = r0.A5Z()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1216a2.A03
            r0 = 0
            r1 = r1[r0]
            r0 = 9
            char r1 = r1.charAt(r0)
            r0 = 68
            if (r1 == r0) goto L8f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1216a2.A03
            java.lang.String r1 = "5QKVTlH6XMkdzqZX2Kpnrvt1Zx1xK1pY"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "sZN1P6CG5u8rJaXjKPttrcVUDogJ8FeU"
            r0 = 5
            r2[r0] = r1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L95
        L85:
            r13.A07()
            r13.A02(r5)
            r0 = 1
            r11.A00 = r0
            return r4
        L8f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1216a2.AC3(com.facebook.ads.redexgen.X.AC, com.facebook.ads.redexgen.X.YH, boolean):int");
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final int ADI(long j2) {
        if (this.A02.A04()) {
            return -3;
        }
        return this.A01.ADI(j2);
    }
}
