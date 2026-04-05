package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class alh<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f20032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private akz f20033b = new akz();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20035d;

    public alh(T t) {
        this.f20032a = t;
    }

    public final void a(int i2, alf<T> alfVar) {
        if (this.f20035d) {
            return;
        }
        if (i2 != -1) {
            this.f20033b.b(i2);
        }
        this.f20034c = true;
        alfVar.a(this.f20032a);
    }

    public final void b(alg<T> algVar) {
        if (this.f20035d || !this.f20034c) {
            return;
        }
        ala alaVarA = this.f20033b.a();
        this.f20033b = new akz();
        this.f20034c = false;
        algVar.a(this.f20032a, alaVarA);
    }

    public final void c(alg<T> algVar) {
        this.f20035d = true;
        if (this.f20034c) {
            algVar.a(this.f20032a, this.f20033b.a());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || alh.class != obj.getClass()) {
            return false;
        }
        return this.f20032a.equals(((alh) obj).f20032a);
    }

    public final int hashCode() {
        return this.f20032a.hashCode();
    }
}
