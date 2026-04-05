package d.a.a.c;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import d.a.a.c.e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        public a() {
            attachInterface(this, "de.blinkt.openvpn.api.IOpenVPNAPIService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1598968902) {
                parcel2.writeString("de.blinkt.openvpn.api.IOpenVPNAPIService");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    List<d.a.a.c.a> listR0 = r0();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listR0);
                    return true;
                case 2:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    A0(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    boolean zG1 = G1(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zG1 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    M(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    Intent intentH2 = H2(parcel.readString());
                    parcel2.writeNoException();
                    if (intentH2 != null) {
                        parcel2.writeInt(1);
                        intentH2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    Intent intentJ1 = j1();
                    parcel2.writeNoException();
                    if (intentJ1 != null) {
                        parcel2.writeInt(1);
                        intentJ1.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    disconnect();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    resume();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    j2(e.a.J(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    Q0(e.a.J(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    D1(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    boolean zG2 = g2(parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zG2 ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    d.a.a.c.a aVarW0 = w0(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    if (aVarW0 != null) {
                        parcel2.writeInt(1);
                        aVarW0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 15:
                    parcel.enforceInterface("de.blinkt.openvpn.api.IOpenVPNAPIService");
                    n0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void A0(String str);

    void D1(String str);

    boolean G1(String str, String str2);

    Intent H2(String str);

    void M(String str);

    void Q0(e eVar);

    void disconnect();

    boolean g2(ParcelFileDescriptor parcelFileDescriptor);

    Intent j1();

    void j2(e eVar);

    void n0(String str, Bundle bundle);

    void pause();

    List<d.a.a.c.a> r0();

    void resume();

    d.a.a.c.a w0(String str, boolean z, String str2);
}
