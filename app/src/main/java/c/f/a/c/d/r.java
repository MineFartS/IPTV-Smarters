package c.f.a.c.d;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<r> CREATOR = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JSONObject f11766n;

    public r() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public r(float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2) {
        this.f11754b = f2;
        this.f11755c = i2;
        this.f11756d = i3;
        this.f11757e = i4;
        this.f11758f = i5;
        this.f11759g = i6;
        this.f11760h = i7;
        this.f11761i = i8;
        this.f11762j = str;
        this.f11763k = i9;
        this.f11764l = i10;
        this.f11765m = str2;
        if (str2 == null) {
            this.f11766n = null;
            return;
        }
        try {
            this.f11766n = new JSONObject(this.f11765m);
        } catch (JSONException unused) {
            this.f11766n = null;
            this.f11765m = null;
        }
    }

    public static int U(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static String V(int i2) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Integer.valueOf(Color.alpha(i2)));
    }

    public final int I() {
        return this.f11756d;
    }

    public final int J() {
        return this.f11758f;
    }

    public final int K() {
        return this.f11757e;
    }

    public final String L() {
        return this.f11762j;
    }

    public final int M() {
        return this.f11763k;
    }

    public final float N() {
        return this.f11754b;
    }

    public final int O() {
        return this.f11764l;
    }

    public final int P() {
        return this.f11755c;
    }

    public final int Q() {
        return this.f11760h;
    }

    public final int R() {
        return this.f11761i;
    }

    public final int S() {
        return this.f11759g;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf A[Catch: JSONException -> 0x00db, TryCatch #0 {JSONException -> 0x00db, blocks: (B:3:0x0005, B:5:0x0011, B:6:0x001a, B:8:0x001e, B:9:0x0027, B:19:0x003e, B:24:0x004e, B:26:0x0052, B:27:0x005b, B:33:0x0068, B:36:0x0075, B:38:0x0079, B:39:0x0082, B:41:0x0086, B:42:0x008d, B:44:0x0091, B:45:0x0096, B:50:0x00a0, B:57:0x00b6, B:65:0x00c5, B:69:0x00d2, B:71:0x00d6, B:68:0x00cf, B:34:0x006e, B:35:0x0072, B:23:0x004b), top: B:74:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[Catch: JSONException -> 0x00db, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00db, blocks: (B:3:0x0005, B:5:0x0011, B:6:0x001a, B:8:0x001e, B:9:0x0027, B:19:0x003e, B:24:0x004e, B:26:0x0052, B:27:0x005b, B:33:0x0068, B:36:0x0075, B:38:0x0079, B:39:0x0082, B:41:0x0086, B:42:0x008d, B:44:0x0091, B:45:0x0096, B:50:0x00a0, B:57:0x00b6, B:65:0x00c5, B:69:0x00d2, B:71:0x00d6, B:68:0x00cf, B:34:0x006e, B:35:0x0072, B:23:0x004b), top: B:74:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject T() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.d.r.T():org.json.JSONObject");
    }

    public final void b(JSONObject jSONObject) throws JSONException {
        int i2;
        this.f11754b = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f11755c = U(jSONObject.optString("foregroundColor"));
        this.f11756d = U(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f11757e = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f11757e = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f11757e = 2;
            } else if ("RAISED".equals(string)) {
                this.f11757e = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f11757e = 4;
            }
        }
        this.f11758f = U(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f11759g = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f11759g = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f11759g = 2;
            }
        }
        this.f11760h = U(jSONObject.optString("windowColor"));
        if (this.f11759g == 2) {
            this.f11761i = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f11762j = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f11763k = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f11763k = 1;
            } else if ("SERIF".equals(string3)) {
                this.f11763k = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f11763k = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f11763k = 4;
            } else {
                if (!"CURSIVE".equals(string3)) {
                    i2 = "SMALL_CAPITALS".equals(string3) ? 6 : 5;
                }
                this.f11763k = i2;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f11764l = 0;
            } else if ("BOLD".equals(string4)) {
                this.f11764l = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f11764l = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f11764l = 3;
            }
        }
        this.f11766n = jSONObject.optJSONObject("customData");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        JSONObject jSONObject = this.f11766n;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = rVar.f11766n;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || c.f.a.c.f.t.k.a(jSONObject, jSONObject2)) && this.f11754b == rVar.f11754b && this.f11755c == rVar.f11755c && this.f11756d == rVar.f11756d && this.f11757e == rVar.f11757e && this.f11758f == rVar.f11758f && this.f11759g == rVar.f11759g && this.f11761i == rVar.f11761i && c.f.a.c.d.v.a.f(this.f11762j, rVar.f11762j) && this.f11763k == rVar.f11763k && this.f11764l == rVar.f11764l;
    }

    public final int hashCode() {
        return c.f.a.c.f.q.n.b(Float.valueOf(this.f11754b), Integer.valueOf(this.f11755c), Integer.valueOf(this.f11756d), Integer.valueOf(this.f11757e), Integer.valueOf(this.f11758f), Integer.valueOf(this.f11759g), Integer.valueOf(this.f11760h), Integer.valueOf(this.f11761i), this.f11762j, Integer.valueOf(this.f11763k), Integer.valueOf(this.f11764l), String.valueOf(this.f11766n));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.f11766n;
        this.f11765m = jSONObject == null ? null : jSONObject.toString();
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.i(parcel, 2, N());
        c.f.a.c.f.q.w.c.l(parcel, 3, P());
        c.f.a.c.f.q.w.c.l(parcel, 4, I());
        c.f.a.c.f.q.w.c.l(parcel, 5, K());
        c.f.a.c.f.q.w.c.l(parcel, 6, J());
        c.f.a.c.f.q.w.c.l(parcel, 7, S());
        c.f.a.c.f.q.w.c.l(parcel, 8, Q());
        c.f.a.c.f.q.w.c.l(parcel, 9, R());
        c.f.a.c.f.q.w.c.s(parcel, 10, L(), false);
        c.f.a.c.f.q.w.c.l(parcel, 11, M());
        c.f.a.c.f.q.w.c.l(parcel, 12, O());
        c.f.a.c.f.q.w.c.s(parcel, 13, this.f11765m, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
