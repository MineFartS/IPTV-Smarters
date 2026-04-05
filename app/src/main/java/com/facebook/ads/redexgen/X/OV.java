package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OV extends WebViewClient {
    public final /* synthetic */ R0 A00;

    public OV(R0 r0) {
        this.A00 = r0;
    }

    public /* synthetic */ OV(R0 r0, R5 r5) {
        this(r0);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00.A09.A03(EnumC0788Jf.A0R, null);
        this.A00.A0O();
        this.A00.A03 = true;
        this.A00.A0F();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.A00.A0O();
        this.A00.A09.A03(EnumC0788Jf.A0Q, null);
        if (Build.VERSION.SDK_INT >= 23) {
            string = webResourceError.getDescription().toString();
        } else {
            string = BuildConfig.FLAVOR;
        }
        this.A00.A0F.A05(C05228d.A0s, string);
    }
}
