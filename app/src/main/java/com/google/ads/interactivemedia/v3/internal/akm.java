package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class akm<T> implements akf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ajl f19988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final akp f19990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final akl<? extends T> f19991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile T f19992f;

    public akm(ajh ajhVar, Uri uri, int i2, akl<? extends T> aklVar) {
        ajk ajkVar = new ajk();
        ajkVar.f(uri);
        ajkVar.b(1);
        ajl ajlVarA = ajkVar.a();
        this.f19990d = new akp(ajhVar);
        this.f19988b = ajlVarA;
        this.f19989c = i2;
        this.f19991e = aklVar;
        this.f19987a = aax.a();
    }

    public final long a() {
        return this.f19990d.g();
    }

    public final Uri b() {
        return this.f19990d.h();
    }

    public final T c() {
        return this.f19992f;
    }

    public final Map<String, List<String>> d() {
        return this.f19990d.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void h() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akf
    public final void i() {
        this.f19990d.j();
        ajj ajjVar = new ajj(this.f19990d, this.f19988b);
        try {
            ajjVar.a();
            Uri uriC = this.f19990d.c();
            ajr.b(uriC);
            this.f19992f = this.f19991e.a(uriC, ajjVar);
        } finally {
            amn.L(ajjVar);
        }
    }
}
