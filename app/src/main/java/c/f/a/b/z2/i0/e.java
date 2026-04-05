package c.f.a.b.z2.i0;

import android.util.Pair;
import c.f.a.b.b3.m.k;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f10862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10864c;

    public e(long[] jArr, long[] jArr2, long j2) {
        this.f10862a = jArr;
        this.f10863b = jArr2;
        this.f10864c = j2 == -9223372036854775807L ? w0.d(jArr2[jArr2.length - 1]) : j2;
    }

    public static e a(long j2, k kVar, long j3) {
        int length = kVar.f6586f.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += (long) (kVar.f6584d + kVar.f6586f[i4]);
            j4 += (long) (kVar.f6585e + kVar.f6587g[i4]);
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new e(jArr, jArr2, j3);
    }

    public static Pair<Long, Long> c(long j2, long[] jArr, long[] jArr2) {
        double d2;
        Long lValueOf;
        Long lValueOf2;
        int iH = x0.h(jArr, j2, true, true);
        long j3 = jArr[iH];
        long j4 = jArr2[iH];
        int i2 = iH + 1;
        if (i2 == jArr.length) {
            lValueOf = Long.valueOf(j3);
            lValueOf2 = Long.valueOf(j4);
        } else {
            long j5 = jArr[i2];
            long j6 = jArr2[i2];
            if (j5 == j3) {
                d2 = 0.0d;
            } else {
                double d3 = j2;
                double d4 = j3;
                Double.isNaN(d3);
                Double.isNaN(d4);
                double d5 = j5 - j3;
                Double.isNaN(d5);
                d2 = (d3 - d4) / d5;
            }
            double d6 = j6 - j4;
            Double.isNaN(d6);
            lValueOf = Long.valueOf(j2);
            lValueOf2 = Long.valueOf(((long) (d2 * d6)) + j4);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // c.f.a.b.z2.i0.g
    public long b(long j2) {
        return w0.d(((Long) c(j2, this.f10862a, this.f10863b).second).longValue());
    }

    @Override // c.f.a.b.z2.i0.g
    public long d() {
        return -1L;
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        Pair<Long, Long> pairC = c(w0.e(x0.s(j2, 0L, this.f10864c)), this.f10863b, this.f10862a);
        return new x.a(new y(w0.d(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue()));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f10864c;
    }
}
