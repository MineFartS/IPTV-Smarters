package com.facebook.ads.redexgen.X;

import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1133Wu extends AbstractC04956s<C6M> {
    public C1133Wu(long j2, @Nullable C04936q c04936q, C6M c6m) {
        super(j2, c04936q, c6m, EnumC04946r.A0B);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        return A08().A04();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        return A08().A05(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.SensorSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final boolean A0B(AbstractC04956s<C6M> abstractC04956s) {
        return A08().A06(abstractC04956s.A08());
    }
}
