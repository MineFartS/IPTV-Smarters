package c.f.a.c.f.t;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f12697a = new g();

    @RecentlyNonNull
    public static d d() {
        return f12697a;
    }

    @Override // c.f.a.c.f.t.d
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // c.f.a.c.f.t.d
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // c.f.a.c.f.t.d
    public final long c() {
        return System.nanoTime();
    }
}
