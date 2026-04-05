package c.f.a.b.j3;

import c.f.a.b.z1;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f9262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z1 f9266f = z1.f10620a;

    public q0(i iVar) {
        this.f9262b = iVar;
    }

    public void a(long j2) {
        this.f9264d = j2;
        if (this.f9263c) {
            this.f9265e = this.f9262b.b();
        }
    }

    public void b() {
        if (this.f9263c) {
            return;
        }
        this.f9265e = this.f9262b.b();
        this.f9263c = true;
    }

    @Override // c.f.a.b.j3.b0
    public z1 c() {
        return this.f9266f;
    }

    @Override // c.f.a.b.j3.b0
    public void d(z1 z1Var) {
        if (this.f9263c) {
            a(j());
        }
        this.f9266f = z1Var;
    }

    public void e() {
        if (this.f9263c) {
            a(j());
            this.f9263c = false;
        }
    }

    @Override // c.f.a.b.j3.b0
    public long j() {
        long j2 = this.f9264d;
        if (!this.f9263c) {
            return j2;
        }
        long jB = this.f9262b.b() - this.f9265e;
        z1 z1Var = this.f9266f;
        return j2 + (z1Var.f10622c == 1.0f ? c.f.a.b.w0.d(jB) : z1Var.a(jB));
    }
}
