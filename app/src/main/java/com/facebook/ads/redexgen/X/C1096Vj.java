package com.facebook.ads.redexgen.X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1096Vj implements InterfaceC04806d {
    public final /* synthetic */ C1098Vl A00;

    public C1096Vj(C1098Vl c1098Vl) {
        this.A00 = c1098Vl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws Exception {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap map = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
            map.put(networkInterfaceNextElement.getDisplayName(), new C1097Vk(networkInterfaceNextElement.getInetAddresses(), null));
        }
        return this.A00.A02(map);
    }
}
