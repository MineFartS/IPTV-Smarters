package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZL implements DL {
    public static byte[] A0E;
    public static String[] A0F;
    public long A00;
    public long A01;
    public CR A02;
    public DP A03;
    public String A04;
    public boolean A05;
    public final DU A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final DR A08 = new DR(7, 128);
    public final DR A06 = new DR(8, 128);
    public final DR A07 = new DR(6, 128);
    public final C0768Il A0A = new C0768Il();

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    public static void A02() {
        A0F = new String[]{"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    }

    public ZL(DU du, boolean z, boolean z2) {
        this.A09 = du;
        this.A0B = z;
        this.A0C = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A03(long r25, int r27, int r28, long r29) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZL.A03(long, int, int, long):void");
    }

    private void A04(long j2, int i2, long j3) {
        if (!this.A05 || this.A03.A08()) {
            this.A08.A02(i2);
            this.A06.A02(i2);
        }
        this.A07.A02(i2);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A04(j2, i2, j3);
    }

    private void A05(byte[] bArr, int i2, int i3) {
        if (!this.A05 || this.A03.A08()) {
            this.A08.A03(bArr, i2, i3);
            this.A06.A03(bArr, i2, i3);
        }
        this.A07.A03(bArr, i2, i3);
        this.A03.A07(bArr, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) {
        int iA07 = c0768Il.A07();
        int iA08 = c0768Il.A08();
        byte[] bArr = c0768Il.A00;
        this.A01 += (long) c0768Il.A05();
        this.A02.ACh(c0768Il, c0768Il.A05());
        while (true) {
            int iA04 = C0764Ih.A04(bArr, iA07, iA08, this.A0D);
            if (iA04 == iA08) {
                A05(bArr, iA07, iA08);
                return;
            }
            int iA01 = C0764Ih.A01(bArr, iA04);
            int nalUnitOffset = iA04 - iA07;
            if (nalUnitOffset > 0) {
                A05(bArr, iA07, iA04);
            }
            int i2 = iA08 - iA04;
            long j2 = this.A01 - ((long) i2);
            int offset = nalUnitOffset < 0 ? -nalUnitOffset : 0;
            A03(j2, i2, offset, this.A00);
            A04(j2, iA01, this.A00);
            iA07 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A04 = dz.A05();
        this.A02 = ch.ADb(dz.A04(), 2);
        this.A03 = new DP(this.A02, this.A0B, this.A0C);
        this.A09.A03(ch, dz);
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
        this.A08.A01();
        this.A06.A01();
        this.A07.A01();
        this.A03.A02();
        this.A01 = 0L;
    }
}
