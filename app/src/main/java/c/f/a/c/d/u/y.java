package c.f.a.c.d.u;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y extends c.f.a.c.j.c.a implements w {
    public y() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                c.f.a.c.g.a aVarE1 = e1();
                parcel2.writeNoException();
                c.f.a.c.j.c.v0.c(parcel2, aVarE1);
                return true;
            case 2:
                i1((Bundle) c.f.a.c.j.c.v0.b(parcel, Bundle.CREATOR));
                break;
            case 3:
                O0((Bundle) c.f.a.c.j.c.v0.b(parcel, Bundle.CREATOR));
                break;
            case 4:
                W0(c.f.a.c.j.c.v0.e(parcel));
                break;
            case 5:
                long jR = R();
                parcel2.writeNoException();
                parcel2.writeLong(jR);
                return true;
            case 6:
                c();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            case 7:
                W1((Bundle) c.f.a.c.j.c.v0.b(parcel, Bundle.CREATOR));
                break;
            case 8:
                Z((Bundle) c.f.a.c.j.c.v0.b(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
