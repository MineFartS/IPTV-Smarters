package c.k.a.y.l;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18623a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18624b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static boolean c(String str) {
        return f18624b.matcher(str).matches();
    }

    public final List<String> a(X509Certificate x509Certificate, int i2) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public boolean b(String str, X509Certificate x509Certificate) {
        return c(str) ? f(str, x509Certificate) : e(str, x509Certificate);
    }

    public boolean d(String str, String str2) {
        int i2;
        int length;
        int length2;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (lowerCase.startsWith("*.") && str.regionMatches(0, lowerCase, 2, lowerCase.length() - 2)) {
            return true;
        }
        int iIndexOf = lowerCase.indexOf(42);
        return iIndexOf <= lowerCase.indexOf(46) && str.regionMatches(0, lowerCase, 0, iIndexOf) && str.indexOf(46, iIndexOf) >= (length2 = str.length() - (length = lowerCase.length() - (i2 = iIndexOf + 1))) && str.regionMatches(length2, lowerCase, i2, length);
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        String strB;
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = a(x509Certificate, 2).iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (d(lowerCase, it.next())) {
                return true;
            }
            z = true;
        }
        if (z || (strB = new a(x509Certificate.getSubjectX500Principal()).b("cn")) == null) {
            return false;
        }
        return d(lowerCase, strB);
    }

    public final boolean f(String str, X509Certificate x509Certificate) {
        Iterator<String> it = a(x509Certificate, 7).iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
