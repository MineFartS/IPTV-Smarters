package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bmz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bmz f21433a = new bmz(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f21435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f21436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21438f;

    private bmz() {
        this(0, new int[8], new Object[8], true);
    }

    private bmz(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f21437e = -1;
        this.f21434b = i2;
        this.f21435c = iArr;
        this.f21436d = objArr;
        this.f21438f = z;
    }

    public static bmz c() {
        return f21433a;
    }

    public static bmz d(bmz bmzVar, bmz bmzVar2) {
        int i2 = bmzVar.f21434b + bmzVar2.f21434b;
        int[] iArrCopyOf = Arrays.copyOf(bmzVar.f21435c, i2);
        System.arraycopy(bmzVar2.f21435c, 0, iArrCopyOf, bmzVar.f21434b, bmzVar2.f21434b);
        Object[] objArrCopyOf = Arrays.copyOf(bmzVar.f21436d, i2);
        System.arraycopy(bmzVar2.f21436d, 0, objArrCopyOf, bmzVar.f21434b, bmzVar2.f21434b);
        return new bmz(i2, iArrCopyOf, objArrCopyOf, true);
    }

    public static bmz e() {
        return new bmz(0, new int[8], new Object[8], true);
    }

    private static void j(int i2, Object obj, bnq bnqVar) {
        int iA = bnp.a(i2);
        int iB = bnp.b(i2);
        if (iB == 0) {
            bnqVar.t(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            bnqVar.m(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            bnqVar.d(iA, (bkd) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(blf.a());
            }
            bnqVar.k(iA, ((Integer) obj).intValue());
        } else {
            bnqVar.F(iA);
            ((bmz) obj).i(bnqVar);
            bnqVar.h(iA);
        }
    }

    public final int a() {
        int iG;
        int i2 = this.f21437e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f21434b; i4++) {
            int i5 = this.f21435c[i4];
            int iA = bnp.a(i5);
            int iB = bnp.b(i5);
            if (iB == 0) {
                iG = bki.G(iA, ((Long) this.f21436d[i4]).longValue());
            } else if (iB == 1) {
                ((Long) this.f21436d[i4]).longValue();
                iG = bki.aq(iA);
            } else if (iB == 2) {
                iG = bki.m(iA, (bkd) this.f21436d[i4]);
            } else if (iB == 3) {
                int iD = bki.D(iA);
                iG = iD + iD + ((bmz) this.f21436d[i4]).a();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(blf.a());
                }
                ((Integer) this.f21436d[i4]).intValue();
                iG = bki.ap(iA);
            }
            i3 += iG;
        }
        this.f21437e = i3;
        return i3;
    }

    public final int b() {
        int i2 = this.f21437e;
        if (i2 != -1) {
            return i2;
        }
        int iE = 0;
        for (int i3 = 0; i3 < this.f21434b; i3++) {
            int i4 = this.f21435c[i3];
            bkd bkdVar = (bkd) this.f21436d[i3];
            int iD = bki.D(1);
            iE += iD + iD + bki.E(2, bnp.a(i4)) + bki.m(3, bkdVar);
        }
        this.f21437e = iE;
        return iE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bmz)) {
            return false;
        }
        bmz bmzVar = (bmz) obj;
        int i2 = this.f21434b;
        if (i2 == bmzVar.f21434b) {
            int[] iArr = this.f21435c;
            int[] iArr2 = bmzVar.f21435c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f21436d;
                    Object[] objArr2 = bmzVar.f21436d;
                    int i4 = this.f21434b;
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

    public final void f() {
        this.f21438f = false;
    }

    public final void g(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f21434b; i3++) {
            bmb.b(sb, i2, String.valueOf(bnp.a(this.f21435c[i3])), this.f21436d[i3]);
        }
    }

    public final void h(int i2, Object obj) {
        if (!this.f21438f) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f21434b;
        int[] iArr = this.f21435c;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f21435c = Arrays.copyOf(iArr, i4);
            this.f21436d = Arrays.copyOf(this.f21436d, i4);
        }
        int[] iArr2 = this.f21435c;
        int i5 = this.f21434b;
        iArr2[i5] = i2;
        this.f21436d[i5] = obj;
        this.f21434b = i5 + 1;
    }

    public final int hashCode() {
        int i2 = this.f21434b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f21435c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f21436d;
        int i7 = this.f21434b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final void i(bnq bnqVar) {
        if (this.f21434b != 0) {
            for (int i2 = 0; i2 < this.f21434b; i2++) {
                j(this.f21435c[i2], this.f21436d[i2], bnqVar);
            }
        }
    }
}
