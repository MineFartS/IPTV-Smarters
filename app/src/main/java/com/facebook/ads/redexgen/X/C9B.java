package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9B {
    public static String A00;
    public static byte[] A01;
    public static String[] A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 71, 45, 2, 8, 30, 3, 5, 8, 44, 40, 43, 40, 69, 24, 28, 31, DateTimeFieldType.CLOCKHOUR_OF_DAY, 113, 31, 43, 58, 55, 59, 48, 61, 59, DateTimeFieldType.CLOCKHOUR_OF_DAY, 59, 42, 41, 49, 44, 53, 24, 49, 44, 31, 48, 58, 44, 49, 55, 58, 101, 99, 103, 100, 115, 10, 32, 36, 36, 48, 73, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 26, DateTimeFieldType.SECOND_OF_MINUTE, 121, 72, 76, 93, 64, 33, 7, 3, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 110, 26, 30, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 115, 43, 50, 36, 53, 46, 55, 55, 7, 60, 57, 60, 61, 37, 60, 4, 48, 60, 62, 125, 53, 50, 48, 54, 49, 60, 60, 56, 125, 50, 55, 32, 125, 58, 61, 39, 54, 33, 61, 50, 63, 125, 38, 50, 46, 44, 39, 44, 59, 32, 42, 47, 51, 51, 55, 105, 38, 32, 34, 41, 51, 87, 81, 71, 80, 125, 67, 69, 71, 76, 86, 106, 108, 122, 109, 64, 126, 120, 122, 113, 107, 64, 115, 126, 108, 107, 64, 109, 122, 121, 109, 122, 108, 119, 120, 106, 109, 80, 121, 102, 106, 120};
    }

    public static void A09() {
        A02 = new String[]{"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    }

    static {
        A09();
        A08();
        A00 = A00(83, 7, 65);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    @TargetApi(17)
    @VisibleForTesting
    public static String A01(C8C c8c) {
        return WebSettings.getDefaultUserAgent(c8c);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(final C8C c8c) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.9A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                String str = (String) C9B.A04.get();
                if (str != null) {
                    return str;
                }
                WebView webView = new WebView(c8c.getApplicationContext());
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    C9B.A04.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i2 = 0; i2 < 3; i2++) {
            ExecutorC0851Lu.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable t) {
                A0A(c8c, t);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C8C c8c, C05328n c05328n) {
        String strA07 = c05328n.A07();
        if (TextUtils.isEmpty(strA07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                c8c.A04().A86(A00(119, 7, 90), C05228d.A1F, new C05238e(A00(76, 7, 104)));
            }
        }
        return strA07;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C8C c8c, boolean z) {
        if (c8c == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(126, 10, 84));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long jA01 = JS.A01(c8c);
        String strA00 = A00(146, 23, 12);
        String strA002 = A00(136, 10, 49);
        String strA003 = A00(91, 28, 64);
        if (jA01 > 0) {
            SharedPreferences sharedPreferences = c8c.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA003, c8c), 0);
            String string = sharedPreferences.getString(strA002, null);
            long j2 = sharedPreferences.getLong(strA00, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j2 < jA01) {
                A04.set(string);
                return string;
            }
        }
        String strA01 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                strA01 = A01(c8c);
                A04.set(strA01);
            } catch (Throwable th) {
                A0A(c8c, th);
            }
        }
        if (strA01 == null) {
            strA01 = A02(c8c);
        }
        if (strA01 == null) {
            String userAgentString = A00;
            return userAgentString;
        }
        String[] strArr = A02;
        if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "Kvz6zSF";
        strArr2[7] = "Kvz6zSF";
        if (jA01 > 0) {
            String userAgentString2 = ProcessUtils.getProcessSpecificName(strA003, c8c);
            SharedPreferences sharedPreferences2 = c8c.getSharedPreferences(userAgentString2, 0);
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            String userAgentString3 = A04.get();
            editorEdit.putString(strA002, userAgentString3).apply();
            sharedPreferences2.edit().putLong(strA00, System.currentTimeMillis()).apply();
        }
        return strA01;
    }

    public static String A05(C05328n c05328n, C8C c8c) {
        if (JS.A05(c8c)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A00(10, 5, 121));
            sb.append(A03(c8c, c05328n));
            String strA00 = A00(2, 1, 111);
            sb.append(strA00);
            sb.append(A00(46, 5, 54));
            sb.append(c05328n.A06());
            sb.append(strA00);
            sb.append(A00(51, 5, 117));
            sb.append(c05328n.A04());
            sb.append(strA00);
            return sb.toString();
        }
        return A00(0, 0, 40);
    }

    public static String A06(C05328n c05328n, C8C c8c, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(A04(c8c, z));
        sb.append(A00(0, 2, 127));
        sb.append(A00(15, 31, 77));
        sb.append(A00(61, 5, 29));
        sb.append(A00(3, 7, 127));
        String strA00 = A00(2, 1, 111);
        sb.append(strA00);
        sb.append(A00(66, 5, 82));
        sb.append(C05328n.A03);
        sb.append(strA00);
        sb.append(A05(c05328n, c8c));
        sb.append(A00(71, 5, 79));
        sb.append(BuildConfigApi.getVersionName(c8c));
        sb.append(strA00);
        sb.append(A00(56, 5, 69));
        sb.append(Locale.getDefault().toString());
        sb.append(A00(90, 1, 74));
        return sb.toString();
    }

    public static void A0A(C8C c8c, Throwable th) {
        c8c.A04().A86(A00(169, 8, 28), C05228d.A2D, new C05238e(th));
    }
}
