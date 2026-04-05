package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class np {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22545a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f22546b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f22547c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int a(int i2) {
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

    public static no b(byte[] bArr) {
        return c(new alw(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        if (r12 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.ads.interactivemedia.v3.internal.no c(com.google.ads.interactivemedia.v3.internal.alw r12, boolean r13) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.np.c(com.google.ads.interactivemedia.v3.internal.alw, boolean):com.google.ads.interactivemedia.v3.internal.no");
    }

    private static int d(alw alwVar) {
        int iC = alwVar.c(5);
        return iC == 31 ? alwVar.c(6) + 32 : iC;
    }

    private static int e(alw alwVar) throws lb {
        int iC = alwVar.c(4);
        if (iC == 15) {
            return alwVar.c(24);
        }
        if (iC < 13) {
            return f22546b[iC];
        }
        throw new lb();
    }
}
