package c.f.a.c.d.u.u;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        IBinder iBinderT = null;
        h hVar = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 4:
                    iBinderT = c.f.a.c.f.q.w.b.t(parcel, iS);
                    break;
                case 5:
                    hVar = (h) c.f.a.c.f.q.w.b.e(parcel, iS, h.CREATOR);
                    break;
                case 6:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 7:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new a(strF, strF2, iBinderT, hVar, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
