package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.93, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass93 {
    public static HashMap<String, String> A00;
    public static byte[] A01;
    public static String[] A02;

    static {
        A04();
        A03();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{63, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, 27, 10, 10, 12, 31, 8, 9, DateTimeFieldType.HALFDAY_OF_DAY, 34, 40, 62, 35, 37, 40, 32, 55, 44, 38, 46, 39, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 5, 12, 53, 41, 121, 101, 96, 115, 100, 101, 114, 101, 106, 126, 105, 102, 114, 123, 104, 127, 126, 100, 98, 99, 1, DateTimeFieldType.MILLIS_OF_SECOND, 1, 1, 27, 29, 28, DateTimeFieldType.HALFDAY_OF_DAY, 27, DateTimeFieldType.MILLIS_OF_DAY, 53, 58, 48, 38, 59, 61, 48};
    }

    public static void A04() {
        A02 = new String[]{"khEJJSEBeZAj3OAxCgzNidlYCZn1WdrQ", "WigI19L", "nVQbXZzkIzZCm6ed4Wwsa9gCOy", "HTplkKsJZ28QwTvwNKGrQ1qXfC2z", "xAVvuzXwzMicNcIETZjP5vM2paYATPUF", "ZQBu7F3mQUfNW6aD", "dGQdYWCLx", "hFrznfqGyDFETBry94BNLT7Zi42G"};
    }

    public static synchronized Map<String, String> A01(C8C c8c) {
        if (A00 != null) {
            return new HashMap(A00);
        }
        A00 = new HashMap<>();
        A00.put(A00(29, 6, 7), c8c.getPackageName());
        A02(c8c, A00);
        HashMap map = new HashMap(A00);
        if (A02[6].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "csszmLyTseT6qvLdDZ4XLWwozasc9BBN";
        strArr[4] = "csszmLyTseT6qvLdDZ4XLWwozasc9BBN";
        return map;
    }

    public static synchronized Map<String, String> A02(C8C c8c, Map<String, String> map) {
        map.put(A00(48, 3, 68), A00(72, 7, 49));
        map.put(A00(51, 11, 72), BuildConfigApi.getVersionName(c8c));
        map.put(A00(40, 2, 31), A00(22, 7, 41));
        map.put(A00(42, 6, 83), C05328n.A03);
        C05328n c05328n = new C05328n(c8c);
        map.put(A00(15, 7, 63), c05328n.A06());
        map.put(A00(8, 7, 82), c05328n.A05());
        map.put(A00(0, 8, 27), String.valueOf(c05328n.A04()));
        map.put(A00(35, 5, 37), c05328n.A0A());
        map.put(A00(62, 10, 55), c8c.A05().A02());
        return map;
    }
}
