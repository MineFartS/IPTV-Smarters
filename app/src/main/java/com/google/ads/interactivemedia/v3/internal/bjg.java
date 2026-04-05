package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class bjg extends bjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class f21211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f21213c;

    public bjg() {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f21211a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
        }
        this.f21212b = obj;
        this.f21213c = c();
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void a(AccessibleObject accessibleObject) {
        if (this.f21212b != null && this.f21213c != null) {
            try {
                f21211a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f21212b, accessibleObject, Long.valueOf(((Long) f21211a.getMethod("objectFieldOffset", Field.class).invoke(this.f21212b, this.f21213c)).longValue()), Boolean.TRUE);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            String strValueOf = String.valueOf(accessibleObject);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 154);
            sb.append("Gson couldn't modify fields for ");
            sb.append(strValueOf);
            sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
            throw new bfm(sb.toString(), e2);
        }
    }
}
