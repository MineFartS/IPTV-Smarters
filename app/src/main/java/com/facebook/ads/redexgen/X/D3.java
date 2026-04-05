package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D3 {
    public static String[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C0622Cm A07;
    public D2 A08;
    public C0768Il A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public int[] A0D;
    public int[] A0E;
    public long[] A0F;
    public long[] A0G;
    public boolean[] A0H;
    public boolean[] A0I;

    static {
        A00();
    }

    public static void A00() {
        A0J = new String[]{"0EwfBQL8WgkraFIT5", "yqBIkqshgk6o8aGC7JXOfAcvQBpSEoIE", "Pb3yD9oBE", "Sy7y64hwk", "hrTCG", "uTsL", "1ofsGt0E1HxH4l7d5", "0"};
    }

    public final long A01(int i2) {
        return this.A0F[i2] + ((long) this.A0C[i2]);
    }

    public final void A02() {
        this.A02 = 0;
        this.A06 = 0L;
        this.A0A = false;
        this.A0B = false;
        this.A08 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(int r5) {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Il r0 = r4.A09
            if (r0 == 0) goto L23
            int r3 = r0.A08()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D3.A0J
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto L4c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D3.A0J
            java.lang.String r1 = "O7sbivaH"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "O7sbivaH"
            r0 = 3
            r2[r0] = r1
            if (r3 >= r5) goto L2a
        L23:
            com.facebook.ads.redexgen.X.Il r0 = new com.facebook.ads.redexgen.X.Il
            r0.<init>(r5)
            r4.A09 = r0
        L2a:
            r4.A01 = r5
            r0 = 1
            r4.A0A = r0
            r4.A0B = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D3.A0J
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 20
            if (r1 == r0) goto L4b
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D3.A0J
            java.lang.String r1 = "ZqBRFK04oxBzllTVeb4xO6w8kHwYHjDg"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "ZqBRFK04oxBzllTVeb4xO6w8kHwYHjDg"
            r0 = 1
            r2[r0] = r1
            return
        L4b:
            return
        L4c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D3.A03(int):void");
    }

    public final void A04(int i2, int i3) {
        this.A02 = i2;
        this.A00 = i3;
        int[] iArr = this.A0E;
        if (iArr == null || iArr.length < i2) {
            this.A0G = new long[i2];
            this.A0E = new int[i2];
        }
        int[] iArr2 = this.A0D;
        if (iArr2 == null || iArr2.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.A0D = new int[i4];
            this.A0C = new int[i4];
            this.A0F = new long[i4];
            this.A0I = new boolean[i4];
            this.A0H = new boolean[i4];
        }
    }

    public final void A05(CG cg) throws InterruptedException, IOException {
        cg.readFully(this.A09.A00, 0, this.A01);
        this.A09.A0Z(0);
        this.A0B = false;
    }

    public final void A06(C0768Il c0768Il) {
        c0768Il.A0d(this.A09.A00, 0, this.A01);
        this.A09.A0Z(0);
        this.A0B = false;
    }
}
