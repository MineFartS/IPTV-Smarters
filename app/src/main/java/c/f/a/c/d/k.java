package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k extends c.f.a.c.f.q.w.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaInfo f11653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f11654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f11655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f11657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f11658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JSONObject f11660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f11661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f11662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f11663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f11664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11665o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11652b = new c.f.a.c.d.v.b("MediaLoadRequestData");
    public static final Parcelable.Creator<k> CREATOR = new h1();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaInfo f11666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n f11667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f11668c = Boolean.TRUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f11669d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f11670e = 1.0d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long[] f11671f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public JSONObject f11672g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f11673h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f11674i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f11675j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f11676k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f11677l;

        public k a() {
            return new k(this.f11666a, this.f11667b, this.f11668c, this.f11669d, this.f11670e, this.f11671f, this.f11672g, this.f11673h, this.f11674i, this.f11675j, this.f11676k, this.f11677l);
        }

        public a b(long[] jArr) {
            this.f11671f = jArr;
            return this;
        }

        public a c(Boolean bool) {
            this.f11668c = bool;
            return this;
        }

        public a d(String str) {
            this.f11673h = str;
            return this;
        }

        public a e(String str) {
            this.f11674i = str;
            return this;
        }

        public a f(long j2) {
            this.f11669d = j2;
            return this;
        }

        public a g(JSONObject jSONObject) {
            this.f11672g = jSONObject;
            return this;
        }

        public a h(MediaInfo mediaInfo) {
            this.f11666a = mediaInfo;
            return this;
        }

        public a i(double d2) {
            if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.f11670e = d2;
            return this;
        }
    }

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j2, double d2, long[] jArr, String str, String str2, String str3, String str4, String str5, long j3) {
        this(mediaInfo, nVar, bool, j2, d2, jArr, c.f.a.c.d.v.a.a(str), str2, str3, str4, str5, j3);
    }

    public k(MediaInfo mediaInfo, n nVar, Boolean bool, long j2, double d2, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j3) {
        this.f11653c = mediaInfo;
        this.f11654d = nVar;
        this.f11655e = bool;
        this.f11656f = j2;
        this.f11657g = d2;
        this.f11658h = jArr;
        this.f11660j = jSONObject;
        this.f11661k = str;
        this.f11662l = str2;
        this.f11663m = str3;
        this.f11664n = str4;
        this.f11665o = j3;
    }

    public long[] I() {
        return this.f11658h;
    }

    public Boolean J() {
        return this.f11655e;
    }

    public String K() {
        return this.f11661k;
    }

    public String L() {
        return this.f11662l;
    }

    public long M() {
        return this.f11656f;
    }

    public MediaInfo N() {
        return this.f11653c;
    }

    public double O() {
        return this.f11657g;
    }

    public n P() {
        return this.f11654d;
    }

    public long Q() {
        return this.f11665o;
    }

    public JSONObject R() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f11653c;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.W());
            }
            n nVar = this.f11654d;
            if (nVar != null) {
                jSONObject.put("queueData", nVar.Q());
            }
            jSONObject.putOpt("autoplay", this.f11655e);
            long j2 = this.f11656f;
            if (j2 != -1) {
                jSONObject.put("currentTime", c.f.a.c.d.v.a.b(j2));
            }
            jSONObject.put("playbackRate", this.f11657g);
            jSONObject.putOpt("credentials", this.f11661k);
            jSONObject.putOpt("credentialsType", this.f11662l);
            jSONObject.putOpt("atvCredentials", this.f11663m);
            jSONObject.putOpt("atvCredentialsType", this.f11664n);
            if (this.f11658h != null) {
                JSONArray jSONArray = new JSONArray();
                int i2 = 0;
                while (true) {
                    long[] jArr = this.f11658h;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    jSONArray.put(i2, jArr[i2]);
                    i2++;
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", this.f11660j);
            jSONObject.put("requestId", this.f11665o);
            return jSONObject;
        } catch (JSONException e2) {
            f11652b.c("Error transforming MediaLoadRequestData into JSONObject", e2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return c.f.a.c.f.t.k.a(this.f11660j, kVar.f11660j) && c.f.a.c.f.q.n.a(this.f11653c, kVar.f11653c) && c.f.a.c.f.q.n.a(this.f11654d, kVar.f11654d) && c.f.a.c.f.q.n.a(this.f11655e, kVar.f11655e) && this.f11656f == kVar.f11656f && this.f11657g == kVar.f11657g && Arrays.equals(this.f11658h, kVar.f11658h) && c.f.a.c.f.q.n.a(this.f11661k, kVar.f11661k) && c.f.a.c.f.q.n.a(this.f11662l, kVar.f11662l) && c.f.a.c.f.q.n.a(this.f11663m, kVar.f11663m) && c.f.a.c.f.q.n.a(this.f11664n, kVar.f11664n) && this.f11665o == kVar.f11665o;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11653c, this.f11654d, this.f11655e, Long.valueOf(this.f11656f), Double.valueOf(this.f11657g), this.f11658h, String.valueOf(this.f11660j), this.f11661k, this.f11662l, this.f11663m, this.f11664n, Long.valueOf(this.f11665o));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.f11660j;
        this.f11659i = jSONObject == null ? null : jSONObject.toString();
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.r(parcel, 2, N(), i2, false);
        c.f.a.c.f.q.w.c.r(parcel, 3, P(), i2, false);
        c.f.a.c.f.q.w.c.d(parcel, 4, J(), false);
        c.f.a.c.f.q.w.c.o(parcel, 5, M());
        c.f.a.c.f.q.w.c.g(parcel, 6, O());
        c.f.a.c.f.q.w.c.p(parcel, 7, I(), false);
        c.f.a.c.f.q.w.c.s(parcel, 8, this.f11659i, false);
        c.f.a.c.f.q.w.c.s(parcel, 9, K(), false);
        c.f.a.c.f.q.w.c.s(parcel, 10, L(), false);
        c.f.a.c.f.q.w.c.s(parcel, 11, this.f11663m, false);
        c.f.a.c.f.q.w.c.s(parcel, 12, this.f11664n, false);
        c.f.a.c.f.q.w.c.o(parcel, 13, Q());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
