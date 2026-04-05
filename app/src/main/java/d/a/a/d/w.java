package d.a.a.d;

import com.nst.iptvsmarterstvbox.R;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class w {
    public static SocketAddress a(d.a.a.a aVar) {
        try {
            Proxy proxyB = b(new URL(String.format("https://%s:%s", aVar.s0, aVar.t0)));
            if (proxyB == null) {
                return null;
            }
            SocketAddress socketAddressAddress = proxyB.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                return socketAddressAddress;
            }
        } catch (MalformedURLException e2) {
            z.o(R.string.getproxy_error, e2.getLocalizedMessage());
        } catch (URISyntaxException e3) {
            z.o(R.string.getproxy_error, e3.getLocalizedMessage());
        }
        return null;
    }

    public static Proxy b(URL url) {
        System.setProperty("java.net.useSystemProxies", "true");
        List<Proxy> listSelect = ProxySelector.getDefault().select(url.toURI());
        if (listSelect == null) {
            return null;
        }
        for (Proxy proxy : listSelect) {
            if (proxy.address() != null) {
                return proxy;
            }
        }
        return null;
    }
}
