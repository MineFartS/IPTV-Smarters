package com.facebook.ads.redexgen.X;

import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1135Ww extends AbstractC04956s<C6O> {
    public C1135Ww(long j2, @Nullable C04936q c04936q, C6O c6o) {
        super(j2, c04936q, c6o, EnumC04946r.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final int A07() {
        return A08().A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final JSONObject A09(JSONObject jSONObject) throws JSONException {
        return A08().A0B(jSONObject);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6s != com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef<com.facebook.ads.internal.botdetection.signals.biometric.model.TouchSignalRawValue> */
    @Override // com.facebook.ads.redexgen.X.AbstractC04956s
    public final boolean A0B(AbstractC04956s<C6O> abstractC04956s) {
        return A08().A0C(abstractC04956s.A08());
    }
}
