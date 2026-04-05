package c.f.a.c.k.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import c.f.a.c.j.h.ed;
import c.f.a.c.j.h.sb;
import java.security.MessageDigest;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class q3 extends f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f14249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f14252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14253n;

    public q3(c5 c5Var, long j2) {
        super(c5Var);
        this.f14248i = j2;
    }

    @Override // c.f.a.c.k.b.f4
    public final boolean l() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(1:4)(25:124|6|(1:10)(2:11|(1:13))|120|14|(4:16|(1:18)(1:20)|122|21)|26|(1:31)(1:30)|32|SW:33|43|(1:45)|46|126|47|48|(1:50)(1:51)|52|(1:54)(1:55)|56|57|(3:59|60|(7:62|(1:64)(1:65)|66|(1:68)|69|(2:73|74)|(3:94|(1:96)(1:97)|98))(5:75|(1:77)|78|(2:82|74)|(0)))(3:83|(3:85|(3:87|(1:89)(1:90)|91)(1:92)|74)|(0))|102|(2:105|(1:107)(4:108|(3:111|(1:128)(1:130)|109)|129|114))(1:114)|(2:116|117)(2:118|119))|5|26|(2:28|31)(0)|32|SW:33|43|(0)|46|126|47|48|(0)(0)|52|(0)(0)|56|57|(0)(0)|102|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x025b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025c, code lost:
    
        r14.f14413a.c().o().c("Fetching Google App Id failed with exception. appId", c.f.a.c.k.b.y3.x(r0), r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140 A[Catch: IllegalStateException -> 0x025b, TRY_ENTER, TryCatch #3 {IllegalStateException -> 0x025b, blocks: (B:47:0x012d, B:50:0x0140, B:52:0x015b, B:56:0x0164, B:59:0x0179, B:62:0x018a, B:66:0x01a8, B:69:0x01b3, B:71:0x01bb, B:94:0x023c, B:96:0x0252, B:98:0x0257, B:97:0x0255, B:73:0x01c1, B:74:0x01c5, B:65:0x01a4, B:75:0x01c9, B:78:0x01df, B:80:0x01e7, B:82:0x01ed, B:83:0x01f2, B:85:0x01f8, B:87:0x0207, B:91:0x0225, B:90:0x0221, B:92:0x022a, B:51:0x0151), top: B:126:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151 A[Catch: IllegalStateException -> 0x025b, TryCatch #3 {IllegalStateException -> 0x025b, blocks: (B:47:0x012d, B:50:0x0140, B:52:0x015b, B:56:0x0164, B:59:0x0179, B:62:0x018a, B:66:0x01a8, B:69:0x01b3, B:71:0x01bb, B:94:0x023c, B:96:0x0252, B:98:0x0257, B:97:0x0255, B:73:0x01c1, B:74:0x01c5, B:65:0x01a4, B:75:0x01c9, B:78:0x01df, B:80:0x01e7, B:82:0x01ed, B:83:0x01f2, B:85:0x01f8, B:87:0x0207, B:91:0x0225, B:90:0x0221, B:92:0x022a, B:51:0x0151), top: B:126:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179 A[Catch: IllegalStateException -> 0x025b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x025b, blocks: (B:47:0x012d, B:50:0x0140, B:52:0x015b, B:56:0x0164, B:59:0x0179, B:62:0x018a, B:66:0x01a8, B:69:0x01b3, B:71:0x01bb, B:94:0x023c, B:96:0x0252, B:98:0x0257, B:97:0x0255, B:73:0x01c1, B:74:0x01c5, B:65:0x01a4, B:75:0x01c9, B:78:0x01df, B:80:0x01e7, B:82:0x01ed, B:83:0x01f2, B:85:0x01f8, B:87:0x0207, B:91:0x0225, B:90:0x0221, B:92:0x022a, B:51:0x0151), top: B:126:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f2 A[Catch: IllegalStateException -> 0x025b, TryCatch #3 {IllegalStateException -> 0x025b, blocks: (B:47:0x012d, B:50:0x0140, B:52:0x015b, B:56:0x0164, B:59:0x0179, B:62:0x018a, B:66:0x01a8, B:69:0x01b3, B:71:0x01bb, B:94:0x023c, B:96:0x0252, B:98:0x0257, B:97:0x0255, B:73:0x01c1, B:74:0x01c5, B:65:0x01a4, B:75:0x01c9, B:78:0x01df, B:80:0x01e7, B:82:0x01ed, B:83:0x01f2, B:85:0x01f8, B:87:0x0207, B:91:0x0225, B:90:0x0221, B:92:0x022a, B:51:0x0151), top: B:126:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023c A[Catch: IllegalStateException -> 0x025b, TryCatch #3 {IllegalStateException -> 0x025b, blocks: (B:47:0x012d, B:50:0x0140, B:52:0x015b, B:56:0x0164, B:59:0x0179, B:62:0x018a, B:66:0x01a8, B:69:0x01b3, B:71:0x01bb, B:94:0x023c, B:96:0x0252, B:98:0x0257, B:97:0x0255, B:73:0x01c1, B:74:0x01c5, B:65:0x01a4, B:75:0x01c9, B:78:0x01df, B:80:0x01e7, B:82:0x01ed, B:83:0x01f2, B:85:0x01f8, B:87:0x0207, B:91:0x0225, B:90:0x0221, B:92:0x022a, B:51:0x0151), top: B:126:0x012d }] */
    @Override // c.f.a.c.k.b.f4
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.q3.m():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final la o(String str) {
        String str2;
        Class<?> clsLoadClass;
        w3 w3VarS;
        String str3;
        Object objInvoke;
        long j2;
        g();
        String strP = p();
        String strQ = q();
        i();
        String str4 = this.f14243d;
        i();
        long j3 = this.f14244e;
        i();
        c.f.a.c.f.q.o.i(this.f14245f);
        String str5 = this.f14245f;
        this.f14413a.z().p();
        i();
        g();
        long j4 = this.f14247h;
        long j5 = j4;
        if (j4 == 0) {
            ea eaVarG = this.f14413a.G();
            Context contextB = this.f14413a.b();
            String packageName = this.f14413a.b().getPackageName();
            eaVarG.g();
            c.f.a.c.f.q.o.i(contextB);
            c.f.a.c.f.q.o.e(packageName);
            PackageManager packageManager = contextB.getPackageManager();
            MessageDigest messageDigestB = ea.B();
            long j6 = -1;
            j6 = -1;
            if (messageDigestB == null) {
                eaVarG.f14413a.c().o().a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (eaVarG.K(contextB, packageName)) {
                            j6 = 0;
                            eaVarG = eaVarG;
                        } else {
                            Signature[] signatureArr = c.f.a.c.f.u.c.a(contextB).e(eaVarG.f14413a.b().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                eaVarG.f14413a.c().r().a("Could not get signatures");
                                eaVarG = eaVarG;
                            } else {
                                long jC = ea.C(messageDigestB.digest(signatureArr[0].toByteArray()));
                                j6 = jC;
                                eaVarG = jC;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        eaVarG.f14413a.c().o().b("Package name not found", e2);
                        j2 = 0;
                    }
                }
                j2 = 0;
                this.f14247h = j2;
                j5 = j2;
            }
            j2 = j6;
            this.f14247h = j2;
            j5 = j2;
        }
        long j7 = j5;
        boolean zK = this.f14413a.k();
        boolean z = !this.f14413a.A().v;
        g();
        if (this.f14413a.k()) {
            ed.a();
            if (this.f14413a.z().w(null, m3.l0)) {
                this.f14413a.c().w().a("Disabled IID for tests.");
            } else {
                try {
                    clsLoadClass = this.f14413a.b().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (clsLoadClass != null) {
                    try {
                        objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f14413a.b());
                    } catch (Exception unused2) {
                        w3VarS = this.f14413a.c().s();
                        str3 = "Failed to obtain Firebase Analytics instance";
                    }
                    if (objInvoke == null) {
                        str2 = null;
                    } else {
                        try {
                            str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                        } catch (Exception unused3) {
                            w3VarS = this.f14413a.c().t();
                            str3 = "Failed to retrieve Firebase Instance Id";
                            w3VarS.a(str3);
                            str2 = null;
                        }
                    }
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        c5 c5Var = this.f14413a;
        Long lValueOf = Long.valueOf(c5Var.A().f14181k.a());
        long jMin = lValueOf.longValue() == 0 ? c5Var.I : Math.min(c5Var.I, lValueOf.longValue());
        i();
        int i2 = this.f14250k;
        boolean zB = this.f14413a.z().B();
        o4 o4VarA = this.f14413a.A();
        o4VarA.g();
        boolean z2 = o4VarA.p().getBoolean("deferred_analytics_collection", false);
        i();
        String str6 = this.f14252m;
        Boolean boolValueOf = this.f14413a.z().y("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r2.booleanValue());
        long j8 = this.f14248i;
        List<String> list = this.f14249j;
        sb.a();
        String strS = this.f14413a.z().w(null, m3.j0) ? s() : null;
        c.f.a.c.j.h.ha.a();
        return new la(strP, strQ, str4, j3, str5, 37000L, j7, str, zK, z, str2, 0L, jMin, i2, zB, z2, str6, boolValueOf, j8, list, strS, this.f14413a.z().w(null, m3.G0) ? this.f14413a.A().t().d() : BuildConfig.FLAVOR);
    }

    public final String p() {
        i();
        c.f.a.c.f.q.o.i(this.f14242c);
        return this.f14242c;
    }

    public final String q() {
        i();
        c.f.a.c.f.q.o.i(this.f14251l);
        return this.f14251l;
    }

    public final String r() {
        i();
        return this.f14252m;
    }

    public final String s() {
        i();
        c.f.a.c.f.q.o.i(this.f14253n);
        return this.f14253n;
    }

    public final int t() {
        i();
        return this.f14244e;
    }

    public final int u() {
        i();
        return this.f14250k;
    }

    public final List<String> v() {
        return this.f14249j;
    }
}
