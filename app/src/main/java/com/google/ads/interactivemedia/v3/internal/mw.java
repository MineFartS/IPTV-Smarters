package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mw implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aax f22465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ abc f22466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22467d;

    public /* synthetic */ mw(nm nmVar, aax aaxVar, abc abcVar) {
        this.f22464a = nmVar;
        this.f22465b = aaxVar;
        this.f22466c = abcVar;
    }

    public /* synthetic */ mw(nm nmVar, aax aaxVar, abc abcVar, int i2) {
        this.f22467d = i2;
        this.f22464a = nmVar;
        this.f22465b = aaxVar;
        this.f22466c = abcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        int i2 = this.f22467d;
        if (i2 == 0) {
            ((nn) obj).D();
            return;
        }
        nn nnVar = (nn) obj;
        if (i2 != 1) {
            nnVar.F();
        } else {
            nnVar.C();
        }
    }
}
