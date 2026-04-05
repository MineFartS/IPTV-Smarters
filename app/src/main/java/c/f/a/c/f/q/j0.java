package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f12611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f12613e;

    public j0(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f12610b = i2;
        this.f12611c = account;
        this.f12612d = i3;
        this.f12613e = googleSignInAccount;
    }

    public j0(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f12610b);
        c.f.a.c.f.q.w.c.r(parcel, 2, this.f12611c, i2, false);
        c.f.a.c.f.q.w.c.l(parcel, 3, this.f12612d);
        c.f.a.c.f.q.w.c.r(parcel, 4, this.f12613e, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
