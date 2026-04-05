package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class s extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<s> CREATOR = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11770c;

    public s(String str, String str2) {
        this.f11769b = str;
        this.f11770c = str2;
    }

    public static s b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new s(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
    }

    public String I() {
        return this.f11769b;
    }

    public String J() {
        return this.f11770c;
    }

    public final JSONObject K() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f11769b;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f11770c;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return c.f.a.c.d.v.a.f(this.f11769b, sVar.f11769b) && c.f.a.c.d.v.a.f(this.f11770c, sVar.f11770c);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11769b, this.f11770c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, I(), false);
        c.f.a.c.f.q.w.c.s(parcel, 3, J(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
