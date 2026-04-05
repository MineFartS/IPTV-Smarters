package c.f.a.c.d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList arrayListJ = null;
        ArrayList<String> arrayListH = null;
        String strF3 = null;
        Uri uri = null;
        String strF4 = null;
        String strF5 = null;
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
                    arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, c.f.a.c.f.p.a.CREATOR);
                    break;
                case 5:
                    arrayListH = c.f.a.c.f.q.w.b.h(parcel, iS);
                    break;
                case 6:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 7:
                    uri = (Uri) c.f.a.c.f.q.w.b.e(parcel, iS, Uri.CREATOR);
                    break;
                case 8:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 9:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new d(strF, strF2, arrayListJ, arrayListH, strF3, uri, strF4, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i2) {
        return new d[i2];
    }
}
