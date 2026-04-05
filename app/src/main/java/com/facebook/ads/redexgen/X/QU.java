package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class QU {
    public static byte[] A00;
    public static String[] A01;
    public static final /* synthetic */ QU[] A02;
    public static final QU A03;
    public static final QU A04;
    public static final QU A05;
    public static final QU A06;
    public static final QU A07;
    public static final QU A08;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, 127, -92, -86, 101, 120, -128, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public static void A04() {
        A01 = new String[]{"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    }

    public abstract boolean A05(JSONArray jSONArray, int i2);

    public abstract boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i2);

    public abstract boolean A07(JSONObject jSONObject, String str);

    public abstract boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A04();
        A03();
        final int i2 = 0;
        final String strA02 = A02(0, 5, 105);
        A03 = new QU(strA02, i2) { // from class: com.facebook.ads.redexgen.X.G5
            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A05(JSONArray jSONArray, int i3) {
                return jSONArray.optJSONArray(i3) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return QV.A00(jSONArray.optJSONArray(i3), jSONArray2.optJSONArray(i3));
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QV.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        final int i3 = 1;
        final String strA022 = A02(5, 7, 40);
        A04 = new QU(strA022, i3) { // from class: com.facebook.ads.redexgen.X.G4
            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A05(JSONArray jSONArray, int i4) {
                return jSONArray.optBoolean(i4, true) == jSONArray.optBoolean(i4, false);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optBoolean(i4) == jSONArray2.optBoolean(i4);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        final int i4 = 2;
        final String strA023 = A02(12, 6, 81);
        A05 = new QU(strA023, i4) { // from class: com.facebook.ads.redexgen.X.G3
            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A05(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, 0.0d) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) != jSONArray.optDouble(i5, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optDouble(i5) == jSONArray2.optDouble(i5);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        final int i5 = 3;
        final String strA024 = A02(18, 3, 50);
        A06 = new QU(strA024, i5) { // from class: com.facebook.ads.redexgen.X.G2
            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A05(JSONArray jSONArray, int i6) {
                return jSONArray.optInt(i6, 0) == jSONArray.optInt(i6, 1) && jSONArray.optDouble(i6, 0.0d) == jSONArray.optDouble(i6, 1.0d) && ((double) jSONArray.optInt(i6, 0)) == jSONArray.optDouble(i6, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return jSONArray.optInt(i6) == jSONArray2.optInt(i6);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        final int i6 = 4;
        final String strA025 = A02(21, 6, 18);
        A07 = new QU(strA025, i6) { // from class: com.facebook.ads.redexgen.X.G1
            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A05(JSONArray jSONArray, int i7) {
                return jSONArray.optJSONObject(i7) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return QV.A02(jSONArray.optJSONObject(i7), jSONArray2.optJSONObject(i7));
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return QV.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        final int i7 = 5;
        final String strA026 = A02(27, 6, 36);
        A08 = new QU(strA026, i7) { // from class: com.facebook.ads.redexgen.X.Fy
            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A05(JSONArray jSONArray, int i8) {
                return jSONArray.optString(i8) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A06(JSONArray jSONArray, JSONArray jSONArray2, int i8) {
                return jSONArray.optString(i8).equals(jSONArray2.optString(i8));
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A07(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.facebook.ads.redexgen.X.QU
            public final boolean A08(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A02 = new QU[]{A03, A04, A05, A06, A07, A08};
    }

    public QU(String str, int i2) {
    }

    public static QU A00(JSONArray jSONArray, int i2) {
        for (QU qu : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            strArr[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (qu.A05(jSONArray, i2)) {
                return qu;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static QU A01(JSONObject jSONObject, String str) {
        for (QU qu : values()) {
            boolean zA07 = qu.A07(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "GmRRmI3tzaTgoS0GQtjO0";
            strArr[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (zA07) {
                return qu;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static QU valueOf(String str) {
        return (QU) Enum.valueOf(QU.class, str);
    }

    public static QU[] values() {
        return (QU[]) A02.clone();
    }
}
