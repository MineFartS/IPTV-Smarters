package c.f.a.b.t2;

import android.os.Handler;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes.dex */
public interface u {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f10176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f10177b;

        public a(Handler handler, u uVar) {
            this.f10176a = uVar != null ? (Handler) c.f.a.b.j3.g.e(handler) : null;
            this.f10177b = uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void i(Exception exc) {
            ((u) x0.i(this.f10177b)).W(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void k(Exception exc) {
            ((u) x0.i(this.f10177b)).c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m(String str, long j2, long j3) {
            ((u) x0.i(this.f10177b)).B(str, j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void o(String str) {
            ((u) x0.i(this.f10177b)).A(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void q(c.f.a.b.v2.d dVar) {
            dVar.c();
            ((u) x0.i(this.f10177b)).e(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void s(c.f.a.b.v2.d dVar) {
            ((u) x0.i(this.f10177b)).k(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void u(k1 k1Var, c.f.a.b.v2.g gVar) {
            ((u) x0.i(this.f10177b)).X(k1Var);
            ((u) x0.i(this.f10177b)).I(k1Var, gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void w(long j2) {
            ((u) x0.i(this.f10177b)).U(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void y(boolean z) {
            ((u) x0.i(this.f10177b)).a(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void A(int i2, long j2, long j3) {
            ((u) x0.i(this.f10177b)).g0(i2, j2, j3);
        }

        public void B(final long j2) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10079b.w(j2);
                    }
                });
            }
        }

        public void C(final boolean z) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9996b.y(z);
                    }
                });
            }
        }

        public void D(final int i2, final long j2, final long j3) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10081b.A(i2, j2, j3);
                    }
                });
            }
        }

        public void a(final Exception exc) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10005b.i(exc);
                    }
                });
            }
        }

        public void b(final Exception exc) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10049b.k(exc);
                    }
                });
            }
        }

        public void c(final String str, final long j2, final long j3) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10058b.m(str, j2, j3);
                    }
                });
            }
        }

        public void d(final String str) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10063b.o(str);
                    }
                });
            }
        }

        public void e(final c.f.a.b.v2.d dVar) {
            dVar.c();
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10000b.q(dVar);
                    }
                });
            }
        }

        public void f(final c.f.a.b.v2.d dVar) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10085b.s(dVar);
                    }
                });
            }
        }

        public void g(final k1 k1Var, final c.f.a.b.v2.g gVar) {
            Handler handler = this.f10176a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: c.f.a.b.t2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10054b.u(k1Var, gVar);
                    }
                });
            }
        }
    }

    void A(String str);

    void B(String str, long j2, long j3);

    void I(k1 k1Var, c.f.a.b.v2.g gVar);

    void U(long j2);

    void W(Exception exc);

    @Deprecated
    void X(k1 k1Var);

    void a(boolean z);

    void c(Exception exc);

    void e(c.f.a.b.v2.d dVar);

    void g0(int i2, long j2, long j3);

    void k(c.f.a.b.v2.d dVar);
}
