package c.f.a.c.j.a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // c.f.a.c.j.a.f
    public final boolean V(boolean z) {
        Parcel parcelJ = J();
        c.a(parcelJ, true);
        Parcel parcelC1 = c1(2, parcelJ);
        boolean zB = c.b(parcelC1);
        parcelC1.recycle();
        return zB;
    }

    @Override // c.f.a.c.j.a.f
    public final String l() {
        Parcel parcelC1 = c1(1, J());
        String string = parcelC1.readString();
        parcelC1.recycle();
        return string;
    }
}
