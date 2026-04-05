package c.f.a.c.i.a;

import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) c.f.a.c.j.g.d.a(new e(sharedPreferences, str, num));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return num;
        }
    }
}
