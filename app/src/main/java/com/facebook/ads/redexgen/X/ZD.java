package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZD implements DL {
    public static String[] A0C;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public CR A06;
    public String A07;
    public boolean A08;
    public final C0767Ik A09;
    public final C0768Il A0A;
    public final String A0B;

    static {
        A01();
    }

    public static void A01() {
        A0C = new String[]{"nJiMpwDCR7ZAmhQyp9AOHiC56UVcRx0k", "lCnqxh0y89Em7p481QheNATB6nErTPja", "EOgZonHCFyaPw1rQOdlgFposS9KMweND", "oVFhsCJtzutno5RzvIOwcHRYGNjJYB0M", "4", "S", "C7ZxqwSPJTae6vgKBRSPBAMVUD", "Gg5xSTo0LtnMpcaC7QBiBySoh1"};
    }

    public ZD() {
        this(null);
    }

    public ZD(String str) {
        this.A09 = new C0767Ik(new byte[128]);
        this.A0A = new C0768Il(this.A09.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00() {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.Ik r1 = r13.A09
            r0 = 0
            r1.A08(r0)
            com.facebook.ads.redexgen.X.Ik r0 = r13.A09
            com.facebook.ads.redexgen.X.Am r1 = com.facebook.ads.redexgen.X.C0582An.A09(r0)
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            if (r0 == 0) goto L4c
            int r2 = r1.A00
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            int r0 = r0.A05
            if (r2 != r0) goto L4c
            int r4 = r1.A03
            com.facebook.ads.internal.exoplayer2.Format r5 = r13.A05
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.ZD.A0C
            r0 = 5
            r2 = r3[r0]
            r0 = 4
            r0 = r3[r0]
            int r2 = r2.length()
            int r0 = r0.length()
            if (r2 == r0) goto L34
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L34:
            java.lang.String[] r3 = com.facebook.ads.redexgen.X.ZD.A0C
            java.lang.String r2 = "c77shWRMJ0xw1RnCUz3RaGOhMvVQh1Vq"
            r0 = 2
            r3[r0] = r2
            java.lang.String r2 = "c77shWRMJ0xw1RnCUz3RaGOhMvVQh1Vq"
            r0 = 2
            r3[r0] = r2
            int r0 = r5.A0C
            if (r4 != r0) goto L4c
            java.lang.String r2 = r1.A05
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            java.lang.String r0 = r0.A0O
            if (r2 == r0) goto L69
        L4c:
            java.lang.String r2 = r13.A07
            java.lang.String r3 = r1.A05
            r4 = 0
            r5 = -1
            r6 = -1
            int r7 = r1.A00
            int r8 = r1.A03
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = r13.A0B
            com.facebook.ads.internal.exoplayer2.Format r0 = com.facebook.ads.internal.exoplayer2.Format.A07(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A05 = r0
            com.facebook.ads.redexgen.X.CR r2 = r13.A06
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            r2.A5B(r0)
        L69:
            int r0 = r1.A01
            r13.A01 = r0
            r4 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r1.A02
            long r2 = (long) r0
            long r2 = r2 * r4
            com.facebook.ads.internal.exoplayer2.Format r0 = r13.A05
            int r0 = r0.A0C
            long r0 = (long) r0
            long r2 = r2 / r0
            r13.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZD.A00():void");
    }

    private boolean A02(C0768Il c0768Il) {
        while (true) {
            if (c0768Il.A05() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c0768Il.A0F() == 11;
            } else {
                int iA0F = c0768Il.A0F();
                if (iA0F == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0F == 11;
            }
        }
    }

    private boolean A03(C0768Il c0768Il, byte[] bArr, int i2) {
        int iMin = Math.min(c0768Il.A05(), i2 - this.A00);
        c0768Il.A0d(bArr, this.A00, iMin);
        this.A00 += iMin;
        return this.A00 == i2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) {
        while (c0768Il.A05() > 0) {
            int i2 = this.A02;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int iMin = Math.min(c0768Il.A05(), this.A01 - this.A00);
                        this.A06.ACh(c0768Il, iMin);
                        this.A00 += iMin;
                        int i3 = this.A00;
                        int i4 = this.A01;
                        if (i3 == i4) {
                            this.A06.ACi(this.A04, 1, i4, 0, null);
                            this.A04 += this.A03;
                            this.A02 = 0;
                        }
                    }
                } else if (A03(c0768Il, this.A0A.A00, 128)) {
                    A00();
                    this.A0A.A0Z(0);
                    this.A06.ACh(this.A0A, 128);
                    this.A02 = 2;
                }
            } else if (A02(c0768Il)) {
                this.A02 = 1;
                this.A0A.A00[0] = 11;
                this.A0A.A00[1] = 119;
                this.A00 = 2;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A07 = dz.A05();
        this.A06 = ch.ADb(dz.A04(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        this.A04 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}
