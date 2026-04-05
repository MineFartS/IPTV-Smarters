package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JW {
    public static byte[] A07;
    public static String[] A08;
    public final double A00;
    public final double A01 = System.currentTimeMillis() / 1000.0d;
    public final EnumC0783Ja A02;
    public final EnumC0784Jb A03;
    public final String A04;
    public final String A05;
    public final Map<String, String> A06;

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "vmrJ4a9vgt2Kh5jnKLFXcgPaai5qbtv5";
            strArr2[3] = "Xi4zcaKQ0kTUusAVwfois8CGtwAhjWs7";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 63);
            i5++;
        }
    }

    public static void A02() {
        A07 = new byte[]{97, 110, 97, 108, 111, 103, 109, 112, 107, 101, 107, 108, 99, 110, 93, 97, 110, 107, 103, 108, 118, 93, 118, 109, 105, 103, 108, 110, 117, 114, 104, 113, 121, 66, 116, 115, 126, 113, 104, 121, 120, 66, 116, 115, 66, 123, 104, 115, 115, 120, 113};
    }

    public static void A03() {
        A08 = new String[]{"LYvtYpjh3A8vQy5q2R4RxEae0rP", "jA7v2s", "LzEc2Zjd8NVDeWOm9tYj7O2gb", "Qr4hCar3IUJK7IjuLaxeJKR14jvwbtqN", "uluEIDHou1vA3RshZYJ1CVooXlj", "7Mv6zZGpvnHTc", "8W43Le7bwqTNh", "1W0jBamhj3r3Yg4zpKy5fnBuSdv5NYDW"};
    }

    public JW(C8C c8c, String str, double d2, String str2, Map<String, String> map, EnumC0783Ja enumC0783Ja, EnumC0784Jb enumC0784Jb, boolean z) {
        this.A05 = str;
        this.A00 = d2;
        this.A04 = str2;
        this.A02 = enumC0783Ja;
        this.A03 = enumC0784Jb;
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        if (z) {
            map2.put(A00(27, 24, 34), String.valueOf(z));
        }
        String strA01 = C0791Ji.A01(str);
        if (!TextUtils.isEmpty(strA01) && (z || enumC0784Jb == EnumC0784Jb.A0C)) {
            map2.put(A00(6, 21, 61), strA01);
        }
        if (A0C()) {
            map2.put(A00(0, 6, 63), LY.A01(c8c.A02().A5O()));
        }
        this.A06 = A01(map2);
    }

    public static Map<String, String> A01(Map<String, String> cleansedMap) {
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : cleansedMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null) {
                map.put(key, value);
            }
        }
        return map;
    }

    public final double A04() {
        return this.A00;
    }

    public final double A05() {
        return this.A01;
    }

    public final EnumC0783Ja A06() {
        return this.A02;
    }

    public final EnumC0784Jb A07() {
        return this.A03;
    }

    public final String A08() {
        return this.A04;
    }

    public final String A09() {
        return this.A05;
    }

    public final Map<String, String> A0A() {
        return this.A06;
    }

    public final boolean A0B() {
        return !TextUtils.isEmpty(this.A05);
    }

    public final boolean A0C() {
        return this.A02 == EnumC0783Ja.A05;
    }
}
