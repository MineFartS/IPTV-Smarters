package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22705a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f22706b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f22707c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f22708d = {64, 112, 128, 192, 224, 256, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, ProgressEvent.PART_FAILED_EVENT_CODE, 6144, 7680};

    public static ke a(byte[] bArr, String str, String str2) {
        alw alwVar;
        if (bArr[0] == 127) {
            alwVar = new alw(bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = bArrCopyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                    byte b3 = bArrCopyOf[i2];
                    int i3 = i2 + 1;
                    bArrCopyOf[i2] = bArrCopyOf[i3];
                    bArrCopyOf[i3] = b3;
                }
            }
            alwVar = new alw(bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                alw alwVar2 = new alw(bArrCopyOf);
                while (alwVar2.a() >= 16) {
                    alwVar2.i(2);
                    alwVar.l(alwVar2.c(14));
                }
            }
            alwVar.e(bArrCopyOf);
        }
        alwVar.i(60);
        int i4 = f22706b[alwVar.c(6)];
        int i5 = f22707c[alwVar.c(4)];
        int iC = alwVar.c(5);
        int i6 = iC < 29 ? (f22708d[iC] * 1000) / 2 : -1;
        alwVar.i(10);
        int i7 = alwVar.c(2) > 0 ? 1 : 0;
        kd kdVar = new kd();
        kdVar.S(str);
        kdVar.ae("audio/vnd.dts");
        kdVar.G(i6);
        kdVar.H(i4 + i7);
        kdVar.af(i5);
        kdVar.L(null);
        kdVar.V(str2);
        return kdVar.s();
    }
}
