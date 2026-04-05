package k.g0.f;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import k.e0;
import k.t;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f30614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f30615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Proxy f30616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InetSocketAddress f30617d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30619f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30621h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Proxy> f30618e = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<InetSocketAddress> f30620g = Collections.emptyList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<e0> f30622i = new ArrayList();

    public f(k.a aVar, d dVar) {
        this.f30614a = aVar;
        this.f30615b = dVar;
        l(aVar.l(), aVar.g());
    }

    public static String b(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    public void a(e0 e0Var, IOException iOException) {
        if (e0Var.b().type() != Proxy.Type.DIRECT && this.f30614a.i() != null) {
            this.f30614a.i().connectFailed(this.f30614a.l().E(), e0Var.b().address(), iOException);
        }
        this.f30615b.b(e0Var);
    }

    public boolean c() {
        return d() || f() || e();
    }

    public final boolean d() {
        return this.f30621h < this.f30620g.size();
    }

    public final boolean e() {
        return !this.f30622i.isEmpty();
    }

    public final boolean f() {
        return this.f30619f < this.f30618e.size();
    }

    public e0 g() {
        if (!d()) {
            if (!f()) {
                if (e()) {
                    return i();
                }
                throw new NoSuchElementException();
            }
            this.f30616c = j();
        }
        InetSocketAddress inetSocketAddressH = h();
        this.f30617d = inetSocketAddressH;
        e0 e0Var = new e0(this.f30614a, this.f30616c, inetSocketAddressH);
        if (!this.f30615b.c(e0Var)) {
            return e0Var;
        }
        this.f30622i.add(e0Var);
        return g();
    }

    public final InetSocketAddress h() throws SocketException {
        if (d()) {
            List<InetSocketAddress> list = this.f30620g;
            int i2 = this.f30621h;
            this.f30621h = i2 + 1;
            return list.get(i2);
        }
        throw new SocketException("No route to " + this.f30614a.l().l() + "; exhausted inet socket addresses: " + this.f30620g);
    }

    public final e0 i() {
        return this.f30622i.remove(0);
    }

    public final Proxy j() throws SocketException, UnknownHostException {
        if (f()) {
            List<Proxy> list = this.f30618e;
            int i2 = this.f30619f;
            this.f30619f = i2 + 1;
            Proxy proxy = list.get(i2);
            k(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f30614a.l().l() + "; exhausted proxy configurations: " + this.f30618e);
    }

    public final void k(Proxy proxy) throws SocketException, UnknownHostException {
        String strL;
        int iY;
        this.f30620g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strL = this.f30614a.l().l();
            iY = this.f30614a.l().y();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strL = b(inetSocketAddress);
            iY = inetSocketAddress.getPort();
        }
        if (iY < 1 || iY > 65535) {
            throw new SocketException("No route to " + strL + ":" + iY + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f30620g.add(InetSocketAddress.createUnresolved(strL, iY));
        } else {
            List<InetAddress> listA = this.f30614a.c().a(strL);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f30614a.c() + " returned no addresses for " + strL);
            }
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f30620g.add(new InetSocketAddress(listA.get(i2), iY));
            }
        }
        this.f30621h = 0;
    }

    public final void l(t tVar, Proxy proxy) {
        List<Proxy> listO;
        if (proxy != null) {
            listO = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f30614a.i().select(tVar.E());
            listO = (listSelect == null || listSelect.isEmpty()) ? k.g0.c.o(Proxy.NO_PROXY) : k.g0.c.n(listSelect);
        }
        this.f30618e = listO;
        this.f30619f = 0;
    }
}
