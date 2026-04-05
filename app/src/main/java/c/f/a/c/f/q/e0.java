package c.f.a.c.f.q;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 implements DialogInterface.OnClickListener {
    public static e0 b(Activity activity, Intent intent, int i2) {
        return new c0(intent, activity, i2);
    }

    public static e0 c(c.f.a.c.f.o.n.i iVar, Intent intent, int i2) {
        return new d0(intent, iVar, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e2) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
