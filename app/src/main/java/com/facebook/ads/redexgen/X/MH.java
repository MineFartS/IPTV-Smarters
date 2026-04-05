package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MH {
    public static byte[] A00;
    public static String[] A01;
    public static final String A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{75, 44, 126, 67, 88, 94, 75, 79, 82, 84, 85, 27, 82, 85, 27, 76, 82, 85, 95, 84, 76, 27, 82, 85, 93, 84, 27, 88, 83, 94, 88, 80, 28, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 2, DateTimeFieldType.MILLIS_OF_DAY, 5, DateTimeFieldType.MINUTE_OF_HOUR, 119, 123, 110, 115, 104, 114, 106, 120, 10, 27, 25, DateTimeFieldType.MILLIS_OF_DAY, 26, DateTimeFieldType.MILLIS_OF_DAY, 7, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 90, 89};
    }

    public static void A03() {
        A01 = new String[]{"75", BuildConfig.FLAVOR, "84T1cPcVhFaG3gZ5iFCuz5VGfvW435Ys", "hmgtvPST3LKdfFpjmmFZYvFoyIGtsiKE", "1o0hQSlG2MREJWQYXtVsar2Zo68mKpVL", "LjPyS32kIH6YipP2gsYrsbvo7R8K", "pRhgJcRZc8j2ATnbWVmWTgInp0JNCNsL", "EpPf5pm3Rz1UtI6LaI9QQC8GFK2ymH0S"};
    }

    static {
        A03();
        A02();
        A02 = MH.class.getSimpleName();
    }

    public static Map<String, String> A01(X2 x2) {
        Window window;
        HashMap map = new HashMap();
        if (x2 == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 111), String.valueOf(A05(x2)));
            Activity activityA09 = x2.A09();
            if (activityA09 != null && (window = activityA09.getWindow()) != null) {
                int i2 = window.getAttributes().flags;
                map.put(A00(58, 2, 94), Integer.toString(window.getAttributes().type));
                int i3 = 4194304 & i2;
                String strA00 = A00(1, 1, 110);
                String strA002 = A00(0, 1, 8);
                map.put(A00(48, 5, 14), i3 > 0 ? strA00 : strA002);
                if (A01[1].length() == 23) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                strArr[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                if ((524288 & i2) <= 0) {
                    strA00 = strA002;
                }
                String flagShowWhenLockedEnabled = A00(53, 5, 18);
                map.put(flagShowWhenLockedEnabled, strA00);
            }
        } catch (Exception e2) {
            String str = A02;
            String flagShowWhenLockedEnabled2 = A00(2, 30, 72);
            Log.e(str, flagShowWhenLockedEnabled2, e2);
            InterfaceC05218c interfaceC05218cA04 = x2.A04();
            int i4 = C05228d.A24;
            C05238e c05238e = new C05238e(e2);
            String flagShowWhenLockedEnabled3 = A00(43, 5, 114);
            interfaceC05218cA04.A86(flagShowWhenLockedEnabled3, i4, c05238e);
        }
        return map;
    }

    public static boolean A04(X2 x2) {
        return !M0.A05(A01(x2));
    }

    public static boolean A05(X2 x2) {
        KeyguardManager keyguardManager = (KeyguardManager) x2.getSystemService(A00(32, 8, 4));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
