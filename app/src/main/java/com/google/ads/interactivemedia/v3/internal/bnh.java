package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class bnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f21449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Unsafe f21450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class<?> f21451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f21452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f21453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bng f21454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f21455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f21456i;

    static {
        Unsafe unsafeH = h();
        f21450c = unsafeH;
        f21451d = bjs.a();
        boolean zW = w(Long.TYPE);
        f21452e = zW;
        boolean zW2 = w(Integer.TYPE);
        f21453f = zW2;
        bng bneVar = null;
        if (unsafeH != null) {
            if (zW) {
                bneVar = new bnf(unsafeH);
            } else if (zW2) {
                bneVar = new bne(unsafeH);
            }
        }
        f21454g = bneVar;
        f21455h = bneVar == null ? false : bneVar.q();
        f21456i = bneVar == null ? false : bneVar.p();
        f21448a = C(byte[].class);
        C(boolean[].class);
        H(boolean[].class);
        C(int[].class);
        H(int[].class);
        C(long[].class);
        H(long[].class);
        C(float[].class);
        H(float[].class);
        C(double[].class);
        H(double[].class);
        C(Object[].class);
        H(Object[].class);
        Field fieldD = D();
        if (fieldD != null && bneVar != null) {
            bneVar.r(fieldD);
        }
        f21449b = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private bnh() {
    }

    private static byte A(Object obj, long j2) {
        return (byte) ((c(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255);
    }

    private static byte B(Object obj, long j2) {
        return (byte) ((c(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    private static int C(Class<?> cls) {
        if (f21456i) {
            return f21454g.h(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field D() {
        int i2 = bjs.f21247a;
        Field fieldE = E(Buffer.class, "effectiveDirectAddress");
        if (fieldE != null) {
            return fieldE;
        }
        Field fieldE2 = E(Buffer.class, "address");
        if (fieldE2 == null || fieldE2.getType() != Long.TYPE) {
            return null;
        }
        return fieldE2;
    }

    private static Field E(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        r(obj, j3, ((b2 & 255) << i2) | (c(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        r(obj, j3, ((b2 & 255) << i2) | (c(obj, j3) & ((255 << i2) ^ (-1))));
    }

    private static void H(Class<?> cls) {
        if (f21456i) {
            f21454g.i(cls);
        }
    }

    public static double a(Object obj, long j2) {
        return f21454g.a(obj, j2);
    }

    public static float b(Object obj, long j2) {
        return f21454g.b(obj, j2);
    }

    public static int c(Object obj, long j2) {
        return f21454g.j(obj, j2);
    }

    public static long d(Object obj, long j2) {
        return f21454g.k(obj, j2);
    }

    public static <T> T e(Class<T> cls) {
        try {
            return (T) f21450c.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object f(Object obj, long j2) {
        return f21454g.l(obj, j2);
    }

    public static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged(new bnd());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void i(Throwable th) {
        Logger logger = Logger.getLogger(bnh.class.getName());
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(strValueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    public static void n(Object obj, long j2, boolean z) {
        f21454g.c(obj, j2, z);
    }

    public static void o(byte[] bArr, long j2, byte b2) {
        f21454g.d(bArr, f21448a + j2, b2);
    }

    public static void p(Object obj, long j2, double d2) {
        f21454g.e(obj, j2, d2);
    }

    public static void q(Object obj, long j2, float f2) {
        f21454g.f(obj, j2, f2);
    }

    public static void r(Object obj, long j2, int i2) {
        f21454g.m(obj, j2, i2);
    }

    public static void s(Object obj, long j2, long j3) {
        f21454g.n(obj, j2, j3);
    }

    public static void t(Object obj, long j2, Object obj2) {
        f21454g.o(obj, j2, obj2);
    }

    public static /* synthetic */ boolean u(Object obj, long j2) {
        return A(obj, j2) != 0;
    }

    public static /* synthetic */ boolean v(Object obj, long j2) {
        return B(obj, j2) != 0;
    }

    public static boolean w(Class<?> cls) {
        int i2 = bjs.f21247a;
        try {
            Class<?> cls2 = f21451d;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean x(Object obj, long j2) {
        return f21454g.g(obj, j2);
    }

    public static boolean y() {
        return f21456i;
    }

    public static boolean z() {
        return f21455h;
    }
}
