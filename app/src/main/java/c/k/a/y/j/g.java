package c.k.a.y.j;

import c.k.a.o;
import c.k.a.q;
import c.k.a.r;
import c.k.a.s;
import c.k.a.u;
import c.k.a.v;
import c.k.a.w;
import c.k.a.y.j.c;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.security.cert.CertificateException;
import java.util.Date;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import l.t;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f18416a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f18417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.k.a.i f18418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f18419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f18420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f18421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f18422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18423h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f18425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f18426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f18427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f18428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f18429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f18430o;
    public l.s p;
    public l.d q;
    public t r;
    public l.e s;
    public InputStream t;
    public b u;
    public c v;

    public static class a extends v {
        @Override // c.k.a.v
        public long i() {
            return 0L;
        }

        @Override // c.k.a.v
        public l.e l() {
            return new l.c();
        }
    }

    public g(q qVar, s sVar, boolean z, c.k.a.i iVar, m mVar, l lVar, u uVar) {
        w wVarG;
        this.f18417b = qVar;
        this.f18426k = sVar;
        this.f18425j = z;
        this.f18418c = iVar;
        this.f18419d = mVar;
        this.p = lVar;
        this.f18421f = uVar;
        if (iVar != null) {
            c.k.a.y.b.f18345b.k(iVar, this);
            wVarG = iVar.g();
        } else {
            wVarG = null;
        }
        this.f18420e = wVarG;
    }

    public static c.k.a.o b(c.k.a.o oVar, c.k.a.o oVar2) {
        o.b bVar = new o.b();
        for (int i2 = 0; i2 < oVar.f(); i2++) {
            String strD = oVar.d(i2);
            String strG = oVar.g(i2);
            if ((!"Warning".equalsIgnoreCase(strD) || !strG.startsWith("1")) && (!j.g(strD) || oVar2.a(strD) == null)) {
                bVar.b(strD, strG);
            }
        }
        for (int i3 = 0; i3 < oVar2.f(); i3++) {
            String strD2 = oVar2.d(i3);
            if (!"Content-Length".equalsIgnoreCase(strD2) && j.g(strD2)) {
                bVar.b(strD2, oVar2.g(i3));
            }
        }
        return bVar.e();
    }

    public static String m(URL url) {
        if (c.k.a.y.h.j(url) == c.k.a.y.h.g(url.getProtocol())) {
            return url.getHost();
        }
        return url.getHost() + ":" + url.getPort();
    }

    public static u y(u uVar) {
        return (uVar == null || uVar.k() == null) ? uVar : uVar.w().l(null).m();
    }

    public static boolean z(u uVar, u uVar2) {
        Date dateC;
        if (uVar2.o() == 304) {
            return true;
        }
        Date dateC2 = uVar.s().c(Headers.LAST_MODIFIED);
        return (dateC2 == null || (dateC = uVar2.s().c(Headers.LAST_MODIFIED)) == null || dateC.getTime() >= dateC2.getTime()) ? false : true;
    }

    public void A() {
        if (this.f18423h != -1) {
            throw new IllegalStateException();
        }
        this.f18423h = System.currentTimeMillis();
    }

    public c.k.a.i a() {
        Closeable closeable = this.q;
        if (closeable != null || (closeable = this.p) != null) {
            c.k.a.y.h.c(closeable);
        }
        l.e eVar = this.s;
        if (eVar == null) {
            c.k.a.i iVar = this.f18418c;
            if (iVar != null) {
                c.k.a.y.h.d(iVar.h());
            }
            this.f18418c = null;
            return null;
        }
        c.k.a.y.h.c(eVar);
        c.k.a.y.h.c(this.t);
        p pVar = this.f18422g;
        if (pVar != null && this.f18418c != null && !pVar.h()) {
            c.k.a.y.h.d(this.f18418c.h());
            this.f18418c = null;
            return null;
        }
        c.k.a.i iVar2 = this.f18418c;
        if (iVar2 != null && !c.k.a.y.b.f18345b.b(iVar2)) {
            this.f18418c = null;
        }
        c.k.a.i iVar3 = this.f18418c;
        this.f18418c = null;
        return iVar3;
    }

    public final void c(s sVar) {
        if (this.f18418c != null) {
            throw new IllegalStateException();
        }
        if (this.f18419d == null) {
            this.f18419d = m.b(sVar, this.f18417b);
        }
        c.k.a.i iVarH = this.f18419d.h(this);
        this.f18418c = iVarH;
        this.f18420e = iVarH.g();
    }

    public s d() throws ProtocolException {
        String strQ;
        if (this.f18430o == null) {
            throw new IllegalStateException();
        }
        Proxy proxyB = k() != null ? k().b() : this.f18417b.r();
        int iO = this.f18430o.o();
        if (iO != 307 && iO != 308) {
            if (iO != 401) {
                if (iO != 407) {
                    switch (iO) {
                        case IjkMediaCodecInfo.RANK_SECURE /* 300 */:
                        case Constants.BUCKET_REDIRECT_STATUS_CODE /* 301 */:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                } else if (proxyB.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            return j.i(this.f18417b.e(), this.f18430o, proxyB);
        }
        if (!this.f18426k.m().equals("GET") && !this.f18426k.m().equals("HEAD")) {
            return null;
        }
        if (!this.f18417b.n() || (strQ = this.f18430o.q(HttpHeader.LOCATION)) == null) {
            return null;
        }
        URL url = new URL(this.f18426k.p(), strQ);
        if (!url.getProtocol().equals(ClientConstants.DOMAIN_SCHEME) && !url.getProtocol().equals("http")) {
            return null;
        }
        if (!url.getProtocol().equals(this.f18426k.p().getProtocol()) && !this.f18417b.o()) {
            return null;
        }
        s.b bVarN = this.f18426k.n();
        if (h.b(this.f18426k.m())) {
            bVarN.l("GET", null);
            bVarN.m("Transfer-Encoding");
            bVarN.m("Content-Length");
            bVarN.m("Content-Type");
        }
        if (!w(url)) {
            bVarN.m("Authorization");
        }
        return bVarN.o(url).h();
    }

    public l.d e() {
        l.d dVar = this.q;
        if (dVar != null) {
            return dVar;
        }
        l.s sVarH = h();
        if (sVarH == null) {
            return null;
        }
        l.d dVarB = l.m.b(sVarH);
        this.q = dVarB;
        return dVarB;
    }

    public c.k.a.i f() {
        return this.f18418c;
    }

    public s g() {
        return this.f18426k;
    }

    public l.s h() {
        if (this.v != null) {
            return this.p;
        }
        throw new IllegalStateException();
    }

    public u i() {
        u uVar = this.f18430o;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException();
    }

    public l.e j() {
        if (this.f18430o != null) {
            return this.s;
        }
        throw new IllegalStateException();
    }

    public w k() {
        return this.f18420e;
    }

    public boolean l() {
        if (this.f18426k.m().equals("HEAD")) {
            return false;
        }
        int iO = this.f18430o.o();
        return (((iO >= 100 && iO < 200) || iO == 204 || iO == 304) && j.e(this.f18429n) == -1 && !"chunked".equalsIgnoreCase(this.f18429n.q("Transfer-Encoding"))) ? false : true;
    }

    public final void n(t tVar) {
        l.e eVarC;
        this.r = tVar;
        if (this.f18424i && "gzip".equalsIgnoreCase(this.f18430o.q("Content-Encoding"))) {
            this.f18430o = this.f18430o.w().y("Content-Encoding").y("Content-Length").m();
            eVarC = l.m.c(new l.k(tVar));
        } else {
            eVarC = l.m.c(tVar);
        }
        this.s = eVarC;
    }

    public final boolean o(IOException iOException) {
        return (((iOException instanceof SSLPeerUnverifiedException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException))) || (iOException instanceof ProtocolException)) ? false : true;
    }

    public final void p() {
        c.k.a.y.c cVarD = c.k.a.y.b.f18345b.d(this.f18417b);
        if (cVarD == null) {
            return;
        }
        if (c.a(this.f18430o, this.f18427l)) {
            this.u = cVarD.b(y(this.f18430o));
        } else if (h.a(this.f18427l.m())) {
            try {
                cVarD.d(this.f18427l);
            } catch (IOException unused) {
            }
        }
    }

    public final s q(s sVar) {
        s.b bVarN = sVar.n();
        if (sVar.i(HttpHeader.HOST) == null) {
            bVarN.j(HttpHeader.HOST, m(sVar.p()));
        }
        c.k.a.i iVar = this.f18418c;
        if ((iVar == null || iVar.f() != r.HTTP_1_0) && sVar.i(Headers.CONNECTION) == null) {
            bVarN.j(Headers.CONNECTION, "Keep-Alive");
        }
        if (sVar.i("Accept-Encoding") == null) {
            this.f18424i = true;
            bVarN.j("Accept-Encoding", "gzip");
        }
        CookieHandler cookieHandlerK = this.f18417b.k();
        if (cookieHandlerK != null) {
            j.a(bVarN, cookieHandlerK.get(sVar.o(), j.k(bVarN.h().j(), null)));
        }
        if (sVar.i(HttpHeader.USER_AGENT) == null) {
            bVarN.j(HttpHeader.USER_AGENT, c.k.a.y.i.a());
        }
        return bVarN.h();
    }

    public boolean r() {
        return h.b(this.f18426k.m());
    }

    public void s() throws IOException {
        if (this.f18430o != null) {
            return;
        }
        s sVar = this.f18427l;
        if (sVar == null && this.f18428m == null) {
            throw new IllegalStateException("call sendRequest() first!");
        }
        if (sVar == null) {
            return;
        }
        l.d dVar = this.q;
        if (dVar != null && dVar.z().H0() > 0) {
            this.q.flush();
        }
        if (this.f18423h == -1) {
            if (j.d(this.f18427l) == -1) {
                l.s sVar2 = this.p;
                if (sVar2 instanceof l) {
                    this.f18427l = this.f18427l.n().j("Content-Length", Long.toString(((l) sVar2).d())).h();
                }
            }
            this.f18422g.d(this.f18427l);
        }
        l.s sVar3 = this.p;
        if (sVar3 != null) {
            l.d dVar2 = this.q;
            if (dVar2 != null) {
                dVar2.close();
            } else {
                sVar3.close();
            }
            l.s sVar4 = this.p;
            if (sVar4 instanceof l) {
                this.f18422g.f((l) sVar4);
            }
        }
        this.f18422g.a();
        u uVarM = this.f18422g.g().z(this.f18427l).r(this.f18418c.d()).s(j.f18436c, Long.toString(this.f18423h)).s(j.f18437d, Long.toString(System.currentTimeMillis())).m();
        this.f18429n = uVarM;
        c.k.a.y.b.f18345b.l(this.f18418c, uVarM.x());
        t(this.f18429n.s());
        u uVar = this.f18428m;
        if (uVar != null) {
            if (z(uVar, this.f18429n)) {
                this.f18430o = this.f18428m.w().z(this.f18426k).w(y(this.f18421f)).t(b(this.f18428m.s(), this.f18429n.s())).n(y(this.f18428m)).v(y(this.f18429n)).m();
                this.f18422g.e();
                v();
                c.k.a.y.c cVarD = c.k.a.y.b.f18345b.d(this.f18417b);
                cVarD.a();
                cVarD.f(this.f18428m, y(this.f18430o));
                if (this.f18428m.k() != null) {
                    n(this.f18428m.k().l());
                    return;
                }
                return;
            }
            c.k.a.y.h.c(this.f18428m.k());
        }
        this.f18430o = this.f18429n.w().z(this.f18426k).w(y(this.f18421f)).n(y(this.f18428m)).v(y(this.f18429n)).m();
        if (l()) {
            p();
            n(this.f18422g.i(this.u));
        } else {
            t tVarI = this.f18422g.i(this.u);
            this.r = tVarI;
            this.s = l.m.c(tVarI);
        }
    }

    public void t(c.k.a.o oVar) throws IOException {
        CookieHandler cookieHandlerK = this.f18417b.k();
        if (cookieHandlerK != null) {
            cookieHandlerK.put(this.f18426k.o(), j.k(oVar, null));
        }
    }

    public g u(IOException iOException, l.s sVar) {
        c.k.a.i iVar;
        m mVar = this.f18419d;
        if (mVar != null && (iVar = this.f18418c) != null) {
            mVar.a(iVar, iOException);
        }
        boolean z = sVar == null || (sVar instanceof l);
        m mVar2 = this.f18419d;
        if (mVar2 == null && this.f18418c == null) {
            return null;
        }
        if ((mVar2 == null || mVar2.c()) && o(iOException) && z) {
            return new g(this.f18417b, this.f18426k, this.f18425j, a(), this.f18419d, (l) sVar, this.f18421f);
        }
        return null;
    }

    public void v() {
        p pVar = this.f18422g;
        if (pVar != null && this.f18418c != null) {
            pVar.c();
        }
        this.f18418c = null;
    }

    public boolean w(URL url) {
        URL urlP = this.f18426k.p();
        return urlP.getHost().equals(url.getHost()) && c.k.a.y.h.j(urlP) == c.k.a.y.h.j(url) && urlP.getProtocol().equals(url.getProtocol());
    }

    public void x() {
        l.s sVarB;
        if (this.v != null) {
            return;
        }
        if (this.f18422g != null) {
            throw new IllegalStateException();
        }
        s sVarQ = q(this.f18426k);
        c.k.a.y.c cVarD = c.k.a.y.b.f18345b.d(this.f18417b);
        u uVarC = cVarD != null ? cVarD.c(sVarQ) : null;
        c cVarC = new c.b(System.currentTimeMillis(), sVarQ, uVarC).c();
        this.v = cVarC;
        this.f18427l = cVarC.f18371a;
        this.f18428m = cVarC.f18372b;
        if (cVarD != null) {
            cVarD.e(cVarC);
        }
        if (uVarC != null && this.f18428m == null) {
            c.k.a.y.h.c(uVarC.k());
        }
        s sVar = this.f18427l;
        if (sVar == null) {
            if (this.f18418c != null) {
                c.k.a.y.b.f18345b.h(this.f18417b.h(), this.f18418c);
                this.f18418c = null;
            }
            u uVar = this.f18428m;
            this.f18430o = (uVar != null ? uVar.w().z(this.f18426k).w(y(this.f18421f)).n(y(this.f18428m)) : new u.b().z(this.f18426k).w(y(this.f18421f)).x(r.HTTP_1_1).q(504).u("Unsatisfiable Request (only-if-cached)").l(f18416a)).m();
            if (this.f18430o.k() != null) {
                n(this.f18430o.k().l());
                return;
            }
            return;
        }
        if (this.f18418c == null) {
            c(sVar);
        }
        this.f18422g = c.k.a.y.b.f18345b.g(this.f18418c, this);
        if (r() && this.p == null) {
            long jD = j.d(sVarQ);
            if (!this.f18425j) {
                this.f18422g.d(sVarQ);
                sVarB = this.f18422g.b(sVarQ, jD);
            } else {
                if (jD > 2147483647L) {
                    throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                }
                if (jD != -1) {
                    this.f18422g.d(sVarQ);
                    sVarB = new l((int) jD);
                } else {
                    sVarB = new l();
                }
            }
            this.p = sVarB;
        }
    }
}
