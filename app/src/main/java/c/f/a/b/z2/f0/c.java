package c.f.a.b.z2.f0;

import android.net.Uri;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f10732a = new o() { // from class: c.f.a.b.z2.f0.a
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return c.f();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f10738g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10746o;
    public b p;
    public f q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f10733b = new i0(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f10734c = new i0(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f10735d = new i0(11);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f10736e = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f10737f = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10739h = 1;

    public static /* synthetic */ j[] f() {
        return new j[]{new c()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f10739h = 1;
            this.f10740i = false;
        } else {
            this.f10739h = 3;
        }
        this.f10742k = 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void b() {
        if (this.f10746o) {
            return;
        }
        this.f10738g.i(new x.b(-9223372036854775807L));
        this.f10746o = true;
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f10738g = lVar;
    }

    public final long d() {
        if (this.f10740i) {
            return this.f10741j + this.f10745n;
        }
        if (this.f10737f.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f10745n;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        kVar.u(this.f10733b.d(), 0, 3);
        this.f10733b.P(0);
        if (this.f10733b.G() != 4607062) {
            return false;
        }
        kVar.u(this.f10733b.d(), 0, 2);
        this.f10733b.P(0);
        if ((this.f10733b.J() & 250) != 0) {
            return false;
        }
        kVar.u(this.f10733b.d(), 0, 4);
        this.f10733b.P(0);
        int iN = this.f10733b.n();
        kVar.r();
        kVar.m(iN);
        kVar.u(this.f10733b.d(), 0, 4);
        this.f10733b.P(0);
        return this.f10733b.n() == 0;
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) {
        g.i(this.f10738g);
        while (true) {
            int i2 = this.f10739h;
            if (i2 != 1) {
                if (i2 == 2) {
                    l(kVar);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    }
                    if (j(kVar)) {
                        return 0;
                    }
                } else if (!k(kVar)) {
                    return -1;
                }
            } else if (!i(kVar)) {
                return -1;
            }
        }
    }

    public final i0 h(k kVar) {
        if (this.f10744m > this.f10736e.b()) {
            i0 i0Var = this.f10736e;
            i0Var.N(new byte[Math.max(i0Var.b() * 2, this.f10744m)], 0);
        } else {
            this.f10736e.P(0);
        }
        this.f10736e.O(this.f10744m);
        kVar.l(this.f10736e.d(), 0, this.f10744m);
        return this.f10736e;
    }

    @RequiresNonNull({"extractorOutput"})
    public final boolean i(k kVar) {
        if (!kVar.d(this.f10734c.d(), 0, 9, true)) {
            return false;
        }
        this.f10734c.P(0);
        this.f10734c.Q(4);
        int iD = this.f10734c.D();
        boolean z = (iD & 4) != 0;
        boolean z2 = (iD & 1) != 0;
        if (z && this.p == null) {
            this.p = new b(this.f10738g.e(8, 1));
        }
        if (z2 && this.q == null) {
            this.q = new f(this.f10738g.e(9, 2));
        }
        this.f10738g.p();
        this.f10742k = (this.f10734c.n() - 9) + 4;
        this.f10739h = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(c.f.a.b.z2.k r10) {
        /*
            r9 = this;
            long r0 = r9.d()
            int r2 = r9.f10743l
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            c.f.a.b.z2.f0.b r7 = r9.p
            if (r7 == 0) goto L24
            r9.b()
            c.f.a.b.z2.f0.b r2 = r9.p
        L1a:
            c.f.a.b.j3.i0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = 1
            goto L6d
        L24:
            r7 = 9
            if (r2 != r7) goto L32
            c.f.a.b.z2.f0.f r7 = r9.q
            if (r7 == 0) goto L32
            r9.b()
            c.f.a.b.z2.f0.f r2 = r9.q
            goto L1a
        L32:
            r7 = 18
            if (r2 != r7) goto L67
            boolean r2 = r9.f10746o
            if (r2 != 0) goto L67
            c.f.a.b.z2.f0.d r2 = r9.f10737f
            c.f.a.b.j3.i0 r10 = r9.h(r10)
            boolean r5 = r2.a(r10, r0)
            c.f.a.b.z2.f0.d r10 = r9.f10737f
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            c.f.a.b.z2.l r10 = r9.f10738g
            c.f.a.b.z2.v r2 = new c.f.a.b.z2.v
            c.f.a.b.z2.f0.d r7 = r9.f10737f
            long[] r7 = r7.e()
            c.f.a.b.z2.f0.d r8 = r9.f10737f
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.i(r2)
            r9.f10746o = r6
            goto L22
        L67:
            int r0 = r9.f10744m
            r10.s(r0)
            r10 = 0
        L6d:
            boolean r0 = r9.f10740i
            if (r0 != 0) goto L87
            if (r5 == 0) goto L87
            r9.f10740i = r6
            c.f.a.b.z2.f0.d r0 = r9.f10737f
            long r0 = r0.d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L83
            long r0 = r9.f10745n
            long r0 = -r0
            goto L85
        L83:
            r0 = 0
        L85:
            r9.f10741j = r0
        L87:
            r0 = 4
            r9.f10742k = r0
            r0 = 2
            r9.f10739h = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.f0.c.j(c.f.a.b.z2.k):boolean");
    }

    public final boolean k(k kVar) {
        if (!kVar.d(this.f10735d.d(), 0, 11, true)) {
            return false;
        }
        this.f10735d.P(0);
        this.f10743l = this.f10735d.D();
        this.f10744m = this.f10735d.G();
        this.f10745n = this.f10735d.G();
        this.f10745n = (((long) (this.f10735d.D() << 24)) | this.f10745n) * 1000;
        this.f10735d.Q(3);
        this.f10739h = 4;
        return true;
    }

    public final void l(k kVar) {
        kVar.s(this.f10742k);
        this.f10742k = 0;
        this.f10739h = 3;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
