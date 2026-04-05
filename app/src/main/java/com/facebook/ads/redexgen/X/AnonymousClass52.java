package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.52, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass52 {
    public static C0S A00(Context context, C8E c8e) {
        X3 sdkContext = A07(context);
        C0V c0vA6N = c8e.A6N(sdkContext);
        if (c0vA6N != null) {
            return c0vA6N.A8V();
        }
        return new RP();
    }

    public static X2 A01(Activity activity) {
        return new X2(activity, A08(), A00(activity, A08()));
    }

    public static X2 A02(Context context) {
        return new X2(context, A08(), new RP());
    }

    public static X2 A03(Context context) {
        return new X2(context, A08(), A00(context, A08()));
    }

    public static X2 A04(Context context) {
        if (JT.A0k(context)) {
            return new X2(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static X2 A05(Context context) {
        return new X2(context, A08(), A00(context, A08()));
    }

    public static DV A06(Context context) {
        return new DV(context, A08(), A08().A6N(A07(context)));
    }

    public static X3 A07(Context context) {
        return new X3(context, A08());
    }

    public static synchronized C8E A08() {
        return C1140Xb.A02();
    }
}
