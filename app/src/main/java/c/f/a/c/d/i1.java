package c.f.a.c.d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        ArrayList arrayListJ = null;
        Bundle bundleA = null;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, c.f.a.c.f.p.a.CREATOR);
            } else if (iL == 3) {
                bundleA = c.f.a.c.f.q.w.b.a(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new l(arrayListJ, bundleA, iU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i2) {
        return new l[i2];
    }
}
