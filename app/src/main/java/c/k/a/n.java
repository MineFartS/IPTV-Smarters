package c.k.a;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Certificate> f18251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Certificate> f18252c;

    public n(String str, List<Certificate> list, List<Certificate> list2) {
        this.f18250a = str;
        this.f18251b = list;
        this.f18252c = list2;
    }

    public static n b(String str, List<Certificate> list, List<Certificate> list2) {
        if (str != null) {
            return new n(str, c.k.a.y.h.l(list), c.k.a.y.h.l(list2));
        }
        throw new IllegalArgumentException("cipherSuite == null");
    }

    public static n c(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM = peerCertificates != null ? c.k.a.y.h.m(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new n(cipherSuite, listM, localCertificates != null ? c.k.a.y.h.m(localCertificates) : Collections.emptyList());
    }

    public String a() {
        return this.f18250a;
    }

    public List<Certificate> d() {
        return this.f18252c;
    }

    public List<Certificate> e() {
        return this.f18251b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f18250a.equals(nVar.f18250a) && this.f18251b.equals(nVar.f18251b) && this.f18252c.equals(nVar.f18252c);
    }

    public int hashCode() {
        return ((((527 + this.f18250a.hashCode()) * 31) + this.f18251b.hashCode()) * 31) + this.f18252c.hashCode();
    }
}
