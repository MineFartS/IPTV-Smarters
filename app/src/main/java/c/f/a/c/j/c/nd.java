package c.f.a.c.j.c;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f12968a = Logger.getLogger(nd.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f12969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f12970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f12972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f12973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f12974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f12975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f12976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f12977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f12978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f12979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f12980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f12981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f12982o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final long v;
    public static final int w;
    public static final boolean x;

    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void a(Object obj, long j2, double d2) {
            d(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void b(Object obj, long j2, float f2) {
            c(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void e(Object obj, long j2, boolean z) {
            if (nd.x) {
                nd.l(obj, j2, z);
            } else {
                nd.n(obj, j2, z);
            }
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void f(Object obj, long j2, byte b2) {
            if (nd.x) {
                nd.b(obj, j2, b2);
            } else {
                nd.k(obj, j2, b2);
            }
        }

        @Override // c.f.a.c.j.c.nd.d
        public final boolean i(Object obj, long j2) {
            return nd.x ? nd.J(obj, j2) : nd.K(obj, j2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final float j(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final double k(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final byte l(Object obj, long j2) {
            return nd.x ? nd.H(obj, j2) : nd.I(obj, j2);
        }
    }

    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void a(Object obj, long j2, double d2) {
            this.f12983a.putDouble(obj, j2, d2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void b(Object obj, long j2, float f2) {
            this.f12983a.putFloat(obj, j2, f2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void e(Object obj, long j2, boolean z) {
            this.f12983a.putBoolean(obj, j2, z);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void f(Object obj, long j2, byte b2) {
            this.f12983a.putByte(obj, j2, b2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final boolean i(Object obj, long j2) {
            return this.f12983a.getBoolean(obj, j2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final float j(Object obj, long j2) {
            return this.f12983a.getFloat(obj, j2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final double k(Object obj, long j2) {
            return this.f12983a.getDouble(obj, j2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final byte l(Object obj, long j2) {
            return this.f12983a.getByte(obj, j2);
        }
    }

    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void a(Object obj, long j2, double d2) {
            d(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void b(Object obj, long j2, float f2) {
            c(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void e(Object obj, long j2, boolean z) {
            if (nd.x) {
                nd.l(obj, j2, z);
            } else {
                nd.n(obj, j2, z);
            }
        }

        @Override // c.f.a.c.j.c.nd.d
        public final void f(Object obj, long j2, byte b2) {
            if (nd.x) {
                nd.b(obj, j2, b2);
            } else {
                nd.k(obj, j2, b2);
            }
        }

        @Override // c.f.a.c.j.c.nd.d
        public final boolean i(Object obj, long j2) {
            return nd.x ? nd.J(obj, j2) : nd.K(obj, j2);
        }

        @Override // c.f.a.c.j.c.nd.d
        public final float j(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final double k(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        @Override // c.f.a.c.j.c.nd.d
        public final byte l(Object obj, long j2) {
            return nd.x ? nd.H(obj, j2) : nd.I(obj, j2);
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f12983a;

        public d(Unsafe unsafe) {
            this.f12983a = unsafe;
        }

        public abstract void a(Object obj, long j2, double d2);

        public abstract void b(Object obj, long j2, float f2);

        public final void c(Object obj, long j2, int i2) {
            this.f12983a.putInt(obj, j2, i2);
        }

        public final void d(Object obj, long j2, long j3) {
            this.f12983a.putLong(obj, j2, j3);
        }

        public abstract void e(Object obj, long j2, boolean z);

        public abstract void f(Object obj, long j2, byte b2);

        public final int g(Object obj, long j2) {
            return this.f12983a.getInt(obj, j2);
        }

        public final long h(Object obj, long j2) {
            return this.f12983a.getLong(obj, j2);
        }

        public abstract boolean i(Object obj, long j2);

        public abstract float j(Object obj, long j2);

        public abstract double k(Object obj, long j2);

        public abstract byte l(Object obj, long j2);
    }

    static {
        Unsafe unsafeA = A();
        f12969b = unsafeA;
        f12970c = j9.c();
        boolean zV = v(Long.TYPE);
        f12971d = zV;
        boolean zV2 = v(Integer.TYPE);
        f12972e = zV2;
        d bVar = null;
        if (unsafeA != null) {
            if (!j9.b()) {
                bVar = new b(unsafeA);
            } else if (zV) {
                bVar = new c(unsafeA);
            } else if (zV2) {
                bVar = new a(unsafeA);
            }
        }
        f12973f = bVar;
        f12974g = C();
        f12975h = B();
        long jS = s(byte[].class);
        f12976i = jS;
        f12977j = s(boolean[].class);
        f12978k = t(boolean[].class);
        f12979l = s(int[].class);
        f12980m = t(int[].class);
        f12981n = s(long[].class);
        f12982o = t(long[].class);
        p = s(float[].class);
        q = t(float[].class);
        r = s(double[].class);
        s = t(double[].class);
        t = s(Object[].class);
        u = t(Object[].class);
        Field fieldD = D();
        v = (fieldD == null || bVar == null) ? -1L : bVar.f12983a.objectFieldOffset(fieldD);
        w = (int) (7 & jS);
        x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new qd());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B() {
        Unsafe unsafe = f12969b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (j9.b()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f12968a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    public static boolean C() {
        Unsafe unsafe = f12969b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (D() == null) {
                return false;
            }
            if (j9.b()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = f12968a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    public static Field D() {
        Field fieldJ;
        if (j9.b() && (fieldJ = j(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldJ;
        }
        Field fieldJ2 = j(Buffer.class, "address");
        if (fieldJ2 == null || fieldJ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldJ2;
    }

    public static float E(Object obj, long j2) {
        return f12973f.j(obj, j2);
    }

    public static double F(Object obj, long j2) {
        return f12973f.k(obj, j2);
    }

    public static Object G(Object obj, long j2) {
        return f12973f.f12983a.getObject(obj, j2);
    }

    public static byte H(Object obj, long j2) {
        return (byte) (u(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3)));
    }

    public static byte I(Object obj, long j2) {
        return (byte) (u(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    public static boolean J(Object obj, long j2) {
        return H(obj, j2) != 0;
    }

    public static boolean K(Object obj, long j2) {
        return I(obj, j2) != 0;
    }

    public static byte a(byte[] bArr, long j2) {
        return f12973f.l(bArr, f12976i + j2);
    }

    public static void b(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        e(obj, j3, ((255 & b2) << i2) | (u(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static void c(Object obj, long j2, double d2) {
        f12973f.a(obj, j2, d2);
    }

    public static void d(Object obj, long j2, float f2) {
        f12973f.b(obj, j2, f2);
    }

    public static void e(Object obj, long j2, int i2) {
        f12973f.c(obj, j2, i2);
    }

    public static void f(Object obj, long j2, long j3) {
        f12973f.d(obj, j2, j3);
    }

    public static void g(Object obj, long j2, Object obj2) {
        f12973f.f12983a.putObject(obj, j2, obj2);
    }

    public static void h(Object obj, long j2, boolean z) {
        f12973f.e(obj, j2, z);
    }

    public static void i(byte[] bArr, long j2, byte b2) {
        f12973f.f(bArr, f12976i + j2, b2);
    }

    public static Field j(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        e(obj, j3, ((255 & b2) << i2) | (u(obj, j3) & ((255 << i2) ^ (-1))));
    }

    public static void l(Object obj, long j2, boolean z) {
        b(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static void n(Object obj, long j2, boolean z) {
        k(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    public static <T> T r(Class<T> cls) {
        try {
            return (T) f12969b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int s(Class<?> cls) {
        if (f12975h) {
            return f12973f.f12983a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int t(Class<?> cls) {
        if (f12975h) {
            return f12973f.f12983a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int u(Object obj, long j2) {
        return f12973f.g(obj, j2);
    }

    public static boolean v(Class<?> cls) {
        if (!j9.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f12970c;
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

    public static long w(Object obj, long j2) {
        return f12973f.h(obj, j2);
    }

    public static boolean x(Object obj, long j2) {
        return f12973f.i(obj, j2);
    }

    public static boolean y() {
        return f12975h;
    }

    public static boolean z() {
        return f12974g;
    }
}
