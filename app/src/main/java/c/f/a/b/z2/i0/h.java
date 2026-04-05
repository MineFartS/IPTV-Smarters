package c.f.a.b.z2.i0;

import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.t2.h0;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f10880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10883d;

    public h(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f10880a = jArr;
        this.f10881b = jArr2;
        this.f10882c = j2;
        this.f10883d = j3;
    }

    public static h a(long j2, long j3, h0.a aVar, i0 i0Var) {
        int iD;
        i0Var.Q(10);
        int iN = i0Var.n();
        if (iN <= 0) {
            return null;
        }
        int i2 = aVar.f10075d;
        long jP0 = x0.P0(iN, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), i2);
        int iJ = i0Var.J();
        int iJ2 = i0Var.J();
        int iJ3 = i0Var.J();
        i0Var.Q(2);
        long j4 = j3 + ((long) aVar.f10074c);
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        int i3 = 0;
        long j5 = j3;
        while (i3 < iJ) {
            int i4 = iJ2;
            long j6 = j4;
            jArr[i3] = (((long) i3) * jP0) / ((long) iJ);
            jArr2[i3] = Math.max(j5, j6);
            if (iJ3 == 1) {
                iD = i0Var.D();
            } else if (iJ3 == 2) {
                iD = i0Var.J();
            } else if (iJ3 == 3) {
                iD = i0Var.G();
            } else {
                if (iJ3 != 4) {
                    return null;
                }
                iD = i0Var.H();
            }
            j5 += (long) (iD * i4);
            i3++;
            j4 = j6;
            iJ2 = i4;
        }
        if (j2 != -1 && j2 != j5) {
            z.i("VbriSeeker", "VBRI data size mismatch: " + j2 + ", " + j5);
        }
        return new h(jArr, jArr2, jP0, j5);
    }

    @Override // c.f.a.b.z2.i0.g
    public long b(long j2) {
        return this.f10880a[x0.h(this.f10881b, j2, true, true)];
    }

    @Override // c.f.a.b.z2.i0.g
    public long d() {
        return this.f10883d;
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        int iH = x0.h(this.f10880a, j2, true, true);
        y yVar = new y(this.f10880a[iH], this.f10881b[iH]);
        if (yVar.f11512b >= j2 || iH == this.f10880a.length - 1) {
            return new x.a(yVar);
        }
        int i2 = iH + 1;
        return new x.a(yVar, new y(this.f10880a[i2], this.f10881b[i2]));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.f10882c;
    }
}
