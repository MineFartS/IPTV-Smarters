package c.f.a.c.f.u;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.t.l;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    public final Context f12722a;

    public b(@RecentlyNonNull Context context) {
        this.f12722a = context;
    }

    public int a(@RecentlyNonNull String str) {
        return this.f12722a.checkCallingOrSelfPermission(str);
    }

    public int b(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return this.f12722a.getPackageManager().checkPermission(str, str2);
    }

    @RecentlyNonNull
    public ApplicationInfo c(@RecentlyNonNull String str, int i2) {
        return this.f12722a.getPackageManager().getApplicationInfo(str, i2);
    }

    @RecentlyNonNull
    public CharSequence d(@RecentlyNonNull String str) {
        return this.f12722a.getPackageManager().getApplicationLabel(this.f12722a.getPackageManager().getApplicationInfo(str, 0));
    }

    @RecentlyNonNull
    public PackageInfo e(@RecentlyNonNull String str, int i2) {
        return this.f12722a.getPackageManager().getPackageInfo(str, i2);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f12722a);
        }
        if (!l.j() || (nameForUid = this.f12722a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f12722a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean g(int i2, @RecentlyNonNull String str) {
        if (l.e()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f12722a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i2, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f12722a.getPackageManager().getPackagesForUid(i2);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
