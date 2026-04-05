package c.f.a.b.e3;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public interface u0 {

    public static class a implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f7986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f7987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f7988c;

        public a(int i2) {
            this(i2, new Random());
        }

        public a(int i2, Random random) {
            this(h(i2, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f7987b = iArr;
            this.f7986a = random;
            this.f7988c = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f7988c[iArr[i2]] = i2;
            }
        }

        public static int[] h(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                int iNextInt = random.nextInt(i4);
                iArr[i3] = iArr[iNextInt];
                iArr[iNextInt] = i3;
                i3 = i4;
            }
            return iArr;
        }

        @Override // c.f.a.b.e3.u0
        public u0 a(int i2, int i3) {
            int i4 = i3 - i2;
            int[] iArr = new int[this.f7987b.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f7987b;
                if (i5 >= iArr2.length) {
                    return new a(iArr, new Random(this.f7986a.nextLong()));
                }
                if (iArr2[i5] < i2 || iArr2[i5] >= i3) {
                    iArr[i5 - i6] = iArr2[i5] >= i2 ? iArr2[i5] - i4 : iArr2[i5];
                } else {
                    i6++;
                }
                i5++;
            }
        }

        @Override // c.f.a.b.e3.u0
        public int b() {
            int[] iArr = this.f7987b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // c.f.a.b.e3.u0
        public int c(int i2) {
            int i3 = this.f7988c[i2] - 1;
            if (i3 >= 0) {
                return this.f7987b[i3];
            }
            return -1;
        }

        @Override // c.f.a.b.e3.u0
        public int d(int i2) {
            int i3 = this.f7988c[i2] + 1;
            int[] iArr = this.f7987b;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // c.f.a.b.e3.u0
        public u0 e(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            while (i5 < i3) {
                iArr[i5] = this.f7986a.nextInt(this.f7987b.length + 1);
                int i6 = i5 + 1;
                int iNextInt = this.f7986a.nextInt(i6);
                iArr2[i5] = iArr2[iNextInt];
                iArr2[iNextInt] = i5 + i2;
                i5 = i6;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f7987b.length + i3];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f7987b;
                if (i4 >= iArr4.length + i3) {
                    return new a(iArr3, new Random(this.f7986a.nextLong()));
                }
                if (i7 >= i3 || i8 != iArr[i7]) {
                    int i9 = i8 + 1;
                    iArr3[i4] = iArr4[i8];
                    if (iArr3[i4] >= i2) {
                        iArr3[i4] = iArr3[i4] + i3;
                    }
                    i8 = i9;
                } else {
                    iArr3[i4] = iArr2[i7];
                    i7++;
                }
                i4++;
            }
        }

        @Override // c.f.a.b.e3.u0
        public int f() {
            int[] iArr = this.f7987b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // c.f.a.b.e3.u0
        public u0 g() {
            return new a(0, new Random(this.f7986a.nextLong()));
        }

        @Override // c.f.a.b.e3.u0
        public int getLength() {
            return this.f7987b.length;
        }
    }

    u0 a(int i2, int i3);

    int b();

    int c(int i2);

    int d(int i2);

    u0 e(int i2, int i3);

    int f();

    u0 g();

    int getLength();
}
