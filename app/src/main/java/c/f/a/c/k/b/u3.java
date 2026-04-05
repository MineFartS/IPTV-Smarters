package c.f.a.c.k.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.f.a.c.f.q.c;

/* JADX INFO: loaded from: classes2.dex */
public final class u3 extends c.f.a.c.f.q.c<p3> {
    public u3(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // c.f.a.c.f.q.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof p3 ? (p3) iInterfaceQueryLocalInterface : new n3(iBinder);
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
