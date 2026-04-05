package c.f.a.c.f.q;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f12655b;

    public p0(IBinder iBinder) {
        this.f12655b = iBinder;
    }

    @Override // c.f.a.c.f.q.l
    public final void a0(k kVar, f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                parcelObtain.writeInt(1);
                g1.a(fVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f12655b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12655b;
    }
}
