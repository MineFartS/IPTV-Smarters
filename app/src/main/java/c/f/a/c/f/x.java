package c.f.a.c.f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        int iU = 0;
        long jW = -1;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 2) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                jW = c.f.a.c.f.q.w.b.w(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new d(strF, iU, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d[] newArray(int i2) {
        return new d[i2];
    }
}
