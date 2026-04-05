package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.19, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass19 implements Serializable {
    public static byte[] A0A = null;
    public static String[] A0B = null;
    public static final long serialVersionUID = 85021702336014823L;
    public C1B A00;
    public C1C A01;
    public C1G A02;
    public C1I A03;
    public C1J A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    static {
        A04();
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
            String[] strArr = A0B;
            if (strArr[3].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[2] = "LXXQrjhAH5CnLq5fKQjRUnrA3R85ks8i";
            strArr2[7] = "Vzc9rcIkwZ9oA3QEo9fi0aCOPKhgVZjz";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{61, 0, 84, 3, 29, 24, 24, 84, DateTimeFieldType.SECOND_OF_MINUTE, 1, 0, 27, 25, DateTimeFieldType.SECOND_OF_MINUTE, 0, 29, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 24, 24, DateTimeFieldType.HALFDAY_OF_DAY, 84, 27, 4, DateTimeFieldType.HOUR_OF_DAY, 26, 84, 29, 26, 84, 47, 7, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 7, 41, 7, 116, 113, 74, 118, 103, 112, 116, 97, 124, 99, 112, 74, 97, 108, 101, 112, 117, 120, 115, 110, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 1, 1, 50, 25, 2, 50, 12, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 4, 2, 3, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_MINUTE, 0, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 27, 6, DateTimeFieldType.HALFDAY_OF_DAY, 6, 7, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 27, 61, 1, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 1, 9, 61, DateTimeFieldType.MILLIS_OF_DAY, 7, 26, DateTimeFieldType.MILLIS_OF_DAY, 92, 93, 75, 76, 81, 86, 89, 76, 81, 87, 86, 103, 76, 81, 76, 84, 93, 86, 93, 87, 108, 80, 82, 65, 87, 108, 90, 94, 82, 84, 86, 64, 59, 63, 60, 57, 2, 62, 50, 48, 48, 60, 51, 57, 72, 74, 65, 74, 93, 70, 76, 112, 91, 74, 87, 91, 92, 81, 93, 83, 92, 64, 34, 38, 42, 44, 46, 7, 29, 49, 28, 11, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 28, 10, 11, 10, 49, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, 64, 90, 118, 95, 64, 77, 76, 70, 118, 72, 92, 77, 64, 70, 118, 68, 92, 93, 76, 77, 60, 38, 10, 34, 52, 33, 54, 61, 10, 52, 59, 49, 10, 55, 39, 58, 34, 38, 48, 4, DateTimeFieldType.MILLIS_OF_SECOND, 2, 31, 24, DateTimeFieldType.HOUR_OF_DAY, 41, DateTimeFieldType.SECOND_OF_MINUTE, 25, 3, 24, 2, 82, 65, 84, 73, 78, 71, 127, 86, 65, 76, 85, 69, 42, 60, 58, 54, 55, 61, 42, 6, 63, 54, 43, 6, 43, 60, 46, 56, 43, 61, 46, 53, 50, 42, 2, 56, 51, 57, 2, 62, 60, 47, 57, 67, 88, 95, 71, 111, 85, 72, 89, 68, 111, 68, 66, 81, 94, 67, 89, 68, 89, 95, 94, 9, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HALFDAY_OF_DAY, 37, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 8, DateTimeFieldType.SECOND_OF_MINUTE, 37, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 27, DateTimeFieldType.SECOND_OF_DAY, 9, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, 43, 51, 49, 40, 40, 57, 58, 52, 61, 7, 43, 61, 59, 55, 54, 60, 43, 48, 44, 32, 42, 34, 47, 28, 32, 44, 45, 55, 38, 59, 55, 71, 65, 86, 64, 93, 64, 88, 81, 110, 115, 110, 118, 127, 64, 91, 70, 94, 92, 69, 69, 84, 87, 89, 80, 106, 70, 80, 86, 90, 91, 81, 70, 50, 53, 43, 78, 81, 92, 93, 87, 103, 89, 77, 76, 87, 72, 84, 89, 65, 103, 93, 86, 89, 90, 84, 93, 92, 118, 105, 100, 101, 111, 95, 100, 117, 114, 97, 116, 105, 111, 110, 95, 115, 101, 99, 36, 59, 54, 55, 61, DateTimeFieldType.HALFDAY_OF_DAY, 34, 32, 55, 62, 61, 51, 54, DateTimeFieldType.HALFDAY_OF_DAY, 33, 59, 40, 55, DateTimeFieldType.HALFDAY_OF_DAY, 48, 43, 38, 55, 33, 118, 105, 100, 101, 111, 95, 117, 114, 108, 37, 59, 54, 38, 58};
    }

    public static void A04() {
        A0B = new String[]{"R5DeYR6FKIddoQ1tNFb4QO1F3D7YHRG7", "hniB1BSXMiqlCD6U", "jhH7rQZzgqsha0FGspkq8z1DrJIjsBJk", "lw6F7y1SoSoTAEcdzLyYaN1xEC1Q2oWX", "ic1GHkKPsX6vyCRQCqNODZsBJ", "Aw8qdmnq9PbtDTR9ez9n3jUjtBry3vCr", "3as5zHbOptZ96SzIdP7nSqOic", "mvWErpvjRXL0vWcjCyiUNQO7TD5zouZh"};
    }

    public static AnonymousClass19 A00(JSONObject jSONObject) {
        int iOptInt;
        AnonymousClass19 anonymousClass19 = new AnonymousClass19();
        anonymousClass19.A07(new C1F().A0H(jSONObject.optString(A01(350, 5, 32))).A0G(jSONObject.optString(A01(342, 8, 14))).A0B(jSONObject.optString(A01(53, 4, 45))).A0F(jSONObject.optString(A01(328, 14, 121))).A0E(jSONObject.optString(A01(227, 12, 26))).A0D(jSONObject.optString(A01(215, 12, 76))).A09(jSONObject.optString(A01(37, 16, 47))).A0A(jSONObject.optString(A01(71, 8, 78))).A0C(jSONObject.optString(A01(95, 17, 2))).A0I());
        anonymousClass19.A08(new C1I(jSONObject.optString(A01(127, 12, 103)), jSONObject.optString(A01(57, 14, 87)), jSONObject.optString(A02(jSONObject))));
        String strA01 = A01(355, 19, 15);
        if (jSONObject.optInt(strA01, -1) == -1) {
            if (A0B[1].length() == 16) {
                String[] strArr = A0B;
                strArr[5] = "m0SNHJxvul7tSRvrfYkKg9k0pQQtrIDe";
                strArr[5] = "m0SNHJxvul7tSRvrfYkKg9k0pQQtrIDe";
                iOptInt = jSONObject.optInt(A01(311, 17, 98), -1);
            }
            throw new RuntimeException();
        }
        iOptInt = jSONObject.optInt(strA01, -1);
        C1B c1bA0H = new C1B().A0J(jSONObject.optString(A01(441, 9, 58))).A0G(jSONObject.optLong(A01(417, 24, 104), -1L)).A0E(iOptInt).A0D(jSONObject.optInt(A01(239, 18, 99), Integer.MAX_VALUE)).A0H(C1S.A01(jSONObject));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(157, 5, 113));
        if (jSONObjectOptJSONObject != null) {
            C1B adMediaBuilder = c1bA0H.A0I(jSONObjectOptJSONObject.optString(A01(374, 3, 125)));
            C1B adMediaBuilder2 = adMediaBuilder.A0C(jSONObjectOptJSONObject.optInt(A01(450, 5, 104)));
            if (A0B[1].length() == 16) {
                String[] strArr2 = A0B;
                strArr2[5] = "WsiHjZ6Ab9OhwgLQk07kFOW3FmkdrPnz";
                strArr2[5] = "WsiHjZ6Ab9OhwgLQk07kFOW3FmkdrPnz";
                adMediaBuilder2.A0B(jSONObjectOptJSONObject.optInt(A01(151, 6, 14)));
            }
            throw new RuntimeException();
        }
        anonymousClass19.A05(c1bA0H);
        anonymousClass19.A0D(jSONObject.optBoolean(A01(290, 21, 64)));
        anonymousClass19.A09(new C1J(LY.A04(jSONObject.optJSONArray(A01(112, 15, 9)))));
        anonymousClass19.A0A(jSONObject.optBoolean(A01(196, 19, 111)));
        return anonymousClass19;
    }

    public static String A02(JSONObject jSONObject) {
        String strA01 = A01(79, 16, 88);
        String delayText = A01(0, 37, 78);
        String delayText2 = jSONObject.optString(strA01, delayText);
        if (delayText2.equals(delayText)) {
            JSONObject genericTextObject = jSONObject.optJSONObject(A01(139, 12, 21));
            if (genericTextObject != null) {
                delayText = genericTextObject.optString(strA01, delayText);
            }
            return delayText;
        }
        return delayText2;
    }

    private void A05(C1B c1b) {
        this.A00 = c1b;
    }

    private final void A06(C1C c1c) {
        this.A01 = c1c;
    }

    private final void A07(C1G c1g) {
        this.A02 = c1g;
    }

    private final void A08(C1I c1i) {
        this.A03 = c1i;
    }

    private final void A09(C1J c1j) {
        this.A04 = c1j;
    }

    private final void A0A(boolean z) {
        this.A06 = z;
    }

    private final void A0B(boolean z) {
        this.A07 = z;
    }

    private final void A0C(boolean z) {
        this.A08 = z;
    }

    private final void A0D(boolean z) {
        this.A09 = z;
    }

    public final C1C A0E() {
        return this.A01;
    }

    public final C1G A0F() {
        return this.A02;
    }

    public final C1I A0G() {
        return this.A03;
    }

    public final C1J A0H() {
        return this.A04;
    }

    public final void A0I(JSONObject jSONObject) {
        this.A00.A0L(jSONObject.optBoolean(A01(377, 22, 2)));
        this.A00.A0K(jSONObject.optBoolean(A01(176, 20, 19), true));
        A06(this.A00.A0M());
        A0K(jSONObject.optBoolean(A01(162, 14, 84)));
        A0B(jSONObject.optBoolean(A01(257, 13, 103)));
        A0C(jSONObject.optBoolean(A01(270, 20, 10)));
    }

    public final void A0J(JSONObject jSONObject) {
        this.A00.A0F(jSONObject.optInt(A01(399, 18, 58)));
        this.A00.A0K(jSONObject.optBoolean(A01(176, 20, 19), true));
        A06(this.A00.A0M());
        A0B(jSONObject.optBoolean(A01(257, 13, 103)));
    }

    public final void A0K(boolean z) {
        this.A05 = z;
    }

    public final boolean A0L() {
        return this.A05;
    }

    public final boolean A0M() {
        return this.A06;
    }

    public final boolean A0N() {
        return this.A07;
    }

    public final boolean A0O() {
        return this.A09;
    }
}
