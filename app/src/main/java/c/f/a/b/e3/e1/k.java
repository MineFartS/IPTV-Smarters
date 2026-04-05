package c.f.a.b.e3.e1;

import c.f.a.b.i3.p;
import c.f.a.b.i3.s;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    public static s a(String str, c.f.a.b.e3.e1.p.i iVar, String str2, int i2) {
        return new s.b().i(iVar.b(str)).h(iVar.f7199a).g(iVar.f7200b).f(str2).b(i2).a();
    }

    public static c.f.a.b.z2.e b(p pVar, int i2, c.f.a.b.e3.e1.p.j jVar) {
        return c(pVar, i2, jVar, 0);
    }

    public static c.f.a.b.z2.e c(p pVar, int i2, c.f.a.b.e3.e1.p.j jVar, int i3) {
        if (jVar.n() == null) {
            return null;
        }
        c.f.a.b.e3.d1.g gVarF = f(i2, jVar.f7204b);
        try {
            d(gVarF, pVar, jVar, i3, true);
            gVarF.release();
            return gVarF.d();
        } catch (Throwable th) {
            gVarF.release();
            throw th;
        }
    }

    public static void d(c.f.a.b.e3.d1.g gVar, p pVar, c.f.a.b.e3.e1.p.j jVar, int i2, boolean z) {
        c.f.a.b.e3.e1.p.i iVar = (c.f.a.b.e3.e1.p.i) c.f.a.b.j3.g.e(jVar.n());
        if (z) {
            c.f.a.b.e3.e1.p.i iVarM = jVar.m();
            if (iVarM == null) {
                return;
            }
            c.f.a.b.e3.e1.p.i iVarA = iVar.a(iVarM, jVar.f7205c.get(i2).f7152a);
            if (iVarA == null) {
                e(pVar, jVar, i2, gVar, iVar);
                iVar = iVarM;
            } else {
                iVar = iVarA;
            }
        }
        e(pVar, jVar, i2, gVar, iVar);
    }

    public static void e(p pVar, c.f.a.b.e3.e1.p.j jVar, int i2, c.f.a.b.e3.d1.g gVar, c.f.a.b.e3.e1.p.i iVar) {
        new c.f.a.b.e3.d1.m(pVar, a(jVar.f7205c.get(i2).f7152a, iVar, jVar.k(), 0), jVar.f7204b, 0, null, gVar).a();
    }

    public static c.f.a.b.e3.d1.g f(int i2, k1 k1Var) {
        String str = k1Var.f9337l;
        return new c.f.a.b.e3.d1.e(str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm")) ? new c.f.a.b.z2.h0.e() : new c.f.a.b.z2.j0.i(), i2, k1Var);
    }
}
