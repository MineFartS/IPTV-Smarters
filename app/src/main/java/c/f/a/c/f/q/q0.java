package c.f.a.c.f.q;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends c.f.a.c.j.e.a implements s0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // c.f.a.c.f.q.s0
    public final c.f.a.c.f.l0 M0(c.f.a.c.f.i0 i0Var) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.d(parcelC1, i0Var);
        Parcel parcelJ = J(6, parcelC1);
        c.f.a.c.f.l0 l0Var = (c.f.a.c.f.l0) c.f.a.c.j.e.c.c(parcelJ, c.f.a.c.f.l0.CREATOR);
        parcelJ.recycle();
        return l0Var;
    }

    @Override // c.f.a.c.f.q.s0
    public final boolean f() {
        Parcel parcelJ = J(7, c1());
        boolean zA = c.f.a.c.j.e.c.a(parcelJ);
        parcelJ.recycle();
        return zA;
    }

    @Override // c.f.a.c.f.q.s0
    public final boolean g1(c.f.a.c.f.n0 n0Var, c.f.a.c.g.a aVar) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.d(parcelC1, n0Var);
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        Parcel parcelJ = J(5, parcelC1);
        boolean zA = c.f.a.c.j.e.c.a(parcelJ);
        parcelJ.recycle();
        return zA;
    }
}
