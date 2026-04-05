package c.f.a.c.k.b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.f.a.c.j.h.vb;
import c.f.a.c.j.h.yd;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes2.dex */
public final class c5 implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c5 f13780a;
    public Boolean A;
    public long B;
    public volatile Boolean C;
    public Boolean D;
    public Boolean E;
    public volatile boolean F;
    public int G;
    public final long I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final va f13786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f13787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o4 f13788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y3 f13789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z4 f13790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k9 f13791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ea f13792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t3 f13793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c.f.a.c.f.t.d f13794o;
    public final u7 p;
    public final f7 q;
    public final d2 r;
    public final k7 s;
    public final String t;
    public s3 u;
    public u8 v;
    public n w;
    public q3 x;
    public r4 y;
    public boolean z = false;
    public final AtomicInteger H = new AtomicInteger(0);

    public c5(f6 f6Var) {
        w3 w3VarR;
        String str;
        Bundle bundle;
        c.f.a.c.f.q.o.i(f6Var);
        va vaVar = new va(f6Var.f13867a);
        this.f13786g = vaVar;
        k3.f14019a = vaVar;
        Context context = f6Var.f13867a;
        this.f13781b = context;
        this.f13782c = f6Var.f13868b;
        this.f13783d = f6Var.f13869c;
        this.f13784e = f6Var.f13870d;
        this.f13785f = f6Var.f13874h;
        this.C = f6Var.f13871e;
        this.t = f6Var.f13876j;
        this.F = true;
        yd ydVar = f6Var.f13873g;
        if (ydVar != null && (bundle = ydVar.f13679h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.D = (Boolean) obj;
            }
            Object obj2 = ydVar.f13679h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.E = (Boolean) obj2;
            }
        }
        c.f.a.c.j.h.x3.b(context);
        c.f.a.c.f.t.d dVarD = c.f.a.c.f.t.g.d();
        this.f13794o = dVarD;
        Long l2 = f6Var.f13875i;
        this.I = l2 != null ? l2.longValue() : dVarD.a();
        this.f13787h = new f(this);
        o4 o4Var = new o4(this);
        o4Var.l();
        this.f13788i = o4Var;
        y3 y3Var = new y3(this);
        y3Var.l();
        this.f13789j = y3Var;
        ea eaVar = new ea(this);
        eaVar.l();
        this.f13792m = eaVar;
        t3 t3Var = new t3(this);
        t3Var.l();
        this.f13793n = t3Var;
        this.r = new d2(this);
        u7 u7Var = new u7(this);
        u7Var.j();
        this.p = u7Var;
        f7 f7Var = new f7(this);
        f7Var.j();
        this.q = f7Var;
        k9 k9Var = new k9(this);
        k9Var.j();
        this.f13791l = k9Var;
        k7 k7Var = new k7(this);
        k7Var.l();
        this.s = k7Var;
        z4 z4Var = new z4(this);
        z4Var.l();
        this.f13790k = z4Var;
        yd ydVar2 = f6Var.f13873g;
        boolean z = ydVar2 == null || ydVar2.f13674c == 0;
        if (context.getApplicationContext() instanceof Application) {
            f7 f7VarF = F();
            if (f7VarF.f14413a.f13781b.getApplicationContext() instanceof Application) {
                Application application = (Application) f7VarF.f14413a.f13781b.getApplicationContext();
                if (f7VarF.f13877c == null) {
                    f7VarF.f13877c = new e7(f7VarF, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(f7VarF.f13877c);
                    application.registerActivityLifecycleCallbacks(f7VarF.f13877c);
                    w3VarR = f7VarF.f14413a.c().w();
                    str = "Registered activity lifecycle callback";
                }
            }
            z4Var.r(new b5(this, f6Var));
        }
        w3VarR = c().r();
        str = "Application context is not an Application";
        w3VarR.a(str);
        z4Var.r(new b5(this, f6Var));
    }

    public static c5 h(Context context, yd ydVar, Long l2) {
        Bundle bundle;
        if (ydVar != null && (ydVar.f13677f == null || ydVar.f13678g == null)) {
            ydVar = new yd(ydVar.f13673b, ydVar.f13674c, ydVar.f13675d, ydVar.f13676e, null, null, ydVar.f13679h, null);
        }
        c.f.a.c.f.q.o.i(context);
        c.f.a.c.f.q.o.i(context.getApplicationContext());
        if (f13780a == null) {
            synchronized (c5.class) {
                if (f13780a == null) {
                    f13780a = new c5(new f6(context, ydVar, l2));
                }
            }
        } else if (ydVar != null && (bundle = ydVar.f13679h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            c.f.a.c.f.q.o.i(f13780a);
            f13780a.C = Boolean.valueOf(ydVar.f13679h.getBoolean("dataCollectionDefaultEnabled"));
        }
        c.f.a.c.f.q.o.i(f13780a);
        return f13780a;
    }

    public static /* synthetic */ void t(c5 c5Var, f6 f6Var) {
        c5Var.d().g();
        c5Var.f13787h.k();
        n nVar = new n(c5Var);
        nVar.l();
        c5Var.w = nVar;
        q3 q3Var = new q3(c5Var, f6Var.f13872f);
        q3Var.j();
        c5Var.x = q3Var;
        s3 s3Var = new s3(c5Var);
        s3Var.j();
        c5Var.u = s3Var;
        u8 u8Var = new u8(c5Var);
        u8Var.j();
        c5Var.v = u8Var;
        c5Var.f13792m.m();
        c5Var.f13788i.m();
        c5Var.y = new r4(c5Var);
        c5Var.x.k();
        w3 w3VarU = c5Var.c().u();
        c5Var.f13787h.p();
        w3VarU.b("App measurement initialized, version", 37000L);
        c5Var.c().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strP = q3Var.p();
        if (TextUtils.isEmpty(c5Var.f13782c)) {
            if (c5Var.G().H(strP)) {
                c5Var.c().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                w3 w3VarU2 = c5Var.c().u();
                String strValueOf = String.valueOf(strP);
                w3VarU2.a(strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        c5Var.c().v().a("Debug-level message logging enabled");
        if (c5Var.G != c5Var.H.get()) {
            c5Var.c().o().c("Not all components initialized", Integer.valueOf(c5Var.G), Integer.valueOf(c5Var.H.get()));
        }
        c5Var.z = true;
    }

    public static final void u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void v(w5 w5Var) {
        if (w5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void w(f4 f4Var) {
        if (f4Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (f4Var.h()) {
            return;
        }
        String strValueOf = String.valueOf(f4Var.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static final void x(x5 x5Var) {
        if (x5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (x5Var.j()) {
            return;
        }
        String strValueOf = String.valueOf(x5Var.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    @Pure
    public final o4 A() {
        v(this.f13788i);
        return this.f13788i;
    }

    public final y3 B() {
        y3 y3Var = this.f13789j;
        if (y3Var == null || !y3Var.j()) {
            return null;
        }
        return this.f13789j;
    }

    @Pure
    public final k9 C() {
        w(this.f13791l);
        return this.f13791l;
    }

    @SideEffectFree
    public final r4 D() {
        return this.y;
    }

    @SideEffectFree
    public final z4 E() {
        return this.f13790k;
    }

    @Pure
    public final f7 F() {
        w(this.q);
        return this.q;
    }

    @Pure
    public final ea G() {
        v(this.f13792m);
        return this.f13792m;
    }

    @Pure
    public final t3 H() {
        v(this.f13793n);
        return this.f13793n;
    }

    @Pure
    public final s3 I() {
        w(this.u);
        return this.u;
    }

    @Pure
    public final k7 J() {
        x(this.s);
        return this.s;
    }

    @Pure
    public final boolean K() {
        return TextUtils.isEmpty(this.f13782c);
    }

    @Pure
    public final String L() {
        return this.f13782c;
    }

    @Pure
    public final String M() {
        return this.f13783d;
    }

    @Pure
    public final String N() {
        return this.f13784e;
    }

    @Pure
    public final boolean O() {
        return this.f13785f;
    }

    @Pure
    public final String P() {
        return this.t;
    }

    @Pure
    public final u7 Q() {
        w(this.p);
        return this.p;
    }

    @Pure
    public final u8 R() {
        w(this.v);
        return this.v;
    }

    @Pure
    public final n S() {
        x(this.w);
        return this.w;
    }

    @Override // c.f.a.c.k.b.y5
    @Pure
    public final c.f.a.c.f.t.d a() {
        return this.f13794o;
    }

    @Override // c.f.a.c.k.b.y5
    @Pure
    public final Context b() {
        return this.f13781b;
    }

    @Override // c.f.a.c.k.b.y5
    @Pure
    public final y3 c() {
        x(this.f13789j);
        return this.f13789j;
    }

    @Override // c.f.a.c.k.b.y5
    @Pure
    public final z4 d() {
        x(this.f13790k);
        return this.f13790k;
    }

    @Override // c.f.a.c.k.b.y5
    @Pure
    public final va e() {
        return this.f13786g;
    }

    @Pure
    public final q3 f() {
        w(this.x);
        return this.x;
    }

    @Pure
    public final d2 g() {
        d2 d2Var = this.r;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final void i(boolean z) {
        this.C = Boolean.valueOf(z);
    }

    public final boolean j() {
        return this.C != null && this.C.booleanValue();
    }

    public final boolean k() {
        return l() == 0;
    }

    public final int l() {
        d().g();
        if (this.f13787h.A()) {
            return 1;
        }
        Boolean bool = this.E;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        c.f.a.c.j.h.ha.a();
        if (this.f13787h.w(null, m3.G0)) {
            d().g();
            if (!this.F) {
                return 8;
            }
        }
        Boolean boolR = A().r();
        if (boolR != null) {
            return boolR.booleanValue() ? 0 : 3;
        }
        f fVar = this.f13787h;
        va vaVar = fVar.f14413a.f13786g;
        Boolean boolY = fVar.y("firebase_analytics_collection_enabled");
        if (boolY != null) {
            return boolY.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.D;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f13787h.w(null, m3.T) || this.C == null || this.C.booleanValue()) ? 0 : 7;
    }

    public final void m(boolean z) {
        d().g();
        this.F = z;
    }

    public final boolean n() {
        d().g();
        return this.F;
    }

    public final void o() {
        this.G++;
    }

    public final void p() {
        this.H.incrementAndGet();
    }

    public final boolean q() {
        if (!this.z) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        d().g();
        Boolean bool = this.A;
        if (bool == null || this.B == 0 || (!bool.booleanValue() && Math.abs(this.f13794o.b() - this.B) > 1000)) {
            this.B = this.f13794o.b();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(G().E("android.permission.INTERNET") && G().E("android.permission.ACCESS_NETWORK_STATE") && (c.f.a.c.f.u.c.a(this.f13781b).f() || this.f13787h.H() || (t4.a(this.f13781b) && ea.D(this.f13781b, false))));
            this.A = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!G().o(f().q(), f().r(), f().s()) && TextUtils.isEmpty(f().r())) {
                    z = false;
                }
                this.A = Boolean.valueOf(z);
            }
        }
        return this.A.booleanValue();
    }

    public final void r() {
        d().g();
        x(J());
        String strP = f().p();
        Pair<String, Boolean> pairO = A().o(strP);
        if (!this.f13787h.B() || ((Boolean) pairO.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairO.first)) {
            c().v().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        k7 k7VarJ = J();
        k7VarJ.k();
        ConnectivityManager connectivityManager = (ConnectivityManager) k7VarJ.f14413a.f13781b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            c().r().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        ea eaVarG = G();
        f().f14413a.f13787h.p();
        URL urlZ = eaVarG.Z(37000L, strP, (String) pairO.first, A().y.a() - 1);
        if (urlZ != null) {
            k7 k7VarJ2 = J();
            a5 a5Var = new a5(this);
            k7VarJ2.g();
            k7VarJ2.k();
            c.f.a.c.f.q.o.i(urlZ);
            c.f.a.c.f.q.o.i(a5Var);
            k7VarJ2.f14413a.d().u(new j7(k7VarJ2, strP, urlZ, null, null, a5Var, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void s(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.c5.s(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void y(yd ydVar) {
        g gVarB;
        d().g();
        c.f.a.c.j.h.ha.a();
        f fVar = this.f13787h;
        l3<Boolean> l3Var = m3.G0;
        if (fVar.w(null, l3Var)) {
            g gVarT = A().t();
            o4 o4VarA = A();
            c5 c5Var = o4VarA.f14413a;
            o4VarA.g();
            int i2 = 100;
            int i3 = o4VarA.p().getInt("consent_source", 100);
            f fVar2 = this.f13787h;
            l3<Boolean> l3Var2 = m3.H0;
            if (fVar2.w(null, l3Var2)) {
                f fVar3 = this.f13787h;
                c5 c5Var2 = fVar3.f14413a;
                c.f.a.c.j.h.ha.a();
                Boolean boolY = !fVar3.w(null, l3Var2) ? null : fVar3.y("google_analytics_default_allow_ad_storage");
                f fVar4 = this.f13787h;
                c5 c5Var3 = fVar4.f14413a;
                c.f.a.c.j.h.ha.a();
                Boolean boolY2 = !fVar4.w(null, l3Var2) ? null : fVar4.y("google_analytics_default_allow_analytics_storage");
                if (!(boolY == null && boolY2 == null) && A().s(20)) {
                    gVarB = new g(boolY, boolY2);
                    i2 = 20;
                } else {
                    if (!TextUtils.isEmpty(f().q()) && (i3 == 30 || i3 == 40)) {
                        F().V(g.f13894a, 20, this.I);
                    } else if (ydVar != null && ydVar.f13679h != null && A().s(40)) {
                        gVarB = g.b(ydVar.f13679h);
                        if (!gVarB.equals(g.f13894a)) {
                            i2 = 40;
                        }
                    }
                    gVarB = null;
                }
                if (gVarB != null) {
                    F().V(gVarB, i2, this.I);
                    gVarT = gVarB;
                }
                F().W(gVarT);
            } else {
                if (ydVar != null && ydVar.f13679h != null && A().s(40)) {
                    gVarB = g.b(ydVar.f13679h);
                    if (!gVarB.equals(g.f13894a)) {
                        F().V(gVarB, 40, this.I);
                        gVarT = gVarB;
                    }
                }
                F().W(gVarT);
            }
        }
        if (A().f14176f.a() == 0) {
            A().f14176f.b(this.f13794o.a());
        }
        if (Long.valueOf(A().f14181k.a()).longValue() == 0) {
            c().w().b("Persisting first open", Long.valueOf(this.I));
            A().f14181k.b(this.I);
        }
        if (this.f13787h.w(null, m3.D0)) {
            F().f13888n.c();
        }
        if (q()) {
            if (!TextUtils.isEmpty(f().q()) || !TextUtils.isEmpty(f().r())) {
                ea eaVarG = G();
                String strQ = f().q();
                o4 o4VarA2 = A();
                o4VarA2.g();
                String string = o4VarA2.p().getString("gmp_app_id", null);
                String strR = f().r();
                o4 o4VarA3 = A();
                o4VarA3.g();
                if (eaVarG.p(strQ, string, strR, o4VarA3.p().getString("admob_app_id", null))) {
                    c().u().a("Rechecking which service to use due to a GMP App Id change");
                    o4 o4VarA4 = A();
                    o4VarA4.g();
                    Boolean boolR = o4VarA4.r();
                    SharedPreferences.Editor editorEdit = o4VarA4.p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolR != null) {
                        o4VarA4.q(boolR);
                    }
                    I().o();
                    this.v.t();
                    this.v.p();
                    A().f14181k.b(this.I);
                    A().f14183m.b(null);
                }
                o4 o4VarA5 = A();
                String strQ2 = f().q();
                o4VarA5.g();
                SharedPreferences.Editor editorEdit2 = o4VarA5.p().edit();
                editorEdit2.putString("gmp_app_id", strQ2);
                editorEdit2.apply();
                o4 o4VarA6 = A();
                String strR2 = f().r();
                o4VarA6.g();
                SharedPreferences.Editor editorEdit3 = o4VarA6.p().edit();
                editorEdit3.putString("admob_app_id", strR2);
                editorEdit3.apply();
            }
            c.f.a.c.j.h.ha.a();
            if (this.f13787h.w(null, l3Var) && !A().t().h()) {
                A().f14183m.b(null);
            }
            F().r(A().f14183m.a());
            c.f.a.c.j.h.qa.a();
            if (this.f13787h.w(null, m3.p0)) {
                try {
                    G().f14413a.f13781b.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(A().z.a())) {
                        c().r().a("Remote config removed with active feature rollouts");
                        A().z.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(f().q()) || !TextUtils.isEmpty(f().r())) {
                boolean zK = k();
                if (!A().v() && !this.f13787h.A()) {
                    A().u(!zK);
                }
                if (zK) {
                    F().u();
                }
                C().f14036d.a();
                R().T(new AtomicReference<>());
                vb.a();
                if (this.f13787h.w(null, m3.A0)) {
                    R().o(A().C.a());
                }
            }
        } else if (k()) {
            if (!G().E("android.permission.INTERNET")) {
                c().o().a("App is missing INTERNET permission");
            }
            if (!G().E("android.permission.ACCESS_NETWORK_STATE")) {
                c().o().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!c.f.a.c.f.u.c.a(this.f13781b).f() && !this.f13787h.H()) {
                if (!t4.a(this.f13781b)) {
                    c().o().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ea.D(this.f13781b, false)) {
                    c().o().a("AppMeasurementService not registered/enabled");
                }
            }
            c().o().a("Uploading is not possible. App measurement disabled");
        }
        A().t.b(this.f13787h.w(null, m3.Y));
    }

    @Pure
    public final f z() {
        return this.f13787h;
    }
}
