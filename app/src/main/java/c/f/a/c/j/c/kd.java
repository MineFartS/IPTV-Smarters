package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd f12912a = new kd(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f12915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12917f;

    public kd() {
        this(0, new int[8], new Object[8], true);
    }

    public kd(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f12916e = -1;
        this.f12913b = i2;
        this.f12914c = iArr;
        this.f12915d = objArr;
        this.f12917f = z;
    }

    public static kd a(kd kdVar, kd kdVar2) {
        int i2 = kdVar.f12913b + kdVar2.f12913b;
        int[] iArrCopyOf = Arrays.copyOf(kdVar.f12914c, i2);
        System.arraycopy(kdVar2.f12914c, 0, iArrCopyOf, kdVar.f12913b, kdVar2.f12913b);
        Object[] objArrCopyOf = Arrays.copyOf(kdVar.f12915d, i2);
        System.arraycopy(kdVar2.f12915d, 0, objArrCopyOf, kdVar.f12913b, kdVar2.f12913b);
        return new kd(i2, iArrCopyOf, objArrCopyOf, true);
    }

    public static void d(int i2, Object obj, ce ceVar) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ceVar.t(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            ceVar.k(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            ceVar.D(i3, (m9) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(ab.a());
            }
            ceVar.c(i3, ((Integer) obj).intValue());
        } else if (ceVar.L() == oa.e.f13007l) {
            ceVar.B(i3);
            ((kd) obj).e(ceVar);
            ceVar.F(i3);
        } else {
            ceVar.F(i3);
            ((kd) obj).e(ceVar);
            ceVar.B(i3);
        }
    }

    public static kd h() {
        return f12912a;
    }

    public final void b(ce ceVar) {
        if (ceVar.L() == oa.e.f13008m) {
            for (int i2 = this.f12913b - 1; i2 >= 0; i2--) {
                ceVar.g(this.f12914c[i2] >>> 3, this.f12915d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f12913b; i3++) {
            ceVar.g(this.f12914c[i3] >>> 3, this.f12915d[i3]);
        }
    }

    public final void c(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f12913b; i3++) {
            cc.c(sb, i2, String.valueOf(this.f12914c[i3] >>> 3), this.f12915d[i3]);
        }
    }

    public final void e(ce ceVar) {
        if (this.f12913b == 0) {
            return;
        }
        if (ceVar.L() == oa.e.f13007l) {
            for (int i2 = 0; i2 < this.f12913b; i2++) {
                d(this.f12914c[i2], this.f12915d[i2], ceVar);
            }
            return;
        }
        for (int i3 = this.f12913b - 1; i3 >= 0; i3--) {
            d(this.f12914c[i3], this.f12915d[i3], ceVar);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        int i2 = this.f12913b;
        if (i2 == kdVar.f12913b) {
            int[] iArr = this.f12914c;
            int[] iArr2 = kdVar.f12914c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                }
                if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                Object[] objArr = this.f12915d;
                Object[] objArr2 = kdVar.f12915d;
                int i4 = this.f12913b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    }
                    i5++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        this.f12917f = false;
    }

    public final int g() {
        int iD0;
        int i2 = this.f12916e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f12913b; i4++) {
            int i5 = this.f12914c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iD0 = z9.d0(i6, ((Long) this.f12915d[i4]).longValue());
            } else if (i7 == 1) {
                iD0 = z9.f0(i6, ((Long) this.f12915d[i4]).longValue());
            } else if (i7 == 2) {
                iD0 = z9.Q(i6, (m9) this.f12915d[i4]);
            } else if (i7 == 3) {
                iD0 = (z9.u(i6) << 1) + ((kd) this.f12915d[i4]).g();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(ab.a());
                }
                iD0 = z9.t0(i6, ((Integer) this.f12915d[i4]).intValue());
            }
            i3 += iD0;
        }
        this.f12916e = i3;
        return i3;
    }

    public final int hashCode() {
        int i2 = this.f12913b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f12914c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f12915d;
        int i7 = this.f12913b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final int i() {
        int i2 = this.f12916e;
        if (i2 != -1) {
            return i2;
        }
        int iA0 = 0;
        for (int i3 = 0; i3 < this.f12913b; i3++) {
            iA0 += z9.a0(this.f12914c[i3] >>> 3, (m9) this.f12915d[i3]);
        }
        this.f12916e = iA0;
        return iA0;
    }
}
