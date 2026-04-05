package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.81, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass81 extends KO {
    public final /* synthetic */ AnonymousClass80 A00;

    public AnonymousClass81(AnonymousClass80 anonymousClass80) {
        this.A00 = anonymousClass80;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(KP kp) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0911Od(this));
    }
}
