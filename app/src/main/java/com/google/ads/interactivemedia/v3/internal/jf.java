package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf implements alf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f22047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22049c;

    public /* synthetic */ jf(ld ldVar, int i2) {
        this.f22047a = ldVar;
        this.f22048b = i2;
    }

    public /* synthetic */ jf(ld ldVar, int i2, int i3) {
        this.f22049c = i3;
        this.f22047a = ldVar;
        this.f22048b = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alf
    public final void a(Object obj) {
        if (this.f22049c != 0) {
            ld ldVar = this.f22047a;
            ((lh) obj).k(ldVar.f22302l, this.f22048b);
        } else {
            ld ldVar2 = this.f22047a;
            int i2 = this.f22048b;
            mg mgVar = ldVar2.f22291a;
            ((lh) obj).y(i2);
        }
    }
}
