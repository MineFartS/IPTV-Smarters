package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ba implements Parcelable.Creator<aa> {
    public static void a(aa aaVar, Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, aaVar.f13730b);
        c.f.a.c.f.q.w.c.s(parcel, 2, aaVar.f13731c, false);
        c.f.a.c.f.q.w.c.o(parcel, 3, aaVar.f13732d);
        c.f.a.c.f.q.w.c.q(parcel, 4, aaVar.f13733e, false);
        c.f.a.c.f.q.w.c.j(parcel, 5, null, false);
        c.f.a.c.f.q.w.c.s(parcel, 6, aaVar.f13734f, false);
        c.f.a.c.f.q.w.c.s(parcel, 7, aaVar.f13735g, false);
        c.f.a.c.f.q.w.c.h(parcel, 8, aaVar.f13736h, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ aa createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        Long lX = null;
        Float fR = null;
        String strF2 = null;
        String strF3 = null;
        Double dP = null;
        long jW = 0;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 1:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 2:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 3:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 4:
                    lX = c.f.a.c.f.q.w.b.x(parcel, iS);
                    break;
                case 5:
                    fR = c.f.a.c.f.q.w.b.r(parcel, iS);
                    break;
                case 6:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 7:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 8:
                    dP = c.f.a.c.f.q.w.b.p(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new aa(iU, strF, jW, lX, fR, strF2, strF3, dP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ aa[] newArray(int i2) {
        return new aa[i2];
    }
}
