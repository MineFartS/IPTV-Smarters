package c.f.a.c.d.v;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements Parcelable.Creator<p0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        c.f.a.c.d.d dVar = null;
        c.f.a.c.d.z zVar = null;
        double dO = 0.0d;
        double dO2 = 0.0d;
        boolean zM = false;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    dO = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 3:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 4:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 5:
                    dVar = (c.f.a.c.d.d) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.d.d.CREATOR);
                    break;
                case 6:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 7:
                    zVar = (c.f.a.c.d.z) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.d.z.CREATOR);
                    break;
                case 8:
                    dO2 = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new p0(dO, zM, iU, dVar, iU2, zVar, dO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p0[] newArray(int i2) {
        return new p0[i2];
    }
}
