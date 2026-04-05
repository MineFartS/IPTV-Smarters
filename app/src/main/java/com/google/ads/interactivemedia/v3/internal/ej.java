package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SetJavaScriptEnabled", "NewApi"})
public final class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eh f21709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f21710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f21711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21712d = false;

    public ej(Handler handler, WebView webView, eh ehVar) {
        this.f21711c = handler;
        this.f21710b = webView;
        this.f21709a = ehVar;
        webView.setBackgroundColor(0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 19) {
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new eg(this));
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        if (i2 >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if (i2 >= 21) {
            cookieManager.setAcceptThirdPartyCookies(webView, true);
        }
    }

    public final WebView a() {
        return this.f21710b;
    }

    public final void b() {
        this.f21711c.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ee
            @Override // java.lang.Runnable
            public final void run() {
                this.f21705a.c();
            }
        });
    }

    public final /* synthetic */ void c() {
        this.f21712d = true;
        this.f21710b.destroy();
    }

    public final /* synthetic */ void d(dw dwVar) {
        String strF = dwVar.f();
        boolean z = this.f21712d;
        String strValueOf = String.valueOf(dwVar);
        if (z) {
            StringBuilder sb = new StringBuilder(strValueOf.length() + 50 + String.valueOf(strF).length());
            sb.append("Attempted to send bridge message after cleanup: ");
            sb.append(strValueOf);
            sb.append("; ");
            sb.append(strF);
            pn.g(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(strF).length());
        sb2.append("Sending Javascript msg: ");
        sb2.append(strValueOf);
        sb2.append("; URL: ");
        sb2.append(strF);
        pn.f(sb2.toString());
        if (Build.VERSION.SDK_INT < 19) {
            this.f21710b.loadUrl(strF);
            return;
        }
        try {
            this.f21710b.evaluateJavascript(strF, null);
        } catch (IllegalStateException unused) {
            this.f21710b.loadUrl(strF);
        }
    }

    public final void e(String str) {
        this.f21710b.loadUrl(str);
    }

    public final void f(String str) {
        try {
            dw dwVarC = dw.c(str);
            String strValueOf = String.valueOf(dwVarC);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 32 + String.valueOf(str).length());
            sb.append("Received Javascript msg: ");
            sb.append(strValueOf);
            sb.append("; URL: ");
            sb.append(str);
            pn.f(sb.toString());
            this.f21709a.k(dwVarC);
        } catch (IllegalArgumentException unused) {
            String strValueOf2 = String.valueOf(str);
            pn.g(strValueOf2.length() != 0 ? "Invalid internal message. Please make sure the Google IMA SDK library is up to date. Message: ".concat(strValueOf2) : new String("Invalid internal message. Please make sure the Google IMA SDK library is up to date. Message: "));
        } catch (Exception e2) {
            String strValueOf3 = String.valueOf(str);
            pn.e(strValueOf3.length() != 0 ? "Invalid internal message. Message could not be be parsed: ".concat(strValueOf3) : new String("Invalid internal message. Message could not be be parsed: "), e2);
        }
    }

    public final void g(final dw dwVar) {
        this.f21711c.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ef
            @Override // java.lang.Runnable
            public final void run() {
                this.f21706a.d(dwVar);
            }
        });
    }
}
