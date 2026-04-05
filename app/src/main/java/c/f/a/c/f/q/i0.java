package c.f.a.c.f.q;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        long jW = 0;
        long jW2 = 0;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 1:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 2:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 3:
                    iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 4:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 5:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 6:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 7:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 8:
                    iU4 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new m(iU, iU2, iU3, jW, jW2, strF, strF2, iU4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m[] newArray(int i2) {
        return new m[i2];
    }
}
