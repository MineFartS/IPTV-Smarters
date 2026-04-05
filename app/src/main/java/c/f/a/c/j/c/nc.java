package c.f.a.c.j.c;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes2.dex */
public final class nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12957a = new c.f.a.c.d.v.b("FeatureUsageAnalytics");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12958b = u.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static nc f12959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f12960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedPreferences f12961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12962f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set<g7> f12966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<g7> f12967k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f12964h = new w0(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f12963g = new Runnable(this) { // from class: c.f.a.c.j.c.mb

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc f12945b;

        {
            this.f12945b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12945b.f();
        }
    };

    public nc(SharedPreferences sharedPreferences, x0 x0Var, String str) {
        g7 g7VarI;
        this.f12966j = new HashSet();
        this.f12967k = new HashSet();
        this.f12961e = sharedPreferences;
        this.f12960d = x0Var;
        this.f12962f = str;
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        this.f12966j = new HashSet();
        this.f12967k = new HashSet();
        this.f12965i = 0L;
        if (!f12958b.equals(string) || !str.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str2);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            d(hashSet);
            this.f12961e.edit().putString("feature_usage_sdk_version", f12958b).putString("feature_usage_package_name", this.f12962f).apply();
            return;
        }
        this.f12965i = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long jA = a();
        HashSet hashSet2 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j2 = this.f12961e.getLong(str3, 0L);
                if (j2 == 0 || jA - j2 <= 1209600000) {
                    if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                        g7VarI = i(str3.substring(41));
                        this.f12967k.add(g7VarI);
                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                        g7VarI = i(str3.substring(41));
                    }
                    this.f12966j.add(g7VarI);
                } else {
                    hashSet2.add(str3);
                }
            }
        }
        d(hashSet2);
        e();
    }

    public static long a() {
        return c.f.a.c.f.t.g.d().a();
    }

    public static synchronized nc b(SharedPreferences sharedPreferences, x0 x0Var, String str) {
        if (f12959c == null) {
            f12959c = new nc(sharedPreferences, x0Var, str);
        }
        return f12959c;
    }

    public static void c(g7 g7Var) {
        nc ncVar;
        if (!x0.f13131a || (ncVar = f12959c) == null) {
            return;
        }
        ncVar.f12961e.edit().putLong(ncVar.h(Integer.toString(g7Var.zzgj())), a()).apply();
        ncVar.f12966j.add(g7Var);
        ncVar.e();
    }

    public static String g(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static g7 i(String str) {
        try {
            return g7.zzad(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return g7.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    public final void d(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f12961e.edit();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    public final void e() {
        this.f12964h.post(this.f12963g);
    }

    public final /* synthetic */ void f() {
        if (this.f12966j.isEmpty()) {
            return;
        }
        long j2 = this.f12967k.equals(this.f12966j) ? 172800000L : TimeChart.DAY;
        long jA = a();
        long j3 = this.f12965i;
        if (j3 == 0 || jA - j3 >= j2) {
            f12957a.a("Upload the feature usage report.", new Object[0]);
            e8 e8Var = (e8) ((oa) e8.A().o(f12958b).n(this.f12962f).v());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f12966j);
            this.f12960d.b((j8) ((oa) j8.L().n((b8) ((oa) b8.A().o(arrayList).n(e8Var).v())).v()), v4.API_USAGE_REPORT);
            SharedPreferences.Editor editorEdit = this.f12961e.edit();
            if (!this.f12967k.equals(this.f12966j)) {
                HashSet hashSet = new HashSet(this.f12966j);
                this.f12967k = hashSet;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String string = Integer.toString(((g7) it.next()).zzgj());
                    String strH = h(string);
                    String strG = g("feature_usage_timestamp_reported_feature_", string);
                    if (!TextUtils.equals(strH, strG)) {
                        long j4 = this.f12961e.getLong(strH, 0L);
                        editorEdit.remove(strH);
                        if (j4 != 0) {
                            editorEdit.putLong(strG, j4);
                        }
                    }
                }
            }
            this.f12965i = jA;
            editorEdit.putLong("feature_usage_last_report_time", jA).apply();
        }
    }

    public final String h(String str) {
        String strG = g("feature_usage_timestamp_reported_feature_", str);
        return this.f12961e.contains(strG) ? strG : g("feature_usage_timestamp_detected_feature_", str);
    }
}
