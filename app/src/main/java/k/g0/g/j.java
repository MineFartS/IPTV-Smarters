package k.g0.g;

import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k.a0;
import k.c0;
import k.e0;
import k.t;
import k.u;
import k.x;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f30649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k.g0.f.g f30651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f30652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f30653e;

    public j(x xVar, boolean z) {
        this.f30649a = xVar;
        this.f30650b = z;
    }

    @Override // k.u
    public c0 a(u.a aVar) throws IOException {
        a0 a0VarRequest = aVar.request();
        this.f30651c = new k.g0.f.g(this.f30649a.f(), c(a0VarRequest.h()), this.f30652d);
        c0 c0Var = null;
        int i2 = 0;
        while (!this.f30653e) {
            try {
                try {
                    c0 c0VarD = ((g) aVar).d(a0VarRequest, this.f30651c, null, null);
                    if (c0Var != null) {
                        c0VarD = c0VarD.r().l(c0Var.r().b(null).c()).c();
                    }
                    c0Var = c0VarD;
                    a0VarRequest = d(c0Var);
                } catch (IOException e2) {
                    if (!g(e2, !(e2 instanceof k.g0.i.a), a0VarRequest)) {
                        throw e2;
                    }
                } catch (k.g0.f.e e3) {
                    if (!g(e3.c(), false, a0VarRequest)) {
                        throw e3.c();
                    }
                }
                if (a0VarRequest == null) {
                    if (!this.f30650b) {
                        this.f30651c.k();
                    }
                    return c0Var;
                }
                k.g0.c.c(c0Var.d());
                i2++;
                if (i2 > 20) {
                    this.f30651c.k();
                    throw new ProtocolException("Too many follow-up requests: " + i2);
                }
                a0VarRequest.a();
                if (!h(c0Var, a0VarRequest.h())) {
                    this.f30651c.k();
                    this.f30651c = new k.g0.f.g(this.f30649a.f(), c(a0VarRequest.h()), this.f30652d);
                } else if (this.f30651c.c() != null) {
                    throw new IllegalStateException("Closing the body of " + c0Var + " didn't close its backing stream. Bad interceptor?");
                }
            } catch (Throwable th) {
                this.f30651c.o(null);
                this.f30651c.k();
                throw th;
            }
        }
        this.f30651c.k();
        throw new IOException("Canceled");
    }

    public void b() {
        this.f30653e = true;
        k.g0.f.g gVar = this.f30651c;
        if (gVar != null) {
            gVar.b();
        }
    }

    public final k.a c(t tVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierO;
        k.g gVarC;
        if (tVar.m()) {
            SSLSocketFactory sSLSocketFactoryE = this.f30649a.E();
            hostnameVerifierO = this.f30649a.o();
            sSLSocketFactory = sSLSocketFactoryE;
            gVarC = this.f30649a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierO = null;
            gVarC = null;
        }
        return new k.a(tVar.l(), tVar.y(), this.f30649a.k(), this.f30649a.D(), sSLSocketFactory, hostnameVerifierO, gVarC, this.f30649a.z(), this.f30649a.y(), this.f30649a.w(), this.f30649a.g(), this.f30649a.A());
    }

    public final a0 d(c0 c0Var) throws ProtocolException {
        String strN;
        t tVarC;
        if (c0Var == null) {
            throw new IllegalStateException();
        }
        k.g0.f.c cVarD = this.f30651c.d();
        e0 e0VarA = cVarD != null ? cVarD.a() : null;
        int iL = c0Var.l();
        String strF = c0Var.t().f();
        if (iL == 307 || iL == 308) {
            if (!strF.equals("GET") && !strF.equals("HEAD")) {
                return null;
            }
        } else {
            if (iL == 401) {
                return this.f30649a.b().a(e0VarA, c0Var);
            }
            if (iL == 407) {
                if ((e0VarA != null ? e0VarA.b() : this.f30649a.y()).type() == Proxy.Type.HTTP) {
                    return this.f30649a.z().a(e0VarA, c0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iL == 408) {
                c0Var.t().a();
                return c0Var.t();
            }
            switch (iL) {
                case IjkMediaCodecInfo.RANK_SECURE /* 300 */:
                case Constants.BUCKET_REDIRECT_STATUS_CODE /* 301 */:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f30649a.m() || (strN = c0Var.n(HttpHeader.LOCATION)) == null || (tVarC = c0Var.t().h().C(strN)) == null) {
            return null;
        }
        if (!tVarC.D().equals(c0Var.t().h().D()) && !this.f30649a.n()) {
            return null;
        }
        a0.a aVarG = c0Var.t().g();
        if (f.b(strF)) {
            boolean zD = f.d(strF);
            if (f.c(strF)) {
                aVarG.g("GET", null);
            } else {
                aVarG.g(strF, zD ? c0Var.t().a() : null);
            }
            if (!zD) {
                aVarG.i("Transfer-Encoding");
                aVarG.i("Content-Length");
                aVarG.i("Content-Type");
            }
        }
        if (!h(c0Var, tVarC)) {
            aVarG.i("Authorization");
        }
        return aVarG.k(tVarC).b();
    }

    public boolean e() {
        return this.f30653e;
    }

    public final boolean f(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean g(IOException iOException, boolean z, a0 a0Var) {
        this.f30651c.o(iOException);
        if (!this.f30649a.C()) {
            return false;
        }
        if (z) {
            a0Var.a();
        }
        return f(iOException, z) && this.f30651c.h();
    }

    public final boolean h(c0 c0Var, t tVar) {
        t tVarH = c0Var.t().h();
        return tVarH.l().equals(tVar.l()) && tVarH.y() == tVar.y() && tVarH.D().equals(tVar.D());
    }

    public void i(Object obj) {
        this.f30652d = obj;
    }
}
