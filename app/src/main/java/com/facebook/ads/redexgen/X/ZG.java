package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZG implements DL {
    public static byte[] A0H;
    public static String[] A0I;
    public static final byte[] A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public CR A07;
    public CR A08;
    public CR A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final C0767Ik A0D;
    public final C0768Il A0E;
    public final String A0F;
    public final boolean A0G;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] - i4) - 49);
            if (A0I[4].charAt(1) != 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[4] = "bnluMaXE1Uw3b3JGoNOZfy6HcCqjlXqz";
            strArr[4] = "bnluMaXE1Uw3b3JGoNOZfy6HcCqjlXqz";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-120, 124, -66, -47, -48, 124, -67, -49, -49, -47, -55, -59, -54, -61, 124, -99, -99, -97, 124, -88, -97, -118, -118, -83, -67, -68, -101, -82, -86, -83, -82, -69, -18, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, -54, 11, 31, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 25, -54, 25, 12, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 30, -54, 30, 35, 26, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -28, -54, -26, -11, -11, -15, -18, -24, -26, -7, -18, -12, -13, -76, -18, -23, -72, DateTimeFieldType.CLOCKHOUR_OF_DAY, 36, DateTimeFieldType.MINUTE_OF_HOUR, 24, 30, -34, 28, 31, -29, DateTimeFieldType.CLOCKHOUR_OF_DAY, -36, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, 35, 28};
    }

    public static void A07() {
        A0I = new String[]{"wge6vcbYVd2LlwU9IzXxO7y1yc7Npjql", "e4ah1", "HxlECSCujzZIBhcakhB8llOPpIPg4jPi", "c3jgZ7razfwrLoite54T", "YnWTxT53I9VC0eKuEFoJi1GxqSMOrSIM", "mGJBSiyG9M2YGViPKeXmqCjoZalx0YC5", "VtpTHv8dn8NrwXo7ikKBEmVWKD8j4YCX", "dqOZRsMzwGVkln1A4hbisIXuNnIWGGSy"};
    }

    static {
        A07();
        A06();
        A0J = new byte[]{73, 68, 51};
    }

    public ZG(boolean z) {
        this(z, null);
    }

    public ZG(boolean z, String str) {
        this.A0D = new C0767Ik(new byte[7]);
        this.A0E = new C0768Il(Arrays.copyOf(A0J, 10));
        A03();
        this.A0G = z;
        this.A0F = str;
    }

    private void A01() throws AI {
        this.A0D.A08(0);
        if (!this.A0C) {
            int iA05 = this.A0D.A05(2) + 1;
            if (iA05 != 2) {
                Log.w(A00(22, 10, 24), A00(32, 28, 121) + iA05 + A00(0, 22, 43));
                iA05 = 2;
            }
            int iA052 = this.A0D.A05(4);
            this.A0D.A09(1);
            int sampleRateIndex = this.A0D.A05(3);
            byte[] bArrA08 = IQ.A08(iA05, iA052, sampleRateIndex);
            Pair<Integer, Integer> pairA03 = IQ.A03(bArrA08);
            Format formatA07 = Format.A07(this.A0A, A00(75, 15, 126), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArrA08), null, 0, this.A0F);
            this.A05 = 1024000000 / ((long) formatA07.A0C);
            this.A09.A5B(formatA07);
            this.A0C = true;
        } else {
            C0767Ik c0767Ik = this.A0D;
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int sampleSize = str2.length();
            if (length == sampleSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[4] = "gnfbeCT7ETb0BF6eGTwxRLZIMNoo6eBq";
            strArr2[4] = "gnfbeCT7ETb0BF6eGTwxRLZIMNoo6eBq";
            c0767Ik.A09(10);
        }
        this.A0D.A09(4);
        int iA053 = (this.A0D.A05(13) - 2) - 5;
        if (this.A0B) {
            iA053 -= 2;
        }
        CR cr = this.A09;
        long j2 = this.A05;
        if (A0I[0].charAt(1) != 'g') {
            throw new RuntimeException();
        }
        String[] strArr3 = A0I;
        strArr3[5] = "DPeEZCdjnoP4QwMjUw7HIDON5EObNWtY";
        strArr3[6] = "TWt76gMmW2EkEQM2OhdsBT8X6vSrq3Ij";
        A08(cr, j2, 0, iA053);
    }

    private void A02() {
        this.A08.ACh(this.A0E, 10);
        this.A0E.A0Z(6);
        A08(this.A08, 0L, 10, this.A0E.A0E() + 10);
    }

    private void A03() {
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 256;
    }

    private void A04() {
        this.A03 = 2;
        this.A00 = 0;
    }

    private void A05() {
        this.A03 = 1;
        this.A00 = A0J.length;
        this.A02 = 0;
        this.A0E.A0Z(0);
    }

    private void A08(CR cr, long j2, int i2, int i3) {
        this.A03 = 3;
        this.A00 = i2;
        this.A07 = cr;
        this.A04 = j2;
        this.A02 = i3;
    }

    private void A09(C0768Il c0768Il) {
        byte[] bArr = c0768Il.A00;
        int position = c0768Il.A07();
        int iA08 = c0768Il.A08();
        while (position < iA08) {
            int i2 = position + 1;
            int i3 = bArr[position] & 255;
            int position2 = this.A01;
            if (position2 == 512 && i3 >= 240 && i3 != 255) {
                int position3 = i3 & 1;
                this.A0B = position3 == 0;
                A04();
                c0768Il.A0Z(i2);
                return;
            }
            int i4 = this.A01;
            int i5 = i4 | i3;
            if (i5 == 329) {
                this.A01 = 768;
            } else if (i5 == 511) {
                this.A01 = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            } else if (i5 == 836) {
                this.A01 = 1024;
            } else if (i5 != 1075) {
                if (i4 != 256) {
                    this.A01 = 256;
                    position = i2 - 1;
                }
            } else {
                A05();
                c0768Il.A0Z(i2);
                return;
            }
            position = i2;
        }
        c0768Il.A0Z(position);
    }

    private void A0A(C0768Il c0768Il) {
        int iMin = Math.min(c0768Il.A05(), this.A02 - this.A00);
        this.A07.ACh(c0768Il, iMin);
        this.A00 += iMin;
        int i2 = this.A00;
        int i3 = this.A02;
        if (i2 == i3) {
            this.A07.ACi(this.A06, 1, i3, 0, null);
            this.A06 += this.A04;
            A03();
        }
    }

    private boolean A0B(C0768Il c0768Il, byte[] bArr, int i2) {
        int iMin = Math.min(c0768Il.A05(), i2 - this.A00);
        c0768Il.A0d(bArr, this.A00, iMin);
        this.A00 += iMin;
        return this.A00 == i2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A48(C0768Il c0768Il) throws AI {
        while (c0768Il.A05() > 0) {
            int i2 = this.A03;
            if (i2 == 0) {
                A09(c0768Il);
            } else if (i2 != 1) {
                String[] strArr = A0I;
                if (strArr[5].charAt(25) == strArr[6].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "9CqnxzaEQimEcBf5cSINZxdBysafSxdF";
                strArr2[6] = "zLp55t2V8ycwykcXwXcmLQHdTFNUXCiS";
                if (i2 == 2) {
                    boolean zA0B = A0B(c0768Il, this.A0D.A00, this.A0B ? 7 : 5);
                    if (A0I[0].charAt(1) == 'g') {
                        String[] strArr3 = A0I;
                        strArr3[3] = "PBSyuwIG2tPzzgRnoBM9";
                        strArr3[1] = "owzwp";
                        if (zA0B) {
                            A01();
                        }
                    } else if (zA0B) {
                        A01();
                    }
                } else if (i2 == 3) {
                    A0A(c0768Il);
                }
            } else if (A0B(c0768Il, this.A0E.A00, 10)) {
                A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void A4V(CH ch, DZ dz) {
        dz.A06();
        this.A0A = dz.A05();
        this.A09 = ch.ADb(dz.A04(), 1);
        if (this.A0G) {
            dz.A06();
            this.A08 = ch.ADb(dz.A04(), 4);
            this.A08.A5B(Format.A0B(dz.A05(), A00(60, 15, 84), null, -1, null));
            return;
        }
        this.A08 = new C1165Ya();
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABX() {
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ABY(long j2, boolean z) {
        this.A06 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.DL
    public final void ACl() {
        A03();
    }
}
