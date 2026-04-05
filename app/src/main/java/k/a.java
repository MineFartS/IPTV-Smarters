package k;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.t;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f30455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f30456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f30457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f30458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<y> f30459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<k> f30460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f30461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Proxy f30462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f30463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final HostnameVerifier f30464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final g f30465k;

    public a(String str, int i2, o oVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable g gVar, b bVar, @Nullable Proxy proxy, List<y> list, List<k> list2, ProxySelector proxySelector) {
        this.f30455a = new t.a().v(sSLSocketFactory != null ? ClientConstants.DOMAIN_SCHEME : "http").i(str).q(i2).c();
        if (oVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f30456b = oVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f30457c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f30458d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f30459e = k.g0.c.n(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f30460f = k.g0.c.n(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f30461g = proxySelector;
        this.f30462h = proxy;
        this.f30463i = sSLSocketFactory;
        this.f30464j = hostnameVerifier;
        this.f30465k = gVar;
    }

    @Nullable
    public g a() {
        return this.f30465k;
    }

    public List<k> b() {
        return this.f30460f;
    }

    public o c() {
        return this.f30456b;
    }

    public boolean d(a aVar) {
        return this.f30456b.equals(aVar.f30456b) && this.f30458d.equals(aVar.f30458d) && this.f30459e.equals(aVar.f30459e) && this.f30460f.equals(aVar.f30460f) && this.f30461g.equals(aVar.f30461g) && k.g0.c.k(this.f30462h, aVar.f30462h) && k.g0.c.k(this.f30463i, aVar.f30463i) && k.g0.c.k(this.f30464j, aVar.f30464j) && k.g0.c.k(this.f30465k, aVar.f30465k) && l().y() == aVar.l().y();
    }

    @Nullable
    public HostnameVerifier e() {
        return this.f30464j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f30455a.equals(aVar.f30455a) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public List<y> f() {
        return this.f30459e;
    }

    @Nullable
    public Proxy g() {
        return this.f30462h;
    }

    public b h() {
        return this.f30458d;
    }

    public int hashCode() {
        int iHashCode = (((((((((((527 + this.f30455a.hashCode()) * 31) + this.f30456b.hashCode()) * 31) + this.f30458d.hashCode()) * 31) + this.f30459e.hashCode()) * 31) + this.f30460f.hashCode()) * 31) + this.f30461g.hashCode()) * 31;
        Proxy proxy = this.f30462h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f30463i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f30464j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        g gVar = this.f30465k;
        return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public ProxySelector i() {
        return this.f30461g;
    }

    public SocketFactory j() {
        return this.f30457c;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.f30463i;
    }

    public t l() {
        return this.f30455a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f30455a.l());
        sb.append(":");
        sb.append(this.f30455a.y());
        if (this.f30462h != null) {
            sb.append(", proxy=");
            obj = this.f30462h;
        } else {
            sb.append(", proxySelector=");
            obj = this.f30461g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
