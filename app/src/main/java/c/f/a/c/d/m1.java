package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        m mVar = null;
        ArrayList arrayListJ = null;
        long jW = 0;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 4:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 5:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 6:
                    mVar = (m) c.f.a.c.f.q.w.b.e(parcel, iS, m.CREATOR);
                    break;
                case 7:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 8:
                    arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, o.CREATOR);
                    break;
                case 9:
                    iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 10:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new n(strF, strF2, iU, strF3, mVar, iU2, arrayListJ, iU3, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n[] newArray(int i2) {
        return new n[i2];
    }
}
