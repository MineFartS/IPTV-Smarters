package k.g0.f;

import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import k.a0;
import k.c0;
import k.e0;
import k.g0.i.g;
import k.i;
import k.j;
import k.k;
import k.r;
import k.t;
import k.x;
import k.y;
import l.m;
import l.u;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g.i implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f30597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f30598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f30599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f30600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f30601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f30602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k.g0.i.g f30603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l.e f30604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l.d f30605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30608m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f30609n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f30610o = Long.MAX_VALUE;

    public c(j jVar, e0 e0Var) {
        this.f30597b = jVar;
        this.f30598c = e0Var;
    }

    @Override // k.i
    public e0 a() {
        return this.f30598c;
    }

    @Override // k.g0.i.g.i
    public void b(k.g0.i.g gVar) {
        synchronized (this.f30597b) {
            this.f30608m = gVar.n();
        }
    }

    @Override // k.g0.i.g.i
    public void c(k.g0.i.i iVar) {
        iVar.d(k.g0.i.b.REFUSED_STREAM);
    }

    public void d() {
        k.g0.c.d(this.f30599d);
    }

    public void e(int i2, int i3, int i4, boolean z) throws Throwable {
        if (this.f30602g != null) {
            throw new IllegalStateException("already connected");
        }
        List<k> listB = this.f30598c.a().b();
        b bVar = new b(listB);
        if (this.f30598c.a().k() == null) {
            if (!listB.contains(k.f30910d)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strL = this.f30598c.a().l().l();
            if (!k.g0.j.e.h().k(strL)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication to " + strL + " not permitted by network security policy"));
            }
        }
        e eVar = null;
        do {
            try {
                if (this.f30598c.c()) {
                    h(i2, i3, i4);
                } else {
                    f(i2, i3);
                }
                k(bVar);
                if (this.f30603h != null) {
                    synchronized (this.f30597b) {
                        this.f30608m = this.f30603h.n();
                    }
                    return;
                }
                return;
            } catch (IOException e2) {
                k.g0.c.d(this.f30600e);
                k.g0.c.d(this.f30599d);
                this.f30600e = null;
                this.f30599d = null;
                this.f30604i = null;
                this.f30605j = null;
                this.f30601f = null;
                this.f30602g = null;
                this.f30603h = null;
                if (eVar == null) {
                    eVar = new e(e2);
                } else {
                    eVar.a(e2);
                }
                if (!z) {
                    throw eVar;
                }
            }
        } while (bVar.b(e2));
        throw eVar;
    }

    public final void f(int i2, int i3) throws IOException {
        Proxy proxyB = this.f30598c.b();
        Socket socketCreateSocket = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f30598c.a().j().createSocket() : new Socket(proxyB);
        this.f30599d = socketCreateSocket;
        socketCreateSocket.setSoTimeout(i3);
        try {
            k.g0.j.e.h().f(this.f30599d, this.f30598c.d(), i2);
            try {
                this.f30604i = m.c(m.l(this.f30599d));
                this.f30605j = m.b(m.h(this.f30599d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f30598c.d());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void g(b bVar) throws Throwable {
        k.a aVarA = this.f30598c.a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) aVarA.k().createSocket(this.f30599d, aVarA.l().l(), aVarA.l().y(), true);
                try {
                    k kVarA = bVar.a(sSLSocket2);
                    if (kVarA.f()) {
                        k.g0.j.e.h().e(sSLSocket2, aVarA.l().l(), aVarA.f());
                    }
                    sSLSocket2.startHandshake();
                    r rVarB = r.b(sSLSocket2.getSession());
                    if (aVarA.e().verify(aVarA.l().l(), sSLSocket2.getSession())) {
                        aVarA.a().a(aVarA.l().l(), rVarB.c());
                        String strI = kVarA.f() ? k.g0.j.e.h().i(sSLSocket2) : null;
                        this.f30600e = sSLSocket2;
                        this.f30604i = m.c(m.l(sSLSocket2));
                        this.f30605j = m.b(m.h(this.f30600e));
                        this.f30601f = rVarB;
                        this.f30602g = strI != null ? y.get(strI) : y.HTTP_1_1;
                        k.g0.j.e.h().a(sSLSocket2);
                        return;
                    }
                    X509Certificate x509Certificate = (X509Certificate) rVarB.c().get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + aVarA.l().l() + " not verified:\n    certificate: " + k.g.c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + k.g0.l.d.a(x509Certificate));
                } catch (AssertionError e2) {
                    e = e2;
                    if (!k.g0.c.s(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        k.g0.j.e.h().a(sSLSocket);
                    }
                    k.g0.c.d(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e3) {
            e = e3;
        }
    }

    public final void h(int i2, int i3, int i4) throws IOException {
        a0 a0VarJ = j();
        t tVarH = a0VarJ.h();
        int i5 = 0;
        while (true) {
            i5++;
            if (i5 > 21) {
                throw new ProtocolException("Too many tunnel connections attempted: 21");
            }
            f(i2, i3);
            a0VarJ = i(i3, i4, a0VarJ, tVarH);
            if (a0VarJ == null) {
                return;
            }
            k.g0.c.d(this.f30599d);
            this.f30599d = null;
            this.f30605j = null;
            this.f30604i = null;
        }
    }

    public final a0 i(int i2, int i3, a0 a0Var, t tVar) throws IOException {
        String str = "CONNECT " + k.g0.c.m(tVar, true) + " HTTP/1.1";
        while (true) {
            k.g0.h.a aVar = new k.g0.h.a(null, null, this.f30604i, this.f30605j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f30604i.timeout().g(i2, timeUnit);
            this.f30605j.timeout().g(i3, timeUnit);
            aVar.o(a0Var.d(), str);
            aVar.b();
            c0 c0VarC = aVar.e(false).o(a0Var).c();
            long jB = k.g0.g.e.b(c0VarC);
            if (jB == -1) {
                jB = 0;
            }
            l.t tVarL = aVar.l(jB);
            k.g0.c.u(tVarL, Integer.MAX_VALUE, timeUnit);
            tVarL.close();
            int iL = c0VarC.l();
            if (iL == 200) {
                if (this.f30604i.z().H() && this.f30605j.z().H()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iL != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c0VarC.l());
            }
            a0 a0VarA = this.f30598c.a().h().a(this.f30598c, c0VarC);
            if (a0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(c0VarC.n(Headers.CONNECTION))) {
                return a0VarA;
            }
            a0Var = a0VarA;
        }
    }

    public final a0 j() {
        return new a0.a().k(this.f30598c.a().l()).e(HttpHeader.HOST, k.g0.c.m(this.f30598c.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e(HttpHeader.USER_AGENT, k.g0.d.a()).b();
    }

    public final void k(b bVar) throws Throwable {
        if (this.f30598c.a().k() == null) {
            this.f30602g = y.HTTP_1_1;
            this.f30600e = this.f30599d;
            return;
        }
        g(bVar);
        if (this.f30602g == y.HTTP_2) {
            this.f30600e.setSoTimeout(0);
            k.g0.i.g gVarA = new g.h(true).c(this.f30600e, this.f30598c.a().l().l(), this.f30604i, this.f30605j).b(this).a();
            this.f30603h = gVarA;
            gVarA.y();
        }
    }

    public r l() {
        return this.f30601f;
    }

    public boolean m(k.a aVar, @Nullable e0 e0Var) {
        if (this.f30609n.size() >= this.f30608m || this.f30606k || !k.g0.a.f30553a.g(this.f30598c.a(), aVar)) {
            return false;
        }
        if (aVar.l().l().equals(a().a().l().l())) {
            return true;
        }
        if (this.f30603h == null || e0Var == null || e0Var.b().type() != Proxy.Type.DIRECT || this.f30598c.b().type() != Proxy.Type.DIRECT || !this.f30598c.d().equals(e0Var.d()) || e0Var.a().e() != k.g0.l.d.f30880a || !r(aVar.l())) {
            return false;
        }
        try {
            aVar.a().a(aVar.l().l(), l().c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean n(boolean z) {
        if (this.f30600e.isClosed() || this.f30600e.isInputShutdown() || this.f30600e.isOutputShutdown()) {
            return false;
        }
        if (this.f30603h != null) {
            return !r0.m();
        }
        if (z) {
            try {
                int soTimeout = this.f30600e.getSoTimeout();
                try {
                    this.f30600e.setSoTimeout(1);
                    return !this.f30604i.H();
                } finally {
                    this.f30600e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public boolean o() {
        return this.f30603h != null;
    }

    public k.g0.g.c p(x xVar, g gVar) throws SocketException {
        if (this.f30603h != null) {
            return new k.g0.i.f(xVar, gVar, this.f30603h);
        }
        this.f30600e.setSoTimeout(xVar.B());
        u uVarTimeout = this.f30604i.timeout();
        long jB = xVar.B();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVarTimeout.g(jB, timeUnit);
        this.f30605j.timeout().g(xVar.H(), timeUnit);
        return new k.g0.h.a(xVar, gVar, this.f30604i, this.f30605j);
    }

    public Socket q() {
        return this.f30600e;
    }

    public boolean r(t tVar) {
        if (tVar.y() != this.f30598c.a().l().y()) {
            return false;
        }
        if (tVar.l().equals(this.f30598c.a().l().l())) {
            return true;
        }
        return this.f30601f != null && k.g0.l.d.f30880a.c(tVar.l(), (X509Certificate) this.f30601f.c().get(0));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f30598c.a().l().l());
        sb.append(":");
        sb.append(this.f30598c.a().l().y());
        sb.append(", proxy=");
        sb.append(this.f30598c.b());
        sb.append(" hostAddress=");
        sb.append(this.f30598c.d());
        sb.append(" cipherSuite=");
        r rVar = this.f30601f;
        sb.append(rVar != null ? rVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.f30602g);
        sb.append('}');
        return sb.toString();
    }
}
