package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1332bv implements JX {
    public static byte[] A02;
    public static String[] A03;
    public static final String A04;
    public X3 A00;
    public InterfaceC1144Xf A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 104);
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        if (r19 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        r7.put(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r3 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        r7.put(r3);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONArray A02(org.json.JSONArray r17, org.json.JSONArray r18, int r19) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1332bv.A02(org.json.JSONArray, org.json.JSONArray, int):org.json.JSONArray");
    }

    public static void A05() {
        A02 = new byte[]{DateTimeFieldType.SECOND_OF_MINUTE, 83, 90, 71, DateTimeFieldType.SECOND_OF_MINUTE, 80, 67, 80, 91, 65, 124, 81, DateTimeFieldType.SECOND_OF_MINUTE, 60, 111, 105, 127, 127, 121, 111, 111, 122, 105, 112, 112, 101, 50, 110, 101, 68, 77, 68, 85, 68, 69, 1, 68, 87, 68, 79, 85, 82, 1, 68, 89, 66, 68, 68, 69, 68, 69, 1, 83, 68, 85, 83, 88, 1, 77, 72, 76, 72, 85, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 1, 98, 78, 84, 79, 85, 27, 1, 72, 123, 104, 99, 121, 45, 121, 116, 125, 104, 45, 125, 127, 98, 110, 104, 126, 126, 104, 105, 45, 111, 116, 45, 121, 101, 104, 45, 126, 104, 127, 123, 104, 127, 55, 45, 84, 115, 123, 126, 119, 118, 50, 102, 125, 50, 98, 115, 96, 97, 119, 50, 115, 124, 50, 119, 100, 119, 124, 102, 50, 123, 124, 50, 119, 100, 119, 124, 102, 97, 50, 115, 96, 96, 115, 107, 50, 116, 125, 96, 50, 118, 123, 97, 98, 115, 102, 113, 122, 50, 116, 115, 123, 126, 103, 96, 119, 60, 65, 119, 96, 100, 119, 96, 50, 98, 96, 125, 113, 119, 97, 97, 119, 118, 50, 119, 100, 119, 124, 102, 91, 118, 50, 50, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_SECOND, 4, DateTimeFieldType.MINUTE_OF_HOUR, 65, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 5, 65, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 76, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 24, 0, 3, DateTimeFieldType.HALFDAY_OF_DAY, 4, 65, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 65, 2, DateTimeFieldType.HOUR_OF_HALFDAY, 5, 4, 65, 42, 28, 11, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, 11, 89, 11, 28, DateTimeFieldType.HALFDAY_OF_DAY, 12, 11, DateTimeFieldType.MILLIS_OF_SECOND, 28, 29, 89, 11, 28, DateTimeFieldType.HALFDAY_OF_DAY, 11, 0, 24, 27, DateTimeFieldType.SECOND_OF_MINUTE, 28, 89, 28, 11, 11, DateTimeFieldType.MILLIS_OF_DAY, 11, 89, 26, DateTimeFieldType.MILLIS_OF_DAY, 29, 28, 89, 86, 109, 98, 97, 111, 102, 35, 119, 108, 35, 115, 98, 113, 112, 102, 35, 103, 102, 97, 118, 100, 79, 108, 100, 70, 117, 102, 109, 119, 35, 98, 119, 35, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 54, 37, 54, 61, 39, 115, 50, 39, 115, 111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 73, 95, 72, 76, 95, 72, 26, 72, 95, 73, 74, 85, 84, 73, 95, 26, 91, 78, 26, 74, 85, 73, 83, 78, 83, 85, 84, 26, 80, 92, 87, 86, 104, 109, 120, 109, 110, 109, 127, 105, DateTimeFieldType.HOUR_OF_DAY, 2, DateTimeFieldType.HOUR_OF_DAY, 26, 0, 7, 6, 5, 1, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 5, 77, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 6, 9, 7, 77, 5, DateTimeFieldType.MILLIS_OF_DAY, 5, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 77, DateTimeFieldType.HALFDAY_OF_DAY, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, 24, 36, 40, 41, 33, 46, 32, 44, 33, 71, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    public static void A06() {
        A03 = new String[]{"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    }

    static {
        A06();
        A05();
        A04 = C1332bv.class.getSimpleName();
    }

    public C1332bv(X3 x3, InterfaceC1144Xf interfaceC1144Xf) {
        this.A00 = x3;
        this.A01 = interfaceC1144Xf;
    }

    public static JSONArray A01(JSONArray jSONArray, JSONArray jSONArray2) {
        int length = jSONArray != null ? 0 + jSONArray.length() : 0;
        if (jSONArray2 != null) {
            length += jSONArray2.length();
        }
        return A02(jSONArray, jSONArray2, length);
    }

    private JSONObject A03() {
        JSONArray jSONArrayA03;
        JSONObject payload = this.A01.A5M();
        JSONArray jSONArrayA5L = this.A01.A5L();
        if (JU.A0Q(this.A00) && (jSONArrayA03 = C05248f.A03(this.A00)) != null && jSONArrayA03.length() > 0) {
            jSONArrayA5L = A01(jSONArrayA03, jSONArrayA5L);
        }
        JSONObject jSONObject = null;
        if (jSONArrayA5L != null) {
            try {
                jSONObject = new JSONObject();
                if (payload != null) {
                    jSONObject.put(A00(439, 6, 32), payload);
                }
                jSONObject.put(A00(387, 6, 28), jSONArrayA5L);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i2) {
        int iA08;
        JSONArray jSONArrayA04;
        Pair<JSONObject, JSONArray> pairA7C = this.A01.A7C(i2);
        JSONObject jSONObject = (JSONObject) pairA7C.first;
        JSONArray jSONArrayA02 = (JSONArray) pairA7C.second;
        if (JU.A0Q(this.A00) && (jSONArrayA04 = C05248f.A04(this.A00, (iA08 = JU.A08(this.A00)))) != null) {
            int debugEventLimit = jSONArrayA04.length();
            if (debugEventLimit > 0) {
                jSONArrayA02 = A02(jSONArrayA04, jSONArrayA02, i2 + iA08);
            }
        }
        JSONObject jSONObject2 = null;
        if (jSONArrayA02 != null) {
            try {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(439, 6, 32), jSONObject);
                }
                jSONObject2.put(A00(387, 6, 28), jSONArrayA02);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A07(String str) {
        if (C05248f.A0J(str)) {
            C05248f.A0E(str);
        } else {
            this.A01.A7T(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JX
    public final JSONObject A4H() {
        int iA0F = JU.A0F(this.A00);
        return iA0F > 0 ? A04(iA0F) : A03();
    }

    @Override // com.facebook.ads.redexgen.X.JX
    public final boolean A7l() {
        int iA0F = JU.A0F(this.A00);
        return iA0F >= 1 && this.A01.A6F() + C05248f.A00(this.A00) > iA0F;
    }

    @Override // com.facebook.ads.redexgen.X.JX
    public final void A8u() {
        int iA3z = this.A01.A3z(JU.A0G(this.A00));
        if (iA3z > 0) {
            this.A00.A04().A86(A00(379, 8, 100), C05228d.A0o, new C05238e(A00(28, 44, 73) + iA3z));
        }
        X3 x3 = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int length = str.length();
        int attemptsExceededEventsCount = str2.length();
        if (length == attemptsExceededEventsCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        C05248f.A0G(x3);
    }

    @Override // com.facebook.ads.redexgen.X.JX
    public final void A9N(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                A07(jSONArray.getJSONObject(i2).getString(A00(433, 2, 45)));
            } catch (JSONException e2) {
                if (BuildConfigApi.isDebug()) {
                    String str = A04;
                    String[] strArr = A03;
                    if (strArr[5].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e2);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.JX
    public final boolean A9P(JSONArray jSONArray) {
        String eventId = A00(27, 1, 40);
        boolean z = true;
        boolean zA0Q = JU.A0Q(this.A00);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(string)) {
                    JT.A0L(this.A00).A1l(jSONObject.getString(A00(419, 14, 47)));
                    DynamicLoaderFactory.makeLoader(this.A00).getInitApi().maybeAttachCrashListener(this.A00);
                } else {
                    int i3 = jSONObject.getInt(A00(375, 4, 91));
                    if (i3 == 1) {
                        if (BuildConfigApi.isDebug()) {
                            String str = A00(170, 25, 122) + string + A00(13, 14, 116);
                            String strA6I = this.A01.A6I(string);
                            if (strA6I != null) {
                                StringBuilder sb = new StringBuilder();
                                String eventType = A00(72, 36, 101);
                                sb.append(eventType);
                                sb.append(strA6I);
                                sb.toString();
                            }
                        }
                        if (!this.A01.A4h(string) && zA0Q) {
                            C05248f.A0D(string);
                        }
                    } else {
                        String strA00 = A00(0, 13, 93);
                        if (i3 >= 1000 && i3 < 2000) {
                            if (BuildConfigApi.isDebug()) {
                                Log.e(A04, A00(236, 37, 17) + i3 + strA00 + string + eventId);
                            }
                            A07(string);
                            z = false;
                        } else if (i3 >= 2000 && i3 < 3000) {
                            if (BuildConfigApi.isDebug()) {
                                Log.e(A04, A00(195, 41, 9) + i3 + strA00 + string + eventId);
                            }
                            if (!this.A01.A4h(string) && zA0Q) {
                                C05248f.A0D(string);
                            }
                        }
                    }
                    this.A00.A01().A81(this.A00, jSONObject.toString());
                }
            } catch (JSONException e2) {
                if (BuildConfigApi.isDebug()) {
                    Log.e(A04, A00(331, 44, 82) + i2 + eventId, e2);
                }
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.JX
    public final void AAi() {
        this.A01.A40();
        C05248f.A08(this.A00);
    }
}
