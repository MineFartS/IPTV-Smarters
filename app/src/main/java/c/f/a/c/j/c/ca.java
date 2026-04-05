package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ca implements ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9 f12782a;

    public ca(z9 z9Var) {
        z9 z9Var2 = (z9) sa.d(z9Var, "output");
        this.f12782a = z9Var2;
        z9Var2.f13157c = this;
    }

    public static ca P(z9 z9Var) {
        ca caVar = z9Var.f13157c;
        return caVar != null ? caVar : new ca(z9Var);
    }

    @Override // c.f.a.c.j.c.ce
    public final void A(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.W(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iC0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iC0 += z9.C0(list.get(i4).longValue());
        }
        this.f12782a.q(iC0);
        while (i3 < list.size()) {
            this.f12782a.u0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void B(int i2) {
        this.f12782a.b(i2, 3);
    }

    @Override // c.f.a.c.j.c.ce
    public final void C(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.K(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iB0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB0 += z9.B0(list.get(i4).longValue());
        }
        this.f12782a.q(iB0);
        while (i3 < list.size()) {
            this.f12782a.s0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void D(int i2, m9 m9Var) {
        this.f12782a.k(i2, m9Var);
    }

    @Override // c.f.a.c.j.c.ce
    public final void E(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.j(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iA0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iA0 += z9.A0(list.get(i4).longValue());
        }
        this.f12782a.q(iA0);
        while (i3 < list.size()) {
            this.f12782a.q0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void F(int i2) {
        this.f12782a.b(i2, 4);
    }

    @Override // c.f.a.c.j.c.ce
    public final void G(int i2, int i3) {
        this.f12782a.g0(i2, i3);
    }

    @Override // c.f.a.c.j.c.ce
    public final void H(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.j0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iY = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iY += z9.y(list.get(i4).intValue());
        }
        this.f12782a.q(iY);
        while (i3 < list.size()) {
            this.f12782a.r(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void I(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.h(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iY = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iY += z9.Y(list.get(i4).doubleValue());
        }
        this.f12782a.q(iY);
        while (i3 < list.size()) {
            this.f12782a.V(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void J(int i2, List<m9> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f12782a.k(i2, list.get(i3));
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void K(int i2, List<?> list, pc pcVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            j(i2, list.get(i3), pcVar);
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final int L() {
        return oa.e.f13007l;
    }

    @Override // c.f.a.c.j.c.ce
    public final void M(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.i(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iC = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iC += z9.C(list.get(i4).floatValue());
        }
        this.f12782a.q(iC);
        while (i3 < list.size()) {
            this.f12782a.g(list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void N(int i2, List<?> list, pc pcVar) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            e(i2, list.get(i3), pcVar);
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void O(int i2, List<String> list) {
        int i3 = 0;
        if (!(list instanceof hb)) {
            while (i3 < list.size()) {
                this.f12782a.X(i2, list.get(i3));
                i3++;
            }
            return;
        }
        hb hbVar = (hb) list;
        while (i3 < list.size()) {
            Object objG = hbVar.G(i3);
            if (objG instanceof String) {
                this.f12782a.X(i2, (String) objG);
            } else {
                this.f12782a.k(i2, (m9) objG);
            }
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void a(int i2, long j2) {
        this.f12782a.W(i2, j2);
    }

    @Override // c.f.a.c.j.c.ce
    public final void b(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.M(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iY0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iY0 += z9.y0(list.get(i4).booleanValue());
        }
        this.f12782a.q(iY0);
        while (i3 < list.size()) {
            this.f12782a.v0(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void c(int i2, int i3) {
        this.f12782a.l0(i2, i3);
    }

    @Override // c.f.a.c.j.c.ce
    public final void d(int i2, long j2) {
        this.f12782a.K(i2, j2);
    }

    @Override // c.f.a.c.j.c.ce
    public final void e(int i2, Object obj, pc pcVar) {
        z9 z9Var = this.f12782a;
        z9Var.b(i2, 3);
        pcVar.c((bc) obj, z9Var.f13157c);
        z9Var.b(i2, 4);
    }

    @Override // c.f.a.c.j.c.ce
    public final void f(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.g0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iW = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iW += z9.w(list.get(i4).intValue());
        }
        this.f12782a.q(iW);
        while (i3 < list.size()) {
            this.f12782a.p(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void g(int i2, Object obj) {
        if (obj instanceof m9) {
            this.f12782a.L(i2, (m9) obj);
        } else {
            this.f12782a.l(i2, (bc) obj);
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void h(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.g0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += z9.B(list.get(i4).intValue());
        }
        this.f12782a.q(iB);
        while (i3 < list.size()) {
            this.f12782a.p(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void i(int i2, boolean z) {
        this.f12782a.M(i2, z);
    }

    @Override // c.f.a.c.j.c.ce
    public final void j(int i2, Object obj, pc pcVar) {
        this.f12782a.m(i2, (bc) obj, pcVar);
    }

    @Override // c.f.a.c.j.c.ce
    public final void k(int i2, long j2) {
        this.f12782a.W(i2, j2);
    }

    @Override // c.f.a.c.j.c.ce
    public final void l(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.j(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iX0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iX0 += z9.x0(list.get(i4).longValue());
        }
        this.f12782a.q(iX0);
        while (i3 < list.size()) {
            this.f12782a.q0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void m(int i2, int i3) {
        this.f12782a.i0(i2, i3);
    }

    @Override // c.f.a.c.j.c.ce
    public final <K, V> void n(int i2, sb<K, V> sbVar, Map<K, V> map) {
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            this.f12782a.b(i2, 2);
            next.getKey();
            next.getValue();
            throw null;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void o(int i2, String str) {
        this.f12782a.X(i2, str);
    }

    @Override // c.f.a.c.j.c.ce
    public final void p(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.W(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iD0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iD0 += z9.D0(list.get(i4).longValue());
        }
        this.f12782a.q(iD0);
        while (i3 < list.size()) {
            this.f12782a.u0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void q(int i2, int i3) {
        this.f12782a.l0(i2, i3);
    }

    @Override // c.f.a.c.j.c.ce
    public final void r(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.l0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iZ = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ += z9.z(list.get(i4).intValue());
        }
        this.f12782a.q(iZ);
        while (i3 < list.size()) {
            this.f12782a.s(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void s(int i2, int i3) {
        this.f12782a.j0(i2, i3);
    }

    @Override // c.f.a.c.j.c.ce
    public final void t(int i2, long j2) {
        this.f12782a.j(i2, j2);
    }

    @Override // c.f.a.c.j.c.ce
    public final void u(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.i0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iX = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iX += z9.x(list.get(i4).intValue());
        }
        this.f12782a.q(iX);
        while (i3 < list.size()) {
            this.f12782a.q(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void v(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f12782a.l0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f12782a.b(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iA += z9.A(list.get(i4).intValue());
        }
        this.f12782a.q(iA);
        while (i3 < list.size()) {
            this.f12782a.s(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // c.f.a.c.j.c.ce
    public final void w(int i2, long j2) {
        this.f12782a.j(i2, j2);
    }

    @Override // c.f.a.c.j.c.ce
    public final void x(int i2, double d2) {
        this.f12782a.h(i2, d2);
    }

    @Override // c.f.a.c.j.c.ce
    public final void y(int i2, int i3) {
        this.f12782a.g0(i2, i3);
    }

    @Override // c.f.a.c.j.c.ce
    public final void z(int i2, float f2) {
        this.f12782a.i(i2, f2);
    }
}
