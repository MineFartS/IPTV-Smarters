package com.android.billingclient.api;

import android.text.TextUtils;
import c.c.a.a.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f18887c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Purchase> f18888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f18889b;

        public a(g gVar, List<Purchase> list) {
            this.f18888a = list;
            this.f18889b = gVar;
        }

        public g a() {
            return this.f18889b;
        }

        public List<Purchase> b() {
            return this.f18888a;
        }
    }

    public Purchase(String str, String str2) {
        this.f18885a = str;
        this.f18886b = str2;
        this.f18887c = new JSONObject(str);
    }

    public String a() {
        return this.f18887c.optString("orderId");
    }

    public String b() {
        return this.f18885a;
    }

    public int c() {
        return this.f18887c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String d() {
        JSONObject jSONObject = this.f18887c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f18886b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f18885a, purchase.b()) && TextUtils.equals(this.f18886b, purchase.e());
    }

    public ArrayList<String> f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f18887c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f18887c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i2));
                }
            }
        } else if (this.f18887c.has("productId")) {
            arrayList.add(this.f18887c.optString("productId"));
        }
        return arrayList;
    }

    public boolean g() {
        return this.f18887c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f18885a.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f18885a);
        return strValueOf.length() != 0 ? "Purchase. Json: ".concat(strValueOf) : new String("Purchase. Json: ");
    }
}
