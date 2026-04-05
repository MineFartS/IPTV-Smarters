package c.f.a.c.f.o.n;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f12371b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12372c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f12373d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("sInstance")
    public final ArrayList<a> f12374e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("sInstance")
    public boolean f12375f = false;

    public interface a {
        void a(boolean z);
    }

    @RecentlyNonNull
    public static c b() {
        return f12371b;
    }

    public static void c(@RecentlyNonNull Application application) {
        c cVar = f12371b;
        synchronized (cVar) {
            if (!cVar.f12375f) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f12375f = true;
            }
        }
    }

    public void a(@RecentlyNonNull a aVar) {
        synchronized (f12371b) {
            this.f12374e.add(aVar);
        }
    }

    public boolean d() {
        return this.f12372c.get();
    }

    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.f12373d.get()) {
            if (!c.f.a.c.f.t.l.b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f12373d.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f12372c.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z) {
        synchronized (f12371b) {
            Iterator<a> it = this.f12374e.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f12372c.compareAndSet(true, false);
        this.f12373d.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean zCompareAndSet = this.f12372c.compareAndSet(true, false);
        this.f12373d.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f12372c.compareAndSet(false, true)) {
            this.f12373d.set(true);
            f(true);
        }
    }
}
