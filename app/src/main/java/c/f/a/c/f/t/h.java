package c.f.a.c.f.t;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f12698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f12699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f12700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f12701d;

    public static boolean a(@RecentlyNonNull Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(@RecentlyNonNull PackageManager packageManager) {
        if (f12701d == null) {
            boolean z = false;
            if (l.j() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f12701d = Boolean.valueOf(z);
        }
        return f12701d.booleanValue();
    }

    public static boolean c() {
        int i2 = c.f.a.c.f.j.f12335a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean d(@RecentlyNonNull Context context) {
        return e(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean e(@RecentlyNonNull PackageManager packageManager) {
        if (f12698a == null) {
            boolean z = false;
            if (l.f() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f12698a = Boolean.valueOf(z);
        }
        return f12698a.booleanValue();
    }

    @TargetApi(26)
    public static boolean f(@RecentlyNonNull Context context) {
        if (d(context)) {
            if (!l.i()) {
                return true;
            }
            if (g(context) && !l.j()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean g(@RecentlyNonNull Context context) {
        if (f12699b == null) {
            boolean z = false;
            if (l.g() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f12699b = Boolean.valueOf(z);
        }
        return f12699b.booleanValue();
    }

    public static boolean h(@RecentlyNonNull Context context) {
        if (f12700c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f12700c = Boolean.valueOf(z);
        }
        return f12700c.booleanValue();
    }
}
