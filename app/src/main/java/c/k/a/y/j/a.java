package c.k.a.y.j;

import c.k.a.s;
import c.k.a.u;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c.k.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.k.a.b f18370a = new a();

    @Override // c.k.a.b
    public s a(Proxy proxy, u uVar) {
        List<c.k.a.g> listN = uVar.n();
        s sVarY = uVar.y();
        URL urlP = sVarY.p();
        int size = listN.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.k.a.g gVar = listN.get(i2);
            if ("Basic".equalsIgnoreCase(gVar.b())) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), c(proxy, urlP), inetSocketAddress.getPort(), urlP.getProtocol(), gVar.a(), gVar.b(), urlP, Authenticator.RequestorType.PROXY);
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    return sVarY.n().j("Proxy-Authorization", c.k.a.l.a(passwordAuthenticationRequestPasswordAuthentication.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()))).h();
                }
            }
        }
        return null;
    }

    @Override // c.k.a.b
    public s b(Proxy proxy, u uVar) {
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        List<c.k.a.g> listN = uVar.n();
        s sVarY = uVar.y();
        URL urlP = sVarY.p();
        int size = listN.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.k.a.g gVar = listN.get(i2);
            if ("Basic".equalsIgnoreCase(gVar.b()) && (passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(urlP.getHost(), c(proxy, urlP), urlP.getPort(), urlP.getProtocol(), gVar.a(), gVar.b(), urlP, Authenticator.RequestorType.SERVER)) != null) {
                return sVarY.n().j("Authorization", c.k.a.l.a(passwordAuthenticationRequestPasswordAuthentication.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()))).h();
            }
        }
        return null;
    }

    public final InetAddress c(Proxy proxy, URL url) {
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? InetAddress.getByName(url.getHost()) : ((InetSocketAddress) proxy.address()).getAddress();
    }
}
