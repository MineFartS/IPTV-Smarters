package c.f.a.c.k.b;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.f.a.c.j.h.fc;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends w5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f13857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f13858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f13859d;

    public f(c5 c5Var) {
        super(c5Var);
        this.f13858c = d.f13812a;
    }

    public static final long I() {
        return m3.f14095e.b(null).longValue();
    }

    public static final long h() {
        return m3.E.b(null).longValue();
    }

    public final boolean A() {
        this.f14413a.e();
        Boolean boolY = y("firebase_analytics_collection_deactivated");
        return boolY != null && boolY.booleanValue();
    }

    public final boolean B() {
        Boolean boolY = y("google_analytics_adid_collection_enabled");
        return boolY == null || boolY.booleanValue();
    }

    public final boolean C() {
        Boolean boolY;
        fc.a();
        return !w(null, m3.u0) || (boolY = y("google_analytics_automatic_screen_reporting_enabled")) == null || boolY.booleanValue();
    }

    public final String D() {
        return i("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String E() {
        return i("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    public final boolean F(String str) {
        return "1".equals(this.f13858c.n(str, "gaia_collection_enabled"));
    }

    public final boolean G(String str) {
        return "1".equals(this.f13858c.n(str, "measurement.event_sampling_enabled"));
    }

    public final boolean H() {
        if (this.f13857b == null) {
            Boolean boolY = y("app_measurement_lite");
            this.f13857b = boolY;
            if (boolY == null) {
                this.f13857b = Boolean.FALSE;
            }
        }
        return this.f13857b.booleanValue() || !this.f14413a.O();
    }

    public final String i(String str, String str2) {
        w3 w3VarO;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            c.f.a.c.f.q.o.i(str4);
            return str4;
        } catch (ClassNotFoundException e2) {
            e = e2;
            w3VarO = this.f14413a.c().o();
            str3 = "Could not find SystemProperties class";
            w3VarO.b(str3, e);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e3) {
            e = e3;
            w3VarO = this.f14413a.c().o();
            str3 = "Could not access SystemProperties.get()";
            w3VarO.b(str3, e);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e4) {
            e = e4;
            w3VarO = this.f14413a.c().o();
            str3 = "Could not find SystemProperties.get() method";
            w3VarO.b(str3, e);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e5) {
            e = e5;
            w3VarO = this.f14413a.c().o();
            str3 = "SystemProperties.get() threw an exception";
            w3VarO.b(str3, e);
            return BuildConfig.FLAVOR;
        }
    }

    public final void j(e eVar) {
        this.f13858c = eVar;
    }

    public final String k() {
        this.f14413a.e();
        return "FA";
    }

    public final int l() {
        c.f.a.c.j.h.ea.a();
        if (!this.f14413a.z().w(null, m3.y0)) {
            return 25;
        }
        ea eaVarG = this.f14413a.G();
        Boolean boolQ = eaVarG.f14413a.R().q();
        if (eaVarG.N() < 201500) {
            return (boolQ == null || boolQ.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int m(String str) {
        return u(str, m3.J, 25, 100);
    }

    public final int o(String str) {
        c.f.a.c.j.h.ea.a();
        if (w(null, m3.x0)) {
            return u(str, m3.I, 500, AdError.SERVER_ERROR_CODE);
        }
        return 500;
    }

    public final long p() {
        this.f14413a.e();
        return 37000L;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean q() {
        if (this.f13859d == null) {
            synchronized (this) {
                if (this.f13859d == null) {
                    ApplicationInfo applicationInfo = this.f14413a.b().getApplicationInfo();
                    String strA = c.f.a.c.f.t.m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(strA)) {
                            z = true;
                        }
                        this.f13859d = Boolean.valueOf(z);
                    }
                    if (this.f13859d == null) {
                        this.f13859d = Boolean.TRUE;
                        this.f14413a.c().o().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f13859d.booleanValue();
    }

    public final String r(String str, l3<String> l3Var) {
        return l3Var.b(str == null ? null : this.f13858c.n(str, l3Var.a()));
    }

    public final long s(String str, l3<Long> l3Var) {
        if (str != null) {
            String strN = this.f13858c.n(str, l3Var.a());
            if (!TextUtils.isEmpty(strN)) {
                try {
                    return l3Var.b(Long.valueOf(Long.parseLong(strN))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l3Var.b(null).longValue();
    }

    public final int t(String str, l3<Integer> l3Var) {
        if (str != null) {
            String strN = this.f13858c.n(str, l3Var.a());
            if (!TextUtils.isEmpty(strN)) {
                try {
                    return l3Var.b(Integer.valueOf(Integer.parseInt(strN))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l3Var.b(null).intValue();
    }

    public final int u(String str, l3<Integer> l3Var, int i2, int i3) {
        return Math.max(Math.min(t(str, l3Var), i3), i2);
    }

    public final double v(String str, l3<Double> l3Var) {
        if (str != null) {
            String strN = this.f13858c.n(str, l3Var.a());
            if (!TextUtils.isEmpty(strN)) {
                try {
                    return l3Var.b(Double.valueOf(Double.parseDouble(strN))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l3Var.b(null).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(java.lang.String r4, c.f.a.c.k.b.l3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.b(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            c.f.a.c.k.b.e r1 = r3.f13858c
            java.lang.String r2 = r5.a()
            java.lang.String r4 = r1.n(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1f
            goto L3
        L1f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.b(r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.f.w(java.lang.String, c.f.a.c.k.b.l3):boolean");
    }

    public final Bundle x() {
        try {
            if (this.f14413a.b().getPackageManager() == null) {
                this.f14413a.c().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = c.f.a.c.f.u.c.a(this.f14413a.b()).c(this.f14413a.b().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            this.f14413a.c().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            this.f14413a.c().o().b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final Boolean y(String str) {
        c.f.a.c.f.q.o.e(str);
        Bundle bundleX = x();
        if (bundleX == null) {
            this.f14413a.c().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleX.containsKey(str)) {
            return Boolean.valueOf(bundleX.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> z(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            c.f.a.c.f.q.o.e(r4)
            android.os.Bundle r0 = r3.x()
            r1 = 0
            if (r0 != 0) goto L1d
            c.f.a.c.k.b.c5 r4 = r3.f14413a
            c.f.a.c.k.b.y3 r4 = r4.c()
            c.f.a.c.k.b.w3 r4 = r4.o()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            c.f.a.c.k.b.c5 r0 = r3.f14413a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.b()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            c.f.a.c.k.b.c5 r0 = r3.f14413a
            c.f.a.c.k.b.y3 r0 = r0.c()
            c.f.a.c.k.b.w3 r0 = r0.o()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.f.z(java.lang.String):java.util.List");
    }
}
