package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends yt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zl f23868a = new zl() { // from class: com.google.ads.interactivemedia.v3.internal.zk
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zl f23869b;

    public zn() {
        this(null);
    }

    public zn(zl zlVar) {
        this.f23869b = zlVar;
    }

    private static int d(int i2) {
        return (i2 == 0 || i2 == 3) ? 1 : 2;
    }

    private static int e(byte[] bArr, int i2, int i3) {
        int iF = f(bArr, i2);
        if (i3 == 0 || i3 == 3) {
            return iF;
        }
        while (true) {
            int length = bArr.length;
            if (iF >= length - 1) {
                return length;
            }
            if (iF % 2 == 0 && bArr[iF + 1] == 0) {
                return iF;
            }
            iF = f(bArr, iF + 1);
        }
    }

    private static int f(byte[] bArr, int i2) {
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                return length;
            }
            if (bArr[i2] == 0) {
                return i2;
            }
            i2++;
        }
    }

    private static int g(alx alxVar, int i2) {
        byte[] bArrK = alxVar.K();
        int iC = alxVar.c();
        int i3 = iC;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= iC + i2) {
                return i2;
            }
            if ((bArrK[i3] & 255) == 255 && bArrK[i4] == 0) {
                System.arraycopy(bArrK, i3 + 2, bArrK, i4, (i2 - (i3 - iC)) - 2);
                i2--;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x027c A[Catch: UnsupportedEncodingException -> 0x02f9, all -> 0x0546, TRY_LEAVE, TryCatch #0 {all -> 0x0546, blocks: (B:231:0x0517, B:233:0x0542, B:124:0x0219, B:138:0x0269, B:140:0x027c, B:142:0x0283, B:144:0x0294, B:146:0x029e, B:156:0x02d5, B:145:0x0299, B:150:0x02aa, B:152:0x02c3, B:154:0x02cb, B:155:0x02d0, B:169:0x0318, B:178:0x0360, B:181:0x0393, B:184:0x03a4, B:185:0x03ac, B:187:0x03b2, B:189:0x03b9, B:190:0x03bd, B:197:0x03df, B:201:0x040a, B:203:0x0414, B:204:0x0445, B:205:0x0451, B:207:0x0457, B:209:0x045e, B:210:0x0462, B:214:0x0477, B:223:0x04a3, B:225:0x04de, B:226:0x04ed, B:229:0x0505), top: B:251:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02aa A[Catch: all -> 0x0546, UnsupportedEncodingException -> 0x054a, TryCatch #0 {all -> 0x0546, blocks: (B:231:0x0517, B:233:0x0542, B:124:0x0219, B:138:0x0269, B:140:0x027c, B:142:0x0283, B:144:0x0294, B:146:0x029e, B:156:0x02d5, B:145:0x0299, B:150:0x02aa, B:152:0x02c3, B:154:0x02cb, B:155:0x02d0, B:169:0x0318, B:178:0x0360, B:181:0x0393, B:184:0x03a4, B:185:0x03ac, B:187:0x03b2, B:189:0x03b9, B:190:0x03bd, B:197:0x03df, B:201:0x040a, B:203:0x0414, B:204:0x0445, B:205:0x0451, B:207:0x0457, B:209:0x045e, B:210:0x0462, B:214:0x0477, B:223:0x04a3, B:225:0x04de, B:226:0x04ed, B:229:0x0505), top: B:251:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0517 A[Catch: all -> 0x0546, UnsupportedEncodingException -> 0x054a, TRY_LEAVE, TryCatch #0 {all -> 0x0546, blocks: (B:231:0x0517, B:233:0x0542, B:124:0x0219, B:138:0x0269, B:140:0x027c, B:142:0x0283, B:144:0x0294, B:146:0x029e, B:156:0x02d5, B:145:0x0299, B:150:0x02aa, B:152:0x02c3, B:154:0x02cb, B:155:0x02d0, B:169:0x0318, B:178:0x0360, B:181:0x0393, B:184:0x03a4, B:185:0x03ac, B:187:0x03b2, B:189:0x03b9, B:190:0x03bd, B:197:0x03df, B:201:0x040a, B:203:0x0414, B:204:0x0445, B:205:0x0451, B:207:0x0457, B:209:0x045e, B:210:0x0462, B:214:0x0477, B:223:0x04a3, B:225:0x04de, B:226:0x04ed, B:229:0x0505), top: B:251:0x00ed }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.ads.interactivemedia.v3.internal.zo h(int r34, com.google.ads.interactivemedia.v3.internal.alx r35, boolean r36, int r37, com.google.ads.interactivemedia.v3.internal.zl r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zn.h(int, com.google.ads.interactivemedia.v3.internal.alx, boolean, int, com.google.ads.interactivemedia.v3.internal.zl):com.google.ads.interactivemedia.v3.internal.zo");
    }

    private static String i(byte[] bArr, int i2, int i3, String str) {
        return (i3 <= i2 || i3 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i2, i3 - i2, str);
    }

    private static String j(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String k(int i2, int i3, int i4, int i5, int i6) {
        return i2 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
    }

    private static boolean l(alx alxVar, int i2, int i3, boolean z) {
        int iM;
        long jM;
        int iO;
        int i4;
        int iC = alxVar.c();
        while (true) {
            try {
                if (alxVar.a() < i3) {
                    return true;
                }
                if (i2 >= 3) {
                    iM = alxVar.e();
                    jM = alxVar.s();
                    iO = alxVar.o();
                } else {
                    iM = alxVar.m();
                    jM = alxVar.m();
                    iO = 0;
                }
                if (iM == 0 && jM == 0 && iO == 0) {
                    return true;
                }
                if (i2 == 4 && !z) {
                    if ((8421504 & jM) != 0) {
                        return false;
                    }
                    jM = ((jM >> 24) << 21) | ((255 & (jM >> 16)) << 14) | (jM & 255) | (((jM >> 8) & 255) << 7);
                }
                if (i2 == 4) {
                    i = iO & 1;
                    i4 = (iO & 64) == 0 ? 0 : 1;
                } else {
                    if (i2 == 3) {
                        i4 = (iO & 32) != 0 ? 1 : 0;
                        if ((iO & 128) == 0) {
                        }
                    } else {
                        i4 = 0;
                    }
                    i = 0;
                }
                if (i != 0) {
                    i4 += 4;
                }
                if (jM < i4) {
                    return false;
                }
                if (alxVar.a() < jM) {
                    return false;
                }
                alxVar.J((int) jM);
            } finally {
                alxVar.I(iC);
            }
        }
    }

    private static byte[] m(byte[] bArr, int i2, int i3) {
        return i3 <= i2 ? amn.f20140f : Arrays.copyOfRange(bArr, i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yt
    public final ys b(ByteBuffer byteBuffer) {
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.ys c(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zn.c(byte[], int):com.google.ads.interactivemedia.v3.internal.ys");
    }
}
