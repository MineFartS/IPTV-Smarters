package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1038Td implements C5P {
    public static byte[] A02;
    public static final String A03;
    public final C5S A00;
    public final C7C A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{50, 84, 71, 78, 81, 67, 70, 75, 80, 73, 2, 7, 70, 2, 67, 85, 85, 71, 86, 85, 58, 92, 79, 86, 89, 75, 78, 83, 88, 81, 10, 83, 87, 75, 81, 79, 36, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 93, 35, 69, 56, 63, 66, 52, 55, 60, 65, 58, -13, 64, 52, 69, 62, 72, 67, DateTimeFieldType.HALFDAY_OF_DAY, -13, -8, 70, 25, 59, 46, 53, 56, 42, 45, 50, 55, 48, -23, 63, 50, 45, 46, 56, 3, -23, -18, 60, -33, -82, -31, -31, -79, -78, -81, -81, -88, -35, -77, -82, -83, -88, -84, -84, -32, -76, -88, -36, -83, -36, -82, -88, -83, -36, -83, -36, -32, -83, -33, -35, -34, -34, -32, -81, 58, 60, 47, 48, 47, 62, 45, 50, DateTimeFieldType.MINUTE_OF_HOUR, 12, 9, 12, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 12};
    }

    static {
        A02();
        A03 = C1038Td.class.getSimpleName();
    }

    public C1038Td(C5S c5s, X3 x3) {
        this.A00 = c5s;
        this.A00.A3G(new C1036Tb(this));
        this.A01 = new C7C(x3);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        String.format(Locale.US, A00(0, 20, 114), Integer.valueOf(this.A00.A5P().size()));
        for (C5V c5v : this.A00.A5P()) {
            int i2 = C5R.A00[c5v.A7G().ordinal()];
            if (i2 == 1) {
                A04(c5v.getUrl());
            } else if (i2 == 2) {
                A06(c5v.getUrl());
            } else if (i2 == 3) {
                A05(c5v.getUrl());
            }
        }
        this.A01.A0Q(new C1037Tc(this), new AnonymousClass75(A00(81, 36, 11), A00(125, 7, 46)));
    }

    private void A04(String str) {
        String.format(Locale.US, A00(20, 20, 122), str);
        AnonymousClass79 anonymousClass79 = new AnonymousClass79(str, -1, -1, A00(81, 36, 11), A00(125, 7, 46));
        anonymousClass79.A01 = A00(117, 8, 90);
        this.A01.A0R(anonymousClass79);
    }

    private void A05(String str) {
        String.format(Locale.US, A00(40, 21, 99), str);
        C7B c7b = new C7B(str, A00(81, 36, 11), A00(125, 7, 46));
        c7b.A04 = true;
        c7b.A02 = A00(117, 8, 90);
        this.A01.A0T(c7b);
    }

    private void A06(String str) {
        String.format(Locale.US, A00(61, 20, 89), str);
        C7B c7b = new C7B(str, A00(81, 36, 11), A00(125, 7, 46));
        c7b.A04 = false;
        c7b.A02 = A00(117, 8, 90);
        this.A01.A0W(c7b);
    }
}
