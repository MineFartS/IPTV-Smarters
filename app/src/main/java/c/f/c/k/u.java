package c.f.c.k;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class u implements c.f.c.o.d, c.f.c.o.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<c.f.c.o.b<Object>, Executor>> f16119a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue<c.f.c.o.a<?>> f16120b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16121c;

    public u(Executor executor) {
        this.f16121c = executor;
    }

    @Override // c.f.c.o.d
    public <T> void a(Class<T> cls, c.f.c.o.b<? super T> bVar) {
        b(cls, this.f16121c, bVar);
    }

    @Override // c.f.c.o.d
    public synchronized <T> void b(Class<T> cls, Executor executor, c.f.c.o.b<? super T> bVar) {
        c0.b(cls);
        c0.b(bVar);
        c0.b(executor);
        if (!this.f16119a.containsKey(cls)) {
            this.f16119a.put(cls, new ConcurrentHashMap<>());
        }
        this.f16119a.get(cls).put(bVar, executor);
    }

    public void c() {
        Queue<c.f.c.o.a<?>> queue;
        synchronized (this) {
            queue = this.f16120b;
            if (queue != null) {
                this.f16120b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<c.f.c.o.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
        }
    }

    public final synchronized Set<Map.Entry<c.f.c.o.b<Object>, Executor>> d(c.f.c.o.a<?> aVar) {
        ConcurrentHashMap<c.f.c.o.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f16119a.get(aVar.b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public void f(c.f.c.o.a<?> aVar) {
        c0.b(aVar);
        synchronized (this) {
            Queue<c.f.c.o.a<?>> queue = this.f16120b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (Map.Entry<c.f.c.o.b<Object>, Executor> entry : d(aVar)) {
                entry.getValue().execute(t.a(entry, aVar));
            }
        }
    }
}
