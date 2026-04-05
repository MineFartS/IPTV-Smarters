package c.f.a.b.g3;

import android.util.Pair;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.z0;
import c.f.a.b.i2;
import c.f.a.b.j2;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.x0;
import c.f.a.b.k2;
import c.f.a.b.p2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f8480c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f8482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f8483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a1[] f8484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f8485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[][][] f8486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a1 f8487g;

        public a(String[] strArr, int[] iArr, a1[] a1VarArr, int[] iArr2, int[][][] iArr3, a1 a1Var) {
            this.f8482b = strArr;
            this.f8483c = iArr;
            this.f8484d = a1VarArr;
            this.f8486f = iArr3;
            this.f8485e = iArr2;
            this.f8487g = a1Var;
            this.f8481a = iArr.length;
        }

        public int a(int i2, int i3, boolean z) {
            int i4 = this.f8484d[i2].b(i3).f8056b;
            int[] iArr = new int[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                int iH = h(i2, i3, i6);
                if (iH == 4 || (z && iH == 3)) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            return b(i2, i3, Arrays.copyOf(iArr, i5));
        }

        public int b(int i2, int i3, int[] iArr) {
            int i4 = 0;
            String str = null;
            boolean z = false;
            int i5 = 0;
            int iMin = 16;
            while (i4 < iArr.length) {
                String str2 = this.f8484d[i2].b(i3).b(iArr[i4]).f9338m;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !x0.b(str, str2);
                }
                iMin = Math.min(iMin, i2.c(this.f8486f[i2][i3][i4]));
                i4++;
                i5 = i6;
            }
            return z ? Math.min(iMin, this.f8485e[i2]) : iMin;
        }

        public int c() {
            return this.f8481a;
        }

        public String d(int i2) {
            return this.f8482b[i2];
        }

        public int e(int i2) {
            int iMax = 0;
            for (int[] iArr : this.f8486f[i2]) {
                for (int i3 : iArr) {
                    int iD = i2.d(i3);
                    int i4 = 2;
                    if (iD == 0 || iD == 1 || iD == 2) {
                        i4 = 1;
                    } else if (iD != 3) {
                        if (iD == 4) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    iMax = Math.max(iMax, i4);
                }
            }
            return iMax;
        }

        public int f(int i2) {
            return this.f8483c[i2];
        }

        public a1 g(int i2) {
            return this.f8484d[i2];
        }

        public int h(int i2, int i3, int i4) {
            return i2.d(this.f8486f[i2][i3][i4]);
        }

        public int i(int i2) {
            int iMax = 0;
            for (int i3 = 0; i3 < this.f8481a; i3++) {
                if (this.f8483c[i3] == i2) {
                    iMax = Math.max(iMax, e(i3));
                }
            }
            return iMax;
        }

        public a1 j() {
            return this.f8487g;
        }
    }

    public static int f(j2[] j2VarArr, z0 z0Var, int[] iArr, boolean z) {
        int length = j2VarArr.length;
        int i2 = 0;
        boolean z2 = true;
        for (int i3 = 0; i3 < j2VarArr.length; i3++) {
            j2 j2Var = j2VarArr[i3];
            int iMax = 0;
            for (int i4 = 0; i4 < z0Var.f8056b; i4++) {
                iMax = Math.max(iMax, i2.d(j2Var.a(z0Var.b(i4))));
            }
            boolean z3 = iArr[i3] == 0;
            if (iMax > i2 || (iMax == i2 && z && !z2 && z3)) {
                length = i3;
                z2 = z3;
                i2 = iMax;
            }
        }
        return length;
    }

    public static int[] h(j2 j2Var, z0 z0Var) {
        int[] iArr = new int[z0Var.f8056b];
        for (int i2 = 0; i2 < z0Var.f8056b; i2++) {
            iArr[i2] = j2Var.a(z0Var.b(i2));
        }
        return iArr;
    }

    public static int[] i(j2[] j2VarArr) {
        int length = j2VarArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = j2VarArr[i2].n();
        }
        return iArr;
    }

    @Override // c.f.a.b.g3.o
    public final void d(Object obj) {
        this.f8480c = (a) obj;
    }

    @Override // c.f.a.b.g3.o
    public final p e(j2[] j2VarArr, a1 a1Var, i0.a aVar, p2 p2Var) {
        int[] iArr = new int[j2VarArr.length + 1];
        int length = j2VarArr.length + 1;
        z0[][] z0VarArr = new z0[length][];
        int[][][] iArr2 = new int[j2VarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = a1Var.f6903c;
            z0VarArr[i2] = new z0[i3];
            iArr2[i2] = new int[i3][];
        }
        int[] iArrI = i(j2VarArr);
        for (int i4 = 0; i4 < a1Var.f6903c; i4++) {
            z0 z0VarB = a1Var.b(i4);
            int iF = f(j2VarArr, z0VarB, iArr, d0.l(z0VarB.b(0).f9338m) == 5);
            int[] iArrH = iF == j2VarArr.length ? new int[z0VarB.f8056b] : h(j2VarArr[iF], z0VarB);
            int i5 = iArr[iF];
            z0VarArr[iF][i5] = z0VarB;
            iArr2[iF][i5] = iArrH;
            iArr[iF] = iArr[iF] + 1;
        }
        a1[] a1VarArr = new a1[j2VarArr.length];
        String[] strArr = new String[j2VarArr.length];
        int[] iArr3 = new int[j2VarArr.length];
        for (int i6 = 0; i6 < j2VarArr.length; i6++) {
            int i7 = iArr[i6];
            a1VarArr[i6] = new a1((z0[]) x0.G0(z0VarArr[i6], i7));
            iArr2[i6] = (int[][]) x0.G0(iArr2[i6], i7);
            strArr[i6] = j2VarArr[i6].getName();
            iArr3[i6] = j2VarArr[i6].getTrackType();
        }
        a aVar2 = new a(strArr, iArr3, a1VarArr, iArrI, iArr2, new a1((z0[]) x0.G0(z0VarArr[j2VarArr.length], iArr[j2VarArr.length])));
        Pair<k2[], h[]> pairJ = j(aVar2, iArr2, iArrI, aVar, p2Var);
        return new p((k2[]) pairJ.first, (h[]) pairJ.second, aVar2);
    }

    public final a g() {
        return this.f8480c;
    }

    public abstract Pair<k2[], h[]> j(a aVar, int[][][] iArr, int[] iArr2, i0.a aVar2, p2 p2Var);
}
