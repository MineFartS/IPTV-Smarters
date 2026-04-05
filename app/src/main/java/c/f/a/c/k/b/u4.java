package c.f.a.c.k.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class u4 extends p9 implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Map<String, String>> f14339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f14340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f14341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, c.f.a.c.j.h.d1> f14342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f14343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, String> f14344i;

    public u4(x9 x9Var) {
        super(x9Var);
        this.f14339d = new a.f.a();
        this.f14340e = new a.f.a();
        this.f14341f = new a.f.a();
        this.f14342g = new a.f.a();
        this.f14344i = new a.f.a();
        this.f14343h = new a.f.a();
    }

    public static final Map<String, String> A(c.f.a.c.j.h.d1 d1Var) {
        a.f.a aVar = new a.f.a();
        if (d1Var != null) {
            for (c.f.a.c.j.h.f1 f1Var : d1Var.A()) {
                aVar.put(f1Var.w(), f1Var.x());
            }
        }
        return aVar;
    }

    @Override // c.f.a.c.k.b.p9
    public final boolean k() {
        return false;
    }

    public final c.f.a.c.j.h.d1 l(String str) {
        i();
        g();
        c.f.a.c.f.q.o.e(str);
        x(str);
        return this.f14342g.get(str);
    }

    public final String m(String str) {
        g();
        return this.f14344i.get(str);
    }

    @Override // c.f.a.c.k.b.e
    public final String n(String str, String str2) throws Throwable {
        g();
        x(str);
        Map<String, String> map = this.f14339d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void o(String str) {
        g();
        this.f14344i.put(str, null);
    }

    public final void p(String str) {
        g();
        this.f14342g.remove(str);
    }

    public final boolean q(String str) {
        g();
        c.f.a.c.j.h.d1 d1VarL = l(str);
        if (d1VarL == null) {
            return false;
        }
        return d1VarL.E();
    }

    public final boolean r(String str, byte[] bArr, String str2) throws Throwable {
        i();
        g();
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.j.h.c1 c1VarR = z(str, bArr).r();
        if (c1VarR == null) {
            return false;
        }
        y(str, c1VarR);
        this.f14342g.put(str, c1VarR.m());
        this.f14344i.put(str, str2);
        this.f14339d.put(str, A(c1VarR.m()));
        this.f14198b.Z().v(str, new ArrayList(c1VarR.z()));
        try {
            c1VarR.A();
            bArr = c1VarR.m().d();
        } catch (RuntimeException e2) {
            this.f14413a.c().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", y3.x(str), e2);
        }
        j jVarZ = this.f14198b.Z();
        c.f.a.c.f.q.o.e(str);
        jVarZ.g();
        jVarZ.i();
        new ContentValues().put("remote_config", bArr);
        try {
            if (jVarZ.N().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                jVarZ.f14413a.c().o().b("Failed to update remote config (got 0). appId", y3.x(str));
            }
        } catch (SQLiteException e3) {
            jVarZ.f14413a.c().o().c("Error storing remote config. appId", y3.x(str), e3);
        }
        this.f14342g.put(str, c1VarR.m());
        return true;
    }

    public final boolean s(String str, String str2) throws Throwable {
        Boolean bool;
        g();
        x(str);
        if (v(str) && ea.F(str2)) {
            return true;
        }
        if (w(str) && ea.i0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f14340e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean t(String str, String str2) throws Throwable {
        Boolean bool;
        g();
        x(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f14341f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int u(String str, String str2) throws Throwable {
        Integer num;
        g();
        x(str);
        Map<String, Integer> map = this.f14343h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean v(String str) {
        return "1".equals(n(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean w(String str) {
        return "1".equals(n(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.u4.x(java.lang.String):void");
    }

    public final void y(String str, c.f.a.c.j.h.c1 c1Var) {
        a.f.a aVar = new a.f.a();
        a.f.a aVar2 = new a.f.a();
        a.f.a aVar3 = new a.f.a();
        if (c1Var != null) {
            for (int i2 = 0; i2 < c1Var.u(); i2++) {
                c.f.a.c.j.h.a1 a1VarR = c1Var.w(i2).r();
                if (TextUtils.isEmpty(a1VarR.u())) {
                    this.f14413a.c().r().a("EventConfig contained null event name");
                } else {
                    String strU = a1VarR.u();
                    String strB = a6.b(a1VarR.u());
                    if (!TextUtils.isEmpty(strB)) {
                        a1VarR.w(strB);
                        c1Var.y(i2, a1VarR);
                    }
                    c.f.a.c.j.h.l9.a();
                    if (!this.f14413a.z().w(null, m3.M0)) {
                        strU = a1VarR.u();
                    }
                    aVar.put(strU, Boolean.valueOf(a1VarR.y()));
                    aVar2.put(a1VarR.u(), Boolean.valueOf(a1VarR.z()));
                    if (a1VarR.A()) {
                        if (a1VarR.B() < 2 || a1VarR.B() > 65535) {
                            this.f14413a.c().r().c("Invalid sampling rate. Event name, sample rate", a1VarR.u(), Integer.valueOf(a1VarR.B()));
                        } else {
                            aVar3.put(a1VarR.u(), Integer.valueOf(a1VarR.B()));
                        }
                    }
                }
            }
        }
        this.f14340e.put(str, aVar);
        this.f14341f.put(str, aVar2);
        this.f14343h.put(str, aVar3);
    }

    public final c.f.a.c.j.h.d1 z(String str, byte[] bArr) {
        if (bArr == null) {
            return c.f.a.c.j.h.d1.G();
        }
        try {
            c.f.a.c.j.h.d1 d1VarM = ((c.f.a.c.j.h.c1) z9.I(c.f.a.c.j.h.d1.F(), bArr)).m();
            this.f14413a.c().w().c("Parsed config. version, gmp_app_id", d1VarM.w() ? Long.valueOf(d1VarM.x()) : null, d1VarM.y() ? d1VarM.z() : null);
            return d1VarM;
        } catch (c.f.a.c.j.h.w6 | RuntimeException e2) {
            this.f14413a.c().r().c("Unable to merge remote config. appId", y3.x(str), e2);
            return c.f.a.c.j.h.d1.G();
        }
    }
}
