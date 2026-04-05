package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sd extends s implements td {
    public sd() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // c.f.a.c.j.h.s
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        w1((Bundle) n0.c(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
