package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class afn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final rz f19504b = new rz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rj f19505a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ke f19506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aml f19507d;

    public afn(rj rjVar, ke keVar, aml amlVar) {
        this.f19505a = rjVar;
        this.f19506c = keVar;
        this.f19507d = amlVar;
    }

    public final boolean a() {
        rj rjVar = this.f19505a;
        return (rjVar instanceof xc) || (rjVar instanceof ul);
    }

    public final boolean b(rk rkVar) {
        return this.f19505a.a(rkVar, f19504b) == 0;
    }

    public final afn c() {
        rj ttVar;
        ajr.f(!a());
        rj rjVar = this.f19505a;
        if (rjVar instanceof agq) {
            ttVar = new agq(this.f19506c.f22147c, this.f19507d);
        } else if (rjVar instanceof vu) {
            ttVar = new vu();
        } else if (rjVar instanceof vp) {
            ttVar = new vp();
        } else if (rjVar instanceof vs) {
            ttVar = new vs();
        } else {
            if (!(rjVar instanceof tt)) {
                String simpleName = rjVar.getClass().getSimpleName();
                throw new IllegalStateException(simpleName.length() != 0 ? "Unexpected extractor type for recreation: ".concat(simpleName) : new String("Unexpected extractor type for recreation: "));
            }
            ttVar = new tt();
        }
        return new afn(ttVar, this.f19506c, this.f19507d);
    }
}
