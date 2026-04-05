package c.f.a.c.d.u.u;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class f extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<f> CREATOR = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11968d;

    public f(String str, int i2, String str2) {
        this.f11966b = str;
        this.f11967c = i2;
        this.f11968d = str2;
    }

    public String I() {
        return this.f11966b;
    }

    public String J() {
        return this.f11968d;
    }

    public int K() {
        return this.f11967c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, I(), false);
        c.f.a.c.f.q.w.c.l(parcel, 3, K());
        c.f.a.c.f.q.w.c.s(parcel, 4, J(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
