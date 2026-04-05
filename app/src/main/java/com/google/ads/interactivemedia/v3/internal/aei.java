package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ade f19366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afb f19367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aef f19368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19370e;

    public aei(long j2, afb afbVar, ade adeVar, long j3, aef aefVar) {
        this.f19369d = j2;
        this.f19367b = afbVar;
        this.f19370e = j3;
        this.f19366a = adeVar;
        this.f19368c = aefVar;
    }

    public final long b(long j2) {
        return this.f19368c.c(this.f19369d, j2) + this.f19370e;
    }

    public final long c() {
        return this.f19368c.d() + this.f19370e;
    }

    public final long d(long j2) {
        return (b(j2) + this.f19368c.a(this.f19369d, j2)) - 1;
    }

    public final long e() {
        return this.f19368c.f(this.f19369d);
    }

    public final long f(long j2) {
        return h(j2) + this.f19368c.b(j2 - this.f19370e, this.f19369d);
    }

    public final long g(long j2) {
        return this.f19368c.g(j2, this.f19369d) + this.f19370e;
    }

    public final long h(long j2) {
        return this.f19368c.h(j2 - this.f19370e);
    }

    public final aei i(long j2, afb afbVar) throws aad {
        long jG;
        aef aefVarK = this.f19367b.k();
        aef aefVarK2 = afbVar.k();
        if (aefVarK == null) {
            return new aei(j2, afbVar, this.f19366a, this.f19370e, null);
        }
        if (!aefVarK.j()) {
            return new aei(j2, afbVar, this.f19366a, this.f19370e, aefVarK2);
        }
        long jF = aefVarK.f(j2);
        if (jF == 0) {
            return new aei(j2, afbVar, this.f19366a, this.f19370e, aefVarK2);
        }
        long jD = aefVarK.d();
        long jH = aefVarK.h(jD);
        long j3 = (jF + jD) - 1;
        long jH2 = aefVarK.h(j3) + aefVarK.b(j3, j2);
        long jD2 = aefVarK2.d();
        long jH3 = aefVarK2.h(jD2);
        long j4 = this.f19370e;
        if (jH2 == jH3) {
            jG = j4 + ((j3 + 1) - jD2);
        } else {
            if (jH2 < jH3) {
                throw new aad();
            }
            jG = jH3 < jH ? j4 - (aefVarK2.g(jH, j2) - jD) : j4 + (aefVarK.g(jH3, j2) - jD2);
        }
        return new aei(j2, afbVar, this.f19366a, jG, aefVarK2);
    }

    public final aei j(aef aefVar) {
        return new aei(this.f19369d, this.f19367b, this.f19366a, this.f19370e, aefVar);
    }

    public final aey k(long j2) {
        return this.f19368c.i(j2 - this.f19370e);
    }

    public final boolean l(long j2, long j3) {
        return this.f19368c.j() || j3 == -9223372036854775807L || f(j2) <= j3;
    }
}
