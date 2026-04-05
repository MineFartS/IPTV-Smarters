package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aog extends aoh<String> {
    public aog(String str, String str2) {
        super(1, str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ String a(JSONObject jSONObject) {
        return jSONObject.optString(h(), g());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ String b(Bundle bundle) {
        String strH = h();
        if (!bundle.containsKey(strH.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strH) : new String("com.google.android.gms.ads.flag."))) {
            return g();
        }
        String strH2 = h();
        return bundle.getString(strH2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strH2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ String c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(h(), g());
    }
}
