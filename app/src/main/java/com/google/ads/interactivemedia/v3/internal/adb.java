package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class adb implements sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ke f19236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ke f19239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ri f19240e = new ri();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private sf f19241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19242g;

    public adb(int i2, int i3, ke keVar) {
        this.f19237b = i2;
        this.f19238c = i3;
        this.f19239d = keVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ int a(aje ajeVar, int i2, boolean z) {
        return us.h(this, ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void b(ke keVar) {
        ke keVar2 = this.f19239d;
        if (keVar2 != null) {
            keVar = keVar.d(keVar2);
        }
        this.f19236a = keVar;
        sf sfVar = this.f19241f;
        int i2 = amn.f20135a;
        sfVar.b(keVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final /* synthetic */ void c(alx alxVar, int i2) {
        us.i(this, alxVar, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void d(long j2, int i2, int i3, int i4, se seVar) {
        long j3 = this.f19242g;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            this.f19241f = this.f19240e;
        }
        sf sfVar = this.f19241f;
        int i5 = amn.f20135a;
        sfVar.d(j2, i2, i3, i4, seVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final int e(aje ajeVar, int i2, boolean z) {
        sf sfVar = this.f19241f;
        int i3 = amn.f20135a;
        return sfVar.a(ajeVar, i2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sf
    public final void f(alx alxVar, int i2) {
        sf sfVar = this.f19241f;
        int i3 = amn.f20135a;
        sfVar.c(alxVar, i2);
    }

    public final void g(acz aczVar, long j2) {
        if (aczVar == null) {
            this.f19241f = this.f19240e;
            return;
        }
        this.f19242g = j2;
        sf sfVarC = aczVar.c(this.f19238c);
        this.f19241f = sfVarC;
        ke keVar = this.f19236a;
        if (keVar != null) {
            sfVarC.b(keVar);
        }
    }
}
