package c.k.a.y.k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import l.s;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f18597d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<c.k.a.y.k.d> f18599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<c.k.a.y.k.d> f18600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f18601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f18602i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18594a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18598e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f18603j = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f18604k = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.k.a.y.k.a f18605l = null;

    public final class b implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18607c;

        public b() {
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (p.this) {
                if (this.f18606b) {
                    return;
                }
                p pVar = p.this;
                if (!pVar.f18602i.f18607c) {
                    pVar.f18597d.S0(p.this.f18596c, true, null, 0L);
                }
                synchronized (p.this) {
                    this.f18606b = true;
                }
                p.this.f18597d.flush();
                p.this.j();
            }
        }

        @Override // l.s, java.io.Flushable
        public void flush() {
            synchronized (p.this) {
                p.this.k();
            }
            p.this.f18597d.flush();
        }

        @Override // l.s
        public void h(l.c cVar, long j2) {
            long jMin;
            p pVar;
            while (j2 > 0) {
                synchronized (p.this) {
                    p.this.f18604k.k();
                    while (true) {
                        try {
                            p pVar2 = p.this;
                            if (pVar2.f18595b > 0 || this.f18607c || this.f18606b || pVar2.f18605l != null) {
                                break;
                            } else {
                                p.this.z();
                            }
                        } finally {
                        }
                    }
                    p.this.f18604k.u();
                    p.this.k();
                    jMin = Math.min(p.this.f18595b, j2);
                    pVar = p.this;
                    pVar.f18595b -= jMin;
                }
                j2 -= jMin;
                pVar.f18597d.S0(p.this.f18596c, false, cVar, jMin);
            }
        }

        @Override // l.s
        public u timeout() {
            return p.this.f18604k;
        }
    }

    public final class c implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l.c f18609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.c f18610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18613f;

        public c(long j2) {
            this.f18609b = new l.c();
            this.f18610c = new l.c();
            this.f18611d = j2;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (p.this) {
                this.f18612e = true;
                this.f18610c.l();
                p.this.notifyAll();
            }
            p.this.j();
        }

        @Override // l.t
        public long k(l.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            synchronized (p.this) {
                o();
                m();
                if (this.f18610c.H0() == 0) {
                    return -1L;
                }
                l.c cVar2 = this.f18610c;
                long jK = cVar2.k(cVar, Math.min(j2, cVar2.H0()));
                p pVar = p.this;
                long j3 = pVar.f18594a + jK;
                pVar.f18594a = j3;
                if (j3 >= pVar.f18597d.r.e(65536) / 2) {
                    p.this.f18597d.X0(p.this.f18596c, p.this.f18594a);
                    p.this.f18594a = 0L;
                }
                synchronized (p.this.f18597d) {
                    p.this.f18597d.p += jK;
                    if (p.this.f18597d.p >= p.this.f18597d.r.e(65536) / 2) {
                        p.this.f18597d.X0(0, p.this.f18597d.p);
                        p.this.f18597d.p = 0L;
                    }
                }
                return jK;
            }
        }

        public final void m() throws IOException {
            if (this.f18612e) {
                throw new IOException("stream closed");
            }
            if (p.this.f18605l == null) {
                return;
            }
            throw new IOException("stream was reset: " + p.this.f18605l);
        }

        public void n(l.e eVar, long j2) throws EOFException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j2 > 0) {
                synchronized (p.this) {
                    z = this.f18613f;
                    z2 = true;
                    z3 = this.f18610c.H0() + j2 > this.f18611d;
                }
                if (z3) {
                    eVar.Z(j2);
                    p.this.n(c.k.a.y.k.a.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    eVar.Z(j2);
                    return;
                }
                long jK = eVar.k(this.f18609b, j2);
                if (jK == -1) {
                    throw new EOFException();
                }
                j2 -= jK;
                synchronized (p.this) {
                    if (this.f18610c.H0() != 0) {
                        z2 = false;
                    }
                    this.f18610c.X(this.f18609b);
                    if (z2) {
                        p.this.notifyAll();
                    }
                }
            }
        }

        public final void o() throws InterruptedIOException {
            p.this.f18603j.k();
            while (this.f18610c.H0() == 0 && !this.f18613f && !this.f18612e && p.this.f18605l == null) {
                try {
                    p.this.z();
                } finally {
                    p.this.f18603j.u();
                }
            }
        }

        @Override // l.t
        public u timeout() {
            return p.this.f18603j;
        }
    }

    public class d extends l.a {
        public d() {
        }

        @Override // l.a
        public void t() {
            p.this.n(c.k.a.y.k.a.CANCEL);
        }

        public void u() throws InterruptedIOException {
            if (n()) {
                throw new InterruptedIOException("timeout");
            }
        }
    }

    public p(int i2, o oVar, boolean z, boolean z2, List<c.k.a.y.k.d> list) {
        if (oVar == null) {
            throw new NullPointerException("connection == null");
        }
        if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.f18596c = i2;
        this.f18597d = oVar;
        this.f18595b = oVar.s.e(65536);
        c cVar = new c(oVar.r.e(65536));
        this.f18601h = cVar;
        b bVar = new b();
        this.f18602i = bVar;
        cVar.f18613f = z2;
        bVar.f18607c = z;
        this.f18599f = list;
    }

    public void i(long j2) {
        this.f18595b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void j() {
        boolean z;
        boolean zT;
        synchronized (this) {
            z = !this.f18601h.f18613f && this.f18601h.f18612e && (this.f18602i.f18607c || this.f18602i.f18606b);
            zT = t();
        }
        if (z) {
            l(c.k.a.y.k.a.CANCEL);
        } else {
            if (zT) {
                return;
            }
            this.f18597d.O0(this.f18596c);
        }
    }

    public final void k() throws IOException {
        if (this.f18602i.f18606b) {
            throw new IOException("stream closed");
        }
        if (this.f18602i.f18607c) {
            throw new IOException("stream finished");
        }
        if (this.f18605l == null) {
            return;
        }
        throw new IOException("stream was reset: " + this.f18605l);
    }

    public void l(c.k.a.y.k.a aVar) {
        if (m(aVar)) {
            this.f18597d.V0(this.f18596c, aVar);
        }
    }

    public final boolean m(c.k.a.y.k.a aVar) {
        synchronized (this) {
            if (this.f18605l != null) {
                return false;
            }
            if (this.f18601h.f18613f && this.f18602i.f18607c) {
                return false;
            }
            this.f18605l = aVar;
            notifyAll();
            this.f18597d.O0(this.f18596c);
            return true;
        }
    }

    public void n(c.k.a.y.k.a aVar) {
        if (m(aVar)) {
            this.f18597d.W0(this.f18596c, aVar);
        }
    }

    public int o() {
        return this.f18596c;
    }

    public synchronized List<c.k.a.y.k.d> p() {
        List<c.k.a.y.k.d> list;
        this.f18603j.k();
        while (this.f18600g == null && this.f18605l == null) {
            try {
                z();
            } catch (Throwable th) {
                this.f18603j.u();
                throw th;
            }
        }
        this.f18603j.u();
        list = this.f18600g;
        if (list == null) {
            throw new IOException("stream was reset: " + this.f18605l);
        }
        return list;
    }

    public s q() {
        synchronized (this) {
            if (this.f18600g == null && !s()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f18602i;
    }

    public t r() {
        return this.f18601h;
    }

    public boolean s() {
        return this.f18597d.f18544d == ((this.f18596c & 1) == 1);
    }

    public synchronized boolean t() {
        if (this.f18605l != null) {
            return false;
        }
        if ((this.f18601h.f18613f || this.f18601h.f18612e) && (this.f18602i.f18607c || this.f18602i.f18606b)) {
            if (this.f18600g != null) {
                return false;
            }
        }
        return true;
    }

    public u u() {
        return this.f18603j;
    }

    public void v(l.e eVar, int i2) {
        this.f18601h.n(eVar, i2);
    }

    public void w() {
        boolean zT;
        synchronized (this) {
            this.f18601h.f18613f = true;
            zT = t();
            notifyAll();
        }
        if (zT) {
            return;
        }
        this.f18597d.O0(this.f18596c);
    }

    public void x(List<c.k.a.y.k.d> list, e eVar) {
        c.k.a.y.k.a aVar = null;
        boolean zT = true;
        synchronized (this) {
            if (this.f18600g == null) {
                if (eVar.failIfHeadersAbsent()) {
                    aVar = c.k.a.y.k.a.PROTOCOL_ERROR;
                } else {
                    this.f18600g = list;
                    zT = t();
                    notifyAll();
                }
            } else if (eVar.failIfHeadersPresent()) {
                aVar = c.k.a.y.k.a.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f18600g);
                arrayList.addAll(list);
                this.f18600g = arrayList;
            }
        }
        if (aVar != null) {
            n(aVar);
        } else {
            if (zT) {
                return;
            }
            this.f18597d.O0(this.f18596c);
        }
    }

    public synchronized void y(c.k.a.y.k.a aVar) {
        if (this.f18605l == null) {
            this.f18605l = aVar;
            notifyAll();
        }
    }

    public final void z() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }
}
