package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aod extends aoh<Integer> {
    public aod(String str, Integer num) {
        super(1, str, num);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ Integer a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(h(), g().intValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ Integer b(Bundle bundle) {
        String strH = h();
        if (!bundle.containsKey(strH.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strH) : new String("com.google.android.gms.ads.flag."))) {
            return g();
        }
        String strH2 = h();
        return Integer.valueOf(bundle.getInt(strH2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strH2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ Integer c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(h(), g().intValue()));
    }
}
