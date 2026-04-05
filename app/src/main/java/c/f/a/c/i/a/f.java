package c.f.a.c.i.a;

import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l2) {
        try {
            return (Long) c.f.a.c.j.g.d.a(new g(sharedPreferences, str, l2));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return l2;
        }
    }
}
