package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        s sVar = null;
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
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 5:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 6:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 7:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 8:
                    strF6 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 9:
                    strF7 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 10:
                    strF8 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 11:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 12:
                    strF9 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 13:
                    sVar = (s) c.f.a.c.f.q.w.b.e(parcel, iS, s.CREATOR);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new a(strF, strF2, jW, strF3, strF4, strF5, strF6, strF7, strF8, jW2, strF9, sVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
