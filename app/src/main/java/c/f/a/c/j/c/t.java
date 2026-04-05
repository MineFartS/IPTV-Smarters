package c.f.a.c.j.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class t implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f13075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13076c;

    public t(IBinder iBinder, String str) {
        this.f13075b = iBinder;
        this.f13076c = str;
    }

    public final void I2(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f13075b.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13076c);
        return parcelObtain;
    }

    public final void K2(int i2, Parcel parcel) {
        try {
            this.f13075b.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f13075b;
    }

    public final Parcel c1(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13075b.transact(i2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }
}
