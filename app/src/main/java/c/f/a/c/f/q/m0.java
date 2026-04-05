package c.f.a.c.f.q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Parcelable.Creator<l0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        IBinder iBinderT = null;
        c.f.a.c.f.b bVar = null;
        int iU = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                iBinderT = c.f.a.c.f.q.w.b.t(parcel, iS);
            } else if (iL == 3) {
                bVar = (c.f.a.c.f.b) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.f.b.CREATOR);
            } else if (iL == 4) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL != 5) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new l0(iU, iBinderT, bVar, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l0[] newArray(int i2) {
        return new l0[i2];
    }
}
