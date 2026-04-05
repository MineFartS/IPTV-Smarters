package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03531c {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "D54QwelP5odSxG9euBwRTMcSh2Pd8wOj";
            strArr[2] = "D54QwelP5odSxG9euBwRTMcSh2Pd8wOj";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 25);
            i5++;
        }
    }

    public static void A0A() {
        A00 = new byte[]{122, 75, 88, 89, 67, 68, 77, 10, 79, 88, 88, 69, 88, 4, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, DateTimeFieldType.MILLIS_OF_DAY, 44, 30, DateTimeFieldType.MINUTE_OF_DAY, 29, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 7, 28, 1, 10, 44, DateTimeFieldType.SECOND_OF_MINUTE, 26, 31, DateTimeFieldType.MILLIS_OF_DAY, 0, 50, 48, 50, 57, 52, DateTimeFieldType.HOUR_OF_HALFDAY, 60, 48, 63, 53, 48, 37, 62, 35, 40, DateTimeFieldType.HOUR_OF_HALFDAY, 56, 60, 48, 54, 52, 34, 51, 49, 51, 56, 53, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 61, 49, 62, 52, 49, 36, 63, 34, 41, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 38, 57, 52, 53, 63, 35, 112, 114, 112, 123, 118, 76, 124, 99, 103, 122, 124, 125, 114, 127, 76, 117, 122, 127, 118, 96, 39, 37, 39, 44, 33, 27, 43, 52, 48, 45, 43, 42, 37, 40, 27, 45, 41, 37, 35, 33, 55, 73, 75, 73, 66, 79, 117, 69, 90, 94, 67, 69, 68, 75, 70, 117, 92, 67, 78, 79, 69, 89, 30, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, DateTimeFieldType.SECOND_OF_MINUTE, 8, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 121, 116, 120, 118, 121, 101, 47, 40, 54, 59, 36, 41, 40, 34, DateTimeFieldType.MINUTE_OF_DAY, 61, 63, 40, 33, 34, 44, 41, DateTimeFieldType.MINUTE_OF_DAY, 62, 36, 55, 40, DateTimeFieldType.MINUTE_OF_DAY, 47, 52, 57, 40, 62, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HALFDAY_OF_DAY, 0, DateTimeFieldType.CLOCKHOUR_OF_DAY, 12};
    }

    public static void A0B() {
        A01 = new String[]{"bG5kl7ms2jfnGaubcapygHKl44y7F2pp", "Rfugxyqxov8lkQxdzAX2Cnba", "UYPyWhR5a1NgyKUppdulFuhBDqolXuli", "yVUW3irpFLZwTCrJAvbU3rIgys0qFO1P", "UNPhHDAhOEnfjuuNBPKCm76i9jlKW1r2", "sZGwH8l6kBVN3CTdl2", "yXveppwLCP5eqnK3ndR9MGNfrhvwghUf", "V2q4ZcPDX5bZ16EtvZSABaDK"};
    }

    static {
        A0B();
        A0A();
        A02 = C03531c.class.getName();
    }

    public static List<C1Z> A01(JSONArray jSONArray, boolean z) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    arrayList.add(new C1Z(jSONObject.getString(A00(156, 3, 67)), jSONObject.optString(A00(141, 9, 98))));
                } catch (JSONException e2) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A02, A00(0, 14, 51), e2);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C03511a> A02(JSONArray jSONArray, boolean z) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    arrayList.add(new C03511a(jSONObject.getString(A00(156, 3, 67)), jSONObject.optInt(A00(183, 5, 125)), jSONObject.optInt(A00(150, 6, 8))));
                } catch (JSONException e2) {
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A02, A00(0, 14, 51), e2);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C03521b> A03(JSONArray jSONArray, boolean z) throws IllegalStateException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    arrayList.add(new C03521b(jSONObject.getString(A00(156, 3, 67)), jSONObject.optLong(A00(159, 24, 84), -1L)));
                } catch (JSONException e2) {
                    if (A01[0].charAt(22) == 'd') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "QLc7yT25OduSbDqqrX";
                    strArr[5] = "QLc7yT25OduSbDqqrX";
                    if (!z) {
                        if (BuildConfigApi.isDebug()) {
                            Log.e(A02, A00(0, 14, 51), e2);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<C1Z> A04(JSONObject jSONObject) throws IllegalStateException {
        return A01(jSONObject.optJSONArray(A00(14, 21, 106)), true);
    }

    public static List<C03511a> A05(JSONObject jSONObject) throws IllegalStateException {
        return A02(jSONObject.optJSONArray(A00(35, 22, 72)), true);
    }

    public static List<C03521b> A06(JSONObject jSONObject) throws IllegalStateException {
        return A03(jSONObject.optJSONArray(A00(57, 22, 73)), true);
    }

    public static List<C1Z> A07(JSONObject jSONObject) throws IllegalStateException {
        return A01(jSONObject.optJSONArray(A00(79, 20, 10)), false);
    }

    public static List<C03511a> A08(JSONObject jSONObject) throws IllegalStateException {
        return A02(jSONObject.optJSONArray(A00(99, 21, 93)), false);
    }

    public static List<C03521b> A09(JSONObject jSONObject) throws IllegalStateException {
        return A03(jSONObject.optJSONArray(A00(120, 21, 51)), false);
    }
}
