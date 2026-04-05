package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1051Tq implements AnonymousClass64 {
    public static byte[] A01;
    public static final String A02;
    public final X3 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 116, 111, 105, 124, 120, 101, 99, 98, 44, 110, 121, 101, 96, 104, 101, 98, 107, 44, 74, 77, 66, 44, 96, 99, 107, 107, 101, 98, 107, 44, 70, 95, 67, 66, 69, 87, 77, 64, 71, 65, 122, 65, 68, 81, 68, 122, 73, 74, 66, 66, 76, 75, 66, 72, 67, 78, 121, 110, 65, 71, 32, 54, 39, 9, DateTimeFieldType.CLOCKHOUR_OF_DAY, 30};
    }

    static {
        A01();
        A02 = C1051Tq.class.getSimpleName();
    }

    public C1051Tq(X3 x3) {
        this.A00 = x3;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void A8M(String str, String str2, int i2, int i3, int i4, JSONObject jSONObject, EnumC04856i enumC04856i) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(A00(35, 4, 20), str);
            jSONObject2.put(A00(54, 3, 26), str2);
            jSONObject2.put(A00(57, 2, 42), i2);
            jSONObject2.put(A00(59, 2, 3), i3);
            jSONObject2.put(A00(61, 3, 99), i4);
            jSONObject2.put(A00(64, 3, 74), C05026z.A01(jSONObject.toString(), str2));
            C05238e c05238e = new C05238e(jSONObject2.toString());
            c05238e.A03(1);
            this.A00.A04().A87(A00(39, 15, 21), 3201, c05238e);
        } catch (JSONException e2) {
            Log.e(A02, A00(0, 35, 60), e2);
        }
    }
}
