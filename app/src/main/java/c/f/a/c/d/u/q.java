package c.f.a.c.d.u;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11916a = new c.f.a.c.d.v.b("Session");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f11917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11918c;

    public class a extends y {
        public a() {
        }

        @Override // c.f.a.c.d.u.w
        public final void O0(Bundle bundle) {
            q.this.k(bundle);
        }

        @Override // c.f.a.c.d.u.w
        public final long R() {
            return q.this.b();
        }

        @Override // c.f.a.c.d.u.w
        public final void W0(boolean z) {
            q.this.a(z);
        }

        @Override // c.f.a.c.d.u.w
        public final void W1(Bundle bundle) {
            q.this.j(bundle);
        }

        @Override // c.f.a.c.d.u.w
        public final void Z(Bundle bundle) {
            q.this.i(bundle);
        }

        @Override // c.f.a.c.d.u.w
        public final int c() {
            return 12451009;
        }

        @Override // c.f.a.c.d.u.w
        public final c.f.a.c.g.a e1() {
            return c.f.a.c.g.b.K2(q.this);
        }

        @Override // c.f.a.c.d.u.w
        public final void i1(Bundle bundle) {
            q.this.l(bundle);
        }
    }

    public q(Context context, String str, String str2) {
        a aVar = new a();
        this.f11918c = aVar;
        this.f11917b = c.f.a.c.j.c.h.e(context, str, str2, aVar);
    }

    public abstract void a(boolean z);

    public long b() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return 0L;
    }

    public boolean c() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return this.f11917b.isConnected();
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "isConnected", s0.class.getSimpleName());
            return false;
        }
    }

    public boolean d() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return this.f11917b.isConnecting();
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "isConnecting", s0.class.getSimpleName());
            return false;
        }
    }

    public boolean e() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return this.f11917b.Q1();
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "isResuming", s0.class.getSimpleName());
            return false;
        }
    }

    public final void f(int i2) {
        try {
            this.f11917b.X1(i2);
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "notifyFailedToResumeSession", s0.class.getSimpleName());
        }
    }

    public final void g(int i2) {
        try {
            this.f11917b.x1(i2);
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "notifyFailedToStartSession", s0.class.getSimpleName());
        }
    }

    public final void h(int i2) {
        try {
            this.f11917b.q0(i2);
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "notifySessionEnded", s0.class.getSimpleName());
        }
    }

    public void i(Bundle bundle) {
    }

    public void j(Bundle bundle) {
    }

    public abstract void k(Bundle bundle);

    public abstract void l(Bundle bundle);

    public final c.f.a.c.g.a m() {
        try {
            return this.f11917b.S1();
        } catch (RemoteException e2) {
            f11916a.b(e2, "Unable to call %s on %s.", "getWrappedObject", s0.class.getSimpleName());
            return null;
        }
    }
}
