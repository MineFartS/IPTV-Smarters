package c.f.a.c.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements Parcelable.Creator<i0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        IBinder iBinderT = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 2) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL == 3) {
                zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL == 4) {
                iBinderT = c.f.a.c.f.q.w.b.t(parcel, iS);
            } else if (iL != 5) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                zM3 = c.f.a.c.f.q.w.b.m(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new i0(strF, zM, zM2, iBinderT, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i0[] newArray(int i2) {
        return new i0[i2];
    }
}
