package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                jW = c.f.a.c.f.q.w.b.w(parcel, iS);
            } else if (iL == 3) {
                jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
            } else if (iL == 4) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 5) {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL != 6) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                jW3 = c.f.a.c.f.q.w.b.w(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new c(jW, jW2, strF, strF2, jW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i2) {
        return new c[i2];
    }
}
