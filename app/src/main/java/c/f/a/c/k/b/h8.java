package c.f.a.c.k.b;

import c.f.a.c.j.h.td;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class h8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td f13947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f13951f;

    public h8(AppMeasurementDynamiteService appMeasurementDynamiteService, td tdVar, String str, String str2, boolean z) {
        this.f13951f = appMeasurementDynamiteService;
        this.f13947b = tdVar;
        this.f13948c = str;
        this.f13949d = str2;
        this.f13950e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13951f.f24282b.R().Q(this.f13947b, this.f13948c, this.f13949d, this.f13950e);
    }
}
