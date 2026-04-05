package c.f.a.c.d.u;

import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y0 extends c.f.a.c.j.c.a implements v0 {
    public y0() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                c.f.a.c.g.a aVarJ1 = J1();
                parcel2.writeNoException();
                c.f.a.c.j.c.v0.c(parcel2, aVarJ1);
                return true;
            case 2:
                N1(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()));
                break;
            case 3:
                Q(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readString());
                break;
            case 4:
                e2(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 5:
                d1(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()));
                break;
            case 6:
                u2(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                s(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readString());
                break;
            case 8:
                J2(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), c.f.a.c.j.c.v0.e(parcel));
                break;
            case 9:
                u(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                P(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 11:
                c();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
