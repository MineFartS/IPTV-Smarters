package c.f.a.b.k3;

import android.os.Handler;
import android.os.SystemClock;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public interface d0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f9366b;

        public a(Handler handler, d0 d0Var) {
            this.f9365a = d0Var != null ? (Handler) c.f.a.b.j3.g.e(handler) : null;
            this.f9366b = d0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void h(String str, long j2, long j3) {
            ((d0) x0.i(this.f9366b)).m(str, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(String str) {
            ((d0) x0.i(this.f9366b)).j(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void l(c.f.a.b.v2.d dVar) {
            dVar.c();
            ((d0) x0.i(this.f9366b)).c0(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void n(int i2, long j2) {
            ((d0) x0.i(this.f9366b)).F(i2, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void p(c.f.a.b.v2.d dVar) {
            ((d0) x0.i(this.f9366b)).S(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void r(k1 k1Var, c.f.a.b.v2.g gVar) {
            ((d0) x0.i(this.f9366b)).R(k1Var);
            ((d0) x0.i(this.f9366b)).T(k1Var, gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void t(Object obj, long j2) {
            ((d0) x0.i(this.f9366b)).M(obj, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void v(long j2, int i2) {
            ((d0) x0.i(this.f9366b)).j0(j2, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void x(Exception exc) {
            ((d0) x0.i(this.f9366b)).Y(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void z(e0 e0Var) {
            ((d0) x0.i(this.f9366b)).b(e0Var);
        }

        public void A(final Object obj) {
            if (this.f9365a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f9365a.post(new Runnable() { // from class: c.f.a.b.k3.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9375b.t(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j2, final int i2) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9477b.v(j2, i2);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9363b.x(exc);
                    }
                });
            }
        }

        public void D(final e0 e0Var) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9472b.z(e0Var);
                    }
                });
            }
        }

        public void a(final String str, final long j2, final long j3) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9468b.h(str, j2, j3);
                    }
                });
            }
        }

        public void b(final String str) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9361b.j(str);
                    }
                });
            }
        }

        public void c(final c.f.a.b.v2.d dVar) {
            dVar.c();
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9359b.l(dVar);
                    }
                });
            }
        }

        public void d(final int i2, final long j2) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9465b.n(i2, j2);
                    }
                });
            }
        }

        public void e(final c.f.a.b.v2.d dVar) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9367b.p(dVar);
                    }
                });
            }
        }

        public void f(final k1 k1Var, final c.f.a.b.v2.g gVar) {
            Handler handler = this.f9365a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.k3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9474b.r(k1Var, gVar);
                    }
                });
            }
        }
    }

    void F(int i2, long j2);

    void M(Object obj, long j2);

    @Deprecated
    void R(k1 k1Var);

    void S(c.f.a.b.v2.d dVar);

    void T(k1 k1Var, c.f.a.b.v2.g gVar);

    void Y(Exception exc);

    void b(e0 e0Var);

    void c0(c.f.a.b.v2.d dVar);

    void j(String str);

    void j0(long j2, int i2);

    void m(String str, long j2, long j3);
}
