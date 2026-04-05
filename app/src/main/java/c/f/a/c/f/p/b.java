package c.f.a.c.f.p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        Uri uri = null;
        int iU2 = 0;
        int iU3 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                uri = (Uri) c.f.a.c.f.q.w.b.e(parcel, iS, Uri.CREATOR);
            } else if (iL == 3) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new a(iU, uri, iU2, iU3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
