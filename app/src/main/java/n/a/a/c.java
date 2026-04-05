package n.a.a;

import a.i.h.a;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    public interface a extends a.c {
        void W(int i2, List<String> list);

        void h(int i2, List<String> list);
    }

    public static boolean a(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("EasyPermissions", "hasPermissions: API version < M, returning true by default");
            return true;
        }
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (a.i.i.b.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void c(Object obj, int i2, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            iArr[i3] = 0;
        }
        d(i2, strArr, iArr, obj);
    }

    public static void d(int i2, String[] strArr, int[] iArr, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            if (iArr[i3] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof a)) {
                ((a) obj).W(i2, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof a)) {
                ((a) obj).h(i2, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                h(obj, i2);
            }
        }
    }

    public static void e(Activity activity, String str, int i2, int i3, int i4, String... strArr) {
        g(n.a.a.h.c.c(activity), str, i2, i3, i4, strArr);
    }

    public static void f(Activity activity, String str, int i2, String... strArr) {
        e(activity, str, R.string.ok, R.string.cancel, i2, strArr);
    }

    public static void g(n.a.a.h.c cVar, String str, int i2, int i3, int i4, String... strArr) {
        if (a(cVar.a(), strArr)) {
            c(cVar.b(), i4, strArr);
        } else {
            cVar.e(str, i2, i3, i4, strArr);
        }
    }

    public static void h(Object obj, int i2) {
        String str;
        Class<?> superclass = obj.getClass();
        if (b(obj)) {
            superclass = superclass.getSuperclass();
        }
        while (superclass != null) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(n.a.a.a.class) && ((n.a.a.a) method.getAnnotation(n.a.a.a.class)).value() == i2) {
                    if (method.getParameterTypes().length > 0) {
                        throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                    try {
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        str = "runDefaultMethod:IllegalAccessException";
                        Log.e("EasyPermissions", str, e);
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        str = "runDefaultMethod:InvocationTargetException";
                        Log.e("EasyPermissions", str, e);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static boolean i(Activity activity, List<String> list) {
        return n.a.a.h.c.c(activity).i(list);
    }
}
