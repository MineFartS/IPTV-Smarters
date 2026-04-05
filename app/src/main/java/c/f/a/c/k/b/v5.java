package c.f.a.c.k.b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import c.f.a.c.j.h.vb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class v5 extends o3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9 f14388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f14389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14390d;

    public v5(x9 x9Var, String str) {
        c.f.a.c.f.q.o.i(x9Var);
        this.f14388b = x9Var;
        this.f14390d = null;
    }

    @Override // c.f.a.c.k.b.p3
    public final List<aa> B0(la laVar, boolean z) {
        M2(laVar, false);
        try {
            List<ca> list = (List) this.f14388b.d().p(new s5(this, laVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ca caVar : list) {
                if (z || !ea.F(caVar.f13809c)) {
                    arrayList.add(new aa(caVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f14388b.c().o().c("Failed to get user properties. appId", y3.x(laVar.f14070b), e2);
            return null;
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final void B2(t tVar, la laVar) {
        c.f.a.c.f.q.o.i(tVar);
        M2(laVar, false);
        I2(new o5(this, tVar, laVar));
    }

    @Override // c.f.a.c.k.b.p3
    public final List<aa> G0(String str, String str2, boolean z, la laVar) {
        M2(laVar, false);
        try {
            List<ca> list = (List) this.f14388b.d().p(new h5(this, laVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ca caVar : list) {
                if (z || !ea.F(caVar.f13809c)) {
                    arrayList.add(new aa(caVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f14388b.c().o().c("Failed to query user properties. appId", y3.x(laVar.f14070b), e2);
            return Collections.emptyList();
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final List<aa> G2(String str, String str2, String str3, boolean z) {
        N2(str, true);
        try {
            List<ca> list = (List) this.f14388b.d().p(new i5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ca caVar : list) {
                if (z || !ea.F(caVar.f13809c)) {
                    arrayList.add(new aa(caVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.f14388b.c().o().c("Failed to get user properties as. appId", y3.x(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final String I(la laVar) {
        M2(laVar, false);
        return this.f14388b.D(laVar);
    }

    public final void I2(Runnable runnable) {
        c.f.a.c.f.q.o.i(runnable);
        if (this.f14388b.d().o()) {
            runnable.run();
        } else {
            this.f14388b.d().r(runnable);
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final List<b> J0(String str, String str2, String str3) {
        N2(str, true);
        try {
            return (List) this.f14388b.d().p(new k5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f14388b.c().o().b("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    public final /* synthetic */ void K2(la laVar, Bundle bundle) {
        j jVarZ = this.f14388b.Z();
        String str = laVar.f14070b;
        jVarZ.g();
        jVarZ.i();
        byte[] bArrD = jVarZ.f14198b.e0().w(new o(jVarZ.f14413a, BuildConfig.FLAVOR, str, "dep", 0L, 0L, bundle)).d();
        jVarZ.f14413a.c().w().c("Saving default event parameters, appId, data size", jVarZ.f14413a.H().p(str), Integer.valueOf(bArrD.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrD);
        try {
            if (jVarZ.N().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                jVarZ.f14413a.c().o().b("Failed to insert default event parameters (got -1). appId", y3.x(str));
            }
        } catch (SQLiteException e2) {
            jVarZ.f14413a.c().o().c("Error storing default event parameters. appId", y3.x(str), e2);
        }
    }

    public final void M2(la laVar, boolean z) {
        c.f.a.c.f.q.o.i(laVar);
        N2(laVar.f14070b, false);
        this.f14388b.h0().o(laVar.f14071c, laVar.r, laVar.v);
    }

    @Override // c.f.a.c.k.b.p3
    public final void N0(la laVar) {
        N2(laVar.f14070b, false);
        I2(new l5(this, laVar));
    }

    public final void N2(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f14388b.c().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f14389c == null) {
                    this.f14389c = Boolean.valueOf("com.google.android.gms".equals(this.f14390d) || c.f.a.c.f.t.o.a(this.f14388b.b(), Binder.getCallingUid()) || c.f.a.c.f.k.a(this.f14388b.b()).c(Binder.getCallingUid()));
                }
                if (this.f14389c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                this.f14388b.c().o().b("Measurement Service called with invalid calling package. appId", y3.x(str));
                throw e2;
            }
        }
        if (this.f14390d == null && c.f.a.c.f.j.k(this.f14388b.b(), Binder.getCallingUid(), str)) {
            this.f14390d = str;
        }
        if (str.equals(this.f14390d)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final void S0(final Bundle bundle, final la laVar) {
        vb.a();
        if (this.f14388b.W().w(null, m3.B0)) {
            M2(laVar, false);
            I2(new Runnable(this, laVar, bundle) { // from class: c.f.a.c.k.b.d5

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final v5 f13825b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final la f13826c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Bundle f13827d;

                {
                    this.f13825b = this;
                    this.f13826c = laVar;
                    this.f13827d = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f13825b.K2(this.f13826c, this.f13827d);
                }
            });
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final void T0(b bVar) {
        c.f.a.c.f.q.o.i(bVar);
        c.f.a.c.f.q.o.i(bVar.f13739d);
        N2(bVar.f13737b, true);
        I2(new f5(this, new b(bVar)));
    }

    @Override // c.f.a.c.k.b.p3
    public final void X0(t tVar, String str, String str2) {
        c.f.a.c.f.q.o.i(tVar);
        c.f.a.c.f.q.o.e(str);
        N2(str, true);
        I2(new p5(this, tVar, str));
    }

    @Override // c.f.a.c.k.b.p3
    public final byte[] Z0(t tVar, String str) {
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.i(tVar);
        N2(str, true);
        this.f14388b.c().v().b("Log and bundle. event", this.f14388b.g0().p(tVar.f14310b));
        long jC = this.f14388b.a().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f14388b.d().q(new q5(this, tVar, str)).get();
            if (bArr == null) {
                this.f14388b.c().o().b("Log and bundle returned null. appId", y3.x(str));
                bArr = new byte[0];
            }
            this.f14388b.c().v().d("Log and bundle processed. event, size, time_ms", this.f14388b.g0().p(tVar.f14310b), Integer.valueOf(bArr.length), Long.valueOf((this.f14388b.a().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.f14388b.c().o().d("Failed to log and bundle. appId, event, error", y3.x(str), this.f14388b.g0().p(tVar.f14310b), e2);
            return null;
        }
    }

    public final t c1(t tVar, la laVar) {
        r rVar;
        if ("_cmp".equals(tVar.f14310b) && (rVar = tVar.f14311c) != null && rVar.J() != 0) {
            String strI = tVar.f14311c.I("_cis");
            if ("referrer broadcast".equals(strI) || "referrer API".equals(strI)) {
                this.f14388b.c().u().b("Event has been filtered ", tVar.toString());
                return new t("_cmpx", tVar.f14311c, tVar.f14312d, tVar.f14313e);
            }
        }
        return tVar;
    }

    @Override // c.f.a.c.k.b.p3
    public final void f2(la laVar) {
        M2(laVar, false);
        I2(new t5(this, laVar));
    }

    @Override // c.f.a.c.k.b.p3
    public final void o1(la laVar) {
        M2(laVar, false);
        I2(new m5(this, laVar));
    }

    @Override // c.f.a.c.k.b.p3
    public final List<b> r(String str, String str2, la laVar) {
        M2(laVar, false);
        try {
            return (List) this.f14388b.d().p(new j5(this, laVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.f14388b.c().o().b("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // c.f.a.c.k.b.p3
    public final void t1(aa aaVar, la laVar) {
        c.f.a.c.f.q.o.i(aaVar);
        M2(laVar, false);
        I2(new r5(this, aaVar, laVar));
    }

    @Override // c.f.a.c.k.b.p3
    public final void u0(b bVar, la laVar) {
        c.f.a.c.f.q.o.i(bVar);
        c.f.a.c.f.q.o.i(bVar.f13739d);
        M2(laVar, false);
        b bVar2 = new b(bVar);
        bVar2.f13737b = laVar.f14070b;
        I2(new e5(this, bVar2, laVar));
    }

    @Override // c.f.a.c.k.b.p3
    public final void v0(long j2, String str, String str2, String str3) {
        I2(new u5(this, str2, str3, str, j2));
    }

    @Override // c.f.a.c.k.b.p3
    public final void x(la laVar) {
        c.f.a.c.j.h.ha.a();
        if (this.f14388b.W().w(null, m3.I0)) {
            c.f.a.c.f.q.o.e(laVar.f14070b);
            c.f.a.c.f.q.o.i(laVar.w);
            n5 n5Var = new n5(this, laVar);
            c.f.a.c.f.q.o.i(n5Var);
            if (this.f14388b.d().o()) {
                n5Var.run();
            } else {
                this.f14388b.d().t(n5Var);
            }
        }
    }
}
