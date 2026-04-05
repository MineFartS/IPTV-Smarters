package c.f.a.c.k.b;

import android.content.SharedPreferences;
import android.util.Pair;
import c.f.a.c.a.a.a;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o4 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pair<String, Long> f14173c = new Pair<>(BuildConfig.FLAVOR, 0L);
    public final n4 A;
    public final l4 B;
    public final k4 C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f14174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m4 f14175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l4 f14176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4 f14177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l4 f14178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l4 f14179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l4 f14180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l4 f14181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l4 f14182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n4 f14183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14185o;
    public long p;
    public final l4 q;
    public final j4 r;
    public final n4 s;
    public final j4 t;
    public final l4 u;
    public boolean v;
    public final j4 w;
    public final j4 x;
    public final l4 y;
    public final n4 z;

    public o4(c5 c5Var) {
        super(c5Var);
        this.f14176f = new l4(this, "last_upload", 0L);
        this.f14177g = new l4(this, "last_upload_attempt", 0L);
        this.f14178h = new l4(this, "backoff", 0L);
        this.f14179i = new l4(this, "last_delete_stale", 0L);
        this.q = new l4(this, "session_timeout", 1800000L);
        this.r = new j4(this, "start_new_session", true);
        this.u = new l4(this, "last_pause_time", 0L);
        this.s = new n4(this, "non_personalized_ads", null);
        this.t = new j4(this, "allow_remote_dynamite", false);
        this.f14180j = new l4(this, "midnight_offset", 0L);
        this.f14181k = new l4(this, "first_open_time", 0L);
        this.f14182l = new l4(this, "app_install_time", 0L);
        this.f14183m = new n4(this, "app_instance_id", null);
        this.w = new j4(this, "app_backgrounded", false);
        this.x = new j4(this, "deep_link_retrieval_complete", false);
        this.y = new l4(this, "deep_link_retrieval_attempts", 0L);
        this.z = new n4(this, "firebase_feature_rollouts", null);
        this.A = new n4(this, "deferred_attribution_cache", null);
        this.B = new l4(this, "deferred_attribution_cache_timestamp", 0L);
        this.C = new k4(this, "default_event_parameters", null);
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        return true;
    }

    @Override // c.f.a.c.k.b.x5
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void i() {
        SharedPreferences sharedPreferences = this.f14413a.b().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f14174d = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.v = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f14174d.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f14413a.z();
        this.f14175e = new m4(this, "health_monitor", Math.max(0L, m3.f14094d.b(null).longValue()), null);
    }

    public final Pair<String, Boolean> o(String str) {
        g();
        long jB = this.f14413a.a().b();
        String str2 = this.f14184n;
        if (str2 != null && jB < this.p) {
            return new Pair<>(str2, Boolean.valueOf(this.f14185o));
        }
        this.p = jB + this.f14413a.z().s(str, m3.f14093c);
        c.f.a.c.a.a.a.c(true);
        try {
            a.C0150a c0150aA = c.f.a.c.a.a.a.a(this.f14413a.b());
            if (c0150aA != null) {
                this.f14184n = c0150aA.a();
                this.f14185o = c0150aA.b();
            }
            if (this.f14184n == null) {
                this.f14184n = BuildConfig.FLAVOR;
            }
        } catch (Exception e2) {
            this.f14413a.c().v().b("Unable to get advertising id", e2);
            this.f14184n = BuildConfig.FLAVOR;
        }
        c.f.a.c.a.a.a.c(false);
        return new Pair<>(this.f14184n, Boolean.valueOf(this.f14185o));
    }

    public final SharedPreferences p() {
        g();
        k();
        c.f.a.c.f.q.o.i(this.f14174d);
        return this.f14174d;
    }

    public final void q(Boolean bool) {
        g();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final Boolean r() {
        g();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final boolean s(int i2) {
        return g.m(i2, p().getInt("consent_source", 100));
    }

    public final g t() {
        g();
        return g.c(p().getString("consent_settings", "G1"));
    }

    public final void u(boolean z) {
        g();
        this.f14413a.c().w().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean v() {
        SharedPreferences sharedPreferences = this.f14174d;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean w(long j2) {
        return j2 - this.q.a() > this.u.a();
    }
}
