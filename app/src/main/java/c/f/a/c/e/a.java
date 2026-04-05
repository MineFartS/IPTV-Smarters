package c.f.a.c.e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f12237b;

    public a(Intent intent) {
        this.f12237b = intent;
    }

    public final Intent I() {
        return this.f12237b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.r(parcel, 1, this.f12237b, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
