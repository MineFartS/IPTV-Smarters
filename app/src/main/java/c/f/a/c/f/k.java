package c.f.a.c.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static k f12340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f12342c;

    public k(@RecentlyNonNull Context context) {
        this.f12341b = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static k a(@RecentlyNonNull Context context) {
        o.i(context);
        synchronized (k.class) {
            if (f12340a == null) {
                h0.a(context);
                f12340a = new k(context);
            }
        }
        return f12340a;
    }

    @Nullable
    public static final d0 d(PackageInfo packageInfo, d0... d0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        e0 e0Var = new e0(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < d0VarArr.length; i2++) {
            if (d0VarArr[i2].equals(e0Var)) {
                return d0VarArr[i2];
            }
        }
        return null;
    }

    public static final boolean e(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, g0.f12320a) : d(packageInfo, g0.f12320a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(@RecentlyNonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (j.f(this.f12341b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i2) {
        r0 r0VarD;
        int length;
        String[] packagesForUid = this.f12341b.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            r0VarD = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    o.i(r0VarD);
                    break;
                }
                r0VarD = f(packagesForUid[i3], false, false);
                if (r0VarD.f12689b) {
                    break;
                }
                i3++;
            }
        } else {
            r0VarD = r0.d("no pkgs");
        }
        r0VarD.f();
        return r0VarD.f12689b;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final r0 f(String str, boolean z, boolean z2) {
        r0 r0VarD;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return r0.d("null pkg");
        }
        if (str.equals(this.f12342c)) {
            return r0.b();
        }
        if (h0.d()) {
            r0VarD = h0.b(str, j.f(this.f12341b), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f12341b.getPackageManager().getPackageInfo(str, 64);
                boolean zF = j.f(this.f12341b);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        e0 e0Var = new e0(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        r0 r0VarC = h0.c(str3, e0Var, zF, false);
                        if (!r0VarC.f12689b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !h0.c(str3, e0Var, false, true).f12689b) {
                            r0VarD = r0VarC;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    r0VarD = r0.d(str2);
                } else {
                    r0VarD = r0.d(str2);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return r0.e(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "), e2);
            }
        }
        if (r0VarD.f12689b) {
            this.f12342c = str;
        }
        return r0VarD;
    }
}
