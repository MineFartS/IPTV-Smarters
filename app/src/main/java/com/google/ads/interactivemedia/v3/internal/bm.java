package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bm extends bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f21378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f21379b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, ly> f21380c;

    public bm(Map<String, ly> map) {
        this.f21380c = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bj
    public final void c() {
        super.c();
        new Handler().postDelayed(new bl(this), Math.max(4000 - (this.f21379b == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f21379b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f21378a = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bj
    public final void f(ap apVar, an anVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, ly> mapH = anVar.h();
        for (String str : mapH.keySet()) {
            bo.h(jSONObject, str, mapH.get(str));
        }
        g(apVar, anVar, jSONObject);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bj
    public final void j() {
        WebView webView = new WebView(ba.b().a());
        this.f21378a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        i(this.f21378a);
        bc.a().h(this.f21378a, null);
        Iterator<String> it = this.f21380c.keySet().iterator();
        if (!it.hasNext()) {
            this.f21379b = Long.valueOf(System.nanoTime());
        } else {
            this.f21380c.get(it.next());
            throw null;
        }
    }
}
