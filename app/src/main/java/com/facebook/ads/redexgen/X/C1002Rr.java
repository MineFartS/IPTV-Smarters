package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1002Rr implements AnonymousClass74 {
    public final C1S A00;
    public final InterfaceC03571g A01;
    public final C7C A02;
    public final X2 A03;
    public final boolean A04;

    public C1002Rr(X2 x2, InterfaceC03571g interfaceC03571g, C7C c7c, C1S c1s, boolean z) {
        this.A03 = x2;
        this.A01 = interfaceC03571g;
        this.A02 = c7c;
        this.A00 = c1s;
        this.A04 = z;
    }

    public /* synthetic */ C1002Rr(X2 x2, InterfaceC03571g interfaceC03571g, C7C c7c, C1S c1s, boolean z, C03561f c03561f) {
        this(x2, interfaceC03571g, c7c, c1s, z);
    }

    private void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C03581h(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0F());
    }

    private void A01(boolean z) {
        if (this.A00.A0A() == C1T.A05) {
            A00();
            return;
        }
        String strA0F = this.A00.A0F();
        if (z) {
            strA0F = this.A02.A0L(this.A00.A0F());
        }
        this.A00.A0H(strA0F);
        this.A01.AAU();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9B() {
        if (this.A04) {
            this.A01.AAT(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9I() {
        A01(true);
    }
}
