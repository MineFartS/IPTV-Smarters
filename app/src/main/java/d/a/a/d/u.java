package d.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class u {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 4);
    }

    public static SharedPreferences b(String str, Context context) {
        return context.getSharedPreferences(str, 4);
    }
}
