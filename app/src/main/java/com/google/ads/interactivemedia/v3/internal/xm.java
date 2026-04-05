package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class xm implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm f23721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf f23722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xo f23723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ke f23724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23728h;

    public xm(rm rmVar, sf sfVar, xo xoVar, String str, int i2) throws lb {
        this.f23721a = rmVar;
        this.f23722b = sfVar;
        this.f23723c = xoVar;
        int i3 = (xoVar.f23736b * xoVar.f23739e) / 8;
        int i4 = xoVar.f23738d;
        if (i4 != i3) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i3);
            sb.append("; got: ");
            sb.append(i4);
            throw new lb(sb.toString());
        }
        int i5 = xoVar.f23737c * i3;
        int i6 = i5 * 8;
        int iMax = Math.max(i3, i5 / 10);
        this.f23725e = iMax;
        kd kdVar = new kd();
        kdVar.ae(str);
        kdVar.G(i6);
        kdVar.Z(i6);
        kdVar.W(iMax);
        kdVar.H(xoVar.f23736b);
        kdVar.af(xoVar.f23737c);
        kdVar.Y(i2);
        this.f23724d = kdVar.s();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xl
    public final void a(int i2, long j2) {
        this.f23721a.bb(new xr(this.f23723c, 1, i2, j2));
        this.f23722b.b(this.f23724d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xl
    public final void b(long j2) {
        this.f23726f = j2;
        this.f23727g = 0;
        this.f23728h = 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xl
    public final boolean c(rk rkVar, long j2) {
        long j3;
        int i2;
        int i3;
        long j4 = j2;
        while (j4 > 0 && (i2 = this.f23727g) < (i3 = this.f23725e)) {
            int iA = this.f23722b.a(rkVar, (int) Math.min(i3 - i2, j4), true);
            if (iA == -1) {
                j4 = 0;
            } else {
                this.f23727g += iA;
                j4 -= (long) iA;
            }
        }
        int i4 = this.f23723c.f23738d;
        int i5 = this.f23727g / i4;
        if (i5 > 0) {
            long j5 = this.f23726f;
            long jQ = amn.q(this.f23728h, 1000000L, r6.f23737c);
            int i6 = i5 * i4;
            int i7 = this.f23727g - i6;
            this.f23722b.d(j5 + jQ, 1, i6, i7, null);
            this.f23728h += (long) i5;
            this.f23727g = i7;
            j3 = 0;
        } else {
            j3 = 0;
        }
        return j4 <= j3;
    }
}
