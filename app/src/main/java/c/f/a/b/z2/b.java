package c.f.a.b.z2;

import android.support.v4.media.session.PlaybackStateCompat;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f10631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f10632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10633d;

    public static class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f10634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f10638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f10639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f10640g;

        public a(d dVar, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f10634a = dVar;
            this.f10635b = j2;
            this.f10636c = j3;
            this.f10637d = j4;
            this.f10638e = j5;
            this.f10639f = j6;
            this.f10640g = j7;
        }

        @Override // c.f.a.b.z2.x
        public boolean f() {
            return true;
        }

        @Override // c.f.a.b.z2.x
        public x.a h(long j2) {
            return new x.a(new y(j2, c.h(this.f10634a.a(j2), this.f10636c, this.f10637d, this.f10638e, this.f10639f, this.f10640g)));
        }

        @Override // c.f.a.b.z2.x
        public long i() {
            return this.f10635b;
        }

        public long k(long j2) {
            return this.f10634a.a(j2);
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.z2.b$b, reason: collision with other inner class name */
    public static final class C0145b implements d {
        @Override // c.f.a.b.z2.b.d
        public long a(long j2) {
            return j2;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f10644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f10645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f10646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f10647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f10648h;

        public c(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.f10641a = j2;
            this.f10642b = j3;
            this.f10644d = j4;
            this.f10645e = j5;
            this.f10646f = j6;
            this.f10647g = j7;
            this.f10643c = j8;
            this.f10648h = h(j3, j4, j5, j6, j7, j8);
        }

        public static long h(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || j3 + 1 >= j4) {
                return j5;
            }
            long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
            return x0.s(((j8 + j5) - j7) - (j8 / 20), j5, j6 - 1);
        }

        public final long i() {
            return this.f10647g;
        }

        public final long j() {
            return this.f10646f;
        }

        public final long k() {
            return this.f10648h;
        }

        public final long l() {
            return this.f10641a;
        }

        public final long m() {
            return this.f10642b;
        }

        public final void n() {
            this.f10648h = h(this.f10642b, this.f10644d, this.f10645e, this.f10646f, this.f10647g, this.f10643c);
        }

        public final void o(long j2, long j3) {
            this.f10645e = j2;
            this.f10647g = j3;
            n();
        }

        public final void p(long j2, long j3) {
            this.f10644d = j2;
            this.f10646f = j3;
            n();
        }
    }

    public interface d {
        long a(long j2);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f10649a = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10652d;

        public e(int i2, long j2, long j3) {
            this.f10650b = i2;
            this.f10651c = j2;
            this.f10652d = j3;
        }

        public static e d(long j2, long j3) {
            return new e(-1, j2, j3);
        }

        public static e e(long j2) {
            return new e(0, -9223372036854775807L, j2);
        }

        public static e f(long j2, long j3) {
            return new e(-2, j2, j3);
        }
    }

    public interface f {
        void a();

        e b(k kVar, long j2);
    }

    public b(d dVar, f fVar, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.f10631b = fVar;
        this.f10633d = i2;
        this.f10630a = new a(dVar, j2, j3, j4, j5, j6, j7);
    }

    public c a(long j2) {
        return new c(j2, this.f10630a.k(j2), this.f10630a.f10636c, this.f10630a.f10637d, this.f10630a.f10638e, this.f10630a.f10639f, this.f10630a.f10640g);
    }

    public final x b() {
        return this.f10630a;
    }

    public int c(k kVar, w wVar) {
        while (true) {
            c cVar = (c) c.f.a.b.j3.g.i(this.f10632c);
            long j2 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j2 <= this.f10633d) {
                e(false, j2);
                return g(kVar, j2, wVar);
            }
            if (!i(kVar, jK)) {
                return g(kVar, jK, wVar);
            }
            kVar.r();
            e eVarB = this.f10631b.b(kVar, cVar.m());
            int i2 = eVarB.f10650b;
            if (i2 == -3) {
                e(false, jK);
                return g(kVar, jK, wVar);
            }
            if (i2 == -2) {
                cVar.p(eVarB.f10651c, eVarB.f10652d);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(kVar, eVarB.f10652d);
                    e(true, eVarB.f10652d);
                    return g(kVar, eVarB.f10652d, wVar);
                }
                cVar.o(eVarB.f10651c, eVarB.f10652d);
            }
        }
    }

    public final boolean d() {
        return this.f10632c != null;
    }

    public final void e(boolean z, long j2) {
        this.f10632c = null;
        this.f10631b.a();
        f(z, j2);
    }

    public void f(boolean z, long j2) {
    }

    public final int g(k kVar, long j2, w wVar) {
        if (j2 == kVar.getPosition()) {
            return 0;
        }
        wVar.f11506a = j2;
        return 1;
    }

    public final void h(long j2) {
        c cVar = this.f10632c;
        if (cVar == null || cVar.l() != j2) {
            this.f10632c = a(j2);
        }
    }

    public final boolean i(k kVar, long j2) {
        long position = j2 - kVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        kVar.s((int) position);
        return true;
    }
}
