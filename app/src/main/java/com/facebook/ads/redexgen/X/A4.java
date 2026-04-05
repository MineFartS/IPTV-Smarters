package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class A4 implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C0629Cu A00;
    public final /* synthetic */ AV A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-20, 31, DateTimeFieldType.MILLIS_OF_DAY, -9, DateTimeFieldType.MINUTE_OF_HOUR, 8, 32, 12, 25, -16, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_HOUR, -16, DateTimeFieldType.SECOND_OF_MINUTE, 27, 12, 25, DateTimeFieldType.SECOND_OF_MINUTE, 8, DateTimeFieldType.MINUTE_OF_HOUR, -30, -5, -14, 5, -3, -14, -16, 1, -14, -15, -83, -14, -1, -1, -4, -1, -83, -15, -14, -7, -10, 3, -14, -1, -10, -5, -12, -83, -6, -14, 0, 0, -18, -12, -14, -83, -4, -5, -83, -14, 5, 1, -14, -1, -5, -18, -7, -83, 1, -11, -1, -14, -18, -15, -69};
    }

    public A4(C0629Cu c0629Cu, AV av) {
        this.A00 = c0629Cu;
        this.A01 = av;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.A0Y(this.A01);
            } catch (C05699z e2) {
                Log.e(A00(0, 21, 48), A00(21, 55, 22), e2);
                throw new RuntimeException(e2);
            }
        } catch (Throwable e3) {
            C0822Kp.A00(e3, this);
        }
    }
}
