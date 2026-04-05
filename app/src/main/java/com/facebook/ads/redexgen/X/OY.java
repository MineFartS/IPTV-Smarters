package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OY {
    public static byte[] A05;
    public final OS A00;
    public final String A01;
    public final String A02;
    public final WeakReference<JZ> A03;
    public final WeakReference<R0> A04;

    static {
        A08();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A05 = new byte[]{-52, -8, -2, -11, -19, -87, -9, -8, -3, -87, -7, -22, -5, -4, -18, -87, -4, -18, -5, -1, -18, -5, -87, -10, -18, -4, -4, -22, -16, -18, DateTimeFieldType.HOUR_OF_HALFDAY, 59, 59, 56, 59, -23, 57, 42, 59, 60, 50, 55, 48, -23, DateTimeFieldType.MINUTE_OF_HOUR, 28, 24, DateTimeFieldType.MILLIS_OF_SECOND, -23, 50, 55, -23, 57, 56, 60, 61, DateTimeFieldType.MILLIS_OF_DAY, 46, 60, 60, 42, 48, 46, -23, 7, 27, 26, DateTimeFieldType.HOUR_OF_HALFDAY, -15, 11, 31, 62, 74, 72, 72, 60, 73, 63, -30, -11, -15, -17, -34, -36, -31, -34, -15, -34, 12, 27, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 11, DateTimeFieldType.MINUTE_OF_DAY, 5, 26, 31, DateTimeFieldType.MILLIS_OF_DAY, 11, -23, -18, -27, -38};
    }

    public OY(R0 r0, JZ jz, OS os, String str, String str2) {
        this.A04 = new WeakReference<>(r0);
        this.A03 = new WeakReference<>(jz);
        this.A00 = os;
        this.A01 = str;
        this.A02 = str2;
    }

    public static Map<String, String> A01(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A02() {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0M();
    }

    private void A03() {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0N();
    }

    private void A04() {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0O();
    }

    private void A05() {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0Q();
    }

    private void A06() {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0R();
    }

    private void A07() {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0S();
    }

    private void A09(OX ox, String str) throws JSONException {
        switch (OW.A00[ox.ordinal()]) {
            case 1:
                A0A(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A02();
                break;
            case 4:
                A04();
                break;
            case 5:
                A03();
                break;
            case 6:
                A07();
                break;
            case 7:
                A0B(new JSONObject(str));
                break;
            case 8:
                A0C(new JSONObject(str));
                break;
            case 9:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 10:
                A05();
                break;
        }
    }

    private void A0A(JSONObject jSONObject) {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        String strOptString = jSONObject.optString(A00(71, 7, 103));
        if (TextUtils.isEmpty(strOptString)) {
            r0.A0P();
        } else {
            r0.A0T(strOptString);
        }
    }

    private void A0B(JSONObject jSONObject) {
        R0 r0 = this.A04.get();
        if (r0 == null) {
            return;
        }
        r0.A0U(A01(jSONObject));
    }

    private void A0C(JSONObject jSONObject) {
        JZ jz = this.A03.get();
        if (jz == null) {
            return;
        }
        String strOptString = jSONObject.optString(A00(88, 11, 50));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new C0789Jg(this.A02, jz).A04(strOptString, A01(jSONObject));
    }

    @JavascriptInterface
    public void postMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!this.A01.equals(jSONObject.optString(A00(64, 7, 50)))) {
                this.A00.A05(C05228d.A0p, A00(0, 30, 21));
            } else {
                A09(OX.A00(jSONObject.optString(A00(99, 4, 1))), jSONObject.optString(A00(78, 10, 9)));
            }
        } catch (JSONException e2) {
            this.A00.A05(C05228d.A0r, A00(30, 34, 85) + e2.getMessage());
        }
    }
}
