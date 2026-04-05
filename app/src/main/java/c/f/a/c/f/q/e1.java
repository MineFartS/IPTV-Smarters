package c.f.a.c.f.q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements Parcelable.Creator<d1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d1 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        Bundle bundleA = null;
        c.f.a.c.f.d[] dVarArr = null;
        e eVar = null;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                bundleA = c.f.a.c.f.q.w.b.a(parcel, iS);
            } else if (iL == 2) {
                dVarArr = (c.f.a.c.f.d[]) c.f.a.c.f.q.w.b.i(parcel, iS, c.f.a.c.f.d.CREATOR);
            } else if (iL == 3) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                eVar = (e) c.f.a.c.f.q.w.b.e(parcel, iS, e.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new d1(bundleA, dVarArr, iU, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d1[] newArray(int i2) {
        return new d1[i2];
    }
}
