package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f21503a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<View, bp> f21504b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f21505c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet<View> f21506d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet<String> f21507e = new HashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet<String> f21508f = new HashSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f21509g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21510h;

    public final View a(String str) {
        return this.f21505c.get(str);
    }

    public final bp b(View view) {
        bp bpVar = this.f21504b.get(view);
        if (bpVar != null) {
            this.f21504b.remove(view);
        }
        return bpVar;
    }

    public final String c(String str) {
        return this.f21509g.get(str);
    }

    public final String d(View view) {
        if (this.f21503a.size() == 0) {
            return null;
        }
        String str = this.f21503a.get(view);
        if (str != null) {
            this.f21503a.remove(view);
        }
        return str;
    }

    public final HashSet<String> e() {
        return this.f21508f;
    }

    public final HashSet<String> f() {
        return this.f21507e;
    }

    public final void g() {
        this.f21503a.clear();
        this.f21504b.clear();
        this.f21505c.clear();
        this.f21506d.clear();
        this.f21507e.clear();
        this.f21508f.clear();
        this.f21509g.clear();
        this.f21510h = false;
    }

    public final void h() {
        this.f21510h = true;
    }

    public final void i() {
        aw awVarA = aw.a();
        if (awVarA != null) {
            for (ap apVar : awVarA.b()) {
                View viewG = apVar.g();
                if (apVar.k()) {
                    String strI = apVar.i();
                    if (viewG != null) {
                        String str = null;
                        if (viewG.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = viewG;
                            while (true) {
                                if (view == null) {
                                    this.f21506d.addAll(hashSet);
                                    break;
                                }
                                String strE = ly.e(view);
                                if (strE != null) {
                                    str = strE;
                                    break;
                                } else {
                                    hashSet.add(view);
                                    Object parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.f21507e.add(strI);
                            this.f21503a.put(viewG, strI);
                            for (az azVar : apVar.j()) {
                                WebView webView = azVar.d().get();
                                if (webView != null) {
                                    bp bpVar = this.f21504b.get(webView);
                                    if (bpVar != null) {
                                        bpVar.c(apVar.i());
                                    } else {
                                        this.f21504b.put(webView, new bp(azVar, apVar.i()));
                                    }
                                }
                            }
                        } else {
                            this.f21508f.add(strI);
                            this.f21505c.put(strI, viewG);
                            this.f21509g.put(strI, str);
                        }
                    } else {
                        this.f21508f.add(strI);
                        this.f21509g.put(strI, "noAdView");
                    }
                }
            }
        }
    }

    public final int j(View view) {
        if (this.f21506d.contains(view)) {
            return 1;
        }
        return this.f21510h ? 2 : 3;
    }
}
