package c.f.a.c.f.o.n;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class k {
    @RecentlyNonNull
    public static <L> j<L> a(@RecentlyNonNull L l2, @RecentlyNonNull Looper looper, @RecentlyNonNull String str) {
        c.f.a.c.f.q.o.j(l2, "Listener must not be null");
        c.f.a.c.f.q.o.j(looper, "Looper must not be null");
        c.f.a.c.f.q.o.j(str, "Listener type must not be null");
        return new j<>(looper, l2, str);
    }
}
