package c.f.a.c.j.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f12754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12755c;

    public a(IBinder iBinder, String str) {
        this.f12754b = iBinder;
        this.f12755c = str;
    }

    public final void I2(int i2, Parcel parcel) {
        try {
            this.f12754b.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f12755c);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12754b;
    }

    public final void c1(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f12754b.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
