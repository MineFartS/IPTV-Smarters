package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class bl implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm f21339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f21340b;

    public bl(bm bmVar) {
        this.f21339a = bmVar;
        this.f21340b = bmVar.f21378a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21340b.destroy();
    }
}
