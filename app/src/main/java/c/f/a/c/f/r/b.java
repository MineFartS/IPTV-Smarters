package c.f.a.c.f.r;

import c.f.a.c.f.r.a;
import c.f.a.c.j.e.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a.InterfaceC0160a {
    @Override // c.f.a.c.f.r.a.InterfaceC0160a
    public final ScheduledExecutorService a() {
        g.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
