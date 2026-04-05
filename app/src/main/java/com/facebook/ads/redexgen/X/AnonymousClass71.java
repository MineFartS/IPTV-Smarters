package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.71, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass71 {

    @Nullable
    public static String A00;
    public static byte[] A01;
    public static String[] A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{117, 96, 98, 40, 109, 86, 91, 74, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 110, 93, 93, 78, 86, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 70, 92, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 65, 90, 67, 67, 87, 81, 4, 2, 47};
    }

    public static void A0B() {
        A02 = new String[]{"ezGqyoPIPKHN83WiKVVevBWkG3P1qDlE", "bHUhqeCZStL3hoLiFuX7aDXMTtUO4SRK", "6mH", "l35BhcLqTpkfPgrTHobWQpDf1vW4Njv0", "2S1uYpKXPbyDBdggYjHCHIIoGx5rp2pm", "U07LIPTAxvw3Yt20DQWphksDXSc1ydWN", "nWa8vBGdC70OTVh7jsXfRaHUkJPGOS0P", "NNhGFPrdPRblbbvf05CBiQrYmSBt33Cu"};
    }

    static {
        A0B();
        A0A();
        A00 = null;
    }

    public static float A00(float f2) {
        return new BigDecimal(f2).setScale(3, RoundingMode.HALF_UP).floatValue();
    }

    public static long A01() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String[] strArr = A02;
        if (strArr[5].charAt(11) != strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "oi1AWXaprIq3DsGdE2VtVNFOHzfK44CR";
        strArr2[1] = "VDiC0kXnWwp3KFPy20II1epcnqCnwjCl";
        return jElapsedRealtime;
    }

    public static long A02(long j2) {
        return j2 - (j2 % PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    @SuppressLint({"CatchGeneralException"})
    public static EnumC04816e A03(@Nullable String str) {
        JSONObject bdObject;
        String strA06 = A06(24, 2, 121);
        if (str == null || str.isEmpty()) {
            return EnumC04816e.A04;
        }
        try {
            bdObject = new JSONObject(str).getJSONObject(A06(22, 2, 58));
        } catch (Throwable unused) {
        }
        if (bdObject == null) {
            return EnumC04816e.A04;
        }
        if (bdObject.has(strA06)) {
            return EnumC04816e.A00(bdObject.getInt(strA06));
        }
        return EnumC04816e.A04;
    }

    public static C1126Wn A04(String str, Throwable th) {
        if (th instanceof NullPointerException) {
            return new C1126Wn(A01(), new C04936q(str), new C04926p(EnumC04916o.A07));
        }
        boolean z = th instanceof SecurityException;
        if (A02[3].charAt(27) != 'P') {
            String[] strArr = A02;
            strArr[7] = "UmchuACFheILBJlaih7XmvNlXQtm6iWO";
            strArr[7] = "UmchuACFheILBJlaih7XmvNlXQtm6iWO";
            if (z) {
                return new C1126Wn(A01(), new C04936q(str), new C04926p(EnumC04916o.A06));
            }
            if (!(th instanceof UnsupportedOperationException)) {
                boolean z2 = th instanceof NoSuchAlgorithmException;
                if (A02[0].charAt(9) != 'T') {
                    String[] strArr2 = A02;
                    strArr2[3] = "x60dR1TMPSfTuY8uuU5k4CgjQFfD2Ly1";
                    strArr2[3] = "x60dR1TMPSfTuY8uuU5k4CgjQFfD2Ly1";
                    if (!z2) {
                        return new C1126Wn(A01(), new C04936q(str), new C04926p(th));
                    }
                }
            }
            return new C1126Wn(A01(), new C04936q(str), new C04926p(EnumC04916o.A05));
        }
        throw new RuntimeException();
    }

    @SuppressLint({"BadMethodUse-java.util.UUID.randomUUID"})
    public static String A05() {
        if (A00 == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                A00 = UUID.randomUUID().toString();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        return A00;
    }

    @Nullable
    @SuppressLint({"EmptyCatchBlock"})
    public static String A07(String str) {
        String strA06 = A06(26, 1, 84);
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has(strA06)) {
                return null;
            }
            string = Integer.toString(jSONObject.getInt(strA06));
            return string;
        } catch (JSONException unused) {
            return string;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A08(byte[] r7, com.facebook.ads.redexgen.X.AnonymousClass70 r8) throws java.security.NoSuchAlgorithmException {
        /*
            if (r7 == 0) goto L3c
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.String r0 = r8.A03()
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            byte[] r5 = r0.digest(r7)
            r4 = 0
        L14:
            int r0 = r5.length
            if (r4 >= r0) goto L37
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r1 = 0
            r0 = r5[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            r2 = 0
            r1 = 4
            r0 = 95
            java.lang.String r0 = A06(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r6.append(r0)
            int r4 = r4 + 1
            goto L14
        L37:
            java.lang.String r0 = r6.toString()
            return r0
        L3c:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r2 = 4
            r1 = 18
            r0 = 32
            java.lang.String r0 = A06(r2, r1, r0)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass71.A08(byte[], com.facebook.ads.redexgen.X.70):java.lang.String");
    }

    public static Map<String, String> A09(C04715u c04715u) {
        HashMap map = new HashMap();
        map.put(AnonymousClass62.A04.A03(), A05());
        map.put(AnonymousClass62.A0A.A03(), Long.toString(TimeUnit.SECONDS.toMillis(c04715u.A0T())));
        map.put(AnonymousClass62.A06.A03(), Long.toString(C04826f.A00()));
        map.put(AnonymousClass62.A07.A03(), Integer.toString(c04715u.A0S()));
        map.put(AnonymousClass62.A09.A03(), Integer.toString(c04715u.A0V()));
        map.put(AnonymousClass62.A05.A03(), Integer.toString(c04715u.A0R()));
        map.put(AnonymousClass62.A08.A03(), A07(c04715u.A0h()));
        return map;
    }

    public static void A0C(C04715u c04715u, String str, @Nullable String str2) {
        AnonymousClass63 anonymousClass63A0X = c04715u.A0X();
        if (anonymousClass63A0X == null) {
            return;
        }
        anonymousClass63A0X.A8F(AnonymousClass60.A05.A03(), str, A09(c04715u), str2, null, null, null);
    }

    public static boolean A0D() {
        int i2 = Build.VERSION.SDK_INT;
        if (A02[6].charAt(4) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "tyMFX1CpOJYUV0MeMpbopAmdAMzcot7c";
        strArr[4] = "tyMFX1CpOJYUV0MeMpbopAmdAMzcot7c";
        return i2 >= 29;
    }

    public static boolean A0E() {
        ActivityManager.RunningAppProcessInfo appProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(appProcessInfo);
        return appProcessInfo.importance != 100;
    }

    public static boolean A0F(EnumC04816e enumC04816e) {
        int reputationTierValue = enumC04816e.A03();
        return reputationTierValue == EnumC04816e.A05.A03() || reputationTierValue == EnumC04816e.A07.A03() || reputationTierValue == EnumC04816e.A06.A03();
    }

    public static boolean A0G(@Nullable String str, @Nullable String str2) {
        if (str != null || str2 != null) {
            if (str == null || str2 == null) {
                return false;
            }
            return str.equals(str2);
        }
        if (A02[2].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "CRUhUvJCPqF3o50vaOZhXgSSPBMouYyY";
        strArr[1] = "Hcx4PZUYJ7P3vk50CiSuOhi8dLkBnJKe";
        return true;
    }
}
