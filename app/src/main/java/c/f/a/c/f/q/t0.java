package c.f.a.c.f.q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12665a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    public static boolean f12666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f12667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f12668d;

    public static int a(Context context) {
        b(context);
        return f12668d;
    }

    public static void b(Context context) {
        synchronized (f12665a) {
            if (f12666b) {
                return;
            }
            f12666b = true;
            try {
                Bundle bundle = c.f.a.c.f.u.c.a(context).c(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f12667c = bundle.getString("com.google.app.id");
                f12668d = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            }
        }
    }
}
