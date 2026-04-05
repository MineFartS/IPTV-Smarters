package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.b.a.a.b;
import c.f.a.c.f.q.o;
import c.f.a.c.f.q.w.a;
import c.f.a.c.f.q.w.c;
import c.f.a.c.f.t.d;
import c.f.a.c.f.t.g;
import com.amazonaws.regions.ServiceAbbreviations;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static d f24079b = g.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f24085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f24087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<Scope> f24089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f24091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Set<Scope> f24092o = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f24080c = i2;
        this.f24081d = str;
        this.f24082e = str2;
        this.f24083f = str3;
        this.f24084g = str4;
        this.f24085h = uri;
        this.f24086i = str5;
        this.f24087j = j2;
        this.f24088k = str6;
        this.f24089l = list;
        this.f24090m = str7;
        this.f24091n = str8;
    }

    @RecentlyNullable
    public static GoogleSignInAccount S(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount googleSignInAccountT = T(jSONObject.optString(Name.MARK), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(ServiceAbbreviations.Email) ? jSONObject.optString(ServiceAbbreviations.Email) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j2), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountT.f24086i = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountT;
    }

    @RecentlyNonNull
    public static GoogleSignInAccount T(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l2, @RecentlyNonNull String str7, @RecentlyNonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l2.longValue(), o.e(str7), new ArrayList((Collection) o.i(set)), str5, str6);
    }

    @RecentlyNullable
    public Account I() {
        String str = this.f24083f;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    @RecentlyNullable
    public String J() {
        return this.f24084g;
    }

    @RecentlyNullable
    public String K() {
        return this.f24083f;
    }

    @RecentlyNullable
    public String L() {
        return this.f24091n;
    }

    @RecentlyNullable
    public String M() {
        return this.f24090m;
    }

    @RecentlyNullable
    public String N() {
        return this.f24081d;
    }

    @RecentlyNullable
    public String O() {
        return this.f24082e;
    }

    @RecentlyNullable
    public Uri P() {
        return this.f24085h;
    }

    public Set<Scope> Q() {
        HashSet hashSet = new HashSet(this.f24089l);
        hashSet.addAll(this.f24092o);
        return hashSet;
    }

    @RecentlyNullable
    public String R() {
        return this.f24086i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f24088k.equals(this.f24088k) && googleSignInAccount.Q().equals(Q());
    }

    public int hashCode() {
        return ((this.f24088k.hashCode() + 527) * 31) + Q().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f24080c);
        c.s(parcel, 2, N(), false);
        c.s(parcel, 3, O(), false);
        c.s(parcel, 4, K(), false);
        c.s(parcel, 5, J(), false);
        c.r(parcel, 6, P(), i2, false);
        c.s(parcel, 7, R(), false);
        c.o(parcel, 8, this.f24087j);
        c.s(parcel, 9, this.f24088k, false);
        c.w(parcel, 10, this.f24089l, false);
        c.s(parcel, 11, M(), false);
        c.s(parcel, 12, L(), false);
        c.b(parcel, iA);
    }
}
