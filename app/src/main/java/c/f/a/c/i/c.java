package c.f.a.c.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends c.f.a.c.j.g.b implements b {
    public c() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override // c.f.a.c.j.g.b
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            init(a.AbstractBinderC0161a.c1(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i2 == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), c.f.a.c.j.g.c.b(parcel), parcel.readInt());
            parcel2.writeNoException();
            c.f.a.c.j.g.c.a(parcel2, booleanFlagValue);
        } else if (i2 == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i2 == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else {
            if (i2 != 5) {
                return false;
            }
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
