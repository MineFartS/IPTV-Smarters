package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class di extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj f21649a;

    public di(dj djVar) {
        this.f21649a = djVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        dj djVar = this.f21649a;
        djVar.f21651b.a(str, djVar.f21650a, false);
        Iterator it = this.f21649a.f21652c.iterator();
        while (it.hasNext()) {
            ((CompanionAdSlot.ClickListener) it.next()).onCompanionAdClick();
        }
        return true;
    }
}
