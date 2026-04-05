package c.f.a.b.x2;

import android.os.Handler;
import c.f.a.b.e3.i0;
import c.f.a.b.j3.x0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface a0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0.a f10323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0141a> f10324c;

        /* JADX INFO: renamed from: c.f.a.b.x2.a0$a$a, reason: collision with other inner class name */
        public static final class C0141a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f10325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public a0 f10326b;

            public C0141a(Handler handler, a0 a0Var) {
                this.f10325a = handler;
                this.f10326b = a0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C0141a> copyOnWriteArrayList, int i2, i0.a aVar) {
            this.f10324c = copyOnWriteArrayList;
            this.f10322a = i2;
            this.f10323b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void i(a0 a0Var) {
            a0Var.V(this.f10322a, this.f10323b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void k(a0 a0Var) {
            a0Var.K(this.f10322a, this.f10323b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m(a0 a0Var) {
            a0Var.l0(this.f10322a, this.f10323b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void o(a0 a0Var, int i2) {
            a0Var.P(this.f10322a, this.f10323b);
            a0Var.e0(this.f10322a, this.f10323b, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void q(a0 a0Var, Exception exc) {
            a0Var.u(this.f10322a, this.f10323b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void s(a0 a0Var) {
            a0Var.f0(this.f10322a, this.f10323b);
        }

        public void a(Handler handler, a0 a0Var) {
            c.f.a.b.j3.g.e(handler);
            c.f.a.b.j3.g.e(a0Var);
            this.f10324c.add(new C0141a(handler, a0Var));
        }

        public void b() {
            for (C0141a c0141a : this.f10324c) {
                final a0 a0Var = c0141a.f10326b;
                x0.K0(c0141a.f10325a, new Runnable() { // from class: c.f.a.b.x2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10341b.i(a0Var);
                    }
                });
            }
        }

        public void c() {
            for (C0141a c0141a : this.f10324c) {
                final a0 a0Var = c0141a.f10326b;
                x0.K0(c0141a.f10325a, new Runnable() { // from class: c.f.a.b.x2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10338b.k(a0Var);
                    }
                });
            }
        }

        public void d() {
            for (C0141a c0141a : this.f10324c) {
                final a0 a0Var = c0141a.f10326b;
                x0.K0(c0141a.f10325a, new Runnable() { // from class: c.f.a.b.x2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10348b.m(a0Var);
                    }
                });
            }
        }

        public void e(final int i2) {
            for (C0141a c0141a : this.f10324c) {
                final a0 a0Var = c0141a.f10326b;
                x0.K0(c0141a.f10325a, new Runnable() { // from class: c.f.a.b.x2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10361b.o(a0Var, i2);
                    }
                });
            }
        }

        public void f(final Exception exc) {
            for (C0141a c0141a : this.f10324c) {
                final a0 a0Var = c0141a.f10326b;
                x0.K0(c0141a.f10325a, new Runnable() { // from class: c.f.a.b.x2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10354b.q(a0Var, exc);
                    }
                });
            }
        }

        public void g() {
            for (C0141a c0141a : this.f10324c) {
                final a0 a0Var = c0141a.f10326b;
                x0.K0(c0141a.f10325a, new Runnable() { // from class: c.f.a.b.x2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10336b.s(a0Var);
                    }
                });
            }
        }

        public void t(a0 a0Var) {
            for (C0141a c0141a : this.f10324c) {
                if (c0141a.f10326b == a0Var) {
                    this.f10324c.remove(c0141a);
                }
            }
        }

        public a u(int i2, i0.a aVar) {
            return new a(this.f10324c, i2, aVar);
        }
    }

    void K(int i2, i0.a aVar);

    @Deprecated
    void P(int i2, i0.a aVar);

    void V(int i2, i0.a aVar);

    void e0(int i2, i0.a aVar, int i3);

    void f0(int i2, i0.a aVar);

    void l0(int i2, i0.a aVar);

    void u(int i2, i0.a aVar, Exception exc);
}
