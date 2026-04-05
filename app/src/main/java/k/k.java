package k;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h[] f30907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f30908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f30909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f30910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f30911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f30912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String[] f30913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String[] f30914h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String[] f30916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String[] f30917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f30918d;

        public a(k kVar) {
            this.f30915a = kVar.f30911e;
            this.f30916b = kVar.f30913g;
            this.f30917c = kVar.f30914h;
            this.f30918d = kVar.f30912f;
        }

        public a(boolean z) {
            this.f30915a = z;
        }

        public k a() {
            return new k(this);
        }

        public a b(String... strArr) {
            if (!this.f30915a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f30916b = (String[]) strArr.clone();
            return this;
        }

        public a c(h... hVarArr) {
            if (!this.f30915a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[hVarArr.length];
            for (int i2 = 0; i2 < hVarArr.length; i2++) {
                strArr[i2] = hVarArr[i2].k1;
            }
            return b(strArr);
        }

        public a d(boolean z) {
            if (!this.f30915a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f30918d = z;
            return this;
        }

        public a e(String... strArr) {
            if (!this.f30915a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f30917c = (String[]) strArr.clone();
            return this;
        }

        public a f(f0... f0VarArr) {
            if (!this.f30915a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[f0VarArr.length];
            for (int i2 = 0; i2 < f0VarArr.length; i2++) {
                strArr[i2] = f0VarArr[i2].javaName;
            }
            return e(strArr);
        }
    }

    static {
        h[] hVarArr = {h.Y0, h.c1, h.Z0, h.d1, h.j1, h.i1, h.z0, h.J0, h.A0, h.K0, h.h0, h.i0, h.F, h.J, h.f30893j};
        f30907a = hVarArr;
        a aVarC = new a(true).c(hVarArr);
        f0 f0Var = f0.TLS_1_0;
        k kVarA = aVarC.f(f0.TLS_1_3, f0.TLS_1_2, f0.TLS_1_1, f0Var).d(true).a();
        f30908b = kVarA;
        f30909c = new a(kVarA).f(f0Var).d(true).a();
        f30910d = new a(false).a();
    }

    public k(a aVar) {
        this.f30911e = aVar.f30915a;
        this.f30913g = aVar.f30916b;
        this.f30914h = aVar.f30917c;
        this.f30912f = aVar.f30918d;
    }

    public void a(SSLSocket sSLSocket, boolean z) {
        k kVarE = e(sSLSocket, z);
        String[] strArr = kVarE.f30914h;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = kVarE.f30913g;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<h> b() {
        String[] strArr = this.f30913g;
        if (strArr != null) {
            return h.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f30911e) {
            return false;
        }
        String[] strArr = this.f30914h;
        if (strArr != null && !k.g0.c.t(k.g0.c.p, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f30913g;
        return strArr2 == null || k.g0.c.t(h.f30884a, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean d() {
        return this.f30911e;
    }

    public final k e(SSLSocket sSLSocket, boolean z) {
        String[] strArrR = this.f30913g != null ? k.g0.c.r(h.f30884a, sSLSocket.getEnabledCipherSuites(), this.f30913g) : sSLSocket.getEnabledCipherSuites();
        String[] strArrR2 = this.f30914h != null ? k.g0.c.r(k.g0.c.p, sSLSocket.getEnabledProtocols(), this.f30914h) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iP = k.g0.c.p(h.f30884a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iP != -1) {
            strArrR = k.g0.c.e(strArrR, supportedCipherSuites[iP]);
        }
        return new a(this).b(strArrR).e(strArrR2).a();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        boolean z = this.f30911e;
        if (z != kVar.f30911e) {
            return false;
        }
        return !z || (Arrays.equals(this.f30913g, kVar.f30913g) && Arrays.equals(this.f30914h, kVar.f30914h) && this.f30912f == kVar.f30912f);
    }

    public boolean f() {
        return this.f30912f;
    }

    @Nullable
    public List<f0> g() {
        String[] strArr = this.f30914h;
        if (strArr != null) {
            return f0.forJavaNames(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f30911e) {
            return ((((527 + Arrays.hashCode(this.f30913g)) * 31) + Arrays.hashCode(this.f30914h)) * 31) + (!this.f30912f ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f30911e) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f30913g != null ? b().toString() : "[all enabled]") + ", tlsVersions=" + (this.f30914h != null ? g().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f30912f + ")";
    }
}
