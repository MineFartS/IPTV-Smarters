package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dj extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f21650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fq f21651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f21652c;

    public dj(Context context, fq fqVar, List list) {
        this.f21650a = context;
        this.f21651b = fqVar;
        this.f21652c = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        webViewTransport.setWebView(new WebView(this.f21650a));
        webViewTransport.getWebView().setWebViewClient(new di(this));
        message.sendToTarget();
        return true;
    }
}
