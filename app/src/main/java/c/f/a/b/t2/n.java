package c.f.a.b.t2;

import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10129a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10130b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10131c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10132d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f10133e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f10134f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10140f;

        public b(String str, int i2, int i3, int i4, int i5, int i6) {
            this.f10135a = str;
            this.f10136b = i2;
            this.f10138d = i3;
            this.f10137c = i4;
            this.f10139e = i5;
            this.f10140f = i6;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i2 = iPosition; i2 <= iLimit; i2++) {
            if ((x0.I(byteBuffer, i2 + 4) & (-2)) == -126718022) {
                return i2 - iPosition;
            }
        }
        return -1;
    }

    public static int b(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f10130b;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = f10134f;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return (iArr2[i4] + (i3 % 2)) * 2;
        }
        int i6 = f10133e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static k1 c(c.f.a.b.j3.i0 i0Var, String str, String str2, c.f.a.b.x2.w wVar) {
        int i2 = f10130b[(i0Var.D() & 192) >> 6];
        int iD = i0Var.D();
        int i3 = f10132d[(iD & 56) >> 3];
        if ((iD & 4) != 0) {
            i3++;
        }
        return new k1.b().S(str).e0("audio/ac3").H(i3).f0(i2).L(wVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f10129a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static b e(c.f.a.b.j3.h0 h0Var) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iH;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iE = h0Var.e();
        h0Var.r(40);
        boolean z = h0Var.h(5) > 10;
        h0Var.p(iE);
        int i12 = -1;
        if (z) {
            h0Var.r(16);
            int iH2 = h0Var.h(2);
            if (iH2 == 0) {
                i12 = 0;
            } else if (iH2 == 1) {
                i12 = 1;
            } else if (iH2 == 2) {
                i12 = 2;
            }
            h0Var.r(3);
            int iH3 = (h0Var.h(11) + 1) * 2;
            int iH4 = h0Var.h(2);
            if (iH4 == 3) {
                i8 = f10131c[h0Var.h(2)];
                iH = 3;
                i7 = 6;
            } else {
                iH = h0Var.h(2);
                i7 = f10129a[iH];
                i8 = f10130b[iH4];
            }
            int i13 = i7 * 256;
            int iH5 = h0Var.h(3);
            boolean zG = h0Var.g();
            int i14 = f10132d[iH5] + (zG ? 1 : 0);
            h0Var.r(10);
            if (h0Var.g()) {
                h0Var.r(8);
            }
            if (iH5 == 0) {
                h0Var.r(5);
                if (h0Var.g()) {
                    h0Var.r(8);
                }
            }
            if (i12 == 1 && h0Var.g()) {
                h0Var.r(16);
            }
            if (h0Var.g()) {
                if (iH5 > 2) {
                    h0Var.r(2);
                }
                if ((iH5 & 1) == 0 || iH5 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    h0Var.r(6);
                }
                if ((iH5 & 4) != 0) {
                    h0Var.r(i10);
                }
                if (zG && h0Var.g()) {
                    h0Var.r(5);
                }
                if (i12 == 0) {
                    if (h0Var.g()) {
                        i11 = 6;
                        h0Var.r(6);
                    } else {
                        i11 = 6;
                    }
                    if (iH5 == 0 && h0Var.g()) {
                        h0Var.r(i11);
                    }
                    if (h0Var.g()) {
                        h0Var.r(i11);
                    }
                    int iH6 = h0Var.h(2);
                    if (iH6 == 1) {
                        h0Var.r(5);
                    } else if (iH6 == 2) {
                        h0Var.r(12);
                    } else if (iH6 == 3) {
                        int iH7 = h0Var.h(5);
                        if (h0Var.g()) {
                            h0Var.r(5);
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                h0Var.r(4);
                            }
                            if (h0Var.g()) {
                                if (h0Var.g()) {
                                    h0Var.r(4);
                                }
                                if (h0Var.g()) {
                                    h0Var.r(4);
                                }
                            }
                        }
                        if (h0Var.g()) {
                            h0Var.r(5);
                            if (h0Var.g()) {
                                h0Var.r(7);
                                if (h0Var.g()) {
                                    h0Var.r(8);
                                }
                            }
                        }
                        h0Var.r((iH7 + 2) * 8);
                        h0Var.c();
                    }
                    if (iH5 < 2) {
                        if (h0Var.g()) {
                            h0Var.r(14);
                        }
                        if (iH5 == 0 && h0Var.g()) {
                            h0Var.r(14);
                        }
                    }
                    if (h0Var.g()) {
                        if (iH == 0) {
                            h0Var.r(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (h0Var.g()) {
                                    h0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (h0Var.g()) {
                h0Var.r(5);
                if (iH5 == 2) {
                    h0Var.r(4);
                }
                if (iH5 >= 6) {
                    h0Var.r(2);
                }
                if (h0Var.g()) {
                    h0Var.r(8);
                }
                if (iH5 == 0 && h0Var.g()) {
                    h0Var.r(8);
                }
                if (iH4 < 3) {
                    h0Var.q();
                }
            }
            if (i12 == 0 && iH != 3) {
                h0Var.q();
            }
            if (i12 == 2 && (iH == 3 || h0Var.g())) {
                i9 = 6;
                h0Var.r(6);
            } else {
                i9 = 6;
            }
            str = (h0Var.g() && h0Var.h(i9) == 1 && h0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i6 = i13;
            i2 = iH3;
            i3 = i8;
            i4 = i14;
        } else {
            h0Var.r(32);
            int iH8 = h0Var.h(2);
            String str2 = iH8 == 3 ? null : "audio/ac3";
            int iB = b(iH8, h0Var.h(6));
            h0Var.r(8);
            int iH9 = h0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                h0Var.r(2);
            }
            if ((iH9 & 4) != 0) {
                h0Var.r(2);
            }
            if (iH9 == 2) {
                h0Var.r(2);
            }
            int[] iArr = f10130b;
            str = str2;
            i2 = iB;
            i3 = iH8 < iArr.length ? iArr[iH8] : -1;
            i4 = f10132d[iH9] + (h0Var.g() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new b(str, i5, i4, i3, i2, i6);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static k1 g(c.f.a.b.j3.i0 i0Var, String str, String str2, c.f.a.b.x2.w wVar) {
        i0Var.Q(2);
        int i2 = f10130b[(i0Var.D() & 192) >> 6];
        int iD = i0Var.D();
        int i3 = f10132d[(iD & 14) >> 1];
        if ((iD & 1) != 0) {
            i3++;
        }
        if (((i0Var.D() & 30) >> 1) > 0 && (2 & i0Var.D()) != 0) {
            i3 += 2;
        }
        return new k1.b().S(str).e0((i0Var.a() <= 0 || (i0Var.D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i3).f0(i2).L(wVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
