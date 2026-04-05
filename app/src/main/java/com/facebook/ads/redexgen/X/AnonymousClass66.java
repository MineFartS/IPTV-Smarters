package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.66, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass66 {
    public static AnonymousClass65 A00;
    public static byte[] A01;
    public static String[] A02;
    public static final String A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {DateTimeFieldType.SECOND_OF_DAY, 71, 50, 52, 63, 67, 56, 62, 61, -17, 51, 68, 65, 56, 61, 54, -17, 52, 71, 52, 50, 68, 67, 56, 62, 61, -3};
        String[] strArr = A02;
        if (strArr[3].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "lreKiDhdf1OAP";
        strArr2[0] = "lreKiDhdf1OAP";
        A01 = bArr;
    }

    public static void A02() {
        A02 = new String[]{"sp1TByEGG7e0GADwDzlASPV0aap3ieHh", "uzFI86KB8SuPvllmns5EhrThmrxeiZB", "WffZMJDQYz5YPWrNy4ctgABXEOCgIES3", "xNvoCKy4p7HAo2gXsjU", "die", "gYyZIkzjV9FAWz0BtKI", "Id5RyLkBfkqUUkVvBGvirNkAkhkz8uh0", "U7WQUa4wbg5Ag319WkF2HwzvOv4zz"};
    }

    static {
        A02();
        A01();
        A03 = AnonymousClass66.class.getSimpleName();
    }

    public static void A03(AnonymousClass65 anonymousClass65) {
        A00 = anonymousClass65;
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static void A04(Throwable th) {
        AnonymousClass65 anonymousClass65 = A00;
        if (anonymousClass65 != null) {
            anonymousClass65.ACX(th);
        } else {
            Log.e(A03, A00(0, 27, 89), th);
        }
    }
}
