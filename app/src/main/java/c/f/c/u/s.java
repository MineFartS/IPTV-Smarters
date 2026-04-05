package c.f.c.u;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c.f.c.u.o;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.c.n.a f16398a = new c.f.c.n.j.d().a(o.b.class, new o.c()).a(o.class, new o.a()).f();

    public static boolean A(Intent intent) {
        if (intent == null || s(intent)) {
            return false;
        }
        return a();
    }

    public static boolean B(Intent intent) {
        if (intent == null || s(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            c.f.c.c.h();
            Context contextG = c.f.c.c.h().g();
            SharedPreferences sharedPreferences = contextG.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextG.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextG.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static String b(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    public static String c(Intent intent) {
        return intent.getStringExtra("google.c.a.c_id");
    }

    public static String d(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    public static String e() {
        return FirebaseInstanceId.getInstance(c.f.c.c.h()).g();
    }

    public static String f(Intent intent) {
        return intent.getStringExtra("google.c.a.m_c");
    }

    public static String g(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public static String h(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    public static int i(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static String j(Intent intent) {
        return intent.getStringExtra("google.c.a.ts");
    }

    public static String k(Intent intent) {
        return (intent.getExtras() == null || !t.t(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    public static String l(Intent intent) {
        return (intent.getExtras() == null || !t.t(intent.getExtras())) ? "data" : "display";
    }

    public static String m() {
        return c.f.c.c.h().g().getPackageName();
    }

    public static int n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        return i(stringExtra);
    }

    public static String o() {
        c.f.c.c cVarH = c.f.c.c.h();
        String strD = cVarH.j().d();
        if (strD != null) {
            return strD;
        }
        String strC = cVarH.j().c();
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

    public static String p(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    public static int q(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    public static String r(Intent intent) {
        if (intent.hasExtra("google.c.a.udt")) {
            return intent.getStringExtra("google.c.a.udt");
        }
        return null;
    }

    public static boolean s(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void t(Intent intent) {
        y("_nd", intent);
    }

    public static void u(Intent intent) {
        y("_nf", intent);
    }

    public static void v(Intent intent) {
        z(intent);
        y("_no", intent);
    }

    public static void w(Intent intent) {
        if (B(intent)) {
            y("_nr", intent);
        }
        if (A(intent)) {
            c.f.a.a.g gVarD = FirebaseMessaging.d();
            if (gVarD != null) {
                x("MESSAGE_DELIVERED", intent, gVarD.b("FCM_CLIENT_EVENT_LOGGING", String.class, c.f.a.a.b.b("json"), r.f16397a));
            } else {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            }
        }
    }

    public static void x(String str, Intent intent, c.f.a.a.f<String> fVar) {
        try {
            fVar.a(c.f.a.a.c.f(f16398a.b(new o.b(new o("MESSAGE_DELIVERED", intent)))));
        } catch (c.f.c.n.c unused) {
            Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
        }
    }

    public static void y(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String strC = c(intent);
        if (strC != null) {
            bundle.putString("_nmid", strC);
        }
        String strD = d(intent);
        if (strD != null) {
            bundle.putString("_nmn", strD);
        }
        String strH = h(intent);
        if (!TextUtils.isEmpty(strH)) {
            bundle.putString("label", strH);
        }
        String strF = f(intent);
        if (!TextUtils.isEmpty(strF)) {
            bundle.putString("message_channel", strF);
        }
        String strP = p(intent);
        if (strP != null) {
            bundle.putString("_nt", strP);
        }
        String strJ = j(intent);
        if (strJ != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(strJ));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
            }
        }
        String strR = r(intent);
        if (strR != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(strR));
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
            }
        }
        String strL = l(intent);
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", strL);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(str.length() + 37 + strValueOf.length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(strValueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        c.f.c.j.a.a aVar = (c.f.c.j.a.a) c.f.c.c.h().f(c.f.c.j.a.a.class);
        if (aVar != null) {
            aVar.a("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    public static void z(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!"1".equals(intent.getStringExtra("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        c.f.c.j.a.a aVar = (c.f.c.j.a.a) c.f.c.c.h().f(c.f.c.j.a.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        aVar.b("fcm", "_ln", stringExtra);
        Bundle bundle = new Bundle();
        bundle.putString("source", "Firebase");
        bundle.putString("medium", TransferService.INTENT_KEY_NOTIFICATION);
        bundle.putString("campaign", stringExtra);
        aVar.a("fcm", "_cmp", bundle);
    }
}
