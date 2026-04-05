package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class nr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22553a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f22554b = {1, 2, 3, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f22555c = {48000, 44100, 32000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f22556d = {24000, 22050, 16000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f22557e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f22558f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 576, 640};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f22559g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f22554b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return f((b2 & 192) >> 6, b2 & 63);
        }
        int i2 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i2 + i2;
    }

    public static ke c(alx alxVar, String str, String str2, qg qgVar) {
        int i2 = f22555c[(alxVar.k() & 192) >> 6];
        int iK = alxVar.k();
        int i3 = f22557e[(iK & 56) >> 3];
        if ((iK & 4) != 0) {
            i3++;
        }
        kd kdVar = new kd();
        kdVar.S(str);
        kdVar.ae("audio/ac3");
        kdVar.H(i3);
        kdVar.af(i2);
        kdVar.L(qgVar);
        kdVar.V(str2);
        return kdVar.s();
    }

    public static ke d(alx alxVar, String str, String str2, qg qgVar) {
        alxVar.J(2);
        int i2 = f22555c[(alxVar.k() & 192) >> 6];
        int iK = alxVar.k();
        int i3 = f22557e[(iK & 14) >> 1];
        if ((iK & 1) != 0) {
            i3++;
        }
        if (((alxVar.k() & 30) >> 1) > 0 && (2 & alxVar.k()) != 0) {
            i3 += 2;
        }
        String str3 = (alxVar.a() <= 0 || (alxVar.k() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        kd kdVar = new kd();
        kdVar.S(str);
        kdVar.ae(str3);
        kdVar.H(i3);
        kdVar.af(i2);
        kdVar.L(qgVar);
        kdVar.V(str2);
        return kdVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.ads.interactivemedia.v3.internal.nq e(com.google.ads.interactivemedia.v3.internal.alw r19) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.nr.e(com.google.ads.interactivemedia.v3.internal.alw):com.google.ads.interactivemedia.v3.internal.nq");
    }

    private static int f(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = f22555c[i2];
        if (i5 == 44100) {
            int i6 = f22559g[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = f22558f[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }
}
