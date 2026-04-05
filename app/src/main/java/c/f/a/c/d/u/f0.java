package c.f.a.c.d.u;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        ArrayList<String> arrayListH = null;
        c.f.a.c.d.h hVar = null;
        c.f.a.c.d.u.u.a aVar = null;
        double dO = 0.0d;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 3:
                    arrayListH = c.f.a.c.f.q.w.b.h(parcel, iS);
                    break;
                case 4:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 5:
                    hVar = (c.f.a.c.d.h) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.d.h.CREATOR);
                    break;
                case 6:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 7:
                    aVar = (c.f.a.c.d.u.u.a) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.d.u.u.a.CREATOR);
                    break;
                case 8:
                    zM3 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 9:
                    dO = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 10:
                    zM4 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new c(strF, arrayListH, zM, hVar, zM2, aVar, zM3, dO, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i2) {
        return new c[i2];
    }
}
