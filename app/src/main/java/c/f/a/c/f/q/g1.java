package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements Parcelable.Creator<f> {
    public static void a(f fVar, Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, fVar.f12583b);
        c.f.a.c.f.q.w.c.l(parcel, 2, fVar.f12584c);
        c.f.a.c.f.q.w.c.l(parcel, 3, fVar.f12585d);
        c.f.a.c.f.q.w.c.s(parcel, 4, fVar.f12586e, false);
        c.f.a.c.f.q.w.c.k(parcel, 5, fVar.f12587f, false);
        c.f.a.c.f.q.w.c.v(parcel, 6, fVar.f12588g, i2, false);
        c.f.a.c.f.q.w.c.e(parcel, 7, fVar.f12589h, false);
        c.f.a.c.f.q.w.c.r(parcel, 8, fVar.f12590i, i2, false);
        c.f.a.c.f.q.w.c.v(parcel, 10, fVar.f12591j, i2, false);
        c.f.a.c.f.q.w.c.v(parcel, 11, fVar.f12592k, i2, false);
        c.f.a.c.f.q.w.c.c(parcel, 12, fVar.f12593l);
        c.f.a.c.f.q.w.c.l(parcel, 13, fVar.f12594m);
        c.f.a.c.f.q.w.c.c(parcel, 14, fVar.f12595n);
        c.f.a.c.f.q.w.c.s(parcel, 15, fVar.I(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        IBinder iBinderT = null;
        Scope[] scopeArr = null;
        Bundle bundleA = null;
        Account account = null;
        c.f.a.c.f.d[] dVarArr = null;
        c.f.a.c.f.d[] dVarArr2 = null;
        String strF2 = null;
        int iU = 0;
        int iU2 = 0;
        int iU3 = 0;
        boolean zM = false;
        int iU4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 1:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 2:
                    iU2 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 3:
                    iU3 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 4:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 5:
                    iBinderT = c.f.a.c.f.q.w.b.t(parcel, iS);
                    break;
                case 6:
                    scopeArr = (Scope[]) c.f.a.c.f.q.w.b.i(parcel, iS, Scope.CREATOR);
                    break;
                case 7:
                    bundleA = c.f.a.c.f.q.w.b.a(parcel, iS);
                    break;
                case 8:
                    account = (Account) c.f.a.c.f.q.w.b.e(parcel, iS, Account.CREATOR);
                    break;
                case 9:
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
                case 10:
                    dVarArr = (c.f.a.c.f.d[]) c.f.a.c.f.q.w.b.i(parcel, iS, c.f.a.c.f.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (c.f.a.c.f.d[]) c.f.a.c.f.q.w.b.i(parcel, iS, c.f.a.c.f.d.CREATOR);
                    break;
                case 12:
                    zM = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 13:
                    iU4 = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 14:
                    zM2 = c.f.a.c.f.q.w.b.m(parcel, iS);
                    break;
                case 15:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new f(iU, iU2, iU3, strF, iBinderT, scopeArr, bundleA, account, dVarArr, dVarArr2, zM, iU4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f[] newArray(int i2) {
        return new f[i2];
    }
}
