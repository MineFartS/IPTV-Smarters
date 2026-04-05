package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends IInterface {

    public static abstract class a extends c.f.a.c.j.e.b implements i {
        @RecentlyNonNull
        public static i c1(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new p1(iBinder);
        }
    }

    @RecentlyNonNull
    Account k();
}
