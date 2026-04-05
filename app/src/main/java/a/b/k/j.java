package a.b.k;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f214h;

    public static void a(Resources resources) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return;
        }
        if (i2 >= 24) {
            d(resources);
        } else if (i2 >= 23) {
            c(resources);
        } else if (i2 >= 21) {
            b(resources);
        }
    }

    public static void b(Resources resources) {
        if (!f208b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f207a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f208b = true;
        }
        Field field = f207a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void c(Resources resources) {
        if (!f208b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f207a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f208b = true;
        }
        Object obj = null;
        Field field = f207a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    public static void d(Resources resources) {
        Object obj;
        if (!f214h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f213g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f214h = true;
        }
        Field field = f213g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f208b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f207a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f208b = true;
        }
        Field field2 = f207a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    public static void e(Object obj) {
        if (!f210d) {
            try {
                f209c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f210d = true;
        }
        Class<?> cls = f209c;
        if (cls == null) {
            return;
        }
        if (!f212f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f211e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f212f = true;
        }
        Field field = f211e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
