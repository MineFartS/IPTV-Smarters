package c.f.a.c.f.p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.n;
import c.f.a.c.f.q.w.c;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f12543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12545e;

    public a(int i2, Uri uri, int i3, int i4) {
        this.f12542b = i2;
        this.f12543c = uri;
        this.f12544d = i3;
        this.f12545e = i4;
    }

    public a(@RecentlyNonNull Uri uri) {
        this(uri, 0, 0);
    }

    public a(@RecentlyNonNull Uri uri, int i2, int i3) {
        this(1, uri, i2, i3);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@RecentlyNonNull JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public int I() {
        return this.f12545e;
    }

    @RecentlyNonNull
    public Uri J() {
        return this.f12543c;
    }

    public int K() {
        return this.f12544d;
    }

    @RecentlyNonNull
    public JSONObject L() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f12543c.toString());
            jSONObject.put("width", this.f12544d);
            jSONObject.put("height", this.f12545e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (n.a(this.f12543c, aVar.f12543c) && this.f12544d == aVar.f12544d && this.f12545e == aVar.f12545e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return n.b(this.f12543c, Integer.valueOf(this.f12544d), Integer.valueOf(this.f12545e));
    }

    @RecentlyNonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f12544d), Integer.valueOf(this.f12545e), this.f12543c.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f12542b);
        c.r(parcel, 2, J(), i2, false);
        c.l(parcel, 3, K());
        c.l(parcel, 4, I());
        c.b(parcel, iA);
    }
}
