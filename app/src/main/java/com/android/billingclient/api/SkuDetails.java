package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f18891b;

    public SkuDetails(String str) {
        this.f18890a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18891b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f18890a;
    }

    public String b() {
        return this.f18891b.optString("price");
    }

    public String c() {
        return this.f18891b.optString("price_currency_code");
    }

    public String d() {
        return this.f18891b.optString("productId");
    }

    public String e() {
        return this.f18891b.optString("type");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f18890a, ((SkuDetails) obj).f18890a);
        }
        return false;
    }

    public int f() {
        return this.f18891b.optInt("offer_type");
    }

    public String g() {
        return this.f18891b.optString("offer_id");
    }

    public final String h() {
        return this.f18891b.optString("packageName");
    }

    public int hashCode() {
        return this.f18890a.hashCode();
    }

    public String i() {
        return this.f18891b.optString("serializedDocid");
    }

    public final String j() {
        return this.f18891b.optString("skuDetailsToken");
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f18890a);
        return strValueOf.length() != 0 ? "SkuDetails: ".concat(strValueOf) : new String("SkuDetails: ");
    }
}
