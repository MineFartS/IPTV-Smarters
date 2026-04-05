package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11580g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11575b = new c.f.a.c.d.v.b("AdBreakStatus");
    public static final Parcelable.Creator<c> CREATOR = new s1();

    public c(long j2, long j3, String str, String str2, long j4) {
        this.f11576c = j2;
        this.f11577d = j3;
        this.f11578e = str;
        this.f11579f = str2;
        this.f11580g = j4;
    }

    public static c N(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long jC = c.f.a.c.d.v.a.c(jSONObject.getLong("currentBreakTime"));
                long jC2 = c.f.a.c.d.v.a.c(jSONObject.getLong("currentBreakClipTime"));
                String strOptString = jSONObject.optString("breakId", null);
                String strOptString2 = jSONObject.optString("breakClipId", null);
                long jOptLong = jSONObject.optLong("whenSkippable", -1L);
                return new c(jC, jC2, strOptString, strOptString2, jOptLong != -1 ? c.f.a.c.d.v.a.c(jOptLong) : jOptLong);
            } catch (JSONException e2) {
                f11575b.d(e2, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public String I() {
        return this.f11579f;
    }

    public String J() {
        return this.f11578e;
    }

    public long K() {
        return this.f11577d;
    }

    public long L() {
        return this.f11576c;
    }

    public long M() {
        return this.f11580g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11576c == cVar.f11576c && this.f11577d == cVar.f11577d && c.f.a.c.d.v.a.f(this.f11578e, cVar.f11578e) && c.f.a.c.d.v.a.f(this.f11579f, cVar.f11579f) && this.f11580g == cVar.f11580g;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(Long.valueOf(this.f11576c), Long.valueOf(this.f11577d), this.f11578e, this.f11579f, Long.valueOf(this.f11580g));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.o(parcel, 2, L());
        c.f.a.c.f.q.w.c.o(parcel, 3, K());
        c.f.a.c.f.q.w.c.s(parcel, 4, J(), false);
        c.f.a.c.f.q.w.c.s(parcel, 5, I(), false);
        c.f.a.c.f.q.w.c.o(parcel, 6, M());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
