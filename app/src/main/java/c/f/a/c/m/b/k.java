package c.f.a.c.m.b;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.c.f.q.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        j0 j0Var = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                j0Var = (j0) c.f.a.c.f.q.w.b.e(parcel, iS, j0.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new j(iU, j0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j[] newArray(int i2) {
        return new j[i2];
    }
}
