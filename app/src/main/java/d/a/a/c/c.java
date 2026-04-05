package d.a.a.c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: d.a.a.c.c$a$a, reason: collision with other inner class name */
        public static class C0300a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static c f30089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f30090c;

            public C0300a(IBinder iBinder) {
                this.f30090c = iBinder;
            }

            @Override // d.a.a.c.c
            public byte[] R1(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    parcelObtain.writeString(str);
                    if (!this.f30090c.transact(2, parcelObtain, parcelObtain2, 0) && a.c1() != null) {
                        return a.c1().R1(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.c.c
            public byte[] T1(String str, byte[] bArr, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f30090c.transact(4, parcelObtain, parcelObtain2, 0) && a.c1() != null) {
                        return a.c1().T1(str, bArr, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.c.c
            public byte[] U0(String str, byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.f30090c.transact(1, parcelObtain, parcelObtain2, 0) && a.c1() != null) {
                        return a.c1().U0(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30090c;
            }
        }

        public static c J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.api.ExternalCertificateProvider");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0300a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        public static c c1() {
            return C0300a.f30089b;
        }
    }

    byte[] R1(String str);

    byte[] T1(String str, byte[] bArr, Bundle bundle);

    byte[] U0(String str, byte[] bArr);
}
