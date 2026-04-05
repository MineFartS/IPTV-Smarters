package c.f.a.c.j.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f13170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13171c;

    public a(IBinder iBinder, String str) {
        this.f13170b = iBinder;
        this.f13171c = str;
    }

    public final Parcel J(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13170b.transact(i2, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13170b;
    }

    public final Parcel c1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f13171c);
        return parcelObtain;
    }
}
