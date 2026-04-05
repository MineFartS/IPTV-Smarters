package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements Parcelable.Creator<MediaInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        String strF = null;
        String strF2 = null;
        l lVar = null;
        ArrayList arrayListJ = null;
        r rVar = null;
        String strF3 = null;
        ArrayList arrayListJ2 = null;
        ArrayList arrayListJ3 = null;
        String strF4 = null;
        s sVar = null;
        String strF5 = null;
        String strF6 = null;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 3:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 4:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 5:
                    lVar = (l) c.f.a.c.f.q.w.b.e(parcel, iS, l.CREATOR);
                    break;
                case 6:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 7:
                    arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, MediaTrack.CREATOR);
                    break;
                case 8:
                    rVar = (r) c.f.a.c.f.q.w.b.e(parcel, iS, r.CREATOR);
                    break;
                case 9:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 10:
                    arrayListJ2 = c.f.a.c.f.q.w.b.j(parcel, iS, b.CREATOR);
                    break;
                case 11:
                    arrayListJ3 = c.f.a.c.f.q.w.b.j(parcel, iS, a.CREATOR);
                    break;
                case 12:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 13:
                    sVar = (s) c.f.a.c.f.q.w.b.e(parcel, iS, s.CREATOR);
                    break;
                case 14:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 15:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 16:
                    strF6 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new MediaInfo(strF, iU, strF2, lVar, jW, arrayListJ, rVar, strF3, arrayListJ2, arrayListJ3, strF4, sVar, jW2, strF5, strF6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo[] newArray(int i2) {
        return new MediaInfo[i2];
    }
}
