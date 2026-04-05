package c.f.a.b.j3;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f9165a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f9166b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f9167c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f9168d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9171c;

        public a(int i2, int i3, boolean z) {
            this.f9169a = i2;
            this.f9170b = i3;
            this.f9171c = z;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f9175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f9176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f9178g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f9179h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f9180i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f9181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f9182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f9183l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f9184m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f9172a = i2;
            this.f9173b = i3;
            this.f9174c = i4;
            this.f9175d = i5;
            this.f9176e = i6;
            this.f9177f = i7;
            this.f9178g = f2;
            this.f9179h = z;
            this.f9180i = z2;
            this.f9181j = i8;
            this.f9182k = i9;
            this.f9183l = i10;
            this.f9184m = z3;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i5 = byteBuffer.get(i2) & 255;
            if (i3 == 3) {
                if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i2 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i5 == 0) {
                i3++;
            }
            if (i5 != 0) {
                i3 = 0;
            }
            i2 = i4;
        }
    }

    public static int c(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        g.g(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            if ((bArr[i6] & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && bArr[i6] == 1) {
                    a(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static int d(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int e(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static boolean g(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i2, int i3) {
        j0 j0Var = new j0(bArr, i2, i3);
        j0Var.l(8);
        int iH = j0Var.h();
        int iH2 = j0Var.h();
        j0Var.k();
        return new a(iH, iH2, j0Var.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.j3.e0.b i(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.j3.e0.i(byte[], int, int):c.f.a.b.j3.e0$b");
    }

    public static void j(j0 j0Var, int i2) {
        int iG = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i2; i4++) {
            if (iG != 0) {
                iG = ((j0Var.g() + i3) + 256) % 256;
            }
            if (iG != 0) {
                i3 = iG;
            }
        }
    }

    public static int k(byte[] bArr, int i2) {
        int i3;
        synchronized (f9167c) {
            int iD = 0;
            int i4 = 0;
            while (iD < i2) {
                try {
                    iD = d(bArr, iD, i2);
                    if (iD < i2) {
                        int[] iArr = f9168d;
                        if (iArr.length <= i4) {
                            f9168d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f9168d[i4] = iD;
                        iD += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f9168d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i3 - i5);
        }
        return i3;
    }
}
