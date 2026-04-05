package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1334bx implements Q8 {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 117;
            String[] strArr = A01;
            if (strArr[3].charAt(0) == strArr[6].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "sKECfnlovjgTE3hUnC6hiyxfwSx6iZYU";
            strArr2[6] = "FWGh7KUlNSgjRKrBTTVWdRGVuB2lw617";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-12, DateTimeFieldType.MINUTE_OF_DAY, 31, -40, 37, -47, DateTimeFieldType.SECOND_OF_MINUTE, 26, 36, 33, DateTimeFieldType.MINUTE_OF_DAY, 37, DateTimeFieldType.SECOND_OF_DAY, 25, -47, DateTimeFieldType.SECOND_OF_DAY, 32, 38, 31, 37, DateTimeFieldType.MILLIS_OF_DAY, 35, 36, -33, 1, 38, 48, 45, 30, 49, 32, 37, 34, 33, -35, 32, 44, 50, 43, 49, 34, 47, 48, -21, -35, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 34, 48, 45, 44, 43, 48, 34, -9, -35};
    }

    public static void A02() {
        A01 = new String[]{"XEdsDf1ZbmPdObC9OTEW2z8", "P58GYLlTlw8ULSmid4", "Mge4MDnEmweXwYPX4YofvB", "Ml9Qgu3DLJEhAVMYvCD1k2vZQtwOfhBB", "E1ltw8QxIeAvk6pflmFLXm8YnaEq6i", "JKuYCHjaj2TXENBLxEiyXLq9QhlooG47", "FRLGU9mx00WiiljPewQioxO6UtPhxOrA", "0cr7cMD0TGsotYn7hqiGPP2awzQMRhBn"};
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void A9G(Q6 q6) {
        if (BuildConfigApi.isDebug() && q6 != null) {
            String str = A00(24, 31, 72) + q6.A5V();
        }
    }

    @Override // com.facebook.ads.redexgen.X.Q8
    public final void A9c(Exception exc) {
        if (BuildConfigApi.isDebug()) {
            Log.e(C0792Jj.A01, A00(0, 24, 60), exc);
        }
    }
}
