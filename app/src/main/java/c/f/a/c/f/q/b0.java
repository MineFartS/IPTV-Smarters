package c.f.a.c.f.q;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("sCache")
    public static final a.f.i<String, String> f12549a = new a.f.i<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("sCache")
    public static Locale f12550b;

    public static String a(Context context, int i2) {
        String string;
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(c.f.a.c.c.b.f11538f);
            case 2:
                return resources.getString(c.f.a.c.c.b.f11544l);
            case 3:
                return resources.getString(c.f.a.c.c.b.f11535c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                string = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                string = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                string = sb.toString();
                break;
            case 16:
                string = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }

    public static String b(Context context, int i2) {
        String strI = i2 == 6 ? i(context, "common_google_play_services_resolution_required_title") : a(context, i2);
        return strI == null ? context.getResources().getString(c.f.a.c.c.b.f11540h) : strI;
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        String strF = f(context);
        if (i2 == 1) {
            return resources.getString(c.f.a.c.c.b.f11537e, strF);
        }
        if (i2 == 2) {
            return c.f.a.c.f.t.h.f(context) ? resources.getString(c.f.a.c.c.b.f11546n) : resources.getString(c.f.a.c.c.b.f11543k, strF);
        }
        if (i2 == 3) {
            return resources.getString(c.f.a.c.c.b.f11534b, strF);
        }
        if (i2 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", strF);
        }
        if (i2 == 7) {
            return h(context, "common_google_play_services_network_error_text", strF);
        }
        if (i2 == 9) {
            return resources.getString(c.f.a.c.c.b.f11541i, strF);
        }
        if (i2 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", strF);
        }
        switch (i2) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", strF);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", strF);
            case 18:
                return resources.getString(c.f.a.c.c.b.f11545m, strF);
            default:
                return resources.getString(c.f.a.c.f.l.f12343a, strF);
        }
    }

    public static String d(Context context, int i2) {
        return (i2 == 6 || i2 == 19) ? h(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i2);
    }

    public static String e(Context context, int i2) {
        return context.getResources().getString(i2 != 1 ? i2 != 2 ? i2 != 3 ? R.string.ok : c.f.a.c.c.b.f11533a : c.f.a.c.c.b.f11542j : c.f.a.c.c.b.f11536d);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.f.a.c.f.u.c.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context) {
        return context.getResources().getString(c.f.a.c.c.b.f11539g);
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strI = i(context, str);
        if (strI == null) {
            strI = resources.getString(c.f.a.c.f.l.f12343a);
        }
        return String.format(resources.getConfiguration().locale, strI, str2);
    }

    public static String i(Context context, String str) {
        a.f.i<String, String> iVar = f12549a;
        synchronized (iVar) {
            Locale localeC = a.i.n.c.a(context.getResources().getConfiguration()).c(0);
            if (!localeC.equals(f12550b)) {
                iVar.clear();
                f12550b = localeC;
            }
            String str2 = iVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesE = c.f.a.c.f.i.e(context);
            if (resourcesE == null) {
                return null;
            }
            int identifier = resourcesE.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resourcesE.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            iVar.put(str, string);
            return string;
        }
    }
}
