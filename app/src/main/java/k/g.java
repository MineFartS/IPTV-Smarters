package k;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f30545a = new a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<b> f30546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final k.g0.l.b f30547c;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f30548a = new ArrayList();

        public g a() {
            return new g(new LinkedHashSet(this.f30548a), null);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f30550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f30551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l.f f30552d;

        public boolean a(String str) {
            if (!this.f30549a.startsWith("*.")) {
                return str.equals(this.f30550b);
            }
            int iIndexOf = str.indexOf(46) + 1;
            String str2 = this.f30550b;
            return str.regionMatches(false, iIndexOf, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f30549a.equals(bVar.f30549a) && this.f30551c.equals(bVar.f30551c) && this.f30552d.equals(bVar.f30552d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f30549a.hashCode()) * 31) + this.f30551c.hashCode()) * 31) + this.f30552d.hashCode();
        }

        public String toString() {
            return this.f30551c + this.f30552d.d();
        }
    }

    public g(Set<b> set, @Nullable k.g0.l.b bVar) {
        this.f30546b = set;
        this.f30547c = bVar;
    }

    public static String c(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + e((X509Certificate) certificate).d();
    }

    public static l.f d(X509Certificate x509Certificate) {
        return l.f.v(x509Certificate.getPublicKey().getEncoded()).y();
    }

    public static l.f e(X509Certificate x509Certificate) {
        return l.f.v(x509Certificate.getPublicKey().getEncoded()).z();
    }

    public void a(String str, List<Certificate> list) {
        List<b> listB = b(str);
        if (listB.isEmpty()) {
            return;
        }
        k.g0.l.b bVar = this.f30547c;
        if (bVar != null) {
            list = bVar.a(list, str);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            int size2 = listB.size();
            l.f fVarE = null;
            l.f fVarD = null;
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar2 = listB.get(i3);
                if (bVar2.f30551c.equals("sha256/")) {
                    if (fVarE == null) {
                        fVarE = e(x509Certificate);
                    }
                    if (bVar2.f30552d.equals(fVarE)) {
                        return;
                    }
                } else {
                    if (!bVar2.f30551c.equals("sha1/")) {
                        throw new AssertionError();
                    }
                    if (fVarD == null) {
                        fVarD = d(x509Certificate);
                    }
                    if (bVar2.f30552d.equals(fVarD)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i4);
            sb.append("\n    ");
            sb.append(c(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = listB.size();
        for (int i5 = 0; i5 < size4; i5++) {
            b bVar3 = listB.get(i5);
            sb.append("\n    ");
            sb.append(bVar3);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public List<b> b(String str) {
        List<b> listEmptyList = Collections.emptyList();
        for (b bVar : this.f30546b) {
            if (bVar.a(str)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                listEmptyList.add(bVar);
            }
        }
        return listEmptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (k.g0.c.k(this.f30547c, gVar.f30547c) && this.f30546b.equals(gVar.f30546b)) {
                return true;
            }
        }
        return false;
    }

    public g f(k.g0.l.b bVar) {
        return k.g0.c.k(this.f30547c, bVar) ? this : new g(this.f30546b, bVar);
    }

    public int hashCode() {
        k.g0.l.b bVar = this.f30547c;
        return ((bVar != null ? bVar.hashCode() : 0) * 31) + this.f30546b.hashCode();
    }
}
