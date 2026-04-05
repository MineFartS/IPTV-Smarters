package c.f.c.u;

import a.i.h.j;
import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f16335a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: c.f.c.u.a$a, reason: collision with other inner class name */
    public static class C0198a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j.e f16336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16338c = 0;

        public C0198a(j.e eVar, String str, int i2) {
            this.f16336a = eVar;
            this.f16337b = str;
        }
    }

    public static PendingIntent a(Context context, t tVar, String str, PackageManager packageManager) {
        Intent intentF = f(str, tVar, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(tVar.y());
        PendingIntent activity = PendingIntent.getActivity(context, g(), intentF, 1073741824);
        return p(tVar) ? q(context, tVar, activity) : activity;
    }

    public static PendingIntent b(Context context, t tVar) {
        if (p(tVar)) {
            return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(tVar.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public static C0198a d(Context context, t tVar) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), tVar, k(context, tVar.k(), bundleJ), context.getResources(), context.getPackageManager(), bundleJ);
    }

    public static C0198a e(Context context, String str, t tVar, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        j.e eVar = new j.e(context, str2);
        String strN = tVar.n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.o(strN);
        }
        String strN2 = tVar.n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.n(strN2);
            eVar.C(new j.c().m(strN2));
        }
        eVar.A(l(packageManager, resources, str, tVar.p("gcm.n.icon"), bundle));
        Uri uriM = m(str, tVar, resources);
        if (uriM != null) {
            eVar.B(uriM);
        }
        eVar.m(a(context, tVar, str, packageManager));
        PendingIntent pendingIntentB = b(context, tVar);
        if (pendingIntentB != null) {
            eVar.q(pendingIntentB);
        }
        Integer numH = h(context, tVar.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.l(numH.intValue());
        }
        eVar.j(!tVar.a("gcm.n.sticky"));
        eVar.u(tVar.a("gcm.n.local_only"));
        String strP = tVar.p("gcm.n.ticker");
        if (strP != null) {
            eVar.D(strP);
        }
        Integer numM = tVar.m();
        if (numM != null) {
            eVar.x(numM.intValue());
        }
        Integer numR = tVar.r();
        if (numR != null) {
            eVar.F(numR.intValue());
        }
        Integer numL = tVar.l();
        if (numL != null) {
            eVar.v(numL.intValue());
        }
        Long lJ = tVar.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.z(true);
            eVar.G(lJ.longValue());
        }
        long[] jArrQ = tVar.q();
        if (jArrQ != null) {
            eVar.E(jArrQ);
        }
        int[] iArrE = tVar.e();
        if (iArrE != null) {
            eVar.t(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.p(i(tVar));
        return new C0198a(eVar, n(tVar), 0);
    }

    public static Intent f(String str, t tVar, PackageManager packageManager) {
        String strP = tVar.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = tVar.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f16335a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(a.i.i.b.d(context, i2));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(t tVar) {
        boolean zA = tVar.a("gcm.n.default_sound");
        ?? r0 = zA;
        if (tVar.a("gcm.n.default_vibrate_timings")) {
            r0 = (zA ? 1 : 0) | 2;
        }
        return tVar.a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb.toString());
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (TextUtils.isEmpty(string2)) {
                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                } else {
                    if (notificationManager.getNotificationChannel(string2) != null) {
                        return string2;
                    }
                    str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                }
                Log.w("FirebaseMessaging", str2);
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static int l(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && o(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && o(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i2 == 0 || !o(resources, i2)) {
            try {
                i2 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                String strValueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(strValueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        return (i2 == 0 || !o(resources, i2)) ? R.drawable.sym_def_app_icon : i2;
    }

    public static Uri m(String str, t tVar, Resources resources) {
        String strO = tVar.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(strO).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(strO);
        return Uri.parse(sb.toString());
    }

    public static String n(t tVar) {
        String strP = tVar.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(jUptimeMillis);
        return sb.toString();
    }

    @TargetApi(26)
    public static boolean o(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i2);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i2);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    public static boolean p(t tVar) {
        return tVar.a("google.c.a.e");
    }

    public static PendingIntent q(Context context, t tVar, PendingIntent pendingIntent) {
        return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(tVar.x()).putExtra("pending_intent", pendingIntent));
    }
}
