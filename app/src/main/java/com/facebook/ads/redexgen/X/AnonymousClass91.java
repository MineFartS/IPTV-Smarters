package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.io.File;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.91, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass91 {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;
    public static final AtomicBoolean A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{DateTimeFieldType.MINUTE_OF_HOUR, 39, 90, 78, 81, 73, 40, 84, 83, 75, 78, 76, 40, 85, 75, 89, 86, 80, 75, 7, 58, 43, 50, 7, 73, 92, 80, 83, 91, 7, 77, 86, 89, 7, 95, 31, 29, DateTimeFieldType.HOUR_OF_HALFDAY, 33, DateTimeFieldType.SECOND_OF_MINUTE, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 43, 32, 37, 28, DateTimeFieldType.HOUR_OF_DAY, -34, 10, DateTimeFieldType.CLOCKHOUR_OF_DAY, 7, -1, -69, 9, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -69, -4, -1, -1, -69, 11, -4, DateTimeFieldType.HALFDAY_OF_DAY, -4, 8, 0, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 0, DateTimeFieldType.HALFDAY_OF_DAY, -43, -82, -81, -84, -65, -79, 41, 81, 89, 80, 69, 88, 83, 86, -3, 27, 36, 47, 35, 37, 42, 31, 37, 36, 7, -24, -6, -2, DateTimeFieldType.HALFDAY_OF_DAY, 8, -4, DateTimeFieldType.CLOCKHOUR_OF_DAY, 6, DateTimeFieldType.MILLIS_OF_SECOND, 2, 59, 74, 74, 57, 77, 78, 59, 76, 78, 63, 62, 57, 76, 63, 59, 77, 73, 72, 43, 62, 50, 53, 45, 40, 61, 66, 57, 46, 10, 11, 8, 27, DateTimeFieldType.HALFDAY_OF_DAY, 5, 28, 7, DateTimeFieldType.MINUTE_OF_DAY, 27, 11, 69, 67, 76, 67, 80, 71, 65, 52, 60, 60, 52, 57, 50, 44, 64, 49, 56, 65, 75, 55, 60, 61, 58, 77, 63, 63, 57, 58, 68, 61, 81, 91, 71, 77, 85, 93, 38, 27, 31, DateTimeFieldType.MILLIS_OF_SECOND, 44, 33, 32, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_DAY, 33, 24, 24, 37, DateTimeFieldType.MILLIS_OF_SECOND, 38, 59, 52, 49, 52, 53, 61, 52};
    }

    public static void A07() {
        A01 = new String[]{"Zl9Gy", "71kQi3IibsstuH4HIc9NqplK3KKhyeB5", "mg3crekamZV3aPoxR2E4kv0bqU3kjrTA", "tDWcsuqYwEAdFujtzhVkOh2ka7NI4A0", "PNHzgcYnRnalJ1JX3eWvzB80MfZWvl", "qlQSSPcQAlkQmsVxSKI5q3x7hOoP3mTT", "zrCnzE5ZwKYUMsAQc774FEfNlTnoEqKy", "Bh9hDulTgnsRRUxUYqeR6BXC7"};
    }

    static {
        A07();
        A06();
        A02 = AnonymousClass91.class.getSimpleName();
        A03 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(C8C c8c) {
        try {
            return new File(c8c.getPackageManager().getApplicationInfo(c8c.getPackageName(), 0).publicSourceDir).length();
        } catch (Exception e2) {
            if (A03.compareAndSet(false, true)) {
                c8c.A04().A86(A02(IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 7, 117), C05228d.A0y, new C05238e(e2));
                return -1L;
            }
            return -1L;
        }
    }

    public static String A03(Context context) {
        try {
            return (String) Class.forName(context.getPackageName() + A02(0, 12, 124)).getDeclaredField(A02(37, 10, 99)).get(null);
        } catch (Exception unused) {
            return A02(94, 3, 80);
        }
    }

    public static String A04(Context context) {
        try {
            return String.valueOf(Class.forName(context.getPackageName() + A02(0, 12, 124)).getDeclaredField(A02(71, 5, 1)).getBoolean(null));
        } catch (Exception unused) {
            return A02(94, 3, 80);
        }
    }

    public static String A05(C8C c8c) {
        JSONObject jSONObject = new JSONObject();
        A08(jSONObject, A02(174, 6, 127), String.valueOf(A09()));
        A08(jSONObject, A02(97, 8, 52), String.valueOf(A01(c8c)));
        A08(jSONObject, A02(180, 15, 73), String.valueOf(A00()));
        A08(jSONObject, A02(105, 18, 113), String.valueOf(L7.A01(c8c)));
        A08(jSONObject, A02(161, 13, 111), String.valueOf(A0A(c8c)));
        A08(jSONObject, A02(133, 11, 61), A04(c8c));
        A08(jSONObject, A02(123, 10, 96), A03(c8c));
        return jSONObject.toString();
    }

    public static void A08(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A02, A02(47, 24, 50), e2);
            }
        }
    }

    public static boolean A09() {
        String str = Build.FINGERPRINT;
        String strA02 = A02(IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 7, 117);
        if (!str.contains(strA02) && !Build.FINGERPRINT.startsWith(A02(195, 7, 93))) {
            String str2 = Build.MODEL;
            String strA022 = A02(151, 10, 100);
            boolean zContains = str2.contains(strA022);
            String[] strArr = A01;
            if (strArr[2].charAt(18) != strArr[1].charAt(18)) {
                String[] strArr2 = A01;
                strArr2[2] = "pyp5tHHiNqtWEHhOUDcaxWXpzbT8klnO";
                strArr2[1] = "oLUMgMxReJrH8Y2AxnJ9tXY49GWGMSpB";
                if (!zContains) {
                    String str3 = Build.MODEL;
                    if (A01[3].length() == 31) {
                        String[] strArr3 = A01;
                        strArr3[3] = "kPRAmUopJCVKL3kgnj9rN6E7NTwJXhY";
                        strArr3[3] = "kPRAmUopJCVKL3kgnj9rN6E7NTwJXhY";
                        if (!str3.contains(A02(76, 8, 123)) && !Build.MODEL.contains(A02(12, 25, 126)) && !Build.MANUFACTURER.contains(A02(84, 10, 77)) && ((!Build.BRAND.startsWith(strA02) || !Build.DEVICE.startsWith(strA02)) && !strA022.equals(Build.PRODUCT))) {
                            return false;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean A0A(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
