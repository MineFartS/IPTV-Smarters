package c.k.a.y.j;

import c.k.a.q;
import c.k.a.s;
import c.k.a.w;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.k.a.a f18442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URI f18443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.k.a.y.e f18444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f18445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProxySelector f18446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.k.a.j f18447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.k.a.y.g f18448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f18449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Proxy f18450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InetSocketAddress f18451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.k.a.k f18452k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18454m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18456o;
    public int q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<Proxy> f18453l = Collections.emptyList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<InetSocketAddress> f18455n = Collections.emptyList();
    public List<c.k.a.k> p = Collections.emptyList();
    public final List<w> r = new ArrayList();

    public m(c.k.a.a aVar, URI uri, q qVar, s sVar) {
        this.f18442a = aVar;
        this.f18443b = uri;
        this.f18445d = qVar;
        this.f18446e = qVar.u();
        this.f18447f = qVar.h();
        this.f18448g = c.k.a.y.b.f18345b.j(qVar);
        this.f18444c = c.k.a.y.b.f18345b.f(qVar);
        this.f18449h = sVar;
        p(uri, aVar.b());
    }

    public static m b(s sVar, q qVar) throws UnknownHostException {
        SSLSocketFactory sSLSocketFactoryZ;
        HostnameVerifier hostnameVerifierP;
        c.k.a.f fVarF;
        String host = sVar.p().getHost();
        if (host == null || host.length() == 0) {
            throw new UnknownHostException(sVar.p().toString());
        }
        if (sVar.l()) {
            sSLSocketFactoryZ = qVar.z();
            hostnameVerifierP = qVar.p();
            fVarF = qVar.f();
        } else {
            sSLSocketFactoryZ = null;
            hostnameVerifierP = null;
            fVarF = null;
        }
        return new m(new c.k.a.a(host, c.k.a.y.h.j(sVar.p()), qVar.y(), sSLSocketFactoryZ, hostnameVerifierP, fVarF, qVar.e(), qVar.r(), qVar.q(), qVar.j()), sVar.o(), qVar, sVar);
    }

    public void a(c.k.a.i iVar, IOException iOException) {
        ProxySelector proxySelector;
        if (c.k.a.y.b.f18345b.i(iVar) > 0) {
            return;
        }
        w wVarG = iVar.g();
        if (wVarG.b().type() != Proxy.Type.DIRECT && (proxySelector = this.f18446e) != null) {
            proxySelector.connectFailed(this.f18443b, wVarG.b().address(), iOException);
        }
        this.f18448g.b(wVarG);
        if ((iOException instanceof SSLHandshakeException) || (iOException instanceof SSLProtocolException)) {
            return;
        }
        while (this.q < this.p.size()) {
            c.k.a.a aVar = this.f18442a;
            Proxy proxy = this.f18450i;
            InetSocketAddress inetSocketAddress = this.f18451j;
            List<c.k.a.k> list = this.p;
            int i2 = this.q;
            this.q = i2 + 1;
            this.f18448g.b(new w(aVar, proxy, inetSocketAddress, list.get(i2)));
        }
    }

    public boolean c() {
        return d() || e() || g() || f();
    }

    public final boolean d() {
        return this.q < this.p.size();
    }

    public final boolean e() {
        return this.f18456o < this.f18455n.size();
    }

    public final boolean f() {
        return !this.r.isEmpty();
    }

    public final boolean g() {
        return this.f18454m < this.f18453l.size();
    }

    public c.k.a.i h(g gVar) {
        c.k.a.i iVarM = m();
        c.k.a.y.b.f18345b.c(this.f18445d, iVarM, gVar, this.f18449h);
        return iVarM;
    }

    public final c.k.a.k i() throws SocketException {
        if (d()) {
            List<c.k.a.k> list = this.p;
            int i2 = this.q;
            this.q = i2 + 1;
            return list.get(i2);
        }
        throw new SocketException("No route to " + this.f18442a.c() + "; exhausted connection specs: " + this.p);
    }

    public final InetSocketAddress j() throws SocketException {
        if (e()) {
            List<InetSocketAddress> list = this.f18455n;
            int i2 = this.f18456o;
            this.f18456o = i2 + 1;
            InetSocketAddress inetSocketAddress = list.get(i2);
            n();
            return inetSocketAddress;
        }
        throw new SocketException("No route to " + this.f18442a.c() + "; exhausted inet socket addresses: " + this.f18455n);
    }

    public final w k() {
        return this.r.remove(0);
    }

    public final Proxy l() throws SocketException {
        if (g()) {
            List<Proxy> list = this.f18453l;
            int i2 = this.f18454m;
            this.f18454m = i2 + 1;
            Proxy proxy = list.get(i2);
            o(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f18442a.c() + "; exhausted proxy configurations: " + this.f18453l);
    }

    public c.k.a.i m() throws IOException {
        c.k.a.i iVarD;
        while (true) {
            iVarD = this.f18447f.d(this.f18442a);
            if (iVarD == null) {
                if (!d()) {
                    if (!e()) {
                        if (!g()) {
                            if (f()) {
                                return new c.k.a.i(this.f18447f, k());
                            }
                            throw new NoSuchElementException();
                        }
                        this.f18450i = l();
                    }
                    this.f18451j = j();
                }
                c.k.a.k kVarI = i();
                this.f18452k = kVarI;
                w wVar = new w(this.f18442a, this.f18450i, this.f18451j, kVarI);
                if (!this.f18448g.c(wVar)) {
                    return new c.k.a.i(this.f18447f, wVar);
                }
                this.r.add(wVar);
                return m();
            }
            if (this.f18449h.m().equals("GET") || c.k.a.y.b.f18345b.e(iVarD)) {
                break;
            }
            iVarD.h().close();
        }
        return iVarD;
    }

    public final void n() {
        this.p = new ArrayList();
        for (c.k.a.k kVar : this.f18442a.a()) {
            if (this.f18449h.l() == kVar.e()) {
                this.p.add(kVar);
            }
        }
        this.q = 0;
    }

    public final void o(Proxy proxy) {
        int port;
        String strC;
        this.f18455n = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT) {
            strC = this.f18442a.c();
            port = c.k.a.y.h.i(this.f18443b);
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            String hostName = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
            strC = hostName;
        }
        for (InetAddress inetAddress : this.f18444c.a(strC)) {
            this.f18455n.add(new InetSocketAddress(inetAddress, port));
        }
        this.f18456o = 0;
    }

    public final void p(URI uri, Proxy proxy) {
        if (proxy != null) {
            this.f18453l = Collections.singletonList(proxy);
        } else {
            this.f18453l = new ArrayList();
            List<Proxy> listSelect = this.f18446e.select(uri);
            if (listSelect != null) {
                this.f18453l.addAll(listSelect);
            }
            this.f18453l.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f18453l.add(Proxy.NO_PROXY);
        }
        this.f18454m = 0;
    }
}
