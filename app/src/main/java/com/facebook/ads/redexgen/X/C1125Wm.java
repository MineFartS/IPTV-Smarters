package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1125Wm<T> extends AbstractC04956s<InterfaceC04866j> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-73};
        String[] strArr = A01;
        if (strArr[0].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "4uyIqP7n4WtKVi9Rm5fO0ecCuIXu1zOj";
        strArr2[2] = "4uyIqP7n4WtKVi9Rm5fO0ecCuIXu1zOj";
        A00 = bArr;
    }

    public static void A02() {
        A01 = new String[]{"FFbUiuFwozfA0TvCJPANz8giqJj3Ey6e", "FdrdBbAzaIA4fvIQziUETi0i5pzm7d41", "y8Q9G33rxS5LLrNXiYcm9QLiBdw97p1I", "zt8", "kKbJCUSdm2baWh6S7cWsva6nWBGnb0Bq", "lZC5QmFNV9qqPs7G4jyYJaaKbEwmE4", "OkQ3tI89WJ1Nk7Gpl9REz34W9wj5LbGl", "vzboBPdl2BbWH2MdrrRCAvv17E0LNPzE"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wm != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    public C1125Wm(long j2, @Nullable C04936q c04936q, InterfaceC04866j interfaceC04866j) {
        super(j2, c04936q, interfaceC04866j, EnumC04946r.A03);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wm != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        return ((InterfaceC04866j) A08()).ADF();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wm != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        return jSONObject.put(A00(0, 1, 25), ((InterfaceC04866j) A08()).ADY());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.model.signal_value.ICustomObjectSignalValueDef> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wm != com.facebook.ads.internal.botdetection.signals.model.signal_value.CustomObjectSignalValueType<T> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final boolean A0B(AbstractC04956s<InterfaceC04866j> abstractC04956s) {
        if (A08() == null || abstractC04956s.A08() == null) {
            return A08() == null && abstractC04956s.A08() == null;
        }
        return ((InterfaceC04866j) A08()).A7f(abstractC04956s.A08());
    }
}
