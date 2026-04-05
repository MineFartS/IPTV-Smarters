package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        String strF = null;
        String strF2 = null;
        aa aaVar = null;
        String strF3 = null;
        t tVar = null;
        t tVar2 = null;
        t tVar3 = null;
        boolean zM = false;
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
                    aaVar = (aa) c.f.a.c.f.q.w.b.e(parcel, iS, aa.CREATOR);
                    break;
                case 5:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 6:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 7:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 8:
                    tVar = (t) c.f.a.c.f.q.w.b.e(parcel, iS, t.CREATOR);
                    break;
                case 9:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 10:
                    tVar2 = (t) c.f.a.c.f.q.w.b.e(parcel, iS, t.CREATOR);
                    break;
                case 11:
                    jW3 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 12:
                    tVar3 = (t) c.f.a.c.f.q.w.b.e(parcel, iS, t.CREATOR);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new b(strF, strF2, aaVar, jW, zM, strF3, tVar, jW2, tVar2, jW3, tVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
