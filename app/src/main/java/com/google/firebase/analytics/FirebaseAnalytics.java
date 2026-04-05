package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import c.f.a.c.j.h.e0;
import c.f.a.c.k.b.g7;
import c.f.a.c.o.l;
import c.f.c.j.b;
import c.f.c.s.f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f24652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f24653b;

    public FirebaseAnalytics(e0 e0Var) {
        o.i(e0Var);
        this.f24653b = e0Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(@RecentlyNonNull Context context) {
        if (f24652a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f24652a == null) {
                    f24652a = new FirebaseAnalytics(e0.t(context, null, null, null, null));
                }
            }
        }
        return f24652a;
    }

    @Keep
    public static g7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        e0 e0VarT = e0.t(context, null, null, null, bundle);
        if (e0VarT == null) {
            return null;
        }
        return new b(e0VarT);
    }

    @RecentlyNonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(f.k().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e3) {
            throw new IllegalStateException(e3.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@RecentlyNonNull Activity activity, String str, String str2) {
        this.f24653b.B(activity, str, str2);
    }
}
