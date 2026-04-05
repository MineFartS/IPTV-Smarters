package c.f.a.c.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator<n0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        boolean zM = false;
        String strF = null;
        IBinder iBinderT = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 2) {
                iBinderT = c.f.a.c.f.q.w.b.t(parcel, iS);
            } else if (iL == 3) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new n0(strF, iBinderT, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n0[] newArray(int i2) {
        return new n0[i2];
    }
}
