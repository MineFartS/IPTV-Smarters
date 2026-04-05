package c.f.a.c.j.h;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f13220a;

    public b9(Unsafe unsafe) {
        this.f13220a = unsafe;
    }

    public abstract byte a(Object obj, long j2);

    public abstract void b(Object obj, long j2, byte b2);

    public abstract boolean c(Object obj, long j2);

    public abstract void d(Object obj, long j2, boolean z);

    public abstract float e(Object obj, long j2);

    public abstract void f(Object obj, long j2, float f2);

    public abstract double g(Object obj, long j2);

    public abstract void h(Object obj, long j2, double d2);

    public boolean i() {
        Unsafe unsafe = this.f13220a;
        if (unsafe != null) {
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
                return true;
            } catch (Throwable th) {
                c9.D(th);
            }
        }
        return false;
    }

    public boolean j() {
        Unsafe unsafe = this.f13220a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return c9.f() != null;
            } catch (Throwable th) {
                c9.D(th);
            }
        }
        return false;
    }

    public final long k(Field field) {
        return this.f13220a.objectFieldOffset(field);
    }

    public final int l(Class<?> cls) {
        return this.f13220a.arrayBaseOffset(cls);
    }

    public final int m(Class<?> cls) {
        return this.f13220a.arrayIndexScale(cls);
    }

    public final int n(Object obj, long j2) {
        return this.f13220a.getInt(obj, j2);
    }

    public final void o(Object obj, long j2, int i2) {
        this.f13220a.putInt(obj, j2, i2);
    }

    public final long p(Object obj, long j2) {
        return this.f13220a.getLong(obj, j2);
    }

    public final void q(Object obj, long j2, long j3) {
        this.f13220a.putLong(obj, j2, j3);
    }

    public final Object r(Object obj, long j2) {
        return this.f13220a.getObject(obj, j2);
    }

    public final void s(Object obj, long j2, Object obj2) {
        this.f13220a.putObject(obj, j2, obj2);
    }
}
