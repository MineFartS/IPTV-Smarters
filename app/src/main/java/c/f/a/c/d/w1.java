package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 3) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new t(iU, iU2, iU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i2) {
        return new t[i2];
    }
}
