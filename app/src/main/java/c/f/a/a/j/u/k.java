package c.f.a.a.j.u;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, m> f6222c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f6224b = null;

        public a(Context context) {
            this.f6223a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map<String, String> a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public d b(String str) {
            String str2;
            String str3;
            String str4 = c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                e = e2;
                str3 = String.format("Class %s is not found.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (IllegalAccessException e3) {
                e = e3;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InstantiationException e4) {
                e = e4;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (NoSuchMethodException e5) {
                e = e5;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w("BackendRegistry", str2, e);
                return null;
            }
        }

        public final Map<String, String> c() {
            if (this.f6224b == null) {
                this.f6224b = a(this.f6223a);
            }
            return this.f6224b;
        }
    }

    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    public k(a aVar, i iVar) {
        this.f6222c = new HashMap();
        this.f6220a = aVar;
        this.f6221b = iVar;
    }

    @Override // c.f.a.a.j.u.e
    public synchronized m get(String str) {
        if (this.f6222c.containsKey(str)) {
            return this.f6222c.get(str);
        }
        d dVarB = this.f6220a.b(str);
        if (dVarB == null) {
            return null;
        }
        m mVarCreate = dVarB.create(this.f6221b.a(str));
        this.f6222c.put(str, mVarCreate);
        return mVarCreate;
    }
}
