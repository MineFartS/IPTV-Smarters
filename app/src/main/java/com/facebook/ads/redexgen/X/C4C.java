package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4C {
    @Deprecated
    private final void A00(Rect rect, int i2, C0660Eb c0660Eb) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, C0660Eb c0660Eb, C4U c4u) {
        A00(rect, ((C4G) view.getLayoutParams()).A00(), c0660Eb);
    }
}
