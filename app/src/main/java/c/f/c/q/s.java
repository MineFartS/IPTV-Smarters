package c.f.c.q;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public String f16215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public String f16216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    public int f16217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    public int f16218e = 0;

    public s(Context context) {
        this.f16214a = context;
    }

    public static String c(c.f.c.c cVar) {
        String strD = cVar.j().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVar.j().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        if (this.f16215b == null) {
            h();
        }
        return this.f16215b;
    }

    public synchronized String b() {
        if (this.f16216c == null) {
            h();
        }
        return this.f16216c;
    }

    public synchronized int d() {
        PackageInfo packageInfoF;
        if (this.f16217d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
            this.f16217d = packageInfoF.versionCode;
        }
        return this.f16217d;
    }

    public synchronized int e() {
        int i2 = this.f16218e;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f16214a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i3 = 1;
        if (!c.f.a.c.f.t.l.j()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f16218e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f16218e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (c.f.a.c.f.t.l.j()) {
            this.f16218e = 2;
            i3 = 2;
        } else {
            this.f16218e = 1;
        }
        return i3;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f16214a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo packageInfoF = f(this.f16214a.getPackageName());
        if (packageInfoF != null) {
            this.f16215b = Integer.toString(packageInfoF.versionCode);
            this.f16216c = packageInfoF.versionName;
        }
    }
}
