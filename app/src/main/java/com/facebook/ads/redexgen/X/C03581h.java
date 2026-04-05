package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03581h extends WebViewClient {
    public boolean A00 = false;
    public final C1S A01;
    public final InterfaceC03571g A02;
    public final boolean A03;

    public C03581h(C1S c1s, InterfaceC03571g interfaceC03571g, boolean z) {
        this.A01 = c1s;
        this.A02 = interfaceC03571g;
        this.A03 = z;
    }

    private void A00() {
        InterfaceC03571g interfaceC03571g = this.A02;
        if (interfaceC03571g != null) {
            interfaceC03571g.AAU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01(WebResourceError webResourceError) {
        if (this.A03) {
            this.A02.AAT(AdError.CACHE_ERROR);
        } else {
            A00();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C1003Rs(this), this.A01.A09());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A01(webResourceError);
    }
}
