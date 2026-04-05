package c.f.a.c.d.u;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11920a = new c.f.a.c.d.v.b("SessionManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f11921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11922c;

    public r(t0 t0Var, Context context) {
        this.f11921b = t0Var;
        this.f11922c = context;
    }

    public <T extends q> void a(s<T> sVar, Class<T> cls) {
        c.f.a.c.f.q.o.i(sVar);
        c.f.a.c.f.q.o.i(cls);
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            this.f11921b.S(new b0(sVar, cls));
        } catch (RemoteException e2) {
            f11920a.b(e2, "Unable to call %s on %s.", "addSessionManagerListener", t0.class.getSimpleName());
        }
    }

    public void b(boolean z) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            f11920a.e("End session for %s", this.f11922c.getPackageName());
            this.f11921b.t(true, z);
        } catch (RemoteException e2) {
            f11920a.b(e2, "Unable to call %s on %s.", "endCurrentSession", t0.class.getSimpleName());
        }
    }

    public d c() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        q qVarD = d();
        if (qVarD == null || !(qVarD instanceof d)) {
            return null;
        }
        return (d) qVarD;
    }

    public q d() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return (q) c.f.a.c.g.b.I2(this.f11921b.q2());
        } catch (RemoteException e2) {
            f11920a.b(e2, "Unable to call %s on %s.", "getWrappedCurrentSession", t0.class.getSimpleName());
            return null;
        }
    }

    public <T extends q> void e(s<T> sVar, Class cls) {
        c.f.a.c.f.q.o.i(cls);
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (sVar == null) {
            return;
        }
        try {
            this.f11921b.i0(new b0(sVar, cls));
        } catch (RemoteException e2) {
            f11920a.b(e2, "Unable to call %s on %s.", "removeSessionManagerListener", t0.class.getSimpleName());
        }
    }

    public final c.f.a.c.g.a f() {
        try {
            return this.f11921b.o();
        } catch (RemoteException e2) {
            f11920a.b(e2, "Unable to call %s on %s.", "getWrappedThis", t0.class.getSimpleName());
            return null;
        }
    }
}
