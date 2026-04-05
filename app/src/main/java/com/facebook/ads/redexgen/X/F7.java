package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F7 {
    public static byte[] A03;
    public static String[] A04;
    public CF A00;
    public final CH A01;
    public final CF[] A02;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
            String[] strArr = A04;
            if (strArr[1].charAt(6) == strArr[3].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "mNEvNMISV2TsjErCZLDNSt4mIeKbSMWU";
            strArr2[2] = "pkwADRIgEHU8NI8rqtSVQew0tEayD06s";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{94, 87, DateTimeFieldType.SECOND_OF_DAY, 24, 2, 27, DateTimeFieldType.MINUTE_OF_HOUR, 87, 5, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 87, 3, 31, DateTimeFieldType.MINUTE_OF_DAY, 87, 4, 3, 5, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 26, 89, 65, 96, 97, 106, 47, 96, 105, 47, 123, 103, 106, 47, 110, 121, 110, 102, 99, 110, 109, 99, 106, 47, 106, 119, 123, 125, 110, 108, 123, 96, 125, 124, 47, 39};
    }

    public static void A02() {
        A04 = new String[]{"bxXiKI", "1uDei3qzNnKNtNYr8Y2Djp0HGajvtEV5", "mOXymc7srnaPPj6rkYKERyI3NxuvjHfL", "eLJeQSRGsG8qXjpz5HdRmaYCfpHE06ps", "tIHnpnFG5Gy9TDLwgByCKCMlkPhTptnY", "feqrkYPgdz0GJjq4", "3AbGJoGZCQZs42EqNNbBdZ7jf", "CWkuEW"};
    }

    public F7(CF[] cfArr, CH ch) {
        this.A02 = cfArr;
        this.A01 = ch;
    }

    public final CF A03(CG cg, Uri uri) throws InterruptedException, IOException {
        CF cf = this.A00;
        if (cf != null) {
            return cf;
        }
        CF[] cfArr = this.A02;
        int length = cfArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            CF cf2 = cfArr[i2];
            try {
                if (cf2.ADK(cg)) {
                    this.A00 = cf2;
                    cg.ACd();
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                cg.ACd();
                throw th;
            }
            cg.ACd();
            i2++;
        }
        CF cf3 = this.A00;
        if (A04[6].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[0] = "fQ5Ua6";
        strArr[7] = "HZXGBz";
        if (cf3 != null) {
            cf3.A7V(this.A01);
            return this.A00;
        }
        throw new C1235aM(A00(24, 34, 125) + J1.A0V(this.A02) + A00(0, 24, 5), uri);
    }

    public final void A04() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }
}
