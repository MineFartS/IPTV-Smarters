package c.f.a.c.k.b;

import android.content.Context;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes2.dex */
public final class m3 {
    public static final l3<Long> A;
    public static final l3<Boolean> A0;
    public static final l3<Long> B;
    public static final l3<Boolean> B0;
    public static final l3<Long> C;
    public static final l3<Boolean> C0;
    public static final l3<Integer> D;
    public static final l3<Boolean> D0;
    public static final l3<Long> E;
    public static final l3<Long> E0;
    public static final l3<Integer> F;
    public static final l3<Boolean> F0;
    public static final l3<Integer> G;
    public static final l3<Boolean> G0;
    public static final l3<Integer> H;
    public static final l3<Boolean> H0;
    public static final l3<Integer> I;
    public static final l3<Boolean> I0;
    public static final l3<Integer> J;
    public static final l3<Integer> J0;
    public static final l3<Long> K;
    public static final l3<Boolean> K0;
    public static final l3<Boolean> L;
    public static final l3<Boolean> L0;
    public static final l3<String> M;
    public static final l3<Boolean> M0;
    public static final l3<Long> N;
    public static final l3<Boolean> N0;
    public static final l3<Integer> O;
    public static final l3<Boolean> O0;
    public static final l3<Double> P;
    public static final l3<Integer> Q;
    public static final l3<Integer> R;
    public static final l3<Boolean> S;
    public static final l3<Boolean> T;
    public static final l3<Boolean> U;
    public static final l3<Boolean> V;
    public static final l3<Boolean> W;
    public static final l3<Boolean> X;
    public static final l3<Boolean> Y;
    public static final l3<Boolean> Z;
    public static final l3<Boolean> a0;
    public static final l3<Boolean> b0;
    public static final l3<Boolean> c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l3<Long> f14094d;
    public static final l3<Boolean> d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l3<Long> f14095e;
    public static final l3<Boolean> e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l3<String> f14096f;
    public static final l3<Boolean> f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l3<String> f14097g;
    public static final l3<Boolean> g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l3<Integer> f14098h;
    public static final l3<Boolean> h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l3<Integer> f14099i;
    public static final l3<Boolean> i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l3<Integer> f14100j;
    public static final l3<Boolean> j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l3<Integer> f14101k;
    public static final l3<Boolean> k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l3<Integer> f14102l;
    public static final l3<Boolean> l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l3<Integer> f14103m;
    public static final l3<Boolean> m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l3<Integer> f14104n;
    public static final l3<Boolean> n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l3<Integer> f14105o;
    public static final l3<Boolean> o0;
    public static final l3<Integer> p;
    public static final l3<Boolean> p0;
    public static final l3<Integer> q;
    public static final l3<Boolean> q0;
    public static final l3<String> r;
    public static final l3<Boolean> r0;
    public static final l3<Long> s;
    public static final l3<Boolean> s0;
    public static final l3<Long> t;
    public static final l3<Boolean> t0;
    public static final l3<Long> u;
    public static final l3<Boolean> u0;
    public static final l3<Long> v;
    public static final l3<Boolean> v0;
    public static final l3<Long> w;
    public static final l3<Boolean> w0;
    public static final l3<Long> x;
    public static final l3<Boolean> x0;
    public static final l3<Long> y;
    public static final l3<Boolean> y0;
    public static final l3<Long> z;
    public static final l3<Boolean> z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<l3<?>> f14091a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<l3<?>> f14092b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l3<Long> f14093c = b("measurement.ad_id_cache_time", 10000L, 10000L, v.f14378a);

    static {
        Long lValueOf = Long.valueOf(TimeChart.DAY);
        f14094d = b("measurement.monitoring.sample_period_millis", lValueOf, lValueOf, h0.f13929a);
        f14095e = b("measurement.config.cache_time", lValueOf, 3600000L, s0.f14288a);
        f14096f = b("measurement.config.url_scheme", ClientConstants.DOMAIN_SCHEME, ClientConstants.DOMAIN_SCHEME, e1.f13836a);
        f14097g = b("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", p1.f14211a);
        f14098h = b("measurement.upload.max_bundles", 100, 100, a2.f13714a);
        f14099i = b("measurement.upload.max_batch_size", 65536, 65536, m2.f14090a);
        f14100j = b("measurement.upload.max_bundle_size", 65536, 65536, x2.f14432a);
        f14101k = b("measurement.upload.max_events_per_bundle", 1000, 1000, g3.f13900a);
        f14102l = b("measurement.upload.max_events_per_day", 100000, 100000, h3.f13932a);
        f14103m = b("measurement.upload.max_error_events_per_day", 1000, 1000, w.f14403a);
        f14104n = b("measurement.upload.max_public_events_per_day", 50000, 50000, x.f14429a);
        Integer numValueOf = Integer.valueOf(Constants.MAXIMUM_UPLOAD_PARTS);
        f14105o = b("measurement.upload.max_conversions_per_day", numValueOf, numValueOf, y.f14461a);
        p = b("measurement.upload.max_realtime_events_per_day", 10, 10, z.f14489a);
        q = b("measurement.store.max_stored_events_per_app", 100000, 100000, a0.f13712a);
        r = b("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", c0.f13769a);
        s = b("measurement.upload.backoff_period", 43200000L, 43200000L, d0.f13813a);
        t = b("measurement.upload.window_interval", 3600000L, 3600000L, e0.f13835a);
        u = b("measurement.upload.interval", 3600000L, 3600000L, f0.f13860a);
        v = b("measurement.upload.realtime_upload_interval", 10000L, 10000L, g0.f13897a);
        w = b("measurement.upload.debug_upload_interval", 1000L, 1000L, i0.f13961a);
        x = b("measurement.upload.minimum_delay", 500L, 500L, j0.f13990a);
        y = b("measurement.alarm_manager.minimum_interval", 60000L, 60000L, k0.f14016a);
        z = b("measurement.upload.stale_data_deletion_interval", lValueOf, lValueOf, l0.f14043a);
        A = b("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, m0.f14088a);
        B = b("measurement.upload.initial_upload_delay_time", 15000L, 15000L, n0.f14134a);
        C = b("measurement.upload.retry_time", 1800000L, 1800000L, o0.f14170a);
        D = b("measurement.upload.retry_count", 6, 6, p0.f14210a);
        E = b("measurement.upload.max_queue_time", 2419200000L, 2419200000L, q0.f14239a);
        F = b("measurement.lifetimevalue.max_currency_tracked", 4, 4, r0.f14271a);
        G = b("measurement.audience.filter_result_max_count", 200, 200, t0.f14314a);
        H = b("measurement.upload.max_public_user_properties", 25, 25, null);
        I = b("measurement.upload.max_event_name_cardinality", 500, 500, null);
        J = b("measurement.upload.max_public_event_params", 25, 25, null);
        K = b("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, u0.f14336a);
        Boolean bool = Boolean.FALSE;
        L = b("measurement.test.boolean_flag", bool, bool, v0.f14379a);
        M = b("measurement.test.string_flag", "---", "---", w0.f14404a);
        N = b("measurement.test.long_flag", -1L, -1L, x0.f14430a);
        O = b("measurement.test.int_flag", -2, -2, y0.f14462a);
        Double dValueOf = Double.valueOf(-3.0d);
        P = b("measurement.test.double_flag", dValueOf, dValueOf, z0.f14490a);
        Q = b("measurement.experiment.max_ids", 50, 50, a1.f13713a);
        R = b("measurement.max_bundles_per_iteration", 100, 100, b1.f13751a);
        S = b("measurement.validation.internal_limits_internal_event_params", bool, bool, d1.f13814a);
        Boolean bool2 = Boolean.TRUE;
        T = b("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, f1.f13861a);
        U = b("measurement.collection.redundant_engagement_removal_enabled", bool, bool, g1.f13898a);
        V = b("measurement.client.freeride_engagement_fix", bool2, bool2, h1.f13930a);
        W = b("measurement.collection.log_event_and_bundle_v2", bool2, bool2, i1.f13962a);
        X = b("measurement.quality.checksum", bool, bool, null);
        Y = b("measurement.sdk.dynamite.allow_remote_dynamite3", bool2, bool2, j1.f13991a);
        Z = b("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, k1.f14017a);
        a0 = b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, l1.f14044a);
        b0 = b("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, m1.f14089a);
        c0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, n1.f14135a);
        d0 = b("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, o1.f14171a);
        e0 = b("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, q1.f14240a);
        f0 = b("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, r1.f14272a);
        g0 = b("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, s1.f14289a);
        h0 = b("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, t1.f14315a);
        i0 = b("measurement.upload.file_lock_state_check", bool, bool, u1.f14337a);
        j0 = b("measurement.ga.ga_app_id", bool, bool, v1.f14380a);
        k0 = b("measurement.lifecycle.app_in_background_parameter", bool, bool, w1.f14405a);
        l0 = b("measurement.integration.disable_firebase_instance_id", bool, bool, x1.f14431a);
        m0 = b("measurement.lifecycle.app_backgrounded_engagement", bool, bool, y1.f14463a);
        n0 = b("measurement.collection.service.update_with_analytics_fix", bool, bool, z1.f14491a);
        o0 = b("measurement.service.use_appinfo_modified", bool, bool, b2.f13752a);
        p0 = b("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, c2.f13772a);
        q0 = b("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, e2.f13837a);
        r0 = b("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, f2.f13862a);
        s0 = b("measurement.upload.file_truncate_fix", bool, bool, g2.f13899a);
        t0 = b("measurement.sdk.referrer.delayed_install_referrer_api", bool, bool, h2.f13931a);
        u0 = b("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, i2.f13963a);
        v0 = b("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, j2.f13992a);
        w0 = b("measurement.collection.synthetic_data_mitigation", bool, bool, k2.f14018a);
        x0 = b("measurement.service.configurable_service_limits", bool2, bool2, l2.f14045a);
        y0 = b("measurement.client.configurable_service_limits", bool2, bool2, n2.f14136a);
        z0 = b("measurement.androidId.delete_feature", bool2, bool2, o2.f14172a);
        A0 = b("measurement.client.global_params", bool2, bool2, p2.f14212a);
        B0 = b("measurement.service.global_params", bool2, bool2, q2.f14241a);
        C0 = b("measurement.service.global_params_in_payload", bool2, bool2, r2.f14273a);
        D0 = b("measurement.sdk.attribution.cache", bool2, bool2, s2.f14290a);
        E0 = b("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, t2.f14316a);
        F0 = b("measurement.service.database_return_empty_collection", bool2, bool2, u2.f14338a);
        G0 = b("measurement.client.consent_state_v1", bool2, bool2, v2.f14381a);
        H0 = b("measurement.client.3p_consent_state_v1", bool2, bool2, w2.f14406a);
        I0 = b("measurement.service.consent_state_v1_W36", bool2, bool2, y2.f14464a);
        J0 = b("measurement.service.storage_consent_support_version", 203590, 203590, z2.f14492a);
        K0 = b("measurement.client.ad_impression", bool2, bool2, a3.f13715a);
        L0 = b("measurement.service.ad_impression", bool2, bool2, b3.f13753a);
        M0 = b("measurement.service.separate_public_internal_event_blacklisting", bool2, bool2, c3.f13773a);
        N0 = b("measurement.service.directly_maybe_log_error_events", bool, bool, d3.f13818a);
        O0 = b("measurement.client.safer_resources", bool2, bool2, f3.f13863a);
    }

    public static Map<String, String> a(Context context) {
        c.f.a.c.j.h.d3 d3VarB = c.f.a.c.j.h.d3.b(context.getContentResolver(), c.f.a.c.j.h.n3.a("com.google.android.gms.measurement"));
        return d3VarB == null ? Collections.emptyMap() : d3VarB.c();
    }

    public static <V> l3<V> b(String str, V v2, V v3, j3<V> j3Var) {
        l3<V> l3Var = new l3<>(str, v2, v3, j3Var, null);
        f14091a.add(l3Var);
        return l3Var;
    }
}
