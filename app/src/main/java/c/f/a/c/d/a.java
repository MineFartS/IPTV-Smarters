package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.achartengine.ChartFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<a> CREATOR = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f11559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JSONObject f11560n;

    public a(String str, String str2, long j2, String str3, String str4, String str5, String str6, String str7, String str8, long j3, String str9, s sVar) {
        JSONObject jSONObject;
        this.f11548b = str;
        this.f11549c = str2;
        this.f11550d = j2;
        this.f11551e = str3;
        this.f11552f = str4;
        this.f11553g = str5;
        this.f11554h = str6;
        this.f11555i = str7;
        this.f11556j = str8;
        this.f11557k = j3;
        this.f11558l = str9;
        this.f11559m = sVar;
        if (TextUtils.isEmpty(str6)) {
            jSONObject = new JSONObject();
        } else {
            try {
                this.f11560n = new JSONObject(str6);
                return;
            } catch (JSONException e2) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e2.getMessage()));
                this.f11554h = null;
                jSONObject = new JSONObject();
            }
        }
        this.f11560n = jSONObject;
    }

    public static a U(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(Name.MARK)) {
            return null;
        }
        try {
            String string = jSONObject.getString(Name.MARK);
            long jC = c.f.a.c.d.v.a.c(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("clickThroughUrl", null);
            String strOptString2 = jSONObject.optString("contentUrl", null);
            String strOptString3 = jSONObject.optString("mimeType", null);
            if (strOptString3 == null) {
                strOptString3 = jSONObject.optString("contentType", null);
            }
            String str = strOptString3;
            String strOptString4 = jSONObject.optString(ChartFactory.TITLE, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customData");
            return new a(string, strOptString4, jC, strOptString2, str, strOptString, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), jSONObject.optString("contentId", null), jSONObject.optString("posterUrl", null), jSONObject.has("whenSkippable") ? c.f.a.c.d.v.a.c(((Integer) jSONObject.get("whenSkippable")).intValue()) : -1L, jSONObject.optString("hlsSegmentFormat", null), s.b(jSONObject.optJSONObject("vastAdsRequest")));
        } catch (JSONException e2) {
            Log.d("AdBreakClipInfo", String.format(Locale.ROOT, "Error while creating an AdBreakClipInfo from JSON: %s", e2.getMessage()));
            return null;
        }
    }

    public String I() {
        return this.f11553g;
    }

    public String J() {
        return this.f11555i;
    }

    public String K() {
        return this.f11551e;
    }

    public long L() {
        return this.f11550d;
    }

    public String M() {
        return this.f11558l;
    }

    public String N() {
        return this.f11548b;
    }

    public String O() {
        return this.f11556j;
    }

    public String P() {
        return this.f11552f;
    }

    public String Q() {
        return this.f11549c;
    }

    public s R() {
        return this.f11559m;
    }

    public long S() {
        return this.f11557k;
    }

    public final JSONObject T() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Name.MARK, this.f11548b);
            jSONObject.put("duration", c.f.a.c.d.v.a.b(this.f11550d));
            long j2 = this.f11557k;
            if (j2 != -1) {
                jSONObject.put("whenSkippable", c.f.a.c.d.v.a.b(j2));
            }
            String str = this.f11555i;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11552f;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11549c;
            if (str3 != null) {
                jSONObject.put(ChartFactory.TITLE, str3);
            }
            String str4 = this.f11551e;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11553g;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11560n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11556j;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11558l;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            s sVar = this.f11559m;
            if (sVar != null) {
                jSONObject.put("vastAdsRequest", sVar.K());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return c.f.a.c.d.v.a.f(this.f11548b, aVar.f11548b) && c.f.a.c.d.v.a.f(this.f11549c, aVar.f11549c) && this.f11550d == aVar.f11550d && c.f.a.c.d.v.a.f(this.f11551e, aVar.f11551e) && c.f.a.c.d.v.a.f(this.f11552f, aVar.f11552f) && c.f.a.c.d.v.a.f(this.f11553g, aVar.f11553g) && c.f.a.c.d.v.a.f(this.f11554h, aVar.f11554h) && c.f.a.c.d.v.a.f(this.f11555i, aVar.f11555i) && c.f.a.c.d.v.a.f(this.f11556j, aVar.f11556j) && this.f11557k == aVar.f11557k && c.f.a.c.d.v.a.f(this.f11558l, aVar.f11558l) && c.f.a.c.d.v.a.f(this.f11559m, aVar.f11559m);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11548b, this.f11549c, Long.valueOf(this.f11550d), this.f11551e, this.f11552f, this.f11553g, this.f11554h, this.f11555i, this.f11556j, Long.valueOf(this.f11557k), this.f11558l, this.f11559m);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, N(), false);
        c.f.a.c.f.q.w.c.s(parcel, 3, Q(), false);
        c.f.a.c.f.q.w.c.o(parcel, 4, L());
        c.f.a.c.f.q.w.c.s(parcel, 5, K(), false);
        c.f.a.c.f.q.w.c.s(parcel, 6, P(), false);
        c.f.a.c.f.q.w.c.s(parcel, 7, I(), false);
        c.f.a.c.f.q.w.c.s(parcel, 8, this.f11554h, false);
        c.f.a.c.f.q.w.c.s(parcel, 9, J(), false);
        c.f.a.c.f.q.w.c.s(parcel, 10, O(), false);
        c.f.a.c.f.q.w.c.o(parcel, 11, S());
        c.f.a.c.f.q.w.c.s(parcel, 12, M(), false);
        c.f.a.c.f.q.w.c.r(parcel, 13, R(), i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
