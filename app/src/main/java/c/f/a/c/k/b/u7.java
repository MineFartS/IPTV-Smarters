package c.f.a.c.k.b;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 extends f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile n7 f14351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n7 f14352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n7 f14353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Activity, n7> f14354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f14355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f14356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile n7 f14357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n7 f14358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f14360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n7 f14361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14362n;

    public u7(c5 c5Var) {
        super(c5Var);
        this.f14360l = new Object();
        this.f14354f = new ConcurrentHashMap();
    }

    public static /* synthetic */ void E(u7 u7Var, Bundle bundle, n7 n7Var, n7 n7Var2, long j2) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        u7Var.p(n7Var, n7Var2, j2, true, u7Var.f14413a.G().t(null, "screen_view", bundle, null, true));
    }

    public static /* synthetic */ n7 I(u7 u7Var, n7 n7Var) {
        u7Var.f14358j = null;
        return null;
    }

    public static void x(n7 n7Var, Bundle bundle, boolean z) {
        if (n7Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = n7Var.f14148a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = n7Var.f14149b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", n7Var.f14150c);
                return;
            }
            z = false;
        }
        if (n7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Activity activity) {
        if (this.f14413a.z().w(null, m3.v0)) {
            synchronized (this.f14360l) {
                this.f14359k = true;
                if (activity != this.f14355g) {
                    synchronized (this.f14360l) {
                        this.f14355g = activity;
                        this.f14356h = false;
                    }
                    if (this.f14413a.z().w(null, m3.u0) && this.f14413a.z().C()) {
                        this.f14357i = null;
                        this.f14413a.d().r(new t7(this));
                    }
                }
            }
        }
        if (this.f14413a.z().w(null, m3.u0) && !this.f14413a.z().C()) {
            this.f14351c = this.f14357i;
            this.f14413a.d().r(new q7(this));
        } else {
            o(activity, r(activity), false);
            d2 d2VarG = this.f14413a.g();
            d2VarG.f14413a.d().r(new c1(d2VarG, d2VarG.f14413a.a().b()));
        }
    }

    public final void B(Activity activity) {
        if (this.f14413a.z().w(null, m3.v0)) {
            synchronized (this.f14360l) {
                this.f14359k = false;
                this.f14356h = true;
            }
        }
        long jB = this.f14413a.a().b();
        if (this.f14413a.z().w(null, m3.u0) && !this.f14413a.z().C()) {
            this.f14351c = null;
            this.f14413a.d().r(new r7(this, jB));
        } else {
            n7 n7VarR = r(activity);
            this.f14352d = this.f14351c;
            this.f14351c = null;
            this.f14413a.d().r(new s7(this, n7VarR, jB));
        }
    }

    public final void C(Activity activity, Bundle bundle) {
        n7 n7Var;
        if (!this.f14413a.z().C() || bundle == null || (n7Var = this.f14354f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(Name.MARK, n7Var.f14150c);
        bundle2.putString("name", n7Var.f14148a);
        bundle2.putString("referrer_name", n7Var.f14149b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void D(Activity activity) {
        synchronized (this.f14360l) {
            if (activity == this.f14355g) {
                this.f14355g = null;
            }
        }
        if (this.f14413a.z().C()) {
            this.f14354f.remove(activity);
        }
    }

    @Override // c.f.a.c.k.b.f4
    public final boolean l() {
        return false;
    }

    public final void o(Activity activity, n7 n7Var, boolean z) {
        n7 n7Var2;
        n7 n7Var3 = this.f14351c == null ? this.f14352d : this.f14351c;
        if (n7Var.f14149b == null) {
            n7Var2 = new n7(n7Var.f14148a, activity != null ? t(activity.getClass(), "Activity") : null, n7Var.f14150c, n7Var.f14152e, n7Var.f14153f);
        } else {
            n7Var2 = n7Var;
        }
        this.f14352d = this.f14351c;
        this.f14351c = n7Var2;
        this.f14413a.d().r(new p7(this, n7Var2, n7Var3, this.f14413a.a().b(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(c.f.a.c.k.b.n7 r19, c.f.a.c.k.b.n7 r20, long r21, boolean r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.u7.p(c.f.a.c.k.b.n7, c.f.a.c.k.b.n7, long, boolean, android.os.Bundle):void");
    }

    public final void q(n7 n7Var, boolean z, long j2) {
        this.f14413a.g().j(this.f14413a.a().b());
        if (!this.f14413a.C().f14037e.d(n7Var != null && n7Var.f14151d, z, j2) || n7Var == null) {
            return;
        }
        n7Var.f14151d = false;
    }

    public final n7 r(Activity activity) {
        c.f.a.c.f.q.o.i(activity);
        n7 n7Var = this.f14354f.get(activity);
        if (n7Var == null) {
            n7 n7Var2 = new n7(null, t(activity.getClass(), "Activity"), this.f14413a.G().g0());
            this.f14354f.put(activity, n7Var2);
            n7Var = n7Var2;
        }
        return (this.f14413a.z().w(null, m3.v0) && this.f14357i != null) ? this.f14357i : n7Var;
    }

    public final n7 s(boolean z) {
        i();
        g();
        if (!this.f14413a.z().w(null, m3.v0) || !z) {
            return this.f14353e;
        }
        n7 n7Var = this.f14353e;
        return n7Var != null ? n7Var : this.f14358j;
    }

    public final String t(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : BuildConfig.FLAVOR;
        int length2 = str2.length();
        this.f14413a.z();
        if (length2 <= 100) {
            return str2;
        }
        this.f14413a.z();
        return str2.substring(0, 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r2 > 100) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r4 > 100) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.u7.u(android.os.Bundle, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.u7.v(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    public final n7 w() {
        return this.f14351c;
    }

    public final void y(String str, n7 n7Var) {
        g();
        synchronized (this) {
            String str2 = this.f14362n;
            if (str2 == null || str2.equals(str) || n7Var != null) {
                this.f14362n = str;
                this.f14361m = n7Var;
            }
        }
    }

    public final void z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f14413a.z().C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f14354f.put(activity, new n7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(Name.MARK)));
    }
}
