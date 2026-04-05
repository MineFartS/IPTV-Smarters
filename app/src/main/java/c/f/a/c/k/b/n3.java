package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 extends c.f.a.c.j.h.a implements p3 {
    public n3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // c.f.a.c.k.b.p3
    public final void B2(t tVar, la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, tVar);
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(1, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final List<aa> G0(String str, String str2, boolean z, la laVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        c.f.a.c.j.h.n0.b(parcelJ, z);
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        Parcel parcelI2 = I2(14, parcelJ);
        ArrayList arrayListCreateTypedArrayList = parcelI2.createTypedArrayList(aa.CREATOR);
        parcelI2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // c.f.a.c.k.b.p3
    public final List<aa> G2(String str, String str2, String str3, boolean z) {
        Parcel parcelJ = J();
        parcelJ.writeString(null);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        c.f.a.c.j.h.n0.b(parcelJ, z);
        Parcel parcelI2 = I2(15, parcelJ);
        ArrayList arrayListCreateTypedArrayList = parcelI2.createTypedArrayList(aa.CREATOR);
        parcelI2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // c.f.a.c.k.b.p3
    public final String I(la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        Parcel parcelI2 = I2(11, parcelJ);
        String string = parcelI2.readString();
        parcelI2.recycle();
        return string;
    }

    @Override // c.f.a.c.k.b.p3
    public final List<b> J0(String str, String str2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeString(null);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Parcel parcelI2 = I2(17, parcelJ);
        ArrayList arrayListCreateTypedArrayList = parcelI2.createTypedArrayList(b.CREATOR);
        parcelI2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // c.f.a.c.k.b.p3
    public final void N0(la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(18, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final void S0(Bundle bundle, la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, bundle);
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(19, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final byte[] Z0(t tVar, String str) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, tVar);
        parcelJ.writeString(str);
        Parcel parcelI2 = I2(9, parcelJ);
        byte[] bArrCreateByteArray = parcelI2.createByteArray();
        parcelI2.recycle();
        return bArrCreateByteArray;
    }

    @Override // c.f.a.c.k.b.p3
    public final void f2(la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(4, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final void o1(la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(6, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final List<b> r(String str, String str2, la laVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        Parcel parcelI2 = I2(16, parcelJ);
        ArrayList arrayListCreateTypedArrayList = parcelI2.createTypedArrayList(b.CREATOR);
        parcelI2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // c.f.a.c.k.b.p3
    public final void t1(aa aaVar, la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, aaVar);
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(2, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final void u0(b bVar, la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, bVar);
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(12, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final void v0(long j2, String str, String str2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeLong(j2);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        c1(10, parcelJ);
    }

    @Override // c.f.a.c.k.b.p3
    public final void x(la laVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.h.n0.d(parcelJ, laVar);
        c1(20, parcelJ);
    }
}
