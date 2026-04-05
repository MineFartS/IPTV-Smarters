package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0637Dc {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{10, 76, 69, 88, 10, 94, 83, 90, 79, 10, 66, 89, 30, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 67, 89, 84, 127, 98, 121, 124, 55, 126, 100, 55, 99, 120, 120, 55, 123, 118, 101, 112, 114, 55, 63, 105, 37, 80, 85, 60, 62, 55, 99, 120, 55, 100, 124, 126, 103, 44, 55, 126, 115, 45, 55, 84, 105, 97, 116, 114, 101, 116, 117, 49, 115, 125, 126, 114, 122, 49, 112, 125, 120, 118, 127, 124, 116, 127, 101, 43, 49, 92, 114, 123, 122, 103, 124, 123, 114, 53, 96, 123, 126, 123, 122, 98, 123, 53, 66, 84, 67, 53, 118, 125, 96, 123, 126, 47, 53, 108, 119, 120, 120, 119, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 2, 112, 107, 100, 100, 2, 68, 77, 80, 79, 67, 86, 24, 2, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 111, 121, 110, 24, 90, 81, 76, 24, 92, 93, 72, 76, 80, 24, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 104, 126, 105, 31, 89, 80, 77, 82, 94, 75, 31, 75, 70, 79, 90, 5, 31, 5, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.MILLIS_OF_SECOND, 24, 46, 57, 7, 42, 46, 43, 42, 61, 29, 42, 46, 43, 42, 61, 102, 99, 118, 99, DateTimeFieldType.MINUTE_OF_HOUR, 24, 1, 85};
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x007a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C1192Zb A00(com.facebook.ads.redexgen.X.CG r19) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0637Dc.A00(com.facebook.ads.redexgen.X.CG):com.facebook.ads.redexgen.X.Zb");
    }

    public static void A03(CG cg, C1192Zb c1192Zb) throws InterruptedException, IOException {
        IM.A01(cg);
        IM.A01(c1192Zb);
        cg.ACd();
        C0768Il c0768Il = new C0768Il(8);
        C0636Db c0636DbA00 = C0636Db.A00(cg, c0768Il);
        while (c0636DbA00.A00 != J1.A08(A01(214, 4, 50))) {
            Log.w(A01(199, 15, 127), A01(83, 28, 37) + c0636DbA00.A00);
            long bytesToSkip = c0636DbA00.A01 + 8;
            if (c0636DbA00.A00 == J1.A08(A01(111, 4, 14))) {
                bytesToSkip = 12;
            }
            if (bytesToSkip <= 2147483647L) {
                cg.ADJ((int) bytesToSkip);
                c0636DbA00 = C0636Db.A00(cg, c0768Il);
            } else {
                throw new AI(A01(17, 40, 39) + c0636DbA00.A00);
            }
        }
        cg.ADJ(8);
        c1192Zb.A06(cg.A6p(), c0636DbA00.A01);
    }
}
