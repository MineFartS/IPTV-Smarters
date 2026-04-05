package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class aa extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<aa> CREATOR = new ba();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f13733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f13736h;

    public aa(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        this.f13730b = i2;
        this.f13731c = str;
        this.f13732d = j2;
        this.f13733e = l2;
        if (i2 == 1) {
            this.f13736h = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f13736h = d2;
        }
        this.f13734f = str2;
        this.f13735g = str3;
    }

    public aa(ca caVar) {
        this(caVar.f13809c, caVar.f13810d, caVar.f13811e, caVar.f13808b);
    }

    public aa(String str, long j2, Object obj, String str2) {
        c.f.a.c.f.q.o.e(str);
        this.f13730b = 2;
        this.f13731c = str;
        this.f13732d = j2;
        this.f13735g = str2;
        if (obj == null) {
            this.f13733e = null;
            this.f13736h = null;
            this.f13734f = null;
            return;
        }
        if (obj instanceof Long) {
            this.f13733e = (Long) obj;
            this.f13736h = null;
            this.f13734f = null;
        } else if (obj instanceof String) {
            this.f13733e = null;
            this.f13736h = null;
            this.f13734f = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f13733e = null;
            this.f13736h = (Double) obj;
            this.f13734f = null;
        }
    }

    public final Object I() {
        Long l2 = this.f13733e;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.f13736h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f13734f;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        ba.a(this, parcel, i2);
    }
}
