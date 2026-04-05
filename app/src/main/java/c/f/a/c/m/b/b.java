package c.f.a.c.m.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c.f.a.c.f.q.w.a implements c.f.a.c.f.o.j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f14534d;

    public b() {
        this(2, 0, null);
    }

    public b(int i2, int i3, Intent intent) {
        this.f14532b = i2;
        this.f14533c = i3;
        this.f14534d = intent;
    }

    @Override // c.f.a.c.f.o.j
    public final Status C() {
        return this.f14533c == 0 ? Status.f24230b : Status.f24234f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f14532b);
        c.f.a.c.f.q.w.c.l(parcel, 2, this.f14533c);
        c.f.a.c.f.q.w.c.r(parcel, 3, this.f14534d, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
