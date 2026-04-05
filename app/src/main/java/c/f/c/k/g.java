package c.f.c.k;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f16087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f16088b;

    public static class b implements c<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends Service> f16089a;

        public b(Class<? extends Service> cls) {
            this.f16089a = cls;
        }

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f16089a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f16089a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // c.f.c.k.g.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    public interface c<T> {
        List<String> a(T t);
    }

    public g(T t, c<T> cVar) {
        this.f16087a = t;
        this.f16088b = cVar;
    }

    public static g<Context> b(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    public static i c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new v(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new v(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new v(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new v(String.format("Could not instantiate %s", str), e5);
        }
    }

    public List<c.f.c.r.b<i>> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f16088b.a(this.f16087a).iterator();
        while (it.hasNext()) {
            arrayList.add(f.a(it.next()));
        }
        return arrayList;
    }
}
