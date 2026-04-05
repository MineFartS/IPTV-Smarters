package c.f.a.c.f.q;

import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends c.f.a.c.j.e.a implements s1 {
    public q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // c.f.a.c.f.q.s1
    public final c.f.a.c.g.a b() {
        Parcel parcelJ = J(1, c1());
        c.f.a.c.g.a aVarC1 = a.AbstractBinderC0161a.c1(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return aVarC1;
    }

    @Override // c.f.a.c.f.q.s1
    public final int d() {
        Parcel parcelJ = J(2, c1());
        int i2 = parcelJ.readInt();
        parcelJ.recycle();
        return i2;
    }
}
