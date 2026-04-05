package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.i;

/* JADX INFO: loaded from: classes2.dex */
public class a extends i.a {
    @RecentlyNullable
    public static Account I2(@RecentlyNonNull i iVar) {
        Account accountK = null;
        if (iVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountK = iVar.k();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountK;
    }
}
