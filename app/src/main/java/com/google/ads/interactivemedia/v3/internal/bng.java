package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class bng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f21447a;

    public bng(Unsafe unsafe) {
        this.f21447a = unsafe;
    }

    public abstract double a(Object obj, long j2);

    public abstract float b(Object obj, long j2);

    public abstract void c(Object obj, long j2, boolean z);

    public abstract void d(Object obj, long j2, byte b2);

    public abstract void e(Object obj, long j2, double d2);

    public abstract void f(Object obj, long j2, float f2);

    public abstract boolean g(Object obj, long j2);

    public final int h(Class<?> cls) {
        return this.f21447a.arrayBaseOffset(cls);
    }

    public final int i(Class<?> cls) {
        return this.f21447a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j2) {
        return this.f21447a.getInt(obj, j2);
    }

    public final long k(Object obj, long j2) {
        return this.f21447a.getLong(obj, j2);
    }

    public final Object l(Object obj, long j2) {
        return this.f21447a.getObject(obj, j2);
    }

    public final void m(Object obj, long j2, int i2) {
        this.f21447a.putInt(obj, j2, i2);
    }

    public final void n(Object obj, long j2, long j3) {
        this.f21447a.putLong(obj, j2, j3);
    }

    public final void o(Object obj, long j2, Object obj2) {
        this.f21447a.putObject(obj, j2, obj2);
    }

    public final boolean p() {
        Unsafe unsafe = this.f21447a;
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
                bnh.i(th);
            }
        }
        return false;
    }

    public final boolean q() {
        Unsafe unsafe = this.f21447a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return bnh.D() != null;
            } catch (Throwable th) {
                bnh.i(th);
            }
        }
        return false;
    }

    public final void r(Field field) {
        this.f21447a.objectFieldOffset(field);
    }
}
