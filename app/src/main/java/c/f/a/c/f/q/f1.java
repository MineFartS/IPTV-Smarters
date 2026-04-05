package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        q qVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 1:
                    qVar = (q) c.f.a.c.f.q.w.b.e(parcel, iS, q.CREATOR);
                    break;
                case 2:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 3:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 4:
                    iArrC = c.f.a.c.f.q.w.b.c(parcel, iS);
                    break;
                case 5:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 6:
                    iArrC2 = c.f.a.c.f.q.w.b.c(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new e(qVar, zM, zM2, iArrC, iU, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e[] newArray(int i2) {
        return new e[i2];
    }
}
