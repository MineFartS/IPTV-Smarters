package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        double dO = 0.0d;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 3) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 4) {
                arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, l.CREATOR);
            } else if (iL == 5) {
                arrayListJ2 = c.f.a.c.f.q.w.b.j(parcel, iS, c.f.a.c.f.p.a.CREATOR);
            } else if (iL != 6) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                dO = c.f.a.c.f.q.w.b.o(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new m(iU, strF, arrayListJ, arrayListJ2, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i2) {
        return new m[i2];
    }
}
