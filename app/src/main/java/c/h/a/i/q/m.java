package c.h.a.i.q;

import android.content.Context;
import android.content.SharedPreferences;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static String A(Context context) {
        return context.getSharedPreferences("loginPrefs", 0).getString("username", BuildConfig.FLAVOR);
    }

    public static String B(Context context) {
        return context.getSharedPreferences("loginPrefs", 0).getString("password", BuildConfig.FLAVOR);
    }

    public static String C(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("VODAppName", BuildConfig.FLAVOR);
    }

    public static String D(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("VODPkgName", "default");
    }

    public static String E(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("VODSort", "0");
    }

    public static String F(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("vodcatsort", "0");
    }

    public static boolean G(Context context) {
        return context.getSharedPreferences("auto_start", 0).getBoolean("autoplay", true);
    }

    public static String H(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("seriescatsort", "0");
    }

    public static boolean I(Context context) {
        return context.getSharedPreferences("showPopup", 0).getBoolean("check_box", true);
    }

    public static void J(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("auto_start", 0).edit();
        editorEdit.putString("act_code", str);
        editorEdit.apply();
    }

    public static void K(int i2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        editorEdit.putInt("async_status", i2);
        editorEdit.apply();
    }

    public static void L(int i2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("cacheClearCount", 0).edit();
        editorEdit.putInt("cacheClearCount", i2);
        editorEdit.apply();
    }

    public static void M(String str, String str2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        editorEdit.putString("CatchUpPkgName", str);
        editorEdit.putString("CatchUpAppName", str2);
        editorEdit.apply();
    }

    public static void N(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        editorEdit.putString("current_app_type", str);
        editorEdit.apply();
    }

    public static void O(String str, String str2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        editorEdit.putString("EPGPkgName", str);
        editorEdit.putString("EPGAppName", str2);
        editorEdit.apply();
    }

    public static void P(boolean z, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPref", 0).edit();
        editorEdit.putBoolean("AppExist", z);
        editorEdit.apply();
    }

    public static void Q(boolean z, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("SplashAppUpdate", 0).edit();
        editorEdit.putBoolean("Update", z);
        editorEdit.apply();
    }

    public static void R(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("livecatsort", str);
        editorEdit.apply();
    }

    public static void S(String str, String str2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        editorEdit.putString("LivePkgName", str);
        editorEdit.putString("LiveAppName", str2);
        editorEdit.apply();
    }

    public static void T(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("LiveSort", str);
        editorEdit.apply();
    }

    public static void U(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("RadioSort", str);
        editorEdit.apply();
    }

    public static void V(int i2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("SplashAppUpdate", 0).edit();
        editorEdit.putInt("RateUsCount", i2);
        editorEdit.apply();
    }

    public static void W(boolean z, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("SplashAppUpdate", 0).edit();
        editorEdit.putBoolean("RateUsDontask", z);
        editorEdit.apply();
    }

    public static void X(String str, String str2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        editorEdit.putString("RecordingsPkgName", str);
        editorEdit.putString("RecordingsAppName", str2);
        editorEdit.apply();
    }

    public static void Y(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        editorEdit.putString("screenType", str);
        editorEdit.apply();
    }

    public static void Z(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("LanguageSelectionPref", 0).edit();
        editorEdit.putString("SelectedLanguage", str);
        editorEdit.apply();
    }

    public static String a(Context context) {
        return context.getSharedPreferences("auto_start", 0).getString("act_code", BuildConfig.FLAVOR);
    }

    public static void a0(String str, String str2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        editorEdit.putString("SeriesPkgName", str);
        editorEdit.putString("SeriesAppName", str2);
        editorEdit.apply();
    }

    public static int b(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getInt("async_status", 0);
    }

    public static void b0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("SeriesSort", str);
        editorEdit.apply();
    }

    public static int c(Context context) {
        return context.getSharedPreferences("cacheClearCount", 0).getInt("cacheClearCount", 0);
    }

    public static void c0(Boolean bool, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("showPopup", 0).edit();
        editorEdit.putBoolean("popshow", bool.booleanValue());
        editorEdit.apply();
    }

    public static String d(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("CatchUpAppName", BuildConfig.FLAVOR);
    }

    public static void d0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        editorEdit.putString("type", str);
        editorEdit.apply();
    }

    public static String e(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("CatchUpPkgName", "default");
    }

    public static void e0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginPrefs", 0).edit();
        editorEdit.putString("in_which", str);
        editorEdit.apply();
    }

    public static String f(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getString("current_app_type", "api");
    }

    public static void f0(int i2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginprefsmultiuser", 0).edit();
        editorEdit.putInt("userID", i2);
        editorEdit.apply();
    }

    public static String g(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("EPGAppName", BuildConfig.FLAVOR);
    }

    public static void g0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginPrefs", 0).edit();
        editorEdit.putString("username", str);
        editorEdit.apply();
    }

    public static String h(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("EPGPkgName", "default");
    }

    public static void h0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("loginPrefs", 0).edit();
        editorEdit.putString("password", str);
        editorEdit.apply();
    }

    public static boolean i(Context context) {
        return context.getSharedPreferences("MyPref", 0).getBoolean("AppExist", false);
    }

    public static void i0(String str, String str2, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefPlayer", 0).edit();
        editorEdit.putString("VODPkgName", str);
        editorEdit.putString("VODAppName", str2);
        editorEdit.apply();
    }

    public static String j(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("livecatsort", "0");
    }

    public static void j0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("VODSort", str);
        editorEdit.apply();
    }

    public static String k(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("LiveAppName", BuildConfig.FLAVOR);
    }

    public static void k0(Boolean bool, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("showPopup", 0).edit();
        editorEdit.putBoolean("check_box", bool.booleanValue());
        editorEdit.apply();
    }

    public static String l(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("LivePkgName", "default");
    }

    public static void l0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("vodcatsort", str);
        editorEdit.apply();
    }

    public static String m(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("LiveSort", "0");
    }

    public static void m0(boolean z, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("auto_start", 0).edit();
        editorEdit.putBoolean("autoplay", z);
        editorEdit.apply();
    }

    public static String n(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("RadioSort", "0");
    }

    public static void n0(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(c.h.a.h.n.a.s, 0).edit();
        editorEdit.putString("seriescatsort", str);
        editorEdit.apply();
    }

    public static int o(Context context) {
        return context.getSharedPreferences("SplashAppUpdate", 0).getInt("RateUsCount", 0);
    }

    public static boolean p(Context context) {
        return context.getSharedPreferences("SplashAppUpdate", 0).getBoolean("RateUsDontask", false);
    }

    public static String q(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("RecordingsAppName", BuildConfig.FLAVOR);
    }

    public static String r(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("RecordingsPkgName", "default");
    }

    public static String s(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getString("screenType", "default");
    }

    public static String t(Context context) {
        return context.getSharedPreferences("LanguageSelectionPref", 0).getString("SelectedLanguage", "English");
    }

    public static String u(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("SeriesAppName", BuildConfig.FLAVOR);
    }

    public static String v(Context context) {
        return context.getSharedPreferences("MyPrefPlayer", 0).getString("SeriesPkgName", "default");
    }

    public static String w(Context context) {
        return context.getSharedPreferences(c.h.a.h.n.a.s, 0).getString("SeriesSort", "0");
    }

    public static boolean x(Context context) {
        return context.getSharedPreferences("showPopup", 0).getBoolean("popshow", true);
    }

    public static String y(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getString("type", BuildConfig.FLAVOR);
    }

    public static int z(Context context) {
        return context.getSharedPreferences("loginprefsmultiuser", 0).getInt("userID", -1);
    }
}
