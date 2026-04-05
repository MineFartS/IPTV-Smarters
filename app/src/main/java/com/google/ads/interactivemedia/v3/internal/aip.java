package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class aip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private aja f19844a;

    public aip() {
    }

    public aip(byte[] bArr) {
        this();
    }

    public abstract Pair<ls[], aii[]> f(aik aikVar, int[][][] iArr, int[] iArr2);

    public final aja g() {
        aja ajaVar = this.f19844a;
        ajr.b(ajaVar);
        return ajaVar;
    }

    public final aiq h(lr[] lrVarArr, act actVar, abg abgVar, mg mgVar) {
        int[] iArr;
        int[] iArr2 = new int[3];
        acr[][] acrVarArr = new acr[3][];
        int[][][] iArr3 = new int[3][][];
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = actVar.f19207b;
            acrVarArr[i3] = new acr[i4];
            iArr3[i3] = new int[i4][];
        }
        int i5 = 2;
        int[] iArr4 = new int[2];
        for (int i6 = 0; i6 < 2; i6++) {
            iArr4[i6] = lrVarArr[i6].e();
        }
        int i7 = 0;
        while (i7 < actVar.f19207b) {
            acr acrVarB = actVar.b(i7);
            int iA = alo.a(acrVarB.b(i2).f22156l);
            int i8 = 0;
            int i9 = 2;
            int i10 = 0;
            boolean z = true;
            while (i8 < i5) {
                lr lrVar = lrVarArr[i8];
                int iMax = 0;
                while (i2 < acrVarB.f19202a) {
                    iMax = Math.max(iMax, fq.d(lrVar.O(acrVarB.b(i2))));
                    i2++;
                }
                boolean z2 = iArr2[i8] == 0;
                if (iMax > i10) {
                    z = z2;
                    i10 = iMax;
                    i9 = i8;
                } else if (iMax == i10 && iA == 5 && !z && z2) {
                    i10 = iMax;
                    i9 = i8;
                    z = true;
                }
                i8++;
                i5 = 2;
                i2 = 0;
            }
            if (i9 == i5) {
                iArr = new int[acrVarB.f19202a];
            } else {
                lr lrVar2 = lrVarArr[i9];
                int[] iArr5 = new int[acrVarB.f19202a];
                for (int i11 = 0; i11 < acrVarB.f19202a; i11++) {
                    iArr5[i11] = lrVar2.O(acrVarB.b(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i9];
            acrVarArr[i9][i12] = acrVarB;
            iArr3[i9][i12] = iArr;
            iArr2[i9] = i12 + 1;
            i7++;
            i5 = 2;
            i2 = 0;
        }
        act[] actVarArr = new act[i5];
        int[] iArr6 = new int[i5];
        int i13 = 0;
        while (i13 < i5) {
            int i14 = iArr2[i13];
            actVarArr[i13] = new act((acr[]) amn.ab(acrVarArr[i13], i14));
            iArr3[i13] = (int[][]) amn.ab(iArr3[i13], i14);
            lrVarArr[i13].K();
            iArr6[i13] = lrVarArr[i13].b();
            i13++;
            i5 = 2;
        }
        new act((acr[]) amn.ab(acrVarArr[i5], iArr2[i5]));
        aik aikVar = new aik(iArr6, actVarArr);
        Pair<ls[], aii[]> pairF = f(aikVar, iArr3, iArr4);
        return new aiq((ls[]) pairF.first, (aii[]) pairF.second, aikVar);
    }

    public final void i(aja ajaVar) {
        this.f19844a = ajaVar;
    }
}
