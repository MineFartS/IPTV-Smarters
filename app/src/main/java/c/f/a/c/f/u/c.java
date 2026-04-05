package c.f.a.c.f.u;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f12723a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f12724b = null;

    @RecentlyNonNull
    public static b a(@RecentlyNonNull Context context) {
        return f12723a.b(context);
    }

    @RecentlyNonNull
    public final synchronized b b(@RecentlyNonNull Context context) {
        if (this.f12724b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f12724b = new b(context);
        }
        return this.f12724b;
    }
}
