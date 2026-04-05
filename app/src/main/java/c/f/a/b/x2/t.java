package c.f.a.b.x2;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import c.f.a.b.i3.f0;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.i0;
import c.f.a.b.x2.w;
import c.f.a.b.x2.y;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class t implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<w.b> f10386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f10387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f10388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f10389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f10393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.b.j3.n<a0.a> f10394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f10395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0 f10396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f10397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f10398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10400o;
    public HandlerThread p;
    public c q;
    public ExoMediaCrypto r;
    public y.a s;
    public byte[] t;
    public byte[] u;
    public i0.a v;
    public i0.d w;

    public interface a {
        void a(Exception exc, boolean z);

        void b(t tVar);

        void c();
    }

    public interface b {
        void a(t tVar, int i2);

        void b(t tVar, int i2);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10401a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, o0 o0Var) {
            d dVar = (d) message.obj;
            if (!dVar.f10404b) {
                return false;
            }
            int i2 = dVar.f10407e + 1;
            dVar.f10407e = i2;
            if (i2 > t.this.f10395j.d(3)) {
                return false;
            }
            long jA = t.this.f10395j.a(new f0.c(new c.f.a.b.e3.a0(dVar.f10403a, o0Var.f10372b, o0Var.f10373c, o0Var.f10374d, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f10405c, o0Var.f10375e), new c.f.a.b.e3.d0(3), o0Var.getCause() instanceof IOException ? (IOException) o0Var.getCause() : new f(o0Var.getCause()), dVar.f10407e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f10401a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jA);
                return true;
            }
        }

        public void b(int i2, Object obj, boolean z) {
            obtainMessage(i2, new d(c.f.a.b.e3.a0.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f10401a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i2 = message.what;
                if (i2 == 0) {
                    t tVar = t.this;
                    objB = tVar.f10396k.b(tVar.f10397l, (i0.d) dVar.f10406d);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException();
                    }
                    t tVar2 = t.this;
                    objB = tVar2.f10396k.a(tVar2.f10397l, (i0.a) dVar.f10406d);
                }
            } catch (o0 e2) {
                boolean zA = a(message, e2);
                objB = e2;
                if (zA) {
                    return;
                }
            } catch (Exception e3) {
                c.f.a.b.j3.z.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e3);
                objB = e3;
            }
            t.this.f10395j.c(dVar.f10403a);
            synchronized (this) {
                if (!this.f10401a) {
                    t.this.f10398m.obtainMessage(message.what, Pair.create(dVar.f10406d, objB)).sendToTarget();
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f10406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10407e;

        public d(long j2, boolean z, long j3, Object obj) {
            this.f10403a = j2;
            this.f10404b = z;
            this.f10405c = j3;
            this.f10406d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                t.this.y(obj, obj2);
            } else {
                if (i2 != 1) {
                    return;
                }
                t.this.s(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public t(UUID uuid, i0 i0Var, a aVar, b bVar, List<w.b> list, int i2, boolean z, boolean z2, byte[] bArr, HashMap<String, String> map, n0 n0Var, Looper looper, c.f.a.b.i3.f0 f0Var) {
        List<w.b> listUnmodifiableList;
        if (i2 == 1 || i2 == 3) {
            c.f.a.b.j3.g.e(bArr);
        }
        this.f10397l = uuid;
        this.f10388c = aVar;
        this.f10389d = bVar;
        this.f10387b = i0Var;
        this.f10390e = i2;
        this.f10391f = z;
        this.f10392g = z2;
        if (bArr != null) {
            this.u = bArr;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList((List) c.f.a.b.j3.g.e(list));
        }
        this.f10386a = listUnmodifiableList;
        this.f10393h = map;
        this.f10396k = n0Var;
        this.f10394i = new c.f.a.b.j3.n<>();
        this.f10395j = f0Var;
        this.f10399n = 2;
        this.f10398m = new e(looper);
    }

    public final void A(byte[] bArr, int i2, boolean z) {
        try {
            this.v = this.f10387b.k(bArr, this.f10386a, i2, this.f10393h);
            ((c) x0.i(this.q)).b(1, c.f.a.b.j3.g.e(this.v), z);
        } catch (Exception e2) {
            t(e2, true);
        }
    }

    public void B() {
        this.w = this.f10387b.d();
        ((c) x0.i(this.q)).b(0, c.f.a.b.j3.g.e(this.w), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean C() {
        try {
            this.f10387b.f(this.t, this.u);
            return true;
        } catch (Exception e2) {
            r(e2, 1);
            return false;
        }
    }

    @Override // c.f.a.b.x2.y
    public void a(a0.a aVar) {
        c.f.a.b.j3.g.g(this.f10400o >= 0);
        if (aVar != null) {
            this.f10394i.a(aVar);
        }
        int i2 = this.f10400o + 1;
        this.f10400o = i2;
        if (i2 == 1) {
            c.f.a.b.j3.g.g(this.f10399n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (z()) {
                l(true);
            }
        } else if (aVar != null && o() && this.f10394i.b(aVar) == 1) {
            aVar.e(this.f10399n);
        }
        this.f10389d.a(this, this.f10400o);
    }

    @Override // c.f.a.b.x2.y
    public void b(a0.a aVar) {
        c.f.a.b.j3.g.g(this.f10400o > 0);
        int i2 = this.f10400o - 1;
        this.f10400o = i2;
        if (i2 == 0) {
            this.f10399n = 0;
            ((e) x0.i(this.f10398m)).removeCallbacksAndMessages(null);
            ((c) x0.i(this.q)).c();
            this.q = null;
            ((HandlerThread) x0.i(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.f10387b.g(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.f10394i.d(aVar);
            if (this.f10394i.b(aVar) == 0) {
                aVar.g();
            }
        }
        this.f10389d.b(this, this.f10400o);
    }

    @Override // c.f.a.b.x2.y
    public final UUID c() {
        return this.f10397l;
    }

    @Override // c.f.a.b.x2.y
    public boolean d() {
        return this.f10391f;
    }

    @Override // c.f.a.b.x2.y
    public Map<String, String> e() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.f10387b.b(bArr);
    }

    @Override // c.f.a.b.x2.y
    public final ExoMediaCrypto f() {
        return this.r;
    }

    @Override // c.f.a.b.x2.y
    public byte[] g() {
        return this.u;
    }

    @Override // c.f.a.b.x2.y
    public final y.a getError() {
        if (this.f10399n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // c.f.a.b.x2.y
    public final int getState() {
        return this.f10399n;
    }

    public final void k(c.f.a.b.j3.m<a0.a> mVar) {
        Iterator<a0.a> it = this.f10394i.q().iterator();
        while (it.hasNext()) {
            mVar.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    public final void l(boolean z) {
        if (this.f10392g) {
            return;
        }
        byte[] bArr = (byte[]) x0.i(this.t);
        int i2 = this.f10390e;
        if (i2 == 0 || i2 == 1) {
            if (this.u == null) {
                A(bArr, 1, z);
                return;
            }
            if (this.f10399n != 4 && !C()) {
                return;
            }
            long jM = m();
            if (this.f10390e != 0 || jM > 60) {
                if (jM <= 0) {
                    r(new m0(), 2);
                    return;
                } else {
                    this.f10399n = 4;
                    k(new c.f.a.b.j3.m() { // from class: c.f.a.b.x2.q
                        @Override // c.f.a.b.j3.m
                        public final void accept(Object obj) {
                            ((a0.a) obj).d();
                        }
                    });
                    return;
                }
            }
            c.f.a.b.j3.z.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jM);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                c.f.a.b.j3.g.e(this.u);
                c.f.a.b.j3.g.e(this.t);
                A(this.u, 3, z);
                return;
            }
            if (this.u != null && !C()) {
                return;
            }
        }
        A(bArr, 2, z);
    }

    public final long m() {
        if (!w0.f10307d.equals(this.f10397l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) c.f.a.b.j3.g.e(s0.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean n(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean o() {
        int i2 = this.f10399n;
        return i2 == 3 || i2 == 4;
    }

    public final void r(final Exception exc, int i2) {
        this.s = new y.a(exc, f0.a(exc, i2));
        c.f.a.b.j3.z.e("DefaultDrmSession", "DRM session error", exc);
        k(new c.f.a.b.j3.m() { // from class: c.f.a.b.x2.b
            @Override // c.f.a.b.j3.m
            public final void accept(Object obj) {
                ((a0.a) obj).f(exc);
            }
        });
        if (this.f10399n != 4) {
            this.f10399n = 1;
        }
    }

    public final void s(Object obj, Object obj2) {
        c.f.a.b.j3.m<a0.a> mVar;
        if (obj == this.v && o()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                t((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f10390e == 3) {
                    this.f10387b.i((byte[]) x0.i(this.u), bArr);
                    mVar = new c.f.a.b.j3.m() { // from class: c.f.a.b.x2.a
                        @Override // c.f.a.b.j3.m
                        public final void accept(Object obj3) {
                            ((a0.a) obj3).c();
                        }
                    };
                } else {
                    byte[] bArrI = this.f10387b.i(this.t, bArr);
                    int i2 = this.f10390e;
                    if ((i2 == 2 || (i2 == 0 && this.u != null)) && bArrI != null && bArrI.length != 0) {
                        this.u = bArrI;
                    }
                    this.f10399n = 4;
                    mVar = new c.f.a.b.j3.m() { // from class: c.f.a.b.x2.p
                        @Override // c.f.a.b.j3.m
                        public final void accept(Object obj3) {
                            ((a0.a) obj3).b();
                        }
                    };
                }
                k(mVar);
            } catch (Exception e2) {
                t(e2, true);
            }
        }
    }

    public final void t(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f10388c.b(this);
        } else {
            r(exc, z ? 1 : 2);
        }
    }

    public final void u() {
        if (this.f10390e == 0 && this.f10399n == 4) {
            x0.i(this.t);
            l(false);
        }
    }

    public void v(int i2) {
        if (i2 != 2) {
            return;
        }
        u();
    }

    public void w() {
        if (z()) {
            l(true);
        }
    }

    public void x(Exception exc, boolean z) {
        r(exc, z ? 1 : 3);
    }

    public final void y(Object obj, Object obj2) {
        if (obj == this.w) {
            if (this.f10399n == 2 || o()) {
                this.w = null;
                if (obj2 instanceof Exception) {
                    this.f10388c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f10387b.j((byte[]) obj2);
                    this.f10388c.c();
                } catch (Exception e2) {
                    this.f10388c.a(e2, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean z() {
        if (o()) {
            return true;
        }
        try {
            byte[] bArrE = this.f10387b.e();
            this.t = bArrE;
            this.r = this.f10387b.c(bArrE);
            final int i2 = 3;
            this.f10399n = 3;
            k(new c.f.a.b.j3.m() { // from class: c.f.a.b.x2.c
                @Override // c.f.a.b.j3.m
                public final void accept(Object obj) {
                    ((a0.a) obj).e(i2);
                }
            });
            c.f.a.b.j3.g.e(this.t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f10388c.b(this);
            return false;
        } catch (Exception e2) {
            r(e2, 1);
            return false;
        }
    }
}
