package c.h.a.e.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.regions.ServiceAbbreviations;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static int a(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getInt(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, -1);
    }

    public static String b(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString(ServiceAbbreviations.Email, "abc@gmail.com");
    }

    public static String c(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("prefix", "$");
    }

    public static String d(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("Suffix", "USD");
    }

    public static void e(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putString("isfreetrial", str);
        editorEdit.apply();
    }
}
