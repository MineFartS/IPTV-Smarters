package com.facebook.ads.redexgen.X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class VL implements InterfaceC04876k<String> {
    public final String A00;
    public final boolean A01;

    public VL(String str) {
        this.A00 = str;
        this.A01 = VM.A01().hasSystemFeature(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final JSONObject ADZ(String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.A00, this.A01);
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    public final boolean A7f(Object obj) {
        VL vl = (VL) obj;
        return this.A00.equals(vl.A00) && this.A01 == vl.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04876k
    public final int ADF() {
        return this.A00.getBytes().length + 8;
    }
}
