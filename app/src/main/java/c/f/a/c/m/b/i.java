package c.f.a.c.m.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        ArrayList<String> arrayListH = null;
        String strF = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                arrayListH = c.f.a.c.f.q.w.b.h(parcel, iS);
            } else if (iL != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new h(arrayListH, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h[] newArray(int i2) {
        return new h[i2];
    }
}
