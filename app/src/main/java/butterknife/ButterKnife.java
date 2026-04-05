package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ButterKnife {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f5008a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Class<?>, Constructor<? extends Unbinder>> f5009b = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder a(Activity activity) {
        return b(activity, activity.getWindow().getDecorView());
    }

    public static Unbinder b(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (f5008a) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> constructorC = c(cls);
        if (constructorC == null) {
            return Unbinder.f5015a;
        }
        try {
            return constructorC.newInstance(obj, view);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Unable to invoke " + constructorC, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Unable to invoke " + constructorC, e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor<? extends Unbinder> c(Class<?> cls) {
        Constructor<? extends Unbinder> constructorC;
        Map<Class<?>, Constructor<? extends Unbinder>> map = f5009b;
        Constructor<? extends Unbinder> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (f5008a) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (!f5008a) {
                return null;
            }
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
            return null;
        }
        try {
            constructorC = cls.getClassLoader().loadClass(name + "_ViewBinding").getConstructor(cls, View.class);
            if (f5008a) {
                Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
            }
        } catch (ClassNotFoundException unused) {
            if (f5008a) {
                Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
            }
            constructorC = c(cls.getSuperclass());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e2);
        }
        f5009b.put(cls, constructorC);
        return constructorC;
    }
}
