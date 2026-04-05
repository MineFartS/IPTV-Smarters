package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new s(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i2) {
        return new s[i2];
    }
}
