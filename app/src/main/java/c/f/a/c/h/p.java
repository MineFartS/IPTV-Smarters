package c.f.a.c.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends c.f.a.c.j.e.a implements IInterface {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final c.f.a.c.g.a I2(c.f.a.c.g.a aVar, String str, int i2, c.f.a.c.g.a aVar2) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        parcelC1.writeInt(i2);
        c.f.a.c.j.e.c.e(parcelC1, aVar2);
        Parcel parcelJ = J(2, parcelC1);
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }

    public final c.f.a.c.g.a K2(c.f.a.c.g.a aVar, String str, int i2, c.f.a.c.g.a aVar2) {
        Parcel parcelC1 = c1();
        c.f.a.c.j.e.c.e(parcelC1, aVar);
        parcelC1.writeString(str);
        parcelC1.writeInt(i2);
        c.f.a.c.j.e.c.e(parcelC1, aVar2);
        Parcel parcelJ = J(3, parcelC1);
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }
}
