package c.f.a.c.j.h;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p2 extends s implements q3 {
    public static q3 c1(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof q3 ? (q3) iInterfaceQueryLocalInterface : new o1(iBinder);
    }
}
