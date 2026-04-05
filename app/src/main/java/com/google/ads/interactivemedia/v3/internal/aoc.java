package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aoc extends aoh<Boolean> {
    public aoc(int i2, String str, Boolean bool) {
        super(i2, str, bool);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(h(), g().booleanValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ Boolean b(Bundle bundle) {
        String strH = h();
        if (!bundle.containsKey(strH.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strH) : new String("com.google.android.gms.ads.flag."))) {
            return g();
        }
        String strH2 = h();
        return Boolean.valueOf(bundle.getBoolean(strH2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strH2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoh
    public final /* bridge */ /* synthetic */ Boolean c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(h(), g().booleanValue()));
    }
}
