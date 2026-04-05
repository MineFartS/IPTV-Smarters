package c.f.c.t;

import a.i.i.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import c.f.c.o.c;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16334d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f16331a = contextA;
        this.f16332b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16333c = cVar;
        this.f16334d = c();
    }

    public static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : b.b(context);
    }

    public synchronized boolean b() {
        return this.f16334d;
    }

    public final boolean c() {
        return this.f16332b.contains("firebase_data_collection_default_enabled") ? this.f16332b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f16331a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f16331a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
