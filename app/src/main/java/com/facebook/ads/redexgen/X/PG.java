package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PG extends Q1 {
    public static byte[] A01;
    public final /* synthetic */ C05187y A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{2, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 79, 7, 0, 2, 4, 3, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 10, 79, 0, 5, DateTimeFieldType.MINUTE_OF_DAY, 79, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 8, DateTimeFieldType.SECOND_OF_MINUTE, 8, 0, DateTimeFieldType.HALFDAY_OF_DAY, 79, 8, 12, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 8, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 79, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 6, 6, 4, 5};
    }

    public PG(C05187y c05187y) {
        this.A00 = c05187y;
    }

    @Override // com.facebook.ads.redexgen.X.Q1
    public final void A04() {
        if (!this.A00.A0D.A08()) {
            this.A00.A0D.A06();
            if (this.A00.getAudienceNetworkListener() != null) {
                this.A00.getAudienceNetworkListener().A3s(A00(0, 47, 116));
            }
            if (!TextUtils.isEmpty(this.A00.A0A)) {
                ((AbstractC1212Zy) ((AbstractC1212Zy) this.A00)).A0A.A8A(this.A00.A0A, new C0897Np().A04(this.A00.A09).A03(this.A00.A0D).A05(((AbstractC1212Zy) ((AbstractC1212Zy) this.A00)).A08.A0S()).A06());
                this.A00.A0C.A0A().A2a();
            }
        }
    }
}
