package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        double dO = 0.0d;
        double dO2 = 0.0d;
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArrD = null;
        String strF = null;
        ArrayList arrayListJ = null;
        c cVar = null;
        t tVar = null;
        i iVar = null;
        n nVar = null;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        boolean zM = false;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    mediaInfo = (MediaInfo) c.f.a.c.f.q.w.b.e(parcel, iS, MediaInfo.CREATOR);
                    break;
                case 3:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 4:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 5:
                    dO = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 6:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 7:
                    iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 8:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 9:
                    jW3 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 10:
                    dO2 = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 11:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 12:
                    jArrD = c.f.a.c.f.q.w.b.d(parcel, iS);
                    break;
                case 13:
                    iU4 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 14:
                    iU5 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 15:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 16:
                    iU6 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 17:
                    arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, o.CREATOR);
                    break;
                case 18:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 19:
                    cVar = (c) c.f.a.c.f.q.w.b.e(parcel, iS, c.CREATOR);
                    break;
                case 20:
                    tVar = (t) c.f.a.c.f.q.w.b.e(parcel, iS, t.CREATOR);
                    break;
                case 21:
                    iVar = (i) c.f.a.c.f.q.w.b.e(parcel, iS, i.CREATOR);
                    break;
                case 22:
                    nVar = (n) c.f.a.c.f.q.w.b.e(parcel, iS, n.CREATOR);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new q(mediaInfo, jW, iU, dO, iU2, iU3, jW2, jW3, dO2, zM, jArrD, iU4, iU5, strF, iU6, arrayListJ, zM2, cVar, tVar, iVar, nVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i2) {
        return new q[i2];
    }
}
