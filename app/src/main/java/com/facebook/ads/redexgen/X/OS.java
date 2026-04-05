package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OS {
    public static byte[] A03;
    public static String[] A04;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A04();
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{37, 50, 45, 45, DateTimeFieldType.HOUR_OF_HALFDAY, 6, 6, 4, DateTimeFieldType.MINUTE_OF_HOUR, 65, 122, 117, 118, 120, 113, 52, 96, 123, 52, 119, 102, 113, 117, 96, 113, 52, 117, 112, 112, 125, 96, 125, 123, 122, 117, 120, 93, 122, 114, 123, 89, 92, 103, 91, 74, 93, 89, 76, 81, 78, 93, 103, 76, 65, 72, 93, 12, 9, 50, 11, 2, 31, 0, 12, 25, 50, 25, DateTimeFieldType.SECOND_OF_DAY, 29, 8, 108, 105, 82, 127, 104, 124, 120, 104, 126, 121, 82, 100, 105, 116, 99, 124, 111, 107, 103, 97, 99, DateTimeFieldType.SECOND_OF_MINUTE, 10, 7, 6, 12};
    }

    public static void A04() {
        A04 = new String[]{"fp2CaqTj", "LAEvMYTNrmfm1C97qtviMkf2yRu1DYDl", "t6JdD3of0IxrOsKa9BA81q59Uli9AsT8", "gJC7p3UN", "wkhfqpsDh9pZ7alJINp4k3fYjwmP5ybd", "PXJ05dfTFyjTm8LhPchB38r6NC9RTsQv", "bBNwT5q5CTYqEWiLjNbWq9cYv9", "kUvPfRU87m3C3sqCb"};
    }

    public OS(String str, String str2, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = !TextUtils.isEmpty(str2) ? A01(91, 5, 62) : A01(86, 5, 91);
    }

    private C05238e A00(String str) {
        C05238e c05238e = new C05238e(str);
        c05238e.A05(A02());
        c05238e.A03(1);
        return c05238e;
    }

    private JSONObject A02() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(56, 14, 48), this.A00);
            jSONObject.put(A01(70, 13, 80), this.A02);
            jSONObject.put(A01(40, 16, 101), this.A01);
        } catch (JSONException e2) {
            Log.w(A01(0, 9, 60), A01(9, 31, 73), e2);
        }
        return jSONObject;
    }

    public final void A05(int i2, String str) {
        X3 x3A00 = C8B.A00();
        if (x3A00 != null) {
            InterfaceC05218c interfaceC05218cA04 = x3A00.A04();
            String[] strArr = A04;
            if (strArr[2].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "oo4WYpYrHyZLXSXdo0EivsHVHotPm1t3";
            strArr2[1] = "oo4WYpYrHyZLXSXdo0EivsHVHotPm1t3";
            interfaceC05218cA04.A86(A01(83, 3, 77), i2, A00(str));
        }
    }
}
