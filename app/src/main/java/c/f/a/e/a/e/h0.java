package c.f.a.e.a.e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends e0 implements j0 {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // c.f.a.e.a.e.j0
    public final void A(String str, List<Bundle> list, Bundle bundle, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeTypedList(list);
        g0.b(parcelJ, bundle);
        g0.c(parcelJ, l0Var);
        c1(14, parcelJ);
    }

    @Override // c.f.a.e.a.e.j0
    public final void C0(String str, Bundle bundle, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        g0.b(parcelJ, bundle);
        g0.c(parcelJ, l0Var);
        c1(10, parcelJ);
    }

    @Override // c.f.a.e.a.e.j0
    public final void E0(String str, Bundle bundle, Bundle bundle2, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        g0.b(parcelJ, bundle);
        g0.b(parcelJ, bundle2);
        g0.c(parcelJ, l0Var);
        c1(11, parcelJ);
    }

    @Override // c.f.a.e.a.e.j0
    public final void X(String str, Bundle bundle, Bundle bundle2, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        g0.b(parcelJ, bundle);
        g0.b(parcelJ, bundle2);
        g0.c(parcelJ, l0Var);
        c1(9, parcelJ);
    }

    @Override // c.f.a.e.a.e.j0
    public final void k2(String str, Bundle bundle, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        g0.b(parcelJ, bundle);
        g0.c(parcelJ, l0Var);
        c1(5, parcelJ);
    }

    @Override // c.f.a.e.a.e.j0
    public final void v2(String str, Bundle bundle, Bundle bundle2, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        g0.b(parcelJ, bundle);
        g0.b(parcelJ, bundle2);
        g0.c(parcelJ, l0Var);
        c1(6, parcelJ);
    }

    @Override // c.f.a.e.a.e.j0
    public final void w(String str, Bundle bundle, Bundle bundle2, l0 l0Var) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        g0.b(parcelJ, bundle);
        g0.b(parcelJ, bundle2);
        g0.c(parcelJ, l0Var);
        c1(7, parcelJ);
    }
}
