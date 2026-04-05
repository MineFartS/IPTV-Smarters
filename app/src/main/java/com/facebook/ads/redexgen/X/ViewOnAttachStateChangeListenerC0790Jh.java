package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0790Jh implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0788Jf A00;
    public final /* synthetic */ C0789Jg A01;

    public ViewOnAttachStateChangeListenerC0790Jh(C0789Jg c0789Jg, EnumC0788Jf enumC0788Jf) {
        this.A01 = c0789Jg;
        this.A00 = enumC0788Jf;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A03(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
