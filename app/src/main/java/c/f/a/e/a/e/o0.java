package c.f.a.e.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends e0 implements p0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // c.f.a.e.a.e.p0
    public final void K1(Bundle bundle) {
        Parcel parcelJ = J();
        g0.b(parcelJ, bundle);
        c1(3, parcelJ);
    }

    @Override // c.f.a.e.a.e.p0
    public final void l1(Bundle bundle, Bundle bundle2) {
        Parcel parcelJ = J();
        g0.b(parcelJ, bundle);
        g0.b(parcelJ, bundle2);
        c1(2, parcelJ);
    }

    @Override // c.f.a.e.a.e.p0
    public final void n1(Bundle bundle) {
        Parcel parcelJ = J();
        g0.b(parcelJ, bundle);
        c1(4, parcelJ);
    }
}
