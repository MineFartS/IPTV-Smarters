package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements Parcelable.Creator<MediaTrack> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        ArrayList<String> arrayListH = null;
        String strF5 = null;
        long jW = 0;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 3:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 4:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 5:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 6:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 7:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 8:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 9:
                    arrayListH = c.f.a.c.f.q.w.b.h(parcel, iS);
                    break;
                case 10:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new MediaTrack(jW, iU, strF, strF2, strF3, strF4, iU2, arrayListH, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack[] newArray(int i2) {
        return new MediaTrack[i2];
    }
}
