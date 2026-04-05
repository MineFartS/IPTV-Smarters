package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zd implements Parcelable.Creator<yd> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ yd createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 1:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 2:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 3:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
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
                    bundleA = c.f.a.c.f.q.w.b.a(parcel, iS);
                    break;
                case 8:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new yd(jW, jW2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ yd[] newArray(int i2) {
        return new yd[i2];
    }
}
