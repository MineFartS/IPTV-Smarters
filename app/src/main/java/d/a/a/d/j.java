package d.a.a.d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import d.a.a.d.k;

/* JADX INFO: loaded from: classes2.dex */
public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* JADX INFO: renamed from: d.a.a.d.j$a$a, reason: collision with other inner class name */
        public static class C0303a implements j {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static j f30141b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f30142c;

            public C0303a(IBinder iBinder) {
                this.f30142c = iBinder;
            }

            @Override // d.a.a.d.j
            public void W(String str, int i2, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IServiceStatus");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str2);
                    if (this.f30142c.transact(4, parcelObtain, parcelObtain2, 0) || a.c1() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.c1().W(str, i2, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30142c;
            }
        }

        public a() {
            attachInterface(this, "de.blinkt.openvpn.core.IServiceStatus");
        }

        public static j J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IServiceStatus");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new C0303a(iBinder) : (j) iInterfaceQueryLocalInterface;
        }

        public static j c1() {
            return C0303a.f30141b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                ParcelFileDescriptor parcelFileDescriptorE1 = E1(k.a.J(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (parcelFileDescriptorE1 != null) {
                    parcel2.writeInt(1);
                    parcelFileDescriptorE1.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i2 == 2) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                B1(k.a.J(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i2 == 3) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                String strR1 = r1();
                parcel2.writeNoException();
                parcel2.writeString(strR1);
                return true;
            }
            if (i2 == 4) {
                parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
                W(parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 5) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("de.blinkt.openvpn.core.IServiceStatus");
                return true;
            }
            parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
            x xVarD2 = d2();
            parcel2.writeNoException();
            if (xVarD2 != null) {
                parcel2.writeInt(1);
                xVarD2.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    void B1(k kVar);

    ParcelFileDescriptor E1(k kVar);

    void W(String str, int i2, String str2);

    x d2();

    String r1();
}
