package a.g.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<m> f1446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1447l;

    public c(a.g.b.k.e eVar, int i2) {
        super(eVar);
        this.f1446k = new ArrayList<>();
        this.f1488f = i2;
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01c8 A[PHI: r1 r22 r23 r24
  0x01c8: PHI (r1v52 int) = (r1v50 int), (r1v58 int) binds: [B:119:0x01c6, B:110:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c8: PHI (r22v3 float) = (r22v2 float), (r22v5 float) binds: [B:119:0x01c6, B:110:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c8: PHI (r23v6 boolean) = (r23v5 boolean), (r23v8 boolean) binds: [B:119:0x01c6, B:110:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01c8: PHI (r24v6 int) = (r24v5 int), (r24v8 int) binds: [B:119:0x01c6, B:110:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // a.g.b.k.m.m, a.g.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.g.b.k.m.d r26) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.c.a(a.g.b.k.m.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r0 r1
  0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r1v3 a.g.b.k.m.f) = (r1v2 a.g.b.k.m.f), (r1v7 a.g.b.k.m.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.g.b.k.m.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList<a.g.b.k.m.m> r0 = r5.f1446k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            a.g.b.k.m.m r1 = (a.g.b.k.m.m) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList<a.g.b.k.m.m> r0 = r5.f1446k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<a.g.b.k.m.m> r2 = r5.f1446k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            a.g.b.k.m.m r2 = (a.g.b.k.m.m) r2
            a.g.b.k.e r2 = r2.f1484b
            java.util.ArrayList<a.g.b.k.m.m> r4 = r5.f1446k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            a.g.b.k.m.m r0 = (a.g.b.k.m.m) r0
            a.g.b.k.e r0 = r0.f1484b
            int r4 = r5.f1488f
            if (r4 != 0) goto L70
            a.g.b.k.d r1 = r2.C
            a.g.b.k.d r0 = r0.E
            a.g.b.k.m.f r2 = r5.i(r1, r3)
            int r1 = r1.b()
            a.g.b.k.e r4 = r5.r()
            if (r4 == 0) goto L52
            a.g.b.k.d r1 = r4.C
            int r1 = r1.b()
        L52:
            if (r2 == 0) goto L59
            a.g.b.k.m.f r4 = r5.f1490h
            r5.b(r4, r2, r1)
        L59:
            a.g.b.k.m.f r1 = r5.i(r0, r3)
            int r0 = r0.b()
            a.g.b.k.e r2 = r5.s()
            if (r2 == 0) goto L6d
            a.g.b.k.d r0 = r2.E
            int r0 = r0.b()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            a.g.b.k.d r2 = r2.D
            a.g.b.k.d r0 = r0.F
            a.g.b.k.m.f r3 = r5.i(r2, r1)
            int r2 = r2.b()
            a.g.b.k.e r4 = r5.r()
            if (r4 == 0) goto L88
            a.g.b.k.d r2 = r4.D
            int r2 = r2.b()
        L88:
            if (r3 == 0) goto L8f
            a.g.b.k.m.f r4 = r5.f1490h
            r5.b(r4, r3, r2)
        L8f:
            a.g.b.k.m.f r1 = r5.i(r0, r1)
            int r0 = r0.b()
            a.g.b.k.e r2 = r5.s()
            if (r2 == 0) goto La3
            a.g.b.k.d r0 = r2.F
            int r0 = r0.b()
        La3:
            if (r1 == 0) goto Lab
        La5:
            a.g.b.k.m.f r2 = r5.f1491i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            a.g.b.k.m.f r0 = r5.f1490h
            r0.f1457a = r5
            a.g.b.k.m.f r0 = r5.f1491i
            r0.f1457a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.k.m.c.d():void");
    }

    @Override // a.g.b.k.m.m
    public void e() {
        for (int i2 = 0; i2 < this.f1446k.size(); i2++) {
            this.f1446k.get(i2).e();
        }
    }

    @Override // a.g.b.k.m.m
    public void f() {
        this.f1485c = null;
        Iterator<m> it = this.f1446k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // a.g.b.k.m.m
    public long j() {
        int size = this.f1446k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.f1446k.get(i2);
            j2 = j2 + ((long) mVar.f1490h.f1462f) + mVar.j() + ((long) mVar.f1491i.f1462f);
        }
        return j2;
    }

    @Override // a.g.b.k.m.m
    public boolean m() {
        int size = this.f1446k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f1446k.get(i2).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        a.g.b.k.e eVar;
        a.g.b.k.e eVarF = this.f1484b;
        do {
            eVar = eVarF;
            eVarF = eVarF.F(this.f1488f);
        } while (eVarF != null);
        this.f1484b = eVar;
        this.f1446k.add(eVar.H(this.f1488f));
        a.g.b.k.e eVarD = eVar.D(this.f1488f);
        while (eVarD != null) {
            this.f1446k.add(eVarD.H(this.f1488f));
            eVarD = eVarD.D(this.f1488f);
        }
        for (m mVar : this.f1446k) {
            int i2 = this.f1488f;
            if (i2 == 0) {
                mVar.f1484b.f1417d = this;
            } else if (i2 == 1) {
                mVar.f1484b.f1418e = this;
            }
        }
        if ((this.f1488f == 0 && ((a.g.b.k.f) this.f1484b.E()).W0()) && this.f1446k.size() > 1) {
            ArrayList<m> arrayList = this.f1446k;
            this.f1484b = arrayList.get(arrayList.size() - 1).f1484b;
        }
        this.f1447l = this.f1488f == 0 ? this.f1484b.v() : this.f1484b.J();
    }

    public final a.g.b.k.e r() {
        for (int i2 = 0; i2 < this.f1446k.size(); i2++) {
            m mVar = this.f1446k.get(i2);
            if (mVar.f1484b.M() != 8) {
                return mVar.f1484b;
            }
        }
        return null;
    }

    public final a.g.b.k.e s() {
        for (int size = this.f1446k.size() - 1; size >= 0; size--) {
            m mVar = this.f1446k.get(size);
            if (mVar.f1484b.M() != 8) {
                return mVar.f1484b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f1488f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<m> it = this.f1446k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}
