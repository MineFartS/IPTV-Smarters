package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class S2 extends AbstractRunnableC0829Kx {
    public static byte[] A05;
    public static String[] A06;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0986Rb A01;
    public final /* synthetic */ C0678Ev A02;
    public final /* synthetic */ C05388t A03;
    public final /* synthetic */ Map A04;

    static {
        A03();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            strArr2[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 50);
            i5++;
        }
    }

    public static void A01() {
        A05 = new byte[]{33, 61, 55, 32, 32, 61, 32, 82, 76, 88, 61, 32, 36, 44, 38, 60, 61};
        if (A06[4].charAt(21) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
        strArr[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
    }

    public static void A03() {
        A06 = new String[]{"Gpv8eHHTEOtePQmo1OD6muRo415gTvmp", "m8VLVbL9uinkegCEMoYL3DBV4Qd", "9DesmfPYImwpHbFMCkN8D4N2A0eEtTnA", "p6qK7niiHhY9MGJ6cPP69YBKuDETC8Y4", "5iURk91XNbuPvrJWt8OL2zSUhjl2Moa0", "44pBDqZwGccZEwpE1ClPCXXxeIB", "3LUdHIp1lrC6CN8jsqyi77AXm4NZ0z", "iLxtTrJV"};
    }

    public S2(C0678Ev c0678Ev, Map map, C0986Rb c0986Rb, long j2, C05388t c05388t) {
        this.A02 = c0678Ev;
        this.A04 = map;
        this.A01 = c0986Rb;
        this.A00 = j2;
        this.A03 = c05388t;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A02.A0V(this.A04);
        this.A02.A0P(this.A01);
        Map mapA01 = this.A02.A01(this.A00);
        mapA01.put(A00(2, 5, 96), A00(0, 2, 62));
        mapA01.put(A00(7, 3, 13), A00(10, 7, 123));
        this.A02.A06(this.A03.A05(EnumC05428x.A05), mapA01);
        this.A02.A0O();
    }
}
