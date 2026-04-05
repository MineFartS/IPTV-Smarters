package c.f.a.c.d.u;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends c.f.a.c.j.c.t implements o0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // c.f.a.c.d.u.o0
    public final c.f.a.c.g.a o() {
        Parcel parcelC1 = c1(5, J());
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return aVarC1;
    }
}
