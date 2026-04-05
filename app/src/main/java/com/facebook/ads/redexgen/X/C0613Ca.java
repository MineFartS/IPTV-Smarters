package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0613Ca implements InterfaceC1181Yq {
    public static byte[] A03;
    public static String[] A04;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        strArr[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, 127, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, -39, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    public static void A03() {
        A04 = new String[]{"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    }

    public C0613Ca(long[] jArr, long[] jArr2, long j2) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j2;
    }

    public static C0613Ca A00(long durationUs, long j2, CL cl, C0768Il c0768Il) {
        int iA0F;
        long position = j2;
        c0768Il.A0a(10);
        int iA09 = c0768Il.A09();
        if (iA09 <= 0) {
            return null;
        }
        int i2 = cl.A03;
        long jA0G = J1.A0G(iA09, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), i2);
        int iA0J = c0768Il.A0J();
        int iA0J2 = c0768Il.A0J();
        int iA0J3 = c0768Il.A0J();
        c0768Il.A0a(2);
        int scale = cl.A02;
        long j3 = position + ((long) scale);
        long[] jArr = new long[iA0J];
        long[] jArr2 = new long[iA0J];
        for (int i3 = 0; i3 < iA0J; i3++) {
            jArr[i3] = (((long) i3) * jA0G) / ((long) iA0J);
            jArr2[i3] = Math.max(position, j3);
            if (iA0J3 == 1) {
                iA0F = c0768Il.A0F();
            } else if (iA0J3 == 2) {
                iA0F = c0768Il.A0J();
            } else if (iA0J3 == 3) {
                iA0F = c0768Il.A0H();
            } else {
                if (iA0J3 != 4) {
                    return null;
                }
                iA0F = c0768Il.A0I();
            }
            position += (long) (iA0F * iA0J2);
            int segmentSize = A04[7].charAt(10);
            if (segmentSize == 80) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        if (durationUs != -1 && durationUs != position) {
            Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
        }
        return new C0613Ca(jArr, jArr2, jA0G);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        int iA0B = J1.A0B(this.A02, j2, true, true);
        CP cp = new CP(this.A02[iA0B], this.A01[iA0B]);
        if (cp.A01 < j2) {
            long[] jArr = this.A02;
            if (iA0B != jArr.length - 1) {
                return new CN(cp, new CP(jArr[iA0B + 1], this.A01[iA0B + 1]));
            }
        }
        return new CN(cp);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Yq
    public final long A7B(long j2) {
        return this.A02[J1.A0B(this.A01, j2, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return true;
    }
}
