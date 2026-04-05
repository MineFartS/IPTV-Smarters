package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Parcelable.Creator<t> {
    public static void a(t tVar, Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, tVar.f14310b, false);
        c.f.a.c.f.q.w.c.r(parcel, 3, tVar.f14311c, i2, false);
        c.f.a.c.f.q.w.c.s(parcel, 4, tVar.f14312d, false);
        c.f.a.c.f.q.w.c.o(parcel, 5, tVar.f14313e);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        r rVar = null;
        String strF2 = null;
        long jW = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 3) {
                rVar = (r) c.f.a.c.f.q.w.b.e(parcel, iS, r.CREATOR);
            } else if (iL == 4) {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL != 5) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                jW = c.f.a.c.f.q.w.b.w(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new t(strF, rVar, strF2, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t[] newArray(int i2) {
        return new t[i2];
    }
}
