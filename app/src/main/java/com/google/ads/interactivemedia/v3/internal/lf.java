package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final akz f22310a = new akz();

    public final lg a() {
        return new lg(this.f22310a.a());
    }

    public final void b(int i2) {
        this.f22310a.b(i2);
    }

    public final void c(lg lgVar) {
        akz akzVar = this.f22310a;
        ala alaVar = lgVar.f22311a;
        for (int i2 = 0; i2 < alaVar.b(); i2++) {
            akzVar.b(alaVar.a(i2));
        }
    }

    public final void d(int... iArr) {
        akz akzVar = this.f22310a;
        for (int i2 : iArr) {
            akzVar.b(i2);
        }
    }

    public final void e(int i2, boolean z) {
        akz akzVar = this.f22310a;
        if (z) {
            akzVar.b(i2);
        }
    }
}
