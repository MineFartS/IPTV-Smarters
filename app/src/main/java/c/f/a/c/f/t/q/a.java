package c.f.a.c.f.t.q;

import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f12718b = Executors.defaultThreadFactory();

    public a(@RecentlyNonNull String str) {
        o.j(str, "Name must not be null");
        this.f12717a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread threadNewThread = this.f12718b.newThread(new b(runnable, 0));
        threadNewThread.setName(this.f12717a);
        return threadNewThread;
    }
}
