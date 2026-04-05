package k;

import com.amazonaws.services.s3.internal.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.c0;
import k.e;
import k.p;
import k.s;

/* JADX INFO: loaded from: classes.dex */
public class x implements Cloneable, e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<y> f30996b = k.g0.c.o(y.HTTP_2, y.HTTP_1_1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<k> f30997c = k.g0.c.o(k.f30908b, k.f30910d);
    public final int A;
    public final int B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f30998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Proxy f30999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<y> f31000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<k> f31001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<u> f31002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<u> f31003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p.c f31004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ProxySelector f31005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f31006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final c f31007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final k.g0.e.d f31008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SocketFactory f31009o;

    @Nullable
    public final SSLSocketFactory p;

    @Nullable
    public final k.g0.l.b q;
    public final HostnameVerifier r;
    public final g s;
    public final k.b t;
    public final k.b u;
    public final j v;
    public final o w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends k.g0.a {
        @Override // k.g0.a
        public void a(s.a aVar, String str) {
            aVar.b(str);
        }

        @Override // k.g0.a
        public void b(s.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        @Override // k.g0.a
        public void c(k kVar, SSLSocket sSLSocket, boolean z) {
            kVar.a(sSLSocket, z);
        }

        @Override // k.g0.a
        public int d(c0.a aVar) {
            return aVar.f30501c;
        }

        @Override // k.g0.a
        public boolean e(j jVar, k.g0.f.c cVar) {
            return jVar.b(cVar);
        }

        @Override // k.g0.a
        public Socket f(j jVar, k.a aVar, k.g0.f.g gVar) {
            return jVar.c(aVar, gVar);
        }

        @Override // k.g0.a
        public boolean g(k.a aVar, k.a aVar2) {
            return aVar.d(aVar2);
        }

        @Override // k.g0.a
        public k.g0.f.c h(j jVar, k.a aVar, k.g0.f.g gVar, e0 e0Var) {
            return jVar.d(aVar, gVar, e0Var);
        }

        @Override // k.g0.a
        public void i(j jVar, k.g0.f.c cVar) {
            jVar.f(cVar);
        }

        @Override // k.g0.a
        public k.g0.f.d j(j jVar) {
            return jVar.f30904f;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f31010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Proxy f31011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<y> f31012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<k> f31013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<u> f31014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<u> f31015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p.c f31016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ProxySelector f31017h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public m f31018i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public k.g0.e.d f31019j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public SocketFactory f31020k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public SSLSocketFactory f31021l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public k.g0.l.b f31022m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public HostnameVerifier f31023n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public g f31024o;
        public k.b p;
        public k.b q;
        public j r;
        public o s;
        public boolean t;
        public boolean u;
        public boolean v;
        public int w;
        public int x;
        public int y;
        public int z;

        public b() {
            this.f31014e = new ArrayList();
            this.f31015f = new ArrayList();
            this.f31010a = new n();
            this.f31012c = x.f30996b;
            this.f31013d = x.f30997c;
            this.f31016g = p.a(p.f30941a);
            this.f31017h = ProxySelector.getDefault();
            this.f31018i = m.f30932a;
            this.f31020k = SocketFactory.getDefault();
            this.f31023n = k.g0.l.d.f30880a;
            this.f31024o = g.f30545a;
            k.b bVar = k.b.f30477a;
            this.p = bVar;
            this.q = bVar;
            this.r = new j();
            this.s = o.f30940a;
            this.t = true;
            this.u = true;
            this.v = true;
            this.w = Constants.MAXIMUM_UPLOAD_PARTS;
            this.x = Constants.MAXIMUM_UPLOAD_PARTS;
            this.y = Constants.MAXIMUM_UPLOAD_PARTS;
            this.z = 0;
        }

        public b(x xVar) {
            ArrayList arrayList = new ArrayList();
            this.f31014e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f31015f = arrayList2;
            this.f31010a = xVar.f30998d;
            this.f31011b = xVar.f30999e;
            this.f31012c = xVar.f31000f;
            this.f31013d = xVar.f31001g;
            arrayList.addAll(xVar.f31002h);
            arrayList2.addAll(xVar.f31003i);
            this.f31016g = xVar.f31004j;
            this.f31017h = xVar.f31005k;
            this.f31018i = xVar.f31006l;
            this.f31019j = xVar.f31008n;
            this.f31020k = xVar.f31009o;
            this.f31021l = xVar.p;
            this.f31022m = xVar.q;
            this.f31023n = xVar.r;
            this.f31024o = xVar.s;
            this.p = xVar.t;
            this.q = xVar.u;
            this.r = xVar.v;
            this.s = xVar.w;
            this.t = xVar.x;
            this.u = xVar.y;
            this.v = xVar.z;
            this.w = xVar.A;
            this.x = xVar.B;
            this.y = xVar.C;
            this.z = xVar.D;
        }

        public static int b(String str, long j2, TimeUnit timeUnit) {
            if (j2 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j2);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j2 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        public x a() {
            return new x(this);
        }

        public b c(long j2, TimeUnit timeUnit) {
            this.w = b("timeout", j2, timeUnit);
            return this;
        }

        public b d(boolean z) {
            this.u = z;
            return this;
        }

        public b e(long j2, TimeUnit timeUnit) {
            this.x = b("timeout", j2, timeUnit);
            return this;
        }

        public b f(boolean z) {
            this.v = z;
            return this;
        }

        public b g(long j2, TimeUnit timeUnit) {
            this.y = b("timeout", j2, timeUnit);
            return this;
        }
    }

    static {
        k.g0.a.f30553a = new a();
    }

    public x() {
        this(new b());
    }

    public x(b bVar) {
        boolean z;
        k.g0.l.b bVarB;
        this.f30998d = bVar.f31010a;
        this.f30999e = bVar.f31011b;
        this.f31000f = bVar.f31012c;
        List<k> list = bVar.f31013d;
        this.f31001g = list;
        this.f31002h = k.g0.c.n(bVar.f31014e);
        this.f31003i = k.g0.c.n(bVar.f31015f);
        this.f31004j = bVar.f31016g;
        this.f31005k = bVar.f31017h;
        this.f31006l = bVar.f31018i;
        this.f31008n = bVar.f31019j;
        this.f31009o = bVar.f31020k;
        Iterator<k> it = list.iterator();
        loop0: while (true) {
            while (it.hasNext()) {
                z = z || it.next().d();
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f31021l;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerG = G();
            this.p = F(x509TrustManagerG);
            bVarB = k.g0.l.b.b(x509TrustManagerG);
        } else {
            this.p = sSLSocketFactory;
            bVarB = bVar.f31022m;
        }
        this.q = bVarB;
        this.r = bVar.f31023n;
        this.s = bVar.f31024o.f(this.q);
        this.t = bVar.p;
        this.u = bVar.q;
        this.v = bVar.r;
        this.w = bVar.s;
        this.x = bVar.t;
        this.y = bVar.u;
        this.z = bVar.v;
        this.A = bVar.w;
        this.B = bVar.x;
        this.C = bVar.y;
        this.D = bVar.z;
    }

    public ProxySelector A() {
        return this.f31005k;
    }

    public int B() {
        return this.B;
    }

    public boolean C() {
        return this.z;
    }

    public SocketFactory D() {
        return this.f31009o;
    }

    public SSLSocketFactory E() {
        return this.p;
    }

    public final SSLSocketFactory F(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public final X509TrustManager G() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public int H() {
        return this.C;
    }

    @Override // k.e.a
    public e a(a0 a0Var) {
        return new z(this, a0Var, false);
    }

    public k.b b() {
        return this.u;
    }

    public g c() {
        return this.s;
    }

    public int e() {
        return this.A;
    }

    public j f() {
        return this.v;
    }

    public List<k> g() {
        return this.f31001g;
    }

    public m h() {
        return this.f31006l;
    }

    public n j() {
        return this.f30998d;
    }

    public o k() {
        return this.w;
    }

    public p.c l() {
        return this.f31004j;
    }

    public boolean m() {
        return this.y;
    }

    public boolean n() {
        return this.x;
    }

    public HostnameVerifier o() {
        return this.r;
    }

    public List<u> p() {
        return this.f31002h;
    }

    public k.g0.e.d q() {
        if (this.f31007m == null) {
            return this.f31008n;
        }
        throw null;
    }

    public List<u> r() {
        return this.f31003i;
    }

    public b u() {
        return new b(this);
    }

    public List<y> w() {
        return this.f31000f;
    }

    public Proxy y() {
        return this.f30999e;
    }

    public k.b z() {
        return this.t;
    }
}
