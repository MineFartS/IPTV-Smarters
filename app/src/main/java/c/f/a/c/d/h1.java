package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        MediaInfo mediaInfo = null;
        n nVar = null;
        Boolean boolN = null;
        long[] jArrD = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        double dO = 0.0d;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    mediaInfo = (MediaInfo) c.f.a.c.f.q.w.b.e(parcel, iS, MediaInfo.CREATOR);
                    break;
                case 3:
                    nVar = (n) c.f.a.c.f.q.w.b.e(parcel, iS, n.CREATOR);
                    break;
                case 4:
                    boolN = c.f.a.c.f.q.w.b.n(parcel, iS);
                    break;
                case 5:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 6:
                    dO = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 7:
                    jArrD = c.f.a.c.f.q.w.b.d(parcel, iS);
                    break;
                case 8:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 9:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 10:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 11:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 12:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 13:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new k(mediaInfo, nVar, boolN, jW, dO, jArrD, strF, strF2, strF3, strF4, strF5, jW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i2) {
        return new k[i2];
    }
}
