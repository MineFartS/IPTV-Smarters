package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1170Yf extends CT {
    public static byte[] A03;
    public static String[] A04;
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{77, 121, 104, 101, 99, 44, 106, 99, 126, 97, 109, 120, 44, 98, 99, 120, 44, 127, 121, 124, 124, 99, 126, 120, 105, 104, 54, 44, 99, 119, 102, 107, 109, 45, 101, 53, 51, 51, 47, 99, 110, 99, 117, DateTimeFieldType.CLOCKHOUR_OF_DAY, 4, DateTimeFieldType.SECOND_OF_MINUTE, 24, 30, 94, DateTimeFieldType.MILLIS_OF_DAY, 70, 64, 64, 92, 28, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 49, 37, 52, 57, 63, 127, 61, 32, 100, 49, 125, 60, 49, 36, 61, 38, 50, 35, 46, 40, 104, 42, 55, 34, 32};
    }

    public static void A02() {
        A04 = new String[]{"Es", "iHC9pRtfoWLcycijntiJYXN2", "TuGPNLSlit", "098OJ58R6u", "VNifGSmWt2UpuuC8pFHITdWilQmWPSdD", "nPBEvfeprzzMECJ3xuyevnTK", "FVZwpUplP67oS0xaMKq2ljUJ3jrVNcvU", "q6VKpvb2t6NLzvXLeBGroGgfRiC5SSnv"};
    }

    static {
        A02();
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1170Yf(CR cr) {
        super(cr);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final void A0C(C0768Il c0768Il, long j2) throws AI {
        if (this.A00 == 2) {
            int iA05 = c0768Il.A05();
            super.A00.ACh(c0768Il, iA05);
            super.A00.ACi(j2, 1, iA05, 0, null);
            return;
        }
        int iA0F = c0768Il.A0F();
        if (iA0F == 0) {
            boolean z = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(9) != strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "UGwyap6YoK";
            strArr2[3] = "84lnx1SX4s";
            if (!z) {
                byte[] bArr = new byte[c0768Il.A05()];
                c0768Il.A0d(bArr, 0, bArr.length);
                Pair<Integer, Integer> pairA03 = IQ.A03(bArr);
                Format format = Format.A07(null, A00(58, 15, 95), null, -1, -1, ((Integer) pairA03.second).intValue(), ((Integer) pairA03.first).intValue(), Collections.singletonList(bArr), null, 0, null);
                super.A00.A5B(format);
                this.A01 = true;
                return;
            }
        }
        if (this.A00 == 10 && iA0F != 1) {
            return;
        }
        int iA052 = c0768Il.A05();
        super.A00.ACh(c0768Il, iA052);
        super.A00.ACi(j2, 1, iA052, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    @Override // com.facebook.ads.redexgen.X.CT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0D(com.facebook.ads.redexgen.X.C0768Il r17) throws com.facebook.ads.redexgen.X.C1174Yj {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1170Yf.A0D(com.facebook.ads.redexgen.X.Il):boolean");
    }
}
