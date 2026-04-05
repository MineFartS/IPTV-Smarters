package c.f.a.c.d.u;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 extends c.f.a.c.j.c.a implements h0 {
    public k0() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            N(parcel.readString(), parcel.readString());
        } else if (i2 == 2) {
            Y1(parcel.readString(), (c.f.a.c.d.h) c.f.a.c.j.c.v0.b(parcel, c.f.a.c.d.h.CREATOR));
        } else if (i2 == 3) {
            a(parcel.readString());
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    return false;
                }
                c();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            }
            y2(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
