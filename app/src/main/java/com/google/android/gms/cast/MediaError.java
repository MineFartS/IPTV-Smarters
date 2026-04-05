package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.d.c1;
import c.f.a.c.f.q.w.a;
import c.f.a.c.f.q.w.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MediaError extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f24109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONObject f24112g;

    public MediaError(String str, long j2, Integer num, String str2, String str3) {
        this(str, j2, num, str2, c.f.a.c.d.v.a.a(str3));
    }

    public MediaError(String str, long j2, Integer num, String str2, JSONObject jSONObject) {
        this.f24107b = str;
        this.f24108c = j2;
        this.f24109d = num;
        this.f24110e = str2;
        this.f24112g = jSONObject;
    }

    public static MediaError M(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, jSONObject.has("reason") ? jSONObject.optString("reason") : null, jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    public Integer I() {
        return this.f24109d;
    }

    public String J() {
        return this.f24110e;
    }

    public long K() {
        return this.f24108c;
    }

    public String L() {
        return this.f24107b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.f24112g;
        this.f24111f = jSONObject == null ? null : jSONObject.toString();
        int iA = c.a(parcel);
        c.s(parcel, 2, L(), false);
        c.o(parcel, 3, K());
        c.n(parcel, 4, I(), false);
        c.s(parcel, 5, J(), false);
        c.s(parcel, 6, this.f24111f, false);
        c.b(parcel, iA);
    }
}
