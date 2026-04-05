package c.k.a;

import c.k.a.o;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class q implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<r> f18255b = c.k.a.y.h.m(r.HTTP_2, r.SPDY_3, r.HTTP_1_1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<k> f18256c = c.k.a.y.h.m(k.f18233a, k.f18234b, k.f18235c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SSLSocketFactory f18257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.k.a.y.g f18258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f18259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Proxy f18260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<r> f18261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<k> f18262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProxySelector f18263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CookieHandler f18264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.k.a.y.c f18265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f18266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SocketFactory f18267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f18268o;
    public HostnameVerifier p;
    public f q;
    public b r;
    public j s;
    public c.k.a.y.e t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public int y;

    public static class a extends c.k.a.y.b {
        @Override // c.k.a.y.b
        public void a(o.b bVar, String str) {
            bVar.d(str);
        }

        @Override // c.k.a.y.b
        public boolean b(i iVar) {
            return iVar.a();
        }

        @Override // c.k.a.y.b
        public void c(q qVar, i iVar, c.k.a.y.j.g gVar, s sVar) throws IOException {
            iVar.c(qVar, gVar, sVar);
        }

        @Override // c.k.a.y.b
        public c.k.a.y.c d(q qVar) {
            return qVar.B();
        }

        @Override // c.k.a.y.b
        public boolean e(i iVar) {
            return iVar.n();
        }

        @Override // c.k.a.y.b
        public c.k.a.y.e f(q qVar) {
            return qVar.t;
        }

        @Override // c.k.a.y.b
        public c.k.a.y.j.p g(i iVar, c.k.a.y.j.g gVar) {
            return iVar.q(gVar);
        }

        @Override // c.k.a.y.b
        public void h(j jVar, i iVar) {
            jVar.f(iVar);
        }

        @Override // c.k.a.y.b
        public int i(i iVar) {
            return iVar.r();
        }

        @Override // c.k.a.y.b
        public c.k.a.y.g j(q qVar) {
            return qVar.D();
        }

        @Override // c.k.a.y.b
        public void k(i iVar, c.k.a.y.j.g gVar) {
            iVar.t(gVar);
        }

        @Override // c.k.a.y.b
        public void l(i iVar, r rVar) {
            iVar.u(rVar);
        }
    }

    static {
        c.k.a.y.b.f18345b = new a();
    }

    public q() {
        this.u = true;
        this.v = true;
        this.f18258e = new c.k.a.y.g();
        this.f18259f = new m();
    }

    public q(q qVar) {
        this.u = true;
        this.v = true;
        this.f18258e = qVar.f18258e;
        this.f18259f = qVar.f18259f;
        this.f18260g = qVar.f18260g;
        this.f18261h = qVar.f18261h;
        this.f18262i = qVar.f18262i;
        this.f18263j = qVar.f18263j;
        this.f18264k = qVar.f18264k;
        c cVar = qVar.f18266m;
        this.f18266m = cVar;
        this.f18265l = cVar != null ? cVar.f18153a : qVar.f18265l;
        this.f18267n = qVar.f18267n;
        this.f18268o = qVar.f18268o;
        this.p = qVar.p;
        this.q = qVar.q;
        this.r = qVar.r;
        this.s = qVar.s;
        this.t = qVar.t;
        this.u = qVar.u;
        this.v = qVar.v;
        this.w = qVar.w;
        this.x = qVar.x;
        this.y = qVar.y;
    }

    public final int A() {
        return this.y;
    }

    public final c.k.a.y.c B() {
        return this.f18265l;
    }

    public e C(s sVar) {
        return new e(this, sVar);
    }

    public final c.k.a.y.g D() {
        return this.f18258e;
    }

    public final q E(c cVar) {
        this.f18266m = cVar;
        this.f18265l = null;
        return this;
    }

    public final void F(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.w = (int) millis;
    }

    public final void G(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.x = (int) millis;
    }

    public final void H(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Timeout too large.");
        }
        this.y = (int) millis;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q clone() {
        try {
            return (q) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final q c() {
        q qVar = new q(this);
        if (qVar.f18263j == null) {
            qVar.f18263j = ProxySelector.getDefault();
        }
        if (qVar.f18264k == null) {
            qVar.f18264k = CookieHandler.getDefault();
        }
        if (qVar.f18267n == null) {
            qVar.f18267n = SocketFactory.getDefault();
        }
        if (qVar.f18268o == null) {
            qVar.f18268o = l();
        }
        if (qVar.p == null) {
            qVar.p = c.k.a.y.l.b.f18623a;
        }
        if (qVar.q == null) {
            qVar.q = f.f18210a;
        }
        if (qVar.r == null) {
            qVar.r = c.k.a.y.j.a.f18370a;
        }
        if (qVar.s == null) {
            qVar.s = j.e();
        }
        if (qVar.f18261h == null) {
            qVar.f18261h = f18255b;
        }
        if (qVar.f18262i == null) {
            qVar.f18262i = f18256c;
        }
        if (qVar.t == null) {
            qVar.t = c.k.a.y.e.f18347a;
        }
        return qVar;
    }

    public final b e() {
        return this.r;
    }

    public final f f() {
        return this.q;
    }

    public final int g() {
        return this.w;
    }

    public final j h() {
        return this.s;
    }

    public final List<k> j() {
        return this.f18262i;
    }

    public final CookieHandler k() {
        return this.f18264k;
    }

    public final synchronized SSLSocketFactory l() {
        if (f18257d == null) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                f18257d = sSLContext.getSocketFactory();
            } catch (GeneralSecurityException unused) {
                throw new AssertionError();
            }
        }
        return f18257d;
    }

    public final m m() {
        return this.f18259f;
    }

    public final boolean n() {
        return this.v;
    }

    public final boolean o() {
        return this.u;
    }

    public final HostnameVerifier p() {
        return this.p;
    }

    public final List<r> q() {
        return this.f18261h;
    }

    public final Proxy r() {
        return this.f18260g;
    }

    public final ProxySelector u() {
        return this.f18263j;
    }

    public final int w() {
        return this.x;
    }

    public final SocketFactory y() {
        return this.f18267n;
    }

    public final SSLSocketFactory z() {
        return this.f18268o;
    }
}
