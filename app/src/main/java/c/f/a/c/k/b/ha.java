package c.f.a.c.k.b;

import c.f.a.c.j.h.td;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class ha implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td f13956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13959e;

    public ha(AppMeasurementDynamiteService appMeasurementDynamiteService, td tdVar, String str, String str2) {
        this.f13959e = appMeasurementDynamiteService;
        this.f13956b = tdVar;
        this.f13957c = str;
        this.f13958d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13959e.f24282b.R().O(this.f13956b, this.f13957c, this.f13958d);
    }
}
