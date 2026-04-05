package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends c.f.a.c.f.q.w.a implements Iterable<String> {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f14270b;

    public r(Bundle bundle) {
        this.f14270b = bundle;
    }

    public final String I(String str) {
        return this.f14270b.getString(str);
    }

    public final int J() {
        return this.f14270b.size();
    }

    public final Bundle K() {
        return new Bundle(this.f14270b);
    }

    public final Object b(String str) {
        return this.f14270b.get(str);
    }

    public final Long e(String str) {
        return Long.valueOf(this.f14270b.getLong("value"));
    }

    public final Double h(String str) {
        return Double.valueOf(this.f14270b.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new q(this);
    }

    public final String toString() {
        return this.f14270b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.e(parcel, 2, K(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
