package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class rd extends a implements td {
    public rd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // c.f.a.c.j.h.td
    public final void w1(Bundle bundle) {
        Parcel parcelJ = J();
        n0.d(parcelJ, bundle);
        c1(1, parcelJ);
    }
}
