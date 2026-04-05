package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum QI {
    A05(true, false),
    A06(true, true);

    public static byte[] A02;
    public static String[] A03;
    public boolean A00;
    public boolean A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 69);
            if (A03[6].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "x5tPmx47tzICoGkmwmxxU8TFYjneGYu3";
            strArr[1] = "x5tPmx47tzICoGkmwmxxU8TFYjneGYu3";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{4, 2, DateTimeFieldType.HOUR_OF_DAY, -56, -57, -53, -52};
    }

    public static void A02() {
        A03 = new String[]{"O", "EV50HHvcjD7YLIyebT4WEIV5yebebm0n", "F", "5eKOX", "rITyk", "abzOrFl3CNxf2rC8XtUXLAElYVzjlriN", "oaymDZ7pAEcbNFhv7Y0pKv8En2RbSAw", "1P4e8Svw6pgZkfS1AU7Ku11MIWhAZ0aY"};
    }

    static {
        A02();
        A01();
    }

    QI(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public final String A03() {
        return toString();
    }

    public final boolean A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A01;
    }
}
