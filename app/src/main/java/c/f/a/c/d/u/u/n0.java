package c.f.a.c.d.u.u;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends c.f.a.c.j.c.t implements f0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // c.f.a.c.d.u.u.f0
    public final c.f.a.c.g.a z() {
        Parcel parcelC1 = c1(2, J());
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelC1.readStrongBinder());
        parcelC1.recycle();
        return aVarC1;
    }
}
