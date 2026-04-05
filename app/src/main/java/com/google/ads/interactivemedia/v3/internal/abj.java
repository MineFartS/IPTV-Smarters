package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class abj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ abo f19061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ abp f19062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aax f19063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ abc f19064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f19065e;

    public /* synthetic */ abj(abo aboVar, abp abpVar, aax aaxVar, abc abcVar) {
        this.f19061a = aboVar;
        this.f19062b = abpVar;
        this.f19063c = aaxVar;
        this.f19064d = abcVar;
    }

    public /* synthetic */ abj(abo aboVar, abp abpVar, aax aaxVar, abc abcVar, int i2) {
        this.f19065e = i2;
        this.f19061a = aboVar;
        this.f19062b = abpVar;
        this.f19063c = aaxVar;
        this.f19064d = abcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f19065e;
        if (i2 == 0) {
            abo aboVar = this.f19061a;
            this.f19062b.c(aboVar.f19081a, aboVar.f19082b, this.f19063c, this.f19064d);
            return;
        }
        if (i2 != 1) {
            abo aboVar2 = this.f19061a;
            this.f19062b.ah(aboVar2.f19081a, aboVar2.f19082b, this.f19063c, this.f19064d);
            return;
        }
        abo aboVar3 = this.f19061a;
        this.f19062b.b(aboVar3.f19081a, aboVar3.f19082b, this.f19063c, this.f19064d);
    }
}
