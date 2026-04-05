package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mo implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22443b;

    public /* synthetic */ mo(nm nmVar, int i2) {
        this.f22443b = i2;
        this.f22442a = nmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        int i2 = this.f22443b;
        if (i2 == 0) {
            ((nn) obj).s();
            return;
        }
        if (i2 == 1) {
            ((nn) obj).T();
            return;
        }
        if (i2 == 2) {
            ((nn) obj).t();
            return;
        }
        if (i2 == 3) {
            ((nn) obj).x();
            return;
        }
        nn nnVar = (nn) obj;
        if (i2 != 4) {
            nnVar.N();
        } else {
            nnVar.S();
        }
    }
}
