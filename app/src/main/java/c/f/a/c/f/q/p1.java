package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 extends c.f.a.c.j.e.a implements i {
    public p1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // c.f.a.c.f.q.i
    public final Account k() {
        Parcel parcelJ = J(2, c1());
        Account account = (Account) c.f.a.c.j.e.c.c(parcelJ, Account.CREATOR);
        parcelJ.recycle();
        return account;
    }
}
