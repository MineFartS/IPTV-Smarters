package c.f.a.b.z2.k0;

import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import c.f.a.b.z2.k;
import c.f.a.b.z2.m;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f11038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11046l;

    /* JADX INFO: renamed from: c.f.a.b.z2.k0.b$b, reason: collision with other inner class name */
    public final class C0148b implements x {
        public C0148b() {
        }

        @Override // c.f.a.b.z2.x
        public boolean f() {
            return true;
        }

        @Override // c.f.a.b.z2.x
        public x.a h(long j2) {
            return new x.a(new y(j2, x0.s((b.this.f11036b + ((b.this.f11038d.c(j2) * (b.this.f11037c - b.this.f11036b)) / b.this.f11040f)) - 30000, b.this.f11036b, b.this.f11037c - 1)));
        }

        @Override // c.f.a.b.z2.x
        public long i() {
            return b.this.f11038d.b(b.this.f11040f);
        }
    }

    public b(i iVar, long j2, long j3, long j4, long j5, boolean z) {
        c.f.a.b.j3.g.a(j2 >= 0 && j3 > j2);
        this.f11038d = iVar;
        this.f11036b = j2;
        this.f11037c = j3;
        if (j4 == j3 - j2 || z) {
            this.f11040f = j5;
            this.f11039e = 4;
        } else {
            this.f11039e = 0;
        }
        this.f11035a = new f();
    }

    @Override // c.f.a.b.z2.k0.g
    public long a(k kVar) throws IOException {
        int i2 = this.f11039e;
        if (i2 == 0) {
            long position = kVar.getPosition();
            this.f11041g = position;
            this.f11039e = 1;
            long j2 = this.f11037c - 65307;
            if (j2 > position) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long jI = i(kVar);
                if (jI != -1) {
                    return jI;
                }
                this.f11039e = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(kVar);
            this.f11039e = 4;
            return -(this.f11045k + 2);
        }
        this.f11040f = j(kVar);
        this.f11039e = 4;
        return this.f11041g;
    }

    @Override // c.f.a.b.z2.k0.g
    public void c(long j2) {
        this.f11042h = x0.s(j2, 0L, this.f11040f - 1);
        this.f11039e = 2;
        this.f11043i = this.f11036b;
        this.f11044j = this.f11037c;
        this.f11045k = 0L;
        this.f11046l = this.f11040f;
    }

    @Override // c.f.a.b.z2.k0.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0148b b() {
        if (this.f11040f != 0) {
            return new C0148b();
        }
        return null;
    }

    public final long i(k kVar) throws IOException {
        if (this.f11043i == this.f11044j) {
            return -1L;
        }
        long position = kVar.getPosition();
        if (!this.f11035a.d(kVar, this.f11044j)) {
            long j2 = this.f11043i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f11035a.a(kVar, false);
        kVar.r();
        long j3 = this.f11042h;
        f fVar = this.f11035a;
        long j4 = fVar.f11065c;
        long j5 = j3 - j4;
        int i2 = fVar.f11070h + fVar.f11071i;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        if (j5 < 0) {
            this.f11044j = position;
            this.f11046l = j4;
        } else {
            this.f11043i = kVar.getPosition() + ((long) i2);
            this.f11045k = this.f11035a.f11065c;
        }
        long j6 = this.f11044j;
        long j7 = this.f11043i;
        if (j6 - j7 < 100000) {
            this.f11044j = j7;
            return j7;
        }
        long position2 = kVar.getPosition() - (((long) i2) * (j5 <= 0 ? 2L : 1L));
        long j8 = this.f11044j;
        long j9 = this.f11043i;
        return x0.s(position2 + ((j5 * (j8 - j9)) / (this.f11046l - this.f11045k)), j9, j8 - 1);
    }

    public long j(k kVar) throws w1, EOFException {
        long j2;
        f fVar;
        this.f11035a.b();
        if (!this.f11035a.c(kVar)) {
            throw new EOFException();
        }
        this.f11035a.a(kVar, false);
        f fVar2 = this.f11035a;
        kVar.s(fVar2.f11070h + fVar2.f11071i);
        do {
            j2 = this.f11035a.f11065c;
            f fVar3 = this.f11035a;
            if ((fVar3.f11064b & 4) == 4 || !fVar3.c(kVar) || kVar.getPosition() >= this.f11037c || !this.f11035a.a(kVar, true)) {
                break;
            }
            fVar = this.f11035a;
        } while (m.e(kVar, fVar.f11070h + fVar.f11071i));
        return j2;
    }

    public final void k(k kVar) throws w1 {
        while (true) {
            this.f11035a.c(kVar);
            this.f11035a.a(kVar, false);
            f fVar = this.f11035a;
            if (fVar.f11065c > this.f11042h) {
                kVar.r();
                return;
            } else {
                kVar.s(fVar.f11070h + fVar.f11071i);
                this.f11043i = kVar.getPosition();
                this.f11045k = this.f11035a.f11065c;
            }
        }
    }
}
