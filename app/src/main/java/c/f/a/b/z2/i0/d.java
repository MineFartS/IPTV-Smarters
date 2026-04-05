package c.f.a.b.z2.i0;

import c.f.a.b.j3.a0;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f10859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f10860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10861d;

    public d(long j2, long j3, long j4) {
        this.f10861d = j2;
        this.f10858a = j4;
        a0 a0Var = new a0();
        this.f10859b = a0Var;
        a0 a0Var2 = new a0();
        this.f10860c = a0Var2;
        a0Var.a(0L);
        a0Var2.a(j3);
    }

    public boolean a(long j2) {
        a0 a0Var = this.f10859b;
        return j2 - a0Var.b(a0Var.c() - 1) < 100000;
    }

    @Override // c.f.a.b.z2.i0.g
    public long b(long j2) {
        return this.f10859b.b(x0.e(this.f10860c, j2, true, true));
    }

    public void c(long j2, long j3) {
        if (a(j2)) {
            return;
        }
        this.f10859b.a(j2);
        this.f10860c.a(j3);
    }

    @Override // c.f.a.b.z2.i0.g
    public long d() {
        return this.f10858a;
    }

    public void e(long j2) {
        this.f10861d = j2;
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        int iE = x0.e(this.f10859b, j2, true, true);
        y yVar = new y(this.f10859b.b(iE), this.f10860c.b(iE));
        if (yVar.f11512b == j2 || iE == this.f10859b.c() - 1) {
            return new x.a(yVar);
        }
        int i2 = iE + 1;
        return new x.a(yVar, new y(this.f10859b.b(i2), this.f10860c.b(i2)));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f10861d;
    }
}
