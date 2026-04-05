package a.y.e;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f.i<RecyclerView.e0, a> f3981a = new a.f.i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.f.f<RecyclerView.e0> f3982b = new a.f.f<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a.i.q.f<a> f3983a = new a.i.q.g(20);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.m.c f3985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView.m.c f3986d;

        public static void a() {
            while (f3983a.b() != null) {
            }
        }

        public static a b() {
            a aVarB = f3983a.b();
            return aVarB == null ? new a() : aVarB;
        }

        public static void c(a aVar) {
            aVar.f3984b = 0;
            aVar.f3985c = null;
            aVar.f3986d = null;
            f3983a.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.e0 e0Var);

        void b(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    public void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f3981a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3981a.put(e0Var, aVarB);
        }
        aVarB.f3984b |= 2;
        aVarB.f3985c = cVar;
    }

    public void b(RecyclerView.e0 e0Var) {
        a aVarB = this.f3981a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3981a.put(e0Var, aVarB);
        }
        aVarB.f3984b |= 1;
    }

    public void c(long j2, RecyclerView.e0 e0Var) {
        this.f3982b.k(j2, e0Var);
    }

    public void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f3981a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3981a.put(e0Var, aVarB);
        }
        aVarB.f3986d = cVar;
        aVarB.f3984b |= 8;
    }

    public void e(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f3981a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3981a.put(e0Var, aVarB);
        }
        aVarB.f3985c = cVar;
        aVarB.f3984b |= 4;
    }

    public void f() {
        this.f3981a.clear();
        this.f3982b.b();
    }

    public RecyclerView.e0 g(long j2) {
        return this.f3982b.f(j2);
    }

    public boolean h(RecyclerView.e0 e0Var) {
        a aVar = this.f3981a.get(e0Var);
        return (aVar == null || (aVar.f3984b & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.e0 e0Var) {
        a aVar = this.f3981a.get(e0Var);
        return (aVar == null || (aVar.f3984b & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.e0 e0Var) {
        p(e0Var);
    }

    public final RecyclerView.m.c l(RecyclerView.e0 e0Var, int i2) {
        a aVarN;
        RecyclerView.m.c cVar;
        int iG = this.f3981a.g(e0Var);
        if (iG >= 0 && (aVarN = this.f3981a.n(iG)) != null) {
            int i3 = aVarN.f3984b;
            if ((i3 & i2) != 0) {
                int i4 = (i2 ^ (-1)) & i3;
                aVarN.f3984b = i4;
                if (i2 == 4) {
                    cVar = aVarN.f3985c;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarN.f3986d;
                }
                if ((i4 & 12) == 0) {
                    this.f3981a.l(iG);
                    a.c(aVarN);
                }
                return cVar;
            }
        }
        return null;
    }

    public RecyclerView.m.c m(RecyclerView.e0 e0Var) {
        return l(e0Var, 8);
    }

    public RecyclerView.m.c n(RecyclerView.e0 e0Var) {
        return l(e0Var, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(a.y.e.s.b r7) {
        /*
            r6 = this;
            a.f.i<androidx.recyclerview.widget.RecyclerView$e0, a.y.e.s$a> r0 = r6.f3981a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L63
            a.f.i<androidx.recyclerview.widget.RecyclerView$e0, a.y.e.s$a> r1 = r6.f3981a
            java.lang.Object r1 = r1.j(r0)
            androidx.recyclerview.widget.RecyclerView$e0 r1 = (androidx.recyclerview.widget.RecyclerView.e0) r1
            a.f.i<androidx.recyclerview.widget.RecyclerView$e0, a.y.e.s$a> r2 = r6.f3981a
            java.lang.Object r2 = r2.l(r0)
            a.y.e.s$a r2 = (a.y.e.s.a) r2
            int r3 = r2.f3984b
            r4 = r3 & 3
            r5 = 3
            if (r4 != r5) goto L25
        L21:
            r7.a(r1)
            goto L5d
        L25:
            r4 = r3 & 1
            if (r4 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$m$c r3 = r2.f3985c
            if (r3 != 0) goto L2e
            goto L21
        L2e:
            androidx.recyclerview.widget.RecyclerView$m$c r4 = r2.f3986d
        L30:
            r7.c(r1, r3, r4)
            goto L5d
        L34:
            r4 = r3 & 14
            r5 = 14
            if (r4 != r5) goto L42
        L3a:
            androidx.recyclerview.widget.RecyclerView$m$c r3 = r2.f3985c
            androidx.recyclerview.widget.RecyclerView$m$c r4 = r2.f3986d
            r7.b(r1, r3, r4)
            goto L5d
        L42:
            r4 = r3 & 12
            r5 = 12
            if (r4 != r5) goto L50
            androidx.recyclerview.widget.RecyclerView$m$c r3 = r2.f3985c
            androidx.recyclerview.widget.RecyclerView$m$c r4 = r2.f3986d
            r7.d(r1, r3, r4)
            goto L5d
        L50:
            r4 = r3 & 4
            if (r4 == 0) goto L58
            androidx.recyclerview.widget.RecyclerView$m$c r3 = r2.f3985c
            r4 = 0
            goto L30
        L58:
            r3 = r3 & 8
            if (r3 == 0) goto L5d
            goto L3a
        L5d:
            a.y.e.s.a.c(r2)
            int r0 = r0 + (-1)
            goto L8
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.e.s.o(a.y.e.s$b):void");
    }

    public void p(RecyclerView.e0 e0Var) {
        a aVar = this.f3981a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3984b &= -2;
    }

    public void q(RecyclerView.e0 e0Var) {
        int iN = this.f3982b.n() - 1;
        while (true) {
            if (iN < 0) {
                break;
            }
            if (e0Var == this.f3982b.o(iN)) {
                this.f3982b.m(iN);
                break;
            }
            iN--;
        }
        a aVarRemove = this.f3981a.remove(e0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
