package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z3 implements D8, CO {
    public static String[] A05;
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ Z4 A04;

    static {
        A00();
    }

    public static void A00() {
        A05 = new String[]{"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    }

    public Z3(Z4 z4) {
        this.A04 = z4;
    }

    public final void A01(long j2) {
        this.A00 = j2;
    }

    public final void A02(C0768Il c0768Il) {
        c0768Il.A0a(1);
        int iA0H = c0768Il.A0H() / 18;
        this.A02 = new long[iA0H];
        this.A03 = new long[iA0H];
        for (int i2 = 0; i2 < iA0H; i2++) {
            this.A02[i2] = c0768Il.A0M();
            if (A05[4].charAt(31) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i2] = c0768Il.A0M();
            c0768Il.A0a(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final CO A4S() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A04.A01.A01();
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        int iA0B = J1.A0B(this.A02, this.A04.A05(j2), true, true);
        long seekTimeUs = this.A04.A04(this.A02[iA0B]);
        CP cp = new CP(seekTimeUs, this.A00 + this.A03[iA0B]);
        if (seekTimeUs < j2) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                long jA04 = this.A04.A04(jArr[iA0B + 1]);
                long secondSeekTimeUs = this.A00;
                return new CN(cp, new CP(jA04, secondSeekTimeUs + this.A03[iA0B + 1]));
            }
        }
        return new CN(cp);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long AC1(CG cg) throws InterruptedException, IOException {
        long j2 = this.A01;
        if (j2 < 0) {
            return -1L;
        }
        long j3 = -(j2 + 2);
        this.A01 = -1L;
        return j3;
    }

    @Override // com.facebook.ads.redexgen.X.D8
    public final long ADQ(long j2) {
        long jA05 = this.A04.A05(j2);
        this.A01 = this.A02[J1.A0B(this.A02, jA05, true, true)];
        return jA05;
    }
}
