package c.f.a.c.d.u.u.k;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends c.f.a.c.j.c.a implements k {
    public j() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    @Override // c.f.a.c.j.c.a
    public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            D(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            c();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
