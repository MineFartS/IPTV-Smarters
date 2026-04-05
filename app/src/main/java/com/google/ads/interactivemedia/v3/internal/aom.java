package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aom implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f20295g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20290b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConditionVariable f20291c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f20292d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f20289a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f20293e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f20294f = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f20296h = new JSONObject();

    private final void f() {
        if (this.f20293e == null) {
            return;
        }
        try {
            this.f20296h = new JSONObject((String) aop.a(new aru() { // from class: com.google.ads.interactivemedia.v3.internal.aoj
                @Override // com.google.ads.interactivemedia.v3.internal.aru
                public final Object a() {
                    return this.f20285a.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final <T> T b(final aoh<T> aohVar) {
        if (!this.f20291c.block(5000L)) {
            synchronized (this.f20290b) {
                if (!this.f20289a) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f20292d || this.f20293e == null) {
            synchronized (this.f20290b) {
                if (this.f20292d && this.f20293e != null) {
                }
                return aohVar.g();
            }
        }
        if (aohVar.d() != 2) {
            return (aohVar.d() == 1 && this.f20296h.has(aohVar.h())) ? aohVar.a(this.f20296h) : (T) aop.a(new aru() { // from class: com.google.ads.interactivemedia.v3.internal.aok
                @Override // com.google.ads.interactivemedia.v3.internal.aru
                public final Object a() {
                    return this.f20286a.c(aohVar);
                }
            });
        }
        Bundle bundle = this.f20294f;
        return bundle == null ? aohVar.g() : aohVar.b(bundle);
    }

    public final /* synthetic */ Object c(aoh aohVar) {
        return aohVar.c(this.f20293e);
    }

    public final /* synthetic */ String d() {
        return this.f20293e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f20292d) {
            return;
        }
        synchronized (this.f20290b) {
            if (this.f20292d) {
                return;
            }
            if (!this.f20289a) {
                this.f20289a = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f20295g = applicationContext;
            try {
                this.f20294f = c.f.a.c.f.u.c.a(applicationContext).c(this.f20295g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context contextD = c.f.a.c.f.j.d(context);
                if (contextD != null || (contextD = context.getApplicationContext()) != null) {
                    context = contextD;
                }
                if (context == null) {
                    return;
                }
                aob.c();
                SharedPreferences sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                this.f20293e = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
                aou.b(new aol(this));
                f();
                this.f20292d = true;
            } finally {
                this.f20289a = false;
                this.f20291c.open();
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
