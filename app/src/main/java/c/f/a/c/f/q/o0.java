package c.f.a.c.f.q;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0 extends c.f.a.c.j.e.b implements k {
    public o0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // c.f.a.c.j.e.b
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            Y0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.f.a.c.j.e.c.c(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            l0(parcel.readInt(), (Bundle) c.f.a.c.j.e.c.c(parcel, Bundle.CREATOR));
        } else {
            if (i2 != 3) {
                return false;
            }
            C1(parcel.readInt(), parcel.readStrongBinder(), (d1) c.f.a.c.j.e.c.c(parcel, d1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
