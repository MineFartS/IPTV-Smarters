package c.k.a;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f18307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f18308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f18309d;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress, k kVar) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        if (kVar == null) {
            throw new NullPointerException("connectionConfiguration == null");
        }
        this.f18306a = aVar;
        this.f18307b = proxy;
        this.f18308c = inetSocketAddress;
        this.f18309d = kVar;
    }

    public a a() {
        return this.f18306a;
    }

    public Proxy b() {
        return this.f18307b;
    }

    public boolean c() {
        return this.f18306a.f18147e != null && this.f18307b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f18306a.equals(wVar.f18306a) && this.f18307b.equals(wVar.f18307b) && this.f18308c.equals(wVar.f18308c) && this.f18309d.equals(wVar.f18309d);
    }

    public int hashCode() {
        return ((((((527 + this.f18306a.hashCode()) * 31) + this.f18307b.hashCode()) * 31) + this.f18308c.hashCode()) * 31) + this.f18309d.hashCode();
    }
}
