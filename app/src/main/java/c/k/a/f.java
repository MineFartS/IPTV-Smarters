package c.k.a;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f18210a = new b().b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<l.f>> f18211b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<l.f>> f18212a = new LinkedHashMap();

        public f b() {
            return new f(this);
        }
    }

    public f(b bVar) {
        this.f18211b = c.k.a.y.h.n(bVar.f18212a);
    }

    public static l.f b(X509Certificate x509Certificate) {
        return c.k.a.y.h.p(l.f.v(x509Certificate.getPublicKey().getEncoded()));
    }

    public void a(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        List<l.f> list = this.f18211b.get(str);
        if (list == null) {
            return;
        }
        for (Certificate certificate : certificateArr) {
            if (list.contains(b((X509Certificate) certificate))) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (Certificate certificate2 : certificateArr) {
            X509Certificate x509Certificate = (X509Certificate) certificate2;
            sb.append("\n    sha1/");
            sb.append(b(x509Certificate).d());
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (l.f fVar : list) {
            sb.append("\n    sha1/");
            sb.append(fVar.d());
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
