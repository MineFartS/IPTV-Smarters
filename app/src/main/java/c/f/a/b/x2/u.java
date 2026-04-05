package c.f.a.b.x2;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.w0;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import c.f.a.b.x2.i0;
import c.f.a.b.x2.t;
import c.f.a.b.x2.w;
import c.f.a.b.x2.y;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class u implements c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f10409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.c f10410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f10411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, String> f10412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f10414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f10416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f10417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f10418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<t> f10420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<f> f10421o;
    public final Set<t> p;
    public int q;
    public i0 r;
    public t s;
    public t t;
    public Looper u;
    public Handler v;
    public int w;
    public byte[] x;
    public volatile d y;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10425d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f10427f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f10422a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f10423b = w0.f10307d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0.c f10424c = k0.f10357a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c.f.a.b.i3.f0 f10428g = new c.f.a.b.i3.y();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f10426e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f10429h = 300000;

        public u a(n0 n0Var) {
            return new u(this.f10423b, this.f10424c, n0Var, this.f10422a, this.f10425d, this.f10426e, this.f10427f, this.f10428g, this.f10429h);
        }

        public b b(Map<String, String> map) {
            this.f10422a.clear();
            if (map != null) {
                this.f10422a.putAll(map);
            }
            return this;
        }

        public b c(boolean z) {
            this.f10425d = z;
            return this;
        }

        public b d(boolean z) {
            this.f10427f = z;
            return this;
        }

        public b e(int... iArr) {
            for (int i2 : iArr) {
                boolean z = true;
                if (i2 != 2 && i2 != 1) {
                    z = false;
                }
                c.f.a.b.j3.g.a(z);
            }
            this.f10426e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, i0.c cVar) {
            this.f10423b = (UUID) c.f.a.b.j3.g.e(uuid);
            this.f10424c = (i0.c) c.f.a.b.j3.g.e(cVar);
            return this;
        }
    }

    public class c implements i0.b {
        public c() {
        }

        @Override // c.f.a.b.x2.i0.b
        public void a(i0 i0Var, byte[] bArr, int i2, int i3, byte[] bArr2) {
            ((d) c.f.a.b.j3.g.e(u.this.y)).obtainMessage(i2, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (t tVar : u.this.f10420n) {
                if (tVar.n(bArr)) {
                    tVar.v(message.what);
                    return;
                }
            }
        }
    }

    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class f implements c0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0.a f10432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y f10433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10434d;

        public f(a0.a aVar) {
            this.f10432b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void c(k1 k1Var) {
            if (u.this.q == 0 || this.f10434d) {
                return;
            }
            u uVar = u.this;
            this.f10433c = uVar.r((Looper) c.f.a.b.j3.g.e(uVar.u), this.f10432b, k1Var, false);
            u.this.f10421o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void e() {
            if (this.f10434d) {
                return;
            }
            y yVar = this.f10433c;
            if (yVar != null) {
                yVar.b(this.f10432b);
            }
            u.this.f10421o.remove(this);
            this.f10434d = true;
        }

        public void a(final k1 k1Var) {
            ((Handler) c.f.a.b.j3.g.e(u.this.v)).post(new Runnable() { // from class: c.f.a.b.x2.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10333b.c(k1Var);
                }
            });
        }

        @Override // c.f.a.b.x2.c0.b
        public void release() {
            x0.K0((Handler) c.f.a.b.j3.g.e(u.this.v), new Runnable() { // from class: c.f.a.b.x2.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10332b.e();
                }
            });
        }
    }

    public class g implements t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<t> f10436a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t f10437b;

        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.f.a.b.x2.t.a
        public void a(Exception exc, boolean z) {
            this.f10437b = null;
            c.f.b.b.t tVarD = c.f.b.b.t.D(this.f10436a);
            this.f10436a.clear();
            c.f.b.b.w0 it = tVarD.iterator();
            while (it.hasNext()) {
                ((t) it.next()).x(exc, z);
            }
        }

        @Override // c.f.a.b.x2.t.a
        public void b(t tVar) {
            this.f10436a.add(tVar);
            if (this.f10437b != null) {
                return;
            }
            this.f10437b = tVar;
            tVar.B();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.f.a.b.x2.t.a
        public void c() {
            this.f10437b = null;
            c.f.b.b.t tVarD = c.f.b.b.t.D(this.f10436a);
            this.f10436a.clear();
            c.f.b.b.w0 it = tVarD.iterator();
            while (it.hasNext()) {
                ((t) it.next()).w();
            }
        }

        public void d(t tVar) {
            this.f10436a.remove(tVar);
            if (this.f10437b == tVar) {
                this.f10437b = null;
                if (this.f10436a.isEmpty()) {
                    return;
                }
                t next = this.f10436a.iterator().next();
                this.f10437b = next;
                next.B();
            }
        }
    }

    public class h implements t.b {
        public h() {
        }

        @Override // c.f.a.b.x2.t.b
        public void a(t tVar, int i2) {
            if (u.this.f10419m != -9223372036854775807L) {
                u.this.p.remove(tVar);
                ((Handler) c.f.a.b.j3.g.e(u.this.v)).removeCallbacksAndMessages(tVar);
            }
        }

        @Override // c.f.a.b.x2.t.b
        public void b(final t tVar, int i2) {
            if (i2 == 1 && u.this.q > 0 && u.this.f10419m != -9223372036854775807L) {
                u.this.p.add(tVar);
                ((Handler) c.f.a.b.j3.g.e(u.this.v)).postAtTime(new Runnable() { // from class: c.f.a.b.x2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.b(null);
                    }
                }, tVar, SystemClock.uptimeMillis() + u.this.f10419m);
            } else if (i2 == 0) {
                u.this.f10420n.remove(tVar);
                if (u.this.s == tVar) {
                    u.this.s = null;
                }
                if (u.this.t == tVar) {
                    u.this.t = null;
                }
                u.this.f10416j.d(tVar);
                if (u.this.f10419m != -9223372036854775807L) {
                    ((Handler) c.f.a.b.j3.g.e(u.this.v)).removeCallbacksAndMessages(tVar);
                    u.this.p.remove(tVar);
                }
            }
            u.this.A();
        }
    }

    public u(UUID uuid, i0.c cVar, n0 n0Var, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, c.f.a.b.i3.f0 f0Var, long j2) {
        c.f.a.b.j3.g.e(uuid);
        c.f.a.b.j3.g.b(!w0.f10305b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10409c = uuid;
        this.f10410d = cVar;
        this.f10411e = n0Var;
        this.f10412f = map;
        this.f10413g = z;
        this.f10414h = iArr;
        this.f10415i = z2;
        this.f10417k = f0Var;
        this.f10416j = new g();
        this.f10418l = new h();
        this.w = 0;
        this.f10420n = new ArrayList();
        this.f10421o = c.f.b.b.s0.f();
        this.p = c.f.b.b.s0.f();
        this.f10419m = j2;
    }

    public static boolean s(y yVar) {
        return yVar.getState() == 1 && (x0.f9296a < 19 || (((y.a) c.f.a.b.j3.g.e(yVar.getError())).getCause() instanceof ResourceBusyException));
    }

    public static List<w.b> w(w wVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(wVar.f10448e);
        for (int i2 = 0; i2 < wVar.f10448e; i2++) {
            w.b bVarF = wVar.f(i2);
            if ((bVarF.e(uuid) || (w0.f10306c.equals(uuid) && bVarF.e(w0.f10305b))) && (bVarF.f10453f != null || z)) {
                arrayList.add(bVarF);
            }
        }
        return arrayList;
    }

    public final void A() {
        if (this.r != null && this.q == 0 && this.f10420n.isEmpty() && this.f10421o.isEmpty()) {
            ((i0) c.f.a.b.j3.g.e(this.r)).release();
            this.r = null;
        }
    }

    public final void B() {
        Iterator it = c.f.b.b.x.B(this.f10421o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    public void C(int i2, byte[] bArr) {
        c.f.a.b.j3.g.g(this.f10420n.isEmpty());
        if (i2 == 1 || i2 == 3) {
            c.f.a.b.j3.g.e(bArr);
        }
        this.w = i2;
        this.x = bArr;
    }

    public final void D(y yVar, a0.a aVar) {
        yVar.b(aVar);
        if (this.f10419m != -9223372036854775807L) {
            yVar.b(null);
        }
    }

    @Override // c.f.a.b.x2.c0
    public c0.b a(Looper looper, a0.a aVar, k1 k1Var) {
        c.f.a.b.j3.g.g(this.q > 0);
        x(looper);
        f fVar = new f(aVar);
        fVar.a(k1Var);
        return fVar;
    }

    @Override // c.f.a.b.x2.c0
    public y b(Looper looper, a0.a aVar, k1 k1Var) {
        c.f.a.b.j3.g.g(this.q > 0);
        x(looper);
        return r(looper, aVar, k1Var, true);
    }

    @Override // c.f.a.b.x2.c0
    public Class<? extends ExoMediaCrypto> c(k1 k1Var) {
        Class<? extends ExoMediaCrypto> clsA = ((i0) c.f.a.b.j3.g.e(this.r)).a();
        w wVar = k1Var.p;
        if (wVar != null) {
            return t(wVar) ? clsA : r0.class;
        }
        if (x0.x0(this.f10414h, c.f.a.b.j3.d0.l(k1Var.f9338m)) != -1) {
            return clsA;
        }
        return null;
    }

    @Override // c.f.a.b.x2.c0
    public final void prepare() {
        int i2 = this.q;
        this.q = i2 + 1;
        if (i2 != 0) {
            return;
        }
        if (this.r == null) {
            i0 i0VarA = this.f10410d.a(this.f10409c);
            this.r = i0VarA;
            i0VarA.h(new c());
        } else if (this.f10419m != -9223372036854775807L) {
            for (int i3 = 0; i3 < this.f10420n.size(); i3++) {
                this.f10420n.get(i3).a(null);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final y r(Looper looper, a0.a aVar, k1 k1Var, boolean z) {
        List<w.b> listW;
        z(looper);
        w wVar = k1Var.p;
        if (wVar == null) {
            return y(c.f.a.b.j3.d0.l(k1Var.f9338m), z);
        }
        t tVarV = null;
        byte b2 = 0;
        if (this.x == null) {
            listW = w((w) c.f.a.b.j3.g.e(wVar), this.f10409c, false);
            if (listW.isEmpty()) {
                e eVar = new e(this.f10409c);
                c.f.a.b.j3.z.e("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.f(eVar);
                }
                return new h0(new y.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listW = null;
        }
        if (this.f10413g) {
            Iterator<t> it = this.f10420n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t next = it.next();
                if (x0.b(next.f10386a, listW)) {
                    tVarV = next;
                    break;
                }
            }
        } else {
            tVarV = this.t;
        }
        if (tVarV == null) {
            tVarV = v(listW, false, aVar, z);
            if (!this.f10413g) {
                this.t = tVarV;
            }
            this.f10420n.add(tVarV);
        } else {
            tVarV.a(aVar);
        }
        return tVarV;
    }

    @Override // c.f.a.b.x2.c0
    public final void release() {
        int i2 = this.q - 1;
        this.q = i2;
        if (i2 != 0) {
            return;
        }
        if (this.f10419m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f10420n);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((t) arrayList.get(i3)).b(null);
            }
        }
        B();
        A();
    }

    public final boolean t(w wVar) {
        if (this.x != null) {
            return true;
        }
        if (w(wVar, this.f10409c, true).isEmpty()) {
            if (wVar.f10448e != 1 || !wVar.f(0).e(w0.f10305b)) {
                return false;
            }
            c.f.a.b.j3.z.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f10409c);
        }
        String str = wVar.f10447d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? x0.f9296a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final t u(List<w.b> list, boolean z, a0.a aVar) {
        c.f.a.b.j3.g.e(this.r);
        t tVar = new t(this.f10409c, this.r, this.f10416j, this.f10418l, list, this.w, this.f10415i | z, z, this.x, this.f10412f, this.f10411e, (Looper) c.f.a.b.j3.g.e(this.u), this.f10417k);
        tVar.a(aVar);
        if (this.f10419m != -9223372036854775807L) {
            tVar.a(null);
        }
        return tVar;
    }

    public final t v(List<w.b> list, boolean z, a0.a aVar, boolean z2) {
        t tVarU = u(list, z, aVar);
        if (s(tVarU) && !this.p.isEmpty()) {
            Iterator it = c.f.b.b.x.B(this.p).iterator();
            while (it.hasNext()) {
                ((y) it.next()).b(null);
            }
            D(tVarU, aVar);
            tVarU = u(list, z, aVar);
        }
        if (!s(tVarU) || !z2 || this.f10421o.isEmpty()) {
            return tVarU;
        }
        B();
        D(tVarU, aVar);
        return u(list, z, aVar);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void x(Looper looper) {
        Looper looper2 = this.u;
        if (looper2 == null) {
            this.u = looper;
            this.v = new Handler(looper);
        } else {
            c.f.a.b.j3.g.g(looper2 == looper);
            c.f.a.b.j3.g.e(this.v);
        }
    }

    public final y y(int i2, boolean z) {
        i0 i0Var = (i0) c.f.a.b.j3.g.e(this.r);
        if ((j0.class.equals(i0Var.a()) && j0.f10350a) || x0.x0(this.f10414h, i2) == -1 || r0.class.equals(i0Var.a())) {
            return null;
        }
        t tVar = this.s;
        if (tVar == null) {
            t tVarV = v(c.f.b.b.t.J(), true, null, z);
            this.f10420n.add(tVarV);
            this.s = tVarV;
        } else {
            tVar.a(null);
        }
        return this.s;
    }

    public final void z(Looper looper) {
        if (this.y == null) {
            this.y = new d(looper);
        }
    }
}
