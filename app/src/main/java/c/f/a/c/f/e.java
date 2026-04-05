package c.f.a.c.f;

import a.i.h.j;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.q.o;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.android.gms.common.api.GoogleApiActivity;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class e extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12313f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f12311d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f12312e = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12310c = f.f12315a;

    public static e n() {
        return f12312e;
    }

    @Override // c.f.a.c.f.f
    @RecentlyNullable
    public Intent b(Context context, int i2, String str) {
        return super.b(context, i2, str);
    }

    @Override // c.f.a.c.f.f
    @RecentlyNullable
    public PendingIntent c(@RecentlyNonNull Context context, int i2, int i3) {
        return super.c(context, i2, i3);
    }

    @Override // c.f.a.c.f.f
    public final String e(int i2) {
        return super.e(i2);
    }

    @Override // c.f.a.c.f.f
    public int g(@RecentlyNonNull Context context) {
        return super.g(context);
    }

    @Override // c.f.a.c.f.f
    public int h(@RecentlyNonNull Context context, int i2) {
        return super.h(context, i2);
    }

    @Override // c.f.a.c.f.f
    public final boolean j(int i2) {
        return super.j(i2);
    }

    @RecentlyNullable
    public Dialog l(@RecentlyNonNull Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return v(activity, i2, c.f.a.c.f.q.e0.b(activity, b(activity, i2, "d"), i3), onCancelListener);
    }

    @RecentlyNullable
    public PendingIntent m(@RecentlyNonNull Context context, @RecentlyNonNull b bVar) {
        return bVar.L() ? bVar.K() : c(context, bVar.I(), 0);
    }

    public boolean o(@RecentlyNonNull Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogL = l(activity, i2, i3, onCancelListener);
        if (dialogL == null) {
            return false;
        }
        w(activity, dialogL, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(@RecentlyNonNull Context context, int i2) {
        r(context, i2, null, d(context, i2, 0, "n"));
    }

    public final boolean q(@RecentlyNonNull Activity activity, @RecentlyNonNull c.f.a.c.f.o.n.i iVar, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogV = v(activity, i2, c.f.a.c.f.q.e0.c(iVar, b(activity, i2, "d"), 2), onCancelListener);
        if (dialogV == null) {
            return false;
        }
        w(activity, dialogV, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @TargetApi(20)
    public final void r(Context context, int i2, String str, PendingIntent pendingIntent) {
        int i3;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i2), null), new IllegalArgumentException());
        if (i2 == 18) {
            x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strB = c.f.a.c.f.q.b0.b(context, i2);
        String strD = c.f.a.c.f.q.b0.d(context, i2);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) o.i(context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION));
        j.e eVarC = new j.e(context).u(true).j(true).o(strB).C(new j.c().m(strD));
        if (c.f.a.c.f.t.h.d(context)) {
            o.l(c.f.a.c.f.t.l.f());
            eVarC.A(context.getApplicationInfo().icon).x(2);
            if (c.f.a.c.f.t.h.f(context)) {
                eVarC.a(c.f.a.c.c.a.f11532a, resources.getString(c.f.a.c.c.b.f11547o), pendingIntent);
            } else {
                eVarC.m(pendingIntent);
            }
        } else {
            eVarC.A(R.drawable.stat_sys_warning).D(resources.getString(c.f.a.c.c.b.f11540h)).G(System.currentTimeMillis()).m(pendingIntent).n(strD);
        }
        if (c.f.a.c.f.t.l.j()) {
            o.l(c.f.a.c.f.t.l.j());
            synchronized (f12311d) {
                str2 = this.f12313f;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String strG = c.f.a.c.f.q.b0.g(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", strG, 4);
                } else if (!strG.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(strG);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            eVarC.k(str2);
        }
        Notification notificationC = eVarC.c();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            j.f12336b.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, notificationC);
    }

    public final boolean s(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, int i2) {
        PendingIntent pendingIntentM = m(context, bVar);
        if (pendingIntentM == null) {
            return false;
        }
        r(context, bVar.I(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentM, i2, true), 134217728));
        return true;
    }

    @RecentlyNonNull
    public final Dialog t(@RecentlyNonNull Activity activity, @RecentlyNonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(c.f.a.c.f.q.b0.c(activity, 18));
        builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        w(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final c.f.a.c.f.o.n.j0 u(Context context, c.f.a.c.f.o.n.i0 i0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        c.f.a.c.f.o.n.j0 j0Var = new c.f.a.c.f.o.n.j0(i0Var);
        context.registerReceiver(j0Var, intentFilter);
        j0Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return j0Var;
        }
        i0Var.a();
        j0Var.b();
        return null;
    }

    public final Dialog v(Context context, int i2, c.f.a.c.f.q.e0 e0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(c.f.a.c.f.q.b0.c(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strE = c.f.a.c.f.q.b0.e(context, i2);
        if (strE != null) {
            builder.setPositiveButton(strE, e0Var);
        }
        String strA = c.f.a.c.f.q.b0.a(context, i2);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i2)), new IllegalArgumentException());
        return builder.create();
    }

    public final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof a.l.d.e) {
                m.K(dialog, onCancelListener).J(((a.l.d.e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void x(Context context) {
        new v(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
