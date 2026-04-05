package c.f.a.c.i.a;

import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) c.f.a.c.j.g.d.a(new c(sharedPreferences, str, bool));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return bool;
        }
    }
}
