package c.f.a.c.k.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(14)
public final class e7 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f7 f13842b;

    public /* synthetic */ e7(f7 f7Var, r6 r6Var) {
        this.f13842b = f7Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            try {
                this.f13842b.f14413a.c().w().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    this.f13842b.f14413a.G();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    boolean z = true;
                    String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                    String queryParameter = data.getQueryParameter("referrer");
                    if (bundle != null) {
                        z = false;
                    }
                    this.f13842b.f14413a.d().r(new d7(this, z, data, str, queryParameter));
                }
            } catch (Exception e2) {
                this.f13842b.f14413a.c().o().b("Throwable caught in onActivityCreated", e2);
            }
        } finally {
            this.f13842b.f14413a.Q().z(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f13842b.f14413a.Q().D(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f13842b.f14413a.Q().B(activity);
        k9 k9VarC = this.f13842b.f14413a.C();
        k9VarC.f14413a.d().r(new c9(k9VarC, k9VarC.f14413a.a().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k9 k9VarC = this.f13842b.f14413a.C();
        k9VarC.f14413a.d().r(new b9(k9VarC, k9VarC.f14413a.a().b()));
        this.f13842b.f14413a.Q().A(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f13842b.f14413a.Q().C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
