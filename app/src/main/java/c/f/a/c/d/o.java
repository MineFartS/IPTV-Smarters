package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<o> CREATOR = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaInfo f11714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f11717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f11719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long[] f11720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONObject f11722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f11723k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f11724a;

        public a(o oVar) {
            this.f11724a = new o();
        }

        public a(MediaInfo mediaInfo) {
            this.f11724a = new o(mediaInfo);
        }

        public a(JSONObject jSONObject) {
            this.f11724a = new o(jSONObject);
        }

        public o a() {
            this.f11724a.T();
            return this.f11724a;
        }

        public a b() {
            this.f11724a.Q().a(0);
            return this;
        }
    }

    public class b {
        public b() {
        }

        public void a(int i2) {
            o.this.f11715c = i2;
        }
    }

    public o(o oVar) {
        this(oVar.M(), oVar.L(), oVar.J(), oVar.P(), oVar.N(), oVar.O(), oVar.I(), null);
        if (this.f11714b == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.f11722j = oVar.K();
    }

    public o(MediaInfo mediaInfo) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public o(MediaInfo mediaInfo, int i2, boolean z, double d2, double d3, double d4, long[] jArr, String str) {
        this.f11717e = Double.NaN;
        this.f11723k = new b();
        this.f11714b = mediaInfo;
        this.f11715c = i2;
        this.f11716d = z;
        this.f11717e = d2;
        this.f11718f = d3;
        this.f11719g = d4;
        this.f11720h = jArr;
        this.f11721i = str;
        if (str == null) {
            this.f11722j = null;
            return;
        }
        try {
            this.f11722j = new JSONObject(this.f11721i);
        } catch (JSONException unused) {
            this.f11722j = null;
            this.f11721i = null;
        }
    }

    public o(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        b(jSONObject);
    }

    public long[] I() {
        return this.f11720h;
    }

    public boolean J() {
        return this.f11716d;
    }

    public JSONObject K() {
        return this.f11722j;
    }

    public int L() {
        return this.f11715c;
    }

    public MediaInfo M() {
        return this.f11714b;
    }

    public double N() {
        return this.f11718f;
    }

    public double O() {
        return this.f11719g;
    }

    public double P() {
        return this.f11717e;
    }

    public b Q() {
        return this.f11723k;
    }

    public JSONObject R() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f11714b;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.W());
            }
            int i2 = this.f11715c;
            if (i2 != 0) {
                jSONObject.put("itemId", i2);
            }
            jSONObject.put("autoplay", this.f11716d);
            if (!Double.isNaN(this.f11717e)) {
                jSONObject.put("startTime", this.f11717e);
            }
            double d2 = this.f11718f;
            if (d2 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d2);
            }
            jSONObject.put("preloadTime", this.f11719g);
            if (this.f11720h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j2 : this.f11720h) {
                    jSONArray.put(j2);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f11722j;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void T() {
        if (this.f11714b == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(this.f11717e) && this.f11717e < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.f11718f)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(this.f11719g) || this.f11719g < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public boolean b(JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean z2;
        int i2;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f11714b = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f11715c != (i2 = jSONObject.getInt("itemId"))) {
            this.f11715c = i2;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f11716d != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f11716d = z2;
            z = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.f11717e) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.f11717e) > 1.0E-7d)) {
            this.f11717e = dOptDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d2 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d2 - this.f11718f) > 1.0E-7d) {
                this.f11718f = d2;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d3 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d3 - this.f11719g) > 1.0E-7d) {
                this.f11719g = d3;
                z = true;
            }
        }
        long[] jArr = null;
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                jArr2[i3] = jSONArray.getLong(i3);
            }
            long[] jArr3 = this.f11720h;
            if (jArr3 == null || jArr3.length != length) {
                jArr = jArr2;
                z3 = true;
                break;
            }
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f11720h[i4] != jArr2[i4]) {
                    jArr = jArr2;
                    z3 = true;
                    break;
                }
            }
            jArr = jArr2;
        }
        if (z3) {
            this.f11720h = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f11722j = jSONObject.getJSONObject("customData");
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        JSONObject jSONObject = this.f11722j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = oVar.f11722j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.f.a.c.f.t.k.a(jSONObject, jSONObject2)) && c.f.a.c.d.v.a.f(this.f11714b, oVar.f11714b) && this.f11715c == oVar.f11715c && this.f11716d == oVar.f11716d && ((Double.isNaN(this.f11717e) && Double.isNaN(oVar.f11717e)) || this.f11717e == oVar.f11717e) && this.f11718f == oVar.f11718f && this.f11719g == oVar.f11719g && Arrays.equals(this.f11720h, oVar.f11720h);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11714b, Integer.valueOf(this.f11715c), Boolean.valueOf(this.f11716d), Double.valueOf(this.f11717e), Double.valueOf(this.f11718f), Double.valueOf(this.f11719g), Integer.valueOf(Arrays.hashCode(this.f11720h)), String.valueOf(this.f11722j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.f11722j;
        this.f11721i = jSONObject == null ? null : jSONObject.toString();
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.r(parcel, 2, M(), i2, false);
        c.f.a.c.f.q.w.c.l(parcel, 3, L());
        c.f.a.c.f.q.w.c.c(parcel, 4, J());
        c.f.a.c.f.q.w.c.g(parcel, 5, P());
        c.f.a.c.f.q.w.c.g(parcel, 6, N());
        c.f.a.c.f.q.w.c.g(parcel, 7, O());
        c.f.a.c.f.q.w.c.p(parcel, 8, I(), false);
        c.f.a.c.f.q.w.c.s(parcel, 9, this.f11721i, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
