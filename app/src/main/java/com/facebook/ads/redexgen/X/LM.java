package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import org.joda.time.DateTimeFieldType;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LM {
    public static int A00;
    public static byte[] A01;
    public static volatile LL A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, DateTimeFieldType.MINUTE_OF_HOUR, 25, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 25, 48, 28, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 27, 24, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 83, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 119, 115, 116, 73, 126, 113, 76, 127, 104, 105, 115, 117, 116, 2, 4, DateTimeFieldType.MINUTE_OF_DAY, 4, 90, 4, DateTimeFieldType.MINUTE_OF_HOUR, 28};
    }

    static {
        A07();
        A00 = -1;
        A02 = LL.A04;
    }

    public static int A01(Context context) {
        if (A02 == LL.A04) {
            A08(context);
        }
        return A00;
    }

    @SuppressLint({"CatchGeneralException"})
    public static int A02(Context context) {
        try {
            return A05(context.getAssets().openXmlResourceParser(A06(0, 19, 71)));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static int A05(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(32, 8, 77))) {
                for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                    if (xmlPullParser.getAttributeName(i2).equals(A06(19, 13, 32))) {
                        return Integer.parseInt(xmlPullParser.getAttributeValue(i2));
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0A()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A02 != LL.A04) {
            return;
        }
        A02 = LL.A03;
        Executors.newSingleThreadExecutor().execute(new C1252ad(context));
    }

    public static boolean A0A() {
        return A02 == LL.A02;
    }
}
