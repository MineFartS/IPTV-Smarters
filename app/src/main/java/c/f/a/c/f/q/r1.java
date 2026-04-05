package c.f.a.c.f.q;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r1 extends c.f.a.c.j.e.b implements s1 {
    public r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static s1 c1(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof s1 ? (s1) iInterfaceQueryLocalInterface : new q1(iBinder);
    }

    @Override // c.f.a.c.j.e.b
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            c.f.a.c.g.a aVarB = b();
            parcel2.writeNoException();
            c.f.a.c.j.e.c.e(parcel2, aVarB);
        } else {
            if (i2 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
