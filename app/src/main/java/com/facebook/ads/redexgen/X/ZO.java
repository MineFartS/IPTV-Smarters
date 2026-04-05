package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZO implements DL {
    public static byte[] A0K;
    public static String[] A0L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public CR A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C0768Il A0I = new C0768Il(1024);
    public final C0767Ik A0H = new C0767Ik(this.A0I.A00);

    static {
        A05();
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    public static void A05() {
        A0L = new String[]{"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    }

    public ZO(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C0767Ik c0767Ik) throws AI {
        int iA02 = c0767Ik.A02();
        Pair<Integer, Integer> pairA02 = IQ.A02(c0767Ik, true);
        this.A05 = ((Integer) pairA02.first).intValue();
        this.A02 = ((Integer) pairA02.second).intValue();
        return iA02 - c0767Ik.A02();
    }

    private int A01(C0767Ik c0767Ik) throws AI {
        int iA05;
        int i2 = 0;
        if (this.A03 == 0) {
            do {
                iA05 = c0767Ik.A05(8);
                i2 += iA05;
            } while (iA05 == 255);
            return i2;
        }
        throw new AI();
    }

    public static long A02(C0767Ik c0767Ik) {
        return c0767Ik.A05((c0767Ik.A05(2) + 1) * 8);
    }

    private void A06(int i2) {
        this.A0I.A0X(i2);
        this.A0H.A0C(this.A0I.A00);
    }

    private void A07(C0767Ik c0767Ik) throws AI {
        if (!c0767Ik.A0G()) {
            this.A0G = true;
            A09(c0767Ik);
        } else if (!this.A0G) {
            return;
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A0A(c0767Ik, A01(c0767Ik));
                if (this.A0F) {
                    c0767Ik.A09((int) this.A09);
                    return;
                }
                return;
            }
            throw new AI();
        }
        throw new AI();
    }

    private void A08(C0767Ik c0767Ik) {
        this.A03 = c0767Ik.A05(3);
        int i2 = this.A03;
        if (i2 == 0) {
            c0767Ik.A09(8);
            return;
        }
        if (i2 != 1) {
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                if (i2 != 6) {
                    if (A0L[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0L;
                    strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                    strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                    if (i2 != 7) {
                        return;
                    }
                }
                c0767Ik.A09(1);
                return;
            }
            c0767Ik.A09(6);
            return;
        }
        c0767Ik.A09(9);
    }

    private void A09(C0767Ik c0767Ik) throws AI {
        boolean zA0G;
        int numProgram = c0767Ik.A05(1);
        int bitsRead = numProgram == 1 ? c0767Ik.A05(1) : 0;
        this.A00 = bitsRead;
        if (this.A00 == 0) {
            if (numProgram == 1) {
                A02(c0767Ik);
            }
            if (c0767Ik.A0G()) {
                this.A04 = c0767Ik.A05(6);
                int iA05 = c0767Ik.A05(4);
                int iA052 = c0767Ik.A05(3);
                if (iA05 == 0 && iA052 == 0) {
                    if (numProgram == 0) {
                        int readBits = c0767Ik.A04();
                        int iA00 = A00(c0767Ik);
                        c0767Ik.A08(readBits);
                        int readBits2 = iA00 + 7;
                        byte[] initData = new byte[readBits2 / 8];
                        c0767Ik.A0E(initData, 0, iA00);
                        Format formatA07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(initData), null, 0, this.A0J);
                        if (!formatA07.equals(this.A0C)) {
                            this.A0C = formatA07;
                            this.A0A = 1024000000 / ((long) formatA07.A0C);
                            this.A0D.A5B(formatA07);
                        }
                    } else {
                        int iA02 = (int) A02(c0767Ik);
                        int bitsRead2 = A00(c0767Ik);
                        c0767Ik.A09(iA02 - bitsRead2);
                    }
                    A08(c0767Ik);
                    this.A0F = c0767Ik.A0G();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (numProgram == 1) {
                            this.A09 = A02(c0767Ik);
                        } else {
                            do {
                                zA0G = c0767Ik.A0G();
                                this.A09 = (this.A09 << 8) + ((long) c0767Ik.A05(8));
                            } while (zA0G);
                        }
                    }
                    if (c0767Ik.A0G()) {
                        c0767Ik.A09(8);
                        return;
                    }
                    return;
                }
                throw new AI();
            }
            throw new AI();
        }
        throw new AI();
    }

    private void A0A(C0767Ik c0767Ik, int i2) {
        int iA04 = c0767Ik.A04();
        if ((iA04 & 7) == 0) {
            this.A0I.A0Z(iA04 >> 3);
        } else {
            c0767Ik.A0E(this.A0I.A00, 0, i2 * 8);
            this.A0I.A0Z(0);
        }
        this.A0D.ACh(this.A0I, i2);
        this.A0D.ACi(this.A0B, 1, i2, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) throws AI {
        while (c0768Il.A05() > 0) {
            int i2 = this.A08;
            if (i2 != 0) {
                if (i2 == 1) {
                    int iA0F = c0768Il.A0F();
                    if ((iA0F & 224) == 224) {
                        this.A07 = iA0F;
                        this.A08 = 2;
                    } else if (iA0F != 86) {
                        this.A08 = 0;
                    }
                } else {
                    if (A0L[7].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0L;
                    strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                    strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                    if (i2 == 2) {
                        this.A06 = ((this.A07 & (-225)) << 8) | c0768Il.A0F();
                        if (this.A06 > this.A0I.A00.length) {
                            A06(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                    } else if (i2 == 3) {
                        int iMin = Math.min(c0768Il.A05(), this.A06 - this.A01);
                        c0768Il.A0d(this.A0H.A00, this.A01, iMin);
                        this.A01 += iMin;
                        if (this.A01 == this.A06) {
                            this.A0H.A08(0);
                            A07(this.A0H);
                            this.A08 = 0;
                        }
                    }
                }
            } else if (c0768Il.A0F() == 86) {
                this.A08 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A0D = ch.ADb(dz.A04(), 1);
        this.A0E = dz.A05();
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        this.A0B = j2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        this.A08 = 0;
        this.A0G = false;
    }
}
