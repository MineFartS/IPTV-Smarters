package c.f.a.c.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import c.f.a.c.f.q.r1;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final d0 f12349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12351e;

    public n0(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f12348b = str;
        e0 e0Var = null;
        if (iBinder != null) {
            try {
                c.f.a.c.g.a aVarB = r1.c1(iBinder).b();
                byte[] bArr = aVarB == null ? null : (byte[]) c.f.a.c.g.b.I2(aVarB);
                if (bArr != null) {
                    e0Var = new e0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f12349c = e0Var;
        this.f12350d = z;
        this.f12351e = z2;
    }

    public n0(String str, @Nullable d0 d0Var, boolean z, boolean z2) {
        this.f12348b = str;
        this.f12349c = d0Var;
        this.f12350d = z;
        this.f12351e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 1, this.f12348b, false);
        d0 d0Var = this.f12349c;
        if (d0Var == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            d0Var = null;
        }
        c.f.a.c.f.q.w.c.k(parcel, 2, d0Var, false);
        c.f.a.c.f.q.w.c.c(parcel, 3, this.f12350d);
        c.f.a.c.f.q.w.c.c(parcel, 4, this.f12351e);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
