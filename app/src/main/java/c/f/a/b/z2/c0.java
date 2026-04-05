package c.f.a.b.z2;

import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f10659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f10661e;

        public a(int i2, int i3, long[] jArr, int i4, boolean z) {
            this.f10657a = i2;
            this.f10658b = i3;
            this.f10659c = jArr;
            this.f10660d = i4;
            this.f10661e = z;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f10663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10664c;

        public b(String str, String[] strArr, int i2) {
            this.f10662a = str;
            this.f10663b = strArr;
            this.f10664c = i2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10668d;

        public c(boolean z, int i2, int i3, int i4) {
            this.f10665a = z;
            this.f10666b = i2;
            this.f10667c = i3;
            this.f10668d = i4;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f10675g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f10676h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f10677i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f10678j;

        public d(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, byte[] bArr) {
            this.f10669a = i2;
            this.f10670b = i3;
            this.f10671c = i4;
            this.f10672d = i5;
            this.f10673e = i6;
            this.f10674f = i7;
            this.f10675g = i8;
            this.f10676h = i9;
            this.f10677i = z;
            this.f10678j = bArr;
        }
    }

    public static int a(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static long b(long j2, long j3) {
        double d2 = j3;
        Double.isNaN(d2);
        return (long) Math.floor(Math.pow(j2, 1.0d / d2));
    }

    public static a c(b0 b0Var) throws w1 {
        if (b0Var.d(24) != 5653314) {
            throw w1.a("expected code book to start with [0x56, 0x43, 0x42] at " + b0Var.b(), null);
        }
        int iD = b0Var.d(16);
        int iD2 = b0Var.d(24);
        long[] jArr = new long[iD2];
        boolean zC = b0Var.c();
        long jB = 0;
        if (zC) {
            int iD3 = b0Var.d(5) + 1;
            int i2 = 0;
            while (i2 < iD2) {
                int iD4 = b0Var.d(a(iD2 - i2));
                for (int i3 = 0; i3 < iD4 && i2 < iD2; i3++) {
                    jArr[i2] = iD3;
                    i2++;
                }
                iD3++;
            }
        } else {
            boolean zC2 = b0Var.c();
            for (int i4 = 0; i4 < iD2; i4++) {
                if (!zC2) {
                    jArr[i4] = b0Var.d(5) + 1;
                } else if (b0Var.c()) {
                    jArr[i4] = b0Var.d(5) + 1;
                } else {
                    jArr[i4] = 0;
                }
            }
        }
        int iD5 = b0Var.d(4);
        if (iD5 > 2) {
            throw w1.a("lookup type greater than 2 not decodable: " + iD5, null);
        }
        if (iD5 == 1 || iD5 == 2) {
            b0Var.e(32);
            b0Var.e(32);
            int iD6 = b0Var.d(4) + 1;
            b0Var.e(1);
            if (iD5 != 1) {
                jB = ((long) iD2) * ((long) iD);
            } else if (iD != 0) {
                jB = b(iD2, iD);
            }
            b0Var.e((int) (jB * ((long) iD6)));
        }
        return new a(iD, iD2, jArr, iD5, zC);
    }

    public static void d(b0 b0Var) throws w1 {
        int iD = b0Var.d(6) + 1;
        for (int i2 = 0; i2 < iD; i2++) {
            int iD2 = b0Var.d(16);
            if (iD2 == 0) {
                b0Var.e(8);
                b0Var.e(16);
                b0Var.e(16);
                b0Var.e(6);
                b0Var.e(8);
                int iD3 = b0Var.d(4) + 1;
                for (int i3 = 0; i3 < iD3; i3++) {
                    b0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw w1.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = b0Var.d(5);
                int i4 = -1;
                int[] iArr = new int[iD4];
                for (int i5 = 0; i5 < iD4; i5++) {
                    iArr[i5] = b0Var.d(4);
                    if (iArr[i5] > i4) {
                        i4 = iArr[i5];
                    }
                }
                int i6 = i4 + 1;
                int[] iArr2 = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr2[i7] = b0Var.d(3) + 1;
                    int iD5 = b0Var.d(2);
                    if (iD5 > 0) {
                        b0Var.e(8);
                    }
                    for (int i8 = 0; i8 < (1 << iD5); i8++) {
                        b0Var.e(8);
                    }
                }
                b0Var.e(2);
                int iD6 = b0Var.d(4);
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < iD4; i11++) {
                    i9 += iArr2[iArr[i11]];
                    while (i10 < i9) {
                        b0Var.e(iD6);
                        i10++;
                    }
                }
            }
        }
    }

    public static void e(int i2, b0 b0Var) throws w1 {
        int iD = b0Var.d(6) + 1;
        for (int i3 = 0; i3 < iD; i3++) {
            int iD2 = b0Var.d(16);
            if (iD2 != 0) {
                c.f.a.b.j3.z.d("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = b0Var.c() ? b0Var.d(4) + 1 : 1;
                if (b0Var.c()) {
                    int iD4 = b0Var.d(8) + 1;
                    for (int i4 = 0; i4 < iD4; i4++) {
                        int i5 = i2 - 1;
                        b0Var.e(a(i5));
                        b0Var.e(a(i5));
                    }
                }
                if (b0Var.d(2) != 0) {
                    throw w1.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        b0Var.e(4);
                    }
                }
                for (int i7 = 0; i7 < iD3; i7++) {
                    b0Var.e(8);
                    b0Var.e(8);
                    b0Var.e(8);
                }
            }
        }
    }

    public static c[] f(b0 b0Var) {
        int iD = b0Var.d(6) + 1;
        c[] cVarArr = new c[iD];
        for (int i2 = 0; i2 < iD; i2++) {
            cVarArr[i2] = new c(b0Var.c(), b0Var.d(16), b0Var.d(16), b0Var.d(8));
        }
        return cVarArr;
    }

    public static void g(b0 b0Var) throws w1 {
        int iD = b0Var.d(6) + 1;
        for (int i2 = 0; i2 < iD; i2++) {
            if (b0Var.d(16) > 2) {
                throw w1.a("residueType greater than 2 is not decodable", null);
            }
            b0Var.e(24);
            b0Var.e(24);
            b0Var.e(24);
            int iD2 = b0Var.d(6) + 1;
            b0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i3 = 0; i3 < iD2; i3++) {
                iArr[i3] = ((b0Var.c() ? b0Var.d(5) : 0) * 8) + b0Var.d(3);
            }
            for (int i4 = 0; i4 < iD2; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((iArr[i4] & (1 << i5)) != 0) {
                        b0Var.e(8);
                    }
                }
            }
        }
    }

    public static b h(i0 i0Var) {
        return i(i0Var, true, true);
    }

    public static b i(i0 i0Var, boolean z, boolean z2) throws w1 {
        if (z) {
            l(3, i0Var, false);
        }
        String strA = i0Var.A((int) i0Var.t());
        int length = 11 + strA.length();
        long jT = i0Var.t();
        String[] strArr = new String[(int) jT];
        int length2 = length + 4;
        for (int i2 = 0; i2 < jT; i2++) {
            strArr[i2] = i0Var.A((int) i0Var.t());
            length2 = length2 + 4 + strArr[i2].length();
        }
        if (z2 && (i0Var.D() & 1) == 0) {
            throw w1.a("framing bit expected to be set", null);
        }
        return new b(strA, strArr, length2 + 1);
    }

    public static d j(i0 i0Var) throws w1 {
        l(1, i0Var, false);
        int iU = i0Var.u();
        int iD = i0Var.D();
        int iU2 = i0Var.u();
        int iQ = i0Var.q();
        if (iQ <= 0) {
            iQ = -1;
        }
        int iQ2 = i0Var.q();
        if (iQ2 <= 0) {
            iQ2 = -1;
        }
        int iQ3 = i0Var.q();
        if (iQ3 <= 0) {
            iQ3 = -1;
        }
        int iD2 = i0Var.D();
        return new d(iU, iD, iU2, iQ, iQ2, iQ3, (int) Math.pow(2.0d, iD2 & 15), (int) Math.pow(2.0d, (iD2 & 240) >> 4), (i0Var.D() & 1) > 0, Arrays.copyOf(i0Var.d(), i0Var.f()));
    }

    public static c[] k(i0 i0Var, int i2) throws w1 {
        l(5, i0Var, false);
        int iD = i0Var.D() + 1;
        b0 b0Var = new b0(i0Var.d());
        b0Var.e(i0Var.e() * 8);
        for (int i3 = 0; i3 < iD; i3++) {
            c(b0Var);
        }
        int iD2 = b0Var.d(6) + 1;
        for (int i4 = 0; i4 < iD2; i4++) {
            if (b0Var.d(16) != 0) {
                throw w1.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(b0Var);
        g(b0Var);
        e(i2, b0Var);
        c[] cVarArrF = f(b0Var);
        if (b0Var.c()) {
            return cVarArrF;
        }
        throw w1.a("framing bit after modes not set as expected", null);
    }

    public static boolean l(int i2, i0 i0Var, boolean z) throws w1 {
        if (i0Var.a() < 7) {
            if (z) {
                return false;
            }
            throw w1.a("too short header: " + i0Var.a(), null);
        }
        if (i0Var.D() != i2) {
            if (z) {
                return false;
            }
            throw w1.a("expected header type " + Integer.toHexString(i2), null);
        }
        if (i0Var.D() == 118 && i0Var.D() == 111 && i0Var.D() == 114 && i0Var.D() == 98 && i0Var.D() == 105 && i0Var.D() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw w1.a("expected characters 'vorbis'", null);
    }
}
