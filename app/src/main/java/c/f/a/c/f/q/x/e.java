package c.f.a.c.f.q.x;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c.f.a.c.f.o.n.f;
import c.f.a.c.f.o.n.m;
import c.f.a.c.f.q.g;
import c.f.a.c.f.q.v;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends g<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f12678a;

    public e(Context context, Looper looper, c.f.a.c.f.q.d dVar, v vVar, f fVar, m mVar) {
        super(context, looper, 270, dVar, fVar, mVar);
        this.f12678a = vVar;
    }

    @Override // c.f.a.c.f.q.c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // c.f.a.c.f.q.c
    public final c.f.a.c.f.d[] getApiFeatures() {
        return c.f.a.c.j.b.d.f12758b;
    }

    @Override // c.f.a.c.f.q.c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f12678a.d();
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 203390000;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // c.f.a.c.f.q.c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
