package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZI implements DL {
    public static String[] A0B;
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public CR A07;
    public String A08;
    public final String A0A;
    public final C0768Il A09 = new C0768Il(new byte[18]);
    public int A02 = 0;

    static {
        A01();
    }

    public static void A01() {
        A0B = new String[]{"Egp8wbctYg3AnrLoFsY0muWOBg0DV21X", "e5h8xZQ9y742", "HWojDw1vanmhl7F", "V39ipiog0D", "u2piqSS4vuQoaStDwbY0GoBR5fBlfuuM", "rfNh4mzWhxdgTcwc6CqJaoU4clFtHzcH", "1g0ZSxhEfC", "eBXSmpY9RuNSQ1O4XZ5t"};
    }

    public ZI(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = BO.A03(bArr, this.A08, this.A0A, null);
            this.A07.A5B(this.A06);
        }
        this.A01 = BO.A01(bArr);
        this.A04 = (int) ((((long) BO.A02(bArr)) * 1000000) / ((long) this.A06.A0C));
    }

    private boolean A02(C0768Il c0768Il) {
        do {
            int iA05 = c0768Il.A05();
            String[] strArr = A0B;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[2] = "u2vG9yItOjfrtL1HZZufPW";
            strArr2[2] = "u2vG9yItOjfrtL1HZZufPW";
            if (iA05 <= 0) {
                return false;
            }
            this.A03 <<= 8;
            this.A03 |= c0768Il.A0F();
        } while (!BO.A08(this.A03));
        this.A09.A00[0] = (byte) ((this.A03 >> 24) & 255);
        this.A09.A00[1] = (byte) ((this.A03 >> 16) & 255);
        this.A09.A00[2] = (byte) ((this.A03 >> 8) & 255);
        this.A09.A00[3] = (byte) (this.A03 & 255);
        this.A00 = 4;
        this.A03 = 0;
        return true;
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
                if (i2 == 1) {
                    byte[] bArr = this.A09.A00;
                    String[] strArr = A0B;
                    if (strArr[5].charAt(14) == strArr[4].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0B;
                    strArr2[7] = "fRWG3CzCM1nyuvAzq7jz";
                    strArr2[0] = "3KzD1A3zkNrKwQoZtzGyJPl8BSj940od";
                    if (A03(c0768Il, bArr, 18)) {
                        A00();
                        this.A09.A0Z(0);
                        this.A07.ACh(this.A09, 18);
                        this.A02 = 2;
                    }
                } else if (i2 == 2) {
                    int iMin = Math.min(c0768Il.A05(), this.A01 - this.A00);
                    this.A07.ACh(c0768Il, iMin);
                    this.A00 += iMin;
                    int i3 = this.A00;
                    int i4 = this.A01;
                    if (i3 == i4) {
                        this.A07.ACi(this.A05, 1, i4, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                    }
                }
            } else if (A02(c0768Il)) {
                this.A02 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A08 = dz.A05();
        this.A07 = ch.ADb(dz.A04(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        this.A05 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}
