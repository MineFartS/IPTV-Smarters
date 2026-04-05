package c.k.a;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f18233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f18234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f18235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f18237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f18238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f18240h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f18242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f18243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18244d;

        public b(k kVar) {
            this.f18241a = kVar.f18236d;
            this.f18242b = kVar.f18237e;
            this.f18243c = kVar.f18238f;
            this.f18244d = kVar.f18239g;
        }

        public b(boolean z) {
            this.f18241a = z;
        }

        public k e() {
            return new k(this);
        }

        public b f(h... hVarArr) {
            if (!this.f18241a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[hVarArr.length];
            for (int i2 = 0; i2 < hVarArr.length; i2++) {
                strArr[i2] = hVarArr[i2].javaName;
            }
            return g(strArr);
        }

        public b g(String[] strArr) {
            this.f18242b = strArr;
            return this;
        }

        public b h(boolean z) {
            if (!this.f18241a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f18244d = z;
            return this;
        }

        public b i(x... xVarArr) {
            if (!this.f18241a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[xVarArr.length];
            for (int i2 = 0; i2 < xVarArr.length; i2++) {
                strArr[i2] = xVarArr[i2].javaName;
            }
            return j(strArr);
        }

        public b j(String... strArr) {
            this.f18243c = strArr;
            return this;
        }
    }

    static {
        b bVarF = new b(true).f(h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, h.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA, h.TLS_ECDHE_RSA_WITH_RC4_128_SHA, h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, h.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, h.TLS_RSA_WITH_AES_128_GCM_SHA256, h.TLS_RSA_WITH_AES_128_CBC_SHA, h.TLS_RSA_WITH_AES_256_CBC_SHA, h.TLS_RSA_WITH_3DES_EDE_CBC_SHA, h.TLS_RSA_WITH_RC4_128_SHA, h.TLS_RSA_WITH_RC4_128_MD5);
        x xVar = x.SSL_3_0;
        k kVarE = bVarF.i(x.TLS_1_2, x.TLS_1_1, x.TLS_1_0, xVar).h(true).e();
        f18233a = kVarE;
        f18234b = new b(kVarE).i(xVar).e();
        f18235c = new b(false).e();
    }

    public k(b bVar) {
        this.f18236d = bVar.f18241a;
        this.f18237e = bVar.f18242b;
        this.f18238f = bVar.f18243c;
        this.f18239g = bVar.f18244d;
    }

    public void c(SSLSocket sSLSocket, w wVar) {
        k kVarF = this.f18240h;
        if (kVarF == null) {
            kVarF = f(sSLSocket);
            this.f18240h = kVarF;
        }
        sSLSocket.setEnabledProtocols(kVarF.f18238f);
        sSLSocket.setEnabledCipherSuites(kVarF.f18237e);
        c.k.a.y.f fVarE = c.k.a.y.f.e();
        if (kVarF.f18239g) {
            c.k.a.a aVar = wVar.f18306a;
            fVarE.b(sSLSocket, aVar.f18144b, aVar.f18151i);
        }
    }

    public List<h> d() {
        h[] hVarArr = new h[this.f18237e.length];
        int i2 = 0;
        while (true) {
            String[] strArr = this.f18237e;
            if (i2 >= strArr.length) {
                return c.k.a.y.h.m(hVarArr);
            }
            hVarArr[i2] = h.forJavaName(strArr[i2]);
            i2++;
        }
    }

    public boolean e() {
        return this.f18236d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        boolean z = this.f18236d;
        if (z != kVar.f18236d) {
            return false;
        }
        if (z) {
            return Arrays.equals(this.f18237e, kVar.f18237e) && Arrays.equals(this.f18238f, kVar.f18238f) && this.f18239g == kVar.f18239g;
        }
        return true;
    }

    public final k f(SSLSocket sSLSocket) {
        List listO = c.k.a.y.h.o(Arrays.asList(this.f18237e), Arrays.asList(sSLSocket.getSupportedCipherSuites()));
        List listO2 = c.k.a.y.h.o(Arrays.asList(this.f18238f), Arrays.asList(sSLSocket.getSupportedProtocols()));
        return new b(this).g((String[]) listO.toArray(new String[listO.size()])).j((String[]) listO2.toArray(new String[listO2.size()])).e();
    }

    public boolean g() {
        return this.f18239g;
    }

    public List<x> h() {
        x[] xVarArr = new x[this.f18238f.length];
        int i2 = 0;
        while (true) {
            String[] strArr = this.f18238f;
            if (i2 >= strArr.length) {
                return c.k.a.y.h.m(xVarArr);
            }
            xVarArr[i2] = x.forJavaName(strArr[i2]);
            i2++;
        }
    }

    public int hashCode() {
        if (this.f18236d) {
            return ((((527 + Arrays.hashCode(this.f18237e)) * 31) + Arrays.hashCode(this.f18238f)) * 31) + (!this.f18239g ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f18236d) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + d() + ", tlsVersions=" + h() + ", supportsTlsExtensions=" + this.f18239g + ")";
    }
}
