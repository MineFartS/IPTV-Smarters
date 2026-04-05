package c.f.a.c.d.u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface m0 extends IInterface {

    public static abstract class a extends c.f.a.c.j.c.a implements m0 {
        public static m0 c1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            return iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new n0(iBinder);
        }
    }

    void a1(boolean z, int i2);

    void i(c.f.a.c.d.d dVar, String str, String str2, boolean z);

    void onConnected(Bundle bundle);

    void onConnectionFailed(c.f.a.c.f.b bVar);

    void onConnectionSuspended(int i2);

    void q(int i2);
}
