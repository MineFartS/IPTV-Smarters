package a.i.h;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f1675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f1676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f1677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f1678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f1679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f1680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f1681g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0028d f1682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f1683c;

        public a(C0028d c0028d, Object obj) {
            this.f1682b = c0028d;
            this.f1683c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1682b.f1688b = this.f1683c;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f1684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0028d f1685c;

        public b(Application application, C0028d c0028d) {
            this.f1684b = application;
            this.f1685c = c0028d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1684b.unregisterActivityLifecycleCallbacks(this.f1685c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f1686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f1687c;

        public c(Object obj, Object obj2) {
            this.f1686b = obj;
            this.f1687c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f1678d;
                if (method != null) {
                    method.invoke(this.f1686b, this.f1687c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f1679e.invoke(this.f1686b, this.f1687c, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: a.i.h.d$d, reason: collision with other inner class name */
    public static final class C0028d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f1688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Activity f1689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1691e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1692f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1693g = false;

        public C0028d(Activity activity) {
            this.f1689c = activity;
            this.f1690d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1689c == activity) {
                this.f1689c = null;
                this.f1692f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1692f || this.f1693g || this.f1691e || !d.h(this.f1688b, this.f1690d, activity)) {
                return;
            }
            this.f1693g = true;
            this.f1688b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1689c == activity) {
                this.f1691e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f1675a = clsA;
        f1676b = b();
        f1677c = f();
        f1678d = d(clsA);
        f1679e = c(clsA);
        f1680f = e(clsA);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static boolean h(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = f1677c.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                f1681g.postAtFrontOfQueue(new c(f1676b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1680f == null) {
            return false;
        }
        if (f1679e == null && f1678d == null) {
            return false;
        }
        try {
            Object obj2 = f1677c.get(activity);
            if (obj2 == null || (obj = f1676b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0028d c0028d = new C0028d(activity);
            application.registerActivityLifecycleCallbacks(c0028d);
            Handler handler = f1681g;
            handler.post(new a(c0028d, obj2));
            try {
                if (g()) {
                    Method method = f1680f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0028d));
                return true;
            } catch (Throwable th) {
                f1681g.post(new b(application, c0028d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
