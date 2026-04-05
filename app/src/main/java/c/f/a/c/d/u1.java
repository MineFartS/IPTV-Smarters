package c.f.a.c.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        float fQ = 0.0f;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        int iU5 = 0;
        int iU6 = 0;
        int iU7 = 0;
        int iU8 = 0;
        int iU9 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 2:
                    fQ = c.f.a.c.f.q.w.b.q(parcel, iS);
                    break;
                case 3:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 4:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 5:
                    iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 6:
                    iU4 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 7:
                    iU5 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 8:
                    iU6 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 9:
                    iU7 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 10:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 11:
                    iU8 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 12:
                    iU9 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 13:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new r(fQ, iU, iU2, iU3, iU4, iU5, iU6, iU7, strF, iU8, iU9, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}
