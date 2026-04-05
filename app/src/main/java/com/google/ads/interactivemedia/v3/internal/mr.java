package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ke f22451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qa f22452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22453d;

    public /* synthetic */ mr(nm nmVar, ke keVar, qa qaVar) {
        this.f22450a = nmVar;
        this.f22451b = keVar;
        this.f22452c = qaVar;
    }

    public /* synthetic */ mr(nm nmVar, ke keVar, qa qaVar, int i2) {
        this.f22453d = i2;
        this.f22450a = nmVar;
        this.f22451b = keVar;
        this.f22452c = qaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        nn nnVar = (nn) obj;
        if (this.f22453d != 0) {
            nnVar.h();
            nnVar.i();
        } else {
            nnVar.ah();
            nnVar.ai();
        }
        nnVar.q();
    }
}
