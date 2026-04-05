package c.f.a.c.d.u;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends c.f.a.c.j.c.t implements t0 {
    public w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // c.f.a.c.d.u.t0
    public final void S(v0 v0Var) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.c(parcelJ, v0Var);
        I2(2, parcelJ);
    }

    @Override // c.f.a.c.d.u.t0
    public final void i0(v0 v0Var) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.c(parcelJ, v0Var);
        I2(3, parcelJ);
    }

    @Override // c.f.a.c.d.u.t0
    public final c.f.a.c.g.a o() {
        Parcel parcelC1 = c1(7, J());
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return aVarC1;
    }

    @Override // c.f.a.c.d.u.t0
    public final c.f.a.c.g.a q2() {
        Parcel parcelC1 = c1(1, J());
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return aVarC1;
    }

    @Override // c.f.a.c.d.u.t0
    public final void t(boolean z, boolean z2) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.a(parcelJ, true);
        c.f.a.c.j.c.v0.a(parcelJ, z2);
        I2(6, parcelJ);
    }
}
