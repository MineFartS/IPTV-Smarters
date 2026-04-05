package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1064Ud implements InterfaceC04806d {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C1074Un A00;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {32, 31, 50, 50, 35, 48, 55, 29, 42, 45, 53};
        String[] strArr = A02;
        if (strArr[5].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "zsr7uVrJNcFH7kX5XxLPdtK6eEcZRxEm";
        strArr2[7] = "zsr7uVrJNcFH7kX5XxLPdtK6eEcZRxEm";
        A01 = bArr;
    }

    public static void A02() {
        A02 = new String[]{"dNr6PPQsY9l", "RH2U4Hh24YJB1CaC1uFo9RGIyJZKKzLP", "dQYGehnAuPol14EFpizMkTDsN0LYSx6h", "7Q5ZVjGu0JJTpQG9POYIlRIj1jnsmDo", "fVmoe7EJsPLcTdm", "gOyCjpHNXOG3DgRDYrCD", "Bt7utfgyfoKMrlpwfOIMwYj8ykKc", "iv3XcVN43HhJpxh2FG4KyUlJf74g4nGs"};
    }

    public C1064Ud(C1074Un c1074Un) {
        this.A00 = c1074Un;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A0C(A00(0, 11, 124), false);
    }
}
