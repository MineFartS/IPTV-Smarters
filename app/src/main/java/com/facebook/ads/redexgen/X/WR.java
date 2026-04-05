package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WR implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ WZ A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"YvgwWocx1FADdeAzbpsmJqKucTKVrLw8", "IN5yo6alVzQxSBDS0LSAMVLc9G2MRZFn", "HAZTu6IPNZsD1qj0M1i9utr9DJx5S0QZ", "N5cGJfQ0ESKW2WKzc5hPaTPWXOaKWBwf", "tNMXMhxZjOCLmtsXwerOChNpJkA4NIz8", "qe3nCZLHllYVPimtyVQbZz0eRg0vYsPF", "hksQgw", "nUQ4NN4k5WyfvhfMBfttwidjpDAXB5K7"};
    }

    public WR(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            WZ wz = this.A00;
            return wz.A05(wz.A00.getVoiceNetworkType());
        }
        WZ wz2 = this.A00;
        TelephonyManager telephonyManager = wz2.A00;
        if (A01[2].charAt(0) == 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
        strArr[1] = "ynGeEoYIomGmDWEGPoJ89qRpE67tUZnz";
        return wz2.A05(telephonyManager.getNetworkType());
    }
}
