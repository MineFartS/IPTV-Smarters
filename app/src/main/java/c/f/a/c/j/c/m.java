package c.f.a.c.j.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends t implements n {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // c.f.a.c.j.c.n
    public final void A2(String str, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        v0.d(parcelJ, bundle);
        I2(2, parcelJ);
    }

    @Override // c.f.a.c.j.c.n
    public final void I1(String str, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        v0.d(parcelJ, bundle);
        I2(4, parcelJ);
    }

    @Override // c.f.a.c.j.c.n
    public final void b1(String str, Bundle bundle, int i2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        v0.d(parcelJ, bundle);
        parcelJ.writeInt(i2);
        I2(6, parcelJ);
    }

    @Override // c.f.a.c.j.c.n
    public final void g(String str, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        v0.d(parcelJ, bundle);
        I2(1, parcelJ);
    }

    @Override // c.f.a.c.j.c.n
    public final void i2(String str, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        v0.d(parcelJ, bundle);
        I2(3, parcelJ);
    }
}
