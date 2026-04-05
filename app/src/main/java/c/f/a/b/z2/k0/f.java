package c.f.a.b.z2.k0;

import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import c.f.a.b.z2.k;
import c.f.a.b.z2.m;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f11072j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f11073k = new i0(255);

    public boolean a(k kVar, boolean z) throws w1 {
        b();
        this.f11073k.L(27);
        if (!m.b(kVar, this.f11073k.d(), 0, 27, z) || this.f11073k.F() != 1332176723) {
            return false;
        }
        int iD = this.f11073k.D();
        this.f11063a = iD;
        if (iD != 0) {
            if (z) {
                return false;
            }
            throw w1.e("unsupported bit stream revision");
        }
        this.f11064b = this.f11073k.D();
        this.f11065c = this.f11073k.r();
        this.f11066d = this.f11073k.t();
        this.f11067e = this.f11073k.t();
        this.f11068f = this.f11073k.t();
        int iD2 = this.f11073k.D();
        this.f11069g = iD2;
        this.f11070h = iD2 + 27;
        this.f11073k.L(iD2);
        if (!m.b(kVar, this.f11073k.d(), 0, this.f11069g, z)) {
            return false;
        }
        for (int i2 = 0; i2 < this.f11069g; i2++) {
            this.f11072j[i2] = this.f11073k.D();
            this.f11071i += this.f11072j[i2];
        }
        return true;
    }

    public void b() {
        this.f11063a = 0;
        this.f11064b = 0;
        this.f11065c = 0L;
        this.f11066d = 0L;
        this.f11067e = 0L;
        this.f11068f = 0L;
        this.f11069g = 0;
        this.f11070h = 0;
        this.f11071i = 0;
    }

    public boolean c(k kVar) {
        return d(kVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r12 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r11.getPosition() >= r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r11.n(1) == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(c.f.a.b.z2.k r11, long r12) {
        /*
            r10 = this;
            long r0 = r11.getPosition()
            long r2 = r11.j()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            c.f.a.b.j3.g.a(r0)
            c.f.a.b.j3.i0 r0 = r10.f11073k
            r1 = 4
            r0.L(r1)
        L1a:
            r2 = -1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r6 = r11.getPosition()
            r8 = 4
            long r6 = r6 + r8
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 >= 0) goto L51
        L2b:
            c.f.a.b.j3.i0 r0 = r10.f11073k
            byte[] r0 = r0.d()
            boolean r0 = c.f.a.b.z2.m.b(r11, r0, r4, r1, r5)
            if (r0 == 0) goto L51
            c.f.a.b.j3.i0 r0 = r10.f11073k
            r0.P(r4)
            c.f.a.b.j3.i0 r0 = r10.f11073k
            long r2 = r0.F()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r11.r()
            return r5
        L4d:
            r11.s(r5)
            goto L1a
        L51:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L5d
            long r0 = r11.getPosition()
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 >= 0) goto L65
        L5d:
            int r0 = r11.n(r5)
            r1 = -1
            if (r0 == r1) goto L65
            goto L51
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.k0.f.d(c.f.a.b.z2.k, long):boolean");
    }
}
