package k.g0.h;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.c0;
import k.d0;
import k.g0.g.h;
import k.g0.g.i;
import k.g0.g.k;
import k.s;
import k.x;
import l.j;
import l.m;
import l.s;
import l.t;
import l.u;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements k.g0.g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f30657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.g0.f.g f30658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.e f30659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l.d f30660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30661e = 0;

    public abstract class b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f30662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30663c;

        public b() {
            this.f30662b = new j(a.this.f30659c.timeout());
        }

        public final void d(boolean z) {
            a aVar = a.this;
            int i2 = aVar.f30661e;
            if (i2 == 6) {
                return;
            }
            if (i2 != 5) {
                throw new IllegalStateException("state: " + a.this.f30661e);
            }
            aVar.g(this.f30662b);
            a aVar2 = a.this;
            aVar2.f30661e = 6;
            k.g0.f.g gVar = aVar2.f30658b;
            if (gVar != null) {
                gVar.p(!z, aVar2);
            }
        }

        @Override // l.t
        public u timeout() {
            return this.f30662b;
        }
    }

    public final class c implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f30665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30666c;

        public c() {
            this.f30665b = new j(a.this.f30660d.timeout());
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f30666c) {
                return;
            }
            this.f30666c = true;
            a.this.f30660d.P("0\r\n\r\n");
            a.this.g(this.f30665b);
            a.this.f30661e = 3;
        }

        @Override // l.s, java.io.Flushable
        public synchronized void flush() {
            if (this.f30666c) {
                return;
            }
            a.this.f30660d.flush();
        }

        @Override // l.s
        public void h(l.c cVar, long j2) {
            if (this.f30666c) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            a.this.f30660d.Y(j2);
            a.this.f30660d.P("\r\n");
            a.this.f30660d.h(cVar, j2);
            a.this.f30660d.P("\r\n");
        }

        @Override // l.s
        public u timeout() {
            return this.f30665b;
        }
    }

    public class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final k.t f30668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f30669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f30670g;

        public d(k.t tVar) {
            super();
            this.f30669f = -1L;
            this.f30670g = true;
            this.f30668e = tVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30663c) {
                return;
            }
            if (this.f30670g && !k.g0.c.i(this, 100, TimeUnit.MILLISECONDS)) {
                d(false);
            }
            this.f30663c = true;
        }

        public final void i() throws ProtocolException {
            if (this.f30669f != -1) {
                a.this.f30659c.b0();
            }
            try {
                this.f30669f = a.this.f30659c.z0();
                String strTrim = a.this.f30659c.b0().trim();
                if (this.f30669f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f30669f + strTrim + "\"");
                }
                if (this.f30669f == 0) {
                    this.f30670g = false;
                    k.g0.g.e.e(a.this.f30657a.h(), this.f30668e, a.this.n());
                    d(true);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws ProtocolException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f30663c) {
                throw new IllegalStateException("closed");
            }
            if (!this.f30670g) {
                return -1L;
            }
            long j3 = this.f30669f;
            if (j3 == 0 || j3 == -1) {
                i();
                if (!this.f30670g) {
                    return -1L;
                }
            }
            long jK = a.this.f30659c.k(cVar, Math.min(j2, this.f30669f));
            if (jK != -1) {
                this.f30669f -= jK;
                return jK;
            }
            d(false);
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final class e implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f30672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f30674d;

        public e(long j2) {
            this.f30672b = new j(a.this.f30660d.timeout());
            this.f30674d = j2;
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws ProtocolException {
            if (this.f30673c) {
                return;
            }
            this.f30673c = true;
            if (this.f30674d > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            a.this.g(this.f30672b);
            a.this.f30661e = 3;
        }

        @Override // l.s, java.io.Flushable
        public void flush() {
            if (this.f30673c) {
                return;
            }
            a.this.f30660d.flush();
        }

        @Override // l.s
        public void h(l.c cVar, long j2) throws ProtocolException {
            if (this.f30673c) {
                throw new IllegalStateException("closed");
            }
            k.g0.c.b(cVar.H0(), 0L, j2);
            if (j2 <= this.f30674d) {
                a.this.f30660d.h(cVar, j2);
                this.f30674d -= j2;
                return;
            }
            throw new ProtocolException("expected " + this.f30674d + " bytes but received " + j2);
        }

        @Override // l.s
        public u timeout() {
            return this.f30672b;
        }
    }

    public class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f30676e;

        public f(long j2) {
            super();
            this.f30676e = j2;
            if (j2 == 0) {
                d(true);
            }
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30663c) {
                return;
            }
            if (this.f30676e != 0 && !k.g0.c.i(this, 100, TimeUnit.MILLISECONDS)) {
                d(false);
            }
            this.f30663c = true;
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws ProtocolException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f30663c) {
                throw new IllegalStateException("closed");
            }
            long j3 = this.f30676e;
            if (j3 == 0) {
                return -1L;
            }
            long jK = a.this.f30659c.k(cVar, Math.min(j3, j2));
            if (jK == -1) {
                d(false);
                throw new ProtocolException("unexpected end of stream");
            }
            long j4 = this.f30676e - jK;
            this.f30676e = j4;
            if (j4 == 0) {
                d(true);
            }
            return jK;
        }
    }

    public class g extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f30678e;

        public g() {
            super();
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30663c) {
                return;
            }
            if (!this.f30678e) {
                d(false);
            }
            this.f30663c = true;
        }

        @Override // l.t
        public long k(l.c cVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
            if (this.f30663c) {
                throw new IllegalStateException("closed");
            }
            if (this.f30678e) {
                return -1L;
            }
            long jK = a.this.f30659c.k(cVar, j2);
            if (jK != -1) {
                return jK;
            }
            this.f30678e = true;
            d(true);
            return -1L;
        }
    }

    public a(x xVar, k.g0.f.g gVar, l.e eVar, l.d dVar) {
        this.f30657a = xVar;
        this.f30658b = gVar;
        this.f30659c = eVar;
        this.f30660d = dVar;
    }

    @Override // k.g0.g.c
    public void a() {
        this.f30660d.flush();
    }

    @Override // k.g0.g.c
    public void b() {
        this.f30660d.flush();
    }

    @Override // k.g0.g.c
    public void c(a0 a0Var) {
        o(a0Var.d(), i.a(a0Var, this.f30658b.d().a().b().type()));
    }

    @Override // k.g0.g.c
    public void cancel() {
        k.g0.f.c cVarD = this.f30658b.d();
        if (cVarD != null) {
            cVarD.d();
        }
    }

    @Override // k.g0.g.c
    public d0 d(c0 c0Var) {
        return new h(c0Var.p(), m.c(h(c0Var)));
    }

    @Override // k.g0.g.c
    public c0.a e(boolean z) throws IOException {
        int i2 = this.f30661e;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException("state: " + this.f30661e);
        }
        try {
            k kVarA = k.a(this.f30659c.b0());
            c0.a aVarI = new c0.a().m(kVarA.f30654a).g(kVarA.f30655b).j(kVarA.f30656c).i(n());
            if (z && kVarA.f30655b == 100) {
                return null;
            }
            this.f30661e = 4;
            return aVarI;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f30658b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // k.g0.g.c
    public s f(a0 a0Var, long j2) {
        if ("chunked".equalsIgnoreCase(a0Var.c("Transfer-Encoding"))) {
            return i();
        }
        if (j2 != -1) {
            return k(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void g(j jVar) {
        u uVarI = jVar.i();
        jVar.j(u.f31095a);
        uVarI.a();
        uVarI.b();
    }

    public final t h(c0 c0Var) {
        if (!k.g0.g.e.c(c0Var)) {
            return l(0L);
        }
        if ("chunked".equalsIgnoreCase(c0Var.n("Transfer-Encoding"))) {
            return j(c0Var.t().h());
        }
        long jB = k.g0.g.e.b(c0Var);
        return jB != -1 ? l(jB) : m();
    }

    public s i() {
        if (this.f30661e == 1) {
            this.f30661e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f30661e);
    }

    public t j(k.t tVar) {
        if (this.f30661e == 4) {
            this.f30661e = 5;
            return new d(tVar);
        }
        throw new IllegalStateException("state: " + this.f30661e);
    }

    public s k(long j2) {
        if (this.f30661e == 1) {
            this.f30661e = 2;
            return new e(j2);
        }
        throw new IllegalStateException("state: " + this.f30661e);
    }

    public t l(long j2) {
        if (this.f30661e == 4) {
            this.f30661e = 5;
            return new f(j2);
        }
        throw new IllegalStateException("state: " + this.f30661e);
    }

    public t m() {
        if (this.f30661e != 4) {
            throw new IllegalStateException("state: " + this.f30661e);
        }
        k.g0.f.g gVar = this.f30658b;
        if (gVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f30661e = 5;
        gVar.j();
        return new g();
    }

    public k.s n() {
        s.a aVar = new s.a();
        while (true) {
            String strB0 = this.f30659c.b0();
            if (strB0.length() == 0) {
                return aVar.d();
            }
            k.g0.a.f30553a.a(aVar, strB0);
        }
    }

    public void o(k.s sVar, String str) {
        if (this.f30661e != 0) {
            throw new IllegalStateException("state: " + this.f30661e);
        }
        this.f30660d.P(str).P("\r\n");
        int iF = sVar.f();
        for (int i2 = 0; i2 < iF; i2++) {
            this.f30660d.P(sVar.c(i2)).P(": ").P(sVar.g(i2)).P("\r\n");
        }
        this.f30660d.P("\r\n");
        this.f30661e = 1;
    }
}
