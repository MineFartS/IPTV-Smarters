package c.f.a.c.j.h;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes2.dex */
public final class da implements ca {
    public static final x3<Long> A;
    public static final x3<Long> B;
    public static final x3<Long> C;
    public static final x3<Long> D;
    public static final x3<Long> E;
    public static final x3<Long> F;
    public static final x3<Long> G;
    public static final x3<Long> H;
    public static final x3<String> I;
    public static final x3<Long> J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3<Long> f13267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3<Long> f13268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3<String> f13269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3<String> f13270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3<String> f13271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x3<Long> f13272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x3<Long> f13273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x3<Long> f13274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x3<Long> f13275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x3<Long> f13276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x3<Long> f13277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x3<Long> f13278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x3<Long> f13279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x3<Long> f13280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x3<Long> f13281o;
    public static final x3<Long> p;
    public static final x3<Long> q;
    public static final x3<String> r;
    public static final x3<Long> s;
    public static final x3<Long> t;
    public static final x3<Long> u;
    public static final x3<Long> v;
    public static final x3<Long> w;
    public static final x3<Long> x;
    public static final x3<Long> y;
    public static final x3<Long> z;

    static {
        v3 v3Var = new v3(n3.a("com.google.android.gms.measurement"));
        f13267a = v3Var.a("measurement.ad_id_cache_time", 10000L);
        f13268b = v3Var.a("measurement.config.cache_time", TimeChart.DAY);
        f13269c = v3Var.d("measurement.log_tag", "FA");
        f13270d = v3Var.d("measurement.config.url_authority", "app-measurement.com");
        f13271e = v3Var.d("measurement.config.url_scheme", ClientConstants.DOMAIN_SCHEME);
        f13272f = v3Var.a("measurement.upload.debug_upload_interval", 1000L);
        f13273g = v3Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f13274h = v3Var.a("measurement.store.max_stored_events_per_app", 100000L);
        f13275i = v3Var.a("measurement.experiment.max_ids", 50L);
        f13276j = v3Var.a("measurement.audience.filter_result_max_count", 200L);
        f13277k = v3Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        f13278l = v3Var.a("measurement.upload.minimum_delay", 500L);
        f13279m = v3Var.a("measurement.monitoring.sample_period_millis", TimeChart.DAY);
        f13280n = v3Var.a("measurement.upload.realtime_upload_interval", 10000L);
        f13281o = v3Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        p = v3Var.a("measurement.config.cache_time.service", 3600000L);
        q = v3Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        r = v3Var.d("measurement.log_tag.service", "FA-SVC");
        s = v3Var.a("measurement.upload.stale_data_deletion_interval", TimeChart.DAY);
        t = v3Var.a("measurement.upload.backoff_period", 43200000L);
        u = v3Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        v = v3Var.a("measurement.upload.interval", 3600000L);
        w = v3Var.a("measurement.upload.max_bundle_size", 65536L);
        x = v3Var.a("measurement.upload.max_bundles", 100L);
        y = v3Var.a("measurement.upload.max_conversions_per_day", 500L);
        z = v3Var.a("measurement.upload.max_error_events_per_day", 1000L);
        A = v3Var.a("measurement.upload.max_events_per_bundle", 1000L);
        B = v3Var.a("measurement.upload.max_events_per_day", 100000L);
        C = v3Var.a("measurement.upload.max_public_events_per_day", 50000L);
        D = v3Var.a("measurement.upload.max_queue_time", 2419200000L);
        E = v3Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        F = v3Var.a("measurement.upload.max_batch_size", 65536L);
        G = v3Var.a("measurement.upload.retry_count", 6L);
        H = v3Var.a("measurement.upload.retry_time", 1800000L);
        I = v3Var.d("measurement.upload.url", "https://app-measurement.com/a");
        J = v3Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // c.f.a.c.j.h.ca
    public final long A() {
        return x.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long B() {
        return f13280n.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long C() {
        return F.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long D() {
        return v.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long E() {
        return D.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long F() {
        return w.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long a() {
        return y.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final String b() {
        return f13271e.e();
    }

    @Override // c.f.a.c.j.h.ca
    public final long c() {
        return f13277k.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long d() {
        return f13272f.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long e() {
        return f13278l.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long f() {
        return f13274h.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long g() {
        return s.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long h() {
        return B.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final String i() {
        return I.e();
    }

    @Override // c.f.a.c.j.h.ca
    public final long j() {
        return f13275i.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long k() {
        return f13268b.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final String l() {
        return f13270d.e();
    }

    @Override // c.f.a.c.j.h.ca
    public final long m() {
        return t.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long n() {
        return C.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long o() {
        return f13276j.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long p() {
        return J.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long q() {
        return u.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long r() {
        return f13281o.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long s() {
        return z.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long t() {
        return f13273g.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long u() {
        return G.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long v() {
        return q.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long w() {
        return H.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long x() {
        return A.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long y() {
        return f13279m.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long z() {
        return E.e().longValue();
    }

    @Override // c.f.a.c.j.h.ca
    public final long zza() {
        return f13267a.e().longValue();
    }
}
