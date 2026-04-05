package d.a.a.d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* JADX INFO: renamed from: d.a.a.d.i$a$a, reason: collision with other inner class name */
        public static class C0302a implements i {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static i f30139b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f30140c;

            public C0302a(IBinder iBinder) {
                this.f30140c = iBinder;
            }

            @Override // d.a.a.d.i
            public void O1(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeString(str);
                    if (this.f30140c.transact(4, parcelObtain, parcelObtain2, 0) || a.c1() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.c1().O1(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30140c;
            }

            @Override // d.a.a.d.i
            public boolean e(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f30140c.transact(3, parcelObtain, parcelObtain2, 0) && a.c1() != null) {
                        return a.c1().e(z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.d.i
            public boolean h0(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeString(str);
                    if (!this.f30140c.transact(5, parcelObtain, parcelObtain2, 0) && a.c1() != null) {
                        return a.c1().h0(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.d.i
            public void l2(boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (this.f30140c.transact(2, parcelObtain, parcelObtain2, 0) || a.c1() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.c1().l2(z);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.d.i
            public boolean protect(int i2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    parcelObtain.writeInt(i2);
                    if (!this.f30140c.transact(1, parcelObtain, parcelObtain2, 0) && a.c1() != null) {
                        return a.c1().protect(i2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "de.blinkt.openvpn.core.IOpenVPNServiceInternal");
        }

        public static i J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new C0302a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }

        public static i c1() {
            return C0302a.f30139b;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1598968902) {
                parcel2.writeString("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    boolean zProtect = protect(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zProtect ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    l2(parcel.readInt() != 0);
                    break;
                case 3:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    boolean zE = e(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    O1(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    boolean zH0 = h0(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zH0 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("de.blinkt.openvpn.core.IOpenVPNServiceInternal");
                    Z1(parcel.readString());
                    break;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void O1(String str);

    void Z1(String str);

    boolean e(boolean z);

    boolean h0(String str);

    void l2(boolean z);

    boolean protect(int i2);
}
