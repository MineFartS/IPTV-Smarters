package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.annotation.Nullable;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.ads.internal.settings.AdSharedPreferences;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DeflaterOutputStream;
import org.joda.time.DateTimeFieldType;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1143Xe implements AnonymousClass96 {

    @Nullable
    public static String A03;
    public static byte[] A04;
    public static String[] A05;
    public static final LQ A06;
    public static final AtomicBoolean A07;
    public static final AtomicInteger A08;
    public static final AtomicReference<Map<String, String>> A09;
    public final C04655o A00;
    public final C8C A01;
    public final C05328n A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 73);
            i5++;
        }
    }

    public static void A07() {
        A04 = new byte[]{40, 96, 98, 98, 100, 114, 114, 104, 99, 104, 109, 104, 117, 120, 126, 100, 111, 96, 99, 109, 100, 101, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 4, 41, 46, 56, 83, 45, 34, 45, 32, 35, 43, 98, 115, 115, 124, 110, 106, 109, 124, 112, 103, 104, 124, 117, 102, 113, 112, 106, 108, 109, 85, 71, 92, 85, 71, 78, 92, 70, 75, 44, 57, 57, 63, 36, 47, 56, 57, 36, 34, 35, 50, 36, 41, 85, 94, 83, 83, 82, 69, 72, 67, 88, 92, 82, 89, 72, 82, 79, 67, 69, 86, 68, 106, 125, 102, 108, 100, 109, 63, 61, 44, 44, 57, 56, 35, 53, 56, 47, 79, 77, 94, 94, 69, 73, 94, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 2, DateTimeFieldType.MILLIS_OF_SECOND, 9, 6, 4, 25, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 5, 5, 31, 24, DateTimeFieldType.HOUR_OF_DAY, 9, 25, 6, 2, 31, 25, 24, 5, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 88, 68, 72, 82, 73, 83, 85, 94, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 75, 76, 89, 76, 93, 111, 110, 101, 120, 98, 127, 114, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, 61, 42, 120, 44, 55, 51, 61, 54, 3, 10, 24, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, 27, 7, 10, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 63, 50, 48, 55, DateTimeFieldType.HOUR_OF_DAY, 28, 7, 27, 25, 27, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, 7, 12, 11, 7, DateTimeFieldType.SECOND_OF_MINUTE, 11, 94, 83, 72, 68, 88, 66, 69, 84, 82, 52, 51, 46, 41, 60, 49, 49, 56, 47, 53, 54, 58, 56, 53, 60, 33, 45, 39, 41, 43, 35, 34, 47, 39, 50, 47, 41, 40, 57, 53, 35, 52, 48, 47, 37, 35, 73, 66, 83, 80, 72, 85, 76, 88, 83, 94, 87, 66, 114, 111, 111, 116, 101, 100, 27, 11, 26, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 6, DateTimeFieldType.MILLIS_OF_SECOND, 0, DateTimeFieldType.HALFDAY_OF_DAY, 1, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 0, 28, 85, 69, 84, 67, 67, 72, 89, 81, 79, 66, 82, 78, 92, 75, 68, 80, 76, 78, 95, 78, 77, 70, 67, 70, 91, 86, DateTimeFieldType.HOUR_OF_HALFDAY, 24, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 2, 9, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 24, 103, 124, 123, 102, 107, 103, 97, 119, 96, 109, 115, 117, 119, 124, 102, 58, 45, 32, 60, 45, 62, 45, 33, 63, 75, 73, 66, 73, 94, 69, 79, 8, DateTimeFieldType.MINUTE_OF_HOUR, 10, 10};
    }

    public static void A08() {
        A05 = new String[]{"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    }

    static {
        A08();
        A07();
        A07 = new AtomicBoolean();
        A08 = new AtomicInteger(0);
        A03 = null;
        A06 = LR.A00();
        A09 = new AtomicReference<>();
    }

    public C1143Xe(C8C c8c, boolean z, C04655o c04655o) {
        this.A01 = c8c;
        this.A02 = new C05328n(c8c);
        this.A00 = c04655o;
        A09(c8c, z);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(C8C c8c, String str) {
        try {
            return LW.A02(c8c.getPackageManager().getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e2) {
            if (A07.compareAndSet(false, true)) {
                c8c.A04().A86(A01(Constants.NO_SUCH_BUCKET_STATUS_CODE, 7, 101), C05228d.A16, new C05238e(e2));
                return null;
            }
            return null;
        }
    }

    @Nullable
    public static Map<String, String> A05() {
        Map<String, String> map = A09.get();
        if (A05[6].length() == 9) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[2] = "t47MXZ92dMviPmtCt6osuHBAjezNQ9KC";
        strArr[2] = "t47MXZ92dMviPmtCt6osuHBAjezNQ9KC";
        return map;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A09(final C8C c8c, boolean z) {
        if (!A08.compareAndSet(0, 1)) {
            return;
        }
        try {
            final SharedPreferences sharedPreferences = AdSharedPreferences.getSharedPreferences(c8c);
            final String str = A01(25, 4, 33) + new C05328n(c8c).A06();
            A03 = sharedPreferences.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.98
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    C8C c8c2 = c8c;
                    String unused = C1143Xe.A03 = C1143Xe.A02(c8c2, c8c2.getPackageName());
                    sharedPreferences.edit().putString(str, C1143Xe.A03).apply();
                    C1143Xe.A08.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            AtomicInteger atomicInteger = A08;
            if (A05[2].charAt(4) == '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "BG3uZRuA0Chr9fB7D4fD";
            strArr[5] = "ED3rHXlImwDD4lq5TiwH";
            atomicInteger.set(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b6  */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> A6B() {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1143Xe.A6B():java.util.Map");
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass96
    public final String A77() {
        return A78(AnonymousClass95.A00());
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass96
    public final String A78(AnonymousClass94 anonymousClass94) throws IOException {
        A09(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> mapA6B = A6B();
                if (TextUtils.isEmpty(C04525a.A00().A03())) {
                    C04525a.A08(this.A01);
                }
                mapA6B.put(A01(248, 4, 63), C04525a.A00().A03());
                mapA6B.put(A01(385, 10, 123), C9B.A06(this.A02, this.A01, false));
                Iterator<Map.Entry<String, String>> it = mapA6B.entrySet().iterator();
                while (it.hasNext()) {
                    if (!anonymousClass94.A2O(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(mapA6B).toString().getBytes());
                deflaterOutputStream.close();
                String strReplaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 107), A01(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return strReplaceAll;
            } catch (Throwable e2) {
                if (deflaterOutputStream != null) {
                    try {
                        deflaterOutputStream.close();
                    } catch (IOException unused2) {
                        throw e2;
                    }
                }
                if (base64OutputStream != null) {
                    base64OutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw e2;
            }
        } catch (IOException e3) {
            throw new RuntimeException(A01(209, 26, 17), e3);
        }
    }
}
