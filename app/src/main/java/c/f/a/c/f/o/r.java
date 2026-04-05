package c.f.a.c.f.o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        PendingIntent pendingIntent = null;
        c.f.a.c.f.b bVar = null;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) c.f.a.c.f.q.w.b.e(parcel, iS, PendingIntent.CREATOR);
            } else if (iL == 4) {
                bVar = (c.f.a.c.f.b) c.f.a.c.f.q.w.b.e(parcel, iS, c.f.a.c.f.b.CREATOR);
            } else if (iL != 1000) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new Status(iU, iU2, strF, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }
}
