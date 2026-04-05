package c.f.a.c.k.b;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class ga extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f13923a;

    public ga(SSLSocketFactory sSLSocketFactory) {
        this.f13923a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new fa(this, (SSLSocket) this.f13923a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        return new fa(this, (SSLSocket) this.f13923a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return new fa(this, (SSLSocket) this.f13923a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return new fa(this, (SSLSocket) this.f13923a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return new fa(this, (SSLSocket) this.f13923a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return new fa(this, (SSLSocket) this.f13923a.createSocket(socket, str, i2, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f13923a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f13923a.getSupportedCipherSuites();
    }
}
