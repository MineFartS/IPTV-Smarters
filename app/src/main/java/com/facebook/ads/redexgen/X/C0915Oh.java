package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0915Oh extends Q1 {
    public final /* synthetic */ JZ A00;
    public final /* synthetic */ C0849Ls A01;
    public final /* synthetic */ C0919Ol A02;
    public final /* synthetic */ OL A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0915Oh(OL ol, String str, C0919Ol c0919Ol, JZ jz, Map map, C0849Ls c0849Ls) {
        this.A03 = ol;
        this.A04 = str;
        this.A02 = c0919Ol;
        this.A00 = jz;
        this.A05 = map;
        this.A01 = c0849Ls;
    }

    @Override // com.facebook.ads.redexgen.X.Q1
    public final void A04() {
        if (!this.A03.A01.A0b() && !TextUtils.isEmpty(this.A04) && !this.A03.A07.get(this.A02.A02())) {
            this.A00.A8A(this.A04, new C0897Np(this.A05).A04(this.A03.A02).A03(this.A01).A06());
            this.A03.A07.put(this.A02.A02(), true);
        }
    }
}
