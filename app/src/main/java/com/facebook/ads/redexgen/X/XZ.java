package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XZ implements C0T {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C8C A00;
    public final /* synthetic */ C1140Xb A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[1].length() == 17) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "QX0n3XV94OfUIkrY3aQ1mnz4DOZRMjum";
            strArr[3] = "ub6cBxCWynk8j8mrWTDov9XVsshwREvV";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 10);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{104, -81, -64, -90, -105, -58, -65, -65, -74, -67, 115, -94, -101, -101, -110, -103, 103, 77, -85, -70, -77, -77, -86, -79};
    }

    public static void A02() {
        A03 = new String[]{"FR0EinKvOwZW2VlEpgnoVwKXeBc9ct8J", "K05aYFgFk0t0", "VOug37Y7l3ssOOXSbUnGxFzsx4hRn8wv", "z2uzga85Ski18P7nLebJhENF02V63SxL", "vQZIRiGCHJjFTe4gMXvJZpLaPtvEk1p8", "auy2W0sk", "5Z", "2337kXImyPAg9HB"};
    }

    public XZ(C1140Xb c1140Xb, C8C c8c) {
        this.A01 = c1140Xb;
        this.A00 = c8c;
    }

    @Override // com.facebook.ads.redexgen.X.C0T
    public final void A5C(C0U c0u, JSONObject jSONObject) {
        C05238e c05238e = new C05238e(A00(4, 6, 71));
        c05238e.A05(jSONObject);
        c05238e.A03(1);
        this.A00.A04().A86(A00(18, 6, 59), c0u.A02() + 4000, c05238e);
        if (BuildConfigApi.isDebug()) {
            String str = A00(10, 8, 35) + c0u + A00(0, 1, 54) + c0u.A02() + A00(1, 3, 124) + jSONObject.toString();
        }
    }
}
