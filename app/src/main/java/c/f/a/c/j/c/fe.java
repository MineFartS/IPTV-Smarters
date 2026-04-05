package c.f.a.c.j.c;

import android.content.Context;
import android.os.Bundle;
import c.f.a.c.d.e;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class fe implements ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12834a = new c.f.a.c.d.v.b("CastApiAdapter");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne f12835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CastDevice f12837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.c.d.u.c f12838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e.d f12839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od f12840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.c.d.y1 f12841h;

    public fe(ne neVar, Context context, CastDevice castDevice, c.f.a.c.d.u.c cVar, e.d dVar, od odVar) {
        this.f12835b = neVar;
        this.f12836c = context;
        this.f12837d = castDevice;
        this.f12838e = cVar;
        this.f12839f = dVar;
        this.f12840g = odVar;
    }

    public static final /* synthetic */ e.a i(Status status) {
        return new c(status);
    }

    public static final /* synthetic */ Status j(Void r1) {
        return new Status(0);
    }

    public static final /* synthetic */ e.a l(e.a aVar) {
        return aVar;
    }

    public static final /* synthetic */ e.a n(Status status) {
        return new c(status);
    }

    public static final /* synthetic */ e.a o(e.a aVar) {
        return aVar;
    }

    public static final /* synthetic */ Status p(Status status) {
        return status;
    }

    @Override // c.f.a.c.j.c.ee
    public final void a(String str) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            y1Var.t(str);
        }
    }

    @Override // c.f.a.c.j.c.ee
    public final void b(boolean z) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            y1Var.s(z);
        }
    }

    @Override // c.f.a.c.j.c.ee
    public final c.f.a.c.f.o.g<Status> c(String str, String str2) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            return s.a(y1Var.n(str, str2), ie.f12887a, he.f12862a);
        }
        return null;
    }

    @Override // c.f.a.c.j.c.ee
    public final void connect() {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        b bVar = null;
        if (y1Var != null) {
            y1Var.l();
            this.f12841h = null;
        }
        f12834a.a("Acquiring a connection to Google Play Services for %s", this.f12837d);
        d dVar = new d(this);
        ne neVar = this.f12835b;
        Context context = this.f12836c;
        Bundle bundle = new Bundle();
        c.f.a.c.d.u.c cVar = this.f12838e;
        bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (cVar == null || cVar.I() == null || this.f12838e.I().M() == null) ? false : true);
        c.f.a.c.d.u.c cVar2 = this.f12838e;
        bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", (cVar2 == null || cVar2.I() == null || !this.f12838e.I().N()) ? false : true);
        c.f.a.c.d.y1 y1VarA = neVar.a(context, new e.c.a(this.f12837d, this.f12839f).c(bundle).a(), dVar);
        this.f12841h = y1VarA;
        y1VarA.k();
    }

    @Override // c.f.a.c.j.c.ee
    public final void d(String str, e.InterfaceC0151e interfaceC0151e) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            y1Var.v(str, interfaceC0151e);
        }
    }

    @Override // c.f.a.c.j.c.ee
    public final void disconnect() {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            y1Var.l();
            this.f12841h = null;
        }
    }

    @Override // c.f.a.c.j.c.ee
    public final c.f.a.c.f.o.g<e.a> e(String str, String str2) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            return s.a(y1Var.u(str, str2), ke.f12918a, je.f12896a);
        }
        return null;
    }

    @Override // c.f.a.c.j.c.ee
    public final void f(double d2) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            y1Var.r(d2);
        }
    }

    @Override // c.f.a.c.j.c.ee
    public final void g(String str) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            y1Var.o(str);
        }
    }

    @Override // c.f.a.c.j.c.ee
    public final double getVolume() {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            return y1Var.getVolume();
        }
        return 0.0d;
    }

    @Override // c.f.a.c.j.c.ee
    public final c.f.a.c.f.o.g<e.a> h(String str, c.f.a.c.d.h hVar) {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        if (y1Var != null) {
            return s.a(y1Var.p(str, hVar), me.f12950a, le.f12937a);
        }
        return null;
    }

    @Override // c.f.a.c.j.c.ee
    public final boolean m() {
        c.f.a.c.d.y1 y1Var = this.f12841h;
        return y1Var != null && y1Var.m();
    }
}
