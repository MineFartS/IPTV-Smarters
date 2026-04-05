package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bkj implements bnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bki f21286a;

    private bkj(bki bkiVar) {
        bld.j(bkiVar, "output");
        this.f21286a = bkiVar;
        bkiVar.f21282a = this;
    }

    public static bkj a(bki bkiVar) {
        bkj bkjVar = bkiVar.f21282a;
        return bkjVar != null ? bkjVar : new bkj(bkiVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void A(int i2, List<Long> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.aa(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.ab(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void B(int i2, int i3) throws bkh {
        this.f21286a.Q(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void C(int i2, List<Integer> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.Q(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iY = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iY += bki.y(list.get(i4).intValue());
        }
        this.f21286a.ak(iY);
        while (i3 < list.size()) {
            this.f21286a.ak(bki.I(list.get(i3).intValue()));
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void D(int i2, long j2) throws bkh {
        this.f21286a.R(i2, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void E(int i2, List<Long> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.R(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iA += bki.A(list.get(i4).longValue());
        }
        this.f21286a.ak(iA);
        while (i3 < list.size()) {
            this.f21286a.am(bki.J(list.get(i3).longValue()));
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void F(int i2) throws bkh {
        this.f21286a.ai(i2, 3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void G(int i2, String str) throws bkh {
        this.f21286a.ag(i2, str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void H(int i2, List<String> list) throws bkh {
        int i3 = 0;
        if (!(list instanceof blk)) {
            while (i3 < list.size()) {
                this.f21286a.ag(i2, list.get(i3));
                i3++;
            }
            return;
        }
        blk blkVar = (blk) list;
        while (i3 < list.size()) {
            Object objF = blkVar.f(i3);
            if (objF instanceof String) {
                this.f21286a.ag(i2, (String) objF);
            } else {
                this.f21286a.X(i2, (bkd) objF);
            }
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void I(int i2, int i3) throws bkh {
        this.f21286a.aj(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void J(int i2, List<Integer> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.aj(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iF = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iF += bki.F(list.get(i4).intValue());
        }
        this.f21286a.ak(iF);
        while (i3 < list.size()) {
            this.f21286a.ak(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void K(int i2, long j2) throws bkh {
        this.f21286a.al(i2, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void L(int i2, List<Long> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.al(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iH = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iH += bki.H(list.get(i4).longValue());
        }
        this.f21286a.ak(iH);
        while (i3 < list.size()) {
            this.f21286a.am(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void b(int i2, boolean z) throws bkh {
        this.f21286a.W(i2, z);
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
    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void c(int i2, List<Boolean> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.W(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.U(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void d(int i2, bkd bkdVar) throws bkh {
        this.f21286a.X(i2, bkdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void e(int i2, List<bkd> list) throws bkh {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f21286a.X(i2, list.get(i3));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void f(int i2, double d2) throws bkh {
        this.f21286a.N(i2, d2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void g(int i2, List<Double> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.N(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.ab(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void h(int i2) throws bkh {
        this.f21286a.ai(i2, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void i(int i2, int i3) throws bkh {
        this.f21286a.ac(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void j(int i2, List<Integer> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.ac(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iR = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iR += bki.r(list.get(i4).intValue());
        }
        this.f21286a.ak(iR);
        while (i3 < list.size()) {
            this.f21286a.ad(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void k(int i2, int i3) throws bkh {
        this.f21286a.Y(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void l(int i2, List<Integer> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.Y(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.Z(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void m(int i2, long j2) throws bkh {
        this.f21286a.aa(i2, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void n(int i2, List<Long> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.aa(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.ab(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void o(int i2, float f2) throws bkh {
        this.f21286a.O(i2, f2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void p(int i2, List<Float> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.O(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.Z(Float.floatToRawIntBits(list.get(i3).floatValue()));
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void q(int i2, Object obj, bmk bmkVar) throws bkh {
        bki bkiVar = this.f21286a;
        bkiVar.ai(i2, 3);
        bmkVar.j((blz) obj, bkiVar.f21282a);
        bkiVar.ai(i2, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void r(int i2, int i3) throws bkh {
        this.f21286a.ac(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void s(int i2, List<Integer> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.ac(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iR = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iR += bki.r(list.get(i4).intValue());
        }
        this.f21286a.ak(iR);
        while (i3 < list.size()) {
            this.f21286a.ad(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void t(int i2, long j2) throws bkh {
        this.f21286a.al(i2, j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void u(int i2, List<Long> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.al(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int iH = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iH += bki.H(list.get(i4).longValue());
        }
        this.f21286a.ak(iH);
        while (i3 < list.size()) {
            this.f21286a.am(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final <K, V> void v(int i2, bls<K, V> blsVar, Map<K, V> map) throws bkh {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f21286a.ai(i2, 2);
            this.f21286a.ak(blt.a(blsVar, entry.getKey(), entry.getValue()));
            blt.b(this.f21286a, blsVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void w(int i2, Object obj, bmk bmkVar) throws bkh {
        this.f21286a.af(i2, (blz) obj, bmkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void x(int i2, int i3) throws bkh {
        this.f21286a.Y(i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void y(int i2, List<Integer> list, boolean z) throws bkh {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f21286a.Y(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f21286a.ai(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.f21286a.ak(i4);
        while (i3 < list.size()) {
            this.f21286a.Z(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnq
    public final void z(int i2, long j2) throws bkh {
        this.f21286a.aa(i2, j2);
    }
}
