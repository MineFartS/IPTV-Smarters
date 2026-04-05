package c.f.a.b.e3.e1;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.z2.e f7094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7095b;

    public l(c.f.a.b.z2.e eVar, long j2) {
        this.f7094a = eVar;
        this.f7095b = j2;
    }

    @Override // c.f.a.b.e3.e1.j
    public long a(long j2, long j3) {
        return this.f7094a.f10698d[(int) j2];
    }

    @Override // c.f.a.b.e3.e1.j
    public long b(long j2) {
        return this.f7094a.f10699e[(int) j2] - this.f7095b;
    }

    @Override // c.f.a.b.e3.e1.j
    public long c(long j2, long j3) {
        return 0L;
    }

    @Override // c.f.a.b.e3.e1.j
    public long d(long j2, long j3) {
        return -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.e1.j
    public c.f.a.b.e3.e1.p.i e(long j2) {
        return new c.f.a.b.e3.e1.p.i(null, this.f7094a.f10697c[(int) j2], r0.f10696b[r9]);
    }

    @Override // c.f.a.b.e3.e1.j
    public long f(long j2, long j3) {
        return this.f7094a.a(j2 + this.f7095b);
    }

    @Override // c.f.a.b.e3.e1.j
    public boolean g() {
        return true;
    }

    @Override // c.f.a.b.e3.e1.j
    public long h() {
        return 0L;
    }

    @Override // c.f.a.b.e3.e1.j
    public long i(long j2) {
        return this.f7094a.f10695a;
    }

    @Override // c.f.a.b.e3.e1.j
    public long j(long j2, long j3) {
        return this.f7094a.f10695a;
    }
}
