package a.n.o;

import a.n.q.s0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f2723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2725c;

    /* JADX INFO: renamed from: a.n.o.a$a, reason: collision with other inner class name */
    public static class C0058a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Resources f2726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2727b;

        public C0058a(Resources resources, String str) {
            this.f2726a = resources;
            this.f2727b = str;
        }

        public boolean a(String str, boolean z) {
            int identifier = this.f2726a.getIdentifier(str, "bool", this.f2727b);
            return identifier > 0 ? this.f2726a.getBoolean(identifier) : z;
        }
    }

    public a(Context context) {
        a(b(context));
    }

    public static a c(Context context) {
        if (f2723a == null) {
            f2723a = new a(context);
        }
        return f2723a;
    }

    public static boolean e(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return (activityInfo == null || (activityInfo.applicationInfo.flags & 1) == 0) ? false : true;
    }

    public final void a(C0058a c0058a) {
        if (s0.b()) {
            this.f2724b = false;
            if (c0058a != null) {
                this.f2724b = c0058a.a("leanback_prefer_static_shadows", false);
            }
        } else {
            this.f2724b = true;
        }
        if (Build.VERSION.SDK_INT < 21) {
            this.f2725c = true;
            return;
        }
        this.f2725c = false;
        if (c0058a != null) {
            this.f2725c = c0058a.a("leanback_outline_clipping_disabled", false);
        }
    }

    public final C0058a b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Resources resourcesForApplication = null;
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("android.support.v17.leanback.action.PARTNER_CUSTOMIZATION"), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (str2 != null && e(resolveInfo)) {
                try {
                    resourcesForApplication = packageManager.getResourcesForApplication(str2);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            str = str2;
            if (resourcesForApplication != null) {
                break;
            }
        }
        if (resourcesForApplication == null) {
            return null;
        }
        return new C0058a(resourcesForApplication, str);
    }

    public boolean d() {
        return this.f2725c;
    }

    public boolean f() {
        return this.f2724b;
    }
}
