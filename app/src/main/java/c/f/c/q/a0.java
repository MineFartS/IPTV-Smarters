package c.f.c.q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f16165a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f16166b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("WakeLockHolder.syncObject")
    public static c.f.a.c.n.a f16167c;

    @GuardedBy("WakeLockHolder.syncObject")
    public static void a(Context context) {
        if (f16167c == null) {
            c.f.a.c.n.a aVar = new c.f.a.c.n.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f16167c = aVar;
            aVar.c(true);
        }
    }

    public static void b(Intent intent) {
        synchronized (f16166b) {
            if (f16167c != null && c(intent)) {
                d(intent, false);
                f16167c.b();
            }
        }
    }

    public static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName e(Context context, Intent intent) {
        synchronized (f16166b) {
            a(context);
            boolean zC = c(intent);
            d(intent, true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!zC) {
                f16167c.a(f16165a);
            }
            return componentNameStartService;
        }
    }
}
