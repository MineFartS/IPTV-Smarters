package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CY implements InterfaceC1181Yq {
    public static byte[] A05;
    public static String[] A06;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            strArr2[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 106);
            i5++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        strArr2[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, 27, 95, 90, 79, 90, 27, 72, 82, 65, 94, 27, 86, 82, 72, 86, 90, 79, 88, 83, 1, 27, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    public static void A04() {
        A06 = new String[]{"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    }

    public CY(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    public CY(long j2, int i2, long j3, long j4, long[] jArr) {
        this.A02 = j2;
        this.A00 = i2;
        this.A03 = j3;
        this.A01 = j4;
        this.A04 = jArr;
    }

    private long A00(int i2) {
        return (this.A03 * ((long) i2)) / 100;
    }

    public static CY A01(long j2, long j3, CL cl, C0768Il c0768Il) {
        int flags;
        int i2 = cl.A04;
        int i3 = cl.A03;
        int iA09 = c0768Il.A09();
        int samplesPerFrame = iA09 & 1;
        if (samplesPerFrame != 1 || (flags = c0768Il.A0I()) == 0) {
            return null;
        }
        long dataSize = J1.A0G(flags, ((long) i2) * 1000000, i3);
        int samplesPerFrame2 = iA09 & 6;
        if (samplesPerFrame2 != 6) {
            return new CY(j3, cl.A02, dataSize);
        }
        long jA0I = c0768Il.A0I();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            long durationUs = c0768Il.A0F();
            jArr[i4] = durationUs;
        }
        if (j2 != -1 && j2 != j3 + jA0I) {
            StringBuilder sb = new StringBuilder();
            sb.append(A02(2, 25, 81));
            sb.append(j2);
            sb.append(A02(0, 2, 17));
            long durationUs2 = j3 + jA0I;
            sb.append(durationUs2);
            Log.w(A02(27, 10, 96), sb.toString());
        }
        return new CY(j3, cl.A02, dataSize, jA0I, jArr);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        double d2;
        if (!A7q()) {
            return new CN(new CP(0L, this.A02 + ((long) this.A00)));
        }
        long jA0F = J1.A0F(j2, 0L, this.A03);
        long timeUs = this.A03;
        double d3 = (jA0F * 100.0d) / timeUs;
        if (d3 <= 0.0d) {
            d2 = 0.0d;
        } else if (d3 >= 100.0d) {
            d2 = 256.0d;
        } else {
            int i2 = (int) d3;
            double prevScaledPosition = this.A04[i2];
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = BuildConfig.FLAVOR;
            strArr[4] = BuildConfig.FLAVOR;
            double nextScaledPosition = i2;
            d2 = prevScaledPosition + (((i2 == 99 ? 256.0d : r9[i2 + 1]) - prevScaledPosition) * (d3 - nextScaledPosition));
        }
        long positionOffset = Math.round((d2 / 256.0d) * this.A01);
        return new CN(new CP(jA0F, this.A02 + J1.A0F(positionOffset, this.A00, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Yq
    public final long A7B(long j2) {
        long positionOffset = j2 - this.A02;
        if (A7q()) {
            long j3 = this.A00;
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
            strArr[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
            if (positionOffset > j3) {
                double d2 = (positionOffset * 256.0d) / this.A01;
                int iA0B = J1.A0B(this.A04, (long) d2, true, true);
                long jA00 = A00(iA0B);
                long j4 = this.A04[iA0B];
                long jA002 = A00(iA0B + 1);
                long nextScaledPosition = Math.round((jA002 - jA00) * (j4 == (iA0B == 99 ? 256L : this.A04[iA0B + 1]) ? 0.0d : (d2 - j4) / (r8 - j4)));
                return nextScaledPosition + jA00;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return this.A04 != null;
    }
}
