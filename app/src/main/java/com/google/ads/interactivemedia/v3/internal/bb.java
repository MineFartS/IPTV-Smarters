package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class bb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f20787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20788b;

    public bb(WebView webView, String str) {
        this.f20787a = webView;
        this.f20788b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20787a.loadUrl(this.f20788b);
    }
}
