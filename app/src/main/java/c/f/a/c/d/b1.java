package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        g gVar = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL == 3) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 4) {
                zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL != 5) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                gVar = (g) c.f.a.c.f.q.w.b.e(parcel, iS, g.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new h(zM, strF, zM2, gVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i2) {
        return new h[i2];
    }
}
