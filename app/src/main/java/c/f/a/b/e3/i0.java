package c.f.a.b.e3;

import android.os.Handler;
import c.f.a.b.p1;
import c.f.a.b.p2;

/* JADX INFO: loaded from: classes2.dex */
public interface i0 {

    public static final class a extends g0 {
        public a(g0 g0Var) {
            super(g0Var);
        }

        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, int i2, int i3, long j2) {
            super(obj, i2, i3, j2);
        }

        public a(Object obj, long j2) {
            super(obj, j2);
        }

        public a(Object obj, long j2, int i2) {
            super(obj, j2, i2);
        }

        public a c(Object obj) {
            return new a(super.a(obj));
        }
    }

    public interface b {
        void a(i0 i0Var, p2 p2Var);
    }

    f0 a(a aVar, c.f.a.b.i3.f fVar, long j2);

    void b(b bVar);

    void d(Handler handler, j0 j0Var);

    void e(j0 j0Var);

    void f(b bVar);

    p1 h();

    void i(Handler handler, c.f.a.b.x2.a0 a0Var);

    void j(c.f.a.b.x2.a0 a0Var);

    void l();

    boolean n();

    void o(f0 f0Var);

    p2 p();

    void q(b bVar, c.f.a.b.i3.n0 n0Var);

    void r(b bVar);
}
