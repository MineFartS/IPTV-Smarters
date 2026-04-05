package c.f.a.c.d.v;

import android.os.Parcel;
import c.f.a.c.j.c.v0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends c.f.a.c.j.c.a implements j {
    public i() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 1:
                g0(parcel.readInt());
                return true;
            case 2:
                i((c.f.a.c.d.d) v0.b(parcel, c.f.a.c.d.d.CREATOR), parcel.readString(), parcel.readString(), v0.e(parcel));
                return true;
            case 3:
                q(parcel.readInt());
                return true;
            case 4:
                y(parcel.readString(), parcel.readDouble(), v0.e(parcel));
                return true;
            case 5:
                V1(parcel.readString(), parcel.readString());
                return true;
            case 6:
                q1(parcel.readString(), parcel.createByteArray());
                return true;
            case 7:
                H1(parcel.readInt());
                return true;
            case 8:
                m1(parcel.readInt());
                return true;
            case 9:
                s2(parcel.readInt());
                return true;
            case 10:
                m0(parcel.readString(), parcel.readLong(), parcel.readInt());
                return true;
            case 11:
                z2(parcel.readString(), parcel.readLong());
                return true;
            case 12:
                C((d) v0.b(parcel, d.CREATOR));
                return true;
            case 13:
                b2((p0) v0.b(parcel, p0.CREATOR));
                return true;
            case 14:
                m(parcel.readInt());
                return true;
            case 15:
                p(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
