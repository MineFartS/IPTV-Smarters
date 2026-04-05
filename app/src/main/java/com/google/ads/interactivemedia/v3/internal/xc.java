package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xc implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23678a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<aml> f23681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alx f23682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f23683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xf f23684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<xh> f23685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f23686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f23687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wz f23688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private wy f23689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private rm f23690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23692o;
    private boolean p;
    private boolean q;
    private xh r;
    private int s;
    private int t;

    static {
        vr vrVar = vr.f23377a;
    }

    public xc() {
        this(1, 112800);
    }

    public xc(int i2, int i3) {
        this(1, new aml(0L), new vw(null), 112800);
    }

    public xc(int i2, aml amlVar, xf xfVar, int i3) {
        this.f23684g = xfVar;
        this.f23680c = 112800;
        this.f23679b = i2;
        this.f23681d = Collections.singletonList(amlVar);
        this.f23682e = new alx(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f23686i = sparseBooleanArray;
        this.f23687j = new SparseBooleanArray();
        SparseArray<xh> sparseArray = new SparseArray<>();
        this.f23685h = sparseArray;
        this.f23683f = new SparseIntArray();
        this.f23688k = new wz(112800);
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray<xh> sparseArrayA = xfVar.a();
        int size = sparseArrayA.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f23685h.put(sparseArrayA.keyAt(i4), sparseArrayA.valueAt(i4));
        }
        this.f23685h.put(0, new wv(new xa(this)));
        this.r = null;
    }

    public static /* synthetic */ void r(xc xcVar) {
        xcVar.f23691n++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.rk r18, com.google.ads.interactivemedia.v3.internal.rz r19) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xc.a(com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.rz):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23690m = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        wy wyVar;
        ajr.f(this.f23679b != 2);
        int size = this.f23681d.size();
        for (int i2 = 0; i2 < size; i2++) {
            aml amlVar = this.f23681d.get(i2);
            if (amlVar.e() == -9223372036854775807L || (amlVar.e() != 0 && amlVar.c() != j3)) {
                amlVar.h(j3);
            }
        }
        if (j3 != 0 && (wyVar = this.f23689l) != null) {
            wyVar.c(j3);
        }
        this.f23682e.E(0);
        this.f23683f.clear();
        for (int i3 = 0; i3 < this.f23685h.size(); i3++) {
            this.f23685h.valueAt(i3).c();
        }
        this.s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.ads.interactivemedia.v3.internal.rk r7) {
        /*
            r6 = this;
            com.google.ads.interactivemedia.v3.internal.alx r0 = r6.f23682e
            byte[] r0 = r0.K()
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.g(r0, r1, r2)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.j(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xc.f(com.google.ads.interactivemedia.v3.internal.rk):boolean");
    }
}
