package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1176Yl implements CX {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public CZ A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<CW> A05 = new ArrayDeque<>();
    public final C0614Ce A04 = new C0614Ce();

    static {
        A05();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, -128, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, -31, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, -31, -33, -42, -37, -44, -115, -46, -39, -46, -38, -46, -37, -31, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(CG cg, int i2) throws InterruptedException, IOException {
        long jA02 = A02(cg, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    private long A01(CG cg) throws InterruptedException, IOException {
        cg.ACd();
        while (true) {
            cg.ABc(this.A06, 0, 4);
            int iA00 = C0614Ce.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) C0614Ce.A01(this.A06, iA00, false);
                if (this.A03.A7j(iA01)) {
                    cg.ADJ(iA00);
                    return iA01;
                }
            }
            cg.ADJ(1);
        }
    }

    private long A02(CG cg, int i2) throws InterruptedException, IOException {
        cg.readFully(this.A06, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (this.A06[i3] & 255));
        }
        return j2;
    }

    private String A04(CG cg, int trimmedLength) throws InterruptedException, IOException {
        if (trimmedLength == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[trimmedLength];
        cg.readFully(bArr, 0, trimmedLength);
        while (trimmedLength > 0 && bArr[trimmedLength - 1] == 0) {
            trimmedLength--;
        }
        return new String(bArr, 0, trimmedLength);
    }

    @Override // com.facebook.ads.redexgen.X.CX
    public final void A7W(CZ cz) {
        this.A03 = cz;
    }

    @Override // com.facebook.ads.redexgen.X.CX
    public final boolean AC2(CG cg) throws InterruptedException, IOException {
        IM.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty() && cg.A6p() >= this.A05.peek().A01) {
                this.A03.A4w(this.A05.pop().A00);
                return true;
            }
            if (this.A01 == 0) {
                long jA05 = this.A04.A05(cg, true, false, 4);
                if (jA05 == -2) {
                    jA05 = A01(cg);
                }
                if (jA05 == -1) {
                    return false;
                }
                this.A00 = (int) jA05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(cg, false, true, 8);
                this.A01 = 2;
            }
            int iA68 = this.A03.A68(this.A00);
            if (iA68 != 0) {
                if (iA68 == 1) {
                    long jA6p = cg.A6p();
                    this.A05.push(new CW(this.A00, jA6p + this.A02));
                    this.A03.ADN(this.A00, jA6p, this.A02);
                    this.A01 = 0;
                    return true;
                }
                if (iA68 == 2) {
                    long j2 = this.A02;
                    if (j2 <= 8) {
                        this.A03.A7Y(this.A00, A02(cg, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new AI(A03(41, 22, 60) + this.A02);
                }
                if (iA68 == 3) {
                    long j3 = this.A02;
                    if (j3 <= 2147483647L) {
                        this.A03.ADU(this.A00, A04(cg, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new AI(A03(63, 21, 81) + this.A02);
                }
                if (iA68 == 4) {
                    this.A03.A3r(this.A00, (int) this.A02, cg);
                    this.A01 = 0;
                    return true;
                }
                if (iA68 == 5) {
                    long j4 = this.A02;
                    if (j4 == 4 || j4 == 8) {
                        this.A03.A59(this.A00, A00(cg, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw new AI(A03(21, 20, 82) + this.A02);
                }
                throw new AI(A03(0, 21, 0) + iA68);
            }
            cg.ADJ((int) this.A02);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CX
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
