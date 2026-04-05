package c.f.a.c.d.u;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11840a = new c.f.a.c.d.v.b("DiscoveryManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f11841b;

    public i0(o0 o0Var) {
        this.f11841b = o0Var;
    }

    public final c.f.a.c.g.a a() {
        try {
            return this.f11841b.o();
        } catch (RemoteException e2) {
            f11840a.b(e2, "Unable to call %s on %s.", "getWrappedThis", o0.class.getSimpleName());
            return null;
        }
    }
}
