package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22427c;

    public /* synthetic */ mj(nm nmVar, int i2) {
        this.f22425a = nmVar;
        this.f22426b = i2;
    }

    public /* synthetic */ mj(nm nmVar, int i2, int i3) {
        this.f22427c = i3;
        this.f22425a = nmVar;
        this.f22426b = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        int i2 = this.f22427c;
        if (i2 == 0) {
            ((nn) obj).M();
            return;
        }
        if (i2 == 1) {
            ((nn) obj).L();
            return;
        }
        nn nnVar = (nn) obj;
        if (i2 == 2) {
            nnVar.X();
        } else {
            nnVar.u();
            nnVar.v();
        }
    }
}
