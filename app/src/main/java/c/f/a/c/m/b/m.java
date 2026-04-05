package c.f.a.c.m.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        c.f.a.c.f.b bVar = null;
        l0 l0Var = null;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                bVar = (c.f.a.c.f.b) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.f.b.CREATOR);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                l0Var = (l0) c.f.a.c.f.q.w.b.e(parcel, iS, l0.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new l(iU, bVar, l0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l[] newArray(int i2) {
        return new l[i2];
    }
}
