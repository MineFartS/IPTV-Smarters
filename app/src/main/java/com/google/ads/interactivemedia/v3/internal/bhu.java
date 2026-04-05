package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bhu<T> extends bfv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfg f21166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bfr<T> f21167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bfk<T> f21168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bjh<T> f21169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bfw f21170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bhs f21171f = new bhs();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bfv<T> f21172g;

    public bhu(bfr<T> bfrVar, bfk<T> bfkVar, bfg bfgVar, bjh<T> bjhVar, bfw bfwVar) {
        this.f21167b = bfrVar;
        this.f21168c = bfkVar;
        this.f21166a = bfgVar;
        this.f21169d = bjhVar;
        this.f21170e = bfwVar;
    }

    public static bfw a(bjh<?> bjhVar, Object obj) {
        return new bht(obj, bjhVar, bjhVar.d() == bjhVar.c());
    }

    private final bfv<T> b() {
        bfv<T> bfvVar = this.f21172g;
        if (bfvVar != null) {
            return bfvVar;
        }
        bfv<T> bfvVarC = this.f21166a.c(this.f21170e, this.f21169d);
        this.f21172g = bfvVarC;
        return bfvVarC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final T read(bjj bjjVar) {
        if (this.f21168c == null) {
            return b().read(bjjVar);
        }
        if (avq.g(bjjVar) instanceof bfn) {
            return null;
        }
        return this.f21168c.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, T t) throws IOException {
        bfr<T> bfrVar = this.f21167b;
        if (bfrVar == null) {
            b().write(bjlVar, t);
        } else if (t == null) {
            bjlVar.g();
        } else {
            avq.i(bfrVar.a(t), bjlVar);
        }
    }
}
