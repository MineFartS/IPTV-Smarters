package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class xk implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f23707a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f23708b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rm f23709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sf f23710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xo f23711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f23713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final alx f23714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ke f23716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23720n;

    public xk(rm rmVar, sf sfVar, xo xoVar) throws lb {
        this.f23709c = rmVar;
        this.f23710d = sfVar;
        this.f23711e = xoVar;
        int iMax = Math.max(1, xoVar.f23737c / 10);
        this.f23715i = iMax;
        alx alxVar = new alx(xoVar.f23740f);
        alxVar.i();
        int i2 = alxVar.i();
        this.f23712f = i2;
        int i3 = xoVar.f23736b;
        int i4 = (((xoVar.f23738d - (i3 * 4)) * 8) / (xoVar.f23739e * i3)) + 1;
        if (i2 != i4) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i2);
            throw new lb(sb.toString());
        }
        int iB = amn.b(iMax, i2);
        this.f23713g = new byte[xoVar.f23738d * iB];
        this.f23714h = new alx(iB * f(i2, i3));
        int i5 = ((xoVar.f23737c * xoVar.f23738d) * 8) / i2;
        kd kdVar = new kd();
        kdVar.ae("audio/raw");
        kdVar.G(i5);
        kdVar.Z(i5);
        kdVar.W(f(iMax, i3));
        kdVar.H(xoVar.f23736b);
        kdVar.af(xoVar.f23737c);
        kdVar.Y(2);
        this.f23716j = kdVar.s();
    }

    private final int d(int i2) {
        int i3 = this.f23711e.f23736b;
        return i2 / (i3 + i3);
    }

    private final int e(int i2) {
        return f(i2, this.f23711e.f23736b);
    }

    private static int f(int i2, int i3) {
        return (i2 + i2) * i3;
    }

    private final void g(int i2) {
        long j2 = this.f23718l;
        long jQ = amn.q(this.f23720n, 1000000L, this.f23711e.f23737c);
        int iE = e(i2);
        this.f23710d.d(j2 + jQ, 1, iE, this.f23719m - iE, null);
        this.f23720n += (long) i2;
        this.f23719m -= iE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xl
    public final void a(int i2, long j2) {
        this.f23709c.bb(new xr(this.f23711e, this.f23712f, i2, j2));
        this.f23710d.b(this.f23716j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xl
    public final void b(long j2) {
        this.f23717k = 0;
        this.f23718l = j2;
        this.f23719m = 0;
        this.f23720n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please report as a decompilation issue!!! */
    @Override // com.google.ads.interactivemedia.v3.internal.xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.ads.interactivemedia.v3.internal.rk r20, long r21) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xk.c(com.google.ads.interactivemedia.v3.internal.rk, long):boolean");
    }
}
