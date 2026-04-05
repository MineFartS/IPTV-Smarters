package c.f.a.c.d.u;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends c.f.a.c.j.c.a implements x0 {
    public x() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            c.f.a.c.g.a aVarN = n(parcel.readString());
            parcel2.writeNoException();
            c.f.a.c.j.c.v0.c(parcel2, aVarN);
        } else if (i2 == 2) {
            boolean zM1 = M1();
            parcel2.writeNoException();
            c.f.a.c.j.c.v0.a(parcel2, zM1);
        } else if (i2 == 3) {
            String strT2 = t2();
            parcel2.writeNoException();
            parcel2.writeString(strT2);
        } else {
            if (i2 != 4) {
                return false;
            }
            c();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
