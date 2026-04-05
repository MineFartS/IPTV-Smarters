package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.f.a.c.d.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes2.dex */
public class n extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<n> CREATOR = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f11706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<o> f11708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11710j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f11711a = new n();

        public n a() {
            return new n();
        }

        public final a b(JSONObject jSONObject) {
            this.f11711a.b(jSONObject);
            return this;
        }
    }

    public n() {
        clear();
    }

    public n(n nVar) {
        this.f11702b = nVar.f11702b;
        this.f11703c = nVar.f11703c;
        this.f11704d = nVar.f11704d;
        this.f11705e = nVar.f11705e;
        this.f11706f = nVar.f11706f;
        this.f11707g = nVar.f11707g;
        this.f11708h = nVar.f11708h;
        this.f11709i = nVar.f11709i;
        this.f11710j = nVar.f11710j;
    }

    public n(String str, String str2, int i2, String str3, m mVar, int i3, List<o> list, int i4, long j2) {
        this.f11702b = str;
        this.f11703c = str2;
        this.f11704d = i2;
        this.f11705e = str3;
        this.f11706f = mVar;
        this.f11707g = i3;
        this.f11708h = list;
        this.f11709i = i4;
        this.f11710j = j2;
    }

    public m I() {
        return this.f11706f;
    }

    public String J() {
        return this.f11703c;
    }

    public List<o> K() {
        List<o> list = this.f11708h;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String L() {
        return this.f11702b;
    }

    public int M() {
        return this.f11704d;
    }

    public int N() {
        return this.f11707g;
    }

    public int O() {
        return this.f11709i;
    }

    public long P() {
        return this.f11710j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0027. Please report as an issue. */
    public final JSONObject Q() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11702b)) {
                jSONObject.put(Name.MARK, this.f11702b);
            }
            if (!TextUtils.isEmpty(this.f11703c)) {
                jSONObject.put("entity", this.f11703c);
            }
            switch (this.f11704d) {
                case 1:
                    str = "ALBUM";
                    jSONObject.put("queueType", str);
                    break;
                case 2:
                    str = "PLAYLIST";
                    jSONObject.put("queueType", str);
                    break;
                case 3:
                    str = "AUDIOBOOK";
                    jSONObject.put("queueType", str);
                    break;
                case 4:
                    str = "RADIO_STATION";
                    jSONObject.put("queueType", str);
                    break;
                case 5:
                    str = "PODCAST_SERIES";
                    jSONObject.put("queueType", str);
                    break;
                case 6:
                    str = "TV_SERIES";
                    jSONObject.put("queueType", str);
                    break;
                case 7:
                    str = "VIDEO_PLAYLIST";
                    jSONObject.put("queueType", str);
                    break;
                case 8:
                    str = "LIVE_TV";
                    jSONObject.put("queueType", str);
                    break;
                case 9:
                    str = "MOVIE";
                    jSONObject.put("queueType", str);
                    break;
            }
            if (!TextUtils.isEmpty(this.f11705e)) {
                jSONObject.put("name", this.f11705e);
            }
            m mVar = this.f11706f;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.N());
            }
            String strB = c.f.a.c.d.v.c.a.b(Integer.valueOf(this.f11707g));
            if (strB != null) {
                jSONObject.put("repeatMode", strB);
            }
            List<o> list = this.f11708h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<o> it = this.f11708h.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().R());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f11709i);
            long j2 = this.f11710j;
            if (j2 != -1) {
                jSONObject.put("startTime", c.f.a.c.d.v.a.b(j2));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void b(JSONObject jSONObject) {
        clear();
        if (jSONObject == null) {
            return;
        }
        this.f11702b = jSONObject.optString(Name.MARK, null);
        this.f11703c = jSONObject.optString("entity", null);
        String strOptString = jSONObject.optString("queueType");
        strOptString.hashCode();
        switch (strOptString) {
            case "PODCAST_SERIES":
                this.f11704d = 5;
                break;
            case "RADIO_STATION":
                this.f11704d = 4;
                break;
            case "PLAYLIST":
                this.f11704d = 2;
                break;
            case "AUDIOBOOK":
                this.f11704d = 3;
                break;
            case "TV_SERIES":
                this.f11704d = 6;
                break;
            case "ALBUM":
                this.f11704d = 1;
                break;
            case "MOVIE":
                this.f11704d = 9;
                break;
            case "VIDEO_PLAYLIST":
                this.f11704d = 7;
                break;
            case "LIVE_TV":
                this.f11704d = 8;
                break;
        }
        this.f11705e = jSONObject.optString("name", null);
        if (jSONObject.has("containerMetadata")) {
            this.f11706f = new m.a().b(jSONObject.optJSONObject("containerMetadata")).a();
        }
        Integer numA = c.f.a.c.d.v.c.a.a(jSONObject.optString("repeatMode"));
        if (numA != null) {
            this.f11707g = numA.intValue();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            this.f11708h = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    try {
                        this.f11708h.add(new o(jSONObjectOptJSONObject));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        this.f11709i = jSONObject.optInt("startIndex", this.f11709i);
        if (jSONObject.has("startTime")) {
            this.f11710j = c.f.a.c.d.v.a.c(jSONObject.optDouble("startTime", this.f11710j));
        }
    }

    public final void clear() {
        this.f11702b = null;
        this.f11703c = null;
        this.f11704d = 0;
        this.f11705e = null;
        this.f11707g = 0;
        this.f11708h = null;
        this.f11709i = 0;
        this.f11710j = -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return TextUtils.equals(this.f11702b, nVar.f11702b) && TextUtils.equals(this.f11703c, nVar.f11703c) && this.f11704d == nVar.f11704d && TextUtils.equals(this.f11705e, nVar.f11705e) && c.f.a.c.f.q.n.a(this.f11706f, nVar.f11706f) && this.f11707g == nVar.f11707g && c.f.a.c.f.q.n.a(this.f11708h, nVar.f11708h) && this.f11709i == nVar.f11709i && this.f11710j == nVar.f11710j;
    }

    public String getName() {
        return this.f11705e;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f11702b, this.f11703c, Integer.valueOf(this.f11704d), this.f11705e, this.f11706f, Integer.valueOf(this.f11707g), this.f11708h, Integer.valueOf(this.f11709i), Long.valueOf(this.f11710j));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, L(), false);
        c.f.a.c.f.q.w.c.s(parcel, 3, J(), false);
        c.f.a.c.f.q.w.c.l(parcel, 4, M());
        c.f.a.c.f.q.w.c.s(parcel, 5, getName(), false);
        c.f.a.c.f.q.w.c.r(parcel, 6, I(), i2, false);
        c.f.a.c.f.q.w.c.l(parcel, 7, N());
        c.f.a.c.f.q.w.c.w(parcel, 8, K(), false);
        c.f.a.c.f.q.w.c.l(parcel, 9, O());
        c.f.a.c.f.q.w.c.o(parcel, 10, P());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
