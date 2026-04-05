package d.a.a.d;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        /* JADX INFO: renamed from: d.a.a.d.k$a$a, reason: collision with other inner class name */
        public static class C0304a implements k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static k f30143b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f30144c;

            public C0304a(IBinder iBinder) {
                this.f30144c = iBinder;
            }

            @Override // d.a.a.d.k
            public void R0(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    parcelObtain.writeString(str);
                    if (this.f30144c.transact(4, parcelObtain, null, 1) || a.c1() == null) {
                        return;
                    }
                    a.c1().R0(str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30144c;
            }

            @Override // d.a.a.d.k
            public void d0(long j2, long j3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeLong(j3);
                    if (this.f30144c.transact(3, parcelObtain, null, 1) || a.c1() == null) {
                        return;
                    }
                    a.c1().d0(j2, j3);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.d.k
            public void h2(m mVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    if (mVar != null) {
                        parcelObtain.writeInt(1);
                        mVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f30144c.transact(1, parcelObtain, null, 1) || a.c1() == null) {
                        return;
                    }
                    a.c1().h2(mVar);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // d.a.a.d.k
            public void x0(String str, String str2, int i2, f fVar, Intent intent) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i2);
                    if (fVar != null) {
                        parcelObtain.writeInt(1);
                        fVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (intent != null) {
                        parcelObtain.writeInt(1);
                        intent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f30144c.transact(2, parcelObtain, null, 1) || a.c1() == null) {
                        return;
                    }
                    a.c1().x0(str, str2, i2, fVar, intent);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static k J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IStatusCallbacks");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k)) ? new C0304a(iBinder) : (k) iInterfaceQueryLocalInterface;
        }

        public static k c1() {
            return C0304a.f30143b;
        }
    }

    void R0(String str);

    void d0(long j2, long j3);

    void h2(m mVar);

    void x0(String str, String str2, int i2, f fVar, Intent intent);
}
