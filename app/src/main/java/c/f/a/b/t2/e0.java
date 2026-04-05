package c.f.a.b.t2;

import c.f.a.b.k1;
import com.amazonaws.event.ProgressEvent;
import java.nio.ByteBuffer;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10051a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10052b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10053c = {64, 112, 128, 192, 224, 256, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, ProgressEvent.PART_FAILED_EVENT_CODE, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t2.e0.a(byte[]):int");
    }

    public static c.f.a.b.j3.h0 b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new c.f.a.b.j3.h0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b2 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b2;
            }
        }
        c.f.a.b.j3.h0 h0Var = new c.f.a.b.j3.h0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            c.f.a.b.j3.h0 h0Var2 = new c.f.a.b.j3.h0(bArrCopyOf);
            while (h0Var2.b() >= 16) {
                h0Var2.r(2);
                h0Var.f(h0Var2.h(14), 14);
            }
        }
        h0Var.n(bArrCopyOf);
        return h0Var;
    }

    public static boolean c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    public static boolean d(int i2) {
        return i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iPosition = byteBuffer.position();
        byte b2 = byteBuffer.get(iPosition);
        if (b2 != -2) {
            if (b2 == -1) {
                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                i5 = iPosition + 7;
            } else if (b2 != 31) {
                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                i3 = iPosition + 5;
            } else {
                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                i5 = iPosition + 6;
            }
            i4 = byteBuffer.get(i5) & 60;
            return (((i4 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        i3 = iPosition + 4;
        i4 = byteBuffer.get(i3) & 252;
        return (((i4 >> 2) | i2) + 1) * 32;
    }

    public static int f(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static k1 g(byte[] bArr, String str, String str2, c.f.a.b.x2.w wVar) {
        c.f.a.b.j3.h0 h0VarB = b(bArr);
        h0VarB.r(60);
        int i2 = f10051a[h0VarB.h(6)];
        int i3 = f10052b[h0VarB.h(4)];
        int iH = h0VarB.h(5);
        int[] iArr = f10053c;
        int i4 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        h0VarB.r(10);
        return new k1.b().S(str).e0("audio/vnd.dts").G(i4).H(i2 + (h0VarB.h(2) > 0 ? 1 : 0)).f0(i3).L(wVar).V(str2).E();
    }
}
