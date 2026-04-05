package c.f.a.b.t2;

import c.f.a.b.w1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10110a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10111b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10114c;

        public b(int i2, int i3, String str) {
            this.f10112a = i2;
            this.f10113b = i3;
            this.f10114c = str;
        }
    }

    public static byte[] a(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (true) {
            int[] iArr = f10110a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i2 == iArr[i5]) {
                i6 = i5;
            }
            i5++;
        }
        int i7 = -1;
        while (true) {
            int[] iArr2 = f10111b;
            if (i4 >= iArr2.length) {
                break;
            }
            if (i3 == iArr2[i4]) {
                i7 = i4;
            }
            i4++;
        }
        if (i2 != -1 && i7 != -1) {
            return b(2, i6, i7);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i2 + ", " + i3);
    }

    public static byte[] b(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    public static int c(c.f.a.b.j3.h0 h0Var) {
        int iH = h0Var.h(5);
        return iH == 31 ? h0Var.h(6) + 32 : iH;
    }

    public static int d(int i2) {
        if (i2 == 2) {
            return 10;
        }
        if (i2 == 5) {
            return 11;
        }
        if (i2 == 29) {
            return 12;
        }
        if (i2 == 42) {
            return 16;
        }
        if (i2 != 22) {
            return i2 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static int e(c.f.a.b.j3.h0 h0Var) throws w1 {
        int iH = h0Var.h(4);
        if (iH == 15) {
            return h0Var.h(24);
        }
        if (iH < 13) {
            return f10110a[iH];
        }
        throw w1.a(null, null);
    }

    public static b f(c.f.a.b.j3.h0 h0Var, boolean z) throws w1 {
        int iC = c(h0Var);
        int iE = e(h0Var);
        int iH = h0Var.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iE = e(h0Var);
            iC = c(h0Var);
            if (iC == 22) {
                iH = h0Var.h(4);
            }
        }
        if (z) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw w1.e("Unsupported audio object type: " + iC);
                }
            }
            h(h0Var, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = h0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw w1.e("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i2 = f10111b[iH];
        if (i2 != -1) {
            return new b(iE, i2, str);
        }
        throw w1.a(null, null);
    }

    public static b g(byte[] bArr) {
        return f(new c.f.a.b.j3.h0(bArr), false);
    }

    public static void h(c.f.a.b.j3.h0 h0Var, int i2, int i3) {
        if (h0Var.g()) {
            c.f.a.b.j3.z.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (h0Var.g()) {
            h0Var.r(14);
        }
        boolean zG = h0Var.g();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6 || i2 == 20) {
            h0Var.r(3);
        }
        if (zG) {
            if (i2 == 22) {
                h0Var.r(16);
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                h0Var.r(3);
            }
            h0Var.r(1);
        }
    }
}
