package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03440t {
    public static byte[] A03;
    public static String[] A04;
    public final HashSet<String> A02 = new HashSet<>();
    public JSONObject A01 = new JSONObject();
    public AtomicReference<String> A00 = new AtomicReference<>(A00(0, 2, 25));

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{DateTimeFieldType.HALFDAY_OF_DAY, 11, 56, 58, 43, 74, 65, 76, 93, 86, 95, 91, 74, 75, 112, 70, 75, 84, 88, 88, 78, 73, 73, 94, 85, 88, 94, 72, 111, 122, 109, 118, 112, 123, 27, 12, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 60, 12, 0, 0, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 6, DateTimeFieldType.HALFDAY_OF_DAY, 0, 6, 60, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, 0, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 1, 27, 26, 49, 30, 11, 28, 7, 1, 10};
    }

    public static void A02() {
        A04 = new String[]{"Nqgg", "8wGIqWp", "y92csH8tMmRGnIZZsga62xjDucPy6znH", "NuhdC57WslsG6uEsDnOxbiezpeKaNBmF", "EG4F575TP", "HLT5liagTN6y0JvSt92F6CLrVRU5nCH8", "PjujBbxPTNTRaLXrj7yD38jvaiKi7YAc", "GRbHVCF"};
    }

    public final String A03() {
        String str = this.A00.get();
        return str == null ? A00(0, 2, 25) : str;
    }

    public final JSONObject A04() {
        return this.A01;
    }

    public final synchronized void A05() {
        JSONArray jSONArray = new JSONArray();
        for (String encryptedAdId : this.A02) {
            jSONArray.put(encryptedAdId);
        }
        AtomicReference<String> atomicReference = this.A00;
        String encryptedAdId2 = jSONArray.toString();
        atomicReference.set(encryptedAdId2);
    }

    public final void A06(String str) throws JSONException {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        this.A01 = new JSONObject(str);
        Iterator<String> itKeys = this.A01.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.A01.get(next) instanceof String) {
                A0A(new JSONObject((String) this.A01.get(next)));
            }
        }
    }

    public final synchronized void A07(String str) {
        this.A02.add(str);
    }

    public final synchronized void A08(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    this.A02.add(jSONArray.getString(i2));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A02.remove(str);
    }

    public final void A0A(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString(A00(5, 12, 96), null);
        int iOptInt = jSONObject.optInt(A00(28, 6, 80));
        int iOptInt2 = jSONObject.optInt(A00(54, 11, 33));
        long jOptLong = jSONObject.optLong(A00(2, 3, 20));
        C1K c1k = new C1K(strOptString);
        if (strOptString != null && this.A01.has(strOptString) && (this.A01.get(strOptString) instanceof C1K)) {
            c1k = (C1K) this.A01.get(strOptString);
        }
        String strA00 = A00(17, 11, 116);
        if (jSONObject.has(strA00)) {
            c1k.A06((JSONArray) jSONObject.get(strA00));
        }
        String strA002 = A00(34, 20, 44);
        if (jSONObject.has(strA002)) {
            c1k.A04(jSONObject.optInt(strA002));
        }
        c1k.A05(iOptInt, iOptInt2, jOptLong);
        this.A01.put(strOptString, c1k);
        String[] strArr = A04;
        if (strArr[3].charAt(11) != strArr[2].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "tpg9MOL30KnGen5hdACKzszPCJWxtgkM";
        strArr2[2] = "0kRc9hG2BxRGhE0oYKlFhIYiMAEEJmAF";
    }
}
