package com.google.ads.interactivemedia.v3.internal;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public final class nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22563a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f22564b = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.ads.interactivemedia.v3.internal.ns a(com.google.ads.interactivemedia.v3.internal.alw r10) {
        /*
            r0 = 16
            int r1 = r10.c(r0)
            int r0 = r10.c(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.c(r0)
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
            r1 = 2
            int r3 = r10.c(r1)
            r4 = 3
            if (r3 != r4) goto L32
        L29:
            r10.c(r1)
            boolean r3 = r10.k()
            if (r3 != 0) goto L29
        L32:
            r3 = 10
            int r3 = r10.c(r3)
            boolean r5 = r10.k()
            if (r5 == 0) goto L47
            int r5 = r10.c(r4)
            if (r5 <= 0) goto L47
            r10.i(r1)
        L47:
            boolean r5 = r10.k()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 1
            if (r8 == r5) goto L58
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L5b
        L58:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L5b:
            int r10 = r10.c(r2)
            r9 = 0
            if (r5 != r6) goto L6b
            r6 = 13
            if (r10 != r6) goto L6b
            int[] r10 = com.google.ads.interactivemedia.v3.internal.nt.f22564b
            r9 = r10[r6]
            goto L96
        L6b:
            if (r5 != r7) goto L96
            r6 = 14
            if (r10 >= r6) goto L96
            int[] r6 = com.google.ads.interactivemedia.v3.internal.nt.f22564b
            r9 = r6[r10]
            int r3 = r3 % 5
            r6 = 8
            if (r3 == r8) goto L90
            r7 = 11
            if (r3 == r1) goto L8b
            if (r3 == r4) goto L90
            if (r3 == r2) goto L84
            goto L96
        L84:
            if (r10 == r4) goto L94
            if (r10 == r6) goto L94
            if (r10 != r7) goto L96
            goto L94
        L8b:
            if (r10 == r6) goto L94
            if (r10 != r7) goto L96
            goto L94
        L90:
            if (r10 == r4) goto L94
            if (r10 != r6) goto L96
        L94:
            int r9 = r9 + 1
        L96:
            com.google.ads.interactivemedia.v3.internal.ns r10 = new com.google.ads.interactivemedia.v3.internal.ns
            r10.<init>(r5, r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.nt.a(com.google.ads.interactivemedia.v3.internal.alw):com.google.ads.interactivemedia.v3.internal.ns");
    }

    public static void b(int i2, alx alxVar) {
        alxVar.E(7);
        byte[] bArrK = alxVar.K();
        bArrK[0] = -84;
        bArrK[1] = 64;
        bArrK[2] = -1;
        bArrK[3] = -1;
        bArrK[4] = (byte) ((i2 >> 16) & 255);
        bArrK[5] = (byte) ((i2 >> 8) & 255);
        bArrK[6] = (byte) (i2 & 255);
    }
}
