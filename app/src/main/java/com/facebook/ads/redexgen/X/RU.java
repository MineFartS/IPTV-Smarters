package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RU extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public final /* synthetic */ JSONObject A00;

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
        A01 = new byte[]{7, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, 24, 62, 2, 0, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 6};
    }

    public RU(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        try {
            C03450u.A03.await();
            synchronized (C03450u.A00) {
                C03450u.A00.A0A(this.A00);
                C03450u.A04.countDown();
            }
        } catch (InterruptedException e2) {
            C03450u.A01.A04().A86(A00(0, 17, 116), C05228d.A0w, new C05238e(e2));
        } catch (JSONException e3) {
            C03450u.A08();
            C03450u.A01.A04().A86(A00(0, 17, 116), C05228d.A0v, new C05238e(e3));
        }
    }
}
