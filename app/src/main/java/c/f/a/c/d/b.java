package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class b extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<b> CREATOR = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f11565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11566g;

    public b(long j2, String str, long j3, boolean z, String[] strArr, boolean z2) {
        this.f11561b = j2;
        this.f11562c = str;
        this.f11563d = j3;
        this.f11564e = z;
        this.f11565f = strArr;
        this.f11566g = z2;
    }

    public static b P(JSONObject jSONObject) {
        String[] strArr;
        if (jSONObject != null && jSONObject.has(Name.MARK) && jSONObject.has("position")) {
            try {
                String string = jSONObject.getString(Name.MARK);
                long jC = c.f.a.c.d.v.a.c(jSONObject.getLong("position"));
                boolean zOptBoolean = jSONObject.optBoolean("isWatched");
                long jC2 = c.f.a.c.d.v.a.c(jSONObject.optLong("duration"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("breakClipIds");
                if (jSONArrayOptJSONArray != null) {
                    String[] strArr2 = new String[jSONArrayOptJSONArray.length()];
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        strArr2[i2] = jSONArrayOptJSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } else {
                    strArr = null;
                }
                return new b(jC, string, jC2, zOptBoolean, strArr, jSONObject.optBoolean("isEmbedded"));
            } catch (JSONException e2) {
                Log.d("AdBreakInfo", String.format(Locale.ROOT, "Error while creating an AdBreakInfo from JSON: %s", e2.getMessage()));
            }
        }
        return null;
    }

    public String[] I() {
        return this.f11565f;
    }

    public long J() {
        return this.f11563d;
    }

    public String K() {
        return this.f11562c;
    }

    public long L() {
        return this.f11561b;
    }

    public boolean M() {
        return this.f11566g;
    }

    public boolean N() {
        return this.f11564e;
    }

    public final JSONObject O() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Name.MARK, this.f11562c);
            jSONObject.put("position", c.f.a.c.d.v.a.b(this.f11561b));
            jSONObject.put("isWatched", this.f11564e);
            jSONObject.put("isEmbedded", this.f11566g);
            jSONObject.put("duration", c.f.a.c.d.v.a.b(this.f11563d));
            if (this.f11565f != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f11565f) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c.f.a.c.d.v.a.f(this.f11562c, bVar.f11562c) && this.f11561b == bVar.f11561b && this.f11563d == bVar.f11563d && this.f11564e == bVar.f11564e && Arrays.equals(this.f11565f, bVar.f11565f) && this.f11566g == bVar.f11566g;
    }

    public int hashCode() {
        return this.f11562c.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.o(parcel, 2, L());
        c.f.a.c.f.q.w.c.s(parcel, 3, K(), false);
        c.f.a.c.f.q.w.c.o(parcel, 4, J());
        c.f.a.c.f.q.w.c.c(parcel, 5, N());
        c.f.a.c.f.q.w.c.t(parcel, 6, I(), false);
        c.f.a.c.f.q.w.c.c(parcel, 7, M());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
