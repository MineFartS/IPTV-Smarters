package c.f.a.c.d.u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends c.f.a.c.j.c.t implements j0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // c.f.a.c.d.u.j0
    public final t0 G() {
        t0 w0Var;
        Parcel parcelC1 = c1(5, J());
        IBinder strongBinder = parcelC1.readStrongBinder();
        if (strongBinder == null) {
            w0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            w0Var = iInterfaceQueryLocalInterface instanceof t0 ? (t0) iInterfaceQueryLocalInterface : new w0(strongBinder);
        }
        parcelC1.recycle();
        return w0Var;
    }

    @Override // c.f.a.c.d.u.j0
    public final Bundle V0() {
        Parcel parcelC1 = c1(1, J());
        Bundle bundle = (Bundle) c.f.a.c.j.c.v0.b(parcelC1, Bundle.CREATOR);
        parcelC1.recycle();
        return bundle;
    }

    @Override // c.f.a.c.d.u.j0
    public final o0 e0() {
        o0 q0Var;
        Parcel parcelC1 = c1(6, J());
        IBinder strongBinder = parcelC1.readStrongBinder();
        if (strongBinder == null) {
            q0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            q0Var = iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new q0(strongBinder);
        }
        parcelC1.recycle();
        return q0Var;
    }

    @Override // c.f.a.c.d.u.j0
    public final boolean h() {
        Parcel parcelC1 = c1(12, J());
        boolean zE = c.f.a.c.j.c.v0.e(parcelC1);
        parcelC1.recycle();
        return zE;
    }
}
