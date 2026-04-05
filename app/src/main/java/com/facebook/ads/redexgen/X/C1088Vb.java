package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1088Vb implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ C1090Vd A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"wdcki9TayB0epgOAqgPZ60vGLzXQskFg", "eaUsA8pmkvwqM9uF8kH4nQuKK9Zu7ymc", "2dfJX", "k6tMd5tlxlmCEJMQTJf7pwLJqfV91j3Q", "YVwPmyUK2b9QSHLRAwsi84oHRZQXtzOF", "hpSXL0XJUd77PKoaf1", "iaFmBfogLFf9YiLH80pKK2KW3oFuZo4T", "28ANuaZ3OB7zLgtTtX"};
    }

    public C1088Vb(C1090Vd c1090Vd) {
        this.A00 = c1090Vd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 16) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A00 != null) {
            C1090Vd c1090Vd = this.A00;
            return c1090Vd.A0G(c1090Vd.A00.isKeyguardLocked());
        }
        C1090Vd c1090Vd2 = this.A00;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "xEd7j65KlJaDHlrOXF5qOqVEOzAiF9i5";
        strArr2[0] = "xEd7j65KlJaDHlrOXF5qOqVEOzAiF9i5";
        return c1090Vd2.A08(EnumC04916o.A07);
    }
}
