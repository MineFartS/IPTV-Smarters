package c.f.a.c.j.i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class e implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f13695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13696c = "com.android.vending.billing.IInAppBillingService";

    public e(IBinder iBinder, String str) {
        this.f13695b = iBinder;
    }

    public final Parcel J() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13696c);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13695b;
    }

    public final Parcel c1(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13695b.transact(i2, parcel, parcelObtain, 0);
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
