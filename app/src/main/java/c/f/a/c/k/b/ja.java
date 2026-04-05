package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.RemoteException;
import c.f.a.c.j.h.vd;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class ja implements d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f14014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f14015b;

    public ja(AppMeasurementDynamiteService appMeasurementDynamiteService, vd vdVar) {
        this.f14015b = appMeasurementDynamiteService;
        this.f14014a = vdVar;
    }

    @Override // c.f.a.c.k.b.d6
    public final void a(String str, String str2, Bundle bundle, long j2) {
        try {
            this.f14014a.T(str, str2, bundle, j2);
        } catch (RemoteException e2) {
            this.f14015b.f24282b.c().r().b("Event interceptor threw exception", e2);
        }
    }
}
