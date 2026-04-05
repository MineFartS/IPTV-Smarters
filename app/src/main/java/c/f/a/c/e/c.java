package c.f.a.c.e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends IInterface {

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f12243b;

        public a(IBinder iBinder) {
            this.f12243b = iBinder;
        }

        @Override // c.f.a.c.e.c
        public void O(Message message) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            parcelObtain.writeInt(1);
            message.writeToParcel(parcelObtain, 0);
            try {
                this.f12243b.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f12243b;
        }
    }

    void O(Message message);
}
