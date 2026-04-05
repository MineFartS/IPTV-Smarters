package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Parcelable.Creator<y0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            if (c.f.a.c.f.q.w.b.l(iS) != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new y0(iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y0[] newArray(int i2) {
        return new y0[i2];
    }
}
