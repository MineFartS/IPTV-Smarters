package k.g0.i;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import l.s;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f30797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<k.g0.i.c> f30798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<k.g0.i.c> f30799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f30801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f30802i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f30794a = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f30803j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f30804k = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k.g0.i.b f30805l = null;

    public final class a implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.c f30806b = new l.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30808d;

        public a() {
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i.this) {
                if (this.f30807c) {
                    return;
                }
                if (!i.this.f30802i.f30808d) {
                    if (this.f30806b.H0() > 0) {
                        while (this.f30806b.H0() > 0) {
                            d(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.f30797d.U(iVar.f30796c, true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f30807c = true;
                }
                i.this.f30797d.flush();
                i.this.b();
            }
        }

        public final void d(boolean z) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f30804k.k();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f30795b > 0 || this.f30808d || this.f30807c || iVar.f30805l != null) {
                            break;
                        } else {
                            iVar.r();
                        }
                    } finally {
                    }
                }
                iVar.f30804k.u();
                i.this.c();
                jMin = Math.min(i.this.f30795b, this.f30806b.H0());
                iVar2 = i.this;
                iVar2.f30795b -= jMin;
            }
            iVar2.f30804k.k();
            try {
                i iVar3 = i.this;
                iVar3.f30797d.U(iVar3.f30796c, z && jMin == this.f30806b.H0(), this.f30806b, jMin);
            } finally {
            }
        }

        @Override // l.s, java.io.Flushable
        public void flush() throws IOException {
            synchronized (i.this) {
                i.this.c();
            }
            while (this.f30806b.H0() > 0) {
                d(false);
                i.this.f30797d.flush();
            }
        }

        @Override // l.s
        public void h(l.c cVar, long j2) throws IOException {
            this.f30806b.h(cVar, j2);
            while (this.f30806b.H0() >= 16384) {
                d(false);
            }
        }

        @Override // l.s
        public u timeout() {
            return i.this.f30804k;
        }
    }

    public final class b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.c f30810b = new l.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.c f30811c = new l.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f30812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f30813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f30814f;

        public b(long j2) {
            this.f30812d = j2;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (i.this) {
                this.f30813e = true;
                this.f30811c.l();
                i.this.notifyAll();
            }
            i.this.b();
        }

        public final void d() throws IOException {
            if (this.f30813e) {
                throw new IOException("stream closed");
            }
            if (i.this.f30805l != null) {
                throw new o(i.this.f30805l);
            }
        }

        public void i(l.e eVar, long j2) throws EOFException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j2 > 0) {
                synchronized (i.this) {
                    z = this.f30814f;
                    z2 = true;
                    z3 = this.f30811c.H0() + j2 > this.f30812d;
                }
                if (z3) {
                    eVar.Z(j2);
                    i.this.f(k.g0.i.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.Z(j2);
                    return;
                }
                long jK = eVar.k(this.f30810b, j2);
                if (jK == -1) {
                    throw new EOFException();
                }
                j2 -= jK;
                synchronized (i.this) {
                    if (this.f30811c.H0() != 0) {
                        z2 = false;
                    }
                    this.f30811c.X(this.f30810b);
                    if (z2) {
                        i.this.notifyAll();
                    }
                }
            }
        }

        @Override // l.t
        public long k(l.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            synchronized (i.this) {
                l();
                d();
                if (this.f30811c.H0() == 0) {
                    return -1L;
                }
                l.c cVar2 = this.f30811c;
                long jK = cVar2.k(cVar, Math.min(j2, cVar2.H0()));
                i iVar = i.this;
                long j3 = iVar.f30794a + jK;
                iVar.f30794a = j3;
                if (j3 >= iVar.f30797d.p.d() / 2) {
                    i iVar2 = i.this;
                    iVar2.f30797d.A0(iVar2.f30796c, iVar2.f30794a);
                    i.this.f30794a = 0L;
                }
                synchronized (i.this.f30797d) {
                    g gVar = i.this.f30797d;
                    long j4 = gVar.f30740n + jK;
                    gVar.f30740n = j4;
                    if (j4 >= gVar.p.d() / 2) {
                        g gVar2 = i.this.f30797d;
                        gVar2.A0(0, gVar2.f30740n);
                        i.this.f30797d.f30740n = 0L;
                    }
                }
                return jK;
            }
        }

        public final void l() throws IOException {
            i.this.f30803j.k();
            while (this.f30811c.H0() == 0 && !this.f30814f && !this.f30813e) {
                try {
                    i iVar = i.this;
                    if (iVar.f30805l != null) {
                        break;
                    } else {
                        iVar.r();
                    }
                } finally {
                    i.this.f30803j.u();
                }
            }
        }

        @Override // l.t
        public u timeout() {
            return i.this.f30803j;
        }
    }

    public class c extends l.a {
        public c() {
        }

        @Override // l.a
        public IOException o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // l.a
        public void t() {
            i.this.f(k.g0.i.b.CANCEL);
        }

        public void u() throws IOException {
            if (n()) {
                throw o(null);
            }
        }
    }

    public i(int i2, g gVar, boolean z, boolean z2, List<k.g0.i.c> list) {
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f30796c = i2;
        this.f30797d = gVar;
        this.f30795b = gVar.q.d();
        b bVar = new b(gVar.p.d());
        this.f30801h = bVar;
        a aVar = new a();
        this.f30802i = aVar;
        bVar.f30814f = z2;
        aVar.f30808d = z;
        this.f30798e = list;
    }

    public void a(long j2) {
        this.f30795b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            k.g0.i.i$b r0 = r2.f30801h     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.f30814f     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L17
            boolean r0 = r0.f30813e     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
            k.g0.i.i$a r0 = r2.f30802i     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.f30808d     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L15
            boolean r0 = r0.f30807c     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            boolean r1 = r2.k()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L25
            k.g0.i.b r0 = k.g0.i.b.CANCEL
            r2.d(r0)
            goto L2e
        L25:
            if (r1 != 0) goto L2e
            k.g0.i.g r0 = r2.f30797d
            int r1 = r2.f30796c
            r0.w(r1)
        L2e:
            return
        L2f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g0.i.i.b():void");
    }

    public void c() throws IOException {
        a aVar = this.f30802i;
        if (aVar.f30807c) {
            throw new IOException("stream closed");
        }
        if (aVar.f30808d) {
            throw new IOException("stream finished");
        }
        if (this.f30805l != null) {
            throw new o(this.f30805l);
        }
    }

    public void d(k.g0.i.b bVar) {
        if (e(bVar)) {
            this.f30797d.s0(this.f30796c, bVar);
        }
    }

    public final boolean e(k.g0.i.b bVar) {
        synchronized (this) {
            if (this.f30805l != null) {
                return false;
            }
            if (this.f30801h.f30814f && this.f30802i.f30808d) {
                return false;
            }
            this.f30805l = bVar;
            notifyAll();
            this.f30797d.w(this.f30796c);
            return true;
        }
    }

    public void f(k.g0.i.b bVar) {
        if (e(bVar)) {
            this.f30797d.w0(this.f30796c, bVar);
        }
    }

    public int g() {
        return this.f30796c;
    }

    public s h() {
        synchronized (this) {
            if (!this.f30800g && !j()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f30802i;
    }

    public t i() {
        return this.f30801h;
    }

    public boolean j() {
        return this.f30797d.f30729c == ((this.f30796c & 1) == 1);
    }

    public synchronized boolean k() {
        if (this.f30805l != null) {
            return false;
        }
        b bVar = this.f30801h;
        if (bVar.f30814f || bVar.f30813e) {
            a aVar = this.f30802i;
            if (aVar.f30808d || aVar.f30807c) {
                if (this.f30800g) {
                    return false;
                }
            }
        }
        return true;
    }

    public u l() {
        return this.f30803j;
    }

    public void m(l.e eVar, int i2) throws EOFException {
        this.f30801h.i(eVar, i2);
    }

    public void n() {
        boolean zK;
        synchronized (this) {
            this.f30801h.f30814f = true;
            zK = k();
            notifyAll();
        }
        if (zK) {
            return;
        }
        this.f30797d.w(this.f30796c);
    }

    public void o(List<k.g0.i.c> list) {
        boolean zK;
        synchronized (this) {
            zK = true;
            this.f30800g = true;
            if (this.f30799f == null) {
                this.f30799f = list;
                zK = k();
                notifyAll();
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f30799f);
                arrayList.add(null);
                arrayList.addAll(list);
                this.f30799f = arrayList;
            }
        }
        if (zK) {
            return;
        }
        this.f30797d.w(this.f30796c);
    }

    public synchronized void p(k.g0.i.b bVar) {
        if (this.f30805l == null) {
            this.f30805l = bVar;
            notifyAll();
        }
    }

    public synchronized List<k.g0.i.c> q() {
        List<k.g0.i.c> list;
        if (!j()) {
            throw new IllegalStateException("servers cannot read response headers");
        }
        this.f30803j.k();
        while (this.f30799f == null && this.f30805l == null) {
            try {
                r();
            } catch (Throwable th) {
                this.f30803j.u();
                throw th;
            }
        }
        this.f30803j.u();
        list = this.f30799f;
        if (list == null) {
            throw new o(this.f30805l);
        }
        this.f30799f = null;
        return list;
    }

    public void r() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    public u s() {
        return this.f30804k;
    }
}
