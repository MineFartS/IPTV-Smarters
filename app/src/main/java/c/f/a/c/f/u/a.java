package c.f.a.c.f.u;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.t.l;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f12720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f12721b;

    public static synchronized boolean a(@RecentlyNonNull Context context) {
        Boolean boolValueOf;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f12720a;
        if (context2 != null && (bool = f12721b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f12721b = null;
        if (!l.j()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f12721b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
                f12721b = boolValueOf;
            }
            f12720a = applicationContext;
            return f12721b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f12721b = boolValueOf;
        f12720a = applicationContext;
        return f12721b.booleanValue();
    }
}
