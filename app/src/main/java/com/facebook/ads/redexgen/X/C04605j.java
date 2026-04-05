package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04605j {

    @Nullable
    public static InterfaceC04615k A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    public static void A03() {
        A03 = new String[]{"dhICO", "mxKq80OLCiD", "i2W9TrIDW1srZxkJxV7foM0MgZvVXbWR", "HI2hESQONWq4EaTE0poPF0OJaSIxJaLc", "DAl184VBvvXhRHJ82dj3bqQv5TXH8TG3", "HKaWDYwPLWKyKiUqhpuc4RGInXEUU", "cSOfcLeIkAX6sPpwLxmVuA24IrFfyR3p", "KnRyMDjzSPNAoacBq98iQYDM8U9nlYJB"};
    }

    static {
        A03();
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C04605j.class) {
            if (A00 == null) {
                return;
            }
            C05238e c05238e = new C05238e(A00.ACW());
            c05238e.A03(1);
            X3 sdkContext = C8B.A00();
            if (sdkContext != null) {
                sdkContext.A04().A86(A00(0, 9, 109), 3401, c05238e);
            }
            InterfaceC04615k interfaceC04615k = A00;
            if (A03[1].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "kDYng9EYBsgXNgOEIL1h1gMPzmVJxAMa";
            strArr[6] = "TYxT1mxIdvKOfg1hbfM6O4XMHE5Nitia";
            interfaceC04615k.reset();
        }
    }

    public static void A04(final long j2) {
        if (j2 > 0) {
            A00 = new C1043Ti();
            new Thread(j2) { // from class: com.facebook.ads.redexgen.X.5l
                public final long A00;

                {
                    this.A00 = j2;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C04605j.A01();
                        } catch (Throwable th) {
                            C0822Kp.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
