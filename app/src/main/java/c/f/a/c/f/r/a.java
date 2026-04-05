package c.f.a.c.f.r;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC0160a f12687a;

    /* JADX INFO: renamed from: c.f.a.c.f.r.a$a, reason: collision with other inner class name */
    public interface InterfaceC0160a {
        @RecentlyNonNull
        @Deprecated
        ScheduledExecutorService a();
    }

    @RecentlyNonNull
    @Deprecated
    public static synchronized InterfaceC0160a a() {
        if (f12687a == null) {
            f12687a = new b();
        }
        return f12687a;
    }
}
