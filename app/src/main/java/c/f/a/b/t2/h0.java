package c.f.a.b.t2;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f10065a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10066b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10067c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10068d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10069e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f10070f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f10071g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10078g;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(int r9) {
            /*
                r8 = this;
                boolean r0 = c.f.a.b.t2.h0.a(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto Lac
                if (r5 != r6) goto L21
                goto Lac
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.f10072a = r0
                java.lang.String[] r1 = c.f.a.b.t2.h0.b()
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f10073b = r1
                int[] r1 = c.f.a.b.t2.h0.c()
                r1 = r1[r6]
                r8.f10075d = r1
                r6 = 2
                if (r0 != r6) goto L42
                int r1 = r1 / r6
            L3f:
                r8.f10075d = r1
                goto L47
            L42:
                if (r0 != 0) goto L47
                int r1 = r1 / 4
                goto L3f
            L47:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = c.f.a.b.t2.h0.d(r0, r4)
                r8.f10078g = r7
                if (r4 != r2) goto L70
                if (r0 != r2) goto L5c
                int[] r0 = c.f.a.b.t2.h0.e()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L63
            L5c:
                int[] r0 = c.f.a.b.t2.h0.f()
                int r5 = r5 - r3
                r0 = r0[r5]
            L63:
                r8.f10077f = r0
                int r0 = r0 * 12
                int r4 = r8.f10075d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L6d:
                r8.f10074c = r0
                goto La3
            L70:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L8e
                if (r4 != r6) goto L7e
                int[] r0 = c.f.a.b.t2.h0.g()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L85
            L7e:
                int[] r0 = c.f.a.b.t2.h0.h()
                int r5 = r5 - r3
                r0 = r0[r5]
            L85:
                r8.f10077f = r0
                int r0 = r0 * 144
                int r4 = r8.f10075d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L6d
            L8e:
                int[] r0 = c.f.a.b.t2.h0.i()
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f10077f = r0
                if (r4 != r3) goto L9b
                r7 = 72
            L9b:
                int r7 = r7 * r0
                int r0 = r8.f10075d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f10074c = r7
            La3:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto La9
                r6 = 1
            La9:
                r8.f10076e = r6
                return r3
            Lac:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t2.h0.a.a(int):boolean");
        }
    }

    public static int j(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!l(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f10066b[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f10067c[i5 - 1] : f10068d[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? f10069e[i5 - 1] : f10070f[i5 - 1] : f10071g[i5 - 1];
        int i10 = IjkMediaMeta.FF_PROFILE_H264_HIGH_444;
        if (i3 == 3) {
            return ((i9 * IjkMediaMeta.FF_PROFILE_H264_HIGH_444) / i7) + i8;
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return ((i10 * i9) / i7) + i8;
    }

    public static int k(int i2, int i3) {
        if (i3 == 1) {
            return i2 == 3 ? 1152 : 576;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    public static int m(int i2) {
        int i3;
        int i4;
        if (!l(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return k(i3, i4);
    }
}
