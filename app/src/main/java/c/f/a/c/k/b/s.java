package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            if (c.f.a.c.f.q.w.b.l(iS) != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                bundleA = c.f.a.c.f.q.w.b.a(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new r(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}
