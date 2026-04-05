package c.f.a.c.d.u;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends c.f.a.c.j.c.t implements s0 {
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // c.f.a.c.d.u.s0
    public final boolean Q1() {
        Parcel parcelC1 = c1(9, J());
        boolean zE = c.f.a.c.j.c.v0.e(parcelC1);
        parcelC1.recycle();
        return zE;
    }

    @Override // c.f.a.c.d.u.s0
    public final c.f.a.c.g.a S1() {
        Parcel parcelC1 = c1(1, J());
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return aVarC1;
    }

    @Override // c.f.a.c.d.u.s0
    public final void X1(int i2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        I2(15, parcelJ);
    }

    @Override // c.f.a.c.d.u.s0
    public final boolean isConnected() {
        Parcel parcelC1 = c1(5, J());
        boolean zE = c.f.a.c.j.c.v0.e(parcelC1);
        parcelC1.recycle();
        return zE;
    }

    @Override // c.f.a.c.d.u.s0
    public final boolean isConnecting() {
        Parcel parcelC1 = c1(6, J());
        boolean zE = c.f.a.c.j.c.v0.e(parcelC1);
        parcelC1.recycle();
        return zE;
    }

    @Override // c.f.a.c.d.u.s0
    public final void q0(int i2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        I2(13, parcelJ);
    }

    @Override // c.f.a.c.d.u.s0
    public final void x1(int i2) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i2);
        I2(12, parcelJ);
    }
}
