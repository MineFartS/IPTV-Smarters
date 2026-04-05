package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements Parcelable.Creator<j0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j0 createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iU = 0;
        int iU2 = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS);
            if (iL == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL == 2) {
                account = (Account) c.f.a.c.f.q.w.b.e(parcel, iS, Account.CREATOR);
            } else if (iL == 3) {
                iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
            } else if (iL != 4) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                googleSignInAccount = (GoogleSignInAccount) c.f.a.c.f.q.w.b.e(parcel, iS, GoogleSignInAccount.CREATOR);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new j0(iU, account, iU2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j0[] newArray(int i2) {
        return new j0[i2];
    }
}
