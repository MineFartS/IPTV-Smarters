package c.f.a.b.z2.m0;

import android.net.Uri;
import c.f.a.b.z2.m0.i0;
import c.f.a.b.z2.x;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.z2.o f11147a = new c.f.a.b.z2.o() { // from class: c.f.a.b.z2.m0.a
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return f.b();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return c.f.a.b.z2.n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f11148b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11149c = new c.f.a.b.j3.i0(2786);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11150d;

    public static /* synthetic */ c.f.a.b.z2.j[] b() {
        return new c.f.a.b.z2.j[]{new f()};
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        this.f11150d = false;
        this.f11148b.c();
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.f11148b.e(lVar, new i0.d(0, 1));
        lVar.p();
        lVar.i(new x.b(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r8.r();
        r4 = r4 + 1;
     */
    @Override // c.f.a.b.z2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(c.f.a.b.z2.k r8) {
        /*
            r7 = this;
            c.f.a.b.j3.i0 r0 = new c.f.a.b.j3.i0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.d()
            r8.u(r4, r2, r1)
            r0.P(r2)
            int r4 = r0.G()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.r()
            r8.m(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.d()
            r6 = 6
            r8.u(r5, r2, r6)
            r0.P(r2)
            int r5 = r0.J()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.r()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.m(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.d()
            int r5 = c.f.a.b.t2.n.f(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.m(r5)
            goto L24
        L5f:
            r4 = 3
            r0.Q(r4)
            int r4 = r0.C()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.m(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.f.e(c.f.a.b.z2.k):boolean");
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) {
        int iB = kVar.b(this.f11149c.d(), 0, 2786);
        if (iB == -1) {
            return -1;
        }
        this.f11149c.P(0);
        this.f11149c.O(iB);
        if (!this.f11150d) {
            this.f11148b.f(0L, 4);
            this.f11150d = true;
        }
        this.f11148b.b(this.f11149c);
        return 0;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
