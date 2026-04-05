package c.f.a.b.z2.m0;

import android.net.Uri;
import c.f.a.b.w1;
import c.f.a.b.z2.m0.i0;
import c.f.a.b.z2.x;
import java.io.EOFException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.z2.o f11227a = new c.f.a.b.z2.o() { // from class: c.f.a.b.z2.m0.c
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return j.h();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return c.f.a.b.z2.n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f11229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.b.j3.h0 f11232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.z2.l f11233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11239m;

    public j() {
        this(0);
    }

    public j(int i2) {
        this.f11228b = i2;
        this.f11229c = new k(true);
        this.f11230d = new c.f.a.b.j3.i0(2048);
        this.f11236j = -1;
        this.f11235i = -1L;
        c.f.a.b.j3.i0 i0Var = new c.f.a.b.j3.i0(10);
        this.f11231e = i0Var;
        this.f11232f = new c.f.a.b.j3.h0(i0Var.d());
    }

    public static int d(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    public static /* synthetic */ c.f.a.b.z2.j[] h() {
        return new c.f.a.b.z2.j[]{new j()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        this.f11238l = false;
        this.f11229c.c();
        this.f11234h = j3;
    }

    public final void b(c.f.a.b.z2.k kVar) throws w1 {
        int iH;
        if (this.f11237k) {
            return;
        }
        this.f11236j = -1;
        kVar.r();
        long j2 = 0;
        if (kVar.getPosition() == 0) {
            j(kVar);
        }
        int i2 = 0;
        int i3 = 0;
        do {
            try {
                if (!kVar.i(this.f11231e.d(), 0, 2, true)) {
                    break;
                }
                this.f11231e.P(0);
                if (!k.m(this.f11231e.J())) {
                    break;
                }
                if (!kVar.i(this.f11231e.d(), 0, 4, true)) {
                    break;
                }
                this.f11232f.p(14);
                iH = this.f11232f.h(13);
                if (iH <= 6) {
                    this.f11237k = true;
                    throw w1.a("Malformed ADTS stream", null);
                }
                j2 += (long) iH;
                i3++;
                if (i3 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (kVar.t(iH - 6, true));
        i2 = i3;
        kVar.r();
        if (i2 > 0) {
            this.f11236j = (int) (j2 / ((long) i2));
        } else {
            this.f11236j = -1;
        }
        this.f11237k = true;
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.f11233g = lVar;
        this.f11229c.e(lVar, new i0.d(0, 1));
        lVar.p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        r9.r();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if ((r3 - r0) < 8192) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        return false;
     */
    @Override // c.f.a.b.z2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(c.f.a.b.z2.k r9) {
        /*
            r8 = this;
            int r0 = r8.j(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = 0
            r4 = 0
        L8:
            c.f.a.b.j3.i0 r5 = r8.f11231e
            byte[] r5 = r5.d()
            r6 = 2
            r9.u(r5, r1, r6)
            c.f.a.b.j3.i0 r5 = r8.f11231e
            r5.P(r1)
            c.f.a.b.j3.i0 r5 = r8.f11231e
            int r5 = r5.J()
            boolean r5 = c.f.a.b.z2.m0.k.m(r5)
            if (r5 != 0) goto L33
            r9.r()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.148E-41)
            if (r2 < r4) goto L2f
            return r1
        L2f:
            r9.m(r3)
            goto L6
        L33:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3d
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3d
            return r5
        L3d:
            c.f.a.b.j3.i0 r5 = r8.f11231e
            byte[] r5 = r5.d()
            r9.u(r5, r1, r6)
            c.f.a.b.j3.h0 r5 = r8.f11232f
            r6 = 14
            r5.p(r6)
            c.f.a.b.j3.h0 r5 = r8.f11232f
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L59
            return r1
        L59:
            int r6 = r5 + (-6)
            r9.m(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.j.e(c.f.a.b.z2.k):boolean");
    }

    public final c.f.a.b.z2.x f(long j2) {
        return new c.f.a.b.z2.f(j2, this.f11235i, d(this.f11236j, this.f11229c.k()), this.f11236j);
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) throws w1 {
        c.f.a.b.j3.g.i(this.f11233g);
        long length = kVar.getLength();
        boolean z = ((this.f11228b & 1) == 0 || length == -1) ? false : true;
        if (z) {
            b(kVar);
        }
        int iB = kVar.b(this.f11230d.d(), 0, 2048);
        boolean z2 = iB == -1;
        i(length, z, z2);
        if (z2) {
            return -1;
        }
        this.f11230d.P(0);
        this.f11230d.O(iB);
        if (!this.f11238l) {
            this.f11229c.f(this.f11234h, 4);
            this.f11238l = true;
        }
        this.f11229c.b(this.f11230d);
        return 0;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void i(long j2, boolean z, boolean z2) {
        if (this.f11239m) {
            return;
        }
        boolean z3 = z && this.f11236j > 0;
        if (z3 && this.f11229c.k() == -9223372036854775807L && !z2) {
            return;
        }
        if (!z3 || this.f11229c.k() == -9223372036854775807L) {
            this.f11233g.i(new x.b(-9223372036854775807L));
        } else {
            this.f11233g.i(f(j2));
        }
        this.f11239m = true;
    }

    public final int j(c.f.a.b.z2.k kVar) {
        int i2 = 0;
        while (true) {
            kVar.u(this.f11231e.d(), 0, 10);
            this.f11231e.P(0);
            if (this.f11231e.G() != 4801587) {
                break;
            }
            this.f11231e.Q(3);
            int iC = this.f11231e.C();
            i2 += iC + 10;
            kVar.m(iC);
        }
        kVar.r();
        kVar.m(i2);
        if (this.f11235i == -1) {
            this.f11235i = i2;
        }
        return i2;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
