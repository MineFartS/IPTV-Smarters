package c.f.a.c.k.b;

import c.f.a.c.j.h.td;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class ia implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td f13978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13979c;

    public ia(AppMeasurementDynamiteService appMeasurementDynamiteService, td tdVar) {
        this.f13979c = appMeasurementDynamiteService;
        this.f13978b = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13979c.f24282b.G().V(this.f13978b, this.f13979c.f24282b.j());
    }
}
