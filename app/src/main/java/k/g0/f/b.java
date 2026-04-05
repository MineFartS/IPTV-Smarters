package k.g0.f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import k.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k> f30593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30594b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30596d;

    public b(List<k> list) {
        this.f30593a = list;
    }

    public k a(SSLSocket sSLSocket) throws UnknownServiceException {
        k kVar;
        int i2 = this.f30594b;
        int size = this.f30593a.size();
        while (true) {
            if (i2 >= size) {
                kVar = null;
                break;
            }
            kVar = this.f30593a.get(i2);
            i2++;
            if (kVar.c(sSLSocket)) {
                this.f30594b = i2;
                break;
            }
        }
        if (kVar != null) {
            this.f30595c = c(sSLSocket);
            k.g0.a.f30553a.c(kVar, sSLSocket, this.f30596d);
            return kVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f30596d + ", modes=" + this.f30593a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f30596d = true;
        if (!this.f30595c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException);
    }

    public final boolean c(SSLSocket sSLSocket) {
        for (int i2 = this.f30594b; i2 < this.f30593a.size(); i2++) {
            if (this.f30593a.get(i2).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
