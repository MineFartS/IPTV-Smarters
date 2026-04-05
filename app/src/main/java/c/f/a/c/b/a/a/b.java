package c.f.a.c.b.a.a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jW = 0;
        int iU = 0;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            switch (c.f.a.c.f.q.w.b.l(iS)) {
                case 1:
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                    break;
                case 2:
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 3:
                    strF2 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 4:
                    strF3 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 5:
                    strF4 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 6:
                    uri = (Uri) c.f.a.c.f.q.w.b.e(parcel, iS, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 8:
                    jW = c.f.a.c.f.q.w.b.w(parcel, iS);
                    break;
                case 9:
                    strF6 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 10:
                    arrayListJ = c.f.a.c.f.q.w.b.j(parcel, iS, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                case 12:
                    strF8 = c.f.a.c.f.q.w.b.f(parcel, iS);
                    break;
                default:
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                    break;
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new GoogleSignInAccount(iU, strF, strF2, strF3, strF4, uri, strF5, jW, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
