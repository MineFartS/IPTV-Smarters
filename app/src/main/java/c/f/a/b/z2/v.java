package c.f.a.b.z2;

import c.f.a.b.j3.x0;
import c.f.a.b.z2.x;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f11502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f11503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11505d;

    public v(long[] jArr, long[] jArr2, long j2) {
        c.f.a.b.j3.g.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f11505d = z;
        if (!z || jArr2[0] <= 0) {
            this.f11502a = jArr;
            this.f11503b = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f11502a = jArr3;
            long[] jArr4 = new long[i2];
            this.f11503b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f11504c = j2;
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return this.f11505d;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        if (!this.f11505d) {
            return new x.a(y.f11511a);
        }
        int iH = x0.h(this.f11503b, j2, true, true);
        y yVar = new y(this.f11503b[iH], this.f11502a[iH]);
        if (yVar.f11512b == j2 || iH == this.f11503b.length - 1) {
            return new x.a(yVar);
        }
        int i2 = iH + 1;
        return new x.a(yVar, new y(this.f11503b[i2], this.f11502a[i2]));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f11504c;
    }
}
