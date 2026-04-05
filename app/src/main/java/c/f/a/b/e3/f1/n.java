package c.f.a.b.e3.f1;

import android.net.Uri;
import c.f.a.b.b3.a;
import c.f.a.b.e3.f1.j;
import c.f.a.b.e3.f1.x.g;
import c.f.a.b.i3.s;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.u0;
import c.f.a.b.j3.w0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.x2.w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends c.f.a.b.e3.d1.n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f7301k = new AtomicInteger();
    public final i0 A;
    public final boolean B;
    public final boolean C;
    public o D;
    public r E;
    public int F;
    public boolean G;
    public volatile boolean H;
    public boolean I;
    public c.f.b.b.t<Integer> J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Uri f7304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7305o;
    public final int p;
    public final c.f.a.b.i3.p q;
    public final c.f.a.b.i3.s r;
    public final o s;
    public final boolean t;
    public final boolean u;
    public final u0 v;
    public final l w;
    public final List<k1> x;
    public final w y;
    public final c.f.a.b.b3.m.h z;

    public n(l lVar, c.f.a.b.i3.p pVar, c.f.a.b.i3.s sVar, k1 k1Var, boolean z, c.f.a.b.i3.p pVar2, c.f.a.b.i3.s sVar2, boolean z2, Uri uri, List<k1> list, int i2, Object obj, long j2, long j3, long j4, int i3, boolean z3, int i4, boolean z4, boolean z5, u0 u0Var, w wVar, o oVar, c.f.a.b.b3.m.h hVar, i0 i0Var, boolean z6) {
        super(pVar, sVar, k1Var, i2, obj, j2, j3, j4);
        this.B = z;
        this.p = i3;
        this.L = z3;
        this.f7303m = i4;
        this.r = sVar2;
        this.q = pVar2;
        this.G = sVar2 != null;
        this.C = z2;
        this.f7304n = uri;
        this.t = z5;
        this.v = u0Var;
        this.u = z4;
        this.w = lVar;
        this.x = list;
        this.y = wVar;
        this.s = oVar;
        this.z = hVar;
        this.A = i0Var;
        this.f7305o = z6;
        this.J = c.f.b.b.t.J();
        this.f7302l = f7301k.getAndIncrement();
    }

    public static c.f.a.b.i3.p i(c.f.a.b.i3.p pVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return pVar;
        }
        c.f.a.b.j3.g.e(bArr2);
        return new e(pVar, bArr, bArr2);
    }

    public static n j(l lVar, c.f.a.b.i3.p pVar, k1 k1Var, long j2, c.f.a.b.e3.f1.x.g gVar, j.e eVar, Uri uri, List<k1> list, int i2, Object obj, boolean z, u uVar, n nVar, byte[] bArr, byte[] bArr2, boolean z2) {
        boolean z3;
        c.f.a.b.i3.p pVarI;
        c.f.a.b.i3.s sVar;
        boolean z4;
        c.f.a.b.b3.m.h hVar;
        i0 i0Var;
        o oVar;
        g.e eVar2 = eVar.f7294a;
        c.f.a.b.i3.s sVarA = new s.b().i(w0.e(gVar.f7450a, eVar2.f7434b)).h(eVar2.f7442j).g(eVar2.f7443k).b(eVar.f7297d ? 8 : 0).a();
        boolean z5 = bArr != null;
        c.f.a.b.i3.p pVarI2 = i(pVar, bArr, z5 ? l((String) c.f.a.b.j3.g.e(eVar2.f7441i)) : null);
        g.d dVar = eVar2.f7435c;
        if (dVar != null) {
            boolean z6 = bArr2 != null;
            byte[] bArrL = z6 ? l((String) c.f.a.b.j3.g.e(dVar.f7441i)) : null;
            z3 = z5;
            sVar = new c.f.a.b.i3.s(w0.e(gVar.f7450a, dVar.f7434b), dVar.f7442j, dVar.f7443k);
            pVarI = i(pVar, bArr2, bArrL);
            z4 = z6;
        } else {
            z3 = z5;
            pVarI = null;
            sVar = null;
            z4 = false;
        }
        long j3 = j2 + eVar2.f7438f;
        long j4 = j3 + eVar2.f7436d;
        int i3 = gVar.f7421j + eVar2.f7437e;
        if (nVar != null) {
            c.f.a.b.i3.s sVar2 = nVar.r;
            boolean z7 = sVar == sVar2 || (sVar != null && sVar2 != null && sVar.f9061a.equals(sVar2.f9061a) && sVar.f9067g == nVar.r.f9067g);
            boolean z8 = uri.equals(nVar.f7304n) && nVar.I;
            hVar = nVar.z;
            i0Var = nVar.A;
            oVar = (z7 && z8 && !nVar.K && nVar.f7303m == i3) ? nVar.D : null;
        } else {
            hVar = new c.f.a.b.b3.m.h();
            i0Var = new i0(10);
            oVar = null;
        }
        return new n(lVar, pVarI2, sVarA, k1Var, z3, pVarI, sVar, z4, uri, list, i2, obj, j3, j4, eVar.f7295b, eVar.f7296c, !eVar.f7297d, i3, eVar2.f7444l, z, uVar.a(i3), eVar2.f7439g, oVar, hVar, i0Var, z2);
    }

    public static byte[] l(String str) {
        if (c.f.b.a.b.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean p(j.e eVar, c.f.a.b.e3.f1.x.g gVar) {
        g.e eVar2 = eVar.f7294a;
        return eVar2 instanceof g.b ? ((g.b) eVar2).f7427m || (eVar.f7296c == 0 && gVar.f7452c) : gVar.f7452c;
    }

    public static boolean w(n nVar, Uri uri, c.f.a.b.e3.f1.x.g gVar, j.e eVar, long j2) {
        if (nVar == null) {
            return false;
        }
        if (uri.equals(nVar.f7304n) && nVar.I) {
            return false;
        }
        return !p(eVar, gVar) || j2 + eVar.f7294a.f7438f < nVar.f7029h;
    }

    @Override // c.f.a.b.i3.g0.e
    public void a() throws InterruptedIOException {
        o oVar;
        c.f.a.b.j3.g.e(this.E);
        if (this.D == null && (oVar = this.s) != null && oVar.e()) {
            this.D = this.s;
            this.G = false;
        }
        s();
        if (this.H) {
            return;
        }
        if (!this.u) {
            r();
        }
        this.I = !this.H;
    }

    @Override // c.f.a.b.i3.g0.e
    public void c() {
        this.H = true;
    }

    @Override // c.f.a.b.e3.d1.n
    public boolean h() {
        return this.I;
    }

    @RequiresNonNull({"output"})
    public final void k(c.f.a.b.i3.p pVar, c.f.a.b.i3.s sVar, boolean z) {
        c.f.a.b.i3.s sVarE;
        long position;
        long j2;
        if (z) {
            z = this.F != 0;
            sVarE = sVar;
        } else {
            sVarE = sVar.e(this.F);
        }
        try {
            c.f.a.b.z2.g gVarU = u(pVar, sVarE);
            if (z) {
                gVarU.s(this.F);
            }
            while (!this.H && this.D.a(gVarU)) {
                try {
                    try {
                    } catch (EOFException e2) {
                        if ((this.f7025d.f9331f & 16384) == 0) {
                            throw e2;
                        }
                        this.D.b();
                        position = gVarU.getPosition();
                        j2 = sVar.f9067g;
                    }
                } catch (Throwable th) {
                    this.F = (int) (gVarU.getPosition() - sVar.f9067g);
                    throw th;
                }
            }
            position = gVarU.getPosition();
            j2 = sVar.f9067g;
            this.F = (int) (position - j2);
        } finally {
            x0.n(pVar);
        }
    }

    public int m(int i2) {
        c.f.a.b.j3.g.g(!this.f7305o);
        if (i2 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i2).intValue();
    }

    public void n(r rVar, c.f.b.b.t<Integer> tVar) {
        this.E = rVar;
        this.J = tVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    @RequiresNonNull({"output"})
    public final void r() throws InterruptedIOException {
        try {
            this.v.h(this.t, this.f7028g);
            k(this.f7030i, this.f7023b, this.B);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    public final void s() {
        if (this.G) {
            c.f.a.b.j3.g.e(this.q);
            c.f.a.b.j3.g.e(this.r);
            k(this.q, this.r, this.C);
            this.F = 0;
            this.G = false;
        }
    }

    public final long t(c.f.a.b.z2.k kVar) {
        kVar.r();
        try {
            this.A.L(10);
            kVar.u(this.A.d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.A.G() != 4801587) {
            return -9223372036854775807L;
        }
        this.A.Q(3);
        int iC = this.A.C();
        int i2 = iC + 10;
        if (i2 > this.A.b()) {
            byte[] bArrD = this.A.d();
            this.A.L(i2);
            System.arraycopy(bArrD, 0, this.A.d(), 0, 10);
        }
        kVar.u(this.A.d(), 10, iC);
        c.f.a.b.b3.a aVarD = this.z.d(this.A.d(), iC);
        if (aVarD == null) {
            return -9223372036854775807L;
        }
        int iE = aVarD.e();
        for (int i3 = 0; i3 < iE; i3++) {
            a.b bVarD = aVarD.d(i3);
            if (bVarD instanceof c.f.a.b.b3.m.l) {
                c.f.a.b.b3.m.l lVar = (c.f.a.b.b3.m.l) bVarD;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f6588c)) {
                    System.arraycopy(lVar.f6589d, 0, this.A.d(), 0, 8);
                    this.A.P(0);
                    this.A.O(8);
                    return this.A.w() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    public final c.f.a.b.z2.g u(c.f.a.b.i3.p pVar, c.f.a.b.i3.s sVar) {
        r rVar;
        long jB;
        c.f.a.b.z2.g gVar = new c.f.a.b.z2.g(pVar, sVar.f9067g, pVar.g(sVar));
        if (this.D == null) {
            long jT = t(gVar);
            gVar.r();
            o oVar = this.s;
            o oVarF = oVar != null ? oVar.f() : this.w.a(sVar.f9061a, this.f7025d, this.x, this.v, pVar.q(), gVar);
            this.D = oVarF;
            if (oVarF.d()) {
                rVar = this.E;
                jB = jT != -9223372036854775807L ? this.v.b(jT) : this.f7028g;
            } else {
                rVar = this.E;
                jB = 0;
            }
            rVar.o0(jB);
            this.E.a0();
            this.D.c(this.E);
        }
        this.E.l0(this.y);
        return gVar;
    }

    public void v() {
        this.L = true;
    }
}
