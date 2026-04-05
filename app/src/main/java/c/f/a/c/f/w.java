package c.f.a.c.f;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        PendingIntent pendingIntent = null;
        String strF = null;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) c.f.a.c.f.q.w.b.e(parcel, iS, PendingIntent.CREATOR);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new b(iU, iU2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
