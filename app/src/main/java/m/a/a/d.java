package m.a.a;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ScheduledThreadPoolExecutor {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f31117a = new d();
    }

    public d() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    public static d a() {
        return b.f31117a;
    }
}
