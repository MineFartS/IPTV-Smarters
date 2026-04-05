package c.f.a.c.m.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f14538c;

    public j(int i2, j0 j0Var) {
        this.f14537b = i2;
        this.f14538c = j0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f14537b);
        c.f.a.c.f.q.w.c.r(parcel, 2, this.f14538c, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
