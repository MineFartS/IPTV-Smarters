package c.f.a.c.d.u.u;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 3) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new f(strF, iU, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i2) {
        return new f[i2];
    }
}
