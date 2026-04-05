package c.k.a;

import c.k.a.s;
import c.k.a.y.k.o;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f18216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f18217c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.k.a.y.j.e f18219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.k.a.y.k.o f18220f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f18223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f18225k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18218d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f18221g = r.HTTP_1_1;

    public i(j jVar, w wVar) {
        this.f18215a = jVar;
        this.f18216b = wVar;
    }

    public boolean a() {
        synchronized (this.f18215a) {
            if (this.f18225k == null) {
                return false;
            }
            this.f18225k = null;
            return true;
        }
    }

    public void b(int i2, int i3, int i4, s sVar) throws IOException {
        if (this.f18218d) {
            throw new IllegalStateException("already connected");
        }
        this.f18217c = (this.f18216b.f18307b.type() == Proxy.Type.DIRECT || this.f18216b.f18307b.type() == Proxy.Type.HTTP) ? this.f18216b.f18306a.f18146d.createSocket() : new Socket(this.f18216b.f18307b);
        this.f18217c.setSoTimeout(i3);
        c.k.a.y.f.e().c(this.f18217c, this.f18216b.f18308c, i2);
        if (this.f18216b.f18306a.f18147e != null) {
            x(sVar, i3, i4);
        } else {
            this.f18219e = new c.k.a.y.j.e(this.f18215a, this, this.f18217c);
        }
        this.f18218d = true;
    }

    public void c(q qVar, Object obj, s sVar) throws IOException {
        t(obj);
        if (!k()) {
            b(qVar.g(), qVar.w(), qVar.A(), w(sVar));
            if (o()) {
                qVar.h().g(this);
            }
            qVar.D().a(g());
        }
        v(qVar.w(), qVar.A());
    }

    public n d() {
        return this.f18223i;
    }

    public long e() {
        c.k.a.y.k.o oVar = this.f18220f;
        return oVar == null ? this.f18222h : oVar.C0();
    }

    public r f() {
        return this.f18221g;
    }

    public w g() {
        return this.f18216b;
    }

    public Socket h() {
        return this.f18217c;
    }

    public void i() {
        this.f18224j++;
    }

    public boolean j() {
        return (this.f18217c.isClosed() || this.f18217c.isInputShutdown() || this.f18217c.isOutputShutdown()) ? false : true;
    }

    public boolean k() {
        return this.f18218d;
    }

    public boolean l(long j2) {
        return e() < System.nanoTime() - j2;
    }

    public boolean m() {
        c.k.a.y.k.o oVar = this.f18220f;
        return oVar == null || oVar.F0();
    }

    public boolean n() {
        c.k.a.y.j.e eVar = this.f18219e;
        if (eVar != null) {
            return eVar.q();
        }
        return true;
    }

    public boolean o() {
        return this.f18220f != null;
    }

    public final void p(s sVar, int i2, int i3) throws IOException {
        c.k.a.y.j.e eVar = new c.k.a.y.j.e(this.f18215a, this, this.f18217c);
        eVar.z(i2, i3);
        URL urlP = sVar.p();
        String str = "CONNECT " + urlP.getHost() + ":" + urlP.getPort() + " HTTP/1.1";
        do {
            eVar.A(sVar.j(), str);
            eVar.o();
            u uVarM = eVar.y().z(sVar).m();
            eVar.n();
            int iO = uVarM.o();
            if (iO == 200) {
                if (eVar.k() > 0) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                return;
            } else {
                if (iO != 407) {
                    throw new IOException("Unexpected response code for CONNECT: " + uVarM.o());
                }
                w wVar = this.f18216b;
                sVar = c.k.a.y.j.j.i(wVar.f18306a.f18150h, uVarM, wVar.f18307b);
            }
        } while (sVar != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    public c.k.a.y.j.p q(c.k.a.y.j.g gVar) {
        return this.f18220f != null ? new c.k.a.y.j.n(gVar, this.f18220f) : new c.k.a.y.j.i(gVar, this.f18219e);
    }

    public int r() {
        return this.f18224j;
    }

    public void s() {
        if (this.f18220f != null) {
            throw new IllegalStateException("spdyConnection != null");
        }
        this.f18222h = System.nanoTime();
    }

    public void t(Object obj) {
        if (o()) {
            return;
        }
        synchronized (this.f18215a) {
            if (this.f18225k != null) {
                throw new IllegalStateException("Connection already has an owner!");
            }
            this.f18225k = obj;
        }
    }

    public void u(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("protocol == null");
        }
        this.f18221g = rVar;
    }

    public void v(int i2, int i3) throws SocketException {
        if (!this.f18218d) {
            throw new IllegalStateException("setTimeouts - not connected");
        }
        if (this.f18219e != null) {
            this.f18217c.setSoTimeout(i2);
            this.f18219e.z(i2, i3);
        }
    }

    public final s w(s sVar) {
        String str;
        if (!this.f18216b.c()) {
            return null;
        }
        String host = sVar.p().getHost();
        int iJ = c.k.a.y.h.j(sVar.p());
        if (iJ == c.k.a.y.h.g(ClientConstants.DOMAIN_SCHEME)) {
            str = host;
        } else {
            str = host + ":" + iJ;
        }
        s.b bVarJ = new s.b().o(new URL(ClientConstants.DOMAIN_SCHEME, host, iJ, "/")).j(HttpHeader.HOST, str).j("Proxy-Connection", "Keep-Alive");
        String strI = sVar.i(HttpHeader.USER_AGENT);
        if (strI != null) {
            bVarJ.j(HttpHeader.USER_AGENT, strI);
        }
        String strI2 = sVar.i("Proxy-Authorization");
        if (strI2 != null) {
            bVarJ.j("Proxy-Authorization", strI2);
        }
        return bVarJ.h();
    }

    public final void x(s sVar, int i2, int i3) throws IOException {
        String strG;
        c.k.a.y.f fVarE = c.k.a.y.f.e();
        if (sVar != null) {
            p(sVar, i2, i3);
        }
        a aVar = this.f18216b.f18306a;
        Socket socketCreateSocket = aVar.f18147e.createSocket(this.f18217c, aVar.f18144b, aVar.f18145c, true);
        this.f18217c = socketCreateSocket;
        SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
        w wVar = this.f18216b;
        wVar.f18309d.c(sSLSocket, wVar);
        sSLSocket.startHandshake();
        a aVar2 = this.f18216b.f18306a;
        if (!aVar2.f18148f.verify(aVar2.f18144b, sSLSocket.getSession())) {
            throw new IOException("Hostname '" + this.f18216b.f18306a.f18144b + "' was not verified");
        }
        a aVar3 = this.f18216b.f18306a;
        aVar3.f18149g.a(aVar3.f18144b, sSLSocket.getSession().getPeerCertificates());
        this.f18223i = n.c(sSLSocket.getSession());
        if (this.f18216b.f18309d.g() && (strG = fVarE.g(sSLSocket)) != null) {
            this.f18221g = r.get(strG);
        }
        r rVar = this.f18221g;
        if (rVar != r.SPDY_3 && rVar != r.HTTP_2) {
            this.f18219e = new c.k.a.y.j.e(this.f18215a, this, this.f18217c);
            return;
        }
        sSLSocket.setSoTimeout(0);
        c.k.a.y.k.o oVarG = new o.h(this.f18216b.f18306a.c(), true, this.f18217c).h(this.f18221g).g();
        this.f18220f = oVarG;
        oVarG.P0();
    }
}
