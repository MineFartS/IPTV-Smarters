package c.f.a.c.d.v;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.j.c.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends c.f.a.c.j.c.t implements l {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    @Override // c.f.a.c.d.v.l
    public final void c0(f fVar, String[] strArr) {
        Parcel parcelJ = J();
        v0.c(parcelJ, fVar);
        parcelJ.writeStringArray(strArr);
        K2(6, parcelJ);
    }

    @Override // c.f.a.c.d.v.l
    public final void s0(f fVar, String[] strArr) {
        Parcel parcelJ = J();
        v0.c(parcelJ, fVar);
        parcelJ.writeStringArray(strArr);
        K2(5, parcelJ);
    }
}
