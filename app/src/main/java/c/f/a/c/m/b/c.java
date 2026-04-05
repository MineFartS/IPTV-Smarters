package c.f.a.c.m.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        Intent intent = null;
        int iU2 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                intent = (Intent) c.f.a.c.f.q.w.b.e(parcel, iS, Intent.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new b(iU, iU2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
