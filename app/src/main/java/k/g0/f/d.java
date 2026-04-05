package k.g0.f;

import java.util.LinkedHashSet;
import java.util.Set;
import k.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<e0> f30611a = new LinkedHashSet();

    public synchronized void a(e0 e0Var) {
        this.f30611a.remove(e0Var);
    }

    public synchronized void b(e0 e0Var) {
        this.f30611a.add(e0Var);
    }

    public synchronized boolean c(e0 e0Var) {
        return this.f30611a.contains(e0Var);
    }
}
