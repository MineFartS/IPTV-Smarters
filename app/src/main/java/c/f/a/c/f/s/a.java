package c.f.a.c.f.s;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.m1;
import c.f.a.c.f.q.o;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12692a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static volatile a f12693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f12694c = new ConcurrentHashMap<>();

    @RecentlyNonNull
    public static a b() {
        if (f12693b == null) {
            synchronized (f12692a) {
                if (f12693b == null) {
                    f12693b = new a();
                }
            }
        }
        a aVar = f12693b;
        o.i(aVar);
        return aVar;
    }

    public static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof m1);
    }

    @SuppressLint({"UntrackedBindService"})
    public static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i2) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i2, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f12694c.containsKey(serviceConnection)) {
            g(context, serviceConnection);
            return;
        }
        try {
            g(context, this.f12694c.get(serviceConnection));
        } finally {
            this.f12694c.remove(serviceConnection);
        }
    }

    public final boolean d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i2) {
        return e(context, str, intent, serviceConnection, i2, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, boolean z) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.f.a.c.f.u.c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i2);
        }
        ServiceConnection serviceConnectionPutIfAbsent = this.f12694c.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnectionPutIfAbsent != null && serviceConnection != serviceConnectionPutIfAbsent) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zBindService = context.bindService(intent, serviceConnection, i2);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            this.f12694c.remove(serviceConnection, serviceConnection);
        }
    }
}
