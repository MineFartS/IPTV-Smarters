package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FT extends RO<String> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{117, 110, 119, 119};
    }

    public static void A02() {
        A01 = new String[]{"cPFU09w1sYhK4rqw16A2CdYyCNyTnR3z", "eA", "2M", "y0hE8Px37wTxAHWET0PS55Yk2wnKVEee", "4RtQ0r9yZ9SSnuHMdv7xqvGds77Avf0u", "O", "A", "zQqgpaeGu2ypz64uT0JjOX"};
    }

    public FT(String str) {
        super(str);
    }

    public final C0X A03(@Nullable String str) {
        if (str == null) {
            str = A00(0, 4, 64);
        }
        C0X c0x = new C0X(this, str);
        String[] strArr = A01;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "C";
        strArr2[5] = "W";
        return c0x;
    }
}
