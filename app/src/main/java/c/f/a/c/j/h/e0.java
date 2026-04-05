package c.f.a.c.j.h;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile e0 f13289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f13290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.f.t.d f13292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f13293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.c.k.a.a f13294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Pair<c.f.a.c.k.b.e6, ?>> f13295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile qd f13299k;

    public e0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f13291c = (str == null || !s(str2, str3)) ? "FA" : str;
        this.f13292d = c.f.a.c.f.t.g.d();
        this.f13293e = t8.a().a(new p(this), 1);
        this.f13294f = new c.f.a.c.k.a.a(this);
        this.f13295g = new ArrayList();
        try {
            if (c.f.a.c.k.b.m7.b(context, "google_app_id", c.f.a.c.k.b.v4.a(context)) != null && !o()) {
                this.f13298j = null;
                this.f13297i = true;
                Log.w(this.f13291c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (s(str2, str3)) {
            this.f13298j = str2;
        } else {
            this.f13298j = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f13291c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f13291c, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        p(new f(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f13291c, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new d0(this));
        }
    }

    public static /* synthetic */ void j(Context context) {
        Bundle bundle;
        synchronized (e0.class) {
            try {
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                f13290b = Boolean.TRUE;
            }
            if (f13290b != null) {
                return;
            }
            c.f.a.c.f.q.o.e("app_measurement_internal_disable_startup_flags");
            try {
                ApplicationInfo applicationInfoC = c.f.a.c.f.u.c.a(context).c(context.getPackageName(), 128);
                if (applicationInfoC != null && (bundle = applicationInfoC.metaData) != null) {
                    if (bundle.getBoolean("app_measurement_internal_disable_startup_flags")) {
                        f13290b = Boolean.TRUE;
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
            f13290b = Boolean.valueOf(sharedPreferences.getBoolean("allow_remote_dynamite", true));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("allow_remote_dynamite");
            editorEdit.apply();
        }
    }

    public static final boolean o() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final boolean s(String str, String str2) {
        return (str2 == null || str == null || o()) ? false : true;
    }

    public static e0 t(Context context, String str, String str2, String str3, Bundle bundle) {
        c.f.a.c.f.q.o.i(context);
        if (f13289a == null) {
            synchronized (e0.class) {
                if (f13289a == null) {
                    f13289a = new e0(context, str, str2, str3, bundle);
                }
            }
        }
        return f13289a;
    }

    public final List<Bundle> A(String str, String str2) {
        va vaVar = new va();
        p(new d(this, str, str2, vaVar));
        List<Bundle> list = (List) va.K2(vaVar.I2(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void B(Activity activity, String str, String str2) {
        p(new e(this, activity, str, str2));
    }

    public final void C(String str) {
        p(new g(this, str));
    }

    public final void D(String str) {
        p(new h(this, str));
    }

    public final String E() {
        va vaVar = new va();
        p(new i(this, vaVar));
        return vaVar.c1(500L);
    }

    public final String F() {
        va vaVar = new va();
        p(new j(this, vaVar));
        return vaVar.c1(50L);
    }

    public final long G() {
        va vaVar = new va();
        p(new k(this, vaVar));
        Long l2 = (Long) va.K2(vaVar.I2(500L), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f13292d.a()).nextLong();
        int i2 = this.f13296h + 1;
        this.f13296h = i2;
        return jNextLong + ((long) i2);
    }

    public final String H() {
        va vaVar = new va();
        p(new l(this, vaVar));
        return vaVar.c1(500L);
    }

    public final String a() {
        va vaVar = new va();
        p(new m(this, vaVar));
        return vaVar.c1(500L);
    }

    public final Map<String, Object> b(String str, String str2, boolean z) {
        va vaVar = new va();
        p(new n(this, str, str2, z, vaVar));
        Bundle bundleI2 = vaVar.I2(5000L);
        if (bundleI2 == null || bundleI2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleI2.size());
        for (String str3 : bundleI2.keySet()) {
            Object obj = bundleI2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void c(int i2, String str, Object obj, Object obj2, Object obj3) {
        p(new o(this, false, 5, str, obj, null, null));
    }

    public final int d(String str) {
        va vaVar = new va();
        p(new q(this, str, vaVar));
        Integer num = (Integer) va.K2(vaVar.I2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void e(boolean z) {
        p(new r(this, z));
    }

    public final void p(v vVar) {
        this.f13293e.execute(vVar);
    }

    public final void q(Exception exc, boolean z, boolean z2) {
        this.f13297i |= z;
        if (z) {
            Log.w(this.f13291c, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f13291c, "Error with data collection. Data lost.", exc);
    }

    public final void r(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        p(new t(this, l2, str, str2, bundle, z, z2));
    }

    public final c.f.a.c.k.a.a u() {
        return this.f13294f;
    }

    public final qd v(Context context, boolean z) {
        try {
            return xc.asInterface(DynamiteModule.e(context, z ? DynamiteModule.f24264f : DynamiteModule.f24260b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e2) {
            q(e2, true, false);
            return null;
        }
    }

    public final void w(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void x(String str, String str2, Object obj, boolean z) {
        p(new u(this, str, str2, obj, z));
    }

    public final void y(Bundle bundle) {
        p(new b(this, bundle));
    }

    public final void z(String str, String str2, Bundle bundle) {
        p(new c(this, str, str2, bundle));
    }
}
