package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11774e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11771b = new c.f.a.c.d.v.b("VideoInfo");
    public static final Parcelable.Creator<t> CREATOR = new w1();

    public t(int i2, int i3, int i4) {
        this.f11772c = i2;
        this.f11773d = i3;
        this.f11774e = i4;
    }

    public static t L(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            byte b2 = -1;
            int iHashCode = string.hashCode();
            int i2 = 3;
            if (iHashCode != 3218) {
                if (iHashCode != 103158) {
                    if (iHashCode != 113729) {
                        if (iHashCode == 99136405 && string.equals("hdr10")) {
                            b2 = 1;
                        }
                    } else if (string.equals("sdr")) {
                        b2 = 3;
                    }
                } else if (string.equals("hdr")) {
                    b2 = 2;
                }
            } else if (string.equals("dv")) {
                b2 = 0;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    i2 = 2;
                } else if (b2 == 2) {
                    i2 = 4;
                } else if (b2 != 3) {
                    f11771b.a("Unknown HDR type: %s", string);
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            }
            return new t(jSONObject.getInt("width"), jSONObject.getInt("height"), i2);
        } catch (JSONException e2) {
            f11771b.a("Error while creating a VideoInfo instance from JSON: %s", e2.getMessage());
            return null;
        }
    }

    public final int I() {
        return this.f11774e;
    }

    public final int J() {
        return this.f11773d;
    }

    public final int K() {
        return this.f11772c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f11773d == tVar.J() && this.f11772c == tVar.K() && this.f11774e == tVar.I();
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(Integer.valueOf(this.f11773d), Integer.valueOf(this.f11772c), Integer.valueOf(this.f11774e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 2, K());
        c.f.a.c.f.q.w.c.l(parcel, 3, J());
        c.f.a.c.f.q.w.c.l(parcel, 4, I());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
