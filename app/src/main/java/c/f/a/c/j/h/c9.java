package c.f.a.c.j.h;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f13238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f13239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f13240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f13241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b9 f13242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f13243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f13244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f13245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f13246i;

    static {
        Unsafe unsafeC = C();
        f13238a = unsafeC;
        f13239b = v4.b();
        boolean zE = e(Long.TYPE);
        f13240c = zE;
        boolean zE2 = e(Integer.TYPE);
        f13241d = zE2;
        b9 a9Var = null;
        if (unsafeC != null) {
            if (!v4.a()) {
                a9Var = new a9(unsafeC);
            } else if (zE) {
                a9Var = new z8(unsafeC);
            } else if (zE2) {
                a9Var = new y8(unsafeC);
            }
        }
        f13242e = a9Var;
        f13243f = a9Var == null ? false : a9Var.j();
        f13244g = a9Var == null ? false : a9Var.i();
        f13245h = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldF = f();
        if (fieldF != null && a9Var != null) {
            a9Var.k(fieldF);
        }
        f13246i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte A(byte[] bArr, long j2) {
        return f13242e.a(bArr, f13245h + j2);
    }

    public static void B(byte[] bArr, long j2, byte b2) {
        f13242e.b(bArr, f13245h + j2, b2);
    }

    public static Unsafe C() {
        try {
            return (Unsafe) AccessController.doPrivileged(new x8());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void D(Throwable th) {
        Logger logger = Logger.getLogger(c9.class.getName());
        Level level = Level.WARNING;
        String strValueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(strValueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    public static /* synthetic */ boolean J(Object obj, long j2) {
        return h(obj, j2) != 0;
    }

    public static /* synthetic */ boolean K(Object obj, long j2) {
        return i(obj, j2) != 0;
    }

    public static int c(Class<?> cls) {
        if (f13244g) {
            return f13242e.l(cls);
        }
        return -1;
    }

    public static int d(Class<?> cls) {
        if (f13244g) {
            return f13242e.m(cls);
        }
        return -1;
    }

    public static boolean e(Class<?> cls) {
        if (!v4.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f13239b;
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

    public static Field f() {
        Field fieldG;
        if (v4.a() && (fieldG = g(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldG;
        }
        Field fieldG2 = g(Buffer.class, "address");
        if (fieldG2 == null || fieldG2.getType() != Long.TYPE) {
            return null;
        }
        return fieldG2;
    }

    public static Field g(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte h(Object obj, long j2) {
        return (byte) ((f13242e.n(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j2) {
        return (byte) ((f13242e.n(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    public static void j(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        b9 b9Var = f13242e;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        b9Var.o(obj, j3, ((255 & b2) << i2) | (b9Var.n(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static void k(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        b9 b9Var = f13242e;
        int i2 = (((int) j2) & 3) << 3;
        b9Var.o(obj, j3, ((255 & b2) << i2) | (b9Var.n(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static boolean l() {
        return f13244g;
    }

    public static boolean m() {
        return f13243f;
    }

    public static <T> T n(Class<T> cls) {
        try {
            return (T) f13238a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int o(Object obj, long j2) {
        return f13242e.n(obj, j2);
    }

    public static void p(Object obj, long j2, int i2) {
        f13242e.o(obj, j2, i2);
    }

    public static long q(Object obj, long j2) {
        return f13242e.p(obj, j2);
    }

    public static void r(Object obj, long j2, long j3) {
        f13242e.q(obj, j2, j3);
    }

    public static boolean s(Object obj, long j2) {
        return f13242e.c(obj, j2);
    }

    public static void t(Object obj, long j2, boolean z) {
        f13242e.d(obj, j2, z);
    }

    public static float u(Object obj, long j2) {
        return f13242e.e(obj, j2);
    }

    public static void v(Object obj, long j2, float f2) {
        f13242e.f(obj, j2, f2);
    }

    public static double w(Object obj, long j2) {
        return f13242e.g(obj, j2);
    }

    public static void x(Object obj, long j2, double d2) {
        f13242e.h(obj, j2, d2);
    }

    public static Object y(Object obj, long j2) {
        return f13242e.r(obj, j2);
    }

    public static void z(Object obj, long j2, Object obj2) {
        f13242e.s(obj, j2, obj2);
    }
}
