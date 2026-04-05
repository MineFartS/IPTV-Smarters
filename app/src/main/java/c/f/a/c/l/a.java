package c.f.a.c.l;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.f;
import c.f.a.c.f.g;
import c.f.a.c.f.h;
import c.f.a.c.f.q.o;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import javax.annotation.concurrent.GuardedBy;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14512a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f14513b = f.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14514c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    public static DynamiteModule f14515d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("lock")
    public static String f14516e = "0";

    public static boolean a() {
        return b() != null;
    }

    public static DynamiteModule b() {
        DynamiteModule dynamiteModule;
        synchronized (f14514c) {
            dynamiteModule = f14515d;
        }
        return dynamiteModule;
    }

    public static String c() {
        String str;
        synchronized (f14514c) {
            str = f14516e;
        }
        return str;
    }

    @Deprecated
    public static void d(@RecentlyNonNull Context context) {
        synchronized (f14514c) {
            if (a()) {
                return;
            }
            o.j(context, "Context must not be null");
            try {
                ((ClassLoader) o.i(a.class.getClassLoader())).loadClass("org.chromium.net.CronetEngine");
                int apiLevel = ApiVersion.getApiLevel();
                f fVar = f14513b;
                fVar.k(context, 11925000);
                try {
                    DynamiteModule dynamiteModuleE = DynamiteModule.e(context, DynamiteModule.f24259a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> clsLoadClass = dynamiteModuleE.b().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                            Log.e(f14512a, "ImplVersion class is missing from Cronet module.");
                            throw new g(8);
                        }
                        Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                        int iIntValue = ((Integer) o.i((Integer) method.invoke(null, new Object[0]))).intValue();
                        f14516e = (String) o.i((String) method2.invoke(null, new Object[0]));
                        if (apiLevel <= iIntValue) {
                            f14515d = dynamiteModuleE;
                            return;
                        }
                        Intent intentB = fVar.b(context, 2, "cr");
                        if (intentB == null) {
                            Log.e(f14512a, "Unable to fetch error resolution intent");
                            throw new g(2);
                        }
                        String str = f14516e;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 174);
                        sb.append("Google Play Services update is required. The API Level of the client is ");
                        sb.append(apiLevel);
                        sb.append(". The API Level of the implementation is ");
                        sb.append(iIntValue);
                        sb.append(". The Cronet implementation version is ");
                        sb.append(str);
                        throw new h(2, sb.toString(), intentB);
                    } catch (Exception e2) {
                        Log.e(f14512a, "Unable to read Cronet version from the Cronet module ", e2);
                        throw ((g) new g(8).initCause(e2));
                    }
                } catch (DynamiteModule.a e3) {
                    Log.e(f14512a, "Unable to load Cronet module", e3);
                    throw ((g) new g(8).initCause(e3));
                }
            } catch (ClassNotFoundException e4) {
                Log.e(f14512a, "Cronet API is not available. Have you included all required dependencies?");
                throw ((g) new g(10).initCause(e4));
            }
        }
    }
}
