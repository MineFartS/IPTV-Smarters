package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1229aG implements CR {
    public static String[] A0F;
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public FW A04;
    public FW A05;
    public FW A06;
    public FX A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final HZ A0D;
    public final FV A0C = new FV();
    public final FU A0B = new FU();
    public final C0768Il A0E = new C0768Il(32);

    static {
        A02();
    }

    public static void A02() {
        A0F = new String[]{"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    }

    public C1229aG(HZ hz) {
        this.A0D = hz;
        this.A0A = hz.A6S();
        this.A04 = new FW(0L, this.A0A);
        FW fw = this.A04;
        this.A05 = fw;
        this.A06 = fw;
    }

    private int A00(int i2) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3N(), new FW(this.A06.A03, this.A0A));
        }
        return Math.min(i2, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j2) {
        if (format == null) {
            return null;
        }
        if (j2 != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0M(format.A0G + j2);
        }
        return format;
    }

    private void A03(int i2) {
        this.A01 += (long) i2;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A04(long j2) {
        while (j2 >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A05(long j2) {
        if (j2 == -1) {
            return;
        }
        while (j2 >= this.A04.A03) {
            HZ hz = this.A0D;
            HY hy = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            hz.ACH(hy);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A06(long j2, ByteBuffer byteBuffer, int i2) {
        A04(j2);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (this.A05.A03 - j2));
            byteBuffer.put(this.A05.A01.A01, this.A05.A00(j2), iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A07(long j2, byte[] bArr, int i2) {
        A04(j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (this.A05.A03 - j2));
            System.arraycopy(this.A05.A01.A01, this.A05.A00(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.YH r20, com.facebook.ads.redexgen.X.FU r21) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1229aG.A08(com.facebook.ads.redexgen.X.YH, com.facebook.ads.redexgen.X.FU):void");
    }

    private void A09(FW fw) {
        if (!fw.A02) {
            return;
        }
        boolean z = this.A06.A02;
        HY[] hyArr = new HY[(z ? 1 : 0) + (((int) (this.A06.A04 - fw.A04)) / this.A0A)];
        for (int i2 = 0; i2 < hyArr.length; i2++) {
            hyArr[i2] = fw.A01;
            fw = fw.A01();
        }
        this.A0D.ACI(hyArr);
    }

    private final void A0A(boolean z) {
        this.A0C.A0I(z);
        A09(this.A04);
        this.A04 = new FW(0L, this.A0A);
        FW fw = this.A04;
        this.A05 = fw;
        this.A06 = fw;
        this.A01 = 0L;
        this.A0D.ADc();
    }

    public final int A0B() {
        return this.A0C.A08();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D() {
        return this.A0C.A07();
    }

    public final int A0E(long j2, boolean z, boolean z2) {
        return this.A0C.A09(j2, z, z2);
    }

    public final int A0F(AC ac, YH yh, boolean z, boolean z2, long j2) {
        int iA0A = this.A0C.A0A(ac, yh, z, z2, this.A02, this.A0B);
        if (iA0A == -5) {
            this.A02 = ac.A00;
            return -5;
        }
        if (iA0A != -4) {
            if (iA0A == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!yh.A04()) {
            long j3 = yh.A00;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
            strArr[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
            if (j3 < j2) {
                yh.A00(Integer.MIN_VALUE);
            }
            if (yh.A0A()) {
                A08(yh, this.A0B);
            }
            yh.A09(this.A0B.A00);
            A06(this.A0B.A01, yh.A01, this.A0B.A00);
        }
        return -4;
    }

    public final long A0G() {
        return this.A0C.A0C();
    }

    public final Format A0H() {
        return this.A0C.A0F();
    }

    public final void A0I() {
        A05(this.A0C.A0B());
    }

    public final void A0J() {
        A0A(false);
    }

    public final void A0K() {
        this.A0C.A0G();
        this.A05 = this.A04;
    }

    public final void A0L(long j2, boolean z, boolean z2) {
        A05(this.A0C.A0E(j2, z, z2));
    }

    public final void A0M(FX fx) {
        this.A07 = fx;
    }

    public final boolean A0N() {
        return this.A0C.A0J();
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void A5B(Format format) {
        Format formatA01 = A01(format, this.A00);
        boolean zA0L = this.A0C.A0L(formatA01);
        this.A03 = format;
        this.A08 = false;
        FX fx = this.A07;
        if (fx != null && zA0L) {
            fx.ABF(formatA01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final int ACg(CG cg, int i2, boolean z) throws InterruptedException, IOException {
        int i3 = cg.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i2));
        if (i3 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A03(i3);
        if (A0F[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "gj56WjutkODHGuBsULoCjgk";
        strArr[5] = "cXoHIYif5j6YkS";
        return i3;
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void ACh(C0768Il c0768Il, int i2) {
        while (i2 > 0) {
            int iA00 = A00(i2);
            c0768Il.A0d(this.A06.A01.A01, this.A06.A00(this.A01), iA00);
            i2 -= iA00;
            A03(iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void ACi(long j2, int i2, int i3, int i4, CQ cq) {
        if (this.A08) {
            A5B(this.A03);
        }
        if (this.A09) {
            if ((i2 & 1) != 0) {
                FV fv = this.A0C;
                if (A0F[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
                strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
                if (!fv.A0K(j2)) {
                    return;
                }
                String[] strArr2 = A0F;
                if (strArr2[0].length() == strArr2[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0F;
                strArr3[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                strArr3[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                this.A09 = false;
            } else {
                return;
            }
        }
        long timeUs = j2 + this.A00;
        this.A0C.A0H(timeUs, i2, (this.A01 - ((long) i3)) - ((long) i4), i3, cq);
    }
}
