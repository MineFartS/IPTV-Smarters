package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        double dO = 0.0d;
        double dO2 = 0.0d;
        double dO3 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArrD = null;
        String strF = null;
        int iU = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    mediaInfo = (MediaInfo) c.f.a.c.f.q.w.b.e(parcel, iS, MediaInfo.CREATOR);
                    break;
                case 3:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 4:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 5:
                    dO = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 6:
                    dO2 = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 7:
                    dO3 = c.f.a.c.f.q.w.b.o(parcel, iS);
                    break;
                case 8:
                    jArrD = c.f.a.c.f.q.w.b.d(parcel, iS);
                    break;
                case 9:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new o(mediaInfo, iU, zM, dO, dO2, dO3, jArrD, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i2) {
        return new o[i2];
    }
}
