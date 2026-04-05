package c.f.a.c.f.q;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12599a = 4225;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12600b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h f12601c;

    public static int a() {
        return f12599a;
    }

    @RecentlyNonNull
    public static h b(@RecentlyNonNull Context context) {
        synchronized (f12600b) {
            if (f12601c == null) {
                f12601c = new l1(context.getApplicationContext());
            }
        }
        return f12601c;
    }

    public final void c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i2, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        e(new h1(str, str2, i2, z), serviceConnection, str3);
    }

    public abstract boolean d(h1 h1Var, ServiceConnection serviceConnection, String str);

    public abstract void e(h1 h1Var, ServiceConnection serviceConnection, String str);
}
