package c.f.a.c.d.u;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends c.f.a.c.j.c.t implements p0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // c.f.a.c.d.u.p0
    public final IBinder onBind(Intent intent) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.d(parcelJ, intent);
        Parcel parcelC1 = c1(3, parcelJ);
        IBinder strongBinder = parcelC1.readStrongBinder();
        parcelC1.recycle();
        return strongBinder;
    }

    @Override // c.f.a.c.d.u.p0
    public final void onCreate() {
        I2(1, J());
    }

    @Override // c.f.a.c.d.u.p0
    public final void onDestroy() {
        I2(4, J());
    }

    @Override // c.f.a.c.d.u.p0
    public final int onStartCommand(Intent intent, int i2, int i3) {
        Parcel parcelJ = J();
        c.f.a.c.j.c.v0.d(parcelJ, intent);
        parcelJ.writeInt(i2);
        parcelJ.writeInt(i3);
        Parcel parcelC1 = c1(2, parcelJ);
        int i4 = parcelC1.readInt();
        parcelC1.recycle();
        return i4;
    }
}
