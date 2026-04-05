package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 extends a implements q3 {
    public o1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // c.f.a.c.j.h.q3
    public final Bundle F0(Bundle bundle) {
        Parcel parcelJ = J();
        n0.d(parcelJ, bundle);
        Parcel parcelI2 = I2(1, parcelJ);
        Bundle bundle2 = (Bundle) n0.c(parcelI2, Bundle.CREATOR);
        parcelI2.recycle();
        return bundle2;
    }
}
