package d.a.a.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import de.blinkt.openvpn.core.NativeUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    public static Vector<String> a(Context context, boolean z) {
        Vector<String> vector = new Vector<>();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 21) {
            for (Network network : connectivityManager.getAllNetworks()) {
                connectivityManager.getNetworkInfo(network);
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (!networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(0)) {
                    for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                        if (((linkAddress.getAddress() instanceof Inet4Address) && !z) || ((linkAddress.getAddress() instanceof Inet6Address) && z)) {
                            vector.add(linkAddress.toString());
                        }
                    }
                }
            }
        } else {
            if (z) {
                return vector;
            }
            String[] ifconfig = NativeUtils.getIfconfig();
            for (int i2 = 0; i2 < ifconfig.length; i2 += 3) {
                String str = ifconfig[i2];
                String str2 = ifconfig[i2 + 1];
                String str3 = ifconfig[i2 + 2];
                if (str != null && !str.equals("lo") && !str.startsWith("tun") && !str.startsWith("rmnet")) {
                    if (str2 == null || str3 == null) {
                        z.p("Local routes are broken?! (Report to author) " + TextUtils.join("|", ifconfig));
                    } else {
                        vector.add(str2 + "/" + b.a(str3));
                    }
                }
            }
        }
        return vector;
    }
}
