package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ce implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch f21540a;

    public ce(ch chVar) {
        this.f21540a = chVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f21540a.f21546f == activity) {
            this.f21540a.f21546f = null;
            Application applicationB = ly.b(this.f21540a.f21543c.getContext());
            if (applicationB != null) {
                applicationB.unregisterActivityLifecycleCallbacks(this.f21540a.f21545e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f21540a.f21546f == null || this.f21540a.f21546f == activity) {
            this.f21540a.f21546f = activity;
            this.f21540a.f21541a.o(new dw(du.activityMonitor, dv.appStateChanged, this.f21540a.f21542b, this.f21540a.e(BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inactive")));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f21540a.f21546f == activity) {
            this.f21540a.f21541a.o(new dw(du.activityMonitor, dv.appStateChanged, this.f21540a.f21542b, this.f21540a.e(BuildConfig.FLAVOR, BuildConfig.FLAVOR, "active")));
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
