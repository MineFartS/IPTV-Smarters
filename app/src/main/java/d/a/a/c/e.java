package d.a.a.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: d.a.a.c.e$a$a, reason: collision with other inner class name */
        public static class C0301a implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static e f30091b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f30092c;

            public C0301a(IBinder iBinder) {
                this.f30092c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30092c;
            }

            @Override // d.a.a.c.e
            public void p2(String str, String str2, String str3, String str4) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.IOpenVPNStatusCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    if (this.f30092c.transact(1, parcelObtain, null, 1) || a.c1() == null) {
                        return;
                    }
                    a.c1().p2(str, str2, str3, str4);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static e J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.api.IOpenVPNStatusCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0301a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }

        public static e c1() {
            return C0301a.f30091b;
        }
    }

    void p2(String str, String str2, String str3, String str4);
}
