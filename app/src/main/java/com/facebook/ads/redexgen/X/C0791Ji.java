package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0791Ji {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    @Nullable
    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(X2 x2, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                arrayList.add(jSONArray.getString(i2));
            } catch (JSONException e2) {
                x2.A04().A86(A00(39, 17, 1), C05228d.A0x, new C05238e(e2));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C0789Jg c0789Jg, EnumC0788Jf enumC0788Jf) {
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0790Jh(c0789Jg, enumC0788Jf));
    }

    public static void A05(X2 x2, String str, long j2) {
        C0789Jg c0789Jg = new C0789Jg(str, x2.A06());
        HashMap map = new HashMap();
        map.put(A00(24, 15, 47), C0848Lr.A06(j2));
        map.put(A00(12, 12, 118), C0848Lr.A04(j2));
        c0789Jg.A03(EnumC0788Jf.A0D, map);
    }

    public static void A06(X2 x2, JSONObject jSONObject, long j2, @Nullable String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && jSONArrayOptJSONArray != null) {
            A07(x2, jSONObjectOptJSONObject, A02(x2, jSONArrayOptJSONArray), j2, null);
        } else {
            if (TextUtils.isEmpty(str) || !A02.containsKey(str)) {
                return;
            }
            A07(x2, jSONObjectOptJSONObject, A02.get(str), j2, str);
        }
    }

    public static void A07(X2 x2, JSONObject jSONObject, List<String> list, long j2, @Nullable String str) {
        String strA00 = A00(0, 2, 62);
        if (jSONObject.has(strA00)) {
            String strOptString = jSONObject.optString(strA00);
            A08(strOptString, str);
            A09(strOptString, list);
            A05(x2, strOptString, j2);
        }
    }

    public static void A08(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        A02.put(str, list);
    }

    public static boolean A0A(String str, EnumC0788Jf enumC0788Jf) {
        return A0B(str, enumC0788Jf.A03());
    }

    public static boolean A0B(String str, String str2) {
        return A02.containsKey(str) && A02.get(str).contains(str2);
    }
}
