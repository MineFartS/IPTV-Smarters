package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1077Uq implements InterfaceC04806d {
    public final /* synthetic */ C1079Us A00;

    public C1077Uq(C1079Us c1079Us) {
        this.A00 = c1079Us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws Exception {
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A06);
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : this.A00.A00.getBondedDevices()) {
            arrayList.add(new C1078Ur(bluetoothDevice));
        }
        return this.A00.A0E(arrayList);
    }
}
