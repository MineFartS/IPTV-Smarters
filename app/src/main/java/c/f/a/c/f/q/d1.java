package c.f.a.c.f.q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<d1> CREATOR = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f12573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.c.f.d[] f12574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f12576e;

    public d1() {
    }

    public d1(Bundle bundle, c.f.a.c.f.d[] dVarArr, int i2, e eVar) {
        this.f12573b = bundle;
        this.f12574c = dVarArr;
        this.f12575d = i2;
        this.f12576e = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.e(parcel, 1, this.f12573b, false);
        c.f.a.c.f.q.w.c.v(parcel, 2, this.f12574c, i2, false);
        c.f.a.c.f.q.w.c.l(parcel, 3, this.f12575d);
        c.f.a.c.f.q.w.c.r(parcel, 4, this.f12576e, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
