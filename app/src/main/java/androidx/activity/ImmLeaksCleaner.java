package androidx.activity;

import a.p.f;
import a.p.i;
import a.p.k;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f4003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f4004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f4005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f4006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Activity f4007f;

    public ImmLeaksCleaner(Activity activity) {
        this.f4007f = activity;
    }

    public static void c() {
        try {
            f4003b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f4005d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f4006e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f4004c = declaredField3;
            declaredField3.setAccessible(true);
            f4003b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        if (bVar != f.b.ON_DESTROY) {
            return;
        }
        if (f4003b == 0) {
            c();
        }
        if (f4003b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f4007f.getSystemService("input_method");
            try {
                Object obj = f4004c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f4005d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f4006e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
