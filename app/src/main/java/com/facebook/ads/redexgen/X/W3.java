package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class W3 implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ W5 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"BjEOBj6HSQS8i4DRK2qoJX27hoC0R4DA", "kauKwe7CVPrqe4cOgSIwGmxqelbhToEk", "XZC7QZo7Jtp8ceyvJGPCObnucv7Agiw", "JUan8YMmX5ogxlB6aq0dkHVlKOHTqFeF", "IuTolVrjy7qRtOK6QcTLTodgNQuY61bU", "4L2hIP4Kb6m", "Yg6y90VIZ7Ah3ybSxqXW6wOi2HMwnGfT", "hl8KcVIJUlPiTEXEjbalUYczznSZgz62"};
    }

    public W3(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A04 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        W5 w5 = this.A00;
        ActivityInfo[] activityInfoArr = w5.A04;
        if (A01[3].charAt(20) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "ZFJR0DMAu8l3jjK6mMcKAcH3eLfgQnHb";
        strArr[4] = "ZFJR0DMAu8l3jjK6mMcKAcH3eLfgQnHb";
        return w5.A05(activityInfoArr.length);
    }
}
