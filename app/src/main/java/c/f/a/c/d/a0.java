package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                fQ = c.f.a.c.f.q.w.b.q(parcel, iS);
            } else if (iL == 3) {
                fQ2 = c.f.a.c.f.q.w.b.q(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                fQ3 = c.f.a.c.f.q.w.b.q(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new x(fQ, fQ2, fQ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x[] newArray(int i2) {
        return new x[i2];
    }
}
