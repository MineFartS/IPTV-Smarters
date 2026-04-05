package c.f.a.c.k.b;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import c.f.a.c.j.h.gb;
import c.f.a.c.j.h.uc;
import c.f.a.c.j.h.vb;
import c.f.a.c.j.h.xa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f7 extends f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e7 f13877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d6 f13878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<e6> f13879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<String> f13881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f13883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f13885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final na f13888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13889o;
    public final da p;

    public f7(c5 c5Var) {
        super(c5Var);
        this.f13879e = new CopyOnWriteArraySet();
        this.f13882h = new Object();
        this.f13889o = true;
        this.p = new u6(this);
        this.f13881g = new AtomicReference<>();
        this.f13883i = new g(null, null);
        this.f13884j = 100;
        this.f13886l = -1L;
        this.f13887m = 100;
        this.f13885k = new AtomicLong(0L);
        this.f13888n = new na(c5Var);
    }

    public static /* synthetic */ void J(f7 f7Var, g gVar, int i2, long j2, boolean z, boolean z2) {
        f7Var.g();
        f7Var.i();
        if (j2 <= f7Var.f13886l && g.m(f7Var.f13887m, i2)) {
            f7Var.f14413a.c().u().b("Dropped out-of-date consent setting, proposed settings", gVar);
            return;
        }
        o4 o4VarA = f7Var.f14413a.A();
        c.f.a.c.j.h.ha.a();
        if (o4VarA.f14413a.z().w(null, m3.G0)) {
            o4VarA.g();
            if (o4VarA.s(i2)) {
                SharedPreferences.Editor editorEdit = o4VarA.p().edit();
                editorEdit.putString("consent_settings", gVar.d());
                editorEdit.putInt("consent_source", i2);
                editorEdit.apply();
                f7Var.f13886l = j2;
                f7Var.f13887m = i2;
                f7Var.f14413a.R().J(z);
                if (z2) {
                    f7Var.f14413a.R().T(new AtomicReference<>());
                    return;
                }
                return;
            }
        }
        f7Var.f14413a.c().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
    }

    public final void A(Bundle bundle, long j2) {
        c.f.a.c.f.q.o.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f14413a.c().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        c.f.a.c.f.q.o.i(bundle2);
        z5.b(bundle2, "app_id", String.class, null);
        z5.b(bundle2, "origin", String.class, null);
        z5.b(bundle2, "name", String.class, null);
        z5.b(bundle2, "value", Object.class, null);
        z5.b(bundle2, "trigger_event_name", String.class, null);
        z5.b(bundle2, "trigger_timeout", Long.class, 0L);
        z5.b(bundle2, "timed_out_event_name", String.class, null);
        z5.b(bundle2, "timed_out_event_params", Bundle.class, null);
        z5.b(bundle2, "triggered_event_name", String.class, null);
        z5.b(bundle2, "triggered_event_params", Bundle.class, null);
        z5.b(bundle2, "time_to_live", Long.class, 0L);
        z5.b(bundle2, "expired_event_name", String.class, null);
        z5.b(bundle2, "expired_event_params", Bundle.class, null);
        c.f.a.c.f.q.o.e(bundle2.getString("name"));
        c.f.a.c.f.q.o.e(bundle2.getString("origin"));
        c.f.a.c.f.q.o.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f14413a.G().p0(string) != 0) {
            this.f14413a.c().o().b("Invalid conditional user property name", this.f14413a.H().r(string));
            return;
        }
        if (this.f14413a.G().x(string, obj) != 0) {
            this.f14413a.c().o().c("Invalid conditional user property value", this.f14413a.H().r(string), obj);
            return;
        }
        Object objY = this.f14413a.G().y(string, obj);
        if (objY == null) {
            this.f14413a.c().o().c("Unable to normalize conditional user property value", this.f14413a.H().r(string), obj);
            return;
        }
        z5.a(bundle2, objY);
        long j3 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            this.f14413a.z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f14413a.c().o().c("Invalid conditional user property timeout", this.f14413a.H().r(string), Long.valueOf(j3));
                return;
            }
        }
        long j4 = bundle2.getLong("time_to_live");
        this.f14413a.z();
        if (j4 > 15552000000L || j4 < 1) {
            this.f14413a.c().o().c("Invalid conditional user property time to live", this.f14413a.H().r(string), Long.valueOf(j4));
        } else {
            this.f14413a.d().r(new p6(this, bundle2));
        }
    }

    public final void B(String str, String str2, Bundle bundle) {
        long jA = this.f14413a.a().a();
        c.f.a.c.f.q.o.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f14413a.d().r(new q6(this, bundle2));
    }

    public final ArrayList<Bundle> C(String str, String str2) {
        if (this.f14413a.d().o()) {
            this.f14413a.c().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.f14413a.e();
        if (va.a()) {
            this.f14413a.c().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f14413a.d().s(atomicReference, 5000L, "get conditional user properties", new s6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ea.Y(list);
        }
        this.f14413a.c().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> D(String str, String str2, boolean z) {
        w3 w3VarO;
        String str3;
        if (this.f14413a.d().o()) {
            w3VarO = this.f14413a.c().o();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f14413a.e();
            if (!va.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f14413a.d().s(atomicReference, 5000L, "get user properties", new t6(this, atomicReference, null, str, str2, z));
                List<aa> list = (List) atomicReference.get();
                if (list == null) {
                    this.f14413a.c().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                a.f.a aVar = new a.f.a(list.size());
                for (aa aaVar : list) {
                    Object objI = aaVar.I();
                    if (objI != null) {
                        aVar.put(aaVar.f13731c, objI);
                    }
                }
                return aVar;
            }
            w3VarO = this.f14413a.c().o();
            str3 = "Cannot get user properties from main thread";
        }
        w3VarO.a(str3);
        return Collections.emptyMap();
    }

    public final String E() {
        n7 n7VarW = this.f14413a.Q().w();
        if (n7VarW != null) {
            return n7VarW.f14148a;
        }
        return null;
    }

    public final String F() {
        n7 n7VarW = this.f14413a.Q().w();
        if (n7VarW != null) {
            return n7VarW.f14149b;
        }
        return null;
    }

    public final String G() {
        if (this.f14413a.L() != null) {
            return this.f14413a.L();
        }
        try {
            uc.a();
            return this.f14413a.z().w(null, m3.O0) ? m7.b(this.f14413a.b(), "google_app_id", this.f14413a.P()) : m7.a(this.f14413a.b(), "google_app_id");
        } catch (IllegalStateException e2) {
            this.f14413a.c().o().b("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final /* synthetic */ void H(Bundle bundle) {
        vb.a();
        if (this.f14413a.z().w(null, m3.A0)) {
            if (bundle == null) {
                this.f14413a.A().C.b(new Bundle());
                return;
            }
            Bundle bundleA = this.f14413a.A().C.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (this.f14413a.G().s0(obj)) {
                        this.f14413a.G().A(this.p, null, 27, null, null, 0);
                    }
                    this.f14413a.c().t().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (ea.F(str)) {
                    this.f14413a.c().t().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleA.remove(str);
                } else {
                    ea eaVarG = this.f14413a.G();
                    this.f14413a.z();
                    if (eaVarG.t0("param", str, 100, obj)) {
                        this.f14413a.G().z(bundleA, str, obj);
                    }
                }
            }
            this.f14413a.G();
            int iL = this.f14413a.z().l();
            if (bundleA.size() > iL) {
                int i2 = 0;
                for (String str2 : new TreeSet(bundleA.keySet())) {
                    i2++;
                    if (i2 > iL) {
                        bundleA.remove(str2);
                    }
                }
                this.f14413a.G().A(this.p, null, 26, null, null, 0);
                this.f14413a.c().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            this.f14413a.A().C.b(bundleA);
            this.f14413a.R().o(bundleA);
        }
    }

    public final void L(Boolean bool, boolean z) {
        g();
        i();
        this.f14413a.c().v().b("Setting app measurement enabled (FE)", bool);
        this.f14413a.A().q(bool);
        c.f.a.c.j.h.ha.a();
        f fVarZ = this.f14413a.z();
        l3<Boolean> l3Var = m3.G0;
        if (fVarZ.w(null, l3Var) && z) {
            o4 o4VarA = this.f14413a.A();
            c.f.a.c.j.h.ha.a();
            if (o4VarA.f14413a.z().w(null, l3Var)) {
                o4VarA.g();
                SharedPreferences.Editor editorEdit = o4VarA.p().edit();
                if (bool != null) {
                    editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    editorEdit.remove("measurement_enabled_from_api");
                }
                editorEdit.apply();
            }
        }
        c.f.a.c.j.h.ha.a();
        if (this.f14413a.z().w(null, l3Var) && !this.f14413a.n() && (bool == null || bool.booleanValue())) {
            return;
        }
        M();
    }

    public final void M() {
        g();
        String strA = this.f14413a.A().s.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                p("app", "_npa", null, this.f14413a.a().a());
            } else {
                p("app", "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), this.f14413a.a().a());
            }
        }
        if (!this.f14413a.k() || !this.f13889o) {
            this.f14413a.c().v().a("Updating Scion state (FE)");
            this.f14413a.R().I();
            return;
        }
        this.f14413a.c().v().a("Recording app launch after enabling measurement for the first time (FE)");
        u();
        gb.a();
        if (this.f14413a.z().w(null, m3.q0)) {
            this.f14413a.C().f14036d.a();
        }
        xa.a();
        if (this.f14413a.z().w(null, m3.t0)) {
            r4 r4VarD = this.f14413a.D();
            c.f.a.c.f.q.o.i(r4VarD);
            if (r4VarD.f14275a.A().f14182l.a() <= 0) {
                r4VarD.a(r4VarD.f14275a.b().getPackageName());
            }
        }
        if (this.f14413a.z().w(null, m3.D0)) {
            this.f14413a.d().r(new k6(this));
        }
    }

    public final void N() {
        if (!(this.f14413a.b().getApplicationContext() instanceof Application) || this.f13877c == null) {
            return;
        }
        ((Application) this.f14413a.b().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f13877c);
    }

    public final Boolean O() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f14413a.d().s(atomicReference, 15000L, "boolean test flag value", new r6(this, atomicReference));
    }

    public final String P() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f14413a.d().s(atomicReference, 15000L, "String test flag value", new v6(this, atomicReference));
    }

    public final Long Q() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f14413a.d().s(atomicReference, 15000L, "long test flag value", new w6(this, atomicReference));
    }

    public final Integer R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f14413a.d().s(atomicReference, 15000L, "int test flag value", new x6(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f14413a.d().s(atomicReference, 15000L, "double test flag value", new y6(this, atomicReference));
    }

    public final void T(Boolean bool) {
        i();
        this.f14413a.d().r(new z6(this, bool));
    }

    public final void U(Bundle bundle, int i2, long j2) {
        c.f.a.c.j.h.ha.a();
        if (this.f14413a.z().w(null, m3.G0)) {
            i();
            String strA = g.a(bundle);
            if (strA != null) {
                this.f14413a.c().t().b("Ignoring invalid consent setting", strA);
                this.f14413a.c().t().a("Valid consent values are 'granted', 'denied'");
            }
            V(g.b(bundle), i2, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r6 == 20) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(c.f.a.c.k.b.g r16, int r17, long r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.f7.V(c.f.a.c.k.b.g, int, long):void");
    }

    public final void W(g gVar) {
        g();
        boolean z = (gVar.h() && gVar.f()) || this.f14413a.R().v();
        if (z != this.f14413a.n()) {
            this.f14413a.m(z);
            o4 o4VarA = this.f14413a.A();
            c.f.a.c.j.h.ha.a();
            Boolean boolValueOf = null;
            if (o4VarA.f14413a.z().w(null, m3.G0)) {
                o4VarA.g();
                if (o4VarA.p().contains("measurement_enabled_from_api")) {
                    boolValueOf = Boolean.valueOf(o4VarA.p().getBoolean("measurement_enabled_from_api", true));
                }
            }
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                L(Boolean.valueOf(z), false);
            }
        }
    }

    public final void X(String str, String str2, Bundle bundle) {
        a0(str, str2, bundle, true, true, this.f14413a.a().a());
    }

    public final void Y(String str, String str2, long j2, Bundle bundle) {
        g();
        Z(str, str2, j2, bundle, true, this.f13878d == null || ea.F(str2), false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(java.lang.String r23, java.lang.String r24, long r25, android.os.Bundle r27, boolean r28, boolean r29, boolean r30, java.lang.String r31) {
        /*
            Method dump skipped, instruction units count: 1385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.f7.Z(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void a0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (this.f14413a.z().w(null, m3.v0) && ea.G(str2, "screen_view")) {
            this.f14413a.Q().u(bundle2, j2);
            return;
        }
        b0(str3, str2, j2, bundle2, z2, !z2 || this.f13878d == null || ea.F(str2), !z, null);
    }

    public final void b0(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.f14413a.d().r(new m6(this, str, str2, j2, bundle2, z, z2, z3, str3));
    }

    public final void c0(String str, String str2, Object obj, boolean z) {
        d0("auto", str2, obj, true, this.f14413a.a().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.f7.d0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    @Override // c.f.a.c.k.b.f4
    public final boolean l() {
        return false;
    }

    public final void o(String str, String str2, long j2, Object obj) {
        this.f14413a.d().r(new n6(this, str, str2, obj, j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            c.f.a.c.f.q.o.e(r9)
            c.f.a.c.f.q.o.e(r10)
            r8.g()
            r8.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L4f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4f
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            c.f.a.c.k.b.c5 r10 = r8.f14413a
            c.f.a.c.k.b.o4 r10 = r10.A()
            c.f.a.c.k.b.n4 r10 = r10.s
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L5b
            java.lang.String r0 = "true"
            goto L5b
        L4f:
            if (r11 != 0) goto L61
            c.f.a.c.k.b.c5 r10 = r8.f14413a
            c.f.a.c.k.b.o4 r10 = r10.A()
            c.f.a.c.k.b.n4 r10 = r10.s
            java.lang.String r0 = "unset"
        L5b:
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L63
        L61:
            r3 = r10
            r6 = r11
        L63:
            c.f.a.c.k.b.c5 r10 = r8.f14413a
            boolean r10 = r10.k()
            if (r10 != 0) goto L7b
            c.f.a.c.k.b.c5 r9 = r8.f14413a
            c.f.a.c.k.b.y3 r9 = r9.c()
            c.f.a.c.k.b.w3 r9 = r9.w()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7b:
            c.f.a.c.k.b.c5 r10 = r8.f14413a
            boolean r10 = r10.q()
            if (r10 != 0) goto L84
            return
        L84:
            c.f.a.c.k.b.aa r10 = new c.f.a.c.k.b.aa
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            c.f.a.c.k.b.c5 r9 = r8.f14413a
            c.f.a.c.k.b.u8 r9 = r9.R()
            r9.R(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.f7.p(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final String q() {
        return this.f13881g.get();
    }

    public final void r(String str) {
        this.f13881g.set(str);
    }

    public final void s(long j2) {
        this.f13881g.set(null);
        this.f14413a.d().r(new o6(this, j2));
    }

    public final void t(long j2, boolean z) {
        g();
        i();
        this.f14413a.c().v().a("Resetting analytics data (FE)");
        k9 k9VarC = this.f14413a.C();
        k9VarC.g();
        k9VarC.f14037e.c();
        boolean zK = this.f14413a.k();
        o4 o4VarA = this.f14413a.A();
        o4VarA.f14181k.b(j2);
        if (!TextUtils.isEmpty(o4VarA.f14413a.A().z.a())) {
            o4VarA.z.b(null);
        }
        gb.a();
        f fVarZ = o4VarA.f14413a.z();
        l3<Boolean> l3Var = m3.q0;
        if (fVarZ.w(null, l3Var)) {
            o4VarA.u.b(0L);
        }
        if (!o4VarA.f14413a.z().A()) {
            o4VarA.u(!zK);
        }
        o4VarA.A.b(null);
        o4VarA.B.b(0L);
        o4VarA.C.b(null);
        if (z) {
            this.f14413a.R().S();
        }
        gb.a();
        if (this.f14413a.z().w(null, l3Var)) {
            this.f14413a.C().f14036d.a();
        }
        this.f13889o = !zK;
    }

    public final void u() {
        g();
        i();
        if (this.f14413a.q()) {
            if (this.f14413a.z().w(null, m3.d0)) {
                f fVarZ = this.f14413a.z();
                fVarZ.f14413a.e();
                Boolean boolY = fVarZ.y("google_analytics_deferred_deep_link_enabled");
                if (boolY != null && boolY.booleanValue()) {
                    this.f14413a.c().v().a("Deferred Deep Link feature enabled.");
                    this.f14413a.d().r(new Runnable(this) { // from class: c.f.a.c.k.b.i6

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final f7 f13968b;

                        {
                            this.f13968b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            f7 f7Var = this.f13968b;
                            f7Var.g();
                            if (f7Var.f14413a.A().x.a()) {
                                f7Var.f14413a.c().v().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = f7Var.f14413a.A().y.a();
                            f7Var.f14413a.A().y.b(1 + jA);
                            f7Var.f14413a.z();
                            if (jA < 5) {
                                f7Var.f14413a.r();
                            } else {
                                f7Var.f14413a.c().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                f7Var.f14413a.A().x.b(true);
                            }
                        }
                    });
                }
            }
            this.f14413a.R().V();
            this.f13889o = false;
            o4 o4VarA = this.f14413a.A();
            o4VarA.g();
            String string = o4VarA.p().getString("previous_os_version", null);
            o4VarA.f14413a.S().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = o4VarA.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f14413a.S().k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            X("auto", "_ou", bundle);
        }
    }

    public final void v(d6 d6Var) {
        d6 d6Var2;
        g();
        i();
        if (d6Var != null && d6Var != (d6Var2 = this.f13878d)) {
            c.f.a.c.f.q.o.m(d6Var2 == null, "EventInterceptor already set.");
        }
        this.f13878d = d6Var;
    }

    public final void w(e6 e6Var) {
        i();
        c.f.a.c.f.q.o.i(e6Var);
        if (this.f13879e.add(e6Var)) {
            return;
        }
        this.f14413a.c().r().a("OnEventListener already registered");
    }

    public final void x(e6 e6Var) {
        i();
        c.f.a.c.f.q.o.i(e6Var);
        if (this.f13879e.remove(e6Var)) {
            return;
        }
        this.f14413a.c().r().a("OnEventListener had not been registered");
    }

    public final int y(String str) {
        c.f.a.c.f.q.o.e(str);
        this.f14413a.z();
        return 25;
    }

    public final void z(Bundle bundle) {
        A(bundle, this.f14413a.a().a());
    }
}
