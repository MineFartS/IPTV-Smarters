package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aaz extends aau {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f19031c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f19032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f19033e;

    private aaz(mg mgVar, Object obj, Object obj2) {
        super(mgVar);
        this.f19032d = obj;
        this.f19033e = obj2;
    }

    public static aaz b(kn knVar) {
        return new aaz(new aba(knVar), mf.f22401a, f19031c);
    }

    public static aaz c(mg mgVar, Object obj, Object obj2) {
        return new aaz(mgVar, obj, obj2);
    }

    public final aaz a(mg mgVar) {
        return new aaz(mgVar, this.f19032d, this.f19033e);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aau, com.google.ads.interactivemedia.v3.internal.mg
    public final int g(Object obj) {
        Object obj2;
        mg mgVar = this.f19017b;
        if (f19031c.equals(obj) && (obj2 = this.f19033e) != null) {
            obj = obj2;
        }
        return mgVar.g(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aau, com.google.ads.interactivemedia.v3.internal.mg
    public final me j(int i2, me meVar, boolean z) {
        this.f19017b.j(i2, meVar, z);
        if (amn.O(meVar.f22395b, this.f19033e) && z) {
            meVar.f22395b = f19031c;
        }
        return meVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aau, com.google.ads.interactivemedia.v3.internal.mg
    public final mf l(int i2, mf mfVar, long j2) {
        this.f19017b.l(i2, mfVar, j2);
        if (amn.O(mfVar.f22402b, this.f19032d)) {
            mfVar.f22402b = mf.f22401a;
        }
        return mfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aau, com.google.ads.interactivemedia.v3.internal.mg
    public final Object q(int i2) {
        Object objQ = this.f19017b.q(i2);
        return amn.O(objQ, this.f19033e) ? f19031c : objQ;
    }
}
