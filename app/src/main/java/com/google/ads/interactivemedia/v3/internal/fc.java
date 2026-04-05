package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f21774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f21775b;

    public fc(WebView webView, ViewGroup viewGroup) {
        this.f21774a = webView;
        this.f21775b = viewGroup;
    }

    public final void a() {
        this.f21774a.setVisibility(4);
    }

    public final void b() {
        if (((ViewGroup) this.f21774a.getParent()) == null) {
            this.f21775b.addView(this.f21774a, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f21774a.setVisibility(0);
        this.f21775b.bringChildToFront(this.f21774a);
    }
}
