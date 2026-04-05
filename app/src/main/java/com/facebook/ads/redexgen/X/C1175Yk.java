package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1175Yk extends CT {
    public static byte[] A05;
    public static String[] A06;
    public int A00;
    public int A01;
    public boolean A02;
    public final C0768Il A03;
    public final C0768Il A04;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{1, 62, 51, 50, 56, 119, 49, 56, 37, 58, 54, 35, 119, 57, 56, 35, 119, 36, 34, 39, 39, 56, 37, 35, 50, 51, 109, 119, 91, 68, 73, 72, 66, 2, 76, 91, 78};
    }

    public static void A02() {
        A06 = new String[]{"HrBrUDmtAiHhEIFi", "ovhYl7NWEd171z8PJdmzSHTS5BmNRwGh", "O04BUWOaHdfjopELTyPlWCM73tUUR1GH", "jF3DEBpuUmaMt5XqjGdbc3EKLhdJIOP", "6wGSczOuIh6bVbI0f7FgwzIt", "67fT6B3p0kUWiMxqOkjfZNmnVryLDGGV", "w97Hra0FQmNyyw573", "JpIXAL9FgQ2FQzjAVAZn2BwWekNoW7nE"};
    }

    public C1175Yk(CR cr) {
        super(cr);
        this.A04 = new C0768Il(C0764Ih.A03);
        this.A03 = new C0768Il(4);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final void A0C(C0768Il c0768Il, long j2) throws AI {
        int iA0F = c0768Il.A0F();
        long jA0A = j2 + (((long) c0768Il.A0A()) * 1000);
        if (iA0F == 0 && !this.A02) {
            C0768Il videoSequence = new C0768Il(new byte[c0768Il.A05()]);
            c0768Il.A0d(videoSequence.A00, 0, c0768Il.A05());
            J3 j3A00 = J3.A00(videoSequence);
            this.A01 = j3A00.A02;
            super.A00.A5B(Format.A03(null, A00(28, 9, 114), null, -1, -1, j3A00.A03, j3A00.A01, -1.0f, j3A00.A04, -1, j3A00.A00, null));
            this.A02 = true;
            return;
        }
        if (iA0F != 1 || !this.A02) {
            return;
        }
        byte[] bArr = this.A03.A00;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        int i2 = 4 - this.A01;
        int i3 = 0;
        while (c0768Il.A05() > 0) {
            c0768Il.A0d(this.A03.A00, i2, this.A01);
            this.A03.A0Z(0);
            int iA0I = this.A03.A0I();
            this.A04.A0Z(0);
            super.A00.ACh(this.A04, 4);
            super.A00.ACh(c0768Il, iA0I);
            i3 = i3 + 4 + iA0I;
        }
        CR cr = super.A00;
        int i4 = this.A00 != 1 ? 0 : 1;
        if (A06[6].length() == 3) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "SxoTsTEtYbkIpzmogJvkXCUruqqJ7knT";
        strArr[7] = "DX7TKSEUbLiNIzjv4P1HkLtMAUktYoJf";
        cr.ACi(jA0A, i4, i3, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A0D(C0768Il c0768Il) throws C1174Yj {
        int iA0F = c0768Il.A0F();
        int i2 = (iA0F >> 4) & 15;
        int i3 = iA0F & 15;
        if (i3 == 7) {
            this.A00 = i2;
            return i2 != 5;
        }
        throw new C1174Yj(A00(0, 28, 8) + i3);
    }
}
