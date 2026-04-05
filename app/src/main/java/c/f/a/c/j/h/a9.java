package c.f.a.c.j.h;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a9 extends b9 {
    public a9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // c.f.a.c.j.h.b9
    public final byte a(Object obj, long j2) {
        return this.f13220a.getByte(obj, j2);
    }

    @Override // c.f.a.c.j.h.b9
    public final void b(Object obj, long j2, byte b2) {
        this.f13220a.putByte(obj, j2, b2);
    }

    @Override // c.f.a.c.j.h.b9
    public final boolean c(Object obj, long j2) {
        return this.f13220a.getBoolean(obj, j2);
    }

    @Override // c.f.a.c.j.h.b9
    public final void d(Object obj, long j2, boolean z) {
        this.f13220a.putBoolean(obj, j2, z);
    }

    @Override // c.f.a.c.j.h.b9
    public final float e(Object obj, long j2) {
        return this.f13220a.getFloat(obj, j2);
    }

    @Override // c.f.a.c.j.h.b9
    public final void f(Object obj, long j2, float f2) {
        this.f13220a.putFloat(obj, j2, f2);
    }

    @Override // c.f.a.c.j.h.b9
    public final double g(Object obj, long j2) {
        return this.f13220a.getDouble(obj, j2);
    }

    @Override // c.f.a.c.j.h.b9
    public final void h(Object obj, long j2, double d2) {
        this.f13220a.putDouble(obj, j2, d2);
    }

    @Override // c.f.a.c.j.h.b9
    public final boolean i() {
        if (!super.i()) {
            return false;
        }
        try {
            Class<?> cls = this.f13220a.getClass();
            Class<?> cls2 = Long.TYPE;
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
            c9.D(th);
            return false;
        }
    }

    @Override // c.f.a.c.j.h.b9
    public final boolean j() {
        if (!super.j()) {
            return false;
        }
        try {
            Class<?> cls = this.f13220a.getClass();
            Class<?> cls2 = Long.TYPE;
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
            c9.D(th);
            return false;
        }
    }
}
