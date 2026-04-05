package c.f.a.b.z2.i0;

import android.net.Uri;
import c.f.a.b.b3.a;
import c.f.a.b.b3.m.h;
import c.f.a.b.b3.m.k;
import c.f.a.b.b3.m.m;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.h0;
import c.f.a.b.w0;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.i0.g;
import c.f.a.b.z2.j;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.t;
import c.f.a.b.z2.u;
import c.f.a.b.z2.w;
import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f10865a = new o() { // from class: c.f.a.b.z2.i0.a
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return f.m();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h.a f10866b = new h.a() { // from class: c.f.a.b.z2.i0.b
        @Override // c.f.a.b.b3.m.h.a
        public final boolean a(int i2, int i3, int i4, int i5, int i6) {
            return f.n(i2, i3, i4, i5, i6);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f10869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.a f10870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f10871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f10872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f10873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f10874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f10875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0 f10876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.f.a.b.b3.a f10878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10879o;
    public long p;
    public long q;
    public int r;
    public g s;
    public boolean t;
    public boolean u;
    public long v;

    public f() {
        this(0);
    }

    public f(int i2) {
        this(i2, -9223372036854775807L);
    }

    public f(int i2, long j2) {
        this.f10867c = i2;
        this.f10868d = j2;
        this.f10869e = new i0(10);
        this.f10870f = new h0.a();
        this.f10871g = new t();
        this.f10879o = -9223372036854775807L;
        this.f10872h = new u();
        c.f.a.b.z2.i iVar = new c.f.a.b.z2.i();
        this.f10873i = iVar;
        this.f10876l = iVar;
    }

    public static long j(c.f.a.b.b3.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int iE = aVar.e();
        for (int i2 = 0; i2 < iE; i2++) {
            a.b bVarD = aVar.d(i2);
            if (bVarD instanceof m) {
                m mVar = (m) bVarD;
                if (mVar.f6579b.equals("TLEN")) {
                    return w0.d(Long.parseLong(mVar.f6591d));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int k(i0 i0Var, int i2) {
        if (i0Var.f() >= i2 + 4) {
            i0Var.P(i2);
            int iN = i0Var.n();
            if (iN == 1483304551 || iN == 1231971951) {
                return iN;
            }
        }
        if (i0Var.f() < 40) {
            return 0;
        }
        i0Var.P(36);
        return i0Var.n() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean l(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    public static /* synthetic */ j[] m() {
        return new j[]{new f()};
    }

    public static /* synthetic */ boolean n(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    public static e o(c.f.a.b.b3.a aVar, long j2) {
        if (aVar == null) {
            return null;
        }
        int iE = aVar.e();
        for (int i2 = 0; i2 < iE; i2++) {
            a.b bVarD = aVar.d(i2);
            if (bVarD instanceof k) {
                return e.a(j2, (k) bVarD, j(aVar));
            }
        }
        return null;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        this.f10877m = 0;
        this.f10879o = -9223372036854775807L;
        this.p = 0L;
        this.r = 0;
        this.v = j3;
        g gVar = this.s;
        if (!(gVar instanceof d) || ((d) gVar).a(j3)) {
            return;
        }
        this.u = true;
        this.f10876l = this.f10873i;
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    public final void b() {
        c.f.a.b.j3.g.i(this.f10875k);
        x0.i(this.f10874j);
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f10874j = lVar;
        a0 a0VarE = lVar.e(0, 1);
        this.f10875k = a0VarE;
        this.f10876l = a0VarE;
        this.f10874j.p();
    }

    public final g d(c.f.a.b.z2.k kVar) {
        long j2;
        long j3;
        long jI;
        long jD;
        g gVarP = p(kVar);
        e eVarO = o(this.f10878n, kVar.getPosition());
        if (this.t) {
            return new g.a();
        }
        if ((this.f10867c & 2) != 0) {
            if (eVarO != null) {
                jI = eVarO.i();
                jD = eVarO.d();
            } else if (gVarP != null) {
                jI = gVarP.i();
                jD = gVarP.d();
            } else {
                j2 = j(this.f10878n);
                j3 = -1;
                gVarP = new d(j2, kVar.getPosition(), j3);
            }
            j3 = jD;
            j2 = jI;
            gVarP = new d(j2, kVar.getPosition(), j3);
        } else if (eVarO != null) {
            gVarP = eVarO;
        } else if (gVarP == null) {
            gVarP = null;
        }
        return (gVarP == null || !(gVarP.f() || (this.f10867c & 1) == 0)) ? i(kVar) : gVarP;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        return t(kVar, true);
    }

    public final long f(long j2) {
        return this.f10879o + ((j2 * 1000000) / ((long) this.f10870f.f10075d));
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, w wVar) throws w1 {
        b();
        int iR = r(kVar);
        if (iR == -1 && (this.s instanceof d)) {
            long jF = f(this.p);
            if (this.s.i() != jF) {
                ((d) this.s).e(jF);
                this.f10874j.i(this.s);
            }
        }
        return iR;
    }

    public void h() {
        this.t = true;
    }

    public final g i(c.f.a.b.z2.k kVar) {
        kVar.u(this.f10869e.d(), 0, 4);
        this.f10869e.P(0);
        this.f10870f.a(this.f10869e.n());
        return new c(kVar.getLength(), kVar.getPosition(), this.f10870f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.b.z2.i0.g p(c.f.a.b.z2.k r11) {
        /*
            r10 = this;
            c.f.a.b.j3.i0 r5 = new c.f.a.b.j3.i0
            c.f.a.b.t2.h0$a r0 = r10.f10870f
            int r0 = r0.f10074c
            r5.<init>(r0)
            byte[] r0 = r5.d()
            c.f.a.b.t2.h0$a r1 = r10.f10870f
            int r1 = r1.f10074c
            r6 = 0
            r11.u(r0, r6, r1)
            c.f.a.b.t2.h0$a r0 = r10.f10870f
            int r1 = r0.f10072a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.f10076e
            if (r1 == 0) goto L28
            if (r0 == r2) goto L2a
            r3 = 36
            r7 = 36
            goto L31
        L28:
            if (r0 == r2) goto L2d
        L2a:
            r7 = 21
            goto L31
        L2d:
            r3 = 13
            r7 = 13
        L31:
            int r8 = k(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L60
            if (r8 != r9) goto L40
            goto L60
        L40:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L5b
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            c.f.a.b.t2.h0$a r4 = r10.f10870f
            c.f.a.b.z2.i0.h r0 = c.f.a.b.z2.i0.h.a(r0, r2, r4, r5)
            c.f.a.b.t2.h0$a r1 = r10.f10870f
            int r1 = r1.f10074c
            r11.s(r1)
            goto Lb0
        L5b:
            r0 = 0
            r11.r()
            goto Lb0
        L60:
            long r0 = r11.getLength()
            long r2 = r11.getPosition()
            c.f.a.b.t2.h0$a r4 = r10.f10870f
            c.f.a.b.z2.i0.i r0 = c.f.a.b.z2.i0.i.a(r0, r2, r4, r5)
            if (r0 == 0) goto L9a
            c.f.a.b.z2.t r1 = r10.f10871g
            boolean r1 = r1.a()
            if (r1 != 0) goto L9a
            r11.r()
            int r7 = r7 + 141
            r11.m(r7)
            c.f.a.b.j3.i0 r1 = r10.f10869e
            byte[] r1 = r1.d()
            r2 = 3
            r11.u(r1, r6, r2)
            c.f.a.b.j3.i0 r1 = r10.f10869e
            r1.P(r6)
            c.f.a.b.z2.t r1 = r10.f10871g
            c.f.a.b.j3.i0 r2 = r10.f10869e
            int r2 = r2.G()
            r1.d(r2)
        L9a:
            c.f.a.b.t2.h0$a r1 = r10.f10870f
            int r1 = r1.f10074c
            r11.s(r1)
            if (r0 == 0) goto Lb0
            boolean r1 = r0.f()
            if (r1 != 0) goto Lb0
            if (r8 != r9) goto Lb0
            c.f.a.b.z2.i0.g r11 = r10.i(r11)
            return r11
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.i0.f.p(c.f.a.b.z2.k):c.f.a.b.z2.i0.g");
    }

    public final boolean q(c.f.a.b.z2.k kVar) {
        g gVar = this.s;
        if (gVar != null) {
            long jD = gVar.d();
            if (jD != -1 && kVar.j() > jD - 4) {
                return true;
            }
        }
        try {
            return !kVar.i(this.f10869e.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    public final int r(c.f.a.b.z2.k kVar) throws w1 {
        if (this.f10877m == 0) {
            try {
                t(kVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.s == null) {
            g gVarD = d(kVar);
            this.s = gVarD;
            this.f10874j.i(gVarD);
            this.f10876l.e(new k1.b().e0(this.f10870f.f10073b).W(ProgressEvent.PART_FAILED_EVENT_CODE).H(this.f10870f.f10076e).f0(this.f10870f.f10075d).M(this.f10871g.f11499b).N(this.f10871g.f11500c).X((this.f10867c & 4) != 0 ? null : this.f10878n).E());
            this.q = kVar.getPosition();
        } else if (this.q != 0) {
            long position = kVar.getPosition();
            long j2 = this.q;
            if (position < j2) {
                kVar.s((int) (j2 - position));
            }
        }
        return s(kVar);
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    public final int s(c.f.a.b.z2.k kVar) {
        if (this.r == 0) {
            kVar.r();
            if (q(kVar)) {
                return -1;
            }
            this.f10869e.P(0);
            int iN = this.f10869e.n();
            if (!l(iN, this.f10877m) || h0.j(iN) == -1) {
                kVar.s(1);
                this.f10877m = 0;
                return 0;
            }
            this.f10870f.a(iN);
            if (this.f10879o == -9223372036854775807L) {
                this.f10879o = this.s.b(kVar.getPosition());
                if (this.f10868d != -9223372036854775807L) {
                    this.f10879o += this.f10868d - this.s.b(0L);
                }
            }
            h0.a aVar = this.f10870f;
            this.r = aVar.f10074c;
            g gVar = this.s;
            if (gVar instanceof d) {
                d dVar = (d) gVar;
                dVar.c(f(this.p + ((long) aVar.f10078g)), kVar.getPosition() + ((long) this.f10870f.f10074c));
                if (this.u && dVar.a(this.v)) {
                    this.u = false;
                    this.f10876l = this.f10875k;
                }
            }
        }
        int iB = this.f10876l.b(kVar, this.r, true);
        if (iB == -1) {
            return -1;
        }
        int i2 = this.r - iB;
        this.r = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f10876l.d(f(this.p), 1, this.f10870f.f10074c, 0, null);
        this.p += (long) this.f10870f.f10078g;
        this.r = 0;
        return 0;
    }

    public final boolean t(c.f.a.b.z2.k kVar, boolean z) throws w1, EOFException {
        int i2;
        int iJ;
        int iJ2;
        int i3 = z ? 32768 : 131072;
        kVar.r();
        if (kVar.getPosition() == 0) {
            c.f.a.b.b3.a aVarA = this.f10872h.a(kVar, (this.f10867c & 4) == 0 ? null : f10866b);
            this.f10878n = aVarA;
            if (aVarA != null) {
                this.f10871g.c(aVarA);
            }
            iJ = (int) kVar.j();
            if (!z) {
                kVar.s(iJ);
            }
            i2 = 0;
        } else {
            i2 = 0;
            iJ = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!q(kVar)) {
                this.f10869e.P(0);
                int iN = this.f10869e.n();
                if ((i2 == 0 || l(iN, i2)) && (iJ2 = h0.j(iN)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f10870f.a(iN);
                        i2 = iN;
                    }
                    kVar.m(iJ2 - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw w1.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        kVar.r();
                        kVar.m(iJ + i6);
                    } else {
                        kVar.s(1);
                    }
                    i5 = i6;
                    i2 = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            kVar.s(iJ + i5);
        } else {
            kVar.r();
        }
        this.f10877m = i2;
        return true;
    }
}
