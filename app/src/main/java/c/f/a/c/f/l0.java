package c.f.a.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f12345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12346d;

    public l0(boolean z, String str, int i2) {
        this.f12344b = z;
        this.f12345c = str;
        this.f12346d = k0.a(i2) - 1;
    }

    @Nullable
    public final String I() {
        return this.f12345c;
    }

    public final int J() {
        return k0.a(this.f12346d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.c(parcel, 1, this.f12344b);
        c.f.a.c.f.q.w.c.s(parcel, 2, this.f12345c, false);
        c.f.a.c.f.q.w.c.l(parcel, 3, this.f12346d);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f12344b;
    }
}
