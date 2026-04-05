package c.f.a.c.j.c;

import a.t.l.g;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f13015a = new c.f.a.c.d.v.b("MediaRouterCallback");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13016b;

    public p(n nVar) {
        this.f13016b = (n) c.f.a.c.f.q.o.i(nVar);
    }

    @Override // a.t.l.g.a
    public final void d(a.t.l.g gVar, g.C0076g c0076g) {
        try {
            this.f13016b.g(c0076g.h(), c0076g.f());
        } catch (RemoteException e2) {
            f13015a.b(e2, "Unable to call %s on %s.", "onRouteAdded", n.class.getSimpleName());
        }
    }

    @Override // a.t.l.g.a
    public final void e(a.t.l.g gVar, g.C0076g c0076g) {
        try {
            this.f13016b.A2(c0076g.h(), c0076g.f());
        } catch (RemoteException e2) {
            f13015a.b(e2, "Unable to call %s on %s.", "onRouteChanged", n.class.getSimpleName());
        }
    }

    @Override // a.t.l.g.a
    public final void g(a.t.l.g gVar, g.C0076g c0076g) {
        try {
            this.f13016b.i2(c0076g.h(), c0076g.f());
        } catch (RemoteException e2) {
            f13015a.b(e2, "Unable to call %s on %s.", "onRouteRemoved", n.class.getSimpleName());
        }
    }

    @Override // a.t.l.g.a
    public final void h(a.t.l.g gVar, g.C0076g c0076g) {
        try {
            this.f13016b.I1(c0076g.h(), c0076g.f());
        } catch (RemoteException e2) {
            f13015a.b(e2, "Unable to call %s on %s.", "onRouteSelected", n.class.getSimpleName());
        }
    }

    @Override // a.t.l.g.a
    public final void j(a.t.l.g gVar, g.C0076g c0076g, int i2) {
        try {
            this.f13016b.b1(c0076g.h(), c0076g.f(), i2);
        } catch (RemoteException e2) {
            f13015a.b(e2, "Unable to call %s on %s.", "onRouteUnselected", n.class.getSimpleName());
        }
    }
}
