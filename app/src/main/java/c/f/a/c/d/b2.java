package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 implements Parcelable.Creator<CastDevice> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        ArrayList arrayListJ = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        byte[] bArrB = null;
        String strF9 = null;
        int iU = 0;
        int iU2 = 0;
        int iU3 = -1;
        int iU4 = 0;
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
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 5:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 6:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 7:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 8:
                    arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, c.f.a.c.f.p.a.CREATOR);
                    break;
                case 9:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 10:
                    iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 11:
                    strF6 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 12:
                    strF7 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 13:
                    iU4 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 14:
                    strF8 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 15:
                    bArrB = c.f.a.c.f.q.w.b.b(parcel, iS);
                    break;
                case 16:
                    strF9 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new CastDevice(strF, strF2, strF3, strF4, strF5, iU, arrayListJ, iU2, iU3, strF6, strF7, iU4, strF8, bArrB, strF9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice[] newArray(int i2) {
        return new CastDevice[i2];
    }
}
