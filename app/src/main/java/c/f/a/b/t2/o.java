package c.f.a.b.t2;

import c.f.a.b.k1;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10148a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10153e;

        public b(int i2, int i3, int i4, int i5, int i6) {
            this.f10149a = i2;
            this.f10151c = i3;
            this.f10150b = i4;
            this.f10152d = i5;
            this.f10153e = i6;
        }
    }

    public static void a(int i2, c.f.a.b.j3.i0 i0Var) {
        i0Var.L(7);
        byte[] bArrD = i0Var.d();
        bArrD[0] = -84;
        bArrD[1] = 64;
        bArrD[2] = -1;
        bArrD[3] = -1;
        bArrD[4] = (byte) ((i2 >> 16) & 255);
        bArrD[5] = (byte) ((i2 >> 8) & 255);
        bArrD[6] = (byte) (i2 & 255);
    }

    public static k1 b(c.f.a.b.j3.i0 i0Var, String str, String str2, c.f.a.b.x2.w wVar) {
        i0Var.Q(1);
        return new k1.b().S(str).e0("audio/ac4").H(2).f0(((i0Var.D() & 32) >> 5) == 1 ? 48000 : 44100).L(wVar).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new c.f.a.b.j3.h0(bArr)).f10153e;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.t2.o.b d(c.f.a.b.j3.h0 r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.h(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = f(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.h(r1)
            boolean r5 = r10.g()
            if (r5 == 0) goto L45
            int r5 = r10.h(r3)
            if (r5 <= 0) goto L45
            r10.r(r0)
        L45:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L58
        L55:
            r9 = 44100(0xac44, float:6.1797E-41)
        L58:
            int r10 = r10.h(r2)
            r5 = 0
            if (r9 != r8) goto L69
            r8 = 13
            if (r10 != r8) goto L69
            int[] r0 = c.f.a.b.t2.o.f10148a
            r10 = r0[r10]
            r8 = r10
            goto L99
        L69:
            if (r9 != r6) goto L98
            int[] r6 = c.f.a.b.t2.o.f10148a
            int r8 = r6.length
            if (r10 >= r8) goto L98
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8e
            r8 = 11
            if (r1 == r0) goto L89
            if (r1 == r3) goto L8e
            if (r1 == r2) goto L82
            goto L93
        L82:
            if (r10 == r3) goto L95
            if (r10 == r6) goto L95
            if (r10 != r8) goto L93
            goto L95
        L89:
            if (r10 == r6) goto L95
            if (r10 != r8) goto L93
            goto L95
        L8e:
            if (r10 == r3) goto L95
            if (r10 != r6) goto L93
            goto L95
        L93:
            r8 = r5
            goto L99
        L95:
            int r5 = r5 + 1
            goto L93
        L98:
            r8 = 0
        L99:
            c.f.a.b.t2.o$b r10 = new c.f.a.b.t2.o$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t2.o.d(c.f.a.b.j3.h0):c.f.a.b.t2.o$b");
    }

    public static int e(byte[] bArr, int i2) {
        int i3 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i4 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i4 == 65535) {
            i4 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i3 = 4;
        }
        if (i2 == 44097) {
            i3 += 2;
        }
        return i4 + i3;
    }

    public static int f(c.f.a.b.j3.h0 h0Var, int i2) {
        int i3 = 0;
        while (true) {
            int iH = i3 + h0Var.h(i2);
            if (!h0Var.g()) {
                return iH;
            }
            i3 = (iH + 1) << i2;
        }
    }
}
