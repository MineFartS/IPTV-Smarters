package c.f.a.c.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends c.f.a.c.j.e.a implements IInterface {
    public o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final c.f.a.c.g.a I2(c.f.a.c.g.a aVar, String str, int i2) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        parcelC1.writeInt(i2);
        Parcel parcelJ = J(2, parcelC1);
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }

    public final int K2(c.f.a.c.g.a aVar, String str, boolean z) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        c.f.a.c.j.e.c.b(parcelC1, z);
        Parcel parcelJ = J(3, parcelC1);
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    public final c.f.a.c.g.a L2(c.f.a.c.g.a aVar, String str, int i2) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        parcelC1.writeInt(i2);
        Parcel parcelJ = J(4, parcelC1);
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }

    public final int M2(c.f.a.c.g.a aVar, String str, boolean z) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        c.f.a.c.j.e.c.b(parcelC1, z);
        Parcel parcelJ = J(5, parcelC1);
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    public final int N2() {
        Parcel parcelJ = J(6, c1());
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }

    public final c.f.a.c.g.a O2(c.f.a.c.g.a aVar, String str, boolean z, long j2) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        c.f.a.c.j.e.c.b(parcelC1, z);
        parcelC1.writeLong(j2);
        Parcel parcelJ = J(7, parcelC1);
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }

    public final c.f.a.c.g.a P2(c.f.a.c.g.a aVar, String str, int i2, c.f.a.c.g.a aVar2) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        parcelC1.writeInt(i2);
        c.f.a.c.j.e.c.e(parcelC1, aVar2);
        Parcel parcelJ = J(8, parcelC1);
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }
}
