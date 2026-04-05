package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import c.f.a.c.j.h.td;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u8 extends f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t8 f14363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3 f14364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f14365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f14366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l9 f14367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Runnable> f14368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f14369i;

    public u8(c5 c5Var) {
        super(c5Var);
        this.f14368h = new ArrayList();
        this.f14367g = new l9(c5Var.a());
        this.f14363c = new t8(this);
        this.f14366f = new d8(this, c5Var);
        this.f14369i = new f8(this, c5Var);
    }

    public static /* synthetic */ void x(u8 u8Var, ComponentName componentName) {
        u8Var.g();
        if (u8Var.f14364d != null) {
            u8Var.f14364d = null;
            u8Var.f14413a.c().w().b("Disconnected from device MeasurementService", componentName);
            u8Var.g();
            u8Var.p();
        }
    }

    public static /* synthetic */ p3 y(u8 u8Var, p3 p3Var) {
        u8Var.f14364d = null;
        return null;
    }

    public final boolean C() {
        this.f14413a.e();
        return true;
    }

    public final void D() {
        g();
        this.f14367g.a();
        m mVar = this.f14366f;
        this.f14413a.z();
        mVar.b(m3.K.b(null).longValue());
    }

    public final void E(Runnable runnable) {
        g();
        if (H()) {
            runnable.run();
            return;
        }
        int size = this.f14368h.size();
        this.f14413a.z();
        if (size >= 1000) {
            this.f14413a.c().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f14368h.add(runnable);
        this.f14369i.b(60000L);
        p();
    }

    public final void F() {
        g();
        this.f14413a.c().w().b("Processing queued up service tasks", Integer.valueOf(this.f14368h.size()));
        Iterator<Runnable> it = this.f14368h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e2) {
                this.f14413a.c().o().b("Task exception while flushing queue", e2);
            }
        }
        this.f14368h.clear();
        this.f14369i.d();
    }

    public final la G(boolean z) {
        Pair<String, Long> pairB;
        this.f14413a.e();
        q3 q3VarF = this.f14413a.f();
        String string = null;
        if (z) {
            y3 y3VarC = this.f14413a.c();
            if (y3VarC.f14413a.A().f14175e != null && (pairB = y3VarC.f14413a.A().f14175e.b()) != null && pairB != o4.f14173c) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb.append(strValueOf);
                sb.append(":");
                sb.append(str);
                string = sb.toString();
            }
        }
        return q3VarF.o(string);
    }

    public final boolean H() {
        g();
        i();
        return this.f14364d != null;
    }

    public final void I() {
        g();
        i();
        E(new g8(this, G(true)));
    }

    public final void J(boolean z) {
        c.f.a.c.j.h.ha.a();
        if (this.f14413a.z().w(null, m3.G0)) {
            g();
            i();
            if (z) {
                C();
                this.f14413a.I().o();
            }
            if (v()) {
                E(new i8(this, G(false)));
            }
        }
    }

    public final void K(p3 p3Var, c.f.a.c.f.q.w.a aVar, la laVar) {
        int size;
        w3 w3VarO;
        String str;
        g();
        i();
        C();
        this.f14413a.z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<c.f.a.c.f.q.w.a> listS = this.f14413a.I().s(100);
            if (listS != null) {
                arrayList.addAll(listS);
                size = listS.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                c.f.a.c.f.q.w.a aVar2 = (c.f.a.c.f.q.w.a) arrayList.get(i4);
                if (aVar2 instanceof t) {
                    try {
                        p3Var.B2((t) aVar2, laVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        w3VarO = this.f14413a.c().o();
                        str = "Failed to send event to the service";
                        w3VarO.b(str, e);
                    }
                } else if (aVar2 instanceof aa) {
                    try {
                        p3Var.t1((aa) aVar2, laVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        w3VarO = this.f14413a.c().o();
                        str = "Failed to send user property to the service";
                        w3VarO.b(str, e);
                    }
                } else if (aVar2 instanceof b) {
                    try {
                        p3Var.u0((b) aVar2, laVar);
                    } catch (RemoteException e4) {
                        e = e4;
                        w3VarO = this.f14413a.c().o();
                        str = "Failed to send conditional user property to the service";
                        w3VarO.b(str, e);
                    }
                } else {
                    this.f14413a.c().o().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = size;
        }
    }

    public final void L(t tVar, String str) {
        c.f.a.c.f.q.o.i(tVar);
        g();
        i();
        C();
        E(new j8(this, true, G(true), this.f14413a.I().p(tVar), tVar, str));
    }

    public final void M(b bVar) {
        c.f.a.c.f.q.o.i(bVar);
        g();
        i();
        this.f14413a.e();
        E(new k8(this, true, G(true), this.f14413a.I().r(bVar), new b(bVar), bVar));
    }

    public final void N(AtomicReference<List<b>> atomicReference, String str, String str2, String str3) {
        g();
        i();
        E(new l8(this, atomicReference, null, str2, str3, G(false)));
    }

    public final void O(td tdVar, String str, String str2) {
        g();
        i();
        E(new m8(this, str, str2, G(false), tdVar));
    }

    public final void P(AtomicReference<List<aa>> atomicReference, String str, String str2, String str3, boolean z) {
        g();
        i();
        E(new n8(this, atomicReference, null, str2, str3, G(false), z));
    }

    public final void Q(td tdVar, String str, String str2, boolean z) {
        g();
        i();
        E(new v7(this, str, str2, G(false), z, tdVar));
    }

    public final void R(aa aaVar) {
        g();
        i();
        C();
        E(new w7(this, G(true), this.f14413a.I().q(aaVar), aaVar));
    }

    public final void S() {
        g();
        i();
        la laVarG = G(false);
        C();
        this.f14413a.I().o();
        E(new x7(this, laVarG));
    }

    public final void T(AtomicReference<String> atomicReference) {
        g();
        i();
        E(new y7(this, atomicReference, G(false)));
    }

    public final void U(td tdVar) {
        g();
        i();
        E(new z7(this, G(false), tdVar));
    }

    public final void V() {
        g();
        i();
        la laVarG = G(true);
        this.f14413a.I().t();
        E(new a8(this, laVarG));
    }

    public final void W(n7 n7Var) {
        g();
        i();
        E(new b8(this, n7Var));
    }

    @Override // c.f.a.c.k.b.f4
    public final boolean l() {
        return false;
    }

    public final void o(Bundle bundle) {
        g();
        i();
        E(new c8(this, G(false), bundle));
    }

    public final void p() {
        g();
        i();
        if (H()) {
            return;
        }
        if (r()) {
            this.f14363c.c();
            return;
        }
        if (this.f14413a.z().H()) {
            return;
        }
        this.f14413a.e();
        List<ResolveInfo> listQueryIntentServices = this.f14413a.b().getPackageManager().queryIntentServices(new Intent().setClassName(this.f14413a.b(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
            this.f14413a.c().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextB = this.f14413a.b();
        this.f14413a.e();
        intent.setComponent(new ComponentName(contextB, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f14363c.a(intent);
    }

    public final Boolean q() {
        return this.f14365e;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r() {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.u8.r():boolean");
    }

    public final void s(p3 p3Var) {
        g();
        c.f.a.c.f.q.o.i(p3Var);
        this.f14364d = p3Var;
        D();
        F();
    }

    public final void t() {
        g();
        i();
        this.f14363c.b();
        try {
            c.f.a.c.f.s.a.b().c(this.f14413a.b(), this.f14363c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f14364d = null;
    }

    public final void u(td tdVar, t tVar, String str) {
        g();
        i();
        if (this.f14413a.G().O(12451000) == 0) {
            E(new e8(this, tVar, str, tdVar));
        } else {
            this.f14413a.c().r().a("Not bundling data. Service unavailable or out of date");
            this.f14413a.G().U(tdVar, new byte[0]);
        }
    }

    public final boolean v() {
        g();
        i();
        if (this.f14413a.z().w(null, m3.I0)) {
            return !r() || this.f14413a.G().N() >= m3.J0.b(null).intValue();
        }
        return false;
    }
}
