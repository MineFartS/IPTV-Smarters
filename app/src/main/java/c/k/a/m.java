package c.k.a;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18245a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18246b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Deque<?> f18247c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Deque<?> f18248d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Deque<e> f18249e = new ArrayDeque();

    public synchronized void a(e eVar) {
        this.f18249e.add(eVar);
    }

    public synchronized void b(e eVar) {
        if (!this.f18249e.remove(eVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
