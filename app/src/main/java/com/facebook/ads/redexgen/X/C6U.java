package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C6U {
    public static byte[] A03;
    public static String[] A04;
    public final Context A00;
    public final Intent A01;
    public final C04715u A02;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-114, -101, -111, -97, -100, -106, -111, 91, -106, -101, -95, -110, -101, -95, 91, -114, -112, -95, -106, -100, -101, 91, 111, 110, -127, -127, 114, 127, -122, -116, 112, 117, 110, 123, 116, 114, 113};
    }

    public static void A02() {
        A04 = new String[]{"o84FpHzEZxPfIbBPVc3PyJBEasuCfO6c", "JrI1dU8TTdtObirIwzr9PDFTf", "Oz2bxznKOZIoYiu00r0tMjRqahT5L8eX", "WyAMbI9dOM56rsavBzGbIzP4LEeOBa2a", "QAd1wzNDoH5I97BQWX3GR9O2v", "PJ66RTAVo3tttPzwttyvOY4w2twOeZmh", "FZtFZJQ3MyLobIqHR00oY", "wJgkVVpmtRvVSLM2dL7kjEoPPerdmE0p"};
    }

    public C6U(Context context, C04715u c04715u) {
        this.A00 = context;
        this.A02 = c04715u;
        this.A01 = this.A00.registerReceiver(null, new IntentFilter(A00(0, 37, 37)));
    }

    @Nullable
    public final C04936q A03() {
        if (this.A02.A0a() == EnumC04846h.A0G) {
            return null;
        }
        Context context = this.A00;
        String[] strArr = A04;
        if (strArr[6].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "BdLEpYuR7vP7Yavjfaa4glVMZlrsrS6q";
        strArr2[2] = "BdLEpYuR7vP7Yavjfaa4glVMZlrsrS6q";
        C04936q signalValueContext = new C04936q(context == null ? A00(0, 0, 34) : context.getPackageName());
        return signalValueContext;
    }

    public final AbstractC04956s A04(float f2) {
        return new C1127Wo(SystemClock.elapsedRealtime(), A03(), f2);
    }

    public final AbstractC04956s A05(int i2) {
        return new C1129Wq(SystemClock.elapsedRealtime(), A03(), i2);
    }

    public final AbstractC04956s A06(int i2, HashMap<String, String> map) {
        if (this.A01 != null) {
            HashMap<String, Integer> map2 = new HashMap<>();
            for (String str : map.keySet()) {
                String[] strArr = A04;
                if (strArr[7].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[2] = "InQCvX9bMvCeYEwlTxFUxsBs8sRyWh3b";
                strArr2[2] = "InQCvX9bMvCeYEwlTxFUxsBs8sRyWh3b";
                Intent intent = this.A01;
                String key = map.get(str);
                map2.put(str, Integer.valueOf(intent.getIntExtra(key, i2)));
            }
            return A0D(map2);
        }
        return A08(EnumC04916o.A07);
    }

    public final AbstractC04956s A07(long j2) {
        return new C1131Ws(SystemClock.elapsedRealtime(), A03(), j2);
    }

    public final AbstractC04956s A08(EnumC04916o enumC04916o) {
        return new C1126Wn(SystemClock.elapsedRealtime(), A03(), new C04926p(enumC04916o));
    }

    public final AbstractC04956s A09(String str) {
        return new C1134Wv(SystemClock.elapsedRealtime(), A03(), str);
    }

    public final AbstractC04956s A0A(String str) {
        Intent intent = this.A01;
        if (intent != null) {
            return A09(intent.getStringExtra(str));
        }
        return A08(EnumC04916o.A07);
    }

    public final AbstractC04956s A0B(String str, int i2) {
        Intent intent = this.A01;
        if (intent != null) {
            int intExtra = intent.getIntExtra(str, i2);
            if (A04[4].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[2] = "oU3Fbet9HTJlYuGSJV9pu56iNwFexhrg";
            strArr[2] = "oU3Fbet9HTJlYuGSJV9pu56iNwFexhrg";
            return A05(intExtra);
        }
        return A08(EnumC04916o.A07);
    }

    public final AbstractC04956s A0C(String str, boolean z) {
        Intent intent = this.A01;
        if (intent != null) {
            return A0G(intent.getBooleanExtra(str, z));
        }
        return A08(EnumC04916o.A07);
    }

    public final AbstractC04956s A0D(HashMap<String, Integer> map) {
        return new C1128Wp(SystemClock.elapsedRealtime(), A03(), map);
    }

    public final AbstractC04956s A0E(List<InterfaceC04866j> list) {
        return new C1130Wr(SystemClock.elapsedRealtime(), A03(), list, EnumC04946r.A03);
    }

    public final AbstractC04956s A0F(List<String> resultList) {
        return new C1130Wr(SystemClock.elapsedRealtime(), A03(), resultList, EnumC04946r.A0C);
    }

    public final AbstractC04956s A0G(boolean z) {
        return new C1124Wl(SystemClock.elapsedRealtime(), A03(), z);
    }
}
