package c.k.a;

import java.net.Proxy;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Proxy f18143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SocketFactory f18146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SSLSocketFactory f18147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HostnameVerifier f18148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f18149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f18150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<r> f18151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<k> f18152j;

    public a(String str, int i2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<r> list, List<k> list2) {
        if (str == null) {
            throw new NullPointerException("uriHost == null");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("uriPort <= 0: " + i2);
        }
        if (bVar == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        this.f18143a = proxy;
        this.f18144b = str;
        this.f18145c = i2;
        this.f18146d = socketFactory;
        this.f18147e = sSLSocketFactory;
        this.f18148f = hostnameVerifier;
        this.f18149g = fVar;
        this.f18150h = bVar;
        this.f18151i = c.k.a.y.h.l(list);
        this.f18152j = c.k.a.y.h.l(list2);
    }

    public List<k> a() {
        return this.f18152j;
    }

    public Proxy b() {
        return this.f18143a;
    }

    public String c() {
        return this.f18144b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return c.k.a.y.h.f(this.f18143a, aVar.f18143a) && this.f18144b.equals(aVar.f18144b) && this.f18145c == aVar.f18145c && c.k.a.y.h.f(this.f18147e, aVar.f18147e) && c.k.a.y.h.f(this.f18148f, aVar.f18148f) && c.k.a.y.h.f(this.f18149g, aVar.f18149g) && c.k.a.y.h.f(this.f18150h, aVar.f18150h) && c.k.a.y.h.f(this.f18151i, aVar.f18151i);
    }

    public int hashCode() {
        int iHashCode = (((527 + this.f18144b.hashCode()) * 31) + this.f18145c) * 31;
        SSLSocketFactory sSLSocketFactory = this.f18147e;
        int iHashCode2 = (iHashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f18148f;
        int iHashCode3 = (iHashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f18149g;
        int iHashCode4 = (((iHashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.f18150h.hashCode()) * 31;
        Proxy proxy = this.f18143a;
        return ((iHashCode4 + (proxy != null ? proxy.hashCode() : 0)) * 31) + this.f18151i.hashCode();
    }
}
