package c.f.a.b.k3.f0;

import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.f0.h;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static h a(byte[] bArr, int i2) {
        ArrayList<h.a> arrayListF;
        i0 i0Var = new i0(bArr);
        try {
            arrayListF = c(i0Var) ? f(i0Var) : e(i0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new h(arrayListF.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new h(arrayListF.get(0), arrayListF.get(1), i2);
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >> 1);
    }

    public static boolean c(i0 i0Var) {
        i0Var.Q(4);
        int iN = i0Var.n();
        i0Var.P(0);
        return iN == 1886547818;
    }

    public static h.a d(i0 i0Var) {
        int iN = i0Var.n();
        if (iN > 10000) {
            return null;
        }
        float[] fArr = new float[iN];
        for (int i2 = 0; i2 < iN; i2++) {
            fArr[i2] = i0Var.m();
        }
        int iN2 = i0Var.n();
        if (iN2 > 32000) {
            return null;
        }
        double d2 = 2.0d;
        double dLog = Math.log(2.0d);
        double d3 = iN;
        Double.isNaN(d3);
        int iCeil = (int) Math.ceil(Math.log(d3 * 2.0d) / dLog);
        h0 h0Var = new h0(i0Var.d());
        int i3 = 8;
        h0Var.p(i0Var.e() * 8);
        float[] fArr2 = new float[iN2 * 5];
        int i4 = 5;
        int[] iArr = new int[5];
        int i5 = 0;
        int i6 = 0;
        while (i5 < iN2) {
            int i7 = 0;
            while (i7 < i4) {
                int iB = iArr[i7] + b(h0Var.h(iCeil));
                if (iB >= iN || iB < 0) {
                    return null;
                }
                fArr2[i6] = fArr[iB];
                iArr[i7] = iB;
                i7++;
                i6++;
                i4 = 5;
            }
            i5++;
            i4 = 5;
        }
        h0Var.p((h0Var.e() + 7) & (-8));
        int i8 = 32;
        int iH = h0Var.h(32);
        h.b[] bVarArr = new h.b[iH];
        int i9 = 0;
        while (i9 < iH) {
            int iH2 = h0Var.h(i3);
            int iH3 = h0Var.h(i3);
            int iH4 = h0Var.h(i8);
            if (iH4 > 128000) {
                return null;
            }
            double d4 = iN2;
            Double.isNaN(d4);
            int iCeil2 = (int) Math.ceil(Math.log(d4 * d2) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i10 = 0; i10 < iH4; i10++) {
                iB2 += b(h0Var.h(iCeil2));
                if (iB2 < 0 || iB2 >= iN2) {
                    return null;
                }
                int i11 = i10 * 3;
                int i12 = iB2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i10 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
            }
            bVarArr[i9] = new h.b(iH2, fArr3, fArr4, iH3);
            i9++;
            i8 = 32;
            d2 = 2.0d;
            i3 = 8;
        }
        return new h.a(bVarArr);
    }

    public static ArrayList<h.a> e(i0 i0Var) {
        if (i0Var.D() != 0) {
            return null;
        }
        i0Var.Q(7);
        int iN = i0Var.n();
        if (iN == 1684433976) {
            i0 i0Var2 = new i0();
            Inflater inflater = new Inflater(true);
            try {
                if (!x0.p0(i0Var, i0Var2, inflater)) {
                    return null;
                }
                i0Var = i0Var2;
            } finally {
                inflater.end();
            }
        } else if (iN != 1918990112) {
            return null;
        }
        return g(i0Var);
    }

    public static ArrayList<h.a> f(i0 i0Var) {
        int iN;
        i0Var.Q(8);
        int iE = i0Var.e();
        int iF = i0Var.f();
        while (iE < iF && (iN = i0Var.n() + iE) > iE && iN <= iF) {
            int iN2 = i0Var.n();
            if (iN2 == 2037673328 || iN2 == 1836279920) {
                i0Var.O(iN);
                return e(i0Var);
            }
            i0Var.P(iN);
            iE = iN;
        }
        return null;
    }

    public static ArrayList<h.a> g(i0 i0Var) {
        ArrayList<h.a> arrayList = new ArrayList<>();
        int iE = i0Var.e();
        int iF = i0Var.f();
        while (iE < iF) {
            int iN = i0Var.n() + iE;
            if (iN <= iE || iN > iF) {
                return null;
            }
            if (i0Var.n() == 1835365224) {
                h.a aVarD = d(i0Var);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            i0Var.P(iN);
            iE = iN;
        }
        return arrayList;
    }
}
