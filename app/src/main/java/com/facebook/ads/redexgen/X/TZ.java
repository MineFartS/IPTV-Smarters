package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TZ extends AbstractRunnableC0817Kk {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ C5L A00;

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 62;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "duWokrEB9Sk";
            strArr2[1] = "FTlmnVD8uM7uVbEL3";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-47, -10, -5, -4, -6, -19, -23, -11, -88, -23, -20, -5, -88, -16, -23, -2, -19, -88, -22, -19, -19, -10, -88, -20, -19, -8, -6, -19, -21, -23, -4, -19, -20, -88, -5, -15, -10, -21, -19, -88, -2, -19, -6, -5, -15, -9, -10, -88, -67, -74, -71, -72};
    }

    public static void A03() {
        A02 = new String[]{"BQWjlrdULsuiWWwYpURBUOdzJEiLjEuR", "h9Pgv92p6kuxM7aTq", "JYY6QD6QYX0", "VEroNg3l8sNexmP4O78VjHFua3ncuiYT", "j5bmbCYQbqapkC6IylNWl7", "8xty1xRybQLufxFbUr7I3FDJwlBoC0zW", "1fXdEFwJU7prJAsTSCeyNAHeDLvPmnaw", "1fylKzvQaF79TT6"};
    }

    public TZ(C5L c5l) {
        this.A00 = c5l;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.onError(this.A00.A03, new AdError(AdErrorType.NO_FILL.getErrorCode(), A01(0, 52, 74)));
    }
}
