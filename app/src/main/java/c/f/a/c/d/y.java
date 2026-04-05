package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new g(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i2) {
        return new g[i2];
    }
}
