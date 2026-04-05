package c.f.a.c.f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator<l0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        boolean zM = false;
        String strF = null;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new l0(zM, strF, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l0[] newArray(int i2) {
        return new l0[i2];
    }
}
