package a.g.b.k.m;

import a.g.b.k.e;
import a.g.b.k.m.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.g.b.k.f f1448a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.g.b.k.f f1451d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1449b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1450c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<m> f1452e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<k> f1453f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b.InterfaceC0023b f1454g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.a f1455h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<k> f1456i = new ArrayList<>();

    public e(a.g.b.k.f fVar) {
        this.f1448a = fVar;
        this.f1451d = fVar;
    }

    public final void a(f fVar, int i2, int i3, f fVar2, ArrayList<k> arrayList, k kVar) {
        m mVar = fVar.f1460d;
        if (mVar.f1485c == null) {
            a.g.b.k.f fVar3 = this.f1448a;
            if (mVar == fVar3.f1419f || mVar == fVar3.f1420g) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i3);
                arrayList.add(kVar);
            }
            mVar.f1485c = kVar;
            kVar.a(mVar);
            for (d dVar : mVar.f1490h.f1467k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, kVar);
                }
            }
            for (d dVar2 : mVar.f1491i.f1467k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, kVar);
                }
            }
            if (i2 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f1480k.f1467k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            for (f fVar4 : mVar.f1490h.f1468l) {
                if (fVar4 == fVar2) {
                    kVar.f1474c = true;
                }
                a(fVar4, i2, 0, fVar2, arrayList, kVar);
            }
            for (f fVar5 : mVar.f1491i.f1468l) {
                if (fVar5 == fVar2) {
                    kVar.f1474c = true;
                }
                a(fVar5, i2, 1, fVar2, arrayList, kVar);
            }
            if (i2 == 1 && (mVar instanceof l)) {
                Iterator<f> it = ((l) mVar).f1480k.f1468l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i2, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(a.g.b.k.f r17) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.e.b(a.g.b.k.f):boolean");
    }

    public void c() {
        d(this.f1452e);
        this.f1456i.clear();
        k.f1472a = 0;
        i(this.f1448a.f1419f, 0, this.f1456i);
        i(this.f1448a.f1420g, 1, this.f1456i);
        this.f1449b = false;
    }

    public void d(ArrayList<m> arrayList) {
        m hVar;
        arrayList.clear();
        this.f1451d.f1419f.f();
        this.f1451d.f1420g.f();
        arrayList.add(this.f1451d.f1419f);
        arrayList.add(this.f1451d.f1420g);
        HashSet hashSet = null;
        for (a.g.b.k.e eVar : this.f1451d.w0) {
            if (eVar instanceof a.g.b.k.g) {
                hVar = new h(eVar);
            } else {
                if (eVar.T()) {
                    if (eVar.f1417d == null) {
                        eVar.f1417d = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f1417d);
                } else {
                    arrayList.add(eVar.f1419f);
                }
                if (eVar.V()) {
                    if (eVar.f1418e == null) {
                        eVar.f1418e = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f1418e);
                } else {
                    arrayList.add(eVar.f1420g);
                }
                if (eVar instanceof a.g.b.k.i) {
                    hVar = new i(eVar);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<m> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (m mVar : arrayList) {
            if (mVar.f1484b != this.f1451d) {
                mVar.d();
            }
        }
    }

    public final int e(a.g.b.k.f fVar, int i2) {
        int size = this.f1456i.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, this.f1456i.get(i3).b(fVar, i2));
        }
        return (int) jMax;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f1449b || this.f1450c) {
            for (a.g.b.k.e eVar : this.f1448a.w0) {
                eVar.f1415b = false;
                eVar.f1419f.r();
                eVar.f1420g.q();
            }
            a.g.b.k.f fVar = this.f1448a;
            fVar.f1415b = false;
            fVar.f1419f.r();
            this.f1448a.f1420g.q();
            this.f1450c = false;
        }
        if (b(this.f1451d)) {
            return false;
        }
        this.f1448a.C0(0);
        this.f1448a.D0(0);
        e.b bVarQ = this.f1448a.q(0);
        e.b bVarQ2 = this.f1448a.q(1);
        if (this.f1449b) {
            c();
        }
        int iO = this.f1448a.O();
        int iP = this.f1448a.P();
        this.f1448a.f1419f.f1490h.d(iO);
        this.f1448a.f1420g.f1490h.d(iP);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarQ == bVar || bVarQ2 == bVar) {
            if (z4) {
                Iterator<m> it = this.f1452e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!it.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && bVarQ == e.b.WRAP_CONTENT) {
                this.f1448a.i0(e.b.FIXED);
                a.g.b.k.f fVar2 = this.f1448a;
                fVar2.B0(e(fVar2, 0));
                a.g.b.k.f fVar3 = this.f1448a;
                fVar3.f1419f.f1487e.d(fVar3.N());
            }
            if (z4 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f1448a.x0(e.b.FIXED);
                a.g.b.k.f fVar4 = this.f1448a;
                fVar4.e0(e(fVar4, 1));
                a.g.b.k.f fVar5 = this.f1448a;
                fVar5.f1420g.f1487e.d(fVar5.t());
            }
        }
        a.g.b.k.f fVar6 = this.f1448a;
        e.b[] bVarArr = fVar6.N;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int iN = fVar6.N() + iO;
            this.f1448a.f1419f.f1491i.d(iN);
            this.f1448a.f1419f.f1487e.d(iN - iO);
            m();
            a.g.b.k.f fVar7 = this.f1448a;
            e.b[] bVarArr2 = fVar7.N;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int iT = fVar7.t() + iP;
                this.f1448a.f1420g.f1491i.d(iT);
                this.f1448a.f1420g.f1487e.d(iT - iP);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        for (m mVar : this.f1452e) {
            if (mVar.f1484b != this.f1448a || mVar.f1489g) {
                mVar.e();
            }
        }
        for (m mVar2 : this.f1452e) {
            if (z2 || mVar2.f1484b != this.f1448a) {
                if (!mVar2.f1490h.f1466j || ((!mVar2.f1491i.f1466j && !(mVar2 instanceof h)) || (!mVar2.f1487e.f1466j && !(mVar2 instanceof c) && !(mVar2 instanceof h)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f1448a.i0(bVarQ);
        this.f1448a.x0(bVarQ2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.f1449b) {
            for (a.g.b.k.e eVar : this.f1448a.w0) {
                eVar.f1415b = false;
                j jVar = eVar.f1419f;
                jVar.f1487e.f1466j = false;
                jVar.f1489g = false;
                jVar.r();
                l lVar = eVar.f1420g;
                lVar.f1487e.f1466j = false;
                lVar.f1489g = false;
                lVar.q();
            }
            a.g.b.k.f fVar = this.f1448a;
            fVar.f1415b = false;
            j jVar2 = fVar.f1419f;
            jVar2.f1487e.f1466j = false;
            jVar2.f1489g = false;
            jVar2.r();
            l lVar2 = this.f1448a.f1420g;
            lVar2.f1487e.f1466j = false;
            lVar2.f1489g = false;
            lVar2.q();
            c();
        }
        if (b(this.f1451d)) {
            return false;
        }
        this.f1448a.C0(0);
        this.f1448a.D0(0);
        this.f1448a.f1419f.f1490h.d(0);
        this.f1448a.f1420g.f1490h.d(0);
        return true;
    }

    public boolean h(boolean z, int i2) {
        boolean z2;
        e.b bVar;
        g gVar;
        int iT;
        boolean z3 = true;
        boolean z4 = z & true;
        e.b bVarQ = this.f1448a.q(0);
        e.b bVarQ2 = this.f1448a.q(1);
        int iO = this.f1448a.O();
        int iP = this.f1448a.P();
        if (z4 && (bVarQ == (bVar = e.b.WRAP_CONTENT) || bVarQ2 == bVar)) {
            Iterator<m> it = this.f1452e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (next.f1488f == i2 && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && bVarQ == e.b.WRAP_CONTENT) {
                    this.f1448a.i0(e.b.FIXED);
                    a.g.b.k.f fVar = this.f1448a;
                    fVar.B0(e(fVar, 0));
                    a.g.b.k.f fVar2 = this.f1448a;
                    gVar = fVar2.f1419f.f1487e;
                    iT = fVar2.N();
                    gVar.d(iT);
                }
            } else if (z4 && bVarQ2 == e.b.WRAP_CONTENT) {
                this.f1448a.x0(e.b.FIXED);
                a.g.b.k.f fVar3 = this.f1448a;
                fVar3.e0(e(fVar3, 1));
                a.g.b.k.f fVar4 = this.f1448a;
                gVar = fVar4.f1420g.f1487e;
                iT = fVar4.t();
                gVar.d(iT);
            }
        }
        a.g.b.k.f fVar5 = this.f1448a;
        if (i2 == 0) {
            e.b[] bVarArr = fVar5.N;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int iN = fVar5.N() + iO;
                this.f1448a.f1419f.f1491i.d(iN);
                this.f1448a.f1419f.f1487e.d(iN - iO);
                z2 = true;
            }
            z2 = false;
        } else {
            e.b[] bVarArr2 = fVar5.N;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int iT2 = fVar5.t() + iP;
                this.f1448a.f1420g.f1491i.d(iT2);
                this.f1448a.f1420g.f1487e.d(iT2 - iP);
                z2 = true;
            }
            z2 = false;
        }
        m();
        for (m mVar : this.f1452e) {
            if (mVar.f1488f == i2 && (mVar.f1484b != this.f1448a || mVar.f1489g)) {
                mVar.e();
            }
        }
        for (m mVar2 : this.f1452e) {
            if (mVar2.f1488f == i2 && (z2 || mVar2.f1484b != this.f1448a)) {
                if (!mVar2.f1490h.f1466j || !mVar2.f1491i.f1466j || (!(mVar2 instanceof c) && !mVar2.f1487e.f1466j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f1448a.i0(bVarQ);
        this.f1448a.x0(bVarQ2);
        return z3;
    }

    public final void i(m mVar, int i2, ArrayList<k> arrayList) {
        for (d dVar : mVar.f1490h.f1467k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, mVar.f1491i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f1490h, i2, 0, mVar.f1491i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f1491i.f1467k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, mVar.f1490h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f1491i, i2, 1, mVar.f1490h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((l) mVar).f1480k.f1467k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.f1449b = true;
    }

    public void k() {
        this.f1450c = true;
    }

    public final void l(a.g.b.k.e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        b.a aVar = this.f1455h;
        aVar.f1436a = bVar;
        aVar.f1437b = bVar2;
        aVar.f1438c = i2;
        aVar.f1439d = i3;
        this.f1454g.b(eVar, aVar);
        eVar.B0(this.f1455h.f1440e);
        eVar.e0(this.f1455h.f1441f);
        eVar.d0(this.f1455h.f1443h);
        eVar.Y(this.f1455h.f1442g);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r12 = this;
            a.g.b.k.f r0 = r12.f1448a
            java.util.ArrayList<a.g.b.k.e> r0 = r0.w0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r0.next()
            a.g.b.k.e r1 = (a.g.b.k.e) r1
            boolean r2 = r1.f1415b
            if (r2 == 0) goto L19
            goto L8
        L19:
            a.g.b.k.e$b[] r2 = r1.N
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f1426m
            int r4 = r1.f1427n
            a.g.b.k.e$b r6 = a.g.b.k.e.b.WRAP_CONTENT
            if (r8 == r6) goto L32
            a.g.b.k.e$b r5 = a.g.b.k.e.b.MATCH_CONSTRAINT
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            if (r10 == r6) goto L3b
            a.g.b.k.e$b r5 = a.g.b.k.e.b.MATCH_CONSTRAINT
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = 1
        L3c:
            a.g.b.k.m.j r4 = r1.f1419f
            a.g.b.k.m.g r4 = r4.f1487e
            boolean r5 = r4.f1466j
            a.g.b.k.m.l r7 = r1.f1420g
            a.g.b.k.m.g r7 = r7.f1487e
            boolean r11 = r7.f1466j
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            a.g.b.k.e$b r6 = a.g.b.k.e.b.FIXED
            int r5 = r4.f1463g
            int r7 = r7.f1463g
            r2 = r12
            r3 = r1
            r4 = r6
            r2.l(r3, r4, r5, r6, r7)
        L58:
            r1.f1415b = r9
            goto Lae
        L5b:
            if (r5 == 0) goto L87
            if (r3 == 0) goto L87
            a.g.b.k.e$b r5 = a.g.b.k.e.b.FIXED
            int r8 = r4.f1463g
            int r7 = r7.f1463g
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.l(r3, r4, r5, r6, r7)
            a.g.b.k.e$b r2 = a.g.b.k.e.b.MATCH_CONSTRAINT
            if (r10 != r2) goto L7b
            a.g.b.k.m.l r2 = r1.f1420g
            a.g.b.k.m.g r2 = r2.f1487e
            int r3 = r1.t()
        L78:
            r2.f1469m = r3
            goto Lae
        L7b:
            a.g.b.k.m.l r2 = r1.f1420g
            a.g.b.k.m.g r2 = r2.f1487e
            int r3 = r1.t()
        L83:
            r2.d(r3)
            goto L58
        L87:
            if (r11 == 0) goto Lae
            if (r2 == 0) goto Lae
            int r5 = r4.f1463g
            a.g.b.k.e$b r10 = a.g.b.k.e.b.FIXED
            int r7 = r7.f1463g
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.l(r3, r4, r5, r6, r7)
            a.g.b.k.e$b r2 = a.g.b.k.e.b.MATCH_CONSTRAINT
            if (r8 != r2) goto La5
            a.g.b.k.m.j r2 = r1.f1419f
            a.g.b.k.m.g r2 = r2.f1487e
            int r3 = r1.N()
            goto L78
        La5:
            a.g.b.k.m.j r2 = r1.f1419f
            a.g.b.k.m.g r2 = r2.f1487e
            int r3 = r1.N()
            goto L83
        Lae:
            boolean r2 = r1.f1415b
            if (r2 == 0) goto L8
            a.g.b.k.m.l r2 = r1.f1420g
            a.g.b.k.m.g r2 = r2.f1481l
            if (r2 == 0) goto L8
            int r1 = r1.l()
            r2.d(r1)
            goto L8
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.e.m():void");
    }

    public void n(b.InterfaceC0023b interfaceC0023b) {
        this.f1454g = interfaceC0023b;
    }
}
