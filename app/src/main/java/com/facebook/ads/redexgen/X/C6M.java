package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6M {
    public static byte[] A01;
    public static String[] A02;
    public static final String[] A03;
    public final float[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{DateTimeFieldType.SECOND_OF_MINUTE, -63, 7, -23, -33};
    }

    public static void A02() {
        A02 = new String[]{"GyiBUCkC", "sqowKkdsw23oOctujh4JS", "WS", "sGW2HqLA0299cVeMoAEL9ZXgIk1rlANi", "Ioat5RRD6XPbEJm7hsBEOKFMb", "Zw1v1TMFRqO", "eQUvG0dkOz1", "pYpbsacuB19XJGtGbFCxjlIFedam8DTp"};
    }

    static {
        A02();
        A01();
        A03 = new String[]{A00(2, 1, 93), A00(3, 1, 62), A00(4, 1, 51), A00(1, 1, 24)};
    }

    public C6M(float[] fArr) {
        this.A00 = fArr;
    }

    private final float[] A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A00.length * 4;
    }

    public final JSONObject A05(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 0;
        while (true) {
            if (i2 >= this.A00.length) {
                break;
            }
            String[] strArr = A03;
            if (i2 < strArr.length) {
                jSONObject2.put(strArr[i2], r3[i2]);
            }
            i2++;
        }
        if (A02[4].length() == 24) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "3DgDBkbuSJHHMnWd9lbj3dg5obl1cN";
        strArr2[5] = "3DgDBkbuSJHHMnWd9lbj3dg5obl1cN";
        jSONObject.put(A00(0, 1, 109), jSONObject2);
        return jSONObject;
    }

    public final boolean A06(C6M c6m) {
        float[] fArrA03 = c6m.A03();
        if (fArrA03.length != this.A00.length) {
            return false;
        }
        for (int i2 = 0; i2 < fArrA03.length; i2++) {
            if (Math.abs(A03()[i2] - fArrA03[i2]) > C04715u.A01()) {
                return false;
            }
        }
        return true;
    }
}
