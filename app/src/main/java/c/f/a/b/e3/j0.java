package c.f.a.b.e3;

import android.os.Handler;
import c.f.a.b.e3.i0;
import c.f.a.b.k1;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface j0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0.a f7832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0130a> f7833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f7834d;

        /* JADX INFO: renamed from: c.f.a.b.e3.j0$a$a, reason: collision with other inner class name */
        public static final class C0130a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f7835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public j0 f7836b;

            public C0130a(Handler handler, j0 j0Var) {
                this.f7835a = handler;
                this.f7836b = j0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C0130a> copyOnWriteArrayList, int i2, i0.a aVar, long j2) {
            this.f7833c = copyOnWriteArrayList;
            this.f7831a = i2;
            this.f7832b = aVar;
            this.f7834d = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void f(j0 j0Var, d0 d0Var) {
            j0Var.n(this.f7831a, this.f7832b, d0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void h(j0 j0Var, a0 a0Var, d0 d0Var) {
            j0Var.o(this.f7831a, this.f7832b, a0Var, d0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(j0 j0Var, a0 a0Var, d0 d0Var) {
            j0Var.a0(this.f7831a, this.f7832b, a0Var, d0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void l(j0 j0Var, a0 a0Var, d0 d0Var, IOException iOException, boolean z) {
            j0Var.i0(this.f7831a, this.f7832b, a0Var, d0Var, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void n(j0 j0Var, a0 a0Var, d0 d0Var) {
            j0Var.w(this.f7831a, this.f7832b, a0Var, d0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void p(j0 j0Var, i0.a aVar, d0 d0Var) {
            j0Var.q(this.f7831a, aVar, d0Var);
        }

        public void A(a0 a0Var, int i2, int i3, k1 k1Var, int i4, Object obj, long j2, long j3) {
            B(a0Var, new d0(i2, i3, k1Var, i4, obj, b(j2), b(j3)));
        }

        public void B(final a0 a0Var, final d0 d0Var) {
            for (C0130a c0130a : this.f7833c) {
                final j0 j0Var = c0130a.f7836b;
                c.f.a.b.j3.x0.K0(c0130a.f7835a, new Runnable() { // from class: c.f.a.b.e3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7248b.n(j0Var, a0Var, d0Var);
                    }
                });
            }
        }

        public void C(j0 j0Var) {
            for (C0130a c0130a : this.f7833c) {
                if (c0130a.f7836b == j0Var) {
                    this.f7833c.remove(c0130a);
                }
            }
        }

        public void D(int i2, long j2, long j3) {
            E(new d0(1, i2, null, 3, null, b(j2), b(j3)));
        }

        public void E(final d0 d0Var) {
            final i0.a aVar = (i0.a) c.f.a.b.j3.g.e(this.f7832b);
            for (C0130a c0130a : this.f7833c) {
                final j0 j0Var = c0130a.f7836b;
                c.f.a.b.j3.x0.K0(c0130a.f7835a, new Runnable() { // from class: c.f.a.b.e3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6906b.p(j0Var, aVar, d0Var);
                    }
                });
            }
        }

        public a F(int i2, i0.a aVar, long j2) {
            return new a(this.f7833c, i2, aVar, j2);
        }

        public void a(Handler handler, j0 j0Var) {
            c.f.a.b.j3.g.e(handler);
            c.f.a.b.j3.g.e(j0Var);
            this.f7833c.add(new C0130a(handler, j0Var));
        }

        public final long b(long j2) {
            long jE = c.f.a.b.w0.e(j2);
            if (jE == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f7834d + jE;
        }

        public void c(int i2, k1 k1Var, int i3, Object obj, long j2) {
            d(new d0(1, i2, k1Var, i3, obj, b(j2), -9223372036854775807L));
        }

        public void d(final d0 d0Var) {
            for (C0130a c0130a : this.f7833c) {
                final j0 j0Var = c0130a.f7836b;
                c.f.a.b.j3.x0.K0(c0130a.f7835a, new Runnable() { // from class: c.f.a.b.e3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7062b.f(j0Var, d0Var);
                    }
                });
            }
        }

        public void q(a0 a0Var, int i2) {
            r(a0Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(a0 a0Var, int i2, int i3, k1 k1Var, int i4, Object obj, long j2, long j3) {
            s(a0Var, new d0(i2, i3, k1Var, i4, obj, b(j2), b(j3)));
        }

        public void s(final a0 a0Var, final d0 d0Var) {
            for (C0130a c0130a : this.f7833c) {
                final j0 j0Var = c0130a.f7836b;
                c.f.a.b.j3.x0.K0(c0130a.f7835a, new Runnable() { // from class: c.f.a.b.e3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7472b.h(j0Var, a0Var, d0Var);
                    }
                });
            }
        }

        public void t(a0 a0Var, int i2) {
            u(a0Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(a0 a0Var, int i2, int i3, k1 k1Var, int i4, Object obj, long j2, long j3) {
            v(a0Var, new d0(i2, i3, k1Var, i4, obj, b(j2), b(j3)));
        }

        public void v(final a0 a0Var, final d0 d0Var) {
            for (C0130a c0130a : this.f7833c) {
                final j0 j0Var = c0130a.f7836b;
                c.f.a.b.j3.x0.K0(c0130a.f7835a, new Runnable() { // from class: c.f.a.b.e3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6983b.j(j0Var, a0Var, d0Var);
                    }
                });
            }
        }

        public void w(a0 a0Var, int i2, int i3, k1 k1Var, int i4, Object obj, long j2, long j3, IOException iOException, boolean z) {
            y(a0Var, new d0(i2, i3, k1Var, i4, obj, b(j2), b(j3)), iOException, z);
        }

        public void x(a0 a0Var, int i2, IOException iOException, boolean z) {
            w(a0Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void y(final a0 a0Var, final d0 d0Var, final IOException iOException, final boolean z) {
            for (C0130a c0130a : this.f7833c) {
                final j0 j0Var = c0130a.f7836b;
                c.f.a.b.j3.x0.K0(c0130a.f7835a, new Runnable() { // from class: c.f.a.b.e3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6920b.l(j0Var, a0Var, d0Var, iOException, z);
                    }
                });
            }
        }

        public void z(a0 a0Var, int i2) {
            A(a0Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    void a0(int i2, i0.a aVar, a0 a0Var, d0 d0Var);

    void i0(int i2, i0.a aVar, a0 a0Var, d0 d0Var, IOException iOException, boolean z);

    void n(int i2, i0.a aVar, d0 d0Var);

    void o(int i2, i0.a aVar, a0 a0Var, d0 d0Var);

    void q(int i2, i0.a aVar, d0 d0Var);

    void w(int i2, i0.a aVar, a0 a0Var, d0 d0Var);
}
