package c.k.a.y;

import c.k.a.w;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<w> f18363a = new LinkedHashSet();

    public synchronized void a(w wVar) {
        this.f18363a.remove(wVar);
    }

    public synchronized void b(w wVar) {
        this.f18363a.add(wVar);
    }

    public synchronized boolean c(w wVar) {
        return this.f18363a.contains(wVar);
    }
}
