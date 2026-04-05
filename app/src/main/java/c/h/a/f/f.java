package c.h.a.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f16753a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences.Editor f16754b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16755c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f16756d = Boolean.FALSE;

    public static String a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("url", BuildConfig.FLAVOR);
        f16755c = string;
        return string.toLowerCase();
    }

    public static String b(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("notificationkey", BuildConfig.FLAVOR);
        f16755c = string;
        return string;
    }

    public static String c(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString(TransferTable.COLUMN_KEY, BuildConfig.FLAVOR);
        f16755c = string;
        return string;
    }

    public static String d(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("salt", BuildConfig.FLAVOR);
        f16755c = string;
        return string;
    }

    public static void e(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f16754b = editorEdit;
        editorEdit.putString("url", str);
        f16754b.commit();
    }

    public static void f(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f16754b = editorEdit;
        editorEdit.putString("notificationkey", str);
        f16754b.commit();
    }

    public static void g(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f16754b = editorEdit;
        editorEdit.putString(TransferTable.COLUMN_KEY, str);
        f16754b.commit();
    }

    public static void h(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f16753a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f16754b = editorEdit;
        editorEdit.putString("salt", str);
        f16754b.commit();
    }
}
