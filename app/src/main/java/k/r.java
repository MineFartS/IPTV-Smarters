package k;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f30948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f30949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Certificate> f30950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Certificate> f30951d;

    public r(f0 f0Var, h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f30948a = f0Var;
        this.f30949b = hVar;
        this.f30950c = list;
        this.f30951d = list2;
    }

    public static r b(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        h hVarA = h.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        f0 f0VarForJavaName = f0.forJavaName(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listO = peerCertificates != null ? k.g0.c.o(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new r(f0VarForJavaName, hVarA, listO, localCertificates != null ? k.g0.c.o(localCertificates) : Collections.emptyList());
    }

    public h a() {
        return this.f30949b;
    }

    public List<Certificate> c() {
        return this.f30950c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f30948a.equals(rVar.f30948a) && this.f30949b.equals(rVar.f30949b) && this.f30950c.equals(rVar.f30950c) && this.f30951d.equals(rVar.f30951d);
    }

    public int hashCode() {
        return ((((((527 + this.f30948a.hashCode()) * 31) + this.f30949b.hashCode()) * 31) + this.f30950c.hashCode()) * 31) + this.f30951d.hashCode();
    }
}
