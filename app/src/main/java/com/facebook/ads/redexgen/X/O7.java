package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O7 {
    public static final int A01 = C2G.A01(DefaultRenderer.BACKGROUND_COLOR, 115);
    public static final int A00 = C2G.A01(-1, 0);

    public static void A00(X2 x2, ViewGroup viewGroup, String str) {
        new XE(viewGroup, x2).A08(str);
        View view = new View(x2);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C0856Lz.A0V(view, x2);
        viewGroup.addView(view, 0);
    }
}
