package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class r8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t8 f14283b;

    public r8(t8 t8Var) {
        this.f14283b = t8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u8 u8Var = this.f14283b.f14331c;
        Context contextB = u8Var.f14413a.b();
        this.f14283b.f14331c.f14413a.e();
        u8.x(u8Var, new ComponentName(contextB, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
