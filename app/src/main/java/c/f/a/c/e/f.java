package c.f.a.c.e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            if (c.f.a.c.f.q.w.b.l(iS) != 1) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                intent = (Intent) c.f.a.c.f.q.w.b.e(parcel, iS, Intent.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
