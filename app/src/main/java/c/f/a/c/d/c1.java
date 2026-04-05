package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 implements Parcelable.Creator<MediaError> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaError createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        Integer numV = null;
        String strF2 = null;
        String strF3 = null;
        long jW = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 3) {
                jW = c.f.a.c.f.q.w.b.w(parcel, iS);
            } else if (iL == 4) {
                numV = c.f.a.c.f.q.w.b.v(parcel, iS);
            } else if (iL == 5) {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL != 6) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new MediaError(strF, jW, numV, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaError[] newArray(int i2) {
        return new MediaError[i2];
    }
}
