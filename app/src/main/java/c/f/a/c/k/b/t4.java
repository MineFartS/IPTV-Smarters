package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4 f14320a;

    public t4(s4 s4Var) {
        c.f.a.c.f.q.o.i(s4Var);
        this.f14320a = s4Var;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        c.f.a.c.f.q.o.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void b(Context context, Intent intent) {
        c5 c5VarH = c5.h(context, null, null);
        y3 y3VarC = c5VarH.c();
        if (intent == null) {
            y3VarC.r().a("Receiver called with null intent");
            return;
        }
        c5VarH.e();
        String action = intent.getAction();
        y3VarC.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                y3VarC.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            y3VarC.w().a("Starting wakeful intent.");
            this.f14320a.a(context, className);
        }
    }
}
