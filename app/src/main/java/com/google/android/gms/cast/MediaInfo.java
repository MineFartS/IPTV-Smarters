package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.d.d1;
import c.f.a.c.d.l;
import c.f.a.c.d.r;
import c.f.a.c.d.s;
import c.f.a.c.f.q.n;
import c.f.a.c.f.q.w.c;
import c.f.a.c.f.t.k;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MediaInfo extends c.f.a.c.f.q.w.a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f24116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f24117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<MediaTrack> f24118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f24119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f24120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<c.f.a.c.d.b> f24121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<c.f.a.c.d.a> f24122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s f24124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f24125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f24126o;
    public String p;
    public JSONObject q;
    public final b r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaInfo f24127a;

        public a(String str) {
            this.f24127a = new MediaInfo(str);
        }

        public MediaInfo a() {
            return this.f24127a;
        }

        public a b(String str) {
            this.f24127a.V().b(str);
            return this;
        }

        public a c(JSONObject jSONObject) {
            this.f24127a.V().c(jSONObject);
            return this;
        }

        public a d(l lVar) {
            this.f24127a.V().d(lVar);
            return this;
        }

        public a e(int i2) {
            this.f24127a.V().e(i2);
            return this;
        }
    }

    public class b {
        public b() {
        }

        public void a(List<c.f.a.c.d.b> list) {
            MediaInfo.this.f24121j = list;
        }

        public void b(String str) {
            MediaInfo.this.f24115d = str;
        }

        public void c(JSONObject jSONObject) {
            MediaInfo.this.q = jSONObject;
        }

        public void d(l lVar) {
            MediaInfo.this.f24116e = lVar;
        }

        public void e(int i2) {
            if (i2 < -1 || i2 > 2) {
                throw new IllegalArgumentException("invalid stream type");
            }
            MediaInfo.this.f24114c = i2;
        }
    }

    public MediaInfo(String str) {
        this(str, -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null);
        if (str == null) {
            throw new IllegalArgumentException("contentID cannot be null");
        }
    }

    public MediaInfo(String str, int i2, String str2, l lVar, long j2, List<MediaTrack> list, r rVar, String str3, List<c.f.a.c.d.b> list2, List<c.f.a.c.d.a> list3, String str4, s sVar, long j3, String str5, String str6) {
        this.r = new b();
        this.f24113b = str;
        this.f24114c = i2;
        this.f24115d = str2;
        this.f24116e = lVar;
        this.f24117f = j2;
        this.f24118g = list;
        this.f24119h = rVar;
        this.f24120i = str3;
        if (str3 != null) {
            try {
                this.q = new JSONObject(this.f24120i);
            } catch (JSONException unused) {
                this.q = null;
                this.f24120i = null;
            }
        } else {
            this.q = null;
        }
        this.f24121j = list2;
        this.f24122k = list3;
        this.f24123l = str4;
        this.f24124m = sVar;
        this.f24125n = j3;
        this.f24126o = str5;
        this.p = str6;
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        MediaInfo mediaInfo;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            mediaInfo = this;
            mediaInfo.f24114c = 0;
        } else {
            mediaInfo = this;
            mediaInfo.f24114c = "BUFFERED".equals(strOptString) ? 1 : "LIVE".equals(strOptString) ? 2 : -1;
        }
        mediaInfo.f24115d = jSONObject.optString("contentType", null);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            l lVar = new l(jSONObject2.getInt("metadataType"));
            mediaInfo.f24116e = lVar;
            lVar.h(jSONObject2);
        }
        mediaInfo.f24117f = -1L;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble)) {
                mediaInfo.f24117f = c.f.a.c.d.v.a.c(dOptDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            mediaInfo.f24118g = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                mediaInfo.f24118g.add(MediaTrack.Q(jSONArray.getJSONObject(i2)));
            }
        } else {
            mediaInfo.f24118g = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("textTrackStyle");
            r rVar = new r();
            rVar.b(jSONObject3);
            mediaInfo.f24119h = rVar;
        } else {
            mediaInfo.f24119h = null;
        }
        c0(jSONObject);
        mediaInfo.q = jSONObject.optJSONObject("customData");
        mediaInfo.f24123l = jSONObject.optString("entity", null);
        mediaInfo.f24126o = jSONObject.optString("atvEntity", null);
        mediaInfo.f24124m = s.b(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0.0d) {
                mediaInfo.f24125n = c.f.a.c.d.v.a.c(dOptDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.p = jSONObject.optString("contentUrl");
        }
    }

    public List<c.f.a.c.d.a> I() {
        List<c.f.a.c.d.a> list = this.f24122k;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<c.f.a.c.d.b> J() {
        List<c.f.a.c.d.b> list = this.f24121j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String K() {
        return this.f24113b;
    }

    public String L() {
        return this.f24115d;
    }

    public String M() {
        return this.p;
    }

    public String N() {
        return this.f24123l;
    }

    public List<MediaTrack> O() {
        return this.f24118g;
    }

    public l P() {
        return this.f24116e;
    }

    public long Q() {
        return this.f24125n;
    }

    public long R() {
        return this.f24117f;
    }

    public int S() {
        return this.f24114c;
    }

    public r T() {
        return this.f24119h;
    }

    public s U() {
        return this.f24124m;
    }

    public b V() {
        return this.r;
    }

    public final JSONObject W() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f24113b);
            jSONObject.putOpt("contentUrl", this.p);
            int i2 = this.f24114c;
            jSONObject.put("streamType", i2 != 1 ? i2 != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.f24115d;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            l lVar = this.f24116e;
            if (lVar != null) {
                jSONObject.put("metadata", lVar.P());
            }
            long j2 = this.f24117f;
            if (j2 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", c.f.a.c.d.v.a.b(j2));
            }
            if (this.f24118g != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<MediaTrack> it = this.f24118g.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().P());
                }
                jSONObject.put("tracks", jSONArray);
            }
            r rVar = this.f24119h;
            if (rVar != null) {
                jSONObject.put("textTrackStyle", rVar.T());
            }
            JSONObject jSONObject2 = this.q;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.f24123l;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.f24121j != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<c.f.a.c.d.b> it2 = this.f24121j.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().O());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f24122k != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<c.f.a.c.d.a> it3 = this.f24122k.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(it3.next().T());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            s sVar = this.f24124m;
            if (sVar != null) {
                jSONObject.put("vmapAdsRequest", sVar.K());
            }
            long j3 = this.f24125n;
            if (j3 != -1) {
                jSONObject.put("startAbsoluteTime", c.f.a.c.d.v.a.b(j3));
            }
            jSONObject.putOpt("atvEntity", this.f24126o);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void c0(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            this.f24121j = new ArrayList(jSONArray.length());
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    break;
                }
                c.f.a.c.d.b bVarP = c.f.a.c.d.b.P(jSONArray.getJSONObject(i2));
                if (bVarP == null) {
                    this.f24121j.clear();
                    break;
                } else {
                    this.f24121j.add(bVarP);
                    i2++;
                }
            }
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            this.f24122k = new ArrayList(jSONArray2.length());
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                c.f.a.c.d.a aVarU = c.f.a.c.d.a.U(jSONArray2.getJSONObject(i3));
                if (aVarU == null) {
                    this.f24122k.clear();
                    return;
                }
                this.f24122k.add(aVarU);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.q;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.q;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || k.a(jSONObject, jSONObject2)) && c.f.a.c.d.v.a.f(this.f24113b, mediaInfo.f24113b) && this.f24114c == mediaInfo.f24114c && c.f.a.c.d.v.a.f(this.f24115d, mediaInfo.f24115d) && c.f.a.c.d.v.a.f(this.f24116e, mediaInfo.f24116e) && this.f24117f == mediaInfo.f24117f && c.f.a.c.d.v.a.f(this.f24118g, mediaInfo.f24118g) && c.f.a.c.d.v.a.f(this.f24119h, mediaInfo.f24119h) && c.f.a.c.d.v.a.f(this.f24121j, mediaInfo.f24121j) && c.f.a.c.d.v.a.f(this.f24122k, mediaInfo.f24122k) && c.f.a.c.d.v.a.f(this.f24123l, mediaInfo.f24123l) && c.f.a.c.d.v.a.f(this.f24124m, mediaInfo.f24124m) && this.f24125n == mediaInfo.f24125n && c.f.a.c.d.v.a.f(this.f24126o, mediaInfo.f24126o) && c.f.a.c.d.v.a.f(this.p, mediaInfo.p);
    }

    public int hashCode() {
        return n.b(this.f24113b, Integer.valueOf(this.f24114c), this.f24115d, this.f24116e, Long.valueOf(this.f24117f), String.valueOf(this.q), this.f24118g, this.f24119h, this.f24121j, this.f24122k, this.f24123l, this.f24124m, Long.valueOf(this.f24125n), this.f24126o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.q;
        this.f24120i = jSONObject == null ? null : jSONObject.toString();
        int iA = c.a(parcel);
        c.s(parcel, 2, K(), false);
        c.l(parcel, 3, S());
        c.s(parcel, 4, L(), false);
        c.r(parcel, 5, P(), i2, false);
        c.o(parcel, 6, R());
        c.w(parcel, 7, O(), false);
        c.r(parcel, 8, T(), i2, false);
        c.s(parcel, 9, this.f24120i, false);
        c.w(parcel, 10, J(), false);
        c.w(parcel, 11, I(), false);
        c.s(parcel, 12, N(), false);
        c.r(parcel, 13, U(), i2, false);
        c.o(parcel, 14, Q());
        c.s(parcel, 15, this.f24126o, false);
        c.s(parcel, 16, M(), false);
        c.b(parcel, iA);
    }
}
