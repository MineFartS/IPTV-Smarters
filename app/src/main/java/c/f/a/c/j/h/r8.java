package c.f.a.c.j.h;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r8 f13507a = new r8(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f13509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f13510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13512f;

    public r8() {
        this(0, new int[8], new Object[8], true);
    }

    public r8(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f13511e = -1;
        this.f13508b = i2;
        this.f13509c = iArr;
        this.f13510d = objArr;
        this.f13512f = z;
    }

    public static r8 a() {
        return f13507a;
    }

    public static r8 b() {
        return new r8(0, new int[8], new Object[8], true);
    }

    public static r8 c(r8 r8Var, r8 r8Var2) {
        int i2 = r8Var.f13508b + r8Var2.f13508b;
        int[] iArrCopyOf = Arrays.copyOf(r8Var.f13509c, i2);
        System.arraycopy(r8Var2.f13509c, 0, iArrCopyOf, r8Var.f13508b, r8Var2.f13508b);
        Object[] objArrCopyOf = Arrays.copyOf(r8Var.f13510d, i2);
        System.arraycopy(r8Var2.f13510d, 0, objArrCopyOf, r8Var.f13508b, r8Var2.f13508b);
        return new r8(i2, iArrCopyOf, objArrCopyOf, true);
    }

    public final void d() {
        this.f13512f = false;
    }

    public final int e() {
        int i2 = this.f13511e;
        if (i2 != -1) {
            return i2;
        }
        int iC = 0;
        for (int i3 = 0; i3 < this.f13508b; i3++) {
            int i4 = this.f13509c[i3];
            l5 l5Var = (l5) this.f13510d[i3];
            int iA = t5.A(1);
            int iA2 = t5.A(2);
            int iC2 = t5.C(i4 >>> 3);
            int iA3 = t5.A(3);
            int iD = l5Var.d();
            iC += iA + iA + iA2 + iC2 + iA3 + t5.C(iD) + iD;
        }
        this.f13511e = iC;
        return iC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        int i2 = this.f13508b;
        if (i2 == r8Var.f13508b) {
            int[] iArr = this.f13509c;
            int[] iArr2 = r8Var.f13509c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f13510d;
                    Object[] objArr2 = r8Var.f13510d;
                    int i4 = this.f13508b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int f() {
        int iA;
        int iD;
        int iA2;
        int i2 = this.f13511e;
        if (i2 != -1) {
            return i2;
        }
        int iC = 0;
        for (int i3 = 0; i3 < this.f13508b; i3++) {
            int i4 = this.f13509c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f13510d[i3]).longValue();
                    iA2 = t5.A(i5) + 8;
                } else if (i6 == 2) {
                    l5 l5Var = (l5) this.f13510d[i3];
                    int iA3 = t5.A(i5);
                    int iD2 = l5Var.d();
                    iC += iA3 + t5.C(iD2) + iD2;
                } else if (i6 == 3) {
                    int iA4 = t5.A(i5);
                    iA = iA4 + iA4;
                    iD = ((r8) this.f13510d[i3]).f();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(w6.d());
                    }
                    ((Integer) this.f13510d[i3]).intValue();
                    iA2 = t5.A(i5) + 4;
                }
                iC += iA2;
            } else {
                long jLongValue = ((Long) this.f13510d[i3]).longValue();
                iA = t5.A(i5);
                iD = t5.D(jLongValue);
            }
            iA2 = iA + iD;
            iC += iA2;
        }
        this.f13511e = iC;
        return iC;
    }

    public final void g(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f13508b; i3++) {
            t7.b(sb, i2, String.valueOf(this.f13509c[i3] >>> 3), this.f13510d[i3]);
        }
    }

    public final void h(int i2, Object obj) {
        if (!this.f13512f) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f13508b;
        int[] iArr = this.f13509c;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f13509c = Arrays.copyOf(iArr, i4);
            this.f13510d = Arrays.copyOf(this.f13510d, i4);
        }
        int[] iArr2 = this.f13509c;
        int i5 = this.f13508b;
        iArr2[i5] = i2;
        this.f13510d[i5] = obj;
        this.f13508b = i5 + 1;
    }

    public final int hashCode() {
        int i2 = this.f13508b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f13509c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f13510d;
        int i7 = this.f13508b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final void i(u5 u5Var) {
        if (this.f13508b != 0) {
            for (int i2 = 0; i2 < this.f13508b; i2++) {
                int i3 = this.f13509c[i2];
                Object obj = this.f13510d[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    u5Var.n(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    u5Var.u(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    u5Var.y(i4, (l5) obj);
                } else if (i5 == 3) {
                    u5Var.E(i4);
                    ((r8) obj).i(u5Var);
                    u5Var.F(i4);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(w6.d());
                    }
                    u5Var.v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
