package c.f.a.c.j.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends a implements l {
    public k() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        n mVar;
        boolean zJ;
        switch (i2) {
            case 1:
                Bundle bundle = (Bundle) v0.b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    mVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new m(strongBinder);
                }
                r2(bundle, mVar);
                parcel2.writeNoException();
                return true;
            case 2:
                L((Bundle) v0.b(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                Y((Bundle) v0.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zJ = j((Bundle) v0.b(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                v0.a(parcel2, zJ);
                return true;
            case 5:
                U1(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                D2();
                parcel2.writeNoException();
                return true;
            case 7:
                zJ = p1();
                parcel2.writeNoException();
                v0.a(parcel2, zJ);
                return true;
            case 8:
                Bundle bundleU = U(parcel.readString());
                parcel2.writeNoException();
                v0.f(parcel2, bundleU);
                return true;
            case 9:
                String strL1 = L1();
                parcel2.writeNoException();
                parcel2.writeString(strL1);
                return true;
            case 10:
                c();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            case 11:
                z0();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
