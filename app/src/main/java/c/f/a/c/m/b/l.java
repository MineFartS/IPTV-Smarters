package c.f.a.c.m.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.f.b f14540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f14541d;

    public l(int i2, c.f.a.c.f.b bVar, l0 l0Var) {
        this.f14539b = i2;
        this.f14540c = bVar;
        this.f14541d = l0Var;
    }

    public final c.f.a.c.f.b I() {
        return this.f14540c;
    }

    public final l0 J() {
        return this.f14541d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f14539b);
        c.f.a.c.f.q.w.c.r(parcel, 2, this.f14540c, i2, false);
        c.f.a.c.f.q.w.c.r(parcel, 3, this.f14541d, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
