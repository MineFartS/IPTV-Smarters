package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        x xVar = null;
        x xVar2 = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                xVar = (x) c.f.a.c.f.q.w.b.e(parcel, iS, x.CREATOR);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                xVar2 = (x) c.f.a.c.f.q.w.b.e(parcel, iS, x.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new z(xVar, xVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ z[] newArray(int i2) {
        return new z[i2];
    }
}
