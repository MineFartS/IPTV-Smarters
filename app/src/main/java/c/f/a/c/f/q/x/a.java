package c.f.a.c.f.q.x;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.f.a.c.f.q.s;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.f.a.c.j.b.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void K2(s sVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.b.c.b(parcelJ, sVar);
        I2(1, parcelJ);
    }
}
