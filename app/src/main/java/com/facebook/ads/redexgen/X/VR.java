package com.facebook.ads.redexgen.X;

import android.provider.Settings;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VR implements InterfaceC04806d {
    public static byte[] A01;
    public final /* synthetic */ VS A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-77, -93, -78, -91, -91, -82, -97, -94, -78, -87, -89, -88, -76, -82, -91, -77, -77};
    }

    public VR(VS vs) {
        this.A00 = vs;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A04(Settings.System.getInt(r4.A00, A00(0, 17, 62), -1) / 255.0f);
    }
}
