package c.f.a.b.z2.j0;

import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f10928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f10929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f10931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f10932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f10933f;

        public b(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
            this.f10928a = jArr;
            this.f10929b = iArr;
            this.f10930c = i2;
            this.f10931d = jArr2;
            this.f10932e = iArr2;
            this.f10933f = j2;
        }
    }

    public static b a(int i2, long[] jArr, int[] iArr, long j2) {
        int i3 = 8192 / i2;
        int iK = 0;
        for (int i4 : iArr) {
            iK += x0.k(i4, i3);
        }
        long[] jArr2 = new long[iK];
        int[] iArr2 = new int[iK];
        long[] jArr3 = new long[iK];
        int[] iArr3 = new int[iK];
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            long j3 = jArr[i7];
            while (i8 > 0) {
                int iMin = Math.min(i3, i8);
                jArr2[i6] = j3;
                iArr2[i6] = i2 * iMin;
                iMax = Math.max(iMax, iArr2[i6]);
                jArr3[i6] = ((long) i5) * j2;
                iArr3[i6] = 1;
                j3 += (long) iArr2[i6];
                i5 += iMin;
                i8 -= iMin;
                i6++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j2 * ((long) i5));
    }
}
