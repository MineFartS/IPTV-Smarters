package k.g0.l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f30881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f30882b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f30882b = method;
            this.f30881a = x509TrustManager;
        }

        @Override // k.g0.l.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f30882b.invoke(this.f30881a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30881a.equals(aVar.f30881a) && this.f30882b.equals(aVar.f30882b);
        }

        public int hashCode() {
            return this.f30881a.hashCode() + (this.f30882b.hashCode() * 31);
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<X500Principal, Set<X509Certificate>> f30883a = new LinkedHashMap();

        public b(X509Certificate... x509CertificateArr) {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                Set<X509Certificate> linkedHashSet = this.f30883a.get(subjectX500Principal);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>(1);
                    this.f30883a.put(subjectX500Principal, linkedHashSet);
                }
                linkedHashSet.add(x509Certificate);
            }
        }

        @Override // k.g0.l.e
        public X509Certificate a(X509Certificate x509Certificate) {
            Set<X509Certificate> set = this.f30883a.get(x509Certificate.getIssuerX500Principal());
            if (set == null) {
                return null;
            }
            for (X509Certificate x509Certificate2 : set) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).f30883a.equals(this.f30883a);
        }

        public int hashCode() {
            return this.f30883a.hashCode();
        }
    }

    public static e b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return c(x509TrustManager.getAcceptedIssuers());
        }
    }

    public static e c(X509Certificate... x509CertificateArr) {
        return new b(x509CertificateArr);
    }

    public abstract X509Certificate a(X509Certificate x509Certificate);
}
