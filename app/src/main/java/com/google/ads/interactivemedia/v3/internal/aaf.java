package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aaf implements ack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ack f18966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aag f18967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f18968c;

    public aaf(aag aagVar, ack ackVar) {
        this.f18967b = aagVar;
        this.f18966a = ackVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int a(kf kfVar, pz pzVar, int i2) {
        if (this.f18967b.o()) {
            return -3;
        }
        if (this.f18968c) {
            pzVar.c(4);
            return -4;
        }
        int iA = this.f18966a.a(kfVar, pzVar, i2);
        if (iA == -5) {
            ke keVar = kfVar.f22161b;
            ajr.b(keVar);
            int i3 = keVar.B;
            if (i3 != 0 || keVar.C != 0) {
                int i4 = this.f18967b.f18970b != Long.MIN_VALUE ? 0 : keVar.C;
                kd kdVarB = keVar.b();
                kdVarB.M(i3);
                kdVarB.N(i4);
                kfVar.f22161b = kdVarB.s();
            }
            return -5;
        }
        aag aagVar = this.f18967b;
        long j2 = aagVar.f18970b;
        if (j2 == Long.MIN_VALUE || ((iA != -4 || pzVar.f22803d < j2) && !(iA == -3 && aagVar.bc() == Long.MIN_VALUE && !pzVar.f22802c))) {
            return iA;
        }
        pzVar.b();
        pzVar.c(4);
        this.f18968c = true;
        return -4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int b(long j2) {
        if (this.f18967b.o()) {
            return -3;
        }
        return this.f18966a.b(j2);
    }

    public final void c() {
        this.f18968c = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final void d() {
        this.f18966a.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final boolean e() {
        return !this.f18967b.o() && this.f18966a.e();
    }
}
