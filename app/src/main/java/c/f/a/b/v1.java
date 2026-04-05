package c.f.a.b;

import android.os.Handler;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.u0;
import c.f.a.b.x2.a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f10232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0.a f10233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0.a f10234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap<c, b> f10235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<c> f10236h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.b.i3.n0 f10239k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.b.e3.u0 f10237i = new u0.a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityHashMap<c.f.a.b.e3.f0, c> f10230b = new IdentityHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Object, c> f10231c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f10229a = new ArrayList();

    public final class a implements c.f.a.b.e3.j0, c.f.a.b.x2.a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f10240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j0.a f10241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a0.a f10242d;

        public a(c cVar) {
            this.f10241c = v1.this.f10233e;
            this.f10242d = v1.this.f10234f;
            this.f10240b = cVar;
        }

        @Override // c.f.a.b.x2.a0
        public void K(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f10242d.c();
            }
        }

        @Override // c.f.a.b.x2.a0
        public /* synthetic */ void P(int i2, i0.a aVar) {
            c.f.a.b.x2.z.a(this, i2, aVar);
        }

        @Override // c.f.a.b.x2.a0
        public void V(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f10242d.b();
            }
        }

        public final boolean a(int i2, i0.a aVar) {
            i0.a aVarM;
            if (aVar != null) {
                aVarM = v1.m(this.f10240b, aVar);
                if (aVarM == null) {
                    return false;
                }
            } else {
                aVarM = null;
            }
            int iQ = v1.q(this.f10240b, i2);
            j0.a aVar2 = this.f10241c;
            if (aVar2.f7831a != iQ || !c.f.a.b.j3.x0.b(aVar2.f7832b, aVarM)) {
                this.f10241c = v1.this.f10233e.F(iQ, aVarM, 0L);
            }
            a0.a aVar3 = this.f10242d;
            if (aVar3.f10322a == iQ && c.f.a.b.j3.x0.b(aVar3.f10323b, aVarM)) {
                return true;
            }
            this.f10242d = v1.this.f10234f.u(iQ, aVarM);
            return true;
        }

        @Override // c.f.a.b.e3.j0
        public void a0(int i2, i0.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var) {
            if (a(i2, aVar)) {
                this.f10241c.v(a0Var, d0Var);
            }
        }

        @Override // c.f.a.b.x2.a0
        public void e0(int i2, i0.a aVar, int i3) {
            if (a(i2, aVar)) {
                this.f10242d.e(i3);
            }
        }

        @Override // c.f.a.b.x2.a0
        public void f0(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f10242d.g();
            }
        }

        @Override // c.f.a.b.e3.j0
        public void i0(int i2, i0.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var, IOException iOException, boolean z) {
            if (a(i2, aVar)) {
                this.f10241c.y(a0Var, d0Var, iOException, z);
            }
        }

        @Override // c.f.a.b.x2.a0
        public void l0(int i2, i0.a aVar) {
            if (a(i2, aVar)) {
                this.f10242d.d();
            }
        }

        @Override // c.f.a.b.e3.j0
        public void n(int i2, i0.a aVar, c.f.a.b.e3.d0 d0Var) {
            if (a(i2, aVar)) {
                this.f10241c.d(d0Var);
            }
        }

        @Override // c.f.a.b.e3.j0
        public void o(int i2, i0.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var) {
            if (a(i2, aVar)) {
                this.f10241c.s(a0Var, d0Var);
            }
        }

        @Override // c.f.a.b.e3.j0
        public void q(int i2, i0.a aVar, c.f.a.b.e3.d0 d0Var) {
            if (a(i2, aVar)) {
                this.f10241c.E(d0Var);
            }
        }

        @Override // c.f.a.b.x2.a0
        public void u(int i2, i0.a aVar, Exception exc) {
            if (a(i2, aVar)) {
                this.f10242d.f(exc);
            }
        }

        @Override // c.f.a.b.e3.j0
        public void w(int i2, i0.a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var) {
            if (a(i2, aVar)) {
                this.f10241c.B(a0Var, d0Var);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.e3.i0 f10244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0.b f10245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f10246c;

        public b(c.f.a.b.e3.i0 i0Var, i0.b bVar, a aVar) {
            this.f10244a = i0Var;
            this.f10245b = bVar;
            this.f10246c = aVar;
        }
    }

    public static final class c implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.e3.c0 f10247a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10251e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<i0.a> f10249c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f10248b = new Object();

        public c(c.f.a.b.e3.i0 i0Var, boolean z) {
            this.f10247a = new c.f.a.b.e3.c0(i0Var, z);
        }

        @Override // c.f.a.b.u1
        public Object a() {
            return this.f10248b;
        }

        @Override // c.f.a.b.u1
        public p2 b() {
            return this.f10247a.Q();
        }

        public void c(int i2) {
            this.f10250d = i2;
            this.f10251e = false;
            this.f10249c.clear();
        }
    }

    public interface d {
        void c();
    }

    public v1(d dVar, c.f.a.b.s2.h1 h1Var, Handler handler) {
        this.f10232d = dVar;
        j0.a aVar = new j0.a();
        this.f10233e = aVar;
        a0.a aVar2 = new a0.a();
        this.f10234f = aVar2;
        this.f10235g = new HashMap<>();
        this.f10236h = new HashSet();
        if (h1Var != null) {
            aVar.a(handler, h1Var);
            aVar2.a(handler, h1Var);
        }
    }

    public static Object l(Object obj) {
        return q0.v(obj);
    }

    public static i0.a m(c cVar, i0.a aVar) {
        for (int i2 = 0; i2 < cVar.f10249c.size(); i2++) {
            if (cVar.f10249c.get(i2).f7479d == aVar.f7479d) {
                return aVar.c(o(cVar, aVar.f7476a));
            }
        }
        return null;
    }

    public static Object n(Object obj) {
        return q0.w(obj);
    }

    public static Object o(c cVar, Object obj) {
        return q0.y(cVar.f10248b, obj);
    }

    public static int q(c cVar, int i2) {
        return i2 + cVar.f10250d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void t(c.f.a.b.e3.i0 i0Var, p2 p2Var) {
        this.f10232d.c();
    }

    public p2 A(int i2, int i3, c.f.a.b.e3.u0 u0Var) {
        c.f.a.b.j3.g.a(i2 >= 0 && i2 <= i3 && i3 <= p());
        this.f10237i = u0Var;
        B(i2, i3);
        return h();
    }

    public final void B(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            c cVarRemove = this.f10229a.remove(i4);
            this.f10231c.remove(cVarRemove.f10248b);
            f(i4, -cVarRemove.f10247a.Q().p());
            cVarRemove.f10251e = true;
            if (this.f10238j) {
                u(cVarRemove);
            }
        }
    }

    public p2 C(List<c> list, c.f.a.b.e3.u0 u0Var) {
        B(0, this.f10229a.size());
        return e(this.f10229a.size(), list, u0Var);
    }

    public p2 D(c.f.a.b.e3.u0 u0Var) {
        int iP = p();
        if (u0Var.getLength() != iP) {
            u0Var = u0Var.g().e(0, iP);
        }
        this.f10237i = u0Var;
        return h();
    }

    public p2 e(int i2, List<c> list, c.f.a.b.e3.u0 u0Var) {
        int iP;
        if (!list.isEmpty()) {
            this.f10237i = u0Var;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                c cVar = list.get(i3 - i2);
                if (i3 > 0) {
                    c cVar2 = this.f10229a.get(i3 - 1);
                    iP = cVar2.f10250d + cVar2.f10247a.Q().p();
                } else {
                    iP = 0;
                }
                cVar.c(iP);
                f(i3, cVar.f10247a.Q().p());
                this.f10229a.add(i3, cVar);
                this.f10231c.put(cVar.f10248b, cVar);
                if (this.f10238j) {
                    x(cVar);
                    if (this.f10230b.isEmpty()) {
                        this.f10236h.add(cVar);
                    } else {
                        i(cVar);
                    }
                }
            }
        }
        return h();
    }

    public final void f(int i2, int i3) {
        while (i2 < this.f10229a.size()) {
            this.f10229a.get(i2).f10250d += i3;
            i2++;
        }
    }

    public c.f.a.b.e3.f0 g(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        Object objN = n(aVar.f7476a);
        i0.a aVarC = aVar.c(l(aVar.f7476a));
        c cVar = (c) c.f.a.b.j3.g.e(this.f10231c.get(objN));
        k(cVar);
        cVar.f10249c.add(aVarC);
        c.f.a.b.e3.b0 b0VarA = cVar.f10247a.a(aVarC, fVar, j2);
        this.f10230b.put(b0VarA, cVar);
        j();
        return b0VarA;
    }

    public p2 h() {
        if (this.f10229a.isEmpty()) {
            return p2.f9699a;
        }
        int iP = 0;
        for (int i2 = 0; i2 < this.f10229a.size(); i2++) {
            c cVar = this.f10229a.get(i2);
            cVar.f10250d = iP;
            iP += cVar.f10247a.Q().p();
        }
        return new e2(this.f10229a, this.f10237i);
    }

    public final void i(c cVar) {
        b bVar = this.f10235g.get(cVar);
        if (bVar != null) {
            bVar.f10244a.f(bVar.f10245b);
        }
    }

    public final void j() {
        Iterator<c> it = this.f10236h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f10249c.isEmpty()) {
                i(next);
                it.remove();
            }
        }
    }

    public final void k(c cVar) {
        this.f10236h.add(cVar);
        b bVar = this.f10235g.get(cVar);
        if (bVar != null) {
            bVar.f10244a.r(bVar.f10245b);
        }
    }

    public int p() {
        return this.f10229a.size();
    }

    public boolean r() {
        return this.f10238j;
    }

    public final void u(c cVar) {
        if (cVar.f10251e && cVar.f10249c.isEmpty()) {
            b bVar = (b) c.f.a.b.j3.g.e(this.f10235g.remove(cVar));
            bVar.f10244a.b(bVar.f10245b);
            bVar.f10244a.e(bVar.f10246c);
            bVar.f10244a.j(bVar.f10246c);
            this.f10236h.remove(cVar);
        }
    }

    public p2 v(int i2, int i3, int i4, c.f.a.b.e3.u0 u0Var) {
        c.f.a.b.j3.g.a(i2 >= 0 && i2 <= i3 && i3 <= p() && i4 >= 0);
        this.f10237i = u0Var;
        if (i2 == i3 || i2 == i4) {
            return h();
        }
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(((i3 - i2) + i4) - 1, i3 - 1);
        int iP = this.f10229a.get(iMin).f10250d;
        c.f.a.b.j3.x0.B0(this.f10229a, i2, i3, i4);
        while (iMin <= iMax) {
            c cVar = this.f10229a.get(iMin);
            cVar.f10250d = iP;
            iP += cVar.f10247a.Q().p();
            iMin++;
        }
        return h();
    }

    public void w(c.f.a.b.i3.n0 n0Var) {
        c.f.a.b.j3.g.g(!this.f10238j);
        this.f10239k = n0Var;
        for (int i2 = 0; i2 < this.f10229a.size(); i2++) {
            c cVar = this.f10229a.get(i2);
            x(cVar);
            this.f10236h.add(cVar);
        }
        this.f10238j = true;
    }

    public final void x(c cVar) {
        c.f.a.b.e3.c0 c0Var = cVar.f10247a;
        i0.b bVar = new i0.b() { // from class: c.f.a.b.h0
            @Override // c.f.a.b.e3.i0.b
            public final void a(c.f.a.b.e3.i0 i0Var, p2 p2Var) {
                this.f8527b.t(i0Var, p2Var);
            }
        };
        a aVar = new a(cVar);
        this.f10235g.put(cVar, new b(c0Var, bVar, aVar));
        c0Var.d(c.f.a.b.j3.x0.z(), aVar);
        c0Var.i(c.f.a.b.j3.x0.z(), aVar);
        c0Var.q(bVar, this.f10239k);
    }

    public void y() {
        for (b bVar : this.f10235g.values()) {
            try {
                bVar.f10244a.b(bVar.f10245b);
            } catch (RuntimeException e2) {
                c.f.a.b.j3.z.e("MediaSourceList", "Failed to release child source.", e2);
            }
            bVar.f10244a.e(bVar.f10246c);
            bVar.f10244a.j(bVar.f10246c);
        }
        this.f10235g.clear();
        this.f10236h.clear();
        this.f10238j = false;
    }

    public void z(c.f.a.b.e3.f0 f0Var) {
        c cVar = (c) c.f.a.b.j3.g.e(this.f10230b.remove(f0Var));
        cVar.f10247a.o(f0Var);
        cVar.f10249c.remove(((c.f.a.b.e3.b0) f0Var).f6910b);
        if (!this.f10230b.isEmpty()) {
            j();
        }
        u(cVar);
    }
}
