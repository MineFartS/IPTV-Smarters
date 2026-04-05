package c.f.a.c.k.b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class i9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ja f13976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13977c;

    public i9(AppMeasurementDynamiteService appMeasurementDynamiteService, ja jaVar) {
        this.f13977c = appMeasurementDynamiteService;
        this.f13976b = jaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13977c.f24282b.F().v(this.f13976b);
    }
}
