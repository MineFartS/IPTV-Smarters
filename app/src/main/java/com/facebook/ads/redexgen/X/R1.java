package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R1 extends AbstractC0887Nf {
    public final /* synthetic */ R0 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(R0 r0, X2 x2) {
        super(x2);
        this.A00 = r0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0887Nf
    public final WebChromeClient A0A() {
        return new OU(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0887Nf
    public final WebViewClient A0B() {
        return new OV(this.A00, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.A00.A0B.A07(motionEvent, this, this);
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
