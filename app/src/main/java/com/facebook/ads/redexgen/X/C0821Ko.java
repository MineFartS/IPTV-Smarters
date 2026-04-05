package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0821Ko {
    public static void A00(AbstractRunnableC0817Kk abstractRunnableC0817Kk) {
        new Handler(Looper.getMainLooper()).post(abstractRunnableC0817Kk);
    }

    public static void A01(AbstractRunnableC0817Kk abstractRunnableC0817Kk, int i2) {
        new Handler(Looper.getMainLooper()).postDelayed(abstractRunnableC0817Kk, i2);
    }
}
