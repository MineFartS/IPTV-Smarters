package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11631f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11627b = new c.f.a.c.d.v.b("MediaLiveSeekableRange");
    public static final Parcelable.Creator<i> CREATOR = new e1();

    public i(long j2, long j3, boolean z, boolean z2) {
        this.f11628c = Math.max(j2, 0L);
        this.f11629d = Math.max(j3, 0L);
        this.f11630e = z;
        this.f11631f = z2;
    }

    public static i M(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                return new i(c.f.a.c.d.v.a.c(jSONObject.getDouble("start")), c.f.a.c.d.v.a.c(jSONObject.getDouble("end")), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                c.f.a.c.d.v.b bVar = f11627b;
                String strValueOf = String.valueOf(jSONObject);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 43);
                sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                sb.append(strValueOf);
                bVar.c(sb.toString(), new Object[0]);
            }
        }
        return null;
    }

    public long I() {
        return this.f11629d;
    }

    public long J() {
        return this.f11628c;
    }

    public boolean K() {
        return this.f11631f;
    }

    public boolean L() {
        return this.f11630e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f11628c == iVar.f11628c && this.f11629d == iVar.f11629d && this.f11630e == iVar.f11630e && this.f11631f == iVar.f11631f;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(Long.valueOf(this.f11628c), Long.valueOf(this.f11629d), Boolean.valueOf(this.f11630e), Boolean.valueOf(this.f11631f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.o(parcel, 2, J());
        c.f.a.c.f.q.w.c.o(parcel, 3, I());
        c.f.a.c.f.q.w.c.c(parcel, 4, L());
        c.f.a.c.f.q.w.c.c(parcel, 5, K());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
