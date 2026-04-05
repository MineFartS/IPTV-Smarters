package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iU2 = 0;
        int iU3 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL == 3) {
                zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL == 4) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 5) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new q(iU, zM, zM2, iU2, iU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q[] newArray(int i2) {
        return new q[i2];
    }
}
