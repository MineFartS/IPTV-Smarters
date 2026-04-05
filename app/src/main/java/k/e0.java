package k;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f30543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f30544c;

    public e0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f30542a = aVar;
        this.f30543b = proxy;
        this.f30544c = inetSocketAddress;
    }

    public a a() {
        return this.f30542a;
    }

    public Proxy b() {
        return this.f30543b;
    }

    public boolean c() {
        return this.f30542a.f30463i != null && this.f30543b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f30544c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (e0Var.f30542a.equals(this.f30542a) && e0Var.f30543b.equals(this.f30543b) && e0Var.f30544c.equals(this.f30544c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f30542a.hashCode()) * 31) + this.f30543b.hashCode()) * 31) + this.f30544c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f30544c + "}";
    }
}
