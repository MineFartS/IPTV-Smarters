package c.f.a.b.z2.m0;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import c.f.a.b.z2.m0.i0;
import c.f.a.b.z2.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.z2.o f11180a = new c.f.a.b.z2.o() { // from class: c.f.a.b.z2.m0.e
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return h0.v();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return c.f.a.b.z2.n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<u0> f11183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f11185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.c f11186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray<i0> f11187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f11188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f11189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g0 f11190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f0 f11191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.b.z2.l f11192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11194o;
    public boolean p;
    public boolean q;
    public i0 r;
    public int s;
    public int t;

    public class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.j3.h0 f11195a = new c.f.a.b.j3.h0(new byte[4]);

        public a() {
        }

        @Override // c.f.a.b.z2.m0.c0
        public void a(u0 u0Var, c.f.a.b.z2.l lVar, i0.d dVar) {
        }

        @Override // c.f.a.b.z2.m0.c0
        public void b(c.f.a.b.j3.i0 i0Var) {
            if (i0Var.D() == 0 && (i0Var.D() & 128) != 0) {
                i0Var.Q(6);
                int iA = i0Var.a() / 4;
                for (int i2 = 0; i2 < iA; i2++) {
                    i0Var.i(this.f11195a, 4);
                    int iH = this.f11195a.h(16);
                    this.f11195a.r(3);
                    if (iH == 0) {
                        this.f11195a.r(13);
                    } else {
                        int iH2 = this.f11195a.h(13);
                        if (h0.this.f11187h.get(iH2) == null) {
                            h0.this.f11187h.put(iH2, new d0(h0.this.new b(iH2)));
                            h0.j(h0.this);
                        }
                    }
                }
                if (h0.this.f11181b != 2) {
                    h0.this.f11187h.remove(0);
                }
            }
        }
    }

    public class b implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.j3.h0 f11197a = new c.f.a.b.j3.h0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<i0> f11198b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f11199c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11200d;

        public b(int i2) {
            this.f11200d = i2;
        }

        @Override // c.f.a.b.z2.m0.c0
        public void a(u0 u0Var, c.f.a.b.z2.l lVar, i0.d dVar) {
        }

        @Override // c.f.a.b.z2.m0.c0
        public void b(c.f.a.b.j3.i0 i0Var) {
            u0 u0Var;
            if (i0Var.D() != 2) {
                return;
            }
            if (h0.this.f11181b == 1 || h0.this.f11181b == 2 || h0.this.f11193n == 1) {
                u0Var = (u0) h0.this.f11183d.get(0);
            } else {
                u0Var = new u0(((u0) h0.this.f11183d.get(0)).c());
                h0.this.f11183d.add(u0Var);
            }
            if ((i0Var.D() & 128) == 0) {
                return;
            }
            i0Var.Q(1);
            int iJ = i0Var.J();
            int i2 = 3;
            i0Var.Q(3);
            i0Var.i(this.f11197a, 2);
            this.f11197a.r(3);
            int i3 = 13;
            h0.this.t = this.f11197a.h(13);
            i0Var.i(this.f11197a, 2);
            int i4 = 4;
            this.f11197a.r(4);
            i0Var.Q(this.f11197a.h(12));
            if (h0.this.f11181b == 2 && h0.this.r == null) {
                i0.b bVar = new i0.b(21, null, null, x0.f9301f);
                h0 h0Var = h0.this;
                h0Var.r = h0Var.f11186g.a(21, bVar);
                h0.this.r.a(u0Var, h0.this.f11192m, new i0.d(iJ, 21, 8192));
            }
            this.f11198b.clear();
            this.f11199c.clear();
            int iA = i0Var.a();
            while (iA > 0) {
                i0Var.i(this.f11197a, 5);
                int iH = this.f11197a.h(8);
                this.f11197a.r(i2);
                int iH2 = this.f11197a.h(i3);
                this.f11197a.r(i4);
                int iH3 = this.f11197a.h(12);
                i0.b bVarC = c(i0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f11218a;
                }
                iA -= iH3 + 5;
                int i5 = h0.this.f11181b == 2 ? iH : iH2;
                if (!h0.this.f11188i.get(i5)) {
                    i0 i0VarA = (h0.this.f11181b == 2 && iH == 21) ? h0.this.r : h0.this.f11186g.a(iH, bVarC);
                    if (h0.this.f11181b != 2 || iH2 < this.f11199c.get(i5, 8192)) {
                        this.f11199c.put(i5, iH2);
                        this.f11198b.put(i5, i0VarA);
                    }
                }
                i2 = 3;
                i4 = 4;
                i3 = 13;
            }
            int size = this.f11199c.size();
            for (int i6 = 0; i6 < size; i6++) {
                int iKeyAt = this.f11199c.keyAt(i6);
                int iValueAt = this.f11199c.valueAt(i6);
                h0.this.f11188i.put(iKeyAt, true);
                h0.this.f11189j.put(iValueAt, true);
                i0 i0VarValueAt = this.f11198b.valueAt(i6);
                if (i0VarValueAt != null) {
                    if (i0VarValueAt != h0.this.r) {
                        i0VarValueAt.a(u0Var, h0.this.f11192m, new i0.d(iJ, iKeyAt, 8192));
                    }
                    h0.this.f11187h.put(iValueAt, i0VarValueAt);
                }
            }
            if (h0.this.f11181b != 2) {
                h0.this.f11187h.remove(this.f11200d);
                h0 h0Var2 = h0.this;
                h0Var2.f11193n = h0Var2.f11181b == 1 ? 0 : h0.this.f11193n - 1;
                if (h0.this.f11193n != 0) {
                    return;
                } else {
                    h0.this.f11192m.p();
                }
            } else {
                if (h0.this.f11194o) {
                    return;
                }
                h0.this.f11192m.p();
                h0.this.f11193n = 0;
            }
            h0.this.f11194o = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final c.f.a.b.z2.m0.i0.b c(c.f.a.b.j3.i0 r14, int r15) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.h0.b.c(c.f.a.b.j3.i0, int):c.f.a.b.z2.m0.i0$b");
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i2) {
        this(1, i2, 112800);
    }

    public h0(int i2, int i3, int i4) {
        this(i2, new u0(0L), new l(i3), i4);
    }

    public h0(int i2, u0 u0Var, i0.c cVar) {
        this(i2, u0Var, cVar, 112800);
    }

    public h0(int i2, u0 u0Var, i0.c cVar, int i3) {
        this.f11186g = (i0.c) c.f.a.b.j3.g.e(cVar);
        this.f11182c = i3;
        this.f11181b = i2;
        if (i2 == 1 || i2 == 2) {
            this.f11183d = Collections.singletonList(u0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f11183d = arrayList;
            arrayList.add(u0Var);
        }
        this.f11184e = new c.f.a.b.j3.i0(new byte[9400], 0);
        this.f11188i = new SparseBooleanArray();
        this.f11189j = new SparseBooleanArray();
        this.f11187h = new SparseArray<>();
        this.f11185f = new SparseIntArray();
        this.f11190k = new g0(i3);
        this.t = -1;
        x();
    }

    public static /* synthetic */ int j(h0 h0Var) {
        int i2 = h0Var.f11193n;
        h0Var.f11193n = i2 + 1;
        return i2;
    }

    public static /* synthetic */ c.f.a.b.z2.j[] v() {
        return new c.f.a.b.z2.j[]{new h0()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        f0 f0Var;
        c.f.a.b.j3.g.g(this.f11181b != 2);
        int size = this.f11183d.size();
        for (int i2 = 0; i2 < size; i2++) {
            u0 u0Var = this.f11183d.get(i2);
            boolean z = u0Var.e() == -9223372036854775807L;
            if (!z) {
                long jC = u0Var.c();
                z = (jC == -9223372036854775807L || jC == 0 || jC == j3) ? false : true;
            }
            if (z) {
                u0Var.g(j3);
            }
        }
        if (j3 != 0 && (f0Var = this.f11191l) != null) {
            f0Var.h(j3);
        }
        this.f11184e.L(0);
        this.f11185f.clear();
        for (int i3 = 0; i3 < this.f11187h.size(); i3++) {
            this.f11187h.valueAt(i3).c();
        }
        this.s = 0;
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.f11192m = lVar;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        boolean z;
        byte[] bArrD = this.f11184e.d();
        kVar.u(bArrD, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                }
                if (bArrD[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                kVar.s(i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    @Override // c.f.a.b.z2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(c.f.a.b.z2.k r17, c.f.a.b.z2.w r18) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.h0.g(c.f.a.b.z2.k, c.f.a.b.z2.w):int");
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }

    public final boolean t(c.f.a.b.z2.k kVar) {
        byte[] bArrD = this.f11184e.d();
        if (9400 - this.f11184e.e() < 188) {
            int iA = this.f11184e.a();
            if (iA > 0) {
                System.arraycopy(bArrD, this.f11184e.e(), bArrD, 0, iA);
            }
            this.f11184e.N(bArrD, iA);
        }
        while (this.f11184e.a() < 188) {
            int iF = this.f11184e.f();
            int iB = kVar.b(bArrD, iF, 9400 - iF);
            if (iB == -1) {
                return false;
            }
            this.f11184e.O(iF + iB);
        }
        return true;
    }

    public final int u() throws w1 {
        int iE = this.f11184e.e();
        int iF = this.f11184e.f();
        int iA = j0.a(this.f11184e.d(), iE, iF);
        this.f11184e.P(iA);
        int i2 = iA + 188;
        if (i2 > iF) {
            int i3 = this.s + (iA - iE);
            this.s = i3;
            if (this.f11181b == 2 && i3 > 376) {
                throw w1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.s = 0;
        }
        return i2;
    }

    public final void w(long j2) {
        c.f.a.b.z2.l lVar;
        c.f.a.b.z2.x bVar;
        if (this.p) {
            return;
        }
        this.p = true;
        if (this.f11190k.b() != -9223372036854775807L) {
            f0 f0Var = new f0(this.f11190k.c(), this.f11190k.b(), j2, this.t, this.f11182c);
            this.f11191l = f0Var;
            lVar = this.f11192m;
            bVar = f0Var.b();
        } else {
            lVar = this.f11192m;
            bVar = new x.b(this.f11190k.b());
        }
        lVar.i(bVar);
    }

    public final void x() {
        this.f11188i.clear();
        this.f11187h.clear();
        SparseArray<i0> sparseArrayB = this.f11186g.b();
        int size = sparseArrayB.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f11187h.put(sparseArrayB.keyAt(i2), sparseArrayB.valueAt(i2));
        }
        this.f11187h.put(0, new d0(new a()));
        this.r = null;
    }

    public final boolean y(int i2) {
        return this.f11181b == 2 || this.f11194o || !this.f11189j.get(i2, false);
    }
}
