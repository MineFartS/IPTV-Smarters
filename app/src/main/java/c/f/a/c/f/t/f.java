package c.f.a.c.f.t;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f12696a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            c.f.a.c.f.q.o.i(context);
            c.f.a.c.f.q.o.i(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
