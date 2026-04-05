package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1172Yh implements CF {
    public static byte[] A0F;
    public static String[] A0G;
    public static final CI A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public CH A06;
    public C1170Yf A07;
    public C1175Yk A08;
    public boolean A09;
    public final C0768Il A0C = new C0768Il(4);
    public final C0768Il A0B = new C0768Il(9);
    public final C0768Il A0E = new C0768Il(11);
    public final C0768Il A0D = new C0768Il();
    public final C1173Yi A0A = new C1173Yi();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-117, -111, -101};
    }

    public static void A04() {
        A0G = new String[]{"F9KwQMNMxiTjkayDhPM6gvDLkPvUNcLn", "Em4FZTw9NeUBCVsnasMEsqdbQrmSbGq", BuildConfig.FLAVOR, "tDq5h6G1X4d5RY1LfaFLZXWqT85DrCya", "B5R7X", "Y", "Zp00UWtElOmikRSXEs37FpNUTZ5eWL9Y", "wqRNyyxlEoRi9"};
    }

    static {
        A04();
        A03();
        A0H = new C1171Yg();
        A0I = J1.A08(A01(0, 3, 9));
    }

    private C0768Il A00(CG cg) throws InterruptedException, IOException {
        if (this.A02 > this.A0D.A06()) {
            C0768Il c0768Il = this.A0D;
            c0768Il.A0c(new byte[Math.max(c0768Il.A06() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Z(0);
        }
        this.A0D.A0Y(this.A02);
        cg.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.ACn(new C1167Yc(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 != -9223372036854775807L) {
            return;
        }
        this.A04 = this.A0A.A0E() == -9223372036854775807L ? -this.A05 : 0L;
    }

    private void A05(CG cg) throws InterruptedException, IOException {
        cg.ADJ(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A06(CG cg) throws InterruptedException, IOException {
        if (!cg.AC5(this.A0B.A00, 0, 9, true)) {
            return false;
        }
        C0768Il c0768Il = this.A0B;
        if (A0G[4].length() == 15) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "xxv79KM5VyarLmUhQqEOMlbbyGFtPWOG";
        strArr[6] = "n0W8PrJEyrqWl4lCbLWkK9bcjvpbO2Fn";
        c0768Il.A0Z(0);
        this.A0B.A0a(4);
        int iA0F = this.A0B.A0F();
        boolean z = (iA0F & 4) != 0;
        boolean hasAudio = (iA0F & 1) != 0;
        if (z && this.A07 == null) {
            this.A07 = new C1170Yf(this.A06.ADb(8, 1));
        }
        if (hasAudio && this.A08 == null) {
            this.A08 = new C1175Yk(this.A06.ADb(9, 2));
        }
        this.A06.A4x();
        this.A00 = (this.A0B.A09() - 9) + 4;
        this.A01 = 2;
        return true;
    }

    private boolean A07(CG cg) throws InterruptedException, IOException {
        boolean z = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(cg), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(cg), this.A04 + this.A05);
        } else if (this.A03 == 18 && !this.A09) {
            this.A0A.A00(A00(cg), this.A05);
            long jA0E = this.A0A.A0E();
            if (jA0E != -9223372036854775807L) {
                this.A06.ACn(new C1167Yc(jA0E));
                this.A09 = true;
            }
        } else {
            int i2 = this.A02;
            if (A0G[4].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            strArr[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            cg.ADJ(i2);
            z = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A08(CG cg) throws InterruptedException, IOException {
        if (!cg.AC5(this.A0E.A00, 0, 11, true)) {
            return false;
        }
        this.A0E.A0Z(0);
        this.A03 = this.A0E.A0F();
        this.A02 = this.A0E.A0H();
        this.A05 = this.A0E.A0H();
        this.A05 = (((long) (this.A0E.A0F() << 24)) | this.A05) * 1000;
        this.A0E.A0a(3);
        this.A01 = 4;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A06 = ch;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        while (true) {
            int i2 = this.A01;
            if (i2 != 1) {
                if (i2 == 2) {
                    A05(cg);
                } else {
                    if (A0G[4].length() == 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0G;
                    strArr[4] = "ncW0XwKX3pgCRaaT";
                    strArr[4] = "ncW0XwKX3pgCRaaT";
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (A07(cg)) {
                                if (A0G[0].charAt(18) != 'j') {
                                    String[] strArr2 = A0G;
                                    strArr2[7] = "5";
                                    strArr2[7] = "5";
                                    return 0;
                                }
                                String[] strArr3 = A0G;
                                strArr3[7] = "DR5iBP2XCUKx659t";
                                strArr3[7] = "DR5iBP2XCUKx659t";
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!A08(cg)) {
                        return -1;
                    }
                }
            } else if (!A06(cg)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        cg.ABc(this.A0C.A00, 0, 3);
        this.A0C.A0Z(0);
        if (this.A0C.A0H() != A0I) {
            return false;
        }
        cg.ABc(this.A0C.A00, 0, 2);
        this.A0C.A0Z(0);
        if ((this.A0C.A0J() & 250) != 0) {
            return false;
        }
        cg.ABc(this.A0C.A00, 0, 4);
        this.A0C.A0Z(0);
        int iA09 = this.A0C.A09();
        cg.ACd();
        cg.A3M(iA09);
        cg.ABc(this.A0C.A00, 0, 4);
        this.A0C.A0Z(0);
        return this.A0C.A09() == 0;
    }
}
