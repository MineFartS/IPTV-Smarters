package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22510c;

    public /* synthetic */ ng(nm nmVar, boolean z) {
        this.f22508a = nmVar;
        this.f22509b = z;
    }

    public /* synthetic */ ng(nm nmVar, boolean z, int i2) {
        this.f22510c = i2;
        this.f22508a = nmVar;
        this.f22509b = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        int i2 = this.f22510c;
        if (i2 == 0) {
            ((nn) obj).B();
            return;
        }
        nn nnVar = (nn) obj;
        if (i2 != 1) {
            nnVar.U();
        } else {
            nnVar.G();
            nnVar.A();
        }
    }
}
