package c.f.a.c.f.o.n;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12417a;

    public h(@RecentlyNonNull Activity activity) {
        c.f.a.c.f.q.o.j(activity, "Activity must not be null");
        this.f12417a = activity;
    }

    public Activity a() {
        return (Activity) this.f12417a;
    }

    public a.l.d.e b() {
        return (a.l.d.e) this.f12417a;
    }

    public boolean c() {
        return this.f12417a instanceof a.l.d.e;
    }

    public final boolean d() {
        return this.f12417a instanceof Activity;
    }
}
