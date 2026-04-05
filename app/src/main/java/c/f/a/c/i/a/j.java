package c.f.a.c.i.a;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f12748a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f12748a == null) {
                f12748a = (SharedPreferences) c.f.a.c.j.g.d.a(new k(context));
            }
            sharedPreferences = f12748a;
        }
        return sharedPreferences;
    }
}
