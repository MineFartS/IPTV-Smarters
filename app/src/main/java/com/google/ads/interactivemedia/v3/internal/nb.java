package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm f22492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f22493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22494c;

    public /* synthetic */ nb(nm nmVar, Exception exc) {
        this.f22492a = nmVar;
        this.f22493b = exc;
    }

    public /* synthetic */ nb(nm nmVar, Exception exc, int i2) {
        this.f22494c = i2;
        this.f22492a = nmVar;
        this.f22493b = exc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        int i2 = this.f22494c;
        if (i2 == 0) {
            ((nn) obj).k();
            return;
        }
        if (i2 == 1) {
            ((nn) obj).b();
            return;
        }
        nn nnVar = (nn) obj;
        if (i2 != 2) {
            nnVar.aa();
        } else {
            nnVar.w();
        }
    }
}
