package c.f.a.c.e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public int f12290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public int f12291c = 0;

    public v(Context context) {
        this.f12289a = context;
    }

    public final synchronized int a() {
        int i2 = this.f12291c;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f12289a.getPackageManager();
        if (c.f.a.c.f.u.c.a(this.f12289a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!c.f.a.c.f.t.l.j()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f12291c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f12291c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (c.f.a.c.f.t.l.j()) {
            this.f12291c = 2;
        } else {
            this.f12291c = 1;
        }
        return this.f12291c;
    }

    public final PackageInfo b(String str) {
        try {
            return c.f.a.c.f.u.c.a(this.f12289a).e(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }

    public final synchronized int c() {
        PackageInfo packageInfoB;
        if (this.f12290b == 0 && (packageInfoB = b("com.google.android.gms")) != null) {
            this.f12290b = packageInfoB.versionCode;
        }
        return this.f12290b;
    }
}
