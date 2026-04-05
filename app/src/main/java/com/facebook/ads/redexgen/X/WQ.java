package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WQ implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ WZ A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"fhgAKr3d26sPe206xi", "SjffeijJA1Vv6PcXWUgct", "EsQusZwl1jUwipz2lU1dtOeOynoqp4qu", "0VpWGFYwNM1shdn7oayU", "oGsU7X9gn8B3aKKKnK6Um4C", "3PuUzv37NfYax6hYz8jf", "w27NqvUy0J9VzwNZKDXUsnO8qh2oDxhJ", "FZXbTPmbge4RvKyxAzubgHD8Txvy8Otv"};
    }

    public WQ(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null) {
            AbstractC04956s abstractC04956sA08 = this.A00.A08(EnumC04916o.A07);
            if (A01[6].charAt(19) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "mdGsZgeczhjsROxHbS4UhtOI0ggMdB2A";
            strArr[6] = "mdGsZgeczhjsROxHbS4UhtOI0ggMdB2A";
            return abstractC04956sA08;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            WZ wz = this.A00;
            TelephonyManager telephonyManager = wz.A00;
            String[] strArr2 = A01;
            if (strArr2[3].length() != strArr2[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[1] = "gYbGBXsMnQLVbPxH35aVX";
            strArr3[4] = "c9uQZVFrEkdSbUXAtWNBNx9";
            return wz.A05(telephonyManager.getDataNetworkType());
        }
        WZ wz2 = this.A00;
        String[] strArr4 = A01;
        if (strArr4[2].length() != strArr4[0].length()) {
            String[] strArr5 = A01;
            strArr5[6] = "dEMR1C0fCLJEsmN6YStUhJGVUagFQ5EF";
            strArr5[6] = "dEMR1C0fCLJEsmN6YStUhJGVUagFQ5EF";
            return wz2.A05(wz2.A00.getNetworkType());
        }
        String[] strArr6 = A01;
        strArr6[7] = "IeVVB4pQAR4pX23W54Z95CGRKG6wHZI8";
        strArr6[7] = "IeVVB4pQAR4pX23W54Z95CGRKG6wHZI8";
        return wz2.A05(wz2.A00.getNetworkType());
    }
}
