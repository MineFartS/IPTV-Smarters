package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8T implements Thread.UncaughtExceptionHandler {
    public static byte[] A05;
    public final X3 A00;
    public final C8S A01;
    public final InterfaceC05198a A02;
    public final Thread.UncaughtExceptionHandler A03;
    public final Map<String, String> A04;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{42, 28, 94, 122, 96, 96, 122, 125, 116, 51, 80, 124, 125, 103, 118, 107, 103, 11, 7, 5, 70, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 11, DateTimeFieldType.HALFDAY_OF_DAY, 10, 7, 7, 3, 70, 9, 12, 27, 71, 86, 69, 87, 76, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 5, DateTimeFieldType.MINUTE_OF_HOUR, 30, DateTimeFieldType.MILLIS_OF_SECOND, 2, 80, 86, 65, 87, 90, 83, 70, 124, 64, 76, 71, 70};
    }

    public C8T(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, X3 x3, C8S c8s) {
        this(uncaughtExceptionHandler, x3, c8s, C05208b.A00());
    }

    public C8T(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, X3 x3, C8S c8s, InterfaceC05198a interfaceC05198a) {
        this.A03 = uncaughtExceptionHandler;
        if (x3 != null) {
            this.A00 = x3;
            this.A04 = c8s.A73(x3);
            this.A01 = c8s;
            this.A02 = interfaceC05198a;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 82));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A03;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C8R c8r;
        try {
            String strA03 = C0839Li.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03) && strA03.contains(A00(17, 16, 41))) {
                Map<String, String> mapA5b = this.A01.A5b();
                if (mapA5b != null) {
                    c8r = new C8R(strA03, mapA5b);
                } else {
                    Map<String, String> crashReportDataDataMap = this.A04;
                    c8r = new C8R(strA03, crashReportDataDataMap);
                }
                Map<String, String> mapA02 = c8r.A02();
                mapA02.put(A00(38, 7, 38), A00(33, 5, 101));
                Throwable thA00 = AbstractRunnableC0817Kk.A00();
                String strA00 = A00(45, 12, 98);
                if (thA00 != th) {
                    mapA02.put(strA00, A00(0, 1, 91));
                } else {
                    mapA02.put(strA00, A00(1, 1, 108));
                }
                C05268h report = new C05268h(this.A00.A05().A01(), this.A00.A05().A02(), mapA02);
                this.A02.ADz(report, this.A00);
                if (JT.A17(this.A00)) {
                    JT.A0Z(this.A00);
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
