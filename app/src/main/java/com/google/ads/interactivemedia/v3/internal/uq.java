package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uq implements rj, sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23225a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final alx f23228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alx f23229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<tx> f23230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<yr> f23231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private alx f23236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23239o;
    private int p;
    private rm q;
    private up[] r;
    private long[][] s;
    private int t;
    private long u;
    private int v;

    static {
        un unVar = un.f23216a;
    }

    public uq() {
        this(null);
    }

    public uq(byte[] bArr) {
        this.f23232h = 0;
        new ut();
        this.f23231g = new ArrayList();
        this.f23229e = new alx(16);
        this.f23230f = new ArrayDeque<>();
        this.f23226b = new alx(alr.f20069a);
        this.f23227c = new alx(4);
        this.f23228d = new alx();
        this.f23237m = -1;
    }

    private static int i(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int j(uy uyVar, long j2) {
        int iA = uyVar.a(j2);
        return iA == -1 ? uyVar.b(j2) : iA;
    }

    private static long k(uy uyVar, long j2, long j3) {
        int iJ = j(uyVar, j2);
        return iJ == -1 ? j3 : Math.min(uyVar.f23277c[iJ], j3);
    }

    private final void l() {
        this.f23232h = 0;
        this.f23235k = 0;
    }

    private final void m(long j2) {
        ys ysVar;
        ys ysVar2;
        long j3;
        List<uy> list;
        int i2;
        rw rwVar;
        int i3;
        while (!this.f23230f.isEmpty() && this.f23230f.peek().f23133a == j2) {
            tx txVarPop = this.f23230f.pop();
            if (txVarPop.f23137d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = this.v == 1;
                rw rwVar2 = new rw();
                ty tyVarB = txVarPop.b(1969517665);
                if (tyVarB != null) {
                    Pair<ys, ys> pairA = ug.a(tyVarB);
                    ys ysVar3 = (ys) pairA.first;
                    ys ysVar4 = (ys) pairA.second;
                    if (ysVar3 != null) {
                        rwVar2.b(ysVar3);
                    }
                    ysVar = ysVar4;
                    ysVar2 = ysVar3;
                } else {
                    ysVar = null;
                    ysVar2 = null;
                }
                tx txVarA = txVarPop.a(1835365473);
                ys ysVarB = txVarA != null ? ug.b(txVarA) : null;
                List<uy> listD = ug.d(txVarPop, rwVar2, -9223372036854775807L, null, z, uo.f23219a);
                rm rmVar = this.q;
                ajr.b(rmVar);
                int size = listD.size();
                int size2 = -1;
                int i4 = 0;
                long j4 = -9223372036854775807L;
                while (true) {
                    j3 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    uy uyVar = listD.get(i4);
                    if (uyVar.f23276b == 0) {
                        list = listD;
                        i2 = size;
                        rwVar = rwVar2;
                    } else {
                        uv uvVar = uyVar.f23275a;
                        int i5 = size2;
                        long j5 = uvVar.f23248e;
                        if (j5 == -9223372036854775807L) {
                            j5 = uyVar.f23282h;
                        }
                        long jMax = Math.max(j4, j5);
                        list = listD;
                        i2 = size;
                        up upVar = new up(uvVar, uyVar, rmVar.aZ(i4, uvVar.f23245b));
                        int i6 = uyVar.f23279e;
                        kd kdVarB = uvVar.f23249f.b();
                        kdVarB.W(i6 + 30);
                        if (uvVar.f23245b == 2 && j5 > 0 && (i3 = uyVar.f23276b) > 1) {
                            kdVarB.P(i3 / (j5 / 1000000.0f));
                        }
                        int i7 = uvVar.f23245b;
                        int i8 = um.f23215b;
                        if (i7 == 1 && rwVar2.a()) {
                            kdVarB.M(rwVar2.f22922a);
                            kdVarB.N(rwVar2.f22923b);
                        }
                        int i9 = uvVar.f23245b;
                        ys[] ysVarArr = new ys[2];
                        ysVarArr[0] = ysVar;
                        ysVarArr[1] = this.f23231g.isEmpty() ? null : new ys(this.f23231g);
                        rwVar = rwVar2;
                        ys ysVar5 = new ys(new yr[0]);
                        if (i9 == 1) {
                            if (ysVar2 != null) {
                                ysVar5 = ysVar2;
                            }
                        } else if (i9 == 2 && ysVarB != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= ysVarB.a()) {
                                    break;
                                }
                                yr yrVarB = ysVarB.b(i10);
                                if (yrVarB instanceof zu) {
                                    zu zuVar = (zu) yrVarB;
                                    if ("com.android.capture.fps".equals(zuVar.f23885a)) {
                                        ysVar5 = new ys(zuVar);
                                        break;
                                    }
                                }
                                i10++;
                            }
                        }
                        for (int i11 = 0; i11 < 2; i11++) {
                            ysVar5 = ysVar5.d(ysVarArr[i11]);
                        }
                        if (ysVar5.a() > 0) {
                            kdVarB.X(ysVar5);
                        }
                        upVar.f23223c.b(kdVarB.s());
                        size2 = i5;
                        if (uvVar.f23245b == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(upVar);
                        j4 = jMax;
                    }
                    i4++;
                    listD = list;
                    size = i2;
                    rwVar2 = rwVar;
                }
                this.t = size2;
                this.u = j4;
                up[] upVarArr = (up[]) arrayList.toArray(new up[0]);
                this.r = upVarArr;
                int length = upVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < upVarArr.length; i12++) {
                    jArr[i12] = new long[upVarArr[i12].f23222b.f23276b];
                    jArr2[i12] = upVarArr[i12].f23222b.f23280f[0];
                }
                int i13 = 0;
                while (i13 < upVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < upVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j7 = jArr2[i15];
                            if (j7 <= j6) {
                                i14 = i15;
                                j6 = j7;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j3;
                    uy uyVar2 = upVarArr[i14].f23222b;
                    j3 += (long) uyVar2.f23278d[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = uyVar2.f23280f[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.s = jArr;
                rmVar.ba();
                rmVar.bb(this);
                this.f23230f.clear();
                this.f23232h = 2;
            } else if (!this.f23230f.isEmpty()) {
                this.f23230f.peek().c(txVarPop);
            }
        }
        if (this.f23232h != 2) {
            l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.rk r33, com.google.ads.interactivemedia.v3.internal.rz r34) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.uq.a(com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.rz):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.q = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.f23230f.clear();
        this.f23235k = 0;
        this.f23237m = -1;
        this.f23238n = 0;
        this.f23239o = 0;
        this.p = 0;
        if (j2 == 0) {
            l();
            return;
        }
        up[] upVarArr = this.r;
        if (upVarArr != null) {
            for (up upVar : upVarArr) {
                uy uyVar = upVar.f23222b;
                int iA = uyVar.a(j3);
                if (iA == -1) {
                    iA = uyVar.b(j3);
                }
                upVar.f23224d = iA;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.u;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        return uu.b(rkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        long j3;
        long jK;
        long j4;
        long j5;
        int iB;
        if (((up[]) ajr.b(this.r)).length == 0) {
            sd sdVar = sd.f22934a;
            return new sa(sdVar, sdVar);
        }
        int i2 = this.t;
        if (i2 != -1) {
            uy uyVar = this.r[i2].f23222b;
            int iJ = j(uyVar, j2);
            if (iJ == -1) {
                sd sdVar2 = sd.f22934a;
                return new sa(sdVar2, sdVar2);
            }
            long j6 = uyVar.f23280f[iJ];
            j3 = uyVar.f23277c[iJ];
            if (j6 >= j2 || iJ >= uyVar.f23276b - 1 || (iB = uyVar.b(j2)) == -1 || iB == iJ) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = uyVar.f23280f[iB];
                j5 = uyVar.f23277c[iB];
            }
            jK = j5;
            j2 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            jK = -1;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            up[] upVarArr = this.r;
            if (i3 >= upVarArr.length) {
                break;
            }
            if (i3 != this.t) {
                uy uyVar2 = upVarArr[i3].f23222b;
                long jK2 = k(uyVar2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    jK = k(uyVar2, j4, jK);
                }
                j3 = jK2;
            }
            i3++;
        }
        sd sdVar3 = new sd(j2, j3);
        return j4 == -9223372036854775807L ? new sa(sdVar3, sdVar3) : new sa(sdVar3, new sd(j4, jK));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }
}
