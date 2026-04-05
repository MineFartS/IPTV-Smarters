package c.f.a.b.e3.e1;

import android.os.SystemClock;
import c.f.a.b.e3.d1.g;
import c.f.a.b.e3.e1.g;
import c.f.a.b.e3.e1.o;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.h0;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.p;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.m2;
import c.f.a.b.w0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f7100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o.c f7103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b[] f7104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.b.g3.h f7105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.b.e3.e1.p.c f7106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f7108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7109n;

    public static final class a implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f7110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g.a f7112c;

        public a(g.a aVar, p.a aVar2, int i2) {
            this.f7112c = aVar;
            this.f7110a = aVar2;
            this.f7111b = i2;
        }

        public a(p.a aVar) {
            this(aVar, 1);
        }

        public a(p.a aVar, int i2) {
            this(c.f.a.b.e3.d1.e.f7004b, aVar, i2);
        }

        @Override // c.f.a.b.e3.e1.g.a
        public g a(h0 h0Var, c.f.a.b.e3.e1.p.c cVar, f fVar, int i2, int[] iArr, c.f.a.b.g3.h hVar, int i3, long j2, boolean z, List<k1> list, o.c cVar2, n0 n0Var) {
            p pVarA = this.f7110a.a();
            if (n0Var != null) {
                pVarA.h(n0Var);
            }
            return new m(this.f7112c, h0Var, cVar, fVar, i2, iArr, hVar, i3, pVarA, j2, this.f7111b, z, list, cVar2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.e3.d1.g f7113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.e3.e1.p.j f7114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.e3.e1.p.b f7115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j f7116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f7117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f7118f;

        public b(long j2, c.f.a.b.e3.e1.p.j jVar, c.f.a.b.e3.e1.p.b bVar, c.f.a.b.e3.d1.g gVar, long j3, j jVar2) {
            this.f7117e = j2;
            this.f7114b = jVar;
            this.f7115c = bVar;
            this.f7118f = j3;
            this.f7113a = gVar;
            this.f7116d = jVar2;
        }

        public b b(long j2, c.f.a.b.e3.e1.p.j jVar) throws c.f.a.b.e3.o {
            long jF;
            long jF2;
            j jVarL = this.f7114b.l();
            j jVarL2 = jVar.l();
            if (jVarL == null) {
                return new b(j2, jVar, this.f7115c, this.f7113a, this.f7118f, jVarL);
            }
            if (!jVarL.g()) {
                return new b(j2, jVar, this.f7115c, this.f7113a, this.f7118f, jVarL2);
            }
            long jI = jVarL.i(j2);
            if (jI == 0) {
                return new b(j2, jVar, this.f7115c, this.f7113a, this.f7118f, jVarL2);
            }
            long jH = jVarL.h();
            long jB = jVarL.b(jH);
            long j3 = (jI + jH) - 1;
            long jB2 = jVarL.b(j3) + jVarL.a(j3, j2);
            long jH2 = jVarL2.h();
            long jB3 = jVarL2.b(jH2);
            long j4 = this.f7118f;
            if (jB2 == jB3) {
                jF = j3 + 1;
            } else {
                if (jB2 < jB3) {
                    throw new c.f.a.b.e3.o();
                }
                if (jB3 < jB) {
                    jF2 = j4 - (jVarL2.f(jB, j2) - jH);
                    return new b(j2, jVar, this.f7115c, this.f7113a, jF2, jVarL2);
                }
                jF = jVarL.f(jB3, j2);
            }
            jF2 = j4 + (jF - jH2);
            return new b(j2, jVar, this.f7115c, this.f7113a, jF2, jVarL2);
        }

        public b c(j jVar) {
            return new b(this.f7117e, this.f7114b, this.f7115c, this.f7113a, this.f7118f, jVar);
        }

        public b d(c.f.a.b.e3.e1.p.b bVar) {
            return new b(this.f7117e, this.f7114b, bVar, this.f7113a, this.f7118f, this.f7116d);
        }

        public long e(long j2) {
            return this.f7116d.c(this.f7117e, j2) + this.f7118f;
        }

        public long f() {
            return this.f7116d.h() + this.f7118f;
        }

        public long g(long j2) {
            return (e(j2) + this.f7116d.j(this.f7117e, j2)) - 1;
        }

        public long h() {
            return this.f7116d.i(this.f7117e);
        }

        public long i(long j2) {
            return k(j2) + this.f7116d.a(j2 - this.f7118f, this.f7117e);
        }

        public long j(long j2) {
            return this.f7116d.f(j2, this.f7117e) + this.f7118f;
        }

        public long k(long j2) {
            return this.f7116d.b(j2 - this.f7118f);
        }

        public c.f.a.b.e3.e1.p.i l(long j2) {
            return this.f7116d.e(j2 - this.f7118f);
        }

        public boolean m(long j2, long j3) {
            return this.f7116d.g() || j3 == -9223372036854775807L || i(j2) <= j3;
        }
    }

    public static final class c extends c.f.a.b.e3.d1.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f7119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f7120f;

        public c(b bVar, long j2, long j3, long j4) {
            super(j2, j3);
            this.f7119e = bVar;
            this.f7120f = j4;
        }

        @Override // c.f.a.b.e3.d1.o
        public long a() {
            c();
            return this.f7119e.k(d());
        }

        @Override // c.f.a.b.e3.d1.o
        public long b() {
            c();
            return this.f7119e.i(d());
        }
    }

    public m(g.a aVar, h0 h0Var, c.f.a.b.e3.e1.p.c cVar, f fVar, int i2, int[] iArr, c.f.a.b.g3.h hVar, int i3, p pVar, long j2, int i4, boolean z, List<k1> list, o.c cVar2) {
        this.f7096a = h0Var;
        this.f7106k = cVar;
        this.f7097b = fVar;
        this.f7098c = iArr;
        this.f7105j = hVar;
        this.f7099d = i3;
        this.f7100e = pVar;
        this.f7107l = i2;
        this.f7101f = j2;
        this.f7102g = i4;
        this.f7103h = cVar2;
        long jG = cVar.g(i2);
        ArrayList<c.f.a.b.e3.e1.p.j> arrayListN = n();
        this.f7104i = new b[hVar.length()];
        int i5 = 0;
        while (i5 < this.f7104i.length) {
            c.f.a.b.e3.e1.p.j jVar = arrayListN.get(hVar.h(i5));
            c.f.a.b.e3.e1.p.b bVarJ = fVar.j(jVar.f7205c);
            b[] bVarArr = this.f7104i;
            if (bVarJ == null) {
                bVarJ = jVar.f7205c.get(0);
            }
            int i6 = i5;
            bVarArr[i6] = new b(jG, jVar, bVarJ, c.f.a.b.e3.d1.e.f7004b.a(i3, jVar.f7204b, z, list, cVar2), 0L, jVar.l());
            i5 = i6 + 1;
        }
    }

    @Override // c.f.a.b.e3.d1.j
    public void a() throws IOException {
        IOException iOException = this.f7108m;
        if (iOException != null) {
            throw iOException;
        }
        this.f7096a.a();
    }

    @Override // c.f.a.b.e3.e1.g
    public void b(c.f.a.b.g3.h hVar) {
        this.f7105j = hVar;
    }

    @Override // c.f.a.b.e3.d1.j
    public boolean c(long j2, c.f.a.b.e3.d1.f fVar, List<? extends c.f.a.b.e3.d1.n> list) {
        if (this.f7108m != null) {
            return false;
        }
        return this.f7105j.e(j2, fVar, list);
    }

    @Override // c.f.a.b.e3.e1.g
    public void e(c.f.a.b.e3.e1.p.c cVar, int i2) {
        try {
            this.f7106k = cVar;
            this.f7107l = i2;
            long jG = cVar.g(i2);
            ArrayList<c.f.a.b.e3.e1.p.j> arrayListN = n();
            for (int i3 = 0; i3 < this.f7104i.length; i3++) {
                c.f.a.b.e3.e1.p.j jVar = arrayListN.get(this.f7105j.h(i3));
                b[] bVarArr = this.f7104i;
                bVarArr[i3] = bVarArr[i3].b(jG, jVar);
            }
        } catch (c.f.a.b.e3.o e2) {
            this.f7108m = e2;
        }
    }

    @Override // c.f.a.b.e3.d1.j
    public long f(long j2, m2 m2Var) {
        for (b bVar : this.f7104i) {
            if (bVar.f7116d != null) {
                long j3 = bVar.j(j2);
                long jK = bVar.k(j3);
                long jH = bVar.h();
                return m2Var.a(j2, jK, (jK >= j2 || (jH != -1 && j3 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j3 + 1));
            }
        }
        return j2;
    }

    @Override // c.f.a.b.e3.d1.j
    public int g(long j2, List<? extends c.f.a.b.e3.d1.n> list) {
        return (this.f7108m != null || this.f7105j.length() < 2) ? list.size() : this.f7105j.i(j2, list);
    }

    @Override // c.f.a.b.e3.d1.j
    public void h(c.f.a.b.e3.d1.f fVar) {
        c.f.a.b.z2.e eVarD;
        if (fVar instanceof c.f.a.b.e3.d1.m) {
            int iJ = this.f7105j.j(((c.f.a.b.e3.d1.m) fVar).f7025d);
            b bVar = this.f7104i[iJ];
            if (bVar.f7116d == null && (eVarD = bVar.f7113a.d()) != null) {
                this.f7104i[iJ] = bVar.c(new l(eVarD, bVar.f7114b.f7206d));
            }
        }
        o.c cVar = this.f7103h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    @Override // c.f.a.b.e3.d1.j
    public boolean i(c.f.a.b.e3.d1.f fVar, boolean z, f0.c cVar, f0 f0Var) {
        f0.b bVarB;
        int i2 = 0;
        if (!z) {
            return false;
        }
        o.c cVar2 = this.f7103h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f7106k.f7159d && (fVar instanceof c.f.a.b.e3.d1.n)) {
            IOException iOException = cVar.f8868c;
            if ((iOException instanceof c0.e) && ((c0.e) iOException).f8849e == 404) {
                b bVar = this.f7104i[this.f7105j.j(fVar.f7025d)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((c.f.a.b.e3.d1.n) fVar).g() > (bVar.f() + jH) - 1) {
                        this.f7109n = true;
                        return true;
                    }
                }
            }
        }
        int iJ = this.f7105j.j(fVar.f7025d);
        b bVar2 = this.f7104i[iJ];
        f0.a aVarK = k(this.f7105j, bVar2.f7114b.f7205c);
        if ((!aVarK.a(2) && !aVarK.a(1)) || (bVarB = f0Var.b(aVarK, cVar)) == null) {
            return false;
        }
        int i3 = bVarB.f8864a;
        if (i3 == 2) {
            c.f.a.b.g3.h hVar = this.f7105j;
            return hVar.c(hVar.j(fVar.f7025d), bVarB.f8865b);
        }
        if (i3 != 1) {
            return false;
        }
        this.f7097b.d(bVar2.f7115c, bVarB.f8865b);
        boolean z2 = false;
        while (true) {
            b[] bVarArr = this.f7104i;
            if (i2 >= bVarArr.length) {
                return z2;
            }
            c.f.a.b.e3.e1.p.b bVarJ = this.f7097b.j(bVarArr[i2].f7114b.f7205c);
            if (bVarJ != null) {
                if (i2 == iJ) {
                    z2 = true;
                }
                b[] bVarArr2 = this.f7104i;
                bVarArr2[i2] = bVarArr2[i2].d(bVarJ);
            }
            i2++;
        }
    }

    @Override // c.f.a.b.e3.d1.j
    public void j(long j2, long j3, List<? extends c.f.a.b.e3.d1.n> list, c.f.a.b.e3.d1.h hVar) {
        int i2;
        int i3;
        c.f.a.b.e3.d1.o[] oVarArr;
        long j4;
        m mVar = this;
        if (mVar.f7108m != null) {
            return;
        }
        long j5 = j3 - j2;
        long jD = w0.d(mVar.f7106k.f7156a) + w0.d(mVar.f7106k.d(mVar.f7107l).f7190b) + j3;
        o.c cVar = mVar.f7103h;
        if (cVar == null || !cVar.h(jD)) {
            long jD2 = w0.d(x0.Z(mVar.f7101f));
            long jM = mVar.m(jD2);
            c.f.a.b.e3.d1.n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = mVar.f7105j.length();
            c.f.a.b.e3.d1.o[] oVarArr2 = new c.f.a.b.e3.d1.o[length];
            int i4 = 0;
            while (i4 < length) {
                b bVar = mVar.f7104i[i4];
                if (bVar.f7116d == null) {
                    oVarArr2[i4] = c.f.a.b.e3.d1.o.f7060a;
                    i2 = i4;
                    i3 = length;
                    oVarArr = oVarArr2;
                    j4 = jD2;
                } else {
                    long jE = bVar.e(jD2);
                    long jG = bVar.g(jD2);
                    i2 = i4;
                    i3 = length;
                    oVarArr = oVarArr2;
                    j4 = jD2;
                    long jO = o(bVar, nVar, j3, jE, jG);
                    if (jO < jE) {
                        oVarArr[i2] = c.f.a.b.e3.d1.o.f7060a;
                    } else {
                        oVarArr[i2] = new c(bVar, jO, jG, jM);
                    }
                }
                i4 = i2 + 1;
                jD2 = j4;
                oVarArr2 = oVarArr;
                length = i3;
                mVar = this;
            }
            long j6 = jD2;
            mVar.f7105j.k(j2, j5, mVar.l(jD2, j2), list, oVarArr2);
            b bVar2 = mVar.f7104i[mVar.f7105j.b()];
            c.f.a.b.e3.d1.g gVar = bVar2.f7113a;
            if (gVar != null) {
                c.f.a.b.e3.e1.p.j jVar = bVar2.f7114b;
                c.f.a.b.e3.e1.p.i iVarN = gVar.b() == null ? jVar.n() : null;
                c.f.a.b.e3.e1.p.i iVarM = bVar2.f7116d == null ? jVar.m() : null;
                if (iVarN != null || iVarM != null) {
                    hVar.f7031a = p(bVar2, mVar.f7100e, mVar.f7105j.m(), mVar.f7105j.n(), mVar.f7105j.p(), iVarN, iVarM);
                    return;
                }
            }
            long j7 = bVar2.f7117e;
            boolean z = j7 != -9223372036854775807L;
            if (bVar2.h() == 0) {
                hVar.f7032b = z;
                return;
            }
            long jE2 = bVar2.e(j6);
            long jG2 = bVar2.g(j6);
            boolean z2 = z;
            long jO2 = o(bVar2, nVar, j3, jE2, jG2);
            if (jO2 < jE2) {
                mVar.f7108m = new c.f.a.b.e3.o();
                return;
            }
            if (jO2 > jG2 || (mVar.f7109n && jO2 >= jG2)) {
                hVar.f7032b = z2;
                return;
            }
            if (z2 && bVar2.k(jO2) >= j7) {
                hVar.f7032b = true;
                return;
            }
            int iMin = (int) Math.min(mVar.f7102g, (jG2 - jO2) + 1);
            if (j7 != -9223372036854775807L) {
                while (iMin > 1 && bVar2.k((((long) iMin) + jO2) - 1) >= j7) {
                    iMin--;
                }
            }
            hVar.f7031a = q(bVar2, mVar.f7100e, mVar.f7099d, mVar.f7105j.m(), mVar.f7105j.n(), mVar.f7105j.p(), jO2, iMin, list.isEmpty() ? j3 : -9223372036854775807L, jM);
        }
    }

    public final f0.a k(c.f.a.b.g3.h hVar, List<c.f.a.b.e3.e1.p.b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = hVar.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (hVar.d(i3, jElapsedRealtime)) {
                i2++;
            }
        }
        int iE = f.e(list);
        return new f0.a(iE, iE - this.f7097b.f(list), length, i2);
    }

    public final long l(long j2, long j3) {
        if (!this.f7106k.f7159d) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m(j2), this.f7104i[0].i(this.f7104i[0].g(j2))) - j3);
    }

    public final long m(long j2) {
        c.f.a.b.e3.e1.p.c cVar = this.f7106k;
        long j3 = cVar.f7156a;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - w0.d(j3 + cVar.d(this.f7107l).f7190b);
    }

    public final ArrayList<c.f.a.b.e3.e1.p.j> n() {
        List<c.f.a.b.e3.e1.p.a> list = this.f7106k.d(this.f7107l).f7191c;
        ArrayList<c.f.a.b.e3.e1.p.j> arrayList = new ArrayList<>();
        for (int i2 : this.f7098c) {
            arrayList.addAll(list.get(i2).f7148c);
        }
        return arrayList;
    }

    public final long o(b bVar, c.f.a.b.e3.d1.n nVar, long j2, long j3, long j4) {
        return nVar != null ? nVar.g() : x0.s(bVar.j(j2), j3, j4);
    }

    public c.f.a.b.e3.d1.f p(b bVar, p pVar, k1 k1Var, int i2, Object obj, c.f.a.b.e3.e1.p.i iVar, c.f.a.b.e3.e1.p.i iVar2) {
        c.f.a.b.e3.e1.p.i iVar3 = iVar;
        c.f.a.b.e3.e1.p.j jVar = bVar.f7114b;
        if (iVar3 != null) {
            c.f.a.b.e3.e1.p.i iVarA = iVar3.a(iVar2, bVar.f7115c.f7152a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = iVar2;
        }
        return new c.f.a.b.e3.d1.m(pVar, k.a(bVar.f7115c.f7152a, iVar3, jVar.k(), 0), k1Var, i2, obj, bVar.f7113a);
    }

    public c.f.a.b.e3.d1.f q(b bVar, p pVar, int i2, k1 k1Var, int i3, Object obj, long j2, int i4, long j3, long j4) {
        c.f.a.b.e3.e1.p.j jVar = bVar.f7114b;
        long jK = bVar.k(j2);
        c.f.a.b.e3.e1.p.i iVarL = bVar.l(j2);
        if (bVar.f7113a == null) {
            return new c.f.a.b.e3.d1.p(pVar, k.a(bVar.f7115c.f7152a, iVarL, jVar.k(), bVar.m(j2, j4) ? 0 : 8), k1Var, i3, obj, jK, bVar.i(j2), j2, i2, k1Var);
        }
        int i5 = 1;
        int i6 = 1;
        while (i5 < i4) {
            c.f.a.b.e3.e1.p.i iVarA = iVarL.a(bVar.l(((long) i5) + j2), bVar.f7115c.f7152a);
            if (iVarA == null) {
                break;
            }
            i6++;
            i5++;
            iVarL = iVarA;
        }
        long j5 = (((long) i6) + j2) - 1;
        long jI = bVar.i(j5);
        long j6 = bVar.f7117e;
        return new c.f.a.b.e3.d1.k(pVar, k.a(bVar.f7115c.f7152a, iVarL, jVar.k(), bVar.m(j5, j4) ? 0 : 8), k1Var, i3, obj, jK, jI, j3, (j6 == -9223372036854775807L || j6 > jI) ? -9223372036854775807L : j6, j2, i6, -jVar.f7206d, bVar.f7113a);
    }

    @Override // c.f.a.b.e3.d1.j
    public void release() {
        for (b bVar : this.f7104i) {
            c.f.a.b.e3.d1.g gVar = bVar.f7113a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
