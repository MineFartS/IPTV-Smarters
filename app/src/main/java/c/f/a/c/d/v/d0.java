package c.f.a.c.d.v;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.f.a.c.f.o.f;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends c.f.a.c.f.q.g<l> {
    public d0(Context context, Looper looper, c.f.a.c.f.q.d dVar, f.a aVar, f.b bVar) {
        super(context, looper, 161, dVar, aVar, bVar);
    }

    @Override // c.f.a.c.f.q.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new k(iBinder);
    }

    @Override // c.f.a.c.f.q.c
    public final c.f.a.c.f.d[] getApiFeatures() {
        return c.f.a.c.d.b0.f11574h;
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
