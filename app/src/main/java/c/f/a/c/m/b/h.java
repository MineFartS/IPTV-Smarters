package c.f.a.c.m.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends c.f.a.c.f.q.w.a implements c.f.a.c.f.o.j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f14535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14536c;

    public h(List<String> list, String str) {
        this.f14535b = list;
        this.f14536c = str;
    }

    @Override // c.f.a.c.f.o.j
    public final Status C() {
        return this.f14536c != null ? Status.f24230b : Status.f24234f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.u(parcel, 1, this.f14535b, false);
        c.f.a.c.f.q.w.c.s(parcel, 2, this.f14536c, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
