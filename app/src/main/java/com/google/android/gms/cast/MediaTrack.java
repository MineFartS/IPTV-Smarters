package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.d.r1;
import c.f.a.c.f.q.n;
import c.f.a.c.f.q.w.c;
import c.f.a.c.f.t.k;
import c.f.a.c.j.c.k1;
import c.f.a.c.j.c.n1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaTrack extends c.f.a.c.f.q.w.a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f24136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f24138k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f24140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f24141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f24142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f24143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f24144f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24145g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<String> f24146h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public JSONObject f24147i;

        public a(long j2, int i2) {
            this.f24139a = j2;
            this.f24140b = i2;
        }

        public MediaTrack a() {
            return new MediaTrack(this.f24139a, this.f24140b, this.f24141c, this.f24142d, this.f24143e, this.f24144f, this.f24145g, this.f24146h, this.f24147i);
        }

        public a b(String str) {
            this.f24141c = str;
            return this;
        }

        public a c(String str) {
            this.f24143e = str;
            return this;
        }

        public a d(int i2) {
            if (i2 < -1 || i2 > 5) {
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid subtype ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            if (i2 != 0 && this.f24140b != 1) {
                throw new IllegalArgumentException("subtypes are only valid for text tracks");
            }
            this.f24145g = i2;
            return this;
        }
    }

    public MediaTrack(long j2, int i2, String str, String str2, String str3, String str4, int i3, List<String> list, String str5) {
        this(j2, i2, str, str2, str3, str4, i3, list, c.f.a.c.d.v.a.a(str5));
    }

    public MediaTrack(long j2, int i2, String str, String str2, String str3, String str4, int i3, List<String> list, JSONObject jSONObject) {
        this.f24129b = j2;
        this.f24130c = i2;
        this.f24131d = str;
        this.f24132e = str2;
        this.f24133f = str3;
        this.f24134g = str4;
        this.f24135h = i3;
        this.f24136i = list;
        this.f24138k = jSONObject;
    }

    public static MediaTrack Q(JSONObject jSONObject) throws JSONException {
        int i2;
        k1 k1VarB;
        long j2 = jSONObject.getLong("trackId");
        String strOptString = jSONObject.optString("type");
        int i3 = "TEXT".equals(strOptString) ? 1 : "AUDIO".equals(strOptString) ? 2 : "VIDEO".equals(strOptString) ? 3 : 0;
        String strOptString2 = jSONObject.optString("trackContentId", null);
        String strOptString3 = jSONObject.optString("trackContentType", null);
        String strOptString4 = jSONObject.optString("name", null);
        String strOptString5 = jSONObject.optString(IjkMediaMeta.IJKM_KEY_LANGUAGE, null);
        if (jSONObject.has("subtype")) {
            String string = jSONObject.getString("subtype");
            i2 = "SUBTITLES".equals(string) ? 1 : "CAPTIONS".equals(string) ? 2 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("roles")) {
            n1 n1VarC = k1.C();
            JSONArray jSONArray = jSONObject.getJSONArray("roles");
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                n1VarC.a(jSONArray.optString(i4));
            }
            k1VarB = n1VarC.b();
        } else {
            k1VarB = null;
        }
        return new MediaTrack(j2, i3, strOptString2, strOptString3, strOptString4, strOptString5, i2, k1VarB, jSONObject.optJSONObject("customData"));
    }

    public final String I() {
        return this.f24131d;
    }

    public final String J() {
        return this.f24132e;
    }

    public final long K() {
        return this.f24129b;
    }

    public final String L() {
        return this.f24134g;
    }

    public final List<String> M() {
        return this.f24136i;
    }

    public final int N() {
        return this.f24135h;
    }

    public final int O() {
        return this.f24130c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[Catch: JSONException -> 0x008c, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087 A[Catch: JSONException -> 0x008c, TRY_LEAVE, TryCatch #0 {JSONException -> 0x008c, blocks: (B:3:0x0005, B:10:0x001c, B:13:0x0026, B:15:0x002a, B:16:0x002f, B:18:0x0033, B:19:0x0038, B:21:0x003c, B:22:0x0041, B:24:0x0049, B:25:0x0050, B:36:0x0063, B:41:0x0073, B:43:0x0077, B:44:0x0083, B:46:0x0087), top: B:49:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject P() {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trackId"
            long r2 = r6.f24129b     // Catch: org.json.JSONException -> L8c
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8c
            int r1 = r6.f24130c     // Catch: org.json.JSONException -> L8c
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "type"
            if (r1 == r4) goto L23
            if (r1 == r3) goto L20
            if (r1 == r2) goto L1a
            goto L26
        L1a:
            java.lang.String r1 = "VIDEO"
        L1c:
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
            goto L26
        L20:
            java.lang.String r1 = "AUDIO"
            goto L1c
        L23:
            java.lang.String r1 = "TEXT"
            goto L1c
        L26:
            java.lang.String r1 = r6.f24131d     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L2f
            java.lang.String r5 = "trackContentId"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
        L2f:
            java.lang.String r1 = r6.f24132e     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L38
            java.lang.String r5 = "trackContentType"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
        L38:
            java.lang.String r1 = r6.f24133f     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L41
            java.lang.String r5 = "name"
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
        L41:
            java.lang.String r1 = r6.f24134g     // Catch: org.json.JSONException -> L8c
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L8c
            if (r1 != 0) goto L50
            java.lang.String r1 = "language"
            java.lang.String r5 = r6.f24134g     // Catch: org.json.JSONException -> L8c
            r0.put(r1, r5)     // Catch: org.json.JSONException -> L8c
        L50:
            int r1 = r6.f24135h     // Catch: org.json.JSONException -> L8c
            java.lang.String r5 = "subtype"
            if (r1 == r4) goto L70
            if (r1 == r3) goto L6d
            if (r1 == r2) goto L6a
            r2 = 4
            if (r1 == r2) goto L67
            r2 = 5
            if (r1 == r2) goto L61
            goto L73
        L61:
            java.lang.String r1 = "METADATA"
        L63:
            r0.put(r5, r1)     // Catch: org.json.JSONException -> L8c
            goto L73
        L67:
            java.lang.String r1 = "CHAPTERS"
            goto L63
        L6a:
            java.lang.String r1 = "DESCRIPTIONS"
            goto L63
        L6d:
            java.lang.String r1 = "CAPTIONS"
            goto L63
        L70:
            java.lang.String r1 = "SUBTITLES"
            goto L63
        L73:
            java.util.List<java.lang.String> r1 = r6.f24136i     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L83
            java.lang.String r1 = "roles"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L8c
            java.util.List<java.lang.String> r3 = r6.f24136i     // Catch: org.json.JSONException -> L8c
            r2.<init>(r3)     // Catch: org.json.JSONException -> L8c
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8c
        L83:
            org.json.JSONObject r1 = r6.f24138k     // Catch: org.json.JSONException -> L8c
            if (r1 == 0) goto L8c
            java.lang.String r2 = "customData"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L8c
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaTrack.P():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f24138k;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f24138k;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || k.a(jSONObject, jSONObject2)) && this.f24129b == mediaTrack.f24129b && this.f24130c == mediaTrack.f24130c && c.f.a.c.d.v.a.f(this.f24131d, mediaTrack.f24131d) && c.f.a.c.d.v.a.f(this.f24132e, mediaTrack.f24132e) && c.f.a.c.d.v.a.f(this.f24133f, mediaTrack.f24133f) && c.f.a.c.d.v.a.f(this.f24134g, mediaTrack.f24134g) && this.f24135h == mediaTrack.f24135h && c.f.a.c.d.v.a.f(this.f24136i, mediaTrack.f24136i);
    }

    public final String getName() {
        return this.f24133f;
    }

    public final int hashCode() {
        return n.b(Long.valueOf(this.f24129b), Integer.valueOf(this.f24130c), this.f24131d, this.f24132e, this.f24133f, this.f24134g, Integer.valueOf(this.f24135h), this.f24136i, String.valueOf(this.f24138k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.f24138k;
        this.f24137j = jSONObject == null ? null : jSONObject.toString();
        int iA = c.a(parcel);
        c.o(parcel, 2, K());
        c.l(parcel, 3, O());
        c.s(parcel, 4, I(), false);
        c.s(parcel, 5, J(), false);
        c.s(parcel, 6, getName(), false);
        c.s(parcel, 7, L(), false);
        c.l(parcel, 8, N());
        c.u(parcel, 9, M(), false);
        c.s(parcel, 10, this.f24137j, false);
        c.b(parcel, iA);
    }
}
