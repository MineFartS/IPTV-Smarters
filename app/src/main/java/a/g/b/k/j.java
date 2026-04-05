package a.g.b.k;

import a.g.b.k.e;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean[] f1432a = new boolean[3];

    public static void a(f fVar, a.g.b.d dVar, e eVar) {
        eVar.f1424k = -1;
        eVar.f1425l = -1;
        e.b bVar = fVar.N[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.N[0] == e.b.MATCH_PARENT) {
            int i2 = eVar.C.f1410e;
            int iN = fVar.N() - eVar.E.f1410e;
            d dVar2 = eVar.C;
            dVar2.f1412g = dVar.q(dVar2);
            d dVar3 = eVar.E;
            dVar3.f1412g = dVar.q(dVar3);
            dVar.f(eVar.C.f1412g, i2);
            dVar.f(eVar.E.f1412g, iN);
            eVar.f1424k = 2;
            eVar.h0(i2, iN);
        }
        if (fVar.N[1] == bVar2 || eVar.N[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i3 = eVar.D.f1410e;
        int iT = fVar.t() - eVar.F.f1410e;
        d dVar4 = eVar.D;
        dVar4.f1412g = dVar.q(dVar4);
        d dVar5 = eVar.F;
        dVar5.f1412g = dVar.q(dVar5);
        dVar.f(eVar.D.f1412g, i3);
        dVar.f(eVar.F.f1412g, iT);
        if (eVar.Z > 0 || eVar.M() == 8) {
            d dVar6 = eVar.G;
            dVar6.f1412g = dVar.q(dVar6);
            dVar.f(eVar.G.f1412g, eVar.Z + i3);
        }
        eVar.f1425l = 2;
        eVar.w0(i3, iT);
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
