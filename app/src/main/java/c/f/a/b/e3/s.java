package c.f.a.b.e3;

import android.os.Handler;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.j0;
import c.f.a.b.p2;
import c.f.a.b.x2.a0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s<T> extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<T, b<T>> f7975h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f7976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.b.i3.n0 f7977j;

    public final class a implements j0, c.f.a.b.x2.a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f7978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j0.a f7979c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a0.a f7980d;

        public a(T t) {
            this.f7979c = s.this.w(null);
            this.f7980d = s.this.t(null);
            this.f7978b = t;
        }

        @Override // c.f.a.b.x2.a0
        public void K(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f7980d.c();
            }
        }

        @Override // c.f.a.b.x2.a0
        public /* synthetic */ void P(int i2, i0.a aVar) {
            c.f.a.b.x2.z.a(this, i2, aVar);
        }

        @Override // c.f.a.b.x2.a0
        public void V(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f7980d.b();
            }
        }

        public final boolean a(int i2, i0.a aVar) {
            i0.a aVarE;
            if (aVar != null) {
                aVarE = s.this.E(this.f7978b, aVar);
                if (aVarE == null) {
                    return false;
                }
            } else {
                aVarE = null;
            }
            int iG = s.this.G(this.f7978b, i2);
            j0.a aVar2 = this.f7979c;
            if (aVar2.f7831a != iG || !c.f.a.b.j3.x0.b(aVar2.f7832b, aVarE)) {
                this.f7979c = s.this.v(iG, aVarE, 0L);
            }
            a0.a aVar3 = this.f7980d;
            if (aVar3.f10322a == iG && c.f.a.b.j3.x0.b(aVar3.f10323b, aVarE)) {
                return true;
            }
            this.f7980d = s.this.s(iG, aVarE);
            return true;
        }

        @Override // c.f.a.b.e3.j0
        public void a0(int i2, i0.a aVar, a0 a0Var, d0 d0Var) {
            if (a(i2, aVar)) {
                this.f7979c.v(a0Var, b(d0Var));
            }
        }

        public final d0 b(d0 d0Var) {
            long jF = s.this.F(this.f7978b, d0Var.f6992f);
            long jF2 = s.this.F(this.f7978b, d0Var.f6993g);
            return (jF == d0Var.f6992f && jF2 == d0Var.f6993g) ? d0Var : new d0(d0Var.f6987a, d0Var.f6988b, d0Var.f6989c, d0Var.f6990d, d0Var.f6991e, jF, jF2);
        }

        @Override // c.f.a.b.x2.a0
        public void e0(int i2, i0.a aVar, int i3) {
            if (a(i2, aVar)) {
                this.f7980d.e(i3);
            }
        }

        @Override // c.f.a.b.x2.a0
        public void f0(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f7980d.g();
            }
        }

        @Override // c.f.a.b.e3.j0
        public void i0(int i2, i0.a aVar, a0 a0Var, d0 d0Var, IOException iOException, boolean z) {
            if (a(i2, aVar)) {
                this.f7979c.y(a0Var, b(d0Var), iOException, z);
            }
        }

        @Override // c.f.a.b.x2.a0
        public void l0(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f7980d.d();
            }
        }

        @Override // c.f.a.b.e3.j0
        public void n(int i2, i0.a aVar, d0 d0Var) {
            if (a(i2, aVar)) {
                this.f7979c.d(b(d0Var));
            }
        }

        @Override // c.f.a.b.e3.j0
        public void o(int i2, i0.a aVar, a0 a0Var, d0 d0Var) {
            if (a(i2, aVar)) {
                this.f7979c.s(a0Var, b(d0Var));
            }
        }

        @Override // c.f.a.b.e3.j0
        public void q(int i2, i0.a aVar, d0 d0Var) {
            if (a(i2, aVar)) {
                this.f7979c.E(b(d0Var));
            }
        }

        @Override // c.f.a.b.x2.a0
        public void u(int i2, i0.a aVar, Exception exc) {
            if (a(i2, aVar)) {
                this.f7980d.f(exc);
            }
        }

        @Override // c.f.a.b.e3.j0
        public void w(int i2, i0.a aVar, a0 a0Var, d0 d0Var) {
            if (a(i2, aVar)) {
                this.f7979c.B(a0Var, b(d0Var));
            }
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f7982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0.b f7983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s<T>.a f7984c;

        public b(i0 i0Var, i0.b bVar, s<T>.a aVar) {
            this.f7982a = i0Var;
            this.f7983b = bVar;
            this.f7984c = aVar;
        }
    }

    @Override // c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        this.f7977j = n0Var;
        this.f7976i = c.f.a.b.j3.x0.x();
    }

    @Override // c.f.a.b.e3.n
    public void D() {
        for (b<T> bVar : this.f7975h.values()) {
            bVar.f7982a.b(bVar.f7983b);
            bVar.f7982a.e(bVar.f7984c);
            bVar.f7982a.j(bVar.f7984c);
        }
        this.f7975h.clear();
    }

    public i0.a E(T t, i0.a aVar) {
        return aVar;
    }

    public long F(T t, long j2) {
        return j2;
    }

    public int G(T t, int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract void I(T t, i0 i0Var, p2 p2Var);

    public final void K(final T t, i0 i0Var) {
        c.f.a.b.j3.g.a(!this.f7975h.containsKey(t));
        i0.b bVar = new i0.b() { // from class: c.f.a.b.e3.a
            @Override // c.f.a.b.e3.i0.b
            public final void a(i0 i0Var2, p2 p2Var) {
                this.f6892b.I(t, i0Var2, p2Var);
            }
        };
        a aVar = new a(t);
        this.f7975h.put(t, new b<>(i0Var, bVar, aVar));
        i0Var.d((Handler) c.f.a.b.j3.g.e(this.f7976i), aVar);
        i0Var.i((Handler) c.f.a.b.j3.g.e(this.f7976i), aVar);
        i0Var.q(bVar, this.f7977j);
        if (A()) {
            return;
        }
        i0Var.f(bVar);
    }

    public final void L(T t) {
        b bVar = (b) c.f.a.b.j3.g.e(this.f7975h.remove(t));
        bVar.f7982a.b(bVar.f7983b);
        bVar.f7982a.e(bVar.f7984c);
        bVar.f7982a.j(bVar.f7984c);
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
        Iterator<b<T>> it = this.f7975h.values().iterator();
        while (it.hasNext()) {
            it.next().f7982a.l();
        }
    }

    @Override // c.f.a.b.e3.n
    public void y() {
        for (b<T> bVar : this.f7975h.values()) {
            bVar.f7982a.f(bVar.f7983b);
        }
    }

    @Override // c.f.a.b.e3.n
    public void z() {
        for (b<T> bVar : this.f7975h.values()) {
            bVar.f7982a.r(bVar.f7983b);
        }
    }
}
