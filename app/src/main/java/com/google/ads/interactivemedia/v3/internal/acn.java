package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class acn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f19181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f19182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f19183c;

    public acn() {
        this(new Random());
    }

    private acn(Random random) {
        this(new int[0], random);
    }

    private acn(int[] iArr, Random random) {
        this.f19182b = iArr;
        this.f19181a = random;
        this.f19183c = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f19183c[iArr[i2]] = i2;
        }
    }

    public final int a() {
        int[] iArr = this.f19182b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = this.f19182b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int c() {
        return this.f19182b.length;
    }

    public final int d(int i2) {
        int i3 = this.f19183c[i2] + 1;
        int[] iArr = this.f19182b;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return -1;
    }

    public final int e(int i2) {
        int i3 = this.f19183c[i2] - 1;
        if (i3 >= 0) {
            return this.f19182b[i3];
        }
        return -1;
    }

    public final acn f() {
        return new acn(new Random(this.f19181a.nextLong()));
    }

    public final acn g(int i2, int i3) {
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i5 < i3) {
            iArr[i5] = this.f19181a.nextInt(this.f19182b.length + 1);
            int i6 = i5 + 1;
            int iNextInt = this.f19181a.nextInt(i6);
            iArr2[i5] = iArr2[iNextInt];
            iArr2[iNextInt] = i5 + i2;
            i5 = i6;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f19182b.length + i3];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr4 = this.f19182b;
            if (i4 >= iArr4.length + i3) {
                return new acn(iArr3, new Random(this.f19181a.nextLong()));
            }
            if (i7 >= i3 || i8 != iArr[i7]) {
                int i9 = i8 + 1;
                int i10 = iArr4[i8];
                iArr3[i4] = i10;
                if (i10 >= i2) {
                    iArr3[i4] = i10 + i3;
                }
                i8 = i9;
            } else {
                iArr3[i4] = iArr2[i7];
                i7++;
            }
            i4++;
        }
    }

    public final acn h(int i2, int i3) {
        int i4 = i3 - i2;
        int[] iArr = new int[this.f19182b.length - i4];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr2 = this.f19182b;
            if (i5 >= iArr2.length) {
                return new acn(iArr, new Random(this.f19181a.nextLong()));
            }
            int i7 = iArr2[i5];
            if (i7 < i2 || i7 >= i3) {
                int i8 = i5 - i6;
                if (i7 >= i2) {
                    i7 -= i4;
                }
                iArr[i8] = i7;
            } else {
                i6++;
            }
            i5++;
        }
    }
}
