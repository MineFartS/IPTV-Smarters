package c.f.a.b.z2.i0;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.t2.h0;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f10889f;

    public i(long j2, int i2, long j3) {
        this(j2, i2, j3, -1L, null);
    }

    public i(long j2, int i2, long j3, long j4, long[] jArr) {
        this.f10884a = j2;
        this.f10885b = i2;
        this.f10886c = j3;
        this.f10889f = jArr;
        this.f10887d = j4;
        this.f10888e = j4 != -1 ? j2 + j4 : -1L;
    }

    public static i a(long j2, long j3, h0.a aVar, i0 i0Var) {
        int iH;
        int i2 = aVar.f10078g;
        int i3 = aVar.f10075d;
        int iN = i0Var.n();
        if ((iN & 1) != 1 || (iH = i0Var.H()) == 0) {
            return null;
        }
        long jP0 = x0.P0(iH, ((long) i2) * 1000000, i3);
        if ((iN & 6) != 6) {
            return new i(j3, aVar.f10074c, jP0);
        }
        long jF = i0Var.F();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = i0Var.D();
        }
        if (j2 != -1) {
            long j4 = j3 + jF;
            if (j2 != j4) {
                z.i("XingSeeker", "XING data size mismatch: " + j2 + ", " + j4);
            }
        }
        return new i(j3, aVar.f10074c, jP0, jF, jArr);
    }

    @Override // c.f.a.b.z2.i0.g
    public long b(long j2) {
        double d2;
        long j3 = j2 - this.f10884a;
        if (!f() || j3 <= this.f10885b) {
            return 0L;
        }
        long[] jArr = (long[]) c.f.a.b.j3.g.i(this.f10889f);
        double d3 = j3;
        Double.isNaN(d3);
        double d4 = this.f10887d;
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int iH = x0.h(jArr, (long) d5, true, true);
        long jC = c(iH);
        long j4 = jArr[iH];
        int i2 = iH + 1;
        long jC2 = c(i2);
        long j5 = iH == 99 ? 256L : jArr[i2];
        if (j4 == j5) {
            d2 = 0.0d;
        } else {
            double d6 = j4;
            Double.isNaN(d6);
            double d7 = j5 - j4;
            Double.isNaN(d7);
            d2 = (d5 - d6) / d7;
        }
        double d8 = jC2 - jC;
        Double.isNaN(d8);
        return jC + Math.round(d2 * d8);
    }

    public final long c(int i2) {
        return (this.f10886c * ((long) i2)) / 100;
    }

    @Override // c.f.a.b.z2.i0.g
    public long d() {
        return this.f10888e;
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return this.f10889f != null;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        if (!f()) {
            return new x.a(new y(0L, this.f10884a + ((long) this.f10885b)));
        }
        long jS = x0.s(j2, 0L, this.f10886c);
        double d2 = jS;
        Double.isNaN(d2);
        double d3 = this.f10886c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i2 = (int) d4;
                double d6 = ((long[]) c.f.a.b.j3.g.i(this.f10889f))[i2];
                double d7 = i2 == 99 ? 256.0d : r3[i2 + 1];
                double d8 = i2;
                Double.isNaN(d8);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d8) * (d7 - d6));
            }
        }
        double d9 = this.f10887d;
        Double.isNaN(d9);
        return new x.a(new y(jS, this.f10884a + x0.s(Math.round((d5 / 256.0d) * d9), this.f10885b, this.f10887d - 1)));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f10886c;
    }
}
