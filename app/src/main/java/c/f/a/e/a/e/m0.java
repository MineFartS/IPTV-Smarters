package c.f.a.e.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends f0 implements n0 {
    public m0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // c.f.a.e.a.e.f0
    public final boolean J(int i2, Parcel parcel) {
        p0 o0Var = null;
        if (i2 == 2) {
            Bundle bundle = (Bundle) g0.a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                o0Var = iInterfaceQueryLocalInterface instanceof p0 ? (p0) iInterfaceQueryLocalInterface : new o0(strongBinder);
            }
            L0(bundle, o0Var);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            o0Var = iInterfaceQueryLocalInterface2 instanceof p0 ? (p0) iInterfaceQueryLocalInterface2 : new o0(strongBinder2);
        }
        v(o0Var);
        return true;
    }
}
