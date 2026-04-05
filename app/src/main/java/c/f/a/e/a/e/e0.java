package c.f.a.e.a.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class e0 implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f15716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15717c;

    public e0(IBinder iBinder, String str) {
        this.f15716b = iBinder;
        this.f15717c = str;
    }

    public final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15717c);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15716b;
    }

    public final void c1(int i2, Parcel parcel) {
        try {
            this.f15716b.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
