package c.f.a.c.d.v;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.d.y0;
import c.f.a.c.j.c.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c.f.a.c.j.c.t implements h {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    @Override // c.f.a.c.d.v.h
    public final void C2(String str, c.f.a.c.d.h hVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        v0.d(parcelJ, hVar);
        K2(13, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void E(String str, String str2, y0 y0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        v0.d(parcelJ, y0Var);
        K2(14, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void H(String str, String str2, long j2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeLong(j2);
        K2(9, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void I0(j jVar) {
        Parcel parcelJ = J();
        v0.c(parcelJ, jVar);
        K2(18, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void K(String str, String str2, long j2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeLong(j2);
        parcelJ.writeString(str3);
        K2(15, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void K0() {
        K2(19, J());
    }

    @Override // c.f.a.c.d.v.h
    public final void P1(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        K2(11, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void a(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        K2(5, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void connect() {
        K2(17, J());
    }

    @Override // c.f.a.c.d.v.h
    public final void disconnect() {
        K2(1, J());
    }

    @Override // c.f.a.c.d.v.h
    public final void o0(boolean z, double d2, boolean z2) {
        Parcel parcelJ = J();
        v0.a(parcelJ, z);
        parcelJ.writeDouble(d2);
        v0.a(parcelJ, z2);
        K2(8, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void p0(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        K2(12, parcelJ);
    }

    @Override // c.f.a.c.d.v.h
    public final void t0(double d2, double d3, boolean z) {
        Parcel parcelJ = J();
        parcelJ.writeDouble(d2);
        parcelJ.writeDouble(d3);
        v0.a(parcelJ, z);
        K2(7, parcelJ);
    }
}
