package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0839Li {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 45, 2, 90, 42, DateTimeFieldType.CLOCKHOUR_OF_DAY, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i2) {
        if (i2 <= 0) {
            return null;
        }
        float rate = i2;
        if (new Random().nextFloat() >= 1.0f / rate) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, JT.A0F(context), JT.A01(context), JT.A0w(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i2, int i3, boolean z) {
        String strA02 = A02(0, 0, 122);
        if (th == null) {
            return strA02;
        }
        try {
            C1249aa c1249aa = new C1249aa();
            InterfaceC0837Lg c1248aZ = c1249aa;
            if (i3 >= 0) {
                c1248aZ = new C1247aY(c1248aZ, i3);
            }
            if (i2 >= 0) {
                c1248aZ = new C1246aX(c1248aZ, i2, i2);
            }
            if (z) {
                c1248aZ = new C1248aZ(c1248aZ);
            }
            C1250ab c1250ab = new C1250ab(c1249aa, 1, c1248aZ);
            th.printStackTrace(new PrintWriter(new C0838Lh(c1250ab)));
            c1250ab.flush();
            return c1249aa.toString();
        } catch (Exception unused) {
            return strA02;
        }
    }

    public static boolean A08(C0836Lf c0836Lf) {
        String strA03 = c0836Lf.A03();
        if (strA03 == null) {
            return false;
        }
        if (A0A(strA03)) {
            return true;
        }
        Iterator<String> it = c0836Lf.A02().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = c0836Lf.A01().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
