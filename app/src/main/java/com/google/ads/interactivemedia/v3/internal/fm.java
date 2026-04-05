package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f21799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<fl> f21800b = new ArrayList();

    public fm(Application application) {
        this.f21799a = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    public final void a(fl flVar) {
        this.f21800b.add(flVar);
    }

    public final void b() {
        this.f21799a.unregisterActivityLifecycleCallbacks(this);
        this.f21800b.clear();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator<fl> it = this.f21800b.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator<fl> it = this.f21800b.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
