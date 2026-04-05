package c.f.a.c.j.h;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f13545a;

    public u5(t5 t5Var) {
        u6.b(t5Var, "output");
        this.f13545a = t5Var;
        t5Var.f13530c = this;
    }

    public static u5 l(t5 t5Var) {
        u5 u5Var = t5Var.f13530c;
        return u5Var != null ? u5Var : new u5(t5Var);
    }

    public final void A(int i2, int i3) {
        this.f13545a.k(i2, t5.c(i3));
    }

    public final void B(int i2, long j2) {
        this.f13545a.m(i2, t5.d(j2));
    }

    public final void C(int i2, Object obj, c8 c8Var) {
        q7 q7Var = (q7) obj;
        q5 q5Var = (q5) this.f13545a;
        q5Var.t((i2 << 3) | 2);
        t4 t4Var = (t4) q7Var;
        int iH = t4Var.h();
        if (iH == -1) {
            iH = c8Var.c(t4Var);
            t4Var.i(iH);
        }
        q5Var.t(iH);
        c8Var.g(q7Var, q5Var.f13530c);
    }

    public final void D(int i2, Object obj, c8 c8Var) {
        t5 t5Var = this.f13545a;
        t5Var.i(i2, 3);
        c8Var.g((q7) obj, t5Var.f13530c);
        t5Var.i(i2, 4);
    }

    public final void E(int i2) {
        this.f13545a.i(i2, 3);
    }

    public final void F(int i2) {
        this.f13545a.i(i2, 4);
    }

    public final void G(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.j(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += t5.B(list.get(i4).intValue());
        }
        this.f13545a.t(iB);
        while (i3 < list.size()) {
            this.f13545a.s(list.get(i3).intValue());
            i3++;
        }
    }

    public final void H(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.l(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.u(list.get(i3).intValue());
            i3++;
        }
    }

    public final void I(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.m(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iD = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iD += t5.D(list.get(i4).longValue());
        }
        this.f13545a.t(iD);
        while (i3 < list.size()) {
            this.f13545a.v(list.get(i3).longValue());
            i3++;
        }
    }

    public final void J(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.m(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iD = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iD += t5.D(list.get(i4).longValue());
        }
        this.f13545a.t(iD);
        while (i3 < list.size()) {
            this.f13545a.v(list.get(i3).longValue());
            i3++;
        }
    }

    public final void K(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.n(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.w(list.get(i3).longValue());
            i3++;
        }
    }

    public final void a(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.l(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.u(Float.floatToRawIntBits(list.get(i3).floatValue()));
            i3++;
        }
    }

    public final void b(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.n(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.w(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
            i3++;
        }
    }

    public final void c(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.j(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += t5.B(list.get(i4).intValue());
        }
        this.f13545a.t(iB);
        while (i3 < list.size()) {
            this.f13545a.s(list.get(i3).intValue());
            i3++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.o(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.r(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void e(int i2, List<String> list) {
        int i3 = 0;
        if (!(list instanceof a7)) {
            while (i3 < list.size()) {
                this.f13545a.p(i2, list.get(i3));
                i3++;
            }
            return;
        }
        a7 a7Var = (a7) list;
        while (i3 < list.size()) {
            Object objP = a7Var.p(i3);
            if (objP instanceof String) {
                this.f13545a.p(i2, (String) objP);
            } else {
                this.f13545a.q(i2, (l5) objP);
            }
            i3++;
        }
    }

    public final void f(int i2, List<l5> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f13545a.q(i2, list.get(i3));
        }
    }

    public final void g(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.k(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iC = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iC += t5.C(list.get(i4).intValue());
        }
        this.f13545a.t(iC);
        while (i3 < list.size()) {
            this.f13545a.t(list.get(i3).intValue());
            i3++;
        }
    }

    public final void h(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.l(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.u(list.get(i3).intValue());
            i3++;
        }
    }

    public final void i(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.n(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.f13545a.t(i4);
        while (i3 < list.size()) {
            this.f13545a.w(list.get(i3).longValue());
            i3++;
        }
    }

    public final void j(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.k(i2, t5.c(list.get(i3).intValue()));
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iC = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iC += t5.C(t5.c(list.get(i4).intValue()));
        }
        this.f13545a.t(iC);
        while (i3 < list.size()) {
            this.f13545a.t(t5.c(list.get(i3).intValue()));
            i3++;
        }
    }

    public final void k(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f13545a.m(i2, t5.d(list.get(i3).longValue()));
                i3++;
            }
            return;
        }
        this.f13545a.i(i2, 2);
        int iD = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iD += t5.D(t5.d(list.get(i4).longValue()));
        }
        this.f13545a.t(iD);
        while (i3 < list.size()) {
            this.f13545a.v(t5.d(list.get(i3).longValue()));
            i3++;
        }
    }

    public final void m(int i2, int i3) {
        this.f13545a.l(i2, i3);
    }

    public final void n(int i2, long j2) {
        this.f13545a.m(i2, j2);
    }

    public final void o(int i2, long j2) {
        this.f13545a.n(i2, j2);
    }

    public final void p(int i2, float f2) {
        this.f13545a.l(i2, Float.floatToRawIntBits(f2));
    }

    public final void q(int i2, double d2) {
        this.f13545a.n(i2, Double.doubleToRawLongBits(d2));
    }

    public final void r(int i2, int i3) {
        this.f13545a.j(i2, i3);
    }

    public final void s(int i2, long j2) {
        this.f13545a.m(i2, j2);
    }

    public final void t(int i2, int i3) {
        this.f13545a.j(i2, i3);
    }

    public final void u(int i2, long j2) {
        this.f13545a.n(i2, j2);
    }

    public final void v(int i2, int i3) {
        this.f13545a.l(i2, i3);
    }

    public final void w(int i2, boolean z) {
        this.f13545a.o(i2, z);
    }

    public final void x(int i2, String str) {
        this.f13545a.p(i2, str);
    }

    public final void y(int i2, l5 l5Var) {
        this.f13545a.q(i2, l5Var);
    }

    public final void z(int i2, int i3) {
        this.f13545a.k(i2, i3);
    }
}
