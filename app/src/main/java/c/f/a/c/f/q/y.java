package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, m.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new s(iU, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s[] newArray(int i2) {
        return new s[i2];
    }
}
