package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class DB {
    public static String[] A0D;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public CH A06;
    public CR A07;
    public D8 A08;
    public DA A09;
    public boolean A0A;
    public boolean A0B;
    public final D6 A0C = new D6();

    static {
        A02();
    }

    public static void A02() {
        A0D = new String[]{"vdpx440NSg8M4CnGdydtu5qQkftaFl81", "8FBVTf92WyxNz1PbVx8WfEYVHOwD1jYA", "DKJKTeADHw9YeVFClTVADEpoqL7THNTT", "QMHe7Xu97ps4f3hWTDxnFcitcXlvMrzA", "cT681YGQWd9DutiYQJBSPFEBPfK5r2m4", "EyU4ukvYlXQau4YgIYVQwMEfY7bgqA6h", "DftqlnKuE3jyyUo0DxEITdlkAR2KkpEx", "3J2n16rNLfrexVGozCu5PKnUXiDeYKol"};
    }

    public abstract long A08(C0768Il c0768Il);

    public abstract boolean A0B(C0768Il c0768Il, long j2, DA da) throws InterruptedException, IOException;

    private int A00(CG cg) throws InterruptedException, IOException {
        boolean zA0B = true;
        while (zA0B) {
            if (!this.A0C.A06(cg)) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = cg.A6p() - this.A04;
            zA0B = A0B(this.A0C.A03(), this.A04, this.A09);
            if (zA0B) {
                this.A04 = cg.A6p();
            }
        }
        this.A00 = this.A09.A00.A0C;
        if (!this.A0A) {
            this.A07.A5B(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            DA da = this.A09;
            String[] strArr = A0D;
            if (strArr[3].charAt(31) == strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "bh7MBcJSzFDWGWL7bYV4RFdmzZ5DJPtg";
            strArr2[4] = "jbTTtcEVTbmVVWffnqyGAcPkGPEAibSD";
            this.A08 = da.A01;
        } else if (cg.A6W() == -1) {
            this.A08 = new Z8();
        } else {
            D7 d7A02 = this.A0C.A02();
            this.A08 = new Z2(this.A04, cg.A6W(), this, d7A02.A01 + d7A02.A00, d7A02.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A05();
        return 0;
    }

    private int A01(CG cg, CM cm) throws InterruptedException, IOException {
        long jAC1 = this.A08.AC1(cg);
        if (jAC1 >= 0) {
            cm.A00 = jAC1;
            return 1;
        }
        if (jAC1 < -1) {
            A09(-(2 + jAC1));
        }
        boolean z = this.A0B;
        if (A0D[1].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[6] = "YKdoYyhEaGRVIGwSTWAYioMwjJxRxWbM";
        strArr[6] = "YKdoYyhEaGRVIGwSTWAYioMwjJxRxWbM";
        if (!z) {
            this.A06.ACn(this.A08.A4S());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A06(cg)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        C0768Il c0768IlA03 = this.A0C.A03();
        long jA08 = A08(c0768IlA03);
        if (jA08 >= 0) {
            long j2 = this.A02;
            long granulesInPacket = j2 + jA08;
            if (granulesInPacket >= this.A05) {
                long jA04 = A04(j2);
                this.A07.ACh(c0768IlA03, c0768IlA03.A08());
                this.A07.ACi(jA04, 1, c0768IlA03.A08(), 0, null);
                this.A05 = -1L;
            }
        }
        long timeUs = this.A02;
        this.A02 = timeUs + jA08;
        return 0;
    }

    public final int A03(CG cg, CM cm) throws InterruptedException, IOException {
        int i2 = this.A01;
        if (i2 == 0) {
            return A00(cg);
        }
        if (i2 == 1) {
            cg.ADJ((int) this.A04);
            this.A01 = 2;
            return 0;
        }
        if (i2 == 2) {
            int iA01 = A01(cg, cm);
            if (A0D[6].charAt(6) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[1] = "ecnT7ItXVuTi5H8Gayt4a9jA0qUq5vI3";
            strArr[1] = "ecnT7ItXVuTi5H8Gayt4a9jA0qUq5vI3";
            return iA01;
        }
        throw new IllegalStateException();
    }

    public final long A04(long j2) {
        return (1000000 * j2) / ((long) this.A00);
    }

    public final long A05(long j2) {
        return (((long) this.A00) * j2) / 1000000;
    }

    public final void A06(long j2, long j3) {
        this.A0C.A04();
        if (j2 == 0) {
            A0A(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = this.A08.ADQ(j3);
            this.A01 = 2;
        }
    }

    public final void A07(CH ch, CR cr) {
        this.A06 = ch;
        this.A07 = cr;
        A0A(true);
    }

    public void A09(long j2) {
        this.A02 = j2;
    }

    public void A0A(boolean z) {
        if (z) {
            this.A09 = new DA();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
