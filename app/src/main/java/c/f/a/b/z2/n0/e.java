package c.f.a.b.z2.n0;

import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11491e;

    public e(c cVar, int i2, long j2, long j3) {
        this.f11487a = cVar;
        this.f11488b = i2;
        this.f11489c = j2;
        long j4 = (j3 - j2) / ((long) cVar.f11482e);
        this.f11490d = j4;
        this.f11491e = a(j4);
    }

    public final long a(long j2) {
        return x0.P0(j2 * ((long) this.f11488b), 1000000L, this.f11487a.f11480c);
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        long jS = x0.s((((long) this.f11487a.f11480c) * j2) / (((long) this.f11488b) * 1000000), 0L, this.f11490d - 1);
        long j3 = this.f11489c + (((long) this.f11487a.f11482e) * jS);
        long jA = a(jS);
        y yVar = new y(jA, j3);
        if (jA >= j2 || jS == this.f11490d - 1) {
            return new x.a(yVar);
        }
        long j4 = jS + 1;
        return new x.a(yVar, new y(a(j4), this.f11489c + (((long) this.f11487a.f11482e) * j4)));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f11491e;
    }
}
