package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bnv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Set<bnx>> f21492a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21493b = 17;

    public bnv() {
    }

    public bnv(byte[] bArr) {
    }

    public static int a(Object obj, String... strArr) {
        bnv bnvVar = new bnv(null);
        Class<?> superclass = obj.getClass();
        while (true) {
            f(obj, superclass, bnvVar, strArr);
            if (superclass.getSuperclass() == null) {
                return bnvVar.f21493b;
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static Set<bnx> b() {
        return f21492a.get();
    }

    private static void e(Object obj) {
        Set<bnx> setB = b();
        if (setB != null) {
            setB.remove(new bnx(obj));
            if (setB.isEmpty()) {
                f21492a.remove();
            }
        }
    }

    private static void f(Object obj, Class<?> cls, bnv bnvVar, String[] strArr) {
        Set<bnx> setB = b();
        if (setB == null || !setB.contains(new bnx(obj))) {
            try {
                Set<bnx> setB2 = b();
                if (setB2 == null) {
                    setB2 = new HashSet<>();
                    f21492a.set(setB2);
                }
                setB2.add(new bnx(obj));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (Field field : declaredFields) {
                    if (!ars.i(strArr, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(bnw.class)) {
                        try {
                            bnvVar.d(field.get(obj));
                        } catch (IllegalAccessException unused) {
                            throw new InternalError("Unexpected IllegalAccessException");
                        }
                    }
                }
            } finally {
                e(obj);
            }
        }
    }

    public final void c(long j2) {
        this.f21493b = (this.f21493b * 37) + ((int) (j2 ^ (j2 >> 32)));
    }

    public final void d(Object obj) {
        if (obj == null) {
            this.f21493b *= 37;
            return;
        }
        if (!obj.getClass().isArray()) {
            this.f21493b = (this.f21493b * 37) + obj.hashCode();
            return;
        }
        int i2 = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length = jArr.length;
            while (i2 < length) {
                c(jArr[i2]);
                i2++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length2 = iArr.length;
            while (i2 < length2) {
                this.f21493b = (this.f21493b * 37) + iArr[i2];
                i2++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            while (i2 < length3) {
                this.f21493b = (this.f21493b * 37) + sArr[i2];
                i2++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i2 < length4) {
                this.f21493b = (this.f21493b * 37) + cArr[i2];
                i2++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            while (i2 < length5) {
                this.f21493b = (this.f21493b * 37) + bArr[i2];
                i2++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i2 < length6) {
                c(Double.doubleToLongBits(dArr[i2]));
                i2++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            while (i2 < length7) {
                this.f21493b = (this.f21493b * 37) + Float.floatToIntBits(fArr[i2]);
                i2++;
            }
            return;
        }
        if (!(obj instanceof boolean[])) {
            Object[] objArr = (Object[]) obj;
            int length8 = objArr.length;
            while (i2 < length8) {
                d(objArr[i2]);
                i2++;
            }
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length9 = zArr.length;
        while (i2 < length9) {
            this.f21493b = (this.f21493b * 37) + (!zArr[i2] ? 1 : 0);
            i2++;
        }
    }

    public final int hashCode() {
        return this.f21493b;
    }
}
