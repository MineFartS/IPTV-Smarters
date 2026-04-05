package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.RemoteException;
import c.f.a.c.j.h.vd;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class ka implements e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f14039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f14040b;

    public ka(AppMeasurementDynamiteService appMeasurementDynamiteService, vd vdVar) {
        this.f14040b = appMeasurementDynamiteService;
        this.f14039a = vdVar;
    }

    @Override // c.f.a.c.k.b.e6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        try {
            this.f14039a.T(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            this.f14040b.f24282b.c().r().b("Event listener threw exception", e2);
        }
    }
}
