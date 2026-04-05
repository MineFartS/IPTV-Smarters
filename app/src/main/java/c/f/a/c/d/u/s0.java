package c.f.a.c.d.u;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface s0 extends IInterface {

    public static abstract class a extends c.f.a.c.j.c.a implements s0 {
        public static s0 c1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            return iInterfaceQueryLocalInterface instanceof s0 ? (s0) iInterfaceQueryLocalInterface : new u0(iBinder);
        }
    }

    boolean Q1();

    c.f.a.c.g.a S1();

    void X1(int i2);

    boolean isConnected();

    boolean isConnecting();

    void q0(int i2);

    void x1(int i2);
}
