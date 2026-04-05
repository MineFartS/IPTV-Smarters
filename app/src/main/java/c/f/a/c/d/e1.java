package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                jW = c.f.a.c.f.q.w.b.w(parcel, iS);
            } else if (iL == 3) {
                jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
            } else if (iL == 4) {
                zM = c.f.a.c.f.q.w.b.m(parcel, iS);
            } else if (iL != 5) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new i(jW, jW2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i2) {
        return new i[i2];
    }
}
