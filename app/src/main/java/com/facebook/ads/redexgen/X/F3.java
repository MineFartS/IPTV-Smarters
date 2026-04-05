package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F3 extends AbstractC1151Xm {
    public static byte[] A02;
    public final /* synthetic */ RY A00;
    public final /* synthetic */ C0988Rd A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{DateTimeFieldType.SECOND_OF_MINUTE, 34, 34, 63, 34, 112, 53, 40, 53, 51, 37, 36, 57, 62, 55, 112, 49, 51, 36, 57, 63, 62, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR};
    }

    public F3(RY ry, C0988Rd c0988Rd) {
        this.A00 = ry;
        this.A01 = c0988Rd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Ni
    public final void A8x() {
        this.A00.A09 = true;
        if (!this.A00.A0A) {
            return;
        }
        this.A00.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Xm, com.facebook.ads.redexgen.X.InterfaceC0890Ni
    public final void A9D(String str, Map<String, String> map) {
        this.A00.A02.A0A().A3Z();
        Uri uri = Uri.parse(str);
        if (A00(22, 4, 12).equals(uri.getScheme()) && C03310g.A04(uri.getAuthority()) && this.A00.A00 != null) {
            this.A00.A00.A95(this.A00);
        }
        AbstractC03300f abstractC03300fA00 = C03310g.A00(this.A00.A02, this.A00.A03, this.A01.A5l(), uri, map);
        if (abstractC03300fA00 == null) {
            return;
        }
        try {
            this.A00.A02.A0A().A3W();
            abstractC03300fA00.A0D();
        } catch (Exception e2) {
            Log.e(RY.A0D, A00(0, 22, 43), e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Xm, com.facebook.ads.redexgen.X.InterfaceC0890Ni
    public final void A9m() {
        this.A00.A02.A0A().A3a(this.A00.A01 != null);
        if (this.A00.A01 == null) {
            return;
        }
        this.A00.A01.A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1151Xm, com.facebook.ads.redexgen.X.InterfaceC0890Ni
    public final void AAO() {
        this.A00.A02.A0A().A3c();
        this.A00.A01.A08();
    }
}
