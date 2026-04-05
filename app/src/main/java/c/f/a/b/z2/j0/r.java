package c.f.a.b.z2.j0;

import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f11026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f11028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f11031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f11032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11033h;

    public r(o oVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        c.f.a.b.j3.g.a(iArr.length == jArr2.length);
        c.f.a.b.j3.g.a(jArr.length == jArr2.length);
        c.f.a.b.j3.g.a(iArr2.length == jArr2.length);
        this.f11026a = oVar;
        this.f11028c = jArr;
        this.f11029d = iArr;
        this.f11030e = i2;
        this.f11031f = jArr2;
        this.f11032g = iArr2;
        this.f11033h = j2;
        this.f11027b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j2) {
        for (int iH = x0.h(this.f11031f, j2, true, false); iH >= 0; iH--) {
            if ((this.f11032g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j2) {
        for (int iD = x0.d(this.f11031f, j2, true, false); iD < this.f11031f.length; iD++) {
            if ((this.f11032g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }
}
