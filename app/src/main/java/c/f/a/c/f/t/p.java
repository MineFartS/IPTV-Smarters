package c.f.a.c.f.t;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12709a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f12710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f12711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f12712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f12713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f12714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f12715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f12716h;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        f12710b = method;
        if (l.d()) {
            try {
                method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused2) {
                method2 = null;
            }
        } else {
            method2 = null;
        }
        f12711c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f12712d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        f12713e = method4;
        if (l.d()) {
            try {
                method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused5) {
                method5 = null;
            }
        } else {
            method5 = null;
        }
        f12714f = method5;
        if (l.k()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f12715g = method6;
        if (l.k()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e3) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e3);
            }
        }
        f12716h = method7;
    }

    @RecentlyNullable
    public static WorkSource a(@RecentlyNonNull Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = c.f.a.c.f.u.c.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", str.length() != 0 ? "Could not get applicationInfo from package: ".concat(str) : new String("Could not get applicationInfo from package: "));
                    return null;
                }
                int i2 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                d(workSource, i2, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", str.length() != 0 ? "Could not find package: ".concat(str) : new String("Could not find package: "));
            }
        }
        return null;
    }

    @RecentlyNonNull
    public static List<String> b(WorkSource workSource) {
        Method method;
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (workSource == null || (method = f12712d) == null) {
            iIntValue = 0;
        } else {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                c.f.a.c.f.q.o.i(objInvoke);
                iIntValue = ((Integer) objInvoke).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                iIntValue = 0;
            }
        }
        if (iIntValue != 0) {
            for (int i2 = 0; i2 < iIntValue; i2++) {
                Method method2 = f12714f;
                String str = null;
                if (method2 != null) {
                    try {
                        str = (String) method2.invoke(workSource, Integer.valueOf(i2));
                    } catch (Exception e3) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                    }
                }
                if (!n.a(str)) {
                    c.f.a.c.f.q.o.i(str);
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static boolean c(@RecentlyNonNull Context context) {
        return (context == null || context.getPackageManager() == null || c.f.a.c.f.u.c.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    public static void d(@RecentlyNonNull WorkSource workSource, int i2, String str) {
        Method method = f12711c;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = f12710b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }
}
