package c.f.a.c.k.b;

import c.f.a.c.j.h.td;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class h7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td f13943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f13944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13946e;

    public h7(AppMeasurementDynamiteService appMeasurementDynamiteService, td tdVar, t tVar, String str) {
        this.f13946e = appMeasurementDynamiteService;
        this.f13943b = tdVar;
        this.f13944c = tVar;
        this.f13945d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13946e.f24282b.R().u(this.f13943b, this.f13944c, this.f13945d);
    }
}
