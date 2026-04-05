package c.f.a.c.k.b;

import c.f.a.c.j.h.td;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td f13941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13942c;

    public h6(AppMeasurementDynamiteService appMeasurementDynamiteService, td tdVar) {
        this.f13942c = appMeasurementDynamiteService;
        this.f13941b = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13942c.f24282b.R().U(this.f13941b);
    }
}
