package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1131Ws extends AbstractC04956s<Long> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-41};
    }

    public C1131Ws(long j2, @Nullable C04936q c04936q, long j3) {
        super(j2, c04936q, Long.valueOf(j3), EnumC04946r.A09);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        return 8;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        jSONObject.put(A00(0, 1, 53), A08());
        return jSONObject;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<java.lang.Long> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final boolean A0B(AbstractC04956s<Long> abstractC04956s) {
        return A08().equals(abstractC04956s.A08());
    }
}
