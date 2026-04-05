package c.f.a.c.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.o;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f12335a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f12337c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f12338d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f12336b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f12339e = new AtomicBoolean();

    @Deprecated
    public static void a(@RecentlyNonNull Context context, int i2) throws g, h {
        int iH = f.f().h(context, i2);
        if (iH != 0) {
            Intent intentB = f.f().b(context, iH, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iH);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentB != null) {
                throw new h(iH, "Google Play Services not available", intentB);
            }
            throw new g(iH);
        }
    }

    @Deprecated
    public static int b(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String c(int i2) {
        return b.N(i2);
    }

    @RecentlyNullable
    public static Context d(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public static Resources e(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(@RecentlyNonNull Context context) {
        try {
            if (!f12338d) {
                try {
                    PackageInfo packageInfoE = c.f.a.c.f.u.c.a(context).e("com.google.android.gms", 64);
                    k.a(context);
                    if (packageInfoE == null || k.e(packageInfoE, false) || !k.e(packageInfoE, true)) {
                        f12337c = false;
                    } else {
                        f12337c = true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                }
            }
            return f12337c || !c.f.a.c.f.t.h.c();
        } finally {
            f12338d = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(@androidx.annotation.RecentlyNonNull android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.f.j.g(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean h(@RecentlyNonNull Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean i(@RecentlyNonNull Context context) {
        if (!c.f.a.c.f.t.l.d()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        o.i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean j(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean k(@RecentlyNonNull Context context, int i2, @RecentlyNonNull String str) {
        return c.f.a.c.f.t.o.b(context, i2, str);
    }

    @TargetApi(21)
    public static boolean l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (c.f.a.c.f.t.l.g()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !i(context);
    }
}
