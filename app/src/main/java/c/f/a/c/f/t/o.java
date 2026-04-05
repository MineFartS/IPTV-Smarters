package c.f.a.c.f.t;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static boolean a(@RecentlyNonNull Context context, int i2) {
        if (!b(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            return c.f.a.c.f.k.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(@RecentlyNonNull Context context, int i2, @RecentlyNonNull String str) {
        return c.f.a.c.f.u.c.a(context).g(i2, str);
    }
}
