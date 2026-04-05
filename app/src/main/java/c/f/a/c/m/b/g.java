package c.f.a.c.m.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c.f.a.c.j.b.a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void K2(j jVar, f fVar) {
        Parcel parcelJ = J();
        c.f.a.c.j.b.c.b(parcelJ, jVar);
        c.f.a.c.j.b.c.c(parcelJ, fVar);
        c1(12, parcelJ);
    }
}
