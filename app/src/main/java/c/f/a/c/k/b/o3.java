package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o3 extends c.f.a.c.j.h.s implements p3 {
    public o3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // c.f.a.c.j.h.s
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Collection collectionB0;
        switch (i2) {
            case 1:
                B2((t) c.f.a.c.j.h.n0.c(parcel, t.CREATOR), (la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                t1((aa) c.f.a.c.j.h.n0.c(parcel, aa.CREATOR), (la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                f2((la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                X0((t) c.f.a.c.j.h.n0.c(parcel, t.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                o1((la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                collectionB0 = B0((la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR), c.f.a.c.j.h.n0.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 9:
                byte[] bArrZ0 = Z0((t) c.f.a.c.j.h.n0.c(parcel, t.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZ0);
                return true;
            case 10:
                v0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strI = I((la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strI);
                return true;
            case 12:
                u0((b) c.f.a.c.j.h.n0.c(parcel, b.CREATOR), (la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                T0((b) c.f.a.c.j.h.n0.c(parcel, b.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                collectionB0 = G0(parcel.readString(), parcel.readString(), c.f.a.c.j.h.n0.a(parcel), (la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 15:
                collectionB0 = G2(parcel.readString(), parcel.readString(), parcel.readString(), c.f.a.c.j.h.n0.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 16:
                collectionB0 = r(parcel.readString(), parcel.readString(), (la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 17:
                collectionB0 = J0(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionB0);
                return true;
            case 18:
                N0((la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                S0((Bundle) c.f.a.c.j.h.n0.c(parcel, Bundle.CREATOR), (la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                x((la) c.f.a.c.j.h.n0.c(parcel, la.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
