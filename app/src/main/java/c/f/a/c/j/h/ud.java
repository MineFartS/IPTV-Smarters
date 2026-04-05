package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class ud extends a implements vd {
    public ud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // c.f.a.c.j.h.vd
    public final void T(String str, String str2, Bundle bundle, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        n0.d(parcelJ, bundle);
        parcelJ.writeLong(j2);
        c1(1, parcelJ);
    }

    @Override // c.f.a.c.j.h.vd
    public final int d() {
        Parcel parcelI2 = I2(2, J());
        int i2 = parcelI2.readInt();
        parcelI2.recycle();
        return i2;
    }
}
