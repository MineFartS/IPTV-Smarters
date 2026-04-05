package com.google.ads.interactivemedia.v3.internal;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class bni {
    public bni() {
    }

    public bni(byte[] bArr) {
        this();
    }

    private static int A(byte b2) {
        return b2 & 63;
    }

    private static boolean B(byte b2) {
        return b2 > -65;
    }

    public static /* synthetic */ void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws blf {
        if (B(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || B(b4) || B(b5)) {
            throw blf.d();
        }
        int iA = ((b2 & 7) << 18) | (A(b3) << 12) | (A(b4) << 6) | A(b5);
        cArr[i2] = (char) ((iA >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((iA & 1023) + 56320);
    }

    public static /* synthetic */ void b(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    public static /* synthetic */ void c(byte b2, byte b3, char[] cArr, int i2) throws blf {
        if (b2 < -62 || B(b3)) {
            throw blf.d();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | A(b3));
    }

    public static /* synthetic */ void d(byte b2, byte b3, byte b4, char[] cArr, int i2) throws blf {
        if (!B(b3)) {
            if (b2 != -32) {
                if ((b2 == -19 || b3 < -96) && !B(b4)) {
                    cArr[i2] = (char) (((b2 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 12) | (A(b3) << 6) | A(b4));
                    return;
                }
            } else if (b3 >= -96) {
                b2 = -32;
                if (b2 == -19) {
                    cArr[i2] = (char) (((b2 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 12) | (A(b3) << 6) | A(b4));
                    return;
                } else {
                    cArr[i2] = (char) (((b2 & DateTimeFieldType.CLOCKHOUR_OF_HALFDAY) << 12) | (A(b3) << 6) | A(b4));
                    return;
                }
            }
        }
        throw blf.d();
    }

    public static /* synthetic */ boolean e(byte b2) {
        return b2 >= 0;
    }

    public static /* synthetic */ boolean f(byte b2) {
        return b2 < -32;
    }

    public static /* synthetic */ boolean g(byte b2) {
        return b2 < -16;
    }

    public static /* bridge */ /* synthetic */ void n(Object obj, int i2, int i3) {
        ((bmz) obj).h(bnp.c(i2, 5), Integer.valueOf(i3));
    }

    public static /* bridge */ /* synthetic */ void o(Object obj, int i2, long j2) {
        ((bmz) obj).h(bnp.c(i2, 1), Long.valueOf(j2));
    }

    public static /* bridge */ /* synthetic */ void p(Object obj, int i2, Object obj2) {
        ((bmz) obj).h(bnp.c(i2, 3), obj2);
    }

    public static /* bridge */ /* synthetic */ void q(Object obj, int i2, bkd bkdVar) {
        ((bmz) obj).h(bnp.c(i2, 2), bkdVar);
    }

    public static /* bridge */ /* synthetic */ void r(Object obj, int i2, long j2) {
        ((bmz) obj).h(bnp.c(i2, 0), Long.valueOf(j2));
    }

    public static bmz s(Object obj) {
        return ((bkx) obj).f21334c;
    }

    public static /* bridge */ /* synthetic */ Object v(Object obj, Object obj2) {
        bmz bmzVar = (bmz) obj2;
        return bmzVar.equals(bmz.c()) ? obj : bmz.d((bmz) obj, bmzVar);
    }

    public static void x(Object obj, bmz bmzVar) {
        ((bkx) obj).f21334c = bmzVar;
    }

    public static /* bridge */ /* synthetic */ Object y(Object obj) {
        bmz bmzVar = (bmz) obj;
        bmzVar.f();
        return bmzVar;
    }

    public final boolean h(Object obj, bmj bmjVar) throws blf {
        int iD = bmjVar.d();
        int iA = bnp.a(iD);
        int iB = bnp.b(iD);
        if (iB == 0) {
            r(obj, iA, bmjVar.l());
            return true;
        }
        if (iB == 1) {
            o(obj, iA, bmjVar.k());
            return true;
        }
        if (iB == 2) {
            q(obj, iA, bmjVar.p());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw blf.a();
            }
            n(obj, iA, bmjVar.f());
            return true;
        }
        int iC = bnp.c(iA, 4);
        Object objE = bmz.e();
        while (bmjVar.c() != Integer.MAX_VALUE && h(objE, bmjVar)) {
        }
        if (iC != bmjVar.d()) {
            throw blf.b();
        }
        p(obj, iA, y(objE));
        return true;
    }

    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        bmz bmzVarS = s(obj);
        if (bmzVarS != bmz.c()) {
            return bmzVarS;
        }
        bmz bmzVarE = bmz.e();
        x(obj, bmzVarE);
        return bmzVarE;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        return s(obj);
    }

    public final void k(Object obj) {
        s(obj).f();
    }

    public final /* bridge */ /* synthetic */ void l(Object obj, Object obj2) {
        x(obj, (bmz) obj2);
    }

    public final /* bridge */ /* synthetic */ void m(Object obj, Object obj2) {
        x(obj, (bmz) obj2);
    }
}
