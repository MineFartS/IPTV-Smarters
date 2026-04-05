package c.f.a.c.d.u.u;

import android.os.IInterface;
import android.os.Parcel;
import c.f.a.c.d.l;

/* JADX INFO: loaded from: classes2.dex */
public interface f0 extends IInterface {

    public static abstract class a extends c.f.a.c.j.c.a implements f0 {
        public a() {
            super("com.google.android.gms.cast.framework.media.IImagePicker");
        }

        @Override // c.f.a.c.j.c.a
        public final boolean J(int i2, Parcel parcel, Parcel parcel2, int i3) {
            c.f.a.c.f.p.a aVarU1;
            if (i2 != 1) {
                if (i2 == 2) {
                    c.f.a.c.g.a aVarZ = z();
                    parcel2.writeNoException();
                    c.f.a.c.j.c.v0.c(parcel2, aVarZ);
                } else if (i2 == 3) {
                    int iC = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(iC);
                } else {
                    if (i2 != 4) {
                        return false;
                    }
                    aVarU1 = y1((l) c.f.a.c.j.c.v0.b(parcel, l.CREATOR), (b) c.f.a.c.j.c.v0.b(parcel, b.CREATOR));
                }
                return true;
            }
            aVarU1 = u1((l) c.f.a.c.j.c.v0.b(parcel, l.CREATOR), parcel.readInt());
            parcel2.writeNoException();
            c.f.a.c.j.c.v0.f(parcel2, aVarU1);
            return true;
        }
    }

    int c();

    c.f.a.c.f.p.a u1(l lVar, int i2);

    c.f.a.c.f.p.a y1(l lVar, b bVar);

    c.f.a.c.g.a z();
}
