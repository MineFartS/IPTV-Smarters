package c.f.a.c.j.h;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e9 f13373a;

    static {
        f13373a = (c9.l() && c9.m() && !v4.a()) ? new h9() : new f9();
    }

    public static boolean a(byte[] bArr) {
        return f13373a.a(bArr, 0, bArr.length);
    }

    public static boolean b(byte[] bArr, int i2, int i3) {
        return f13373a.a(bArr, i2, i3);
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char cCharAt2 = charSequence.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new g9(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i4) + IjkMediaMeta.AV_CH_WIDE_RIGHT);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int d(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return f13373a.d(charSequence, bArr, i2, i3);
    }

    public static String e(byte[] bArr, int i2, int i3) {
        return f13373a.c(bArr, i2, i3);
    }

    public static /* synthetic */ int h(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return j(b2);
        }
        if (i4 == 1) {
            return k(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return l(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static int j(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    public static int k(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int l(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
