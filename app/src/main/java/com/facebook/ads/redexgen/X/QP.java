package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QP {

    @Nullable
    public static Q5 A00;
    public static byte[] A01;
    public static String[] A02;
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 121, 104, DateTimeFieldType.MILLIS_OF_SECOND, 81, 81, 30, 99, DateTimeFieldType.MILLIS_OF_DAY, 103, 127, 85, 116, DateTimeFieldType.SECOND_OF_DAY, 73, 126, DateTimeFieldType.MINUTE_OF_HOUR, 74, 72, 66, 77, DateTimeFieldType.SECOND_OF_DAY, 78, 81, 86, DateTimeFieldType.SECOND_OF_DAY, 115, 73, 85, 77, 27, 44, 9, 86, 113, 76, 80, 116, 73, 92, 87, 72, 84, DateTimeFieldType.HOUR_OF_DAY, 109, 87, 92, 126, 82, 76, 72, 8, 83, 108, 82, DateTimeFieldType.SECOND_OF_MINUTE, 67, 104, 73, 7, 48, DateTimeFieldType.HOUR_OF_HALFDAY, 124, 116, 29, 56, 9, 120, 53, 0, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 40, 32, 37, 120, 62, 60, 56, 53, 61, DateTimeFieldType.HALFDAY_OF_DAY, 9, 47, 54, DateTimeFieldType.SECOND_OF_DAY, 3, 41, DateTimeFieldType.HALFDAY_OF_DAY, 113, 70, 1, 42, 59, 56, 32, 61, 36, 38, 33, 40, 111, 45, 42, 41, 32, 61, 42, 111, 38, 33, 38, 59, 110, 125, 127, 125, 108, DateTimeFieldType.MINUTE_OF_HOUR, 68, 75, 127, 71, 65, 110, 67, DateTimeFieldType.HOUR_OF_HALFDAY, 81, 68, 112, 119, 65, 75, 92, 112, 109, DateTimeFieldType.CLOCKHOUR_OF_DAY, 76, 85, 66, 104, 24, 47, 72, 64, 91, 89, 69, 72, 71, 76, 118, 68, 70, 77, 76, 118, 70, 71, 57, 50, 35, 32, 56, 37, 60, 29, 6, 51, 91, 46, 59, 7, 59, 3, 42, 80, 57, 92, 63, 63, 60, DateTimeFieldType.HALFDAY_OF_DAY, 42, 25, 38, 27, 47, 33, 81, 5, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 56, 84, 99};
    }

    public static void A08() {
        A02 = new String[]{"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    }

    static {
        A08();
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(3, 29, 30));
        A04.add(A05(165, 29, 81));
        A04.add(A05(32, 29, 2));
        A04.add(A05(61, 29, 116));
        A04.add(A05(113, 29, 29));
        A05 = new AtomicBoolean();
    }

    public static Q7 A00(C8C c8c) {
        return A03(true, c8c);
    }

    public static Q7 A01(C8C c8c) {
        return A02(true, c8c);
    }

    public static Q7 A02(boolean z, C8C c8c) {
        QB qb = new QB();
        QE qeA04 = A04(c8c);
        if (!A0B()) {
            qb.A02(A04);
            qb.A01(A03);
        }
        if (LI.A04()) {
            Map<String, String> mapA02 = LI.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            qeA04.A08(mapA02);
        }
        return Q9.A00().A01(qb.A00(qeA04.A09()).A03(z).A04(BuildConfigApi.isDebug()).A05(), c8c.A04(), M4.A01());
    }

    public static Q7 A03(boolean z, C8C c8c) {
        return Q9.A00().A01(new QB().A03(z).A00(A04(c8c).A09()).A04(BuildConfigApi.isDebug()).A05(), c8c.A04(), M4.A01());
    }

    public static QE A04(C8C c8c) {
        A09(c8c);
        QE qe = new QE();
        if (A0B()) {
            qe.A02(360000).A04(120000);
        } else {
            int iA06 = JT.A06(c8c);
            if (A02[4].charAt(20) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "dD0oPHmij4s2ObzR7OPOejAtm2pYkwQj";
            strArr[1] = "6BD1tyrnooF6YeHGpiFkkFGNAjU2pFFN";
            qe.A02(iA06);
        }
        qe.A03(JT.A07(c8c)).A04(JT.A08(c8c)).A05(JT.A09(c8c)).A06(JT.A0A(c8c));
        synchronized (QP.class) {
            if (A00 != null && (A00 instanceof Q5)) {
                qe.A07(A00);
            }
        }
        return qe;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A09(C8C c8c) {
        if (!A05.get()) {
            c8c.A04().A86(A05(158, 7, 111), C05228d.A1f, new C05238e(A05(90, 23, 119)));
        }
    }

    public static synchronized void A0A(Q5 q5) {
        A00 = q5;
    }

    public static boolean A0B() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(A05(0, 3, 50));
    }

    public static boolean A0C(C8C c8c) {
        int i2 = Build.VERSION.SDK_INT;
        String strA05 = A05(142, 16, 17);
        if (i2 < 17) {
            return Settings.System.getInt(c8c.getContentResolver(), strA05, 0) != 0;
        }
        int i3 = Settings.Global.getInt(c8c.getContentResolver(), strA05, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i3 != 0;
    }
}
