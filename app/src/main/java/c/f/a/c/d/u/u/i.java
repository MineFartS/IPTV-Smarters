package c.f.a.c.d.u.u;

import android.os.Handler;
import android.os.Looper;
import c.f.a.c.d.e;
import c.f.a.c.d.j;
import c.f.a.c.d.k;
import c.f.a.c.d.p;
import c.f.a.c.j.c.ee;
import com.facebook.ads.AdError;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i implements e.InterfaceC0151e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12002a = c.f.a.c.d.v.o.f12184e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.d.v.o f12005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f12006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.c.d.u.u.d f12007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ee f12008g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f12013l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f12009h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f12010i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<e, j> f12011j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<Long, j> f12012k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12003b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f12004c = new c.f.a.c.j.c.w0(Looper.getMainLooper());

    public static abstract class a {
        public void a() {
        }

        public void b(MediaError mediaError) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public void g() {
        }

        public void h(int[] iArr) {
        }

        public void i(int[] iArr, int i2) {
        }

        public void j(c.f.a.c.d.o[] oVarArr) {
        }

        public void k(int[] iArr) {
        }

        public void l(int[] iArr) {
        }
    }

    @Deprecated
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public interface c extends c.f.a.c.f.o.j {
    }

    public interface d {
        List<c.f.a.c.d.b> a(c.f.a.c.d.q qVar);

        boolean b(c.f.a.c.d.q qVar);
    }

    public interface e {
        void a(long j2, long j3);
    }

    public class f implements c.f.a.c.d.v.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ee f12014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f12015b = 0;

        public f() {
        }

        @Override // c.f.a.c.d.v.r
        public final long a() {
            long j2 = this.f12015b + 1;
            this.f12015b = j2;
            return j2;
        }

        @Override // c.f.a.c.d.v.r
        public final void b(String str, String str2, long j2, String str3) {
            ee eeVar = this.f12014a;
            if (eeVar == null) {
                throw new IllegalStateException("No GoogleApiClient available");
            }
            eeVar.c(str, str2).d(new b0(this, j2));
        }

        public final void c(ee eeVar) {
            this.f12014a = eeVar;
        }
    }

    public static class g extends BasePendingResult<c> {
        public g() {
            super(null);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final c e(Status status) {
            return new c0(this, status);
        }
    }

    public abstract class h extends BasePendingResult<c> {
        public c.f.a.c.d.v.u r;
        public final boolean s;

        public h(i iVar) {
            this(false);
        }

        public h(boolean z) {
            super(null);
            this.s = z;
            this.r = new e0(this, i.this);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ c.f.a.c.f.o.j e(Status status) {
            return new d0(this, status);
        }

        public abstract void o();

        public final void p() {
            if (!this.s) {
                Iterator it = i.this.f12009h.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).f();
                }
                Iterator<a> it2 = i.this.f12010i.iterator();
                while (it2.hasNext()) {
                    it2.next().f();
                }
            }
            try {
                synchronized (i.this.f12003b) {
                    o();
                }
            } catch (c.f.a.c.d.v.p unused) {
                i((c) e(new Status(AdError.BROKEN_MEDIA_ERROR_CODE)));
            }
        }
    }

    /* JADX INFO: renamed from: c.f.a.c.d.u.u.i$i, reason: collision with other inner class name */
    public static final class C0154i implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Status f12017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JSONObject f12018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaError f12019d;

        public C0154i(Status status, JSONObject jSONObject, MediaError mediaError) {
            this.f12017b = status;
            this.f12018c = jSONObject;
            this.f12019d = mediaError;
        }

        @Override // c.f.a.c.f.o.j
        public final Status C() {
            return this.f12017b;
        }
    }

    public class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<e> f12020a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f12021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f12022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12023d;

        public j(long j2) {
            this.f12021b = j2;
            this.f12022c = new g0(this, i.this);
        }

        public final boolean a() {
            return !this.f12020a.isEmpty();
        }

        public final boolean b() {
            return this.f12023d;
        }

        public final void c() {
            i.this.f12004c.removeCallbacks(this.f12022c);
            this.f12023d = true;
            i.this.f12004c.postDelayed(this.f12022c, this.f12021b);
        }

        public final void d() {
            i.this.f12004c.removeCallbacks(this.f12022c);
            this.f12023d = false;
        }

        public final void f(e eVar) {
            this.f12020a.add(eVar);
        }

        public final void h(e eVar) {
            this.f12020a.remove(eVar);
        }

        public final long i() {
            return this.f12021b;
        }
    }

    public i(c.f.a.c.d.v.o oVar) {
        f fVar = new f();
        this.f12006e = fVar;
        c.f.a.c.d.v.o oVar2 = (c.f.a.c.d.v.o) c.f.a.c.f.q.o.i(oVar);
        this.f12005d = oVar2;
        oVar2.H(new a1(this));
        oVar2.c(fVar);
        this.f12007f = new c.f.a.c.d.u.u.d(this);
    }

    public static h Z(h hVar) {
        try {
            hVar.p();
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable unused) {
            hVar.i((c) hVar.e(new Status(AdError.BROKEN_MEDIA_ERROR_CODE)));
        }
        return hVar;
    }

    public static c.f.a.c.f.o.g<c> a0(int i2, String str) {
        g gVar = new g();
        gVar.i(gVar.e(new Status(i2, str)));
        return gVar;
    }

    public c.f.a.c.f.o.g<c> A() {
        return B(null);
    }

    public c.f.a.c.f.o.g<c> B(JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new y(this, jSONObject));
    }

    public c.f.a.c.f.o.g<c> C() {
        return D(null);
    }

    public c.f.a.c.f.o.g<c> D(JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new z(this, jSONObject));
    }

    public c.f.a.c.f.o.g<c> E(int i2, long j2, JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new u(this, i2, j2, jSONObject));
    }

    public c.f.a.c.f.o.g<c> F(int i2, JSONObject jSONObject) {
        return E(i2, -1L, jSONObject);
    }

    public c.f.a.c.f.o.g<c> G(c.f.a.c.d.o[] oVarArr, int i2, int i3, long j2, JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new o(this, oVarArr, i2, i3, j2, jSONObject));
    }

    public c.f.a.c.f.o.g<c> H(c.f.a.c.d.o[] oVarArr, int i2, int i3, JSONObject jSONObject) {
        return G(oVarArr, i2, i3, -1L, jSONObject);
    }

    public c.f.a.c.f.o.g<c> I(int i2, int i3, JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new t(this, i2, i3, jSONObject));
    }

    public c.f.a.c.f.o.g<c> J(JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new q(this, jSONObject));
    }

    public c.f.a.c.f.o.g<c> K(JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new r(this, jSONObject));
    }

    public c.f.a.c.f.o.g<c> L(int i2, JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new s(this, i2, jSONObject));
    }

    public c.f.a.c.f.o.g<c> M(int[] iArr, JSONObject jSONObject) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new p(this, iArr, jSONObject));
    }

    public void N(a aVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (aVar != null) {
            this.f12010i.add(aVar);
        }
    }

    @Deprecated
    public void O(b bVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (bVar != null) {
            this.f12009h.remove(bVar);
        }
    }

    public void P(e eVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        j jVarRemove = this.f12011j.remove(eVar);
        if (jVarRemove != null) {
            jVarRemove.h(eVar);
            if (jVarRemove.a()) {
                return;
            }
            this.f12012k.remove(Long.valueOf(jVarRemove.i()));
            jVarRemove.d();
        }
    }

    public c.f.a.c.f.o.g<c> Q() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new b1(this));
    }

    @Deprecated
    public c.f.a.c.f.o.g<c> R(long j2) {
        return S(j2, 0, null);
    }

    @Deprecated
    public c.f.a.c.f.o.g<c> S(long j2, int i2, JSONObject jSONObject) {
        return T(new p.a().d(j2).e(i2).b(jSONObject).a());
    }

    public c.f.a.c.f.o.g<c> T(c.f.a.c.d.p pVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new a0(this, pVar));
    }

    public c.f.a.c.f.o.g<c> U(long[] jArr) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new d1(this, jArr));
    }

    public c.f.a.c.f.o.g<c> V() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new c1(this));
    }

    public void W() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        int iN = n();
        if (iN == 4 || iN == 2) {
            A();
        } else {
            C();
        }
    }

    public void X(a aVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (aVar != null) {
            this.f12010i.remove(aVar);
        }
    }

    @Override // c.f.a.c.d.e.InterfaceC0151e
    public void a(CastDevice castDevice, String str, String str2) {
        this.f12005d.h(str2);
    }

    @Deprecated
    public void b(b bVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (bVar != null) {
            this.f12009h.add(bVar);
        }
    }

    public boolean c(e eVar, long j2) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (eVar == null || this.f12011j.containsKey(eVar)) {
            return false;
        }
        j jVar = this.f12012k.get(Long.valueOf(j2));
        if (jVar == null) {
            jVar = new j(j2);
            this.f12012k.put(Long.valueOf(j2), jVar);
        }
        jVar.f(eVar);
        this.f12011j.put(eVar, jVar);
        if (!p()) {
            return true;
        }
        jVar.c();
        return true;
    }

    public long d() {
        long jK;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            jK = this.f12005d.k();
        }
        return jK;
    }

    public final void d0(ee eeVar) {
        ee eeVar2 = this.f12008g;
        if (eeVar2 == eeVar) {
            return;
        }
        if (eeVar2 != null) {
            this.f12005d.f();
            this.f12007f.a();
            try {
                this.f12008g.g(m());
            } catch (IOException unused) {
            }
            this.f12006e.c(null);
            this.f12004c.removeCallbacksAndMessages(null);
        }
        this.f12008g = eeVar;
        if (eeVar != null) {
            this.f12006e.c(eeVar);
        }
    }

    public long e() {
        long jL;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            jL = this.f12005d.l();
        }
        return jL;
    }

    public long f() {
        long jM;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            jM = this.f12005d.m();
        }
        return jM;
    }

    public long g() {
        long jN;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            jN = this.f12005d.n();
        }
        return jN;
    }

    public final void g0(Set<e> set) {
        HashSet hashSet = new HashSet(set);
        if (u() || t() || q() || k0()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(g(), o());
            }
        } else {
            if (!s()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).a(0L, 0L);
                }
                return;
            }
            c.f.a.c.d.o oVarI = i();
            if (oVarI == null || oVarI.M() == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).a(0L, oVarI.M().R());
            }
        }
    }

    public int h() {
        int iM;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            c.f.a.c.d.q qVarL = l();
            iM = qVarL != null ? qVarL.M() : 0;
        }
        return iM;
    }

    public c.f.a.c.d.o i() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        if (qVarL == null) {
            return null;
        }
        return qVarL.Y(qVarL.R());
    }

    public final void i0() {
        ee eeVar = this.f12008g;
        if (eeVar == null) {
            return;
        }
        try {
            eeVar.d(m(), this);
        } catch (IOException unused) {
        }
        Q();
    }

    public MediaInfo j() {
        MediaInfo mediaInfoO;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            mediaInfoO = this.f12005d.o();
        }
        return mediaInfoO;
    }

    public final c.f.a.c.f.o.g<c> j0() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new w(this, true));
    }

    public c.f.a.c.d.u.u.d k() {
        c.f.a.c.d.u.u.d dVar;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            dVar = this.f12007f;
        }
        return dVar;
    }

    public final boolean k0() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        return qVarL != null && qVarL.U() == 5;
    }

    public c.f.a.c.d.q l() {
        c.f.a.c.d.q qVarP;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            qVarP = this.f12005d.p();
        }
        return qVarP;
    }

    public final boolean l0() {
        return this.f12008g != null;
    }

    public String m() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f12005d.a();
    }

    public int n() {
        int iU;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            c.f.a.c.d.q qVarL = l();
            iU = qVarL != null ? qVarL.U() : 1;
        }
        return iU;
    }

    public final void n0() {
        for (j jVar : this.f12012k.values()) {
            if (p() && !jVar.b()) {
                jVar.c();
            } else if (!p() && jVar.b()) {
                jVar.d();
            }
            if (jVar.b() && (q() || k0() || t() || s())) {
                g0(jVar.f12020a);
            }
        }
    }

    public long o() {
        long jQ;
        synchronized (this.f12003b) {
            c.f.a.c.f.q.o.d("Must be called from the main thread.");
            jQ = this.f12005d.q();
        }
        return jQ;
    }

    public boolean p() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return q() || k0() || u() || t() || s();
    }

    public boolean q() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        return qVarL != null && qVarL.U() == 4;
    }

    public final c.f.a.c.f.o.g<c> q0(int[] iArr) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new v(this, true, iArr));
    }

    public boolean r() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        MediaInfo mediaInfoJ = j();
        return mediaInfoJ != null && mediaInfoJ.S() == 2;
    }

    public final int r0(int i2) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        int iB = k().b(i2);
        if (iB != -1) {
            return iB;
        }
        c.f.a.c.d.q qVarL = l();
        for (int i3 = 0; i3 < qVarL.Z(); i3++) {
            if (qVarL.X(i3).L() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public boolean s() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        return (qVarL == null || qVarL.R() == 0) ? false : true;
    }

    public final int s0(int i2) {
        c.f.a.c.d.o oVarX;
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        int iC = k().c(i2);
        if (iC != 0) {
            return iC;
        }
        if (l() == null || (oVarX = l().X(i2)) == null) {
            return 0;
        }
        return oVarX.L();
    }

    public boolean t() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        if (qVarL == null) {
            return false;
        }
        if (qVarL.U() != 3) {
            return r() && h() == 2;
        }
        return true;
    }

    public boolean u() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        return qVarL != null && qVarL.U() == 2;
    }

    public boolean v() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        c.f.a.c.d.q qVarL = l();
        return qVarL != null && qVarL.i0();
    }

    public final boolean w() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (!r()) {
            return true;
        }
        c.f.a.c.d.q qVarL = l();
        return (qVarL == null || !qVarL.g0(2L) || qVarL.Q() == null) ? false : true;
    }

    public c.f.a.c.f.o.g<c> x(MediaInfo mediaInfo, c.f.a.c.d.j jVar) {
        return z(new k.a().h(mediaInfo).c(Boolean.valueOf(jVar.b())).f(jVar.f()).i(jVar.g()).b(jVar.a()).g(jVar.e()).d(jVar.c()).e(jVar.d()).a());
    }

    @Deprecated
    public c.f.a.c.f.o.g<c> y(MediaInfo mediaInfo, boolean z, long j2) {
        return x(mediaInfo, new j.a().b(z).c(j2).a());
    }

    public c.f.a.c.f.o.g<c> z(k kVar) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return !l0() ? a0(17, null) : Z(new x(this, kVar));
    }
}
