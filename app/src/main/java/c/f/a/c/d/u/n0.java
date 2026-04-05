package c.f.a.c.d.u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends c.f.a.c.j.c.t implements m0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // c.f.a.c.d.u.m0
    public final void a1(boolean z, int i2) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.a(parcelJ, z);
        parcelJ.writeInt(0);
        I2(6, parcelJ);
    }

    @Override // c.f.a.c.d.u.m0
    public final void i(c.f.a.c.d.d dVar, String str, String str2, boolean z) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.d(parcelJ, dVar);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        c.f.a.c.j.c.v0.a(parcelJ, z);
        I2(4, parcelJ);
    }

    @Override // c.f.a.c.d.u.m0
    public final void onConnected(Bundle bundle) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.d(parcelJ, null);
        I2(1, parcelJ);
    }

    @Override // c.f.a.c.d.u.m0
    public final void onConnectionFailed(c.f.a.c.f.b bVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.d(parcelJ, bVar);
        I2(3, parcelJ);
    }

    @Override // c.f.a.c.d.u.m0
    public final void onConnectionSuspended(int i2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        I2(2, parcelJ);
    }

    @Override // c.f.a.c.d.u.m0
    public final void q(int i2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        I2(5, parcelJ);
    }
}
