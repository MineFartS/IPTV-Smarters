package k.g0.l;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static b b(X509TrustManager x509TrustManager) {
        return k.g0.j.e.h().c(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);
}
