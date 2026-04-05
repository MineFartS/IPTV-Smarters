package c.f.d.w.o;

import c.f.d.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f16632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16633c = d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f16634d = c();

    public static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16632b = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c.f.d.w.o.b
    public void b(AccessibleObject accessibleObject) {
        if (e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }

    public boolean e(AccessibleObject accessibleObject) {
        if (this.f16633c != null && this.f16634d != null) {
            try {
                f16632b.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f16633c, accessibleObject, Long.valueOf(((Long) f16632b.getMethod("objectFieldOffset", Field.class).invoke(this.f16633c, this.f16634d)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
