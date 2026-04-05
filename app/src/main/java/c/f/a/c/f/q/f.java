package c.f.a.c.f.q;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.i;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public class f extends c.f.a.c.f.q.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new g1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f12587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Scope[] f12588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f12589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Account f12590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.c.f.d[] f12591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.c.f.d[] f12592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f12596o;

    public f(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c.f.a.c.f.d[] dVarArr, c.f.a.c.f.d[] dVarArr2, boolean z, int i5, boolean z2, String str2) {
        this.f12583b = i2;
        this.f12584c = i3;
        this.f12585d = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f12586e = "com.google.android.gms";
        } else {
            this.f12586e = str;
        }
        if (i2 < 2) {
            this.f12590i = iBinder != null ? a.I2(i.a.c1(iBinder)) : null;
        } else {
            this.f12587f = iBinder;
            this.f12590i = account;
        }
        this.f12588g = scopeArr;
        this.f12589h = bundle;
        this.f12591j = dVarArr;
        this.f12592k = dVarArr2;
        this.f12593l = z;
        this.f12594m = i5;
        this.f12595n = z2;
        this.f12596o = str2;
    }

    public f(int i2, String str) {
        this.f12583b = 6;
        this.f12585d = c.f.a.c.f.f.f12315a;
        this.f12584c = i2;
        this.f12593l = true;
        this.f12596o = str;
    }

    @RecentlyNullable
    public final String I() {
        return this.f12596o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        g1.a(this, parcel, i2);
    }
}
