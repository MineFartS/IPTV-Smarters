package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5 f14275a;

    public r4(c5 c5Var) {
        this.f14275a = c5Var;
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.f14275a.c().s().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f14275a.d().g();
        if (!b()) {
            this.f14275a.c().u().a("Install Referrer Reporter is not available");
            return;
        }
        q4 q4Var = new q4(this, str);
        this.f14275a.d().g();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f14275a.b().getPackageManager();
        if (packageManager == null) {
            this.f14275a.c().s().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            this.f14275a.c().u().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !b()) {
                this.f14275a.c().r().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f14275a.c().w().b("Install Referrer Service is", true != c.f.a.c.f.s.a.b().a(this.f14275a.b(), new Intent(intent), q4Var, 1) ? "not available" : "available");
            } catch (Exception e2) {
                this.f14275a.c().o().b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }

    public final boolean b() {
        try {
            c.f.a.c.f.u.b bVarA = c.f.a.c.f.u.c.a(this.f14275a.b());
            if (bVarA != null) {
                return bVarA.e("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f14275a.c().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e2) {
            this.f14275a.c().w().b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }
}
