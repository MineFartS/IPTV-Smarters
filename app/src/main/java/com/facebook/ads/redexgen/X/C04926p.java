package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04926p {
    public static byte[] A05;
    public static String[] A06;
    public static final String A07;
    public final int A00;
    public final EnumC04916o A01;

    @Nullable
    public final String A02;

    @Nullable
    public final String A03;

    @Nullable
    public final String A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[2].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "Uh6rCcqYck9NcAhTNlTmwzqgbCEX7K96";
            strArr2[3] = "Uh6rCcqYck9NcAhTNlTmwzqgbCEX7K96";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
            i5++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-55, -10, -10, -13, -10, -92, -57, -10, -23, -27, -8, -19, -14, -21, -92, -50, -41, -45, -46, 31, 29, 9, DateTimeFieldType.HOUR_OF_DAY, -4, 5, 11, 25};
    }

    public static void A02() {
        A06 = new String[]{"QeTecly5r3Ba9bHxC0wnpwdEUUrllzAy", "bEKXjPHxcJpa33XPuxx9BYS1WkIWy1gs", "BPs32rsczNPcksI72EKceZ8Ar9gsVFHv", "FBB0uSbaSxXulSlT7i8POlQBv6IvoYbu", "257ROLF87E57WLAlEBuIH5iygOG", "iPGaCxtdoC1kQbSunDLBqq3asDJIWzdx", "WqxRMthVFYlWmP0w7krXRzIuJmv", "wi3XTjuoHO8yYyadkxm6GwkGNAvhEA1y"};
    }

    static {
        A02();
        A01();
        A07 = C04926p.class.getSimpleName();
    }

    public C04926p(EnumC04916o enumC04916o) {
        this.A01 = enumC04916o;
        this.A00 = enumC04916o.A03();
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public C04926p(Throwable th) {
        String string;
        this.A01 = EnumC04916o.A08;
        this.A00 = th.getClass().getName().hashCode();
        this.A03 = th.getClass().getName();
        this.A02 = th.getMessage();
        if (th.getStackTrace() != null && th.getStackTrace().length > 1 && th.getStackTrace().toString().length() > 500) {
            string = th.getStackTrace()[0].toString().substring(0, 500);
        } else {
            string = th.getStackTrace()[0].toString();
        }
        this.A04 = string;
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        int length;
        int length2;
        String str = this.A03;
        if (str != null) {
            length = str.getBytes().length;
        } else {
            length = 0;
        }
        int i2 = length + 4;
        String str2 = this.A02;
        if (str2 != null) {
            length2 = str2.getBytes().length;
        } else {
            length2 = 0;
        }
        int i3 = i2 + length2;
        String str3 = this.A04;
        return i3 + (str3 != null ? str3.getBytes().length : 0);
    }

    public final EnumC04916o A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        return this.A03;
    }

    @Nullable
    public final String A08() {
        return this.A04;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public final JSONObject A09() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i2 = C04906n.A00[this.A01.ordinal()];
            String strA00 = A00(19, 2, 114);
            if (i2 != 1) {
                jSONObject.put(strA00, this.A00);
            } else {
                jSONObject.put(strA00, this.A00);
                jSONObject.put(A00(23, 2, 79), this.A03);
                jSONObject.put(A00(21, 2, 92), this.A02);
                jSONObject.put(A00(25, 2, 94), this.A04);
            }
        } catch (JSONException e2) {
            Log.e(A07, A00(0, 19, 60), e2);
        }
        return jSONObject;
    }
}
