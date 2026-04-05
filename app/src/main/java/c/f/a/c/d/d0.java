package c.f.a.c.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import c.f.a.c.d.e;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.e;
import c.f.a.c.f.o.n.j;
import c.f.a.c.f.o.n.o;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UseSparseArrays"})
public final class d0 extends c.f.a.c.f.o.e<e.c> implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11588a = new c.f.a.c.d.v.b("CastClient");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.AbstractC0156a<c.f.a.c.d.v.n0, e.c> f11589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.f.a.c.f.o.a<e.c> f11590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f11591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f11592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.c.o.j<e.a> f11596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.c.o.j<Status> f11597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f11598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f11599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f11600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f11601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11602o;
    public double p;
    public boolean q;
    public int r;
    public int s;
    public z t;
    public double u;
    public final CastDevice v;
    public final Map<Long, c.f.a.c.o.j<Void>> w;
    public final Map<String, e.InterfaceC0151e> x;
    public final e.d y;
    public final List<a2> z;

    static {
        q0 q0Var = new q0();
        f11589b = q0Var;
        f11590c = new c.f.a.c.f.o.a<>("Cast.API_CXLESS", q0Var, c.f.a.c.d.v.m.f12168b);
    }

    public d0(Context context, e.c cVar) {
        super(context, f11590c, cVar, e.a.f12357a);
        this.f11591d = new p0(this);
        this.f11599l = new Object();
        this.f11600m = new Object();
        this.z = Collections.synchronizedList(new ArrayList());
        c.f.a.c.f.q.o.j(context, "context cannot be null");
        c.f.a.c.f.q.o.j(cVar, "CastOptions cannot be null");
        this.y = cVar.f11607b;
        this.v = cVar.f11606a;
        this.w = new HashMap();
        this.x = new HashMap();
        this.f11598k = new AtomicLong(0L);
        this.f11593f = z1.f12233a;
        this.u = c0();
        this.f11592e = new c.f.a.c.j.c.w0(getLooper());
    }

    public static /* synthetic */ boolean L(d0 d0Var, boolean z) {
        d0Var.f11594g = true;
        return true;
    }

    public static final /* synthetic */ void N(c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        ((c.f.a.c.d.v.h) n0Var.getService()).disconnect();
        jVar.c(null);
    }

    public static /* synthetic */ boolean P(d0 d0Var, boolean z) {
        d0Var.f11595h = true;
        return true;
    }

    public static final /* synthetic */ void T(c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        ((c.f.a.c.d.v.h) n0Var.getService()).K0();
        jVar.c(Boolean.TRUE);
    }

    public static c.f.a.c.f.o.b W(int i2) {
        return c.f.a.c.f.q.b.a(new Status(i2));
    }

    public final /* synthetic */ void E(c.f.a.c.j.c.d1 d1Var, String str, String str2, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        long jIncrementAndGet = this.f11598k.incrementAndGet();
        b();
        try {
            this.w.put(Long.valueOf(jIncrementAndGet), jVar);
            if (d1Var == null) {
                ((c.f.a.c.d.v.h) n0Var.getService()).H(str, str2, jIncrementAndGet);
            } else {
                ((c.f.a.c.d.v.h) n0Var.getService()).K(str, str2, jIncrementAndGet, (String) d1Var.b());
            }
        } catch (RemoteException e2) {
            this.w.remove(Long.valueOf(jIncrementAndGet));
            jVar.b(e2);
        }
    }

    public final void F(c.f.a.c.o.j<e.a> jVar) {
        synchronized (this.f11599l) {
            if (this.f11596i != null) {
                S(AdError.CACHE_ERROR_CODE);
            }
            this.f11596i = jVar;
        }
    }

    public final /* synthetic */ void G(String str, e.InterfaceC0151e interfaceC0151e, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        a0();
        ((c.f.a.c.d.v.h) n0Var.getService()).p0(str);
        if (interfaceC0151e != null) {
            ((c.f.a.c.d.v.h) n0Var.getService()).P1(str);
        }
        jVar.c(null);
    }

    public final /* synthetic */ void H(String str, h hVar, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        b();
        ((c.f.a.c.d.v.h) n0Var.getService()).C2(str, hVar);
        F(jVar);
    }

    public final /* synthetic */ void I(String str, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        b();
        ((c.f.a.c.d.v.h) n0Var.getService()).a(str);
        synchronized (this.f11600m) {
            if (this.f11597j != null) {
                jVar.b(W(AdError.INTERNAL_ERROR_CODE));
            } else {
                this.f11597j = jVar;
            }
        }
    }

    public final /* synthetic */ void J(String str, String str2, y0 y0Var, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        b();
        ((c.f.a.c.d.v.h) n0Var.getService()).E(str, str2, y0Var);
        F(jVar);
    }

    public final /* synthetic */ void K(boolean z, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        ((c.f.a.c.d.v.h) n0Var.getService()).o0(z, this.p, this.q);
        jVar.c(null);
    }

    public final void S(int i2) {
        synchronized (this.f11599l) {
            c.f.a.c.o.j<e.a> jVar = this.f11596i;
            if (jVar != null) {
                jVar.b(W(i2));
            }
            this.f11596i = null;
        }
    }

    public final void V(int i2) {
        synchronized (this.f11600m) {
            c.f.a.c.o.j<Status> jVar = this.f11597j;
            if (jVar == null) {
                return;
            }
            if (i2 == 0) {
                jVar.c(new Status(i2));
            } else {
                jVar.b(W(i2));
            }
            this.f11597j = null;
        }
    }

    public final void Z() {
        f11588a.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.x) {
            this.x.clear();
        }
    }

    public final void a0() {
        c.f.a.c.f.q.o.m(this.f11593f != z1.f12233a, "Not active connection");
    }

    public final void b() {
        c.f.a.c.f.q.o.m(this.f11593f == z1.f12234b, "Not connected to device");
    }

    public final void b0() {
        this.r = -1;
        this.s = -1;
        this.f11601n = null;
        this.f11602o = null;
        this.p = 0.0d;
        this.u = c0();
        this.q = false;
        this.t = null;
    }

    public final double c0() {
        if (this.v.O(2048)) {
            return 0.02d;
        }
        return (!this.v.O(4) || this.v.O(1) || "Chromecast Audio".equals(this.v.M())) ? 0.05d : 0.02d;
    }

    public final c.f.a.c.o.i<Boolean> e(c.f.a.c.d.v.j jVar) {
        return doUnregisterEventListener((j.a) c.f.a.c.f.q.o.j(registerListener(jVar, "castDeviceControllerListenerKey").b(), "Key must not be null"));
    }

    @Override // c.f.a.c.d.y1
    public final double getVolume() {
        b();
        return this.p;
    }

    public final /* synthetic */ void h(double d2, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        ((c.f.a.c.d.v.h) n0Var.getService()).t0(d2, this.p, this.q);
        jVar.c(null);
    }

    public final void i(long j2, int i2) {
        c.f.a.c.o.j<Void> jVar;
        synchronized (this.w) {
            jVar = this.w.get(Long.valueOf(j2));
            this.w.remove(Long.valueOf(j2));
        }
        if (jVar != null) {
            if (i2 == 0) {
                jVar.c(null);
            } else {
                jVar.b(W(i2));
            }
        }
    }

    public final void j(e.a aVar) {
        synchronized (this.f11599l) {
            c.f.a.c.o.j<e.a> jVar = this.f11596i;
            if (jVar != null) {
                jVar.c(aVar);
            }
            this.f11596i = null;
        }
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> k() {
        Object objRegisterListener = registerListener(this.f11591d, "castDeviceControllerListenerKey");
        o.a aVarA = c.f.a.c.f.o.n.o.a();
        return doRegisterEventListener(aVarA.e(objRegisterListener).b(new c.f.a.c.f.o.n.p(this) { // from class: c.f.a.c.d.f0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11616a;

            {
                this.f11616a = this;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                c.f.a.c.d.v.n0 n0Var = (c.f.a.c.d.v.n0) obj;
                ((c.f.a.c.d.v.h) n0Var.getService()).I0(this.f11616a.f11591d);
                ((c.f.a.c.d.v.h) n0Var.getService()).connect();
                ((c.f.a.c.o.j) obj2).c(null);
            }
        }).d(e0.f11615a).c(b0.f11568b).a());
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> l() {
        c.f.a.c.o.i iVarDoWrite = doWrite(c.f.a.c.f.o.n.r.a().b(k0.f11678a).a());
        Z();
        e(this.f11591d);
        return iVarDoWrite;
    }

    @Override // c.f.a.c.d.y1
    public final boolean m() {
        b();
        return this.q;
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> n(final String str, final String str2) {
        c.f.a.c.d.v.a.d(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if (str2.length() <= 524288) {
            final c.f.a.c.j.c.d1 d1Var = null;
            return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, d1Var, str, str2) { // from class: c.f.a.c.d.m0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d0 f11698a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final c.f.a.c.j.c.d1 f11699b = null;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f11700c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f11701d;

                {
                    this.f11698a = this;
                    this.f11700c = str;
                    this.f11701d = str2;
                }

                @Override // c.f.a.c.f.o.n.p
                public final void accept(Object obj, Object obj2) {
                    this.f11698a.E(null, this.f11700c, this.f11701d, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
                }
            }).a());
        }
        f11588a.g("Message send failed. Message exceeds maximum size", new Object[0]);
        throw new IllegalArgumentException("Message exceeds maximum size524288");
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> o(final String str) {
        final e.InterfaceC0151e interfaceC0151eRemove;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized (this.x) {
            interfaceC0151eRemove = this.x.remove(str);
        }
        return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, interfaceC0151eRemove, str) { // from class: c.f.a.c.d.i0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11632a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e.InterfaceC0151e f11633b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f11634c;

            {
                this.f11632a = this;
                this.f11633b = interfaceC0151eRemove;
                this.f11634c = str;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                this.f11632a.w(this.f11633b, this.f11634c, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
            }
        }).a());
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<e.a> p(final String str, final h hVar) {
        return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, str, hVar) { // from class: c.f.a.c.d.l0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f11690b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final h f11691c;

            {
                this.f11689a = this;
                this.f11690b = str;
                this.f11691c = hVar;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                this.f11689a.H(this.f11690b, this.f11691c, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
            }
        }).a());
    }

    @Override // c.f.a.c.d.y1
    public final void q(a2 a2Var) {
        c.f.a.c.f.q.o.i(a2Var);
        this.z.add(a2Var);
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> r(final double d2) {
        if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
            return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, d2) { // from class: c.f.a.c.d.h0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d0 f11625a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final double f11626b;

                {
                    this.f11625a = this;
                    this.f11626b = d2;
                }

                @Override // c.f.a.c.f.o.n.p
                public final void accept(Object obj, Object obj2) {
                    this.f11625a.h(this.f11626b, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
                }
            }).a());
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Volume cannot be ");
        sb.append(d2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> s(final boolean z) {
        return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, z) { // from class: c.f.a.c.d.g0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f11620b;

            {
                this.f11619a = this;
                this.f11620b = z;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                this.f11619a.K(this.f11620b, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
            }
        }).a());
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Status> t(final String str) {
        return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, str) { // from class: c.f.a.c.d.n0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f11713b;

            {
                this.f11712a = this;
                this.f11713b = str;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                this.f11712a.I(this.f11713b, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
            }
        }).a());
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<e.a> u(final String str, final String str2) {
        final y0 y0Var = null;
        return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, str, str2, y0Var) { // from class: c.f.a.c.d.o0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f11727b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f11728c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final y0 f11729d = null;

            {
                this.f11726a = this;
                this.f11727b = str;
                this.f11728c = str2;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                this.f11726a.J(this.f11727b, this.f11728c, null, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
            }
        }).a());
    }

    @Override // c.f.a.c.d.y1
    public final c.f.a.c.o.i<Void> v(final String str, final e.InterfaceC0151e interfaceC0151e) {
        c.f.a.c.d.v.a.d(str);
        if (interfaceC0151e != null) {
            synchronized (this.x) {
                this.x.put(str, interfaceC0151e);
            }
        }
        return doWrite(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, str, interfaceC0151e) { // from class: c.f.a.c.d.j0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f11649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f11650b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e.InterfaceC0151e f11651c;

            {
                this.f11649a = this;
                this.f11650b = str;
                this.f11651c = interfaceC0151e;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                this.f11649a.G(this.f11650b, this.f11651c, (c.f.a.c.d.v.n0) obj, (c.f.a.c.o.j) obj2);
            }
        }).a());
    }

    public final /* synthetic */ void w(e.InterfaceC0151e interfaceC0151e, String str, c.f.a.c.d.v.n0 n0Var, c.f.a.c.o.j jVar) {
        a0();
        if (interfaceC0151e != null) {
            ((c.f.a.c.d.v.h) n0Var.getService()).p0(str);
        }
        jVar.c(null);
    }

    public final void x(c.f.a.c.d.v.d dVar) {
        boolean z;
        String strI = dVar.I();
        if (c.f.a.c.d.v.a.f(strI, this.f11602o)) {
            z = false;
        } else {
            this.f11602o = strI;
            z = true;
        }
        f11588a.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f11595h));
        e.d dVar2 = this.y;
        if (dVar2 != null && (z || this.f11595h)) {
            dVar2.d();
        }
        this.f11595h = false;
    }

    public final void y(c.f.a.c.d.v.p0 p0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        d dVarT = p0Var.t();
        if (!c.f.a.c.d.v.a.f(dVarT, this.f11601n)) {
            this.f11601n = dVarT;
            this.y.c(dVarT);
        }
        double dK = p0Var.K();
        if (Double.isNaN(dK) || Math.abs(dK - this.p) <= 1.0E-7d) {
            z = false;
        } else {
            this.p = dK;
            z = true;
        }
        boolean zL = p0Var.L();
        if (zL != this.q) {
            this.q = zL;
            z = true;
        }
        c.f.a.c.d.v.b bVar = f11588a;
        bVar.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f11594g));
        e.d dVar = this.y;
        if (dVar != null && (z || this.f11594g)) {
            dVar.f();
        }
        double dN = p0Var.N();
        if (!Double.isNaN(dN)) {
            this.u = dN;
        }
        int I = p0Var.I();
        if (I != this.r) {
            this.r = I;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.f11594g));
        e.d dVar2 = this.y;
        if (dVar2 != null && (z2 || this.f11594g)) {
            dVar2.a(this.r);
        }
        int iJ = p0Var.J();
        if (iJ != this.s) {
            this.s = iJ;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f11594g));
        e.d dVar3 = this.y;
        if (dVar3 != null && (z3 || this.f11594g)) {
            dVar3.e(this.s);
        }
        if (!c.f.a.c.d.v.a.f(this.t, p0Var.M())) {
            this.t = p0Var.M();
        }
        this.f11594g = false;
    }
}
