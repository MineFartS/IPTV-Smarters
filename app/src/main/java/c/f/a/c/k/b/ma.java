package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ma implements Parcelable.Creator<la> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ la createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        long jW4 = 0;
        long jW5 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolN = null;
        ArrayList<String> arrayListH = null;
        String strF8 = null;
        String strF9 = BuildConfig.FLAVOR;
        long jW6 = -2147483648L;
        boolean zM = true;
        boolean zM2 = false;
        int iU = 0;
        boolean zM3 = true;
        boolean zM4 = false;
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
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 7:
                    jW2 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 8:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 9:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 10:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 11:
                    jW6 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 12:
                    strF6 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 13:
                    jW3 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 14:
                    jW4 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 15:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 16:
                    zM3 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 17:
                case 20:
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
                case 18:
                    zM4 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 19:
                    strF7 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 21:
                    boolN = c.f.a.c.f.q.w.b.n(parcel, iS);
                    break;
                case 22:
                    jW5 = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 23:
                    arrayListH = c.f.a.c.f.q.w.b.h(parcel, iS);
                    break;
                case 24:
                    strF8 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 25:
                    strF9 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new la(strF, strF2, strF3, strF4, jW, jW2, strF5, zM, zM2, jW6, strF6, jW3, jW4, iU, zM3, zM4, strF7, boolN, jW5, arrayListH, strF8, strF9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ la[] newArray(int i2) {
        return new la[i2];
    }
}
