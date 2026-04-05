package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<m> CREATOR = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<l> f11694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<c.f.a.c.f.p.a> f11695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f11696f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f11697a = new m();

        public m a() {
            return new m();
        }

        public final a b(JSONObject jSONObject) {
            this.f11697a.b(jSONObject);
            return this;
        }
    }

    public m() {
        clear();
    }

    public m(int i2, String str, List<l> list, List<c.f.a.c.f.p.a> list2, double d2) {
        this.f11692b = i2;
        this.f11693c = str;
        this.f11694d = list;
        this.f11695e = list2;
        this.f11696f = d2;
    }

    public m(m mVar) {
        this.f11692b = mVar.f11692b;
        this.f11693c = mVar.f11693c;
        this.f11694d = mVar.f11694d;
        this.f11695e = mVar.f11695e;
        this.f11696f = mVar.f11696f;
    }

    public double I() {
        return this.f11696f;
    }

    public List<c.f.a.c.f.p.a> J() {
        List<c.f.a.c.f.p.a> list = this.f11695e;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int K() {
        return this.f11692b;
    }

    public List<l> L() {
        List<l> list = this.f11694d;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public String M() {
        return this.f11693c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020 A[Catch: JSONException -> 0x0073, TryCatch #0 {JSONException -> 0x0073, blocks: (B:3:0x0005, B:10:0x0011, B:12:0x0018, B:14:0x0020, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x003c, B:22:0x0042, B:23:0x0050, B:24:0x0055, B:26:0x0059, B:28:0x005f, B:30:0x0067, B:31:0x006c), top: B:34:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: JSONException -> 0x0073, LOOP:0: B:20:0x003c->B:22:0x0042, LOOP_END, TryCatch #0 {JSONException -> 0x0073, blocks: (B:3:0x0005, B:10:0x0011, B:12:0x0018, B:14:0x0020, B:15:0x0027, B:17:0x002b, B:19:0x0031, B:20:0x003c, B:22:0x0042, B:23:0x0050, B:24:0x0055, B:26:0x0059, B:28:0x005f, B:30:0x0067, B:31:0x006c), top: B:34:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject N() {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            int r1 = r4.f11692b     // Catch: org.json.JSONException -> L73
            java.lang.String r2 = "containerType"
            if (r1 == 0) goto L15
            r3 = 1
            if (r1 == r3) goto Lf
            goto L18
        Lf:
            java.lang.String r1 = "AUDIOBOOK_CONTAINER"
        L11:
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L73
            goto L18
        L15:
            java.lang.String r1 = "GENERIC_CONTAINER"
            goto L11
        L18:
            java.lang.String r1 = r4.f11693c     // Catch: org.json.JSONException -> L73
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L73
            if (r1 != 0) goto L27
            java.lang.String r1 = "title"
            java.lang.String r2 = r4.f11693c     // Catch: org.json.JSONException -> L73
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L73
        L27:
            java.util.List<c.f.a.c.d.l> r1 = r4.f11694d     // Catch: org.json.JSONException -> L73
            if (r1 == 0) goto L55
            boolean r1 = r1.isEmpty()     // Catch: org.json.JSONException -> L73
            if (r1 != 0) goto L55
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L73
            r1.<init>()     // Catch: org.json.JSONException -> L73
            java.util.List<c.f.a.c.d.l> r2 = r4.f11694d     // Catch: org.json.JSONException -> L73
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L73
        L3c:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L73
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L73
            c.f.a.c.d.l r3 = (c.f.a.c.d.l) r3     // Catch: org.json.JSONException -> L73
            org.json.JSONObject r3 = r3.P()     // Catch: org.json.JSONException -> L73
            r1.put(r3)     // Catch: org.json.JSONException -> L73
            goto L3c
        L50:
            java.lang.String r2 = "sections"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L73
        L55:
            java.util.List<c.f.a.c.f.p.a> r1 = r4.f11695e     // Catch: org.json.JSONException -> L73
            if (r1 == 0) goto L6c
            boolean r1 = r1.isEmpty()     // Catch: org.json.JSONException -> L73
            if (r1 != 0) goto L6c
            java.util.List<c.f.a.c.f.p.a> r1 = r4.f11695e     // Catch: org.json.JSONException -> L73
            org.json.JSONArray r1 = c.f.a.c.d.v.c.b.e(r1)     // Catch: org.json.JSONException -> L73
            if (r1 == 0) goto L6c
            java.lang.String r2 = "containerImages"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L73
        L6c:
            java.lang.String r1 = "containerDuration"
            double r2 = r4.f11696f     // Catch: org.json.JSONException -> L73
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L73
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.d.m.N():org.json.JSONObject");
    }

    public final void b(JSONObject jSONObject) {
        clear();
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("containerType", BuildConfig.FLAVOR);
        strOptString.hashCode();
        if (strOptString.equals("AUDIOBOOK_CONTAINER")) {
            this.f11692b = 1;
        } else if (strOptString.equals("GENERIC_CONTAINER")) {
            this.f11692b = 0;
        }
        this.f11693c = jSONObject.optString(ChartFactory.TITLE, null);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sections");
        if (jSONArrayOptJSONArray != null) {
            this.f11694d = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    l lVar = new l();
                    lVar.h(jSONObjectOptJSONObject);
                    this.f11694d.add(lVar);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("containerImages");
        if (jSONArrayOptJSONArray2 != null) {
            ArrayList arrayList = new ArrayList();
            this.f11695e = arrayList;
            c.f.a.c.d.v.c.b.a(arrayList, jSONArrayOptJSONArray2);
        }
        this.f11696f = jSONObject.optDouble("containerDuration", this.f11696f);
    }

    public final void clear() {
        this.f11692b = 0;
        this.f11693c = null;
        this.f11694d = null;
        this.f11695e = null;
        this.f11696f = 0.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f11692b == mVar.f11692b && TextUtils.equals(this.f11693c, mVar.f11693c) && c.f.a.c.f.q.n.a(this.f11694d, mVar.f11694d) && c.f.a.c.f.q.n.a(this.f11695e, mVar.f11695e) && this.f11696f == mVar.f11696f;
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(Integer.valueOf(this.f11692b), this.f11693c, this.f11694d, this.f11695e, Double.valueOf(this.f11696f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 2, K());
        c.f.a.c.f.q.w.c.s(parcel, 3, M(), false);
        c.f.a.c.f.q.w.c.w(parcel, 4, L(), false);
        c.f.a.c.f.q.w.c.w(parcel, 5, J(), false);
        c.f.a.c.f.q.w.c.g(parcel, 6, I());
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
