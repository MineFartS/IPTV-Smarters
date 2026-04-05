package c.f.a.c.d.u;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.f.a.c.d.e;
import c.f.a.c.j.c.ee;
import c.f.a.c.j.c.ge;
import c.f.a.c.j.c.od;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class d extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11815d = new c.f.a.c.d.v.b("CastSession");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<e.d> f11817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f11818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.c.d.u.c f11819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.c.d.u.u.k.m f11820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ge f11821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ee f11822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.c.d.u.u.i f11823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CastDevice f11824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e.a f11825n;

    public class a implements c.f.a.c.f.o.k<e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11826a;

        public a(String str) {
            this.f11826a = str;
        }

        @Override // c.f.a.c.f.o.k
        public final /* synthetic */ void a(c.f.a.c.f.o.j jVar) {
            e.a aVar = (e.a) jVar;
            d.this.f11825n = aVar;
            try {
                if (!aVar.C().M()) {
                    d.f11815d.a("%s() -> failure result", this.f11826a);
                    d.this.f11818g.q(aVar.C().J());
                    return;
                }
                d.f11815d.a("%s() -> success result", this.f11826a);
                d.this.f11823l = new c.f.a.c.d.u.u.i(new c.f.a.c.d.v.o(null));
                d.this.f11823l.d0(d.this.f11822k);
                d.this.f11823l.i0();
                d.this.f11820i.j(d.this.f11823l, d.this.o());
                d.this.f11818g.i(aVar.t(), aVar.f(), aVar.getSessionId(), aVar.d());
            } catch (RemoteException e2) {
                d.f11815d.b(e2, "Unable to call %s on %s.", "methods", m0.class.getSimpleName());
            }
        }
    }

    public class b extends e.d {
        public b() {
        }

        @Override // c.f.a.c.d.e.d
        public final void a(int i2) {
            Iterator it = new HashSet(d.this.f11817f).iterator();
            while (it.hasNext()) {
                ((e.d) it.next()).a(i2);
            }
        }

        @Override // c.f.a.c.d.e.d
        public final void b(int i2) {
            d.this.F(i2);
            d.this.h(i2);
            Iterator it = new HashSet(d.this.f11817f).iterator();
            while (it.hasNext()) {
                ((e.d) it.next()).b(i2);
            }
        }

        @Override // c.f.a.c.d.e.d
        public final void c(c.f.a.c.d.d dVar) {
            Iterator it = new HashSet(d.this.f11817f).iterator();
            while (it.hasNext()) {
                ((e.d) it.next()).c(dVar);
            }
        }

        @Override // c.f.a.c.d.e.d
        public final void d() {
            Iterator it = new HashSet(d.this.f11817f).iterator();
            while (it.hasNext()) {
                ((e.d) it.next()).d();
            }
        }

        @Override // c.f.a.c.d.e.d
        public final void e(int i2) {
            Iterator it = new HashSet(d.this.f11817f).iterator();
            while (it.hasNext()) {
                ((e.d) it.next()).e(i2);
            }
        }

        @Override // c.f.a.c.d.e.d
        public final void f() {
            Iterator it = new HashSet(d.this.f11817f).iterator();
            while (it.hasNext()) {
                ((e.d) it.next()).f();
            }
        }
    }

    public class c extends k0 {
        public c() {
        }

        @Override // c.f.a.c.d.u.h0
        public final void N(String str, String str2) {
            if (d.this.f11822k != null) {
                d.this.f11822k.e(str, str2).d(d.this.new a("joinApplication"));
            }
        }

        @Override // c.f.a.c.d.u.h0
        public final void Y1(String str, c.f.a.c.d.h hVar) {
            if (d.this.f11822k != null) {
                d.this.f11822k.h(str, hVar).d(d.this.new a("launchApplication"));
            }
        }

        @Override // c.f.a.c.d.u.h0
        public final void a(String str) {
            if (d.this.f11822k != null) {
                d.this.f11822k.a(str);
            }
        }

        @Override // c.f.a.c.d.u.h0
        public final int c() {
            return 12451009;
        }

        @Override // c.f.a.c.d.u.h0
        public final void y2(int i2) {
            d.this.F(i2);
        }
    }

    /* JADX INFO: renamed from: c.f.a.c.d.u.d$d, reason: collision with other inner class name */
    public class C0152d implements od {
        public C0152d() {
        }

        @Override // c.f.a.c.j.c.od
        public final void a(int i2) {
            try {
                d.this.f11818g.onConnectionFailed(new c.f.a.c.f.b(i2));
            } catch (RemoteException e2) {
                d.f11815d.b(e2, "Unable to call %s on %s.", "onConnectionFailed", m0.class.getSimpleName());
            }
        }

        @Override // c.f.a.c.j.c.od
        public final void onConnected(Bundle bundle) {
            try {
                if (d.this.f11823l != null) {
                    d.this.f11823l.i0();
                }
                d.this.f11818g.onConnected(null);
            } catch (RemoteException e2) {
                d.f11815d.b(e2, "Unable to call %s on %s.", "onConnected", m0.class.getSimpleName());
            }
        }

        @Override // c.f.a.c.j.c.od
        public final void onConnectionSuspended(int i2) {
            try {
                d.this.f11818g.onConnectionSuspended(i2);
            } catch (RemoteException e2) {
                d.f11815d.b(e2, "Unable to call %s on %s.", "onConnectionSuspended", m0.class.getSimpleName());
            }
        }
    }

    public d(Context context, String str, String str2, c.f.a.c.d.u.c cVar, ge geVar, c.f.a.c.d.u.u.k.m mVar) {
        super(context, str, str2);
        this.f11817f = new HashSet();
        this.f11816e = context.getApplicationContext();
        this.f11819h = cVar;
        this.f11820i = mVar;
        this.f11821j = geVar;
        this.f11818g = c.f.a.c.j.c.h.c(context, cVar, m(), new c());
    }

    public final void D(Bundle bundle) {
        CastDevice castDeviceK = CastDevice.K(bundle);
        this.f11824m = castDeviceK;
        if (castDeviceK == null) {
            if (e()) {
                f(3103);
                return;
            } else {
                g(3101);
                return;
            }
        }
        ee eeVar = this.f11822k;
        if (eeVar != null) {
            eeVar.disconnect();
            this.f11822k = null;
        }
        f11815d.a("Acquiring a connection to Google Play Services for %s", this.f11824m);
        ee eeVarA = this.f11821j.a(this.f11816e, this.f11824m, this.f11819h, new b(), new C0152d());
        this.f11822k = eeVarA;
        eeVarA.connect();
    }

    public final void F(int i2) {
        this.f11820i.t(i2);
        ee eeVar = this.f11822k;
        if (eeVar != null) {
            eeVar.disconnect();
            this.f11822k = null;
        }
        this.f11824m = null;
        c.f.a.c.d.u.u.i iVar = this.f11823l;
        if (iVar != null) {
            iVar.d0(null);
            this.f11823l = null;
        }
        this.f11825n = null;
    }

    @Override // c.f.a.c.d.u.q
    public void a(boolean z) {
        try {
            this.f11818g.a1(z, 0);
        } catch (RemoteException e2) {
            f11815d.b(e2, "Unable to call %s on %s.", "disconnectFromDevice", m0.class.getSimpleName());
        }
        h(0);
    }

    @Override // c.f.a.c.d.u.q
    public long b() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.u.u.i iVar = this.f11823l;
        if (iVar == null) {
            return 0L;
        }
        return iVar.o() - this.f11823l.g();
    }

    @Override // c.f.a.c.d.u.q
    public void i(Bundle bundle) {
        this.f11824m = CastDevice.K(bundle);
    }

    @Override // c.f.a.c.d.u.q
    public void j(Bundle bundle) {
        this.f11824m = CastDevice.K(bundle);
    }

    @Override // c.f.a.c.d.u.q
    public void k(Bundle bundle) {
        D(bundle);
    }

    @Override // c.f.a.c.d.u.q
    public void l(Bundle bundle) {
        D(bundle);
    }

    public void n(e.d dVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (dVar != null) {
            this.f11817f.add(dVar);
        }
    }

    public CastDevice o() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f11824m;
    }

    public c.f.a.c.d.u.u.i p() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f11823l;
    }

    public double q() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        ee eeVar = this.f11822k;
        if (eeVar != null) {
            return eeVar.getVolume();
        }
        return 0.0d;
    }

    public boolean r() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        ee eeVar = this.f11822k;
        return eeVar != null && eeVar.m();
    }

    public void s(e.d dVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (dVar != null) {
            this.f11817f.remove(dVar);
        }
    }

    public void t(boolean z) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        ee eeVar = this.f11822k;
        if (eeVar != null) {
            eeVar.b(z);
        }
    }

    public void u(double d2) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        ee eeVar = this.f11822k;
        if (eeVar != null) {
            eeVar.f(d2);
        }
    }
}
