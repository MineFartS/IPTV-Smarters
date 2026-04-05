package c.f.a.c.d.u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface j0 extends IInterface {

    public static abstract class a extends c.f.a.c.j.c.a implements j0 {
        public static j0 c1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            return iInterfaceQueryLocalInterface instanceof j0 ? (j0) iInterfaceQueryLocalInterface : new l0(iBinder);
        }
    }

    t0 G();

    Bundle V0();

    o0 e0();

    boolean h();
}
