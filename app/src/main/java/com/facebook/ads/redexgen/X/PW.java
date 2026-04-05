package com.facebook.ads.redexgen.X;

import android.graphics.Paint;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PW extends Paint {
    public final /* synthetic */ PX A00;
    public final /* synthetic */ boolean A01;

    public PW(PX px, boolean z) {
        this.A00 = px;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
