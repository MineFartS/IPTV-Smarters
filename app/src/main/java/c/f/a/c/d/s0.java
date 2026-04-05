package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String[] strArrG = null;
        long jW = 0;
        long jW2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 3:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 4:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 5:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 6:
                    strArrG = c.f.a.c.f.q.w.b.g(parcel, iS);
                    break;
                case 7:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new b(jW, strF, jW2, zM, strArrG, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
