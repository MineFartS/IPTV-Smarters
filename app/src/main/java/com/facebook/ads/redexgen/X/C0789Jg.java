package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0789Jg {
    public static byte[] A02;
    public static String[] A03;
    public final JZ A00;
    public final String A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[4].charAt(5) != 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "OpSsMbmoyiuJLyOxEkBMoj5ebplLMUgU";
            strArr[4] = "OpSsMbmoyiuJLyOxEkBMoj5ebplLMUgU";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 40);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{24, 30, 9, 31, DateTimeFieldType.MINUTE_OF_DAY, 27, DateTimeFieldType.HOUR_OF_HALFDAY};
    }

    public static void A02() {
        A03 = new String[]{"0EK1zjbC0rvKFRySirHuNeKu7O6M1c2K", "EZ3WTNSY5ayWns4cE", "iOTwBXJJn2mTXQ1MI7WizzznsNyhmcwj", "DnXRTJeCR1MDANpnyW3y9Xegmk", "0BaBrbX1x0DXsftKwoONmcZPElrNX48m", "JdhHjDAP4IE4TNrXk8Fag99Jau", "kO1FJ5pbtA78NTGKnINecVB8MAIDEUuG", "0uD1E8KeZOnBJibGqVh9DEewsO4i87jr"};
    }

    public C0789Jg(String str, JZ jz) {
        this.A01 = str;
        this.A00 = jz;
    }

    public final void A03(EnumC0788Jf enumC0788Jf, @Nullable Map<String, String> map) {
        A04(enumC0788Jf.A03(), map);
    }

    public final void A04(String str, @Nullable Map<String, String> map) {
        if (!C0791Ji.A0B(this.A01, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 67), str);
        JZ jz = this.A00;
        String str2 = this.A01;
        if (A03[4].charAt(5) != 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[0] = "vT3nRtW3uRS5jX4JEmaR2PdDFOqNzjtW";
        strArr[7] = "IECj1aNSpXIXDwy92hzTd369PO3PVRtC";
        jz.A88(str2, map);
    }
}
